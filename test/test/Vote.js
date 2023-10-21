const {
    time,
    loadFixture,
} = require("@nomicfoundation/hardhat-toolbox/network-helpers");
const crypto = require('crypto'); 
const { anyValue } = require("@nomicfoundation/hardhat-chai-matchers/withArgs");
const { expect } = require("chai");
const { AbiCoder } = require("ethers");
const { ethers } = require("hardhat");
const CryptoJS = require('crypto-js');

describe("Vote", function() {
    function modmul(a, b, modulus) {
        return (a * b) % modulus;
    }
    function modPow(base, exponent, modulus) {
        if (modulus === 1n) return 0n;
        let result = 1n;
        base = base % modulus;
        while (exponent > 0n) {
          if (exponent % 2n === 1n) {
            result = (result * base) % modulus;
          }
          exponent = exponent / 2n;
          base = (base * base) % modulus;
        }
        return result;
    }
    async function deployVoteFixture(){
        // generate randomness => uint256
        const randomBuffer = crypto.randomBytes(32);
        const randomness = BigInt('0x' + randomBuffer.toString('hex'));

        // encode the randomness
        // AbiCoder.defaultAbiCoder().encode => abi.encode()
        const _randomness = AbiCoder.defaultAbiCoder().encode(["uint256"], [randomness]).replace(/^0x/, '');
        
        // generate the big number
        const value = 1n;
        const q = 21888242871839275222246405745257275088548364400416034343698204186575808495617n;
        const g = 7n;
        
        // generate the pedersen commitment
        const _h = "0x" + CryptoJS.SHA256(CryptoJS.enc.Hex.parse(_randomness)).toString();
        const h = BigInt(_h);
        const c = modmul(modPow(g, value, q),modPow(h, randomness, q),q);
        
        // deploy the contract
        const Vote = await ethers.getContractFactory("Vote");
        const vote = await Vote.deploy();
        return { vote, randomness, value, c };
    }
    describe("revealVote", function(){
        it("Shouldn't fail if upload the right value", async function () {
            const { vote, randomness, value, c } = await loadFixture(
                deployVoteFixture
            );
            await expect(vote.commitTo(c)).to.not.be.reverted;
            await expect(vote.revealVote(value, randomness)).to.not.be.reverted;
        });
    });
});

