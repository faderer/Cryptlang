pragma solidity ^0.8.18;
library Pedersen {
    function modExp(uint256 base, uint256 exponent, uint256 modulus) internal view returns (uint256 result) {
        assembly {
            let memPtr := mload(0x40)
            mstore(memPtr, 0x20)
            mstore(add(memPtr, 0x20), 0x20)
            mstore(add(memPtr, 0x40), 0x20)
            mstore(add(memPtr, 0x60), base)
            mstore(add(memPtr, 0x80), exponent)
            mstore(add(memPtr, 0xa0), modulus)

            let success := staticcall(gas(), 0x05, memPtr, 0xc0, memPtr, 0x20)
            switch success
            case 0 {
                revert(0x0, 0x0)
            } default {
                result := mload(memPtr)
            }
        }
    }
}
contract verifyTransaction {
	using Pedersen for uint256;
	function verifyMerkleProof (uint256 commitment,uint256 value, uint256 randomness) public view
	{
		uint256 q = 21888242871839275222246405745257275088548364400416034343698204186575808495617;
		uint256 g = 7;
		uint256 h = uint256(sha256(abi.encodePacked(randomness)));
		uint256 c = (Pedersen.modExp(g, value, q) * Pedersen.modExp(h, randomness, q)) % q;
		require(commitment == c);
	}
}
