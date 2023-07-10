from CryptlangListener import CryptlangListener
from CryptlangParser import CryptlangParser
import subprocess

class CryptlangExtendListener(CryptlangListener):
    # parameter: record the type of crypto statement
    cryptoSignal = 0

    # restore the data of signature statement
    signatureMethod = ""
    signatureParams = []
    signatureOwner = ""

    # restore the data of commitment statement
    commitmentMethod = ""
    commitmentParams = []

    # restore the data of proof statement
    proofMethod = ""
    proofParams = []
    proofLocation = ""

    # restore the data of hash statement
    hashMethod = ""

    # parameter: record the depth of the scope
    depth = 0

    # write the output to a file
    def __init__(self, output_file):
        self.output_file = output_file
    
    # add tabs to the beginning of the line depending on the depth of the scope
    def addTabs(self):
        output = ""
        for i in range(self.depth):
            output += "\t"
        return output
    
    # print the ECDSA library
    def printECDSALibrary(self):
        with open(self.output_file, 'a') as f:
            content = '''library ECDSA {
    enum RecoverError {
        NoError,
        InvalidSignature,
        InvalidSignatureLength,
        InvalidSignatureS
    }
    error ECDSAInvalidSignature();
    error ECDSAInvalidSignatureLength(uint256 length);
    error ECDSAInvalidSignatureS(bytes32 s);

    function tryRecover(bytes32 hash, bytes memory signature) internal pure returns (address, RecoverError, bytes32) {
        if (signature.length == 65) {
            bytes32 r;
            bytes32 s;
            uint8 v;
            assembly {
                r := mload(add(signature, 0x20))
                s := mload(add(signature, 0x40))
                v := byte(0, mload(add(signature, 0x60)))
            }
            return tryRecover(hash, v, r, s);
        } else {
            return (address(0), RecoverError.InvalidSignatureLength, bytes32(signature.length));
        }
    }

    function recover(bytes32 hash, bytes memory signature) internal pure returns (address) {
        (address recovered, RecoverError error, bytes32 errorArg) = tryRecover(hash, signature);
        _throwError(error, errorArg);
        return recovered;
    }

    function tryRecover(bytes32 hash, bytes32 r, bytes32 vs) internal pure returns (address, RecoverError, bytes32) {
        unchecked {
            bytes32 s = vs & bytes32(0x7fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff);

            uint8 v = uint8((uint256(vs) >> 255) + 27);
            return tryRecover(hash, v, r, s);
        }
    }

    function recover(bytes32 hash, bytes32 r, bytes32 vs) internal pure returns (address) {
        (address recovered, RecoverError error, bytes32 errorArg) = tryRecover(hash, r, vs);
        _throwError(error, errorArg);
        return recovered;
    }

    function tryRecover(
        bytes32 hash,
        uint8 v,
        bytes32 r,
        bytes32 s
    ) internal pure returns (address, RecoverError, bytes32) {
        if (uint256(s) > 0x7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF5D576E7357A4501DDFE92F46681B20A0) {
            return (address(0), RecoverError.InvalidSignatureS, s);
        }

        address signer = ecrecover(hash, v, r, s);
        if (signer == address(0)) {
            return (address(0), RecoverError.InvalidSignature, bytes32(0));
        }

        return (signer, RecoverError.NoError, bytes32(0));
    }

    function recover(bytes32 hash, uint8 v, bytes32 r, bytes32 s) internal pure returns (address) {
        (address recovered, RecoverError error, bytes32 errorArg) = tryRecover(hash, v, r, s);
        _throwError(error, errorArg);
        return recovered;
    }

    function _throwError(RecoverError error, bytes32 errorArg) private pure {
        if (error == RecoverError.NoError) {
            return; // no error: do nothing
        } else if (error == RecoverError.InvalidSignature) {
            revert ECDSAInvalidSignature();
        } else if (error == RecoverError.InvalidSignatureLength) {
            revert ECDSAInvalidSignatureLength(uint256(errorArg));
        } else if (error == RecoverError.InvalidSignatureS) {
            revert ECDSAInvalidSignatureS(errorArg);
        }
    }
}
'''
            modified_content = content.replace("\n", "\n" + self.addTabs())
            f.write(modified_content)

    # print the BLS library
    def printBLSLibrary(self):
        with open(self.output_file, 'a') as f:
            content = '''import { BLS } from "./BLS.sol";

library BLSOpen {
    function verifySingle(
        uint256[2] memory signature,
        uint256[4] memory pubkey,
        uint256[2] memory message
    ) external view returns (bool) {
        uint256[4][] memory pubkeys = new uint256[4][](1);
        uint256[2][] memory messages = new uint256[2][](1);
        pubkeys[0] = pubkey;
        messages[0] = message;

        (bool verified, bool callSuccess) =  BLS.verifyMultiple(
            signature,
            pubkeys,
            messages
        );
        return callSuccess && verified;
    }

    function verifyMultiple(
        uint256[2] memory signature,
        uint256[4][] memory pubkeys,
        uint256[2][] memory messages
    ) external view returns (bool) {
        (bool verified, bool callSuccess) =  BLS.verifyMultiple(
            signature,
            pubkeys,
            messages
        );
        return callSuccess && verified;
    }

    function hashToPoint(
        bytes memory message
    ) external view returns (uint256[2] memory) {
        return BLS.hashToPoint(
            bytes32(BLS.N),
            message
        );
    }

}
'''
            modified_content = content.replace("\n", "\n" + self.addTabs())
            f.write(modified_content)
    
    # print the Pedersen library
    def printPedersenLibrary(self):
        with open(self.output_file, 'a') as f:
            # print the modExp function
            content = '''library Pedersen {
    function modExp(uint256 base, uint256 exponent, uint256 modulus) internal view returns (uint256 result) {
        assembly {
            let memPtr := mload(0x40)
            mstore(memPtr, 0x20)
            mstore(add(memPtr, 0x20), 0x20)
            mstore(add(memPtr, 0x40), 0x20)
            mstore(add(memPtr, 0x60), base)
            mstore(add(memPtr, 0x80), exponent)
            mstore(add(memPtr, 0xa0), modulus)

            let success := staticcall(gas(), 0x05, memPtr, 0xc0, memPtr, 0x20)
            switch success
            case 0 {
                revert(0x0, 0x0)
            } default {
                result := mload(memPtr)
            }
        }
    }
}
'''
            modified_content = content.replace("\n", "\n" + self.addTabs())
            f.write(modified_content)

    def enterPragmaDirective(self, ctx):
        if self.cryptoSignal != 2:
            with open(self.output_file, 'w') as f:
                f.write(self.addTabs() + "pragma solidity ^0.8.18;\n")
        else:
            with open(self.output_file, 'w') as f:
                pass
    
    def enterContractDefinition(self, ctx):
        with open(self.output_file, 'a') as f:
            # if cryptoSignal == 1, print the Signature library
            if self.cryptoSignal == 1:
                if self.signatureMethod == "ECDSA":
                    self.printECDSALibrary()
                elif self.signatureMethod == "BLS":
                    self.printBLSLibrary()
            # if cryptoSignal == 2, print the verifier contract
            elif self.cryptoSignal == 2:
                if self.proofMethod == "Groth16":
                    #self.invokeZokrates()
                    with open("verifier.sol", 'r') as f2:
                        f.write(f2.read())
            # if cryptoSignal == 3, print the Commitment library
            elif self.cryptoSignal == 3:
                if self.commitmentMethod == "Pedersen":
                    self.printPedersenLibrary()
            
            # print the contract definition
            if self.cryptoSignal != 2:
                f.write(self.addTabs() + "contract " + ctx.identifier().getText())
                if isinstance(ctx.getChild(2), CryptlangParser.InheritanceSpecifierContext):
                    f.write(" is " + ctx.getChild(2).getText())
                f.write(" {\n")
            elif self.cryptoSignal == 2:
                # Navigate to the second-to-last row of the file
                f.seek(0, 2)
                f.seek(f.tell() - 2, 0)
                f.truncate()

            self.depth += 1

            # if cryptoSignal == 1, print the nonce mapping
            if self.cryptoSignal == 1:
                if self.signatureMethod == "ECDSA":
                    f.write(self.addTabs() + "using ECDSA for bytes32;\n")
                    f.write(self.addTabs() + "mapping(address => uint256) public nonce;\n")
                elif self.signatureMethod == "BLS":
                    f.write(self.addTabs() + "using BLSOpen for *;\n")
                    f.write(self.addTabs() + "mapping(address => uint256) public nonce;\n")
                    f.write(self.addTabs() + "mapping (address => uint256[4]) public pubkey;\n")

            # if cryptoSignal == 3, print the commitment library
            elif self.cryptoSignal == 3:
                if self.commitmentMethod == "Pedersen":
                    f.write(self.addTabs() + "using Pedersen for uint256;\n")

    def exitContractDefinition(self, ctx):
        self.depth -= 1
        with open(self.output_file, 'a') as f:
            f.write(self.addTabs() + "}\n")
    
    def printReturnParameters(self, ctx):
        output = "returns " + self.printParameterList(ctx.parameterList())
        return output

    def printParameterList(self, ctx):
        output = ""

        # print the parameter list
        for i in range(ctx.getChildCount()):
            if isinstance(ctx.getChild(i), CryptlangParser.ParameterContext):
                output += ctx.getChild(i).typeName().getText() + " " + ctx.getChild(i).identifier().getText()
            elif ctx.getChild(i).getText() != ")" :
                output += ctx.getChild(i).getText()

        # if cryptoSignal == 1, print the signature parameter. Otherwise, print the proof parameter
        if self.cryptoSignal == 1:
            if self.signatureMethod == "ECDSA":
                output += ",bytes memory sig)"
            elif self.signatureMethod == "BLS":
                output += ",uint256[2] memory sig)"
        elif self.cryptoSignal == 2:
            output += ",Proof memory proof)"
        elif self.cryptoSignal == 3:
            if self.commitmentMethod == "Pedersen":
                output += ",uint256 value, uint256 randomness)"
            elif self.commitmentMethod == "Merkel":
                output += ",bytes32 leaf, bytes32[] memory proof)"
        else:
            output += ")"
        return output

    def enterFunctionDefinition(self, ctx):
        with open(self.output_file, 'a') as f:
            # print the basic function definition
            f.write(self.addTabs() + "function " + ctx.identifier().getText() + " " + 
                    self.printParameterList(ctx.parameterList()))
            
            # print the modifiers
            for i in range(ctx.modifierList().getChildCount()):
                f.write(" " + ctx.modifierList().getChild(i).getText())
            
            # if has return parameters, print the return parameters
            if isinstance(ctx.getChild(ctx.getChildCount() - 2), CryptlangParser.ReturnParametersContext):
                f.write(" " + self.printReturnParameters(ctx.getChild(ctx.getChildCount() - 2)))

            # if has block, print the block
            if isinstance(ctx.getChild(ctx.getChildCount() - 1), CryptlangParser.BlockContext):
                f.write("\n")
            else:
                f.write(" " + ctx.getChild(ctx.getChildCount() - 1).getText() + "\n")
    
    def exitFunctionDefinition(self, ctx):
        if self.cryptoSignal == 2:
            with open(self.output_file, 'a') as f:
                f.write(self.addTabs() + "function compareProof(Proof memory first, Proof memory second) internal pure returns (bool) {\n")
                f.write(self.addTabs() + "\tbytes32 hash1 = keccak256(abi.encodePacked(first.a.X, first.a.Y, first.b.X, first.b.Y, first.c.X, first.c.Y));\n")
                f.write(self.addTabs() + "\tbytes32 hash2 = keccak256(abi.encodePacked(second.a.X, second.a.Y, second.b.X, second.b.Y, second.c.X, second.c.Y));\n")
                f.write(self.addTabs() + "\treturn hash1 != hash2;\n")
                f.write(self.addTabs() + "}\n")

    def enterBlock(self, ctx):
        with open(self.output_file, 'a') as f:
            f.write(self.addTabs() + "{\n")
        self.depth += 1
    
    def exitBlock(self, ctx):
        self.depth -= 1
        with open(self.output_file, 'a') as f:
            f.write(self.addTabs() + "}\n")

    def enterTaskStatement(self, ctx):
        # if cryptoSignal == 0, restore the parameters
        if self.cryptoSignal == 0:
            if isinstance(ctx.getChild(0), CryptlangParser.SignatureStatementContext):
                for i in range(ctx.getChild(0).getChildCount()):
                    if isinstance(ctx.getChild(0).getChild(i), CryptlangParser.IdentifierContext):
                        self.signatureParams.append(ctx.getChild(0).getChild(i).getText())
                    elif isinstance(ctx.getChild(0).getChild(i), CryptlangParser.PrimaryExpressionContext):
                        self.signatureOwner = ctx.getChild(0).getChild(i).getText()
                self.cryptoSignal = 1
            elif isinstance(ctx.getChild(0), CryptlangParser.ProofStatementContext):
                for i in range(ctx.getChild(0).privateIdentifierList().getChildCount()):
                    if isinstance(ctx.getChild(0).privateIdentifierList().getChild(i).getChild(0), CryptlangParser.IdentifierContext):
                        self.proofParams.append(ctx.getChild(0).privateIdentifierList().getChild(i).getChild(0).getText())
                for i in range(ctx.getChild(0).getChildCount()):
                    if isinstance(ctx.getChild(0).getChild(i), CryptlangParser.PrimaryExpressionContext):
                        self.proofLocation = ctx.getChild(0).getChild(i).getText()
                self.cryptoSignal = 2
            elif isinstance(ctx.getChild(0), CryptlangParser.CommitmentStatementContext):
                for i in range(ctx.getChild(0).getChildCount()):
                    if isinstance(ctx.getChild(0).getChild(i), CryptlangParser.IdentifierContext):
                        self.commitmentParams.append(ctx.getChild(0).getChild(i).getText())
                self.cryptoSignal = 3
            # if there is hash method, store it
            if ctx.getChildCount() == 4:
                if ctx.getChild(2).getText() == "SHA3-256":
                    self.hashMethod = "keccak256"
                elif ctx.getChild(2).getText() == "SHA2-256":
                    self.hashMethod = "sha256"
                elif ctx.getChild(2).getText() == "RIPEMD-160":
                    self.hashMethod = "ripemd160"
            else:
                self.hashMethod = "keccak256"
    
        # if cryptoSignal == 1, print the signature statement depending on the signature method
        elif self.cryptoSignal == 1:
            with open(self.output_file, 'a') as f:
                # print the hash of the signature parameters, nonce and address of the contract
                if self.signatureMethod == "ECDSA":
                    f.write(self.addTabs() + "bytes32 hash = " + self.hashMethod + "(abi.encodePacked(")
                    for i in range(len(self.signatureParams)):
                        f.write(self.signatureParams[i] + ", ")
                    if self.signatureOwner != "":
                        f.write("nonce[" + self.signatureOwner + "], address(this)));\n")
                    else:
                        f.write("nonce[msg.sender] + address(this)))\n")
                elif self.signatureMethod == "BLS":
                    f.write(self.addTabs() + "bytes memory hash = abi.encodePacked(" + self.hashMethod + "(abi.encodePacked(")
                    for i in range(len(self.signatureParams)):
                        f.write(self.signatureParams[i] + ", ")
                    if self.signatureOwner != "":
                        f.write("nonce[" + self.signatureOwner + "], address(this))));\n")
                    else:
                        f.write("nonce[msg.sender] + address(this))));\n")
                    f.write(self.addTabs() + "uint256[2] memory message = BLSOpen.hashToPoint(hash);\n")
                
                # print the require statement depending on the signature method
                if self.signatureMethod == "ECDSA":
                    if self.signatureOwner != "":
                        f.write(self.addTabs() + "require(ECDSA.recover(hash, sig) == " + self.signatureOwner + ");\n")
                    else:
                        f.write(self.addTabs() + "require(ECDSA.recover(hash, sig) == msg.sender);\n")
                elif self.signatureMethod == "BLS":
                    if self.signatureOwner != "":
                        f.write(self.addTabs() + "require(BLSOpen.verifySingle(sig, pubkey[" + self.signatureOwner + "], message));\n")
                    else:
                        f.write(self.addTabs() + "require(BLSOpen.verifySingle(sig, pubkey[msg.sender], message));\n")
                
                # update the nonce
                if self.signatureOwner != "":
                    f.write(self.addTabs() + "nonce[" + self.signatureOwner + "]++;\n")
                else:
                    f.write(self.addTabs() + "nonce[msg.sender]++;\n")

        # if cryptoSignal == 2, print the proof statement
        elif self.cryptoSignal == 2:
            with open(self.output_file, 'r+') as f:
                file_content = f.read()
                if "using Pairing for *;" in file_content:
                    index = file_content.index("using Pairing for *;")
                    f.seek(index + len("using Pairing for *;") + 1)
                    rest_of_file = f.read()
                    f.seek(index + len("using Pairing for *;") + 1)
                    f.write("\tProof[] public proofs;\n")
                    f.write(rest_of_file)

            with open(self.output_file, 'a') as f:
                f.write(self.addTabs() + "for(uint i = 0; i < proofs.length; i++){\n")
                f.write(self.addTabs() + "\trequire(compareProof(proof,proofs[i]));\n")
                f.write(self.addTabs() + "}\n")
                f.write(self.addTabs() + "require(verifyTx(proof, [" + ",".join(self.proofParams) + "]));\n")
                f.write(self.addTabs() + "proofs.push(proof);\n")
        
        # if cryptoSignal == 3, print the commitment statement
        elif self.cryptoSignal == 3:
            with open(self.output_file, 'a') as f:
                if self.commitmentMethod == "Pedersen":
                    f.write(self.addTabs() + "uint256 q = 21888242871839275222246405745257275088548364400416034343698204186575808495617;\n")
                    f.write(self.addTabs() + "uint256 g = 7;\n")
                    f.write(self.addTabs() + "uint256 h = uint256(" + self.hashMethod + "(abi.encodePacked(randomness)));\n")
                    f.write(self.addTabs() + "uint256 c = (Pedersen.modExp(g, value, q) * Pedersen.modExp(h, randomness, q)) % q;\n")
                    f.write(self.addTabs() + "require(" + self.commitmentParams[0] + " == c);\n")
                elif self.commitmentMethod == "Merkel":
                    f.write(self.addTabs() + "bytes32 computedHash = keccak256(abi.encodePacked(leaf));\n")
                    f.write(self.addTabs() + "for(uint256 i = 0; i < proof.length; i++){\n")
                    f.write(self.addTabs() + "\tif(computedHash < proof[i]){\n")
                    f.write(self.addTabs() + "\t\tcomputedHash = " + self.hashMethod + "(abi.encodePacked(computedHash, proof[i]));\n")
                    f.write(self.addTabs() + "\t}\n")
                    f.write(self.addTabs() + "\telse{\n")
                    f.write(self.addTabs() + "\t\tcomputedHash = " + self.hashMethod + "(abi.encodePacked(proof[i], computedHash));\n")
                    f.write(self.addTabs() + "\t}\n")
                    f.write(self.addTabs() + "}\n")
                    f.write(self.addTabs() + "require(" + self.commitmentParams[0] + " == computedHash);\n")
        
    def invokeZokrates(self):
        # Invoke zokrates to generate the verification contract
        proof_location = self.proofLocation
        proof_location_without_quotes = proof_location.strip('"')
        proof_location_without_extension = proof_location_without_quotes[:-4]

        # Command-line statements are constructed using the f-string syntax
        command1 = f"/home/xialb/zkp_tools/ZoKrates/target/release/zokrates compile -i {proof_location_without_quotes} -o {proof_location_without_extension}"
        command2 = f"/home/xialb/zkp_tools/ZoKrates/target/release/zokrates setup -i {proof_location_without_extension}"
        command3 = f"/home/xialb/zkp_tools/ZoKrates/target/release/zokrates export-verifier"

        # Execute the command using the subprocess module
        subprocess.run(command1, shell=True, check=True)
        subprocess.run(command2, shell=True, check=True)
        subprocess.run(command3, shell=True, check=True)
    
    def enterSignatureMethod(self, ctx):
        self.signatureMethod = ctx.getText()
    
    def enterProofMethod(self, ctx):
        self.proofMethod = ctx.getText()
    
    def enterCommitmentMethod(self, ctx):
        self.commitmentMethod = ctx.getText()



    # def enterStatementSymbol(self, ctx):
    #     print("enterStatementSymbol: " + ctx.getText())