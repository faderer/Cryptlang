pragma solidity ^0.8.18;
contract verifyTransaction {
	function verifyMerkleProof (bytes32 _root,bytes32 leaf, bytes32[] memory proof) public pure
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
		require(_root == computedHash);
	}
}
