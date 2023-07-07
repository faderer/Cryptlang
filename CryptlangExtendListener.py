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
            f.write(self.addTabs() + "library ECDSA {\n")
            f.write(self.addTabs() + "\tfunction recover(bytes32 hash, bytes memory sig) internal pure returns (address) {\n")
            f.write(self.addTabs() + "\t\t(bytes32 r, bytes32 s, uint8 v) = abi.decode(sig, (bytes32, bytes32, uint8));\n")
            f.write(self.addTabs() + "\t\treturn ecrecover(hash, v, r, s);\n")
            f.write(self.addTabs() + "\t}\n")
            f.write(self.addTabs() + "}\n")
    
    # print the Pedersen library
    def printPedersenLibrary(self):
        with open(self.output_file, 'a') as f:
            f.write(self.addTabs() + "library Pedersen {\n")
            # print the modExp function
            f.write(self.addTabs() + "\tfunction modExp(uint256 base, uint256 exponent, uint256 modulus) internal view returns (uint256) {\n")
            f.write(self.addTabs() + "\t\tuint256 result;\n")
            f.write(self.addTabs() + "\t\tassembly {\n")
            f.write(self.addTabs() + "\t\t\tlet memPtr := mload(0x40)\n")
            f.write(self.addTabs() + "\t\t\tmstore(memPtr, base)\n")
            f.write(self.addTabs() + "\t\t\tmstore(add(memPtr, 0x20), exponent)\n")
            f.write(self.addTabs() + "\t\t\tmstore(add(memPtr, 0x40), modulus)\n")
            f.write(self.addTabs() + "\t\t\tif iszero(staticcall(not(0), 0x05, memPtr, 0x60, memPtr, 0x20)) {\n")
            f.write(self.addTabs() + "\t\t\t\trevert(0, 0)\n")
            f.write(self.addTabs() + "\t\t\t}\n")
            f.write(self.addTabs() + "\t\t\tresult := mload(memPtr)\n")
            f.write(self.addTabs() + "\t\t}\n")
            f.write(self.addTabs() + "\t\treturn result;\n")
            f.write(self.addTabs() + "\t}\n")
            f.write(self.addTabs() + "}\n")


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
            output += ",bytes memory sig)"
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
                self.hashMethod = ctx.getChild(2).getText()
            else:
                self.hashMethod = "keccak256"
    
        # if cryptoSignal == 1, print the signature statement depending on the signature method
        elif self.cryptoSignal == 1:
            with open(self.output_file, 'a') as f:
                # print the hash of the signature parameters, nonce and address of the contract
                f.write(self.addTabs() + "bytes32 hash = " + self.hashMethod + "(abi.encodePacked(")
                for i in range(len(self.signatureParams)):
                    f.write(self.signatureParams[i] + ", ")
                if self.signatureOwner != "":
                    f.write("nonce[" + self.signatureOwner + "], address(this)));\n")
                else:
                    f.write("nonce[msg.sender] + address(this)))\n")
                
                # print the require statement depending on the signature method
                if self.signatureMethod == "ECDSA":
                    f.write(self.addTabs() + "require(ECDSA.recover(hash, sig) == " + self.signatureOwner + ");\n")
                
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
