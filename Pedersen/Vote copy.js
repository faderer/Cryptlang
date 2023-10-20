const {
    time,
    loadFixture,
} = require("@nomicfoundation/hardhat-toolbox/network-helpers");
const crypto = require('crypto'); 
const { anyValue } = require("@nomicfoundation/hardhat-chai-matchers/withArgs");
const { expect } = require("chai");
const { ethers, upgrades } = require('hardhat');


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
        const abi = ethers.utils.defaultAbiCoder;
        const randomBuffer = crypto.randomBytes(32);
        const randomness = BigInt('0x' + randomBuffer.toString('hex'));
        console.log(randomness);
        const _randomness = abi.encode(["uint256"], [randomness]);
        console.log(_randomness);
        const value = 1n;
        const q = 21888242871839275222246405745257275088548364400416034343698204186575808495617n;
        const g = 7n;
        const _h = "0x" + crypto.createHash('sha256').update(_randomness).digest('hex');
        const bignumber = ethers.BigNumber.from(_h);
        const h = BigInt(bignumber.toString());
        const c = modmul(modPow(g, value, q),modPow(h, randomness, q),q);
        const Vote = await ethers.getContractFactory("Vote");
        const vote = await upgrades.deployProxy(Vote);
        await vote.deployed();
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

