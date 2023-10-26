// SPDX-License-Identifier: GPL-3.0-or-later
pragma solidity ^0.8.20;

import {MerkleProof} from "@openzeppelin/contracts/utils/cryptography/MerkleProof.sol";
import {Distributor} from "./Distributor.sol";

contract MerkleDistributor is Distributor {
    bytes32 public merkleRoot;

    constructor(bytes32 merkleRoot_) {
        merkleRoot = merkleRoot_;
    }
    
    function claim(uint256 index, address account, uint256 amount, bytes32[] calldata merkleProof)
        public
        virtual
    {
        require(!isClaimed(index), "Already Claimed!");

        // Verify the merkle proof.
        bytes32 node = keccak256(abi.encodePacked(index, account, amount));
        require(MerkleProof.verify(merkleProof, merkleRoot, node), "Invalid MerkleProof!");

        // Mark it claimed and send the token.
        _setClaimed(index);
        transfer(account, amount);
    }
}