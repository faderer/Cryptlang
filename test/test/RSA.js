const {
    time,
    loadFixture,
} = require("@nomicfoundation/hardhat-toolbox/network-helpers");
const { expect } = require("chai");
const { ethers } = require("hardhat");
const KJUR = require('jsrsasign');
const { AbiCoder } = require("ethers");
const CryptoJS = require('crypto-js');

describe("RSA", function() {
    async function deployPermitFixture(){
        // deploy the contract
        // the library better not use external calls
        const RSAVer = await ethers.getContractFactory("RSAVer");
        const rsaver = await RSAVer.deploy();
        const RSAVerREF = await ethers.getContractFactory("RSAVerREF");
        const rsaverref = await RSAVerREF.deploy();

        // message to be signed
        const ONE_YEAR_IN_SECS = 365 * 24 * 60 * 60;
        const ONE_GWEI = 1_000_000_000;
        const owner = ethers.Wallet.createRandom();
        const spender = ethers.Wallet.createRandom();
        const deadline = (await time.latest()) + ONE_YEAR_IN_SECS;
        const value = ONE_GWEI;
        const nonce = await rsaver.nonces(owner.address);
        const TYPEHASH = await rsaver.TYPEHASH();
        const DOMAIN_SEPARATOR = await rsaver.DOMAIN_SEPARATOR();

        // CryptoJS.enc.Hex.parse(AbiCoder.defaultAbiCoder().encode().replace(/^0x/, '')) => abi.encode() [WordArray]
        // 'a' => abi.encodePacked('a') [String]
        // replace(/^0x/, '') used to remove the 0x prefix
        const enc_msg = AbiCoder.defaultAbiCoder().encode(["bytes32", "address", "address", "uint256", "uint256"], [TYPEHASH, owner.address, spender.address, nonce, deadline]).replace(/^0x/, '');
        
        // CryptoJS.enc.Hex.parse used to convert the hex string to a WordArray
        const sha_msg = "0x" + CryptoJS.SHA256(CryptoJS.enc.Hex.parse(enc_msg)).toString();
        const enc_sha_msg = AbiCoder.defaultAbiCoder().encode(["string", "bytes32", "bytes32"], ["\x19\x01", DOMAIN_SEPARATOR, sha_msg]).replace(/^0x/, '');
        
        // use jsrsasign to sign the message
        var key = KJUR.KEYUTIL.generateKeypair("RSA", 1024);
        var privateKey = key.prvKeyObj;
        var sig = new KJUR.crypto.Signature({ alg: "SHA256withRSA" });
        sig.init(privateKey);
        
        // update the encoded message with abi.encode, no need to parse to WordArray
        sig.updateHex(enc_sha_msg);
        
        // get the signature, module and exponent
        var signature = "0x" + sig.sign();
        const module = "0x" + key.pubKeyObj.n.toString(16);
        const exponent = "0x0" + key.pubKeyObj.e.toString(16);
        return { rsaver,rsaverref,signature,owner,spender,value,deadline,module,exponent };
    }
    describe("rsaver", function(){
        it("Shouldn't fail if upload the right value", async function () {
            const { rsaver,signature,owner,spender,deadline,module,exponent } = await loadFixture(
                deployPermitFixture
            );
            // donot include value because stack too deep
            await expect(rsaver.rsaver(owner,spender,deadline,signature,exponent,module)).to.not.be.reverted;
        });
    });
    describe("rsaver(ref)", function(){
        it("Shouldn't fail if upload the right value", async function () {
            const { rsaverref } = await loadFixture(
                deployPermitFixture
            );
            // message to be signed
            const ONE_YEAR_IN_SECS = 365 * 24 * 60 * 60;
            const ONE_GWEI = 1_000_000_000;
            const owner = ethers.Wallet.createRandom();
            const spender = ethers.Wallet.createRandom();
            const deadline = (await time.latest()) + ONE_YEAR_IN_SECS;
            const value = ONE_GWEI;
            const nonce = await rsaverref.nonces(owner.address);
            const TYPEHASH = await rsaverref.TYPEHASH();
            const DOMAIN_SEPARATOR = await rsaverref.DOMAIN_SEPARATOR();

            // CryptoJS.enc.Hex.parse(AbiCoder.defaultAbiCoder().encode().replace(/^0x/, '')) => abi.encode() [WordArray]
            // 'a' => abi.encodePacked('a') [String]
            // replace(/^0x/, '') used to remove the 0x prefix
            const enc_msg = AbiCoder.defaultAbiCoder().encode(["bytes32", "address", "address", "uint256", "uint256"], [TYPEHASH, owner.address, spender.address, nonce, deadline]).replace(/^0x/, '');
            
            // CryptoJS.enc.Hex.parse used to convert the hex string to a WordArray
            const sha_msg = "0x" + CryptoJS.SHA256(CryptoJS.enc.Hex.parse(enc_msg)).toString();
            const enc_sha_msg = AbiCoder.defaultAbiCoder().encode(["string", "bytes32", "bytes32"], ["\x19\x01", DOMAIN_SEPARATOR, sha_msg]).replace(/^0x/, '');
            
            // use jsrsasign to sign the message
            var key = KJUR.KEYUTIL.generateKeypair("RSA", 1024);
            var privateKey = key.prvKeyObj;
            var sig = new KJUR.crypto.Signature({ alg: "SHA256withRSA" });
            sig.init(privateKey);
            
            // update the encoded message with abi.encode, no need to parse to WordArray
            sig.updateHex(enc_sha_msg);
            
            // get the signature, module and exponent
            var signature = "0x" + sig.sign();
            const module = "0x" + key.pubKeyObj.n.toString(16);
            const exponent = "0x0" + key.pubKeyObj.e.toString(16);
            // donot include value because stack too deep
            await expect(rsaverref.rsaver(owner,spender,deadline,signature,exponent,module)).to.not.be.reverted;
        });
    });
});