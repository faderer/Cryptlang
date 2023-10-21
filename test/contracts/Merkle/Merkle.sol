// SPDX-License-Identifier: GPL-3.0-or-later
pragma solidity ^0.8.18;
contract Search {
	bytes32 public rootHash;
	constructor(bytes32 _rootHash) {
		rootHash = _rootHash;
	}
	function search (string memory _leaf,bytes32[] memory proof) public view
	{
		bytes32 computedHash = sha256(abi.encodePacked(_leaf));
		for(uint256 i = 0; i < proof.length; i++){
			if(computedHash < proof[i]){
				computedHash = sha256(abi.encodePacked(computedHash, proof[i]));
			}
			else{
				computedHash = sha256(abi.encodePacked(proof[i], computedHash));
			}
		}
		require(rootHash == computedHash, "Invalid Commit!");
	}
}
