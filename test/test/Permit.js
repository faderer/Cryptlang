const {
    time,
    loadFixture,
} = require("@nomicfoundation/hardhat-toolbox/network-helpers");
const crypto = require('crypto'); 
const { anyValue } = require("@nomicfoundation/hardhat-chai-matchers/withArgs");
const { expect } = require("chai");
const { AbiCoder,Wallet,Signature } = require("ethers");
const { ethers,network,hre  } = require("hardhat");
const CryptoJS = require('crypto-js');
const elliptic = require('elliptic');
const { privateToAddress, ecsign, toRpcSig, ecrecover, EthereumjsUtil  } = require('ethereumjs-util');
const web3 = require('web3');
const ecdsa = require('ecdsa');

describe("Permit", function() {
    async function deployPermitFixture(){
        const ONE_YEAR_IN_SECS = 365 * 24 * 60 * 60;
        const ONE_GWEI = 1_000_000_000;
        const Permit = await ethers.getContractFactory("ERC20Permit");
        const permit = await Permit.deploy();
        return { permit, ONE_YEAR_IN_SECS, ONE_GWEI };
    }
    describe("permit", function(){
        it("Shouldn't fail if upload the right value", async function () {
            const { permit, ONE_YEAR_IN_SECS, ONE_GWEI } = await loadFixture(
                deployPermitFixture
            );
            const owner = ethers.Wallet.createRandom();
            const spender = ethers.Wallet.createRandom();
            const deadline = (await time.latest()) + ONE_YEAR_IN_SECS;
            const value = ONE_GWEI;
            const nonce = await permit.nonces(owner.address);
            const TYPEHASH = await permit.TYPEHASH();
            const DOMAIN_SEPARATOR = await permit.DOMAIN_SEPARATOR();
            const digest = ethers.solidityPackedKeccak256(["bytes32", "address", "address", "uint256", "uint256", "uint256"], [TYPEHASH, owner.address, spender.address, value, nonce, deadline]);
            const hash = ethers.solidityPackedKeccak256(["string", "bytes32", "bytes32"], ["\x19\x01", DOMAIN_SEPARATOR, digest]);
            const signature = ecsign(Buffer.from(hash.slice(2), "hex"), Buffer.from(owner.privateKey.slice(2), "hex"));
            await expect(permit._mint(owner.address,value)).to.not.be.reverted;
            await expect(permit.permit(owner,spender,value,deadline,signature.v,signature.r,signature.s)).to.not.be.reverted;
        });
    });
});