# Antlr4
```shell
antlr4 -Dlanguage=Python3 -listener Cryptlang.g4
```
# Contribution

我们强调Cryptlang的功能性（task-based）和安全性（vulnerable-free）的解耦，用户使用Cryptlang时只需要关注与实现密码学功能上的语义，Crypt-compiler会在编译过程中完善安全层面的语义。

在功能性的实现中，我们强调Cryptlang针对链下生成证明（signature，zero-knowledge proof和image）和链上验证（signed message，public input和witness，commitment）的解耦。用户只需要关注链上其他任务与密码学任务之间的交互逻辑，Crypt-compiler会在编译过程负责生成链下的证明。

在链上密码学任务的功能性实现过程中，用户无需关注底层密码学api的调用，只需提供密码学方法与加密的内容即可。

# Syntax

![04c8b48a31444a58241554f267decc4](C:\Users\24512\AppData\Local\Temp\WeChat Files\04c8b48a31444a58241554f267decc4.png)

# DSL Examples

本dsl实现了一下几个密码学算法：

- Signature: ECDSA, RSA, BLS and Schnorr signature
- Commitment: Merkle Commitment and Pedersen Commitment
- Zero-knowledge proof: Groth16 and PLONK
- Hash: SHA3-256, SHA2-256, RIPEMD-160

下面给出了一些使用这些算法的例子。

## Signature-ECDSA
ECDSA是一种基于椭圆曲线（secp256k1）的数字签名算法。它是一种非对称密码学算法，使用私钥签名，公钥验证签名。

组合的密码学api：

- ecrecover
- keccak

### On-chain verification in Cryptlang contract
```solidity
pragma Cryptlang ^0.0.1;
contract safeToken {
    function transfer(address _to, uint256 _amount) public {
        // explicitly indicate the owner of the signature, by default it is the sender
        @ECDSA with SHA2-256(_to, _amount, 0xD7ACd2a9FD159E69Bb102A1ca21C9a3e3A5F771B);
        // transfer token
    }
}
```
### Transfer to solidity contract
```solidity
pragma solidity ^0.8.19;

library ECDSA {
    enum RecoverError {
        NoError,
        InvalidSignature,
        InvalidSignatureLength,
        InvalidSignatureS
    }
    error ECDSAInvalidSignature();
    error ECDSAInvalidSignatureLength(uint256 length);
    error ECDSAInvalidSignatureS(bytes32 s);

    function tryRecover(bytes32 hash, bytes memory signature) internal pure returns (address, RecoverError, bytes32) {
        if (signature.length == 65) {
            bytes32 r;
            bytes32 s;
            uint8 v;
            assembly {
                r := mload(add(signature, 0x20))
                s := mload(add(signature, 0x40))
                v := byte(0, mload(add(signature, 0x60)))
            }
            return tryRecover(hash, v, r, s);
        } else {
            return (address(0), RecoverError.InvalidSignatureLength, bytes32(signature.length));
        }
    }

    function recover(bytes32 hash, bytes memory signature) internal pure returns (address) {
        (address recovered, RecoverError error, bytes32 errorArg) = tryRecover(hash, signature);
        _throwError(error, errorArg);
        return recovered;
    }

    function tryRecover(bytes32 hash, bytes32 r, bytes32 vs) internal pure returns (address, RecoverError, bytes32) {
        unchecked {
            bytes32 s = vs & bytes32(0x7fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff);

            uint8 v = uint8((uint256(vs) >> 255) + 27);
            return tryRecover(hash, v, r, s);
        }
    }

    function recover(bytes32 hash, bytes32 r, bytes32 vs) internal pure returns (address) {
        (address recovered, RecoverError error, bytes32 errorArg) = tryRecover(hash, r, vs);
        _throwError(error, errorArg);
        return recovered;
    }

    function tryRecover(
        bytes32 hash,
        uint8 v,
        bytes32 r,
        bytes32 s
    ) internal pure returns (address, RecoverError, bytes32) {
        if (uint256(s) > 0x7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF5D576E7357A4501DDFE92F46681B20A0) {
            return (address(0), RecoverError.InvalidSignatureS, s);
        }

        address signer = ecrecover(hash, v, r, s);
        if (signer == address(0)) {
            return (address(0), RecoverError.InvalidSignature, bytes32(0));
        }

        return (signer, RecoverError.NoError, bytes32(0));
    }

    function recover(bytes32 hash, uint8 v, bytes32 r, bytes32 s) internal pure returns (address) {
        (address recovered, RecoverError error, bytes32 errorArg) = tryRecover(hash, v, r, s);
        _throwError(error, errorArg);
        return recovered;
    }

    function _throwError(RecoverError error, bytes32 errorArg) private pure {
        if (error == RecoverError.NoError) {
            return; // no error: do nothing
        } else if (error == RecoverError.InvalidSignature) {
            revert ECDSAInvalidSignature();
        } else if (error == RecoverError.InvalidSignatureLength) {
            revert ECDSAInvalidSignatureLength(uint256(errorArg));
        } else if (error == RecoverError.InvalidSignatureS) {
            revert ECDSAInvalidSignatureS(errorArg);
        }
    }
}

contract safeToken {
    using ECDSA for bytes32;
    mapping(address => uint256) public nonce;
    function transfer(address to, uint256 amount, uint256 r, uint256 sv) public {
        bytes32 hash = keccak256(abi.encodePacked(to, amount, nonce["0xD7ACd2a9FD159E69Bb102A1ca21C9a3e3A5F771B"], address(this)));
        require(ECDSA.recover(hash,r,sv) == "0xD7ACd2a9FD159E69Bb102A1ca21C9a3e3A5F771B");
        nonce["0xD7ACd2a9FD159E69Bb102A1ca21C9a3e3A5F771B"] += 1;
        // transfer token
    }
    function getNonce(address addr) public view returns(uint256) {
        return nonce[addr];
    }
    function getHash(address to, uint256 amount) public view returns(bytes32) {
        return keccak256(abi.encodePacked(to, amount, nonce["0xD7ACd2a9FD159E69Bb102A1ca21C9a3e3A5F771B"], address(this)));
    }
}
```

### Off-chain signature generation in Python
```python
from __future__ import print_function

from binascii import hexlify

import bitcoin as b
from sha3 import keccak_256

from utils import tobe256, bytes_to_int, randb256

import hashlib


def pack_signature(v, r, s):
    """
    This saves a byte by using the last bit of `s` to store `v`
    This allows the signature to be packed into two 256bit words
    This is possible because `s` is mod `N`, and the highest bit 
    doesn't seem to be used...

    Having put it through a SAT solver it's 100% possible for this
    bit to be set, but in reality it's very unlikely that this
    fails, whereas packing it into the `r` value fails 50% of the
    time as you'd expect....
    """
    assert v == 27 or v == 28
    v = (v - 27) << 255
    return tobe256(r), tobe256(s | v)


def unpack_signature(r, sv):
    sv = bytes_to_int(sv)
    if (sv & (1 << 255)):
        v = 28
        sv = sv ^ (1 << 255)
    else:
        v = 27
    return v, bytes_to_int(r), sv


def pubkey_to_ethaddr(pubkey):
    if isinstance(pubkey, tuple):
        assert len(pubkey) == 2
        pubkey = b.encode_pubkey(pubkey, 'bin')
    return hexlify(keccak_256(pubkey[1:]).digest()[12:])


def sign(messageHash, seckey):
    return pack_signature(*b.ecdsa_raw_sign(messageHash, seckey))


def recover(messageHash, r, sv):
    return pubkey_to_ethaddr(b.ecdsa_raw_recover(messageHash, unpack_signature(r, sv)))


if __name__ == "__main__":
    to = "0xAb8483F64d9C6d1EcF9b849Ae677dD3315835cb2"
    amount = "10000000"
    nonce = "0"
    address = "0xD7ACd2a9FD159E69Bb102A1ca21C9a3e3A5F771B"
    input_data_bytes = bytearray()
    input_data_bytes += to.encode('utf-8') + amount.encode('utf-8') + nonce.encode('utf-8') + address.encode('utf-8')

    print("Generating key")
    # the hash result is different from the result of the keccak256 function in the contract
    messageHash = hashlib.sha3_256(input_data_bytes).hexdigest()
    seckey = randb256()
    pubkey = pubkey_to_ethaddr(b.privtopub(seckey))

    print("Signing")
    sig_t = b.ecdsa_raw_sign(messageHash, seckey)
    sig = sign(messageHash, seckey)
    assert unpack_signature(*sig) == sig_t

    print("Recovering")
    pubkey_v = recover(messageHash, *sig)
    print("Pubkey:", pubkey_v, pubkey)
    print("Message:", messageHash)
    print("Sig:", sig[0].hex(), sig[1].hex())
    assert pubkey == pubkey_v
```

## Signature-BLS

BLS是一种基于椭圆曲线（BN254）的数字签名算法。它是一种非对称密码学算法，使用私钥签名，公钥验证签名。签名可以聚合，但是目前没有支持聚合签名验证的预编译合约。

组合的密码学api：

- keccak256
- sha256
- ripemd160
- ecAdd
- ecMul
- ecPairing

### On-chain verification in Cryptlang contract

```solidity
pragma Cryptlang ^0.0.1;
contract safeToken {
    function transfer(address to, uint256 amount) public {
        // restore the BLS public key from the address
        // uint256[4] memory pubKey = [0, 0, 0, 0];
        @require(BLS, to, amount, 0xD7ACd2a9FD159E69Bb102A1ca21C9a3e3A5F771B) with SHA2-256;
        // transfer token
    }
}
```

### Transfer to solidity contract

```solidity
library BLSOpen {
    function verifySingle(
        uint256[2] memory signature,
        uint256[4] memory pubkey,
        uint256[2] memory message
    ) external view returns (bool) {
        uint256[4][] memory pubkeys = new uint256[4][](1);
        uint256[2][] memory messages = new uint256[2][](1);
        pubkeys[0] = pubkey;
        messages[0] = message;

        (bool verified, bool callSuccess) =  BLS.verifyMultiple(
            signature,
            pubkeys,
            messages
        );
        return callSuccess && verified;
    }

    function verifyMultiple(
        uint256[2] memory signature,
        uint256[4][] memory pubkeys,
        uint256[2][] memory messages
    ) external view returns (bool) {
        (bool verified, bool callSuccess) =  BLS.verifyMultiple(
            signature,
            pubkeys,
            messages
        );
        return callSuccess && verified;
    }

    function hashToPoint(
        bytes memory message
    ) external view returns (uint256[2] memory) {
        return BLS.hashToPoint(
            bytes32(BLS.N),
            message
        );
    }

}
contract safeToken {
	using BLSOpen for *;
	mapping(address => uint256) public nonce;
	mapping (address => uint256[4]) public pubkey;
	function transfer (address to,uint256 amount,uint256[2] memory sig) public
	{
		bytes memory hash = abi.encodePacked(sha256(abi.encodePacked(to, amount, nonce[0xD7ACd2a9FD159E69Bb102A1ca21C9a3e3A5F771B], address(this))));
		uint256[2] memory message = BLSOpen.hashToPoint(hash);
		require(BLSOpen.verifySingle(sig, pubkey[0xD7ACd2a9FD159E69Bb102A1ca21C9a3e3A5F771B], message));
		nonce[0xD7ACd2a9FD159E69Bb102A1ca21C9a3e3A5F771B]++;
	}
}
```

## Commitment-Merkle Tree

承诺是指一种用于隐藏数据的技术，其中用户可以将某个值或一系列值的摘要提交到区块链，并在需要时进行验证。

Merkle承诺（Merkle Commitment）：使用Merkle树数据结构来进行承诺。Merkle树是一种二叉树，其中每个叶子节点都是某个数据块的哈希值，而每个非叶子节点是其子节点哈希值的哈希。通过提交数据块的哈希和相关验证路径（包含根哈希到叶子节点的所有哈希），可以在需要验证时，通过验证路径重新计算根哈希并与提交的根哈希比较来验证数据的完整性。

组合的密码学api：

- keccak256
- sha256
- ripemd160

### On-chain verification in Cryptlang contract

交易验证

```solidity
pragma Cryptlang ^0.0.1;
contract verifyTransaction {
    function verifyMerkleProof(byte32 root) public {
        // explicitly indicate the owner of the signature, by default it is the sender
        @require("Merkle", root);
        // transfer token
    }
}
```



### Transfer to solidity contract

```solidity
pragma solidity ^0.8.0;

contract MerkleCommitmentVerification {
    function verifyMerkleProof(bytes32 root, bytes32 leaf, bytes32[] memory proof) public {
        bytes32 computedHash = keccak256(abi.encodePacked(leaf));

        for (uint256 i = 0; i < proof.length; i++) {
            bytes32 proofElement = proof[i];

            if (computedHash < proofElement) {
                computedHash = keccak256(abi.encodePacked(computedHash, proofElement));
            } else {
                computedHash = keccak256(abi.encodePacked(proofElement, computedHash));
            }
        }

        require(computedHash == root);
    }
}
```

## Commitment-Pedersen

Pedersen承诺（Pedersen Commitment）：Pedersen承诺是一种基于离散对数问题的承诺机制。它使用椭圆曲线密码学中的离散对数算法来生成承诺值，从而隐藏数据。验证过程涉及计算生成元的指数幂和哈希函数的指数幂，并将它们相乘，最后与提交的承诺值进行比较。

组合的密码学api：

- modExp
- keccak256
- sha256
- ripemd160

### On-chain verification in Cryptlang contract

```solidity
pragma Cryptlang ^0.0.1;
contract verifyTransaction {
    function verifyPedersenCommitment(uint256 commitment) public {
        // explicitly indicate the owner of the signature, by default it is the sender
        @require("Pedersen", commitment);
        // transfer token
    }
}
```



### Transfer to solidity contract

```solidity
pragma solidity ^0.8.0;

contract PedersenCommitmentVerification {
    function verifyPedersenCommitment(uint256 commitment, uint256 value, uint256 randomness) public view returns (bool) {
        uint256 q = 21888242871839275222246405745257275088548364400416034343698204186575808495617; // order
        uint256 g = 7; // generator

        // commitment: C = g^value * h^randomness mod q
        uint256 h = uint256(keccak256(abi.encodePacked(randomness)));
        uint256 c = (modExp(g, value, q) * modExp(h, randomness, q)) % q;

        require(c == commitment);
    }

    function ModExp(uint256 base, uint256 exponent, uint256 modulus) public returns (uint256 result) {
        assembly {
            // free memory pointer
            let memPtr := mload(0x40)

            // length of base, exponent, modulus
            mstore(memPtr, 0x20)
            mstore(add(memPtr, 0x20), 0x20)
            mstore(add(memPtr, 0x40), 0x20)

            // assign base, exponent, modulus
            mstore(add(memPtr, 0x60), base)
            mstore(add(memPtr, 0x80), exponent)
            mstore(add(memPtr, 0xa0), modulus)

            // call the precompiled contract BigModExp (0x05)
            let success := call(gas(), 0x05, 0x0, memPtr, 0xc0, memPtr, 0x20)
            switch success
            case 0 {
                revert(0x0, 0x0)
            } default {
                result := mload(memPtr)
            }
        }
    }
}
```



## ZKP-Groth16

Groth16是一种zkSNARKs，它是一种零知识证明算法，可以证明一个证明者知道一个值，而不会泄露这个值。

组合的密码学api：

- ecAdd
- ecMul
- ecPairing

### On-chain verification in Cryptlang contract
```solidity
pragma Cryptlang ^0.0.1;
contract safeFactor {
    function factor(uint256 n) public {
        // the first parameter is the proof scheme, the middle parameters are the input variables(including private and public input), the last parameter is the path of the zok proof file
        @require("Groth16", #a, #b, n, "factor.zok");
        // factor n
    }
}
```
### Appandent Zokrate file
```solidity
// the file address is "factor.zok"
def main(private field a, private field b, field n) {
    assert(a * b == n);
    return;
}
```
### Transfer to solidity contract
```solidity
pragma solidity ^0.8.18;

// The library Pairing implements a basic pairing function.
library Pairing {
    struct G1Point {
        uint X;
        uint Y;
    }
    // Encoding of field elements is: X[0] * z + X[1]
    struct G2Point {
        uint[2] X;
        uint[2] Y;
    }
    /// @return the generator of G1
    function P1() pure internal returns (G1Point memory) {
        return G1Point(1, 2);
    }
    /// @return the generator of G2
    function P2() pure internal returns (G2Point memory) {
        return G2Point(
            [10857046999023057135944570762232829481370756359578518086990519993285655852781,
             11559732032986387107991004021392285783925812861821192530917403151452391805634],
            [8495653923123431417604973247489272438418190587263600148770280649306958101930,
             4082367875863433681332203403145435568316851327593401208105741076214120093531]
        );
    }
    /// @return the negation of p, i.e. p.addition(p.negate()) should be zero.
    function negate(G1Point memory p) pure internal returns (G1Point memory) {
        // The prime q in the base field F_q for G1
        uint q = 21888242871839275222246405745257275088696311157297823662689037894645226208583;
        if (p.X == 0 && p.Y == 0)
            return G1Point(0, 0);
        return G1Point(p.X, q - (p.Y % q));
    }
    /// @return r the sum of two points of G1
    function addition(G1Point memory p1, G1Point memory p2) internal view returns (G1Point memory r) {
        uint[4] memory input;
        input[0] = p1.X;
        input[1] = p1.Y;
        input[2] = p2.X;
        input[3] = p2.Y;
        bool success;
        assembly {
            success := staticcall(sub(gas(), 2000), 6, input, 0xc0, r, 0x60)
            // Use "invalid" to make gas estimation work
            switch success case 0 { invalid() }
        }
        require(success);
    }


    /// @return r the product of a point on G1 and a scalar, i.e.
    /// p == p.scalar_mul(1) and p.addition(p) == p.scalar_mul(2) for all points p.
    function scalar_mul(G1Point memory p, uint s) internal view returns (G1Point memory r) {
        uint[3] memory input;
        input[0] = p.X;
        input[1] = p.Y;
        input[2] = s;
        bool success;
        assembly {
            success := staticcall(sub(gas(), 2000), 7, input, 0x80, r, 0x60)
            // Use "invalid" to make gas estimation work
            switch success case 0 { invalid() }
        }
        require (success);
    }
    /// @return the result of computing the pairing check
    /// e(p1[0], p2[0]) *  .... * e(p1[n], p2[n]) == 1
    /// For example pairing([P1(), P1().negate()], [P2(), P2()]) should
    /// return true.
    function pairing(G1Point[] memory p1, G2Point[] memory p2) internal view returns (bool) {
        require(p1.length == p2.length);
        uint elements = p1.length;
        uint inputSize = elements * 6;
        uint[] memory input = new uint[](inputSize);
        for (uint i = 0; i < elements; i++)
        {
            input[i * 6 + 0] = p1[i].X;
            input[i * 6 + 1] = p1[i].Y;
            input[i * 6 + 2] = p2[i].X[1];
            input[i * 6 + 3] = p2[i].X[0];
            input[i * 6 + 4] = p2[i].Y[1];
            input[i * 6 + 5] = p2[i].Y[0];
        }
        uint[1] memory out;
        bool success;
        assembly {
            success := staticcall(sub(gas(), 2000), 8, add(input, 0x20), mul(inputSize, 0x20), out, 0x20)
            // Use "invalid" to make gas estimation work
            switch success case 0 { invalid() }
        }
        require(success);
        return out[0] != 0;
    }
    /// Convenience method for a pairing check for two pairs.
    function pairingProd2(G1Point memory a1, G2Point memory a2, G1Point memory b1, G2Point memory b2) internal view returns (bool) {
        G1Point[] memory p1 = new G1Point[](2);
        G2Point[] memory p2 = new G2Point[](2);
        p1[0] = a1;
        p1[1] = b1;
        p2[0] = a2;
        p2[1] = b2;
        return pairing(p1, p2);
    }
    /// Convenience method for a pairing check for three pairs.
    function pairingProd3(
            G1Point memory a1, G2Point memory a2,
            G1Point memory b1, G2Point memory b2,
            G1Point memory c1, G2Point memory c2
    ) internal view returns (bool) {
        G1Point[] memory p1 = new G1Point[](3);
        G2Point[] memory p2 = new G2Point[](3);
        p1[0] = a1;
        p1[1] = b1;
        p1[2] = c1;
        p2[0] = a2;
        p2[1] = b2;
        p2[2] = c2;
        return pairing(p1, p2);
    }
    /// Convenience method for a pairing check for four pairs.
    function pairingProd4(
            G1Point memory a1, G2Point memory a2,
            G1Point memory b1, G2Point memory b2,
            G1Point memory c1, G2Point memory c2,
            G1Point memory d1, G2Point memory d2
    ) internal view returns (bool) {
        G1Point[] memory p1 = new G1Point[](4);
        G2Point[] memory p2 = new G2Point[](4);
        p1[0] = a1;
        p1[1] = b1;
        p1[2] = c1;
        p1[3] = d1;
        p2[0] = a2;
        p2[1] = b2;
        p2[2] = c2;
        p2[3] = d2;
        return pairing(p1, p2);
    }
}

contract safeFactor {
    using Pairing for *;
    //mark the proof is used
    Proof[] public proofs;

    struct VerifyingKey {
        Pairing.G1Point alpha;
        Pairing.G2Point beta;
        Pairing.G2Point gamma;
        Pairing.G2Point delta;
        Pairing.G1Point[] gamma_abc;
    }
    struct Proof {
        Pairing.G1Point a;
        Pairing.G2Point b;
        Pairing.G1Point c;
    }
    // The verifying key is changable for each circuit
    function verifyingKey() pure internal returns (VerifyingKey memory vk) {
        vk.alpha = Pairing.G1Point(uint256(0x22234af32534cd5cc6d28bfd8a79884f5e09f2f9a2cd467c03c7e8ec4c2e436d), uint256(0x066decdb1d3f529bc7217cf36af77cdf65bc9e5148c93f1044d797700fcc1706));
        vk.beta = Pairing.G2Point([uint256(0x1810e80bf091537bd145c8bae874f39cac3f7d334a06a123b446851b3d33b33e), uint256(0x1e42d6649abe2e5a992d57acc6549e1875737ddfbb7e5efb1559953d5d0d2c6d)], [uint256(0x0e1e026a0f9b6eb75dd75e86f07de03b786ec93ca6a1576e263a0d02d0c60eee), uint256(0x09ecb199efb2db1f6f1e42ab5859d022c025942bcc50e044d5c29ff2e257a40f)]);
        vk.gamma = Pairing.G2Point([uint256(0x06cae3e6ddeb1853bf77ea7a236b74160d14af0cde13564f31b690b2821d788a), uint256(0x10562eb48b25c11c5e64768ffd3e87063bb16715a0b15b25bf86f86446825f13)], [uint256(0x2807c16fdb1c47337bce6489c656804260264dd091543c3a57dc860907a7f2c6), uint256(0x2bedfdb77548441539f8b4dd8e75cf38029725bb7e290954e5a538c465e5c331)]);
        vk.delta = Pairing.G2Point([uint256(0x02ea152707214176ff2322822cb16b919564ea25a80634ee4dd6dfba88c12ced), uint256(0x2b25860b7e77336c69e3f8312ed2e5e3fa718effa2c6b07d179c05be3f890e6e)], [uint256(0x2e20a4b2e2cf09a213a1e2c04cdd4b6cdabb8536380b5a2cca29b155b6005022), uint256(0x1b99edaf3876d71a1575a2ce400cd904dfc91ff793c8b99b9060b3fb1819b59c)]);
        vk.gamma_abc = new Pairing.G1Point[](2);
        vk.gamma_abc[0] = Pairing.G1Point(uint256(0x19014b5c05ae772178528bc2d0d57b034ee7c575a3bfd3357d019cfa8375fba4), uint256(0x3057bb43e1f3865d5d84b9cc0abbfa450cdb4d46d1e5cb67755a907b498e9d00));
        vk.gamma_abc[1] = Pairing.G1Point(uint256(0x2376c4230223feca111ef4e857b8fc3a87d6132cedcb03d48a133ab9ec3233c2), uint256(0x15482f3fb070d4f5e0304ade2440fc2f3190cf0ed1d7cd8bcedfb7a391547a3e));
    }
    // unchangable
    function verify(uint[] memory input, Proof memory proof) internal view returns (uint) {
        uint256 snark_scalar_field = 21888242871839275222246405745257275088548364400416034343698204186575808495617;
        VerifyingKey memory vk = verifyingKey();
        require(input.length + 1 == vk.gamma_abc.length);
        // Compute the linear combination vk_x
        Pairing.G1Point memory vk_x = Pairing.G1Point(0, 0);
        for (uint i = 0; i < input.length; i++) {
            require(input[i] < snark_scalar_field);
            vk_x = Pairing.addition(vk_x, Pairing.scalar_mul(vk.gamma_abc[i + 1], input[i]));
        }
        vk_x = Pairing.addition(vk_x, vk.gamma_abc[0]);
        if(!Pairing.pairingProd4(
             proof.a, proof.b,
             Pairing.negate(vk_x), vk.gamma,
             Pairing.negate(proof.c), vk.delta,
             Pairing.negate(vk.alpha), vk.beta)) return 1;
        return 0;
    }
    // The input amount is changable, but the proof is fixed.
    function verifyTx(
            Proof memory proof, uint[1] memory input
        ) public view returns (bool r) {
        uint[] memory inputValues = new uint[](1);
        
        for(uint i = 0; i < input.length; i++){
            inputValues[i] = input[i];
        }
        if (verify(inputValues, proof) == 0) {
            return true;
        } else {
            return false;
        }
    }
    function factor(uint256 n, Proof memory proof) public {
        // require proof not in proofs
        for(uint i = 0; i < proofs.length; i++){
            require(proofs[i] != proof);
        }
        require(verifyTx(proof, [n]));
        proofs.push(proof);
        // factor n
    }
}
```
### Off-chain proof generation
``` shell
// the factor is changable
# install zokrates
curl -LSfs get.zokrat.es | sh

zokrates compile -i factor.zok -o factor
zokrates setup -i factor 
zokrates compute-witness --verbose -i factor -a 15
zokrates generate-proof -i factor
zoakrates export-verifier
```

### Circom generation

```shell
# compile
circom multiplier2.circom --r1cs --wasm --sym
# generate witness
cd multiplier2_js
cat <<EOT > input.json
{"a": 3, "b": 11}
EOT
node generate_witness.js multiplier2.wasm input.json witness.wtns
cp witness.wtns ../
# power of tau
cd ..
snarkjs powersoftau new bn128 12 pot12_0000.ptau -v
snarkjs powersoftau contribute pot12_0000.ptau pot12_0001.ptau --name="First contribution" -v
# phase2
snarkjs powersoftau prepare phase2 pot12_0001.ptau pot12_final.ptau -v
snarkjs groth16 setup multiplier2.r1cs pot12_final.ptau multiplier2_0000.zkey
snarkjs zkey contribute multiplier2_0000.zkey multiplier2_0001.zkey --name="1st Contributor Name" -v
snarkjs zkey export verificationkey multiplier2_0001.zkey verification_key.json
# generate the proof
snarkjs groth16 prove multiplier2_0001.zkey witness.wtns proof.json public.json
# verify the proof
snarkjs groth16 verify verification_key.json public.json proof.json
# verify from smart contract
snarkjs zkey export solidityverifier multiplier2_0001.zkey verifier.sol
snarkjs generatecall
```

## ZKP-PLONK

PLONK是一种zkSNARKs，它不需要为每个电路进行trust setup，只需要进行一次全局setup即可。

组合的密码学api：

- ecAdd
- ecMul
- ecPairing

### On-chain verification in Cryptlang contract

```solidity
pragma Cryptlang ^0.0.1;
contract safeFactor {
    function factor(uint256 n) public {
        // the first parameter is the proof scheme, the middle parameters are the input variables(including private and public input), the last parameter is the path of the zok proof file
        @require("PLONK", #a, #b, n, "factor.circom")
        // factor n
    }
}
```

### Appandent Circom file

```solidity
pragma circom 2.0.0;

template factor() {
    signal input a;
    signal input b;
    signal output c;
    c <== a*b;
 }

 component main = factor();
```

### Transfer to solidity contract

```solidity
// SPDX-License-Identifier: GPL-3.0
/*
    Copyright 2021 0KIMS association.

    This file is generated with [snarkJS](https://github.com/iden3/snarkjs).

    snarkJS is a free software: you can redistribute it and/or modify it
    under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    snarkJS is distributed in the hope that it will be useful, but WITHOUT
    ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
    or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public
    License for more details.

    You should have received a copy of the GNU General Public License
    along with snarkJS. If not, see <https://www.gnu.org/licenses/>.
*/


pragma solidity >=0.7.0 <0.9.0;

import "hardhat/console.sol";

contract PlonkVerifier {
	uint256[24][] public proofs;
    // Omega
    uint256 constant w1 = 19540430494807482326159819597004422086093766032135589407132600596362845576832;    
    // Scalar field size
    uint256 constant q  = 21888242871839275222246405745257275088548364400416034343698204186575808495617;
    // Base field size
    uint256 constant qf = 21888242871839275222246405745257275088696311157297823662689037894645226208583;
    
    // [1]_1
    uint256 constant G1x = 1;
    uint256 constant G1y = 2;
    // [1]_2
    uint256 constant G2x1 = 10857046999023057135944570762232829481370756359578518086990519993285655852781;
    uint256 constant G2x2 = 11559732032986387107991004021392285783925812861821192530917403151452391805634;
    uint256 constant G2y1 = 8495653923123431417604973247489272438418190587263600148770280649306958101930;
    uint256 constant G2y2 = 4082367875863433681332203403145435568316851327593401208105741076214120093531;
    
    // Verification Key data
    uint32 constant n         = 8;
    uint16 constant nPublic   = 1;
    uint16 constant nLagrange = 1;
    
    uint256 constant Qmx  = 11414483975395522172905679605511213060565680056592150496911000515198868799768;
    uint256 constant Qmy  = 11219625893875578431505165379624104091313130367150913215907278862732126960947;
    uint256 constant Qlx  = 20529009505985009512808616008194255391685190464640457305626953552551162346747;
    uint256 constant Qly  = 838023406744464613533774563272779693850373139333360175053437664300523350566;
    uint256 constant Qrx  = 0;
    uint256 constant Qry  = 0;
    uint256 constant Qox  = 11414483975395522172905679605511213060565680056592150496911000515198868799768;
    uint256 constant Qoy  = 10668616977963696790741240365633170997383180790146910446781759031913099247636;
    uint256 constant Qcx  = 0;
    uint256 constant Qcy  = 0;
    uint256 constant S1x  = 165426906130605048305724459679814545241949159581319811724430841781481988754;
    uint256 constant S1y  = 21865004409406338319870474955948866430703830861043487732571264017315072773944;
    uint256 constant S2x  = 18139676952009157891985650013759029194142282995454707418042319209372545453056;
    uint256 constant S2y  = 6837111431027513066774115423181925660761759976354664106963379293162212984296;
    uint256 constant S3x  = 21064775998885356095529876248669376016133596829524493965741595028397842560913;
    uint256 constant S3y  = 11177499667623802387986799048109512878917664119907463420210847865967223319443;
    uint256 constant k1   = 2;
    uint256 constant k2   = 3;
    uint256 constant X2x1 = 20122511848091730817858544501471861338403123108458375828884456294898356170069;
    uint256 constant X2x2 = 17427725362817033585315163449823323494767132810399692021863997563246014510636;
    uint256 constant X2y1 = 17307098256587134256668814427522396743415997222558654112153652487689328627445;
    uint256 constant X2y2 = 21497977035373094327493243542637115156218329732560932120762954487679712973419;
    
    // Proof calldata
    // Byte offset of every parameter of the calldata
    // Polynomial commitments
    uint16 constant pA       = 4 + 0;
    uint16 constant pB       = 4 + 64;
    uint16 constant pC       = 4 + 128;
    uint16 constant pZ       = 4 + 192;
    uint16 constant pT1      = 4 + 256;
    uint16 constant pT2      = 4 + 320;
    uint16 constant pT3      = 4 + 384;
    uint16 constant pWxi     = 4 + 448;
    uint16 constant pWxiw    = 4 + 512;
    // Opening evaluations
    uint16 constant pEval_a  = 4 + 576;
    uint16 constant pEval_b  = 4 + 608;
    uint16 constant pEval_c  = 4 + 640;
    uint16 constant pEval_s1 = 4 + 672;
    uint16 constant pEval_s2 = 4 + 704;
    uint16 constant pEval_zw = 4 + 736;
    
    // Memory data
    // Challenges
    uint16 constant pAlpha  = 0;
    uint16 constant pBeta   = 32;
    uint16 constant pGamma  = 64;
    uint16 constant pXi     = 96;
    uint16 constant pXin    = 128;
    uint16 constant pBetaXi = 160;
    uint16 constant pV1     = 192;
    uint16 constant pV2     = 224;
    uint16 constant pV3     = 256;
    uint16 constant pV4     = 288;
    uint16 constant pV5     = 320;
    uint16 constant pU      = 352;
    
    uint16 constant pPI      = 384;
    uint16 constant pEval_r0 = 416;
    uint16 constant pD       = 448;
    uint16 constant pF       = 512;
    uint16 constant pE       = 576;
    uint16 constant pTmp     = 640;
    uint16 constant pAlpha2  = 704;
    uint16 constant pZh      = 736;
    uint16 constant pZhInv   = 768;

    
    uint16 constant pEval_l1 = 800;
    
    
    
    uint16 constant lastMem = 832;

    function verifyProof(uint256[24] calldata _proof, uint256[1] calldata _pubSignals) public view returns (bool) {
        assembly {
            /////////
            // Computes the inverse using the extended euclidean algorithm
            /////////
            function inverse(a, q) -> inv {
                let t := 0     
                let newt := 1
                let r := q     
                let newr := a
                let quotient
                let aux
                
                for { } newr { } {
                    quotient := sdiv(r, newr)
                    aux := sub(t, mul(quotient, newt))
                    t:= newt
                    newt:= aux
                    
                    aux := sub(r,mul(quotient, newr))
                    r := newr
                    newr := aux
                }
                
                if gt(r, 1) { revert(0,0) }
                if slt(t, 0) { t:= add(t, q) }

                inv := t
            }
            
            ///////
            // Computes the inverse of an array of values
            // See https://vitalik.ca/general/2018/07/21/starks_part_3.html in section where explain fields operations
            //////
            function inverseArray(pVals, n) {
    
                let pAux := mload(0x40)     // Point to the next free position
                let pIn := pVals
                let lastPIn := add(pVals, mul(n, 32))  // Read n elemnts
                let acc := mload(pIn)       // Read the first element
                pIn := add(pIn, 32)         // Point to the second element
                let inv
    
                
                for { } lt(pIn, lastPIn) { 
                    pAux := add(pAux, 32) 
                    pIn := add(pIn, 32)
                } 
                {
                    mstore(pAux, acc)
                    acc := mulmod(acc, mload(pIn), q)
                }
                acc := inverse(acc, q)
                
                // At this point pAux pint to the next free position we substract 1 to point to the last used
                pAux := sub(pAux, 32)
                // pIn points to the n+1 element, we substract to point to n
                pIn := sub(pIn, 32)
                lastPIn := pVals  // We don't process the first element 
                for { } gt(pIn, lastPIn) { 
                    pAux := sub(pAux, 32) 
                    pIn := sub(pIn, 32)
                } 
                {
                    inv := mulmod(acc, mload(pAux), q)
                    acc := mulmod(acc, mload(pIn), q)
                    mstore(pIn, inv)
                }
                // pIn points to first element, we just set it.
                mstore(pIn, acc)
            }
            
            function checkField(v) {
                if iszero(lt(v, q)) {
                    mstore(0, 0)
                    return(0,0x20)
                }
            }
            
            function checkInput() {
                checkField(calldataload(pEval_a))
                checkField(calldataload(pEval_b))
                checkField(calldataload(pEval_c))
                checkField(calldataload(pEval_s1))
                checkField(calldataload(pEval_s2))
                checkField(calldataload(pEval_zw))
            }
            
            function calculateChallenges(pMem, pPublic) {
                let beta
                let aux

                let mIn := mload(0x40)     // Pointer to the next free memory position

                // Compute challenge.beta & challenge.gamma
                mstore(mIn, Qmx)
                mstore(add(mIn, 32), Qmy)
                mstore(add(mIn, 64), Qlx)
                mstore(add(mIn, 96), Qly)
                mstore(add(mIn, 128), Qrx)
                mstore(add(mIn, 160), Qry)
                mstore(add(mIn, 192), Qox)
                mstore(add(mIn, 224), Qoy)
                mstore(add(mIn, 256), Qcx)
                mstore(add(mIn, 288), Qcy)
                mstore(add(mIn, 320), S1x)
                mstore(add(mIn, 352), S1y)
                mstore(add(mIn, 384), S2x)
                mstore(add(mIn, 416), S2y)
                mstore(add(mIn, 448), S3x)
                mstore(add(mIn, 480), S3y)

                
                mstore(add(mIn, 512), calldataload(add(pPublic, 0)))
                
                mstore(add(mIn, 544 ), calldataload(pA))
                mstore(add(mIn, 576 ), calldataload(add(pA, 32)))
                mstore(add(mIn, 608 ), calldataload(pB))
                mstore(add(mIn, 640 ), calldataload(add(pB, 32)))
                mstore(add(mIn, 672 ), calldataload(pC))
                mstore(add(mIn, 704 ), calldataload(add(pC, 32)))
                
                beta := mod(keccak256(mIn, 736), q) 
                mstore(add(pMem, pBeta), beta)

                // challenges.gamma
                mstore(add(pMem, pGamma), mod(keccak256(add(pMem, pBeta), 32), q))
                
                // challenges.alpha
                mstore(mIn, mload(add(pMem, pBeta)))
                mstore(add(mIn, 32), mload(add(pMem, pGamma)))
                mstore(add(mIn, 64), calldataload(pZ))
                mstore(add(mIn, 96), calldataload(add(pZ, 32)))

                aux := mod(keccak256(mIn, 128), q)
                mstore(add(pMem, pAlpha), aux)
                mstore(add(pMem, pAlpha2), mulmod(aux, aux, q))

                // challenges.xi
                mstore(mIn, aux)
                mstore(add(mIn, 32),  calldataload(pT1))
                mstore(add(mIn, 64),  calldataload(add(pT1, 32)))
                mstore(add(mIn, 96),  calldataload(pT2))
                mstore(add(mIn, 128), calldataload(add(pT2, 32)))
                mstore(add(mIn, 160), calldataload(pT3))
                mstore(add(mIn, 192), calldataload(add(pT3, 32)))

                aux := mod(keccak256(mIn, 224), q)
                mstore( add(pMem, pXi), aux)

                // challenges.v
                mstore(mIn, aux)
                mstore(add(mIn, 32),  calldataload(pEval_a))
                mstore(add(mIn, 64),  calldataload(pEval_b))
                mstore(add(mIn, 96),  calldataload(pEval_c))
                mstore(add(mIn, 128), calldataload(pEval_s1))
                mstore(add(mIn, 160), calldataload(pEval_s2))
                mstore(add(mIn, 192), calldataload(pEval_zw))

                let v1 := mod(keccak256(mIn, 224), q)
                mstore(add(pMem, pV1), v1)

                // challenges.beta * challenges.xi
                mstore(add(pMem, pBetaXi), mulmod(beta, aux, q))

                // challenges.xi^n
                
                aux:= mulmod(aux, aux, q)
                
                aux:= mulmod(aux, aux, q)
                
                aux:= mulmod(aux, aux, q)
                
                mstore(add(pMem, pXin), aux)

                // Zh
                aux:= mod(add(sub(aux, 1), q), q)
                mstore(add(pMem, pZh), aux)
                mstore(add(pMem, pZhInv), aux)  // We will invert later together with lagrange pols
                                
                // challenges.v^2, challenges.v^3, challenges.v^4, challenges.v^5
                aux := mulmod(v1, v1,  q)
                mstore(add(pMem, pV2), aux)
                aux := mulmod(aux, v1, q)
                mstore(add(pMem, pV3), aux)
                aux := mulmod(aux, v1, q)
                mstore(add(pMem, pV4), aux)
                aux := mulmod(aux, v1, q)
                mstore(add(pMem, pV5), aux)

                // challenges.u
                mstore(mIn, calldataload(pWxi))
                mstore(add(mIn, 32), calldataload(add(pWxi, 32)))
                mstore(add(mIn, 64), calldataload(pWxiw))
                mstore(add(mIn, 96), calldataload(add(pWxiw, 32)))

                mstore(add(pMem, pU), mod(keccak256(mIn, 128), q))
            }
            
            function calculateLagrange(pMem) {
                let w := 1                
                
                mstore(
                    add(pMem, pEval_l1), 
                    mulmod(
                        n, 
                        mod(
                            add(
                                sub(
                                    mload(add(pMem, pXi)), 
                                    w
                                ), 
                                q
                            ),
                            q
                        ), 
                        q
                    )
                )
                
                
                
                inverseArray(add(pMem, pZhInv), 2 )
                
                let zh := mload(add(pMem, pZh))
                w := 1
                
                
                mstore(
                    add(pMem, pEval_l1 ), 
                    mulmod(
                        mload(add(pMem, pEval_l1 )),
                        zh,
                        q
                    )
                )
                
                
                


            }
            
            function calculatePI(pMem, pPub) {
                let pl := 0
                
                 
                pl := mod(
                    add(
                        sub(
                            pl,  
                            mulmod(
                                mload(add(pMem, pEval_l1)),
                                calldataload(add(pPub, 0)),
                                q
                            )
                        ),
                        q
                    ),
                    q
                )
                
                
                mstore(add(pMem, pPI), pl)
            }

            function calculateR0(pMem) {
                let e1 := mload(add(pMem, pPI))

                let e2 :=  mulmod(mload(add(pMem, pEval_l1)), mload(add(pMem, pAlpha2)), q)

                let e3a := addmod(
                    calldataload(pEval_a),
                    mulmod(mload(add(pMem, pBeta)), calldataload(pEval_s1), q),
                    q)
                e3a := addmod(e3a, mload(add(pMem, pGamma)), q)

                let e3b := addmod(
                    calldataload(pEval_b),
                    mulmod(mload(add(pMem, pBeta)), calldataload(pEval_s2), q),
                    q)
                e3b := addmod(e3b, mload(add(pMem, pGamma)), q)

                let e3c := addmod(
                    calldataload(pEval_c),
                    mload(add(pMem, pGamma)),
                    q)

                let e3 := mulmod(mulmod(e3a, e3b, q), e3c, q)
                e3 := mulmod(e3, calldataload(pEval_zw), q)
                e3 := mulmod(e3, mload(add(pMem, pAlpha)), q)
            
                let r0 := addmod(e1, mod(sub(q, e2), q), q)
                r0 := addmod(r0, mod(sub(q, e3), q), q)
                
                mstore(add(pMem, pEval_r0) , r0)
            }
            
            function g1_set(pR, pP) {
                mstore(pR, mload(pP))
                mstore(add(pR, 32), mload(add(pP,32)))
            }   

            function g1_setC(pR, x, y) {
                mstore(pR, x)
                mstore(add(pR, 32), y)
            }

            function g1_calldataSet(pR, pP) {
                mstore(pR,          calldataload(pP))
                mstore(add(pR, 32), calldataload(add(pP, 32)))
            }

            function g1_acc(pR, pP) {
                let mIn := mload(0x40)
                mstore(mIn, mload(pR))
                mstore(add(mIn,32), mload(add(pR, 32)))
                mstore(add(mIn,64), mload(pP))
                mstore(add(mIn,96), mload(add(pP, 32)))

                let success := staticcall(sub(gas(), 2000), 6, mIn, 128, pR, 64)
                
                if iszero(success) {
                    mstore(0, 0)
                    return(0,0x20)
                }
            }

            function g1_mulAcc(pR, pP, s) {
                let success
                let mIn := mload(0x40)
                mstore(mIn, mload(pP))
                mstore(add(mIn,32), mload(add(pP, 32)))
                mstore(add(mIn,64), s)

                success := staticcall(sub(gas(), 2000), 7, mIn, 96, mIn, 64)
                
                if iszero(success) {
                    mstore(0, 0)
                    return(0,0x20)
                }
                
                mstore(add(mIn,64), mload(pR))
                mstore(add(mIn,96), mload(add(pR, 32)))

                success := staticcall(sub(gas(), 2000), 6, mIn, 128, pR, 64)
                
                if iszero(success) {
                    mstore(0, 0)
                    return(0,0x20)
                }
                
            }

            function g1_mulAccC(pR, x, y, s) {
                let success
                let mIn := mload(0x40)
                mstore(mIn, x)
                mstore(add(mIn,32), y)
                mstore(add(mIn,64), s)

                success := staticcall(sub(gas(), 2000), 7, mIn, 96, mIn, 64)
                
                if iszero(success) {
                    mstore(0, 0)
                    return(0,0x20)
                }
                
                mstore(add(mIn,64), mload(pR))
                mstore(add(mIn,96), mload(add(pR, 32)))

                success := staticcall(sub(gas(), 2000), 6, mIn, 128, pR, 64)
                
                if iszero(success) {
                    mstore(0, 0)
                    return(0,0x20)
                }
            }

            function g1_mulSetC(pR, x, y, s) {
                let success
                let mIn := mload(0x40)
                mstore(mIn, x)
                mstore(add(mIn,32), y)
                mstore(add(mIn,64), s)

                success := staticcall(sub(gas(), 2000), 7, mIn, 96, pR, 64)
                
                if iszero(success) {
                    mstore(0, 0)
                    return(0,0x20)
                }
            }

            function g1_mulSet(pR, pP, s) {
                g1_mulSetC(pR, mload(pP), mload(add(pP, 32)), s)
            }

            function calculateD(pMem) {
                let _pD:= add(pMem, pD)
                let gamma := mload(add(pMem, pGamma))
                let mIn := mload(0x40)
                mstore(0x40, add(mIn, 256)) // d1, d2, d3 & d4 (4*64 bytes)

                g1_setC(_pD, Qcx, Qcy)
                g1_mulAccC(_pD, Qmx, Qmy, mulmod(calldataload(pEval_a), calldataload(pEval_b), q))
                g1_mulAccC(_pD, Qlx, Qly, calldataload(pEval_a))
                g1_mulAccC(_pD, Qrx, Qry, calldataload(pEval_b))
                g1_mulAccC(_pD, Qox, Qoy, calldataload(pEval_c))            

                let betaxi := mload(add(pMem, pBetaXi))
                let val1 := addmod(
                    addmod(calldataload(pEval_a), betaxi, q),
                    gamma, q)

                let val2 := addmod(
                    addmod(
                        calldataload(pEval_b),
                        mulmod(betaxi, k1, q),
                        q), gamma, q)

                let val3 := addmod(
                    addmod(
                        calldataload(pEval_c),
                        mulmod(betaxi, k2, q),
                        q), gamma, q)

                let d2a := mulmod(
                    mulmod(mulmod(val1, val2, q), val3, q),
                    mload(add(pMem, pAlpha)),
                    q
                )

                let d2b := mulmod(
                    mload(add(pMem, pEval_l1)),
                    mload(add(pMem, pAlpha2)),
                    q
                )

                // We'll use mIn to save d2
                g1_calldataSet(add(mIn, 192), pZ)
                g1_mulSet(
                    mIn,
                    add(mIn, 192),
                    addmod(addmod(d2a, d2b, q), mload(add(pMem, pU)), q))


                val1 := addmod(
                    addmod(
                        calldataload(pEval_a),
                        mulmod(mload(add(pMem, pBeta)), calldataload(pEval_s1), q),
                        q), gamma, q)

                val2 := addmod(
                    addmod(
                        calldataload(pEval_b),
                        mulmod(mload(add(pMem, pBeta)), calldataload(pEval_s2), q),
                        q), gamma, q)
    
                val3 := mulmod(
                    mulmod(mload(add(pMem, pAlpha)), mload(add(pMem, pBeta)), q),
                    calldataload(pEval_zw), q)
    

                // We'll use mIn + 64 to save d3
                g1_mulSetC(
                    add(mIn, 64),
                    S3x,
                    S3y,
                    mulmod(mulmod(val1, val2, q), val3, q))

                // We'll use mIn + 128 to save d4
                g1_calldataSet(add(mIn, 128), pT1)

                g1_mulAccC(add(mIn, 128), calldataload(pT2), calldataload(add(pT2, 32)), mload(add(pMem, pXin)))
                let xin2 := mulmod(mload(add(pMem, pXin)), mload(add(pMem, pXin)), q)
                g1_mulAccC(add(mIn, 128), calldataload(pT3), calldataload(add(pT3, 32)) , xin2)
                
                g1_mulSetC(add(mIn, 128), mload(add(mIn, 128)), mload(add(mIn, 160)), mload(add(pMem, pZh)))

                mstore(add(add(mIn, 64), 32), mod(sub(qf, mload(add(add(mIn, 64), 32))), qf))
                mstore(add(mIn, 160), mod(sub(qf, mload(add(mIn, 160))), qf))
                g1_acc(_pD, mIn)
                g1_acc(_pD, add(mIn, 64))
                g1_acc(_pD, add(mIn, 128))
            }
            
            function calculateF(pMem) {
                let p := add(pMem, pF)

                g1_set(p, add(pMem, pD))
                g1_mulAccC(p, calldataload(pA), calldataload(add(pA, 32)), mload(add(pMem, pV1)))
                g1_mulAccC(p, calldataload(pB), calldataload(add(pB, 32)), mload(add(pMem, pV2)))
                g1_mulAccC(p, calldataload(pC), calldataload(add(pC, 32)), mload(add(pMem, pV3)))
                g1_mulAccC(p, S1x, S1y, mload(add(pMem, pV4)))
                g1_mulAccC(p, S2x, S2y, mload(add(pMem, pV5)))
            }
            
            function calculateE(pMem) {
                let s := mod(sub(q, mload(add(pMem, pEval_r0))), q)

                s := addmod(s, mulmod(calldataload(pEval_a),  mload(add(pMem, pV1)), q), q)
                s := addmod(s, mulmod(calldataload(pEval_b),  mload(add(pMem, pV2)), q), q)
                s := addmod(s, mulmod(calldataload(pEval_c),  mload(add(pMem, pV3)), q), q)
                s := addmod(s, mulmod(calldataload(pEval_s1), mload(add(pMem, pV4)), q), q)
                s := addmod(s, mulmod(calldataload(pEval_s2), mload(add(pMem, pV5)), q), q)
                s := addmod(s, mulmod(calldataload(pEval_zw), mload(add(pMem, pU)),  q), q)

                g1_mulSetC(add(pMem, pE), G1x, G1y, s)
            }
            
            function checkPairing(pMem) -> isOk {
                let mIn := mload(0x40)
                mstore(0x40, add(mIn, 576)) // [0..383] = pairing data, [384..447] = pWxi, [448..512] = pWxiw

                let _pWxi := add(mIn, 384)
                let _pWxiw := add(mIn, 448)
                let _aux := add(mIn, 512)

                g1_calldataSet(_pWxi, pWxi)
                g1_calldataSet(_pWxiw, pWxiw)

                // A1
                g1_mulSet(mIn, _pWxiw, mload(add(pMem, pU)))
                g1_acc(mIn, _pWxi)
                mstore(add(mIn, 32), mod(sub(qf, mload(add(mIn, 32))), qf))

                // [X]_2
                mstore(add(mIn,64), X2x2)
                mstore(add(mIn,96), X2x1)
                mstore(add(mIn,128), X2y2)
                mstore(add(mIn,160), X2y1)

                // B1
                g1_mulSet(add(mIn, 192), _pWxi, mload(add(pMem, pXi)))

                let s := mulmod(mload(add(pMem, pU)), mload(add(pMem, pXi)), q)
                s := mulmod(s, w1, q)
                g1_mulSet(_aux, _pWxiw, s)
                g1_acc(add(mIn, 192), _aux)
                g1_acc(add(mIn, 192), add(pMem, pF))
                mstore(add(pMem, add(pE, 32)), mod(sub(qf, mload(add(pMem, add(pE, 32)))), qf))
                g1_acc(add(mIn, 192), add(pMem, pE))

                // [1]_2
                mstore(add(mIn,256), G2x2)
                mstore(add(mIn,288), G2x1)
                mstore(add(mIn,320), G2y2)
                mstore(add(mIn,352), G2y1)
                
                let success := staticcall(sub(gas(), 2000), 8, mIn, 384, mIn, 0x20)
                
                isOk := and(success, mload(mIn))
            }
            
            let pMem := mload(0x40)
            mstore(0x40, add(pMem, lastMem))
            
            checkInput()
            calculateChallenges(pMem, _pubSignals)
            calculateLagrange(pMem)
            calculatePI(pMem, _pubSignals)
            calculateR0(pMem)
            calculateD(pMem)
            calculateF(pMem)
            calculateE(pMem)
            let isValid := checkPairing(pMem)
   
            mstore(0x40, sub(pMem, lastMem))
            mstore(0, isValid)
            return(0,0x20)
        }
        
    }
	function factor (uint256 n,uint256[24] calldata proof) public
	{
		for(uint i = 0; i < proofs.length; i++){
			require(compareProof(proof,proofs[i]));
		}
		require(this.verifyProof(proof, [n]));
		proofs.push(proof);
	}
	function compareProof(uint256[24] memory first, uint256[24] memory second) internal pure returns (bool) {
		bytes32 hash1 = keccak256(abi.encodePacked(first));
		bytes32 hash2 = keccak256(abi.encodePacked(second));
		return hash1 != hash2;
	}
}

```

### Circom generation

```shell
# compile
circom multiplier2.circom --r1cs --wasm --sym
# generate witness
cd multiplier2_js
cat <<EOT > input.json
{"a": 3, "b": 11}
EOT
node generate_witness.js multiplier2.wasm input.json witness.wtns
cp witness.wtns ../
# power of tau
cd ..
snarkjs powersoftau new bn128 12 pot12_0000.ptau -v
snarkjs powersoftau contribute pot12_0000.ptau pot12_0001.ptau --name="First contribution" -v
# phase2
snarkjs powersoftau prepare phase2 pot12_0001.ptau pot12_final.ptau -v
snarkjs plonk setup multiplier2.r1cs pot12_final.ptau multiplier2_0000.zkey
snarkjs zkey export verificationkey multiplier2_0000.zkey verification_key.json
# generate the proof
snarkjs plonk prove multiplier2_0000.zkey witness.wtns proof.json public.json
# verify the proof
snarkjs plonk verify verification_key.json public.json proof.json
# verify from smart contract
snarkjs zkey export solidityverifier multiplier2_0000.zkey verifier.sol
snarkjs generatecall
```
