## ERC-1271: Standard Signature Validation Method for Contracts

- stardard mechanism for signatures of contracts
- signatures are used for validation of rights-to-move assets or other purposes
- motivation example: exchanges with off-chain orderbook, where buy/sell orders are signed messages
- specifically, It provides a way to verify that a token transfer has been authorized by the holder of the token

### Signature verification contract
```solidity
// bytes4 keccak256("isValidSignature(bytes32,bytes)")
bytes4 constant internal MAGICVALUE = 0x1626ba7e;

/**
 * @dev: Should return whether the signature provided is valid for the provided hash
 * @param _hash: Hash of the message
 * @param _signature: Signature of the hash
 *
 * MUST return the bytes4 magic value 0x1626ba7e when function passes.
 */

function isValidSignature(
    bytes32 _hash, 
    bytes memory _signature)
    public
    view 
    returns (bytes4 magicValue);
```
This function should be implemented by contracts which desire to sign messages (e.g. smart contract wallets, DAOs, multisignature wallets, etc.) Applications wanting to support contract signatures should call this method if the signer is a contract.

### Verification extention
**isValidSignature** can call arbitrary methods to validate a given signature, which could be context dependent (e.g. time based or state based), EOA dependent (e.g. signers authorization level within smart wallet), signature scheme Dependent (e.g. ECDSA, multisig, BLS), etc.

1. Time-based validation: The signature is valid only during a certain time period, such as a window of a few minutes or hours. This could be useful for transactions that need to be executed within a specific timeframe, such as trades or auctions.
2. State-based validation: The signature is valid only if certain conditions are met, such as the balance of a certain token being above a certain threshold or the sender having completed a specific action. This could be useful for creating more complex transaction workflows, such as multi-step transfers or conditional transfers.
3. EOA-dependent validation: The signature is valid only if the signer has a certain authorization level within a smart wallet, such as being a designated owner or administrator. This could be useful for creating more secure and controlled token transfers.
4. Signature scheme-dependent validation: The signature is valid only if it was created using a certain signature scheme, such as ECDSA, multisig, or BLS. This could be useful for supporting different types of signatures and ensuring compatibility with different wallets and signing tools.

## ECDSA signature
![ecrecover!](ecrecover.jpg)

```solidity
pragma solidity ^0.4.19;


library ECDSA
{
    /**
    * This unpacks the 'v' parameter from the upper bit of 's' which means
    * a signature can be packed into two 256bit words.
    */
    function recover( bytes32 hash, uint256 r, uint256 sv )
        internal pure
        returns (address)
    {
        uint256 oneshl255 = 57896044618658097711785492504343953926634992332820282019728792003956564819968;
        uint8 v;
        if( (sv & oneshl255) > 0 ) {
            v = 28;
            sv ^= oneshl255;
        }
        else {
            v = 27;
        }
        return ecrecover(hash, v, bytes32(r), bytes32(sv));
    }   
}
```

## BLS signature

```solidity
// SPDX-License-Identifier: AGPL-3.0-only

/*
    SkaleVerifier.sol - SKALE Manager
    Copyright (C) 2018-Present SKALE Labs
    @author Artem Payvin

    SKALE Manager is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as published
    by the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    SKALE Manager is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with SKALE Manager.  If not, see <https://www.gnu.org/licenses/>.
*/

pragma solidity 0.8.11;

import "@skalenetwork/skale-manager-interfaces/ISkaleVerifier.sol";

import "./Permissions.sol";
import "./utils/Precompiled.sol";
import "./utils/FieldOperations.sol";

/**
 * @title SkaleVerifier
 * @dev Contains verify function to perform BLS signature verification.
 */
contract SkaleVerifier is Permissions, ISkaleVerifier {  
    using Fp2Operations for ISkaleDKG.Fp2Point;
    using G2Operations for ISkaleDKG.G2Point;

    /**
    * @dev Verifies a BLS signature.
    * 
    * Requirements:
    * 
    * - Signature is in G1.
    * - Hash is in G1.
    * - G2.one in G2.
    * - Public Key in G2.
    */
    function verify(
        ISkaleDKG.Fp2Point calldata signature,
        bytes32 hash,
        uint counter,
        uint hashA,
        uint hashB,
        ISkaleDKG.G2Point calldata publicKey
    )
        external
        view
        override
        returns (bool)
    {
        require(G1Operations.checkRange(signature), "Signature is not valid");
        if (!_checkHashToGroupWithHelper(
            hash,
            counter,
            hashA,
            hashB
            )
        )
        {
            return false;
        }

        uint newSignB = G1Operations.negate(signature.b);
        require(G1Operations.isG1Point(signature.a, newSignB), "Sign not in G1");
        require(G1Operations.isG1Point(hashA, hashB), "Hash not in G1");

        ISkaleDKG.G2Point memory g2 = G2Operations.getG2Generator();
        require(
            G2Operations.isG2(publicKey),
            "Public Key not in G2"
        );

        return Precompiled.bn256Pairing(
            signature.a, newSignB,
            g2.x.b, g2.x.a, g2.y.b, g2.y.a,
            hashA, hashB,
            publicKey.x.b, publicKey.x.a, publicKey.y.b, publicKey.y.a
        );
    }

    function initialize(address newContractsAddress) public override initializer {
        Permissions.initialize(newContractsAddress);
    }

    function _checkHashToGroupWithHelper(
        bytes32 hash,
        uint counter,
        uint hashA,
        uint hashB
    )
        private
        pure
        returns (bool)
    {
        if (counter > 100) {
            return false;
        }
        uint xCoord = uint(hash) % Fp2Operations.P;
        xCoord = (xCoord + counter) % Fp2Operations.P;

        uint ySquared = addmod(
            mulmod(mulmod(xCoord, xCoord, Fp2Operations.P), xCoord, Fp2Operations.P),
            3,
            Fp2Operations.P
        );
        if (hashB < Fp2Operations.P / 2 || mulmod(hashB, hashB, Fp2Operations.P) != ySquared || xCoord != hashA) {
            return false;
        }

        return true;
    }
}
```

## Schnorr signature

```solidity
pragma solidity ^0.4.14;

import "./Curve.sol";

// https://en.wikipedia.org/wiki/Proof_of_knowledge#Schnorr_protocol
library Schnorr
{
    // Costs ~85000 gas, 2x ecmul, + mulmod, addmod, hash etc. overheads
	function CreateProof( uint256 secret, uint256 message )
	    constant internal
	    returns (uint256[2] out_pubkey, uint256 out_s, uint256 out_e)
	{
		Curve.G1Point memory xG = Curve.g1mul(Curve.P1(), secret % Curve.N());
		out_pubkey[0] = xG.X;
		out_pubkey[1] = xG.Y;
		uint256 k = uint256(keccak256(abi.encodePacked(message, secret))) % Curve.N();
		Curve.G1Point memory kG = Curve.g1mul(Curve.P1(), k);
		out_e = uint256(keccak256(abi.encodePacked(out_pubkey[0], out_pubkey[1], kG.X, kG.Y, message)));
		out_s = Curve.submod(k, mulmod(secret, out_e, Curve.N()));
	}

	// Costs ~85000 gas, 2x ecmul, 1x ecadd, + small overheads
	function CalcProof( uint256[2] pubkey, uint256 message, uint256 s, uint256 e )
	    constant internal
	    returns (uint256)
	{
	    Curve.G1Point memory sG = Curve.g1mul(Curve.P1(), s % Curve.N());
	    Curve.G1Point memory xG = Curve.G1Point(pubkey[0], pubkey[1]);
	    Curve.G1Point memory kG = Curve.g1add(sG, Curve.g1mul(xG, e));
	    return uint256(keccak256(abi.encodePacked(pubkey[0], pubkey[1], kG.X, kG.Y, message)));
	}
	
	function VerifyProof( uint256[2] pubkey, uint256 message, uint256 s, uint256 e )
	    constant internal
	    returns (bool)
	{
	    return e == CalcProof(pubkey, message, s, e);
	}
}
```

## RSA signature

```solidity
pragma solidity ^0.8.0;

/*
    Copyright 2016, Adrià Massanet

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
    
    Checked results with FIPS test vectors
    https://csrc.nist.gov/CSRC/media/Projects/Cryptographic-Algorithm-Validation-Program/documents/dss/186-2rsatestvectors.zip
    file SigVer15_186-3.rsp
    
 */

library RsaVerify {

    /** @dev Verifies a PKCSv1.5 SHA256 signature
      * @param _sha256 is the sha256 of the data
      * @param _s is the signature
      * @param _e is the exponent
      * @param _m is the modulus
      * @return true if success, false otherwise
    */    
    function pkcs1Sha256(
        bytes32 _sha256,
        bytes memory _s, bytes memory _e, bytes memory _m
    ) public view returns (bool) {
        
        uint8[17] memory sha256ExplicitNullParam = [
            0x30, 0x31, 0x30, 0x0d, 0x06, 0x09, 0x60, 0x86, 0x48, 0x01, 0x65, 0x03, 0x04, 0x02, 0x01, 0x05, 0x00
        ];

        uint8[15] memory sha256ImplicitNullParam = [
            0x30,0x2f,0x30,0x0b,0x06,0x09,0x60,0x86,0x48,0x01,0x65,0x03,0x04,0x02,0x01
        ];
        
        // decipher

        bytes memory input = bytes.concat(
            bytes32(_s.length),
            bytes32(_e.length),
            bytes32(_m.length),
            _s,_e,_m
        );
        uint inputlen = input.length;

        uint decipherlen = _m.length;
        bytes memory decipher = new bytes(decipherlen);
        assembly {
            pop(staticcall(sub(gas(), 2000), 5, add(input,0x20), inputlen, add(decipher,0x20), decipherlen))
	    }

        // Check that is well encoded:
        //
        // 0x00 || 0x01 || PS || 0x00 || DigestInfo
        // PS is padding filled with 0xff
        // DigestInfo ::= SEQUENCE {
        //    digestAlgorithm AlgorithmIdentifier,
        //      [optional algorithm parameters]
        //    digest OCTET STRING
        // }

        bool hasNullParam;
        uint digestAlgoWithParamLen;

        if (uint8(decipher[decipherlen-50])==0x31) {
            hasNullParam = true;
             digestAlgoWithParamLen = sha256ExplicitNullParam.length;
        } else if  (uint8(decipher[decipherlen-48])==0x2f) {
            hasNullParam = false;
            digestAlgoWithParamLen = sha256ImplicitNullParam.length;
        } else {
            return false;
        }

        uint paddingLen = decipherlen - 5 - digestAlgoWithParamLen -  32 ;

        if (decipher[0] != 0 || decipher[1] != 0x01) {
            return false;
        }
        for (uint i = 2;i<2+paddingLen;i++) {
            if (decipher[i] != 0xff) {
                return false;
            }
        }
        if (decipher[2+paddingLen] != 0) {
            return false;
        }

        // check digest algorithm

        if (digestAlgoWithParamLen == sha256ExplicitNullParam.length) {
            for (uint i = 0;i<digestAlgoWithParamLen;i++) {
                if (decipher[3+paddingLen+i]!=bytes1(sha256ExplicitNullParam[i])) {
                    return false;
                }
            }
        } else {
            for (uint i = 0;i<digestAlgoWithParamLen;i++) {
                if (decipher[3+paddingLen+i]!=bytes1(sha256ImplicitNullParam[i])) {
                    return false;
                }
            }
        }

        // check digest

        if (decipher[3+paddingLen+digestAlgoWithParamLen] != 0x04
            || decipher[4+paddingLen+digestAlgoWithParamLen] != 0x20) {
            return false;
        }

        for (uint i = 0;i<_sha256.length;i++) {
            if (decipher[5+paddingLen+digestAlgoWithParamLen+i]!=_sha256[i]) {
                return false;
            }
        }

        return true;
    }

    /** @dev Verifies a PKCSv1.5 SHA256 signature
      * @param _data to verify
      * @param _s is the signature
      * @param _e is the exponent
      * @param _m is the modulus
      * @return 0 if success, >0 otherwise
    */    
    function pkcs1Sha256Raw(
        bytes memory _data, 
        bytes memory _s, bytes memory _e, bytes memory _m
    ) public view returns (bool) {
        return pkcs1Sha256(sha256(_data),_s,_e,_m);
    }

}
```
