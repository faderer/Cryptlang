const {
    time,
    loadFixture,
} = require("@nomicfoundation/hardhat-toolbox/network-helpers");
const crypto = require('crypto'); 
const { anyValue } = require("@nomicfoundation/hardhat-chai-matchers/withArgs");
const { expect } = require("chai");
const { ethers } = require("ethers");


describe("Vote", function() {
    async function deployVoteFixture(){
        const abi = ethers.utils.defaultAbiCoder;
        const randomBuffer = crypto.randomBytes(32);
        const randomness = BigInt('0x' + randomBuffer.toString('hex'));
        console.log(randomness);
        const _randomness = abi.encode(["uint256"], [randomness]);
        console.log(_randomness);
        const value = 1;
        const q = 21888242871839275222246405745257275088548364400416034343698204186575808495617n;
        const g = 7;
        const _h = "0x" + crypto.createHash('sha256').update(_randomness).digest('hex');
        const h = ethers.BigNumber.from(_h);
        const c = crypto.modmul(crypto.modPow(g, value, q),crypto.modPow(h, randomness, q),q);
        const Vote = await ethers.getContractFactory("Vote");
        const vote = await Vote.deploy();
        return { vote, randomness, value, c };
    }
    describe("revealVote", function(){
        it("Shouldn't fail if upload the right value", async function () {
            const { vote, randomness, value, c } = await loadFixture(
                deployVoteFixture
            );
            await expect(vote.commitTo(c),vote.revealVote(value,randomness)).not.to.be.reverted;
        });
    });
});

