// SPDX-License-Identifier: GPL-3.0-or-later
pragma solidity ^0.8.19;
import { Counting } from "./Counting.sol" ;
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
contract Vote is Counting {
	using Pedersen for uint256;
	mapping(address => uint256) public commit;
	function commitTo(uint256 _commitment) public {
		commit[msg.sender] = _commitment;
	}
	function revealVote (uint256 _value,uint256 randomness) public
	{
		uint256 q = 21888242871839275222246405745257275088548364400416034343698204186575808495617;
		uint256 g = 7;
		uint256 h = uint256(sha256(abi.encode(randomness)));
		uint256 c = mulmod(Pedersen.modExp(g,_value, q),Pedersen.modExp(h, randomness, q),q);
		require(commit[msg.sender] == c, "Invalid Commit!");
		_count(_value);
	}
}
