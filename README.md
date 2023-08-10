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
```bash
git clone https://github.com/ZoKrates/ZoKrates
cd ZoKrates
export ZOKRATES_STDLIB=$PWD/zokrates_stdlib/stdlib
cargo build -p zokrates_cli --release
cd target/release
sudo cp zokrates /usr/local/bin
```
```bash
git clone https://github.com/iden3/circom.git
cargo build --release
cargo install --path circom
npm install -g snarkjs
```