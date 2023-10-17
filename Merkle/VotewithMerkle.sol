pragma solidity ^0.8.18;
import { Vote } from "./Vote.sol" ;
contract VotewithMerkle is Vote {
	function count (bytes32 _leaf,bytes32 leaf, bytes32[] memory proof) public
	{
		bytes32 computedHash = keccak256(abi.encodePacked(leaf));
		for(uint256 i = 0; i < proof.length; i++){
			if(computedHash < proof[i]){
				computedHash = sha256(abi.encodePacked(computedHash, proof[i]));
			}
			else{
				computedHash = sha256(abi.encodePacked(proof[i], computedHash));
			}
		}
		require(_leaf == computedHash, "Invalid Commit!");
		_count(_leaf);
	}
}
