const {
    loadFixture,
} = require("@nomicfoundation/hardhat-toolbox/network-helpers");
const { expect } = require("chai");
const { ethers } = require("hardhat");
const { MerkleTree } = require('merkletreejs');
const { Wallet, AbiCoder } = require("ethers");
const keccak256 = require('keccak256')

describe("Search", function() {
    async function deploySearchFixture(){
        const wallet0 = ethers.Wallet.createRandom();
        const wallet1 = ethers.Wallet.createRandom();
        const images = [
            { account: wallet0.address, amount: 100n },
            { account: wallet1.address, amount: 101n },
          ]
        const leaves = [
            { account: wallet0.address, amount: 100n },
            { account: wallet1.address, amount: 101n },
          ].map((item,index) => ethers.solidityPackedKeccak256(['uint256', 'address', 'uint256'], [index,item.account,item.amount]))
        const tree = new MerkleTree(leaves, keccak256, { sort: true });
        const root = tree.getHexRoot()
        const leaf = ethers.solidityPackedKeccak256(['uint256', 'address', 'uint256'], [0,images[0].account,images[0].amount])
        const proof = tree.getHexProof(leaf)

        // deploy the contract
        const tokenFactory = await ethers.getContractFactory("TestERC20");
        const token0 = await tokenFactory.deploy('Token0', 'TKN0', 0)
        const token1 = await tokenFactory.deploy('Token1', 'TKN1', 0)

        const MerkleDistributor = await ethers.getContractFactory("MerkleDistributor");
        const merkledistributor = await MerkleDistributor.deploy(root);

        const MerkleDistributorREF = await ethers.getContractFactory("MerkleDistributorREF");
        const merkledistributorref = await MerkleDistributorREF.deploy(token1.target, root);

        await merkledistributor.setToken(token0.target)
        await token0.setBalance(merkledistributor.target, 201)
        await token1.setBalance(merkledistributorref.target, 201)

        return { merkledistributor,merkledistributorref,root,images,proof };
    }
    describe("claim", function(){
        it("Shouldn't fail if upload the right value", async function () {
            const { merkledistributor,images,proof } = await loadFixture(
                deploySearchFixture
            );
            await expect(merkledistributor.claim(0,images[0].account,images[0].amount,proof)).not.to.be.reverted;
        });
        it("Shouldn't fail if upload the right value", async function () {
            const { merkledistributorref,images,proof } = await loadFixture(
                deploySearchFixture
            );
            await expect(merkledistributorref.claim(0,images[0].account,images[0].amount,proof))
            .to.emit(merkledistributorref, 'Claimed')
            .withArgs(0,images[0].account,images[0].amount)
        });
    });
});