# Cryptlang

## Introduction

Ethereum is a leading platform for emerging cryptography-related applications, e.g., digital signatures, commitment, and zero-knowledge proofs (ZKP).
As of the Shanghai upgrade, Ethereum offers eight precompiled contracts that act as built-in crypto APIs for developers to manage cryptographic tasks.

## Motivation

Developers still struggle with the complex cryptographic task with the aforementioned APIs for the following reasons:
- Developers may not possess the requisite cryptographic expertise, the native crypto APIs are deemed excessively low-level for their practical utilization. 
- The Low-level cryptographic APIs often prove insufficient in capability, thereby posing a challenge for developers when integrating them into more complex high-level tasks.
- Developers are prone to errors when employing low-level cryptographic APIs, potentially leading to exploitable vulnerabilities.

## Related Work

- The previous studies primarily focus on templates or code generators geared for single-task purposes.
- Developers face challenges in modifying the code when they lack a comprehensive understanding of the template.
- The functionality of the existing tools falls short of meeting the specific demands posed by the aforementioned cryptographic tasks.

## This Work

- We introduce Cryptlang, a domain-specific language designed for handling high-level cryptographic tasks with unified structures.
- We present a Cryptlang compiler that translates Cryptlang code into Solidity automatically.
- We ensure the inherent security of the generated code by leveraging standard cryptographic templates.
- We evaluate Cryptlang through six case studies focusing on the cryptographic tasks that commonly occur in Ethereum.

### 哈希

In Ethereum, hash functions are widely employed in various scenarios, including data integrity verification, smart contract address generation, encryption, and security. Commonly used hash functions in Ethereum include SHA3 (keccak256), SHA2(sha256), and RIPEMD (ripemd160). They can all be implemented directly through Ethereum's native cryptographic interfaces. Keccak256 can be achieved by invoking Ethereum opcodes, while sha256 and ripemd160 can be implemented by calling Ethereum's built-in precompiled contracts.

### 签名验证

Signature verification is a common application in Ethereum for identity authentication, security, and trust. Ethereum primarily uses the ECDSA signature scheme. Ethereum's first precompiled contract was the ECDSA signature verification precompiled contract on the secp256k1 curve. By calling this contract, one can recover the address associated with the signer's public key, thereby verifying the validity of the signature. However, ECDSA cannot aggregate signatures, while BLS signatures can. BLS signature aggregation reduces transaction size and cost. Ethereum is working on adding pairing precompiled contracts for the BLS-12-381 curve in future upgrades.

### 承诺
Commitment is an essential concept in cryptography that allows a value to be hidden while ensuring it cannot be tampered with. Commitments find applications in zero-knowledge proofs, verifiable computations, verifiable random functions, and more. Common commitment protocols on the blockchain include Pedersen commitments and Merkle commitments. Pedersen commitments are based on discrete logarithms and can be implemented by invoking Ethereum's modExp precompiled contract. Merkle commitments, on the other hand, are based on hash functions and can also be implemented through Ethereum's precompiled contracts.

### 零知识证明
Zero-knowledge proofs are a fundamental concept in cryptography, allowing one to prove the truth of a statement without revealing any information about the statement itself. Zero-knowledge proofs find applications in privacy protection, verifiable computations, verifiable random functions, and more. Common zero-knowledge proof protocols on the blockchain include Groth16 and Plonk. Groth16 is a pairing-based zero-knowledge proof scheme and can be implemented by invoking Ethereum's related pairing precompiled contracts. Plonk, on the other hand, is a polynomial-based zero-knowledge proof scheme and can also be implemented through Ethereum's precompiled contracts.

## 安装

### 依赖
如果是Ubuntu系统，可以通过以下命令安装依赖：
```bash
sudo apt-get install default-jdk-headless git build-essential cmake libgmp-dev pkg-config libssl-dev libboost-dev libboost-program-options-dev
```
因为本项目需要安装python3.8及以上版本。另外，本项目使用了antlr4作为语法解析器，因此需要安装antlr4的python3运行时库。安装方法如下：
```bash
pip3 install antlr4-python3-runtime
```

