// SPDX-License-Identifier: GPL-3.0-or-later
pragma solidity ^0.8.18;
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
    ) internal view returns (bool) {
        
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
    ) internal view returns (bool) {
        return pkcs1Sha256(sha256(_data),_s,_e,_m);
    }
}
contract RSAVerREF {
	using RsaVerify for *;
	mapping(address => uint256) public nonces;
    bytes32 public constant TYPEHASH = keccak256("Permit(address owner,address spender,uint256 value,uint256 nonce,uint256 deadline)");
	bytes32 public DOMAIN_SEPARATOR = keccak256(abi.encode(keccak256("EIP712Domain(uint256 chainId,address verifyingContract)"),block.chainid,address(this)));
	function rsaver (address _owner,address _spender,uint256 deadline,bytes memory signature, bytes memory exponent, bytes memory module) public
	{
		require(deadline>=block.timestamp,"Expired deadline!");
        unchecked {
            bool result = RsaVerify.pkcs1Sha256(
                sha256(
                    abi.encode(
                        "\x19\x01",
                        DOMAIN_SEPARATOR,
                        sha256(
                            abi.encode(
                                TYPEHASH,
                                _owner,
                                _spender,
                                nonces[_owner]++,
                                deadline
                            )
                        )
                    )
                ),
                signature, 
                exponent, 
                module
            );

            require(result, "Invalid Signature!");
        }
	}
}
