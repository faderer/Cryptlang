const {
    time,
    loadFixture,
} = require("@nomicfoundation/hardhat-toolbox/network-helpers");
const { expect } = require("chai");
const { ethers } = require("hardhat");
const { ecsign } = require('ethereumjs-util');


describe("Permit", function() {
    async function deployPermitFixture(){
        // deploy the contract
        const ONE_YEAR_IN_SECS = 365 * 24 * 60 * 60;
        const ONE_GWEI = 1_000_000_000;
        const Permit = await ethers.getContractFactory("ERC20Permit");
        const permit = await Permit.deploy();
        const PermitRef = await ethers.getContractFactory("ERC20REF");
        const permitref = await PermitRef.deploy();
        return { permit, permitref, ONE_YEAR_IN_SECS, ONE_GWEI };
    }
    describe("permit", function(){
        it("Shouldn't fail if upload the right value", async function () {
            const { permit, permitref, ONE_YEAR_IN_SECS, ONE_GWEI } = await loadFixture(
                deployPermitFixture
            );
            
            // create random wallets for signing
            const owner = ethers.Wallet.createRandom();
            const spender = ethers.Wallet.createRandom();
            
            // create other variables to be signed
            const deadline = (await time.latest()) + ONE_YEAR_IN_SECS;
            const value = ONE_GWEI;
            const nonce = await permit.nonces(owner.address);
            const TYPEHASH = await permit.TYPEHASH();
            const DOMAIN_SEPARATOR = await permit.DOMAIN_SEPARATOR();
            
            // ethers.solidityPackedKeccak256 => keccak256(abi.encodePacked())
            const digest = ethers.solidityPackedKeccak256(["bytes32", "address", "address", "uint256", "uint256", "uint256"], [TYPEHASH, owner.address, spender.address, value, nonce, deadline]);
            const hash = ethers.solidityPackedKeccak256(["string", "bytes32", "bytes32"], ["\x19\x01", DOMAIN_SEPARATOR, digest]);
            
            // sign the hash
            // Buffer.from() used to convert the hex string to a buffer
            const signature = ecsign(Buffer.from(hash.slice(2), "hex"), Buffer.from(owner.privateKey.slice(2), "hex"));
            await expect(permit._mint(owner.address,value)).to.not.be.reverted;
            await expect(permit.permit(owner,spender,value,deadline,signature.v,signature.r,signature.s)).to.not.be.reverted;
        });
    });
    describe("permit(ref)", function(){
        it("Shouldn't fail if upload the right value", async function () {
            const { permit, permitref, ONE_YEAR_IN_SECS, ONE_GWEI } = await loadFixture(
                deployPermitFixture
            );
            
            // create random wallets for signing
            const owner = ethers.Wallet.createRandom();
            const spender = ethers.Wallet.createRandom();
            
            // create other variables to be signed
            const deadline = (await time.latest()) + ONE_YEAR_IN_SECS;
            const value = ONE_GWEI;
            const nonce = await permitref.nonces(owner.address);
            const TYPEHASH = await permitref.TYPEHASH();
            const DOMAIN_SEPARATOR = await permitref.DOMAIN_SEPARATOR();
            
            // ethers.solidityPackedKeccak256 => keccak256(abi.encodePacked())
            const digest = ethers.solidityPackedKeccak256(["bytes32", "address", "address", "uint256", "uint256", "uint256"], [TYPEHASH, owner.address, spender.address, value, nonce, deadline]);
            const hash = ethers.solidityPackedKeccak256(["string", "bytes32", "bytes32"], ["\x19\x01", DOMAIN_SEPARATOR, digest]);
            
            // sign the hash
            // Buffer.from() used to convert the hex string to a buffer
            const signature = ecsign(Buffer.from(hash.slice(2), "hex"), Buffer.from(owner.privateKey.slice(2), "hex"));
            await expect(permitref._mint(owner.address,value)).to.not.be.reverted;
            await expect(permitref.permit(owner,spender,value,deadline,signature.v,signature.r,signature.s)).to.not.be.reverted;
        });
    });
});