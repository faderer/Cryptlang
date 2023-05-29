# Generated from Cryplang.g4 by ANTLR 4.12.0
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .CryplangParser import CryplangParser
else:
    from CryplangParser import CryplangParser

# This class defines a complete listener for a parse tree produced by CryplangParser.
class CryplangListener(ParseTreeListener):

    # Enter a parse tree produced by CryplangParser#sourceUnit.
    def enterSourceUnit(self, ctx:CryplangParser.SourceUnitContext):
        pass

    # Exit a parse tree produced by CryplangParser#sourceUnit.
    def exitSourceUnit(self, ctx:CryplangParser.SourceUnitContext):
        pass


    # Enter a parse tree produced by CryplangParser#pragmaDirective.
    def enterPragmaDirective(self, ctx:CryplangParser.PragmaDirectiveContext):
        pass

    # Exit a parse tree produced by CryplangParser#pragmaDirective.
    def exitPragmaDirective(self, ctx:CryplangParser.PragmaDirectiveContext):
        pass


    # Enter a parse tree produced by CryplangParser#pragmaName.
    def enterPragmaName(self, ctx:CryplangParser.PragmaNameContext):
        pass

    # Exit a parse tree produced by CryplangParser#pragmaName.
    def exitPragmaName(self, ctx:CryplangParser.PragmaNameContext):
        pass


    # Enter a parse tree produced by CryplangParser#pragmaValue.
    def enterPragmaValue(self, ctx:CryplangParser.PragmaValueContext):
        pass

    # Exit a parse tree produced by CryplangParser#pragmaValue.
    def exitPragmaValue(self, ctx:CryplangParser.PragmaValueContext):
        pass


    # Enter a parse tree produced by CryplangParser#version.
    def enterVersion(self, ctx:CryplangParser.VersionContext):
        pass

    # Exit a parse tree produced by CryplangParser#version.
    def exitVersion(self, ctx:CryplangParser.VersionContext):
        pass


    # Enter a parse tree produced by CryplangParser#versionOperator.
    def enterVersionOperator(self, ctx:CryplangParser.VersionOperatorContext):
        pass

    # Exit a parse tree produced by CryplangParser#versionOperator.
    def exitVersionOperator(self, ctx:CryplangParser.VersionOperatorContext):
        pass


    # Enter a parse tree produced by CryplangParser#versionConstraint.
    def enterVersionConstraint(self, ctx:CryplangParser.VersionConstraintContext):
        pass

    # Exit a parse tree produced by CryplangParser#versionConstraint.
    def exitVersionConstraint(self, ctx:CryplangParser.VersionConstraintContext):
        pass


    # Enter a parse tree produced by CryplangParser#importDeclaration.
    def enterImportDeclaration(self, ctx:CryplangParser.ImportDeclarationContext):
        pass

    # Exit a parse tree produced by CryplangParser#importDeclaration.
    def exitImportDeclaration(self, ctx:CryplangParser.ImportDeclarationContext):
        pass


    # Enter a parse tree produced by CryplangParser#importDirective.
    def enterImportDirective(self, ctx:CryplangParser.ImportDirectiveContext):
        pass

    # Exit a parse tree produced by CryplangParser#importDirective.
    def exitImportDirective(self, ctx:CryplangParser.ImportDirectiveContext):
        pass


    # Enter a parse tree produced by CryplangParser#natSpec.
    def enterNatSpec(self, ctx:CryplangParser.NatSpecContext):
        pass

    # Exit a parse tree produced by CryplangParser#natSpec.
    def exitNatSpec(self, ctx:CryplangParser.NatSpecContext):
        pass


    # Enter a parse tree produced by CryplangParser#contractDefinition.
    def enterContractDefinition(self, ctx:CryplangParser.ContractDefinitionContext):
        pass

    # Exit a parse tree produced by CryplangParser#contractDefinition.
    def exitContractDefinition(self, ctx:CryplangParser.ContractDefinitionContext):
        pass


    # Enter a parse tree produced by CryplangParser#inheritanceSpecifier.
    def enterInheritanceSpecifier(self, ctx:CryplangParser.InheritanceSpecifierContext):
        pass

    # Exit a parse tree produced by CryplangParser#inheritanceSpecifier.
    def exitInheritanceSpecifier(self, ctx:CryplangParser.InheritanceSpecifierContext):
        pass


    # Enter a parse tree produced by CryplangParser#contractPart.
    def enterContractPart(self, ctx:CryplangParser.ContractPartContext):
        pass

    # Exit a parse tree produced by CryplangParser#contractPart.
    def exitContractPart(self, ctx:CryplangParser.ContractPartContext):
        pass


    # Enter a parse tree produced by CryplangParser#stateVariableDeclaration.
    def enterStateVariableDeclaration(self, ctx:CryplangParser.StateVariableDeclarationContext):
        pass

    # Exit a parse tree produced by CryplangParser#stateVariableDeclaration.
    def exitStateVariableDeclaration(self, ctx:CryplangParser.StateVariableDeclarationContext):
        pass


    # Enter a parse tree produced by CryplangParser#usingForDeclaration.
    def enterUsingForDeclaration(self, ctx:CryplangParser.UsingForDeclarationContext):
        pass

    # Exit a parse tree produced by CryplangParser#usingForDeclaration.
    def exitUsingForDeclaration(self, ctx:CryplangParser.UsingForDeclarationContext):
        pass


    # Enter a parse tree produced by CryplangParser#structDefinition.
    def enterStructDefinition(self, ctx:CryplangParser.StructDefinitionContext):
        pass

    # Exit a parse tree produced by CryplangParser#structDefinition.
    def exitStructDefinition(self, ctx:CryplangParser.StructDefinitionContext):
        pass


    # Enter a parse tree produced by CryplangParser#constructorDefinition.
    def enterConstructorDefinition(self, ctx:CryplangParser.ConstructorDefinitionContext):
        pass

    # Exit a parse tree produced by CryplangParser#constructorDefinition.
    def exitConstructorDefinition(self, ctx:CryplangParser.ConstructorDefinitionContext):
        pass


    # Enter a parse tree produced by CryplangParser#modifierDefinition.
    def enterModifierDefinition(self, ctx:CryplangParser.ModifierDefinitionContext):
        pass

    # Exit a parse tree produced by CryplangParser#modifierDefinition.
    def exitModifierDefinition(self, ctx:CryplangParser.ModifierDefinitionContext):
        pass


    # Enter a parse tree produced by CryplangParser#modifierInvocation.
    def enterModifierInvocation(self, ctx:CryplangParser.ModifierInvocationContext):
        pass

    # Exit a parse tree produced by CryplangParser#modifierInvocation.
    def exitModifierInvocation(self, ctx:CryplangParser.ModifierInvocationContext):
        pass


    # Enter a parse tree produced by CryplangParser#functionDefinition.
    def enterFunctionDefinition(self, ctx:CryplangParser.FunctionDefinitionContext):
        pass

    # Exit a parse tree produced by CryplangParser#functionDefinition.
    def exitFunctionDefinition(self, ctx:CryplangParser.FunctionDefinitionContext):
        pass


    # Enter a parse tree produced by CryplangParser#returnParameters.
    def enterReturnParameters(self, ctx:CryplangParser.ReturnParametersContext):
        pass

    # Exit a parse tree produced by CryplangParser#returnParameters.
    def exitReturnParameters(self, ctx:CryplangParser.ReturnParametersContext):
        pass


    # Enter a parse tree produced by CryplangParser#modifierList.
    def enterModifierList(self, ctx:CryplangParser.ModifierListContext):
        pass

    # Exit a parse tree produced by CryplangParser#modifierList.
    def exitModifierList(self, ctx:CryplangParser.ModifierListContext):
        pass


    # Enter a parse tree produced by CryplangParser#eventDefinition.
    def enterEventDefinition(self, ctx:CryplangParser.EventDefinitionContext):
        pass

    # Exit a parse tree produced by CryplangParser#eventDefinition.
    def exitEventDefinition(self, ctx:CryplangParser.EventDefinitionContext):
        pass


    # Enter a parse tree produced by CryplangParser#enumValue.
    def enterEnumValue(self, ctx:CryplangParser.EnumValueContext):
        pass

    # Exit a parse tree produced by CryplangParser#enumValue.
    def exitEnumValue(self, ctx:CryplangParser.EnumValueContext):
        pass


    # Enter a parse tree produced by CryplangParser#enumDefinition.
    def enterEnumDefinition(self, ctx:CryplangParser.EnumDefinitionContext):
        pass

    # Exit a parse tree produced by CryplangParser#enumDefinition.
    def exitEnumDefinition(self, ctx:CryplangParser.EnumDefinitionContext):
        pass


    # Enter a parse tree produced by CryplangParser#parameterList.
    def enterParameterList(self, ctx:CryplangParser.ParameterListContext):
        pass

    # Exit a parse tree produced by CryplangParser#parameterList.
    def exitParameterList(self, ctx:CryplangParser.ParameterListContext):
        pass


    # Enter a parse tree produced by CryplangParser#parameter.
    def enterParameter(self, ctx:CryplangParser.ParameterContext):
        pass

    # Exit a parse tree produced by CryplangParser#parameter.
    def exitParameter(self, ctx:CryplangParser.ParameterContext):
        pass


    # Enter a parse tree produced by CryplangParser#eventParameterList.
    def enterEventParameterList(self, ctx:CryplangParser.EventParameterListContext):
        pass

    # Exit a parse tree produced by CryplangParser#eventParameterList.
    def exitEventParameterList(self, ctx:CryplangParser.EventParameterListContext):
        pass


    # Enter a parse tree produced by CryplangParser#eventParameter.
    def enterEventParameter(self, ctx:CryplangParser.EventParameterContext):
        pass

    # Exit a parse tree produced by CryplangParser#eventParameter.
    def exitEventParameter(self, ctx:CryplangParser.EventParameterContext):
        pass


    # Enter a parse tree produced by CryplangParser#functionTypeParameterList.
    def enterFunctionTypeParameterList(self, ctx:CryplangParser.FunctionTypeParameterListContext):
        pass

    # Exit a parse tree produced by CryplangParser#functionTypeParameterList.
    def exitFunctionTypeParameterList(self, ctx:CryplangParser.FunctionTypeParameterListContext):
        pass


    # Enter a parse tree produced by CryplangParser#functionTypeParameter.
    def enterFunctionTypeParameter(self, ctx:CryplangParser.FunctionTypeParameterContext):
        pass

    # Exit a parse tree produced by CryplangParser#functionTypeParameter.
    def exitFunctionTypeParameter(self, ctx:CryplangParser.FunctionTypeParameterContext):
        pass


    # Enter a parse tree produced by CryplangParser#variableDeclaration.
    def enterVariableDeclaration(self, ctx:CryplangParser.VariableDeclarationContext):
        pass

    # Exit a parse tree produced by CryplangParser#variableDeclaration.
    def exitVariableDeclaration(self, ctx:CryplangParser.VariableDeclarationContext):
        pass


    # Enter a parse tree produced by CryplangParser#typeName.
    def enterTypeName(self, ctx:CryplangParser.TypeNameContext):
        pass

    # Exit a parse tree produced by CryplangParser#typeName.
    def exitTypeName(self, ctx:CryplangParser.TypeNameContext):
        pass


    # Enter a parse tree produced by CryplangParser#userDefinedTypeName.
    def enterUserDefinedTypeName(self, ctx:CryplangParser.UserDefinedTypeNameContext):
        pass

    # Exit a parse tree produced by CryplangParser#userDefinedTypeName.
    def exitUserDefinedTypeName(self, ctx:CryplangParser.UserDefinedTypeNameContext):
        pass


    # Enter a parse tree produced by CryplangParser#mapping.
    def enterMapping(self, ctx:CryplangParser.MappingContext):
        pass

    # Exit a parse tree produced by CryplangParser#mapping.
    def exitMapping(self, ctx:CryplangParser.MappingContext):
        pass


    # Enter a parse tree produced by CryplangParser#functionTypeName.
    def enterFunctionTypeName(self, ctx:CryplangParser.FunctionTypeNameContext):
        pass

    # Exit a parse tree produced by CryplangParser#functionTypeName.
    def exitFunctionTypeName(self, ctx:CryplangParser.FunctionTypeNameContext):
        pass


    # Enter a parse tree produced by CryplangParser#storageLocation.
    def enterStorageLocation(self, ctx:CryplangParser.StorageLocationContext):
        pass

    # Exit a parse tree produced by CryplangParser#storageLocation.
    def exitStorageLocation(self, ctx:CryplangParser.StorageLocationContext):
        pass


    # Enter a parse tree produced by CryplangParser#stateMutability.
    def enterStateMutability(self, ctx:CryplangParser.StateMutabilityContext):
        pass

    # Exit a parse tree produced by CryplangParser#stateMutability.
    def exitStateMutability(self, ctx:CryplangParser.StateMutabilityContext):
        pass


    # Enter a parse tree produced by CryplangParser#block.
    def enterBlock(self, ctx:CryplangParser.BlockContext):
        pass

    # Exit a parse tree produced by CryplangParser#block.
    def exitBlock(self, ctx:CryplangParser.BlockContext):
        pass


    # Enter a parse tree produced by CryplangParser#statement.
    def enterStatement(self, ctx:CryplangParser.StatementContext):
        pass

    # Exit a parse tree produced by CryplangParser#statement.
    def exitStatement(self, ctx:CryplangParser.StatementContext):
        pass


    # Enter a parse tree produced by CryplangParser#expressionStatement.
    def enterExpressionStatement(self, ctx:CryplangParser.ExpressionStatementContext):
        pass

    # Exit a parse tree produced by CryplangParser#expressionStatement.
    def exitExpressionStatement(self, ctx:CryplangParser.ExpressionStatementContext):
        pass


    # Enter a parse tree produced by CryplangParser#statementSymbol.
    def enterStatementSymbol(self, ctx:CryplangParser.StatementSymbolContext):
        pass

    # Exit a parse tree produced by CryplangParser#statementSymbol.
    def exitStatementSymbol(self, ctx:CryplangParser.StatementSymbolContext):
        pass


    # Enter a parse tree produced by CryplangParser#privateSymbol.
    def enterPrivateSymbol(self, ctx:CryplangParser.PrivateSymbolContext):
        pass

    # Exit a parse tree produced by CryplangParser#privateSymbol.
    def exitPrivateSymbol(self, ctx:CryplangParser.PrivateSymbolContext):
        pass


    # Enter a parse tree produced by CryplangParser#privateIdentifier.
    def enterPrivateIdentifier(self, ctx:CryplangParser.PrivateIdentifierContext):
        pass

    # Exit a parse tree produced by CryplangParser#privateIdentifier.
    def exitPrivateIdentifier(self, ctx:CryplangParser.PrivateIdentifierContext):
        pass


    # Enter a parse tree produced by CryplangParser#privateIdentifierList.
    def enterPrivateIdentifierList(self, ctx:CryplangParser.PrivateIdentifierListContext):
        pass

    # Exit a parse tree produced by CryplangParser#privateIdentifierList.
    def exitPrivateIdentifierList(self, ctx:CryplangParser.PrivateIdentifierListContext):
        pass


    # Enter a parse tree produced by CryplangParser#signatureMethod.
    def enterSignatureMethod(self, ctx:CryplangParser.SignatureMethodContext):
        pass

    # Exit a parse tree produced by CryplangParser#signatureMethod.
    def exitSignatureMethod(self, ctx:CryplangParser.SignatureMethodContext):
        pass


    # Enter a parse tree produced by CryplangParser#proofMethod.
    def enterProofMethod(self, ctx:CryplangParser.ProofMethodContext):
        pass

    # Exit a parse tree produced by CryplangParser#proofMethod.
    def exitProofMethod(self, ctx:CryplangParser.ProofMethodContext):
        pass


    # Enter a parse tree produced by CryplangParser#cryptoStatement.
    def enterCryptoStatement(self, ctx:CryplangParser.CryptoStatementContext):
        pass

    # Exit a parse tree produced by CryplangParser#cryptoStatement.
    def exitCryptoStatement(self, ctx:CryplangParser.CryptoStatementContext):
        pass


    # Enter a parse tree produced by CryplangParser#signatureStatement.
    def enterSignatureStatement(self, ctx:CryplangParser.SignatureStatementContext):
        pass

    # Exit a parse tree produced by CryplangParser#signatureStatement.
    def exitSignatureStatement(self, ctx:CryplangParser.SignatureStatementContext):
        pass


    # Enter a parse tree produced by CryplangParser#proofStatement.
    def enterProofStatement(self, ctx:CryplangParser.ProofStatementContext):
        pass

    # Exit a parse tree produced by CryplangParser#proofStatement.
    def exitProofStatement(self, ctx:CryplangParser.ProofStatementContext):
        pass


    # Enter a parse tree produced by CryplangParser#ifStatement.
    def enterIfStatement(self, ctx:CryplangParser.IfStatementContext):
        pass

    # Exit a parse tree produced by CryplangParser#ifStatement.
    def exitIfStatement(self, ctx:CryplangParser.IfStatementContext):
        pass


    # Enter a parse tree produced by CryplangParser#whileStatement.
    def enterWhileStatement(self, ctx:CryplangParser.WhileStatementContext):
        pass

    # Exit a parse tree produced by CryplangParser#whileStatement.
    def exitWhileStatement(self, ctx:CryplangParser.WhileStatementContext):
        pass


    # Enter a parse tree produced by CryplangParser#simpleStatement.
    def enterSimpleStatement(self, ctx:CryplangParser.SimpleStatementContext):
        pass

    # Exit a parse tree produced by CryplangParser#simpleStatement.
    def exitSimpleStatement(self, ctx:CryplangParser.SimpleStatementContext):
        pass


    # Enter a parse tree produced by CryplangParser#forStatement.
    def enterForStatement(self, ctx:CryplangParser.ForStatementContext):
        pass

    # Exit a parse tree produced by CryplangParser#forStatement.
    def exitForStatement(self, ctx:CryplangParser.ForStatementContext):
        pass


    # Enter a parse tree produced by CryplangParser#inlineAssemblyStatement.
    def enterInlineAssemblyStatement(self, ctx:CryplangParser.InlineAssemblyStatementContext):
        pass

    # Exit a parse tree produced by CryplangParser#inlineAssemblyStatement.
    def exitInlineAssemblyStatement(self, ctx:CryplangParser.InlineAssemblyStatementContext):
        pass


    # Enter a parse tree produced by CryplangParser#doWhileStatement.
    def enterDoWhileStatement(self, ctx:CryplangParser.DoWhileStatementContext):
        pass

    # Exit a parse tree produced by CryplangParser#doWhileStatement.
    def exitDoWhileStatement(self, ctx:CryplangParser.DoWhileStatementContext):
        pass


    # Enter a parse tree produced by CryplangParser#continueStatement.
    def enterContinueStatement(self, ctx:CryplangParser.ContinueStatementContext):
        pass

    # Exit a parse tree produced by CryplangParser#continueStatement.
    def exitContinueStatement(self, ctx:CryplangParser.ContinueStatementContext):
        pass


    # Enter a parse tree produced by CryplangParser#breakStatement.
    def enterBreakStatement(self, ctx:CryplangParser.BreakStatementContext):
        pass

    # Exit a parse tree produced by CryplangParser#breakStatement.
    def exitBreakStatement(self, ctx:CryplangParser.BreakStatementContext):
        pass


    # Enter a parse tree produced by CryplangParser#returnStatement.
    def enterReturnStatement(self, ctx:CryplangParser.ReturnStatementContext):
        pass

    # Exit a parse tree produced by CryplangParser#returnStatement.
    def exitReturnStatement(self, ctx:CryplangParser.ReturnStatementContext):
        pass


    # Enter a parse tree produced by CryplangParser#throwStatement.
    def enterThrowStatement(self, ctx:CryplangParser.ThrowStatementContext):
        pass

    # Exit a parse tree produced by CryplangParser#throwStatement.
    def exitThrowStatement(self, ctx:CryplangParser.ThrowStatementContext):
        pass


    # Enter a parse tree produced by CryplangParser#emitStatement.
    def enterEmitStatement(self, ctx:CryplangParser.EmitStatementContext):
        pass

    # Exit a parse tree produced by CryplangParser#emitStatement.
    def exitEmitStatement(self, ctx:CryplangParser.EmitStatementContext):
        pass


    # Enter a parse tree produced by CryplangParser#variableDeclarationStatement.
    def enterVariableDeclarationStatement(self, ctx:CryplangParser.VariableDeclarationStatementContext):
        pass

    # Exit a parse tree produced by CryplangParser#variableDeclarationStatement.
    def exitVariableDeclarationStatement(self, ctx:CryplangParser.VariableDeclarationStatementContext):
        pass


    # Enter a parse tree produced by CryplangParser#variableDeclarationList.
    def enterVariableDeclarationList(self, ctx:CryplangParser.VariableDeclarationListContext):
        pass

    # Exit a parse tree produced by CryplangParser#variableDeclarationList.
    def exitVariableDeclarationList(self, ctx:CryplangParser.VariableDeclarationListContext):
        pass


    # Enter a parse tree produced by CryplangParser#identifierList.
    def enterIdentifierList(self, ctx:CryplangParser.IdentifierListContext):
        pass

    # Exit a parse tree produced by CryplangParser#identifierList.
    def exitIdentifierList(self, ctx:CryplangParser.IdentifierListContext):
        pass


    # Enter a parse tree produced by CryplangParser#elementaryTypeName.
    def enterElementaryTypeName(self, ctx:CryplangParser.ElementaryTypeNameContext):
        pass

    # Exit a parse tree produced by CryplangParser#elementaryTypeName.
    def exitElementaryTypeName(self, ctx:CryplangParser.ElementaryTypeNameContext):
        pass


    # Enter a parse tree produced by CryplangParser#expression.
    def enterExpression(self, ctx:CryplangParser.ExpressionContext):
        pass

    # Exit a parse tree produced by CryplangParser#expression.
    def exitExpression(self, ctx:CryplangParser.ExpressionContext):
        pass


    # Enter a parse tree produced by CryplangParser#primaryExpression.
    def enterPrimaryExpression(self, ctx:CryplangParser.PrimaryExpressionContext):
        pass

    # Exit a parse tree produced by CryplangParser#primaryExpression.
    def exitPrimaryExpression(self, ctx:CryplangParser.PrimaryExpressionContext):
        pass


    # Enter a parse tree produced by CryplangParser#expressionList.
    def enterExpressionList(self, ctx:CryplangParser.ExpressionListContext):
        pass

    # Exit a parse tree produced by CryplangParser#expressionList.
    def exitExpressionList(self, ctx:CryplangParser.ExpressionListContext):
        pass


    # Enter a parse tree produced by CryplangParser#nameValueList.
    def enterNameValueList(self, ctx:CryplangParser.NameValueListContext):
        pass

    # Exit a parse tree produced by CryplangParser#nameValueList.
    def exitNameValueList(self, ctx:CryplangParser.NameValueListContext):
        pass


    # Enter a parse tree produced by CryplangParser#nameValue.
    def enterNameValue(self, ctx:CryplangParser.NameValueContext):
        pass

    # Exit a parse tree produced by CryplangParser#nameValue.
    def exitNameValue(self, ctx:CryplangParser.NameValueContext):
        pass


    # Enter a parse tree produced by CryplangParser#functionCallArguments.
    def enterFunctionCallArguments(self, ctx:CryplangParser.FunctionCallArgumentsContext):
        pass

    # Exit a parse tree produced by CryplangParser#functionCallArguments.
    def exitFunctionCallArguments(self, ctx:CryplangParser.FunctionCallArgumentsContext):
        pass


    # Enter a parse tree produced by CryplangParser#functionCall.
    def enterFunctionCall(self, ctx:CryplangParser.FunctionCallContext):
        pass

    # Exit a parse tree produced by CryplangParser#functionCall.
    def exitFunctionCall(self, ctx:CryplangParser.FunctionCallContext):
        pass


    # Enter a parse tree produced by CryplangParser#assemblyBlock.
    def enterAssemblyBlock(self, ctx:CryplangParser.AssemblyBlockContext):
        pass

    # Exit a parse tree produced by CryplangParser#assemblyBlock.
    def exitAssemblyBlock(self, ctx:CryplangParser.AssemblyBlockContext):
        pass


    # Enter a parse tree produced by CryplangParser#assemblyItem.
    def enterAssemblyItem(self, ctx:CryplangParser.AssemblyItemContext):
        pass

    # Exit a parse tree produced by CryplangParser#assemblyItem.
    def exitAssemblyItem(self, ctx:CryplangParser.AssemblyItemContext):
        pass


    # Enter a parse tree produced by CryplangParser#assemblyExpression.
    def enterAssemblyExpression(self, ctx:CryplangParser.AssemblyExpressionContext):
        pass

    # Exit a parse tree produced by CryplangParser#assemblyExpression.
    def exitAssemblyExpression(self, ctx:CryplangParser.AssemblyExpressionContext):
        pass


    # Enter a parse tree produced by CryplangParser#assemblyCall.
    def enterAssemblyCall(self, ctx:CryplangParser.AssemblyCallContext):
        pass

    # Exit a parse tree produced by CryplangParser#assemblyCall.
    def exitAssemblyCall(self, ctx:CryplangParser.AssemblyCallContext):
        pass


    # Enter a parse tree produced by CryplangParser#assemblyLocalDefinition.
    def enterAssemblyLocalDefinition(self, ctx:CryplangParser.AssemblyLocalDefinitionContext):
        pass

    # Exit a parse tree produced by CryplangParser#assemblyLocalDefinition.
    def exitAssemblyLocalDefinition(self, ctx:CryplangParser.AssemblyLocalDefinitionContext):
        pass


    # Enter a parse tree produced by CryplangParser#assemblyAssignment.
    def enterAssemblyAssignment(self, ctx:CryplangParser.AssemblyAssignmentContext):
        pass

    # Exit a parse tree produced by CryplangParser#assemblyAssignment.
    def exitAssemblyAssignment(self, ctx:CryplangParser.AssemblyAssignmentContext):
        pass


    # Enter a parse tree produced by CryplangParser#assemblyIdentifierOrList.
    def enterAssemblyIdentifierOrList(self, ctx:CryplangParser.AssemblyIdentifierOrListContext):
        pass

    # Exit a parse tree produced by CryplangParser#assemblyIdentifierOrList.
    def exitAssemblyIdentifierOrList(self, ctx:CryplangParser.AssemblyIdentifierOrListContext):
        pass


    # Enter a parse tree produced by CryplangParser#assemblyIdentifierList.
    def enterAssemblyIdentifierList(self, ctx:CryplangParser.AssemblyIdentifierListContext):
        pass

    # Exit a parse tree produced by CryplangParser#assemblyIdentifierList.
    def exitAssemblyIdentifierList(self, ctx:CryplangParser.AssemblyIdentifierListContext):
        pass


    # Enter a parse tree produced by CryplangParser#assemblyStackAssignment.
    def enterAssemblyStackAssignment(self, ctx:CryplangParser.AssemblyStackAssignmentContext):
        pass

    # Exit a parse tree produced by CryplangParser#assemblyStackAssignment.
    def exitAssemblyStackAssignment(self, ctx:CryplangParser.AssemblyStackAssignmentContext):
        pass


    # Enter a parse tree produced by CryplangParser#labelDefinition.
    def enterLabelDefinition(self, ctx:CryplangParser.LabelDefinitionContext):
        pass

    # Exit a parse tree produced by CryplangParser#labelDefinition.
    def exitLabelDefinition(self, ctx:CryplangParser.LabelDefinitionContext):
        pass


    # Enter a parse tree produced by CryplangParser#assemblySwitch.
    def enterAssemblySwitch(self, ctx:CryplangParser.AssemblySwitchContext):
        pass

    # Exit a parse tree produced by CryplangParser#assemblySwitch.
    def exitAssemblySwitch(self, ctx:CryplangParser.AssemblySwitchContext):
        pass


    # Enter a parse tree produced by CryplangParser#assemblyCase.
    def enterAssemblyCase(self, ctx:CryplangParser.AssemblyCaseContext):
        pass

    # Exit a parse tree produced by CryplangParser#assemblyCase.
    def exitAssemblyCase(self, ctx:CryplangParser.AssemblyCaseContext):
        pass


    # Enter a parse tree produced by CryplangParser#assemblyFunctionDefinition.
    def enterAssemblyFunctionDefinition(self, ctx:CryplangParser.AssemblyFunctionDefinitionContext):
        pass

    # Exit a parse tree produced by CryplangParser#assemblyFunctionDefinition.
    def exitAssemblyFunctionDefinition(self, ctx:CryplangParser.AssemblyFunctionDefinitionContext):
        pass


    # Enter a parse tree produced by CryplangParser#assemblyFunctionReturns.
    def enterAssemblyFunctionReturns(self, ctx:CryplangParser.AssemblyFunctionReturnsContext):
        pass

    # Exit a parse tree produced by CryplangParser#assemblyFunctionReturns.
    def exitAssemblyFunctionReturns(self, ctx:CryplangParser.AssemblyFunctionReturnsContext):
        pass


    # Enter a parse tree produced by CryplangParser#assemblyFor.
    def enterAssemblyFor(self, ctx:CryplangParser.AssemblyForContext):
        pass

    # Exit a parse tree produced by CryplangParser#assemblyFor.
    def exitAssemblyFor(self, ctx:CryplangParser.AssemblyForContext):
        pass


    # Enter a parse tree produced by CryplangParser#assemblyIf.
    def enterAssemblyIf(self, ctx:CryplangParser.AssemblyIfContext):
        pass

    # Exit a parse tree produced by CryplangParser#assemblyIf.
    def exitAssemblyIf(self, ctx:CryplangParser.AssemblyIfContext):
        pass


    # Enter a parse tree produced by CryplangParser#assemblyLiteral.
    def enterAssemblyLiteral(self, ctx:CryplangParser.AssemblyLiteralContext):
        pass

    # Exit a parse tree produced by CryplangParser#assemblyLiteral.
    def exitAssemblyLiteral(self, ctx:CryplangParser.AssemblyLiteralContext):
        pass


    # Enter a parse tree produced by CryplangParser#subAssembly.
    def enterSubAssembly(self, ctx:CryplangParser.SubAssemblyContext):
        pass

    # Exit a parse tree produced by CryplangParser#subAssembly.
    def exitSubAssembly(self, ctx:CryplangParser.SubAssemblyContext):
        pass


    # Enter a parse tree produced by CryplangParser#tupleExpression.
    def enterTupleExpression(self, ctx:CryplangParser.TupleExpressionContext):
        pass

    # Exit a parse tree produced by CryplangParser#tupleExpression.
    def exitTupleExpression(self, ctx:CryplangParser.TupleExpressionContext):
        pass


    # Enter a parse tree produced by CryplangParser#typeNameExpression.
    def enterTypeNameExpression(self, ctx:CryplangParser.TypeNameExpressionContext):
        pass

    # Exit a parse tree produced by CryplangParser#typeNameExpression.
    def exitTypeNameExpression(self, ctx:CryplangParser.TypeNameExpressionContext):
        pass


    # Enter a parse tree produced by CryplangParser#numberLiteral.
    def enterNumberLiteral(self, ctx:CryplangParser.NumberLiteralContext):
        pass

    # Exit a parse tree produced by CryplangParser#numberLiteral.
    def exitNumberLiteral(self, ctx:CryplangParser.NumberLiteralContext):
        pass


    # Enter a parse tree produced by CryplangParser#identifier.
    def enterIdentifier(self, ctx:CryplangParser.IdentifierContext):
        pass

    # Exit a parse tree produced by CryplangParser#identifier.
    def exitIdentifier(self, ctx:CryplangParser.IdentifierContext):
        pass



del CryplangParser