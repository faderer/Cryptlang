const {
    loadFixture,
} = require("@nomicfoundation/hardhat-toolbox/network-helpers");
const { expect } = require("chai");
const { ethers } = require("hardhat");
const { MerkleTree } = require('merkletreejs');
const CryptoJS = require('crypto-js');


describe("Search", function() {
    async function deploySearchFixture(){
        // create leaves
        // CryptoJS.SHA256(x) => sha256(abi.encodePacked(x))
        const leaves = ['a', 'b', 'c'].map(x => CryptoJS.SHA256(x));
        // create merkle tree
        // sort: true is required for the contract to accept the proof
        const tree = new MerkleTree(leaves, CryptoJS.SHA256, { sort: true });
        // get the root, leaf and proof
        // the contract expects hex strings
        const root = tree.getHexRoot();
        // except for wordArray, string also works
        const leaf = CryptoJS.SHA256('a'); // leaf is array of 32 bytes
        const proof = tree.getHexProof(leaf);
        const _leaf = "0x" + CryptoJS.SHA256('a').toString(); // _leaf is bytes32
        // deploy the contract
        const Search = await ethers.getContractFactory("Search");
        // root is pre-committed to the contract
        const search = await Search.deploy(root);
        const SearchREF = await ethers.getContractFactory("SearchREF");
        const searchref = await SearchREF.deploy();
        return { search,searchref,root,_leaf,proof };
    }
    describe("search", function(){
        it("Shouldn't fail if upload the right value", async function () {
            const { search,_leaf,proof } = await loadFixture(
                deploySearchFixture
            );
            // 'a' is the image of the _leaf to reveal'
            const image = 'a';
            await expect(search.search(image,proof)).to.not.be.reverted;
        });
    });
    describe("searchref", function(){
        it("Shouldn't fail if upload the right value", async function () {
            const { searchref,root,_leaf,proof } = await loadFixture(
                deploySearchFixture
            );
            // 'a' is the image of the _leaf to reveal'
            const image = 'a';
            await expect(searchref.searchref(root,_leaf,proof)).to.not.be.reverted;
        });
    });
    // add the test for the keccak256
});