### 安装
可以通过以下命令安装Cryptlang：
```bash
git clone https://github.com/faderer/Cryptlang.git
cd Cryptlang
pip3 install -e .
```
我们还需要安装zokrates，circom和snarkjs，这些工具可以用于生成零知识证明的证明和验证密钥。安装方法如下：
#### zokrates
```bash
git clone https://github.com/ZoKrates/ZoKrates
cd ZoKrates
export ZOKRATES_STDLIB=$PWD/zokrates_stdlib/stdlib
cargo build -p zokrates_cli --release
cd target/release
sudo cp zokrates /usr/local/bin
```
#### circom
```bash
git clone https://github.com/iden3/circom.git
cargo build --release
cargo install --path circom
npm install -g snarkjs
```

## 语法
![](Docs/syntax.png)
```g4
statementSymbol
  : '@' ;

hashMethod
  : 'SHA3' | 'SHA2' | 'RIPEMD' ;

signatureMethod
  : 'ECDSA' | 'BLS' ;

commitmentMethod
  : 'Pedersen' | 'Merkle' ;

proofMethod
  : 'Groth16' | 'PLONK' ;

signatureStatement
  : statementSymbol signatureMethod ('with' hashMethod)? '(' (identifier? ',')* identifier? ',' primaryExpression? ')';

commitmentStatement
  : statementSymbol commitmentMethod ('with' hashMethod)? '(' (identifier? ',')* identifier? ')';

// momentarily, we only support one zok file address as primaryExpression.
proofStatement
  // : statementSymbol proofMethod 'with' primaryExpression '(' privateIdentifierList ')';
  : statementSymbol proofMethod ('with' hashMethod)? '(' (identifier? ',')* identifier? ',' primaryExpression? ')';

taskStatement
  : (signatureStatement | commitmentStatement | proofStatement) ';' ;

otherStatement
  : .+? ';' ;
```

The provided code is Cryptlang's g4 code, which extends Solidity to support cryptographic functionalities. Here's a description of the code:

Firstly, it introduces two special symbols:

1. "@": The starting identifier for Cryptlang's syntax, indicating that the user is preparing to enable Cryptlang's cryptographic capabilities.
2. "#": A symbol specifically designed for Cryptlang's zero-knowledge proof methods. Users need to prefix the symbol "#" to distinguish privacy inputs from public inputs in zero-knowledge proofs.

Next, it defines four cryptographic methods:

1. Hash: This includes SHA3-256 (corresponding to Solidity's keccak256), SHA2-256 (corresponding to Solidity's sha256), and RIPEMD160 (corresponding to Solidity's ripemd160).
2. Signature: This includes signature verification for both ECDSA and BLS.
3. Commitment: This includes Pedersen commitments and Merkle commitments.
4. Zero-Knowledge Proof: This includes Groth16 proofs and PLONK proofs, both of which are based on zk-SNARK protocols.

Finally, it provides the representation of cryptographic tasks in Cryptlang, which includes three types of tasks:

1. Signature Verification: It requires specifying the signature method (ECDSA or BLS), optionally selecting a hash method (SHA3-256, SHA2-256, or RIPEMD160), and then providing the signer's address and all the parameters that were signed, in order.
2. Commitment Verification: This task involves specifying the commitment method (Pedersen or Merkle), optionally selecting a hash method (SHA3-256, SHA2-256, or RIPEMD160), and providing the commitment values using an input function.
3. Zero-Knowledge Proof Verification: It necessitates specifying the proof method (Groth16 or PLONK), optionally selecting a hash method (SHA3-256, SHA2-256, or RIPEMD160), and then sequentially entering the public inputs and private inputs.

This DSL (Domain-Specific Language) extends Solidity, making it easier to work with cryptographic tasks.

## 区块链与民生
区块链、密码学和民生之间存在密切的关系。密码学是区块链技术的核心组成部分，它为区块链提供了安全性、隐私保护和访问控制等关键特征，从而影响到民生的多个方面：

### 签名与访问控制
通过数字签名可以实现区块链上的访问控制，确保只有授权的用户能够访问特定的区块链资源或执行特定操作。这可以在民生领域中用于访问医疗记录等敏感信息，以下是通过签名实现区块链上授权医疗访问的基本步骤：

1. 授权医疗访问概述：患者可以使用签名的方式向医疗专业人员授权访问特定的医疗数据，以便他们能够提供准确的诊断和治疗建议。这确保了医疗专业人员只能访问被授权的数据，保护了其他敏感信息的隐私。

2. 数字签名生成： 当用户想要访问某个资源或执行某个操作时，他们使用自己的私钥生成数字签名。数字签名基于用户的身份（签名的地址）和要访问的资源信息（一年内在北京大学口腔医院的所有就诊数据），是用户身份的验证标志。

3. 请求提交： 用户将访问请求以及生成的数字签名提交到区块链网络中。

4. 验证和授权： 区块链网络中的节点接收用户的访问请求，使用相应的公钥对数字签名进行解密和验证。如果验证通过，智能合约会判断用户是否有访问权限，如果有，就执行相应的操作，否则拒绝访问请求。

Cryptlang帮助医院等医疗记录存储机构快速生成验证签名并提供医疗记录的合约，具体代码如下图所示：

```solidity
// Cryptlang
contract MedicalRecord {
	function permit(address _owner, address _hospital, uint256 _year) public {
		@ECDSA with SHA3-256 (_owner, _hospital, _year);
		_search(_owner, _hospital, _year);
} ... }
// Solidity
library ECDSA { ... }
contract MedicalRecord {
	using ECDSA for bytes32;
	mapping(address => uint256) public nonce;
	function permit (address _owner, address _hospital, uint256 _year, bytes memory sig) public
	{
		bytes32 hash = keccak256(abi.encodePacked(_owner, _hospital, _year, nonce[_owner], address(this)));
		address signer = ECDSA.recover(hash, sig);
		require(signer == _owner, "MedicalRecord: invalid signature");
		nonce[_owner]++;
		_search(_owner, _hospital, _year);
} ... }
```

Cryptlang的大部分用法和功能都与Solidity类似，只有用到“@”操作符时才真正使用到Cryptlang的功能。建议在编写Cryptlang程序时，使用的函数变量名以“_”开头，以便与代码生成后新添加的变量进行区分。

上述代码中，合约名为MedicalRecord即医疗记录，函数名为permit即授权（患者可以通过签名的方式，将自己的医疗记录的查询权限授权给医生），函数的三个变量为_owner（患者的地址），_hospital（患者曾就诊的医院），_year（患者授权的记录年限）。

“@ECDSA with SHA3-256”表示，生成ECDSA签名的验证合约，合约中所有的哈希方案为keccak256。签名者的验证地址默认为第一个变量_owner，后续的两个变量_hospital, _year为签名的内容信息。

“_search”函数用于查找_owner患者在_hospital医院的_year年内的医疗记录。

通过编译器自动生成的Solidity是一个可以直接部署在以太坊上的签名验证与记录查询合约。

编译器会生成ECDSA签名库，以及原有合约名的MedicalRecord合约。此外，还会生成一个mapping类型的nonce，即为每个签名者单独存储一个随机数用于防止重放攻击。

编译器会在permit函数的参数列表中，多加入一个sig变量用于表示输入的签名。hash除了包括必须的签名内容（_owner, _hospital, _year）之外还加入了nonce[_owner]和address(this)，即随机数和合约本身的地址，用于防止重放攻击。之后会对恢复出的签名地址与签名者地址进行比较，若验证成功则正常调用_search函数对用户医疗记录进行查找，若验证失败则报错。

### 承诺协议与投票
利用承诺协议可以在区块链上实现安全、私密和可信的投票过程。以下是利用承诺协议进行链上投票的基本思想和步骤：

1. 承诺协议概述：
承诺协议是一种加密技术，允许参与者在不泄露真实数据的情况下，证明某种情况下的数据或行为。在投票场景中，承诺协议可以用来确保投票者的投票是私密的，同时也能在需要时证明其投票的有效性。

2. 投票过程：
假设有一个需要投票的议题，参与者可以按以下步骤进行投票：

- 投票生成： 每位投票者将自己的投票选择加密成一个承诺。这个承诺不会明确透露投票的具体内容，但确保了投票者不能后续否认自己的投票选择。

- 承诺提交： 投票者将生成的承诺提交到区块链上。

- 投票验证： 在投票截止后，可以使用承诺协议的技术解密承诺，验证每个投票者的投票是否与其生成的承诺相匹配。

Cryptlang帮助政府等选举机构快速生成验证承诺并进行投票统计的合约，具体代码如下图所示：

```solidity
// Cryptlang
contract Vote {
	function count(bytes32 _leaf) public pure {
        @Merkle with SHA2-256(_leaf);
        _count(_leaf);
} ... }
// Solidity
contract Vote {
    mapping(bytes32 => uint256) public nonce;
	function count(bytes32 _leaf, bytes32 root, bytes32[] memory proof) public pure{
		bytes32 computedHash = keccak256(abi.encodePacked(_leaf));
		for(uint256 i = 0; i < proof.length; i++){
			if(computedHash < proof[i]){
				computedHash = sha256(abi.encodePacked(computedHash, proof[i]));
			}
			else{
				computedHash = sha256(abi.encodePacked(proof[i], computedHash));
			}
		}
		require(root == computedHash && nonce[_leaf] == 0, "Vote: invalid proof");
        nonce[_leaf]++;
        _count(_leaf);
} ... }
```

对于用户编写的Cryptlang合约，Vote为投票合约，count为投票统计函数，其中_leaf为承诺的哈希原像，当通过“@Merkle with SHA2-256”所生成的Merkle承诺验证后，就可以保证哈希原像的真实性，因而可以调用_count函数进行后续的投票统计操作。

对于自动生成的Solidity合约，编译器会自动生成一个mapping类型的nonce，即为每个_leaf单独存储一个随机数用于防止重放攻击。count函数加入了root和proof参数，即用户还需输入merkle tree的根哈希和证明才能对特定的_leaf进行验证。接下来是自动生成的Merkle承诺验证算法，其中包括了Merkle树的构建和验证过程。若验证成功，则调用_count函数进行投票统计，否则报错。

### 零知识证明与医疗隐私保护
医疗数据包含敏感的个人健康信息，同时需要与医疗专业人员和机构共享，以提供准确的医疗服务。利用零知识证明和区块链技术，可以实现以下医疗隐私保护的应用：

隐私保护的医疗数据共享： 零知识证明可以使患者能够将医疗数据安全地共享给医疗专业人员或研究机构，而不必透露具体的细节。患者可以证明某些健康信息的真实性，如某种疾病的确诊，而不需要透露整个病历。

Cryptlang帮助医院等医疗机构快速生成零知识证明验证并提供隐私医疗数据共享的合约，具体代码如下图所示：

```solidity
// Cryptlang
contract MedicalData {
    function share(uint256 _n) public {
        @Groth16 with "factor.zok"(#a, #b, _n);
        _share(_n);
} ... }
// Solidity
library Pairing { ... }
contract MedicalData {
    using Pairing for *;
	Proof[] public proofs;
    function share (uint256 _n, Proof memory proof) public{
		for(uint i = 0; i < proofs.length; i++){
			require(compareProof(proof,proofs[i]));
		}
		require(verifyTx(proof, [n]));
		proofs.push(proof);
        _share(_n);
} ... }
```
