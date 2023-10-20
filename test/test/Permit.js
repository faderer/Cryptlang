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
const elliptic = require('elliptic');
const { privateToAddress, ecsign, toRpcSig, ecrecover } = require('ethereumjs-util');

describe("Permit", function() {
    async function deployPermitFixture(){
        const curve = new elliptic.ec('secp256k1');
        const ONE_YEAR_IN_SECS = 365 * 24 * 60 * 60;

        const [owner, spender] = await ethers.getSigners();
        const deadline = (await time.latest()) + ONE_YEAR_IN_SECS;

        for (const account of accounts) {
          console.log("Address:", account.address);
          console.log("Private Key:", account.privateKey);
        }

        // 生成一个私钥
        const privateKey = 'a1b2c3...'; // 替换为你自己的私钥

        // 创建一个消息（Buffer）
        const message = Buffer.from('Hello, World!', 'utf8');

        // 从私钥生成公钥
        const keyPair = curve.keyFromPrivate(privateKey);
        const publicKey = keyPair.getPublic();

        // 生成签名
        const signature = ecsign(message, Buffer.from(privateKey, 'hex'));

        // 将签名转化为RPC格式
        const rpcSignature = toRpcSig(signature.v, signature.r, signature.s);

        console.log('ECDSA Signature:', rpcSignature);

        // 验证签名
        const publicKeyBytes = publicKey.encode('array', true);
        const isValid = ecrecover(message, signature.v, signature.r, signature.s) === publicKeyBytes;

        console.log('Signature Verification:', isValid);
        const Permit = await ethers.getContractFactory("Permit");
        const permit = await Permit.deploy();
        return { permit };
    }
    describe("permit", function(){
        it("Shouldn't fail if upload the right value", async function () {
            const { permit } = await loadFixture(
                deployPermitFixture
            );
            await expect(permit.permit()).to.not.be.reverted;
        });
    });
});