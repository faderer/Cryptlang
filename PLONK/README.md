# Cryptlang

## 概述

Cryptlang是针对以太坊使用的Solidity语言所设计的密码学领域特定语言。密码学经验不足以太坊开发者在编写智能合约时可能会遇到各种密码学相关的问题，比如不知道或不理解密码学template/api，不会或错误使用密码学template/api等。Cryptlang可以帮助密码学经验不足的开发者轻松地实现智能合约中的密码学任务。开发者只需要通过Cryptlang的语法描述密码学任务，编译器就能自动生成对应的Solidity合约。

## 背景

经相关研究调查，目前智能合约上常用的密码学任务有哈希，签名，承诺和零知识证明。然而以太坊只提供了十分有限的底层密码学接口，不熟悉的开发者难以利用这些接口去构建对应的密码学任务。Cryptlang提供了从底层密码学接口到抽象密码学任务的实现方案，下面我们将介绍上述密码学任务的背景知识以及应该由何种密码学接口进行构建。

### 哈希

在以太坊上，哈希函数被广泛应用于各种场景，包括数据完整性验证、智能合约地址生成、加密和安全性等方面。在以太坊中常用的哈希函数有SHA3-256(keccak256)，SHA2-256(sha256)和RIPEMD-160(ripemd160)。它们都可以由以太坊原生的密码学接口直接实现，keccak256可以通过调用以太坊的opcode，sha256和ripemd160可以通过调用以太坊内置的预编译合约来实现。

### 签名验证

签名验证是另一个在以太坊上的常见应用，可用于身份认证，授权和访问控制，安全性验证等等。签名验证是以太坊上保障安全性和可信性的重要机制之一，通过在交易和消息中使用数字签名，可以确保只有拥有相应私钥的用户能够执行特定操作，并防止网络中的欺诈行为。以太坊中最常用的签名方案为ECDSA，因此以太坊的第一个智能合约就是secp256k1曲线上的ECDSA签名验证预编译合约。通过调用合约，可以恢复出签名者的公钥相关联的地址，从而验证签名的有效性。然而ECDSA不能进行签名聚合，BLS签名可以进行聚合。BLS签名聚合是一种基于pairing的签名聚合方案，它可以将多个签名聚合成一个签名，从而减少交易的大小和成本。然而使用BLS签名聚合时，需要运算G_T上的乘法，目前以太坊并没有提供相应的预编译合约，但是有望在下一次升级中加入BLS-12-381曲线上的pairing预编译合约。

### 承诺
承诺是密码学中的一个重要概念，通过承诺可以将某个值隐藏起来，同时保证该值不会被篡改。承诺可以用于实现零知识证明，可验证计算，可验证随机函数等等。区块链上的常用承诺协议有Pederson承诺和Merkle承诺。Pederson承诺是一个基于离散对数的承诺方案，可以通过调用以太坊的modExp预编译合约实现。Merkle承诺是一个基于哈希函数的承诺方案，同样可以通过调用以太坊的预编译合约实现。

### 零知识证明
零知识证明是密码学中的一个重要概念，它可以用于证明某个语句的真实性，同时不泄露任何关于该语句的信息。零知识证明可以用于实现隐私保护，可验证计算，可验证随机函数等等。区块链上的常用零知识证明协议有Groth16和Plonk。Groth16是一个基于pairing的零知识证明方案，可以通过调用以太坊的pairing相关预编译合约实现。Plonk是一个基于多项式的零知识证明方案，同样可以通过调用以太坊的预编译合约实现。

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

privateSymbol
  : '#' ;

privateIdentifier
  : privateSymbol? identifier ;

privateIdentifierList
  : ( privateIdentifier? ',' )* privateIdentifier? ;

hashMethod
  : 'SHA3-256' | 'SHA2-256' | 'RIPEMD160' ;

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
  : statementSymbol proofMethod 'with' primaryExpression '(' privateIdentifierList ')';

taskStatement
  : (signatureStatement | commitmentStatement | proofStatement) ';' ;
```

上述代码为Cryptlang的g4代码，基于solidity进行扩充设计。

首先是两个特殊符号，“@”是Cryptlang语法的启始标识符，当用户使用此符号时，表示其准备启用Cryptlang的密码学功能。“#”符号是专门为Cryptlang中的零知识证明方法定制的符号，用户需要在零知识证明的隐私输入变量符号前加上“#”以便与公开输入进行区分。

接下来我们分别定义四个密码学方法：
1. 哈希：SHA3-256即solidity中的keccak256，SHA2-256即solidity中的sha256，RIPEMD160即solidity中的ripemd160
2. 签名：分别为ECDSA的签名验证和BLS的签名验证
3. 承诺：分别为Pedersen承诺和Merkle承诺
4. 零知识证明：分别为Groth16证明和PLONK证明，均为zk-snark

最后是Cryptlang具体的密码学任务表示方式，本DSL提供三个密码学任务，分别为签名验证，承诺验证和零知识证明验证，下面我们将分别介绍：
在所有任务开始前都需要输入“@”符号。
1. 签名验证：首先输入具体的签名方法名（ECDSA或BLS），接着输入可选的哈希方法（SHA3-256，SHA2-256或RIPEMD160），最后以输入函数参数的方式，按顺序输入签名者的地址以及所有被签名的参数。
2. 承诺验证：首先输入具体的承诺方法名（Pedersen或Merkle），接着输入可选的哈希方法（SHA3-256，SHA2-256或RIPEMD160），最后以输入函数参数的方式输入承诺值。
3. 零知识证明验证：首先输入具体的证明方法名（Groth16或PLONK），接着输入可选的哈希方法（SHA3-256，SHA2-256或RIPEMD160），最后以输入函数参数的方式，按顺序输入公开输入和隐私输入。

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