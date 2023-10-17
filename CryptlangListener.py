# Generated from Cryptlang.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .CryptlangParser import CryptlangParser
else:
    from CryptlangParser import CryptlangParser

# This class defines a complete listener for a parse tree produced by CryptlangParser.
class CryptlangListener(ParseTreeListener):

    # Enter a parse tree produced by CryptlangParser#sourceUnit.
    def enterSourceUnit(self, ctx:CryptlangParser.SourceUnitContext):
        pass

    # Exit a parse tree produced by CryptlangParser#sourceUnit.
    def exitSourceUnit(self, ctx:CryptlangParser.SourceUnitContext):
        pass


    # Enter a parse tree produced by CryptlangParser#pragmaDirective.
    def enterPragmaDirective(self, ctx:CryptlangParser.PragmaDirectiveContext):
        pass

    # Exit a parse tree produced by CryptlangParser#pragmaDirective.
    def exitPragmaDirective(self, ctx:CryptlangParser.PragmaDirectiveContext):
        pass


    # Enter a parse tree produced by CryptlangParser#pragmaName.
    def enterPragmaName(self, ctx:CryptlangParser.PragmaNameContext):
        pass

    # Exit a parse tree produced by CryptlangParser#pragmaName.
    def exitPragmaName(self, ctx:CryptlangParser.PragmaNameContext):
        pass


    # Enter a parse tree produced by CryptlangParser#pragmaValue.
    def enterPragmaValue(self, ctx:CryptlangParser.PragmaValueContext):
        pass

    # Exit a parse tree produced by CryptlangParser#pragmaValue.
    def exitPragmaValue(self, ctx:CryptlangParser.PragmaValueContext):
        pass


    # Enter a parse tree produced by CryptlangParser#version.
    def enterVersion(self, ctx:CryptlangParser.VersionContext):
        pass

    # Exit a parse tree produced by CryptlangParser#version.
    def exitVersion(self, ctx:CryptlangParser.VersionContext):
        pass


    # Enter a parse tree produced by CryptlangParser#versionOperator.
    def enterVersionOperator(self, ctx:CryptlangParser.VersionOperatorContext):
        pass

    # Exit a parse tree produced by CryptlangParser#versionOperator.
    def exitVersionOperator(self, ctx:CryptlangParser.VersionOperatorContext):
        pass


    # Enter a parse tree produced by CryptlangParser#versionConstraint.
    def enterVersionConstraint(self, ctx:CryptlangParser.VersionConstraintContext):
        pass

    # Exit a parse tree produced by CryptlangParser#versionConstraint.
    def exitVersionConstraint(self, ctx:CryptlangParser.VersionConstraintContext):
        pass


    # Enter a parse tree produced by CryptlangParser#importDeclaration.
    def enterImportDeclaration(self, ctx:CryptlangParser.ImportDeclarationContext):
        pass

    # Exit a parse tree produced by CryptlangParser#importDeclaration.
    def exitImportDeclaration(self, ctx:CryptlangParser.ImportDeclarationContext):
        pass


    # Enter a parse tree produced by CryptlangParser#importDirective.
    def enterImportDirective(self, ctx:CryptlangParser.ImportDirectiveContext):
        pass

    # Exit a parse tree produced by CryptlangParser#importDirective.
    def exitImportDirective(self, ctx:CryptlangParser.ImportDirectiveContext):
        pass


    # Enter a parse tree produced by CryptlangParser#natSpec.
    def enterNatSpec(self, ctx:CryptlangParser.NatSpecContext):
        pass

    # Exit a parse tree produced by CryptlangParser#natSpec.
    def exitNatSpec(self, ctx:CryptlangParser.NatSpecContext):
        pass


    # Enter a parse tree produced by CryptlangParser#contractDefinition.
    def enterContractDefinition(self, ctx:CryptlangParser.ContractDefinitionContext):
        pass

    # Exit a parse tree produced by CryptlangParser#contractDefinition.
    def exitContractDefinition(self, ctx:CryptlangParser.ContractDefinitionContext):
        pass


    # Enter a parse tree produced by CryptlangParser#inheritanceSpecifier.
    def enterInheritanceSpecifier(self, ctx:CryptlangParser.InheritanceSpecifierContext):
        pass

    # Exit a parse tree produced by CryptlangParser#inheritanceSpecifier.
    def exitInheritanceSpecifier(self, ctx:CryptlangParser.InheritanceSpecifierContext):
        pass


    # Enter a parse tree produced by CryptlangParser#contractPart.
    def enterContractPart(self, ctx:CryptlangParser.ContractPartContext):
        pass

    # Exit a parse tree produced by CryptlangParser#contractPart.
    def exitContractPart(self, ctx:CryptlangParser.ContractPartContext):
        pass


    # Enter a parse tree produced by CryptlangParser#stateVariableDeclaration.
    def enterStateVariableDeclaration(self, ctx:CryptlangParser.StateVariableDeclarationContext):
        pass

    # Exit a parse tree produced by CryptlangParser#stateVariableDeclaration.
    def exitStateVariableDeclaration(self, ctx:CryptlangParser.StateVariableDeclarationContext):
        pass


    # Enter a parse tree produced by CryptlangParser#usingForDeclaration.
    def enterUsingForDeclaration(self, ctx:CryptlangParser.UsingForDeclarationContext):
        pass

    # Exit a parse tree produced by CryptlangParser#usingForDeclaration.
    def exitUsingForDeclaration(self, ctx:CryptlangParser.UsingForDeclarationContext):
        pass


    # Enter a parse tree produced by CryptlangParser#structDefinition.
    def enterStructDefinition(self, ctx:CryptlangParser.StructDefinitionContext):
        pass

    # Exit a parse tree produced by CryptlangParser#structDefinition.
    def exitStructDefinition(self, ctx:CryptlangParser.StructDefinitionContext):
        pass


    # Enter a parse tree produced by CryptlangParser#constructorDefinition.
    def enterConstructorDefinition(self, ctx:CryptlangParser.ConstructorDefinitionContext):
        pass

    # Exit a parse tree produced by CryptlangParser#constructorDefinition.
    def exitConstructorDefinition(self, ctx:CryptlangParser.ConstructorDefinitionContext):
        pass


    # Enter a parse tree produced by CryptlangParser#modifierDefinition.
    def enterModifierDefinition(self, ctx:CryptlangParser.ModifierDefinitionContext):
        pass

    # Exit a parse tree produced by CryptlangParser#modifierDefinition.
    def exitModifierDefinition(self, ctx:CryptlangParser.ModifierDefinitionContext):
        pass


    # Enter a parse tree produced by CryptlangParser#modifierInvocation.
    def enterModifierInvocation(self, ctx:CryptlangParser.ModifierInvocationContext):
        pass

    # Exit a parse tree produced by CryptlangParser#modifierInvocation.
    def exitModifierInvocation(self, ctx:CryptlangParser.ModifierInvocationContext):
        pass


    # Enter a parse tree produced by CryptlangParser#functionDefinition.
    def enterFunctionDefinition(self, ctx:CryptlangParser.FunctionDefinitionContext):
        pass

    # Exit a parse tree produced by CryptlangParser#functionDefinition.
    def exitFunctionDefinition(self, ctx:CryptlangParser.FunctionDefinitionContext):
        pass


    # Enter a parse tree produced by CryptlangParser#returnParameters.
    def enterReturnParameters(self, ctx:CryptlangParser.ReturnParametersContext):
        pass

    # Exit a parse tree produced by CryptlangParser#returnParameters.
    def exitReturnParameters(self, ctx:CryptlangParser.ReturnParametersContext):
        pass


    # Enter a parse tree produced by CryptlangParser#modifierList.
    def enterModifierList(self, ctx:CryptlangParser.ModifierListContext):
        pass

    # Exit a parse tree produced by CryptlangParser#modifierList.
    def exitModifierList(self, ctx:CryptlangParser.ModifierListContext):
        pass


    # Enter a parse tree produced by CryptlangParser#eventDefinition.
    def enterEventDefinition(self, ctx:CryptlangParser.EventDefinitionContext):
        pass

    # Exit a parse tree produced by CryptlangParser#eventDefinition.
    def exitEventDefinition(self, ctx:CryptlangParser.EventDefinitionContext):
        pass


    # Enter a parse tree produced by CryptlangParser#enumValue.
    def enterEnumValue(self, ctx:CryptlangParser.EnumValueContext):
        pass

    # Exit a parse tree produced by CryptlangParser#enumValue.
    def exitEnumValue(self, ctx:CryptlangParser.EnumValueContext):
        pass


    # Enter a parse tree produced by CryptlangParser#enumDefinition.
    def enterEnumDefinition(self, ctx:CryptlangParser.EnumDefinitionContext):
        pass

    # Exit a parse tree produced by CryptlangParser#enumDefinition.
    def exitEnumDefinition(self, ctx:CryptlangParser.EnumDefinitionContext):
        pass


    # Enter a parse tree produced by CryptlangParser#parameterList.
    def enterParameterList(self, ctx:CryptlangParser.ParameterListContext):
        pass

    # Exit a parse tree produced by CryptlangParser#parameterList.
    def exitParameterList(self, ctx:CryptlangParser.ParameterListContext):
        pass


    # Enter a parse tree produced by CryptlangParser#parameter.
    def enterParameter(self, ctx:CryptlangParser.ParameterContext):
        pass

    # Exit a parse tree produced by CryptlangParser#parameter.
    def exitParameter(self, ctx:CryptlangParser.ParameterContext):
        pass


    # Enter a parse tree produced by CryptlangParser#eventParameterList.
    def enterEventParameterList(self, ctx:CryptlangParser.EventParameterListContext):
        pass

    # Exit a parse tree produced by CryptlangParser#eventParameterList.
    def exitEventParameterList(self, ctx:CryptlangParser.EventParameterListContext):
        pass


    # Enter a parse tree produced by CryptlangParser#eventParameter.
    def enterEventParameter(self, ctx:CryptlangParser.EventParameterContext):
        pass

    # Exit a parse tree produced by CryptlangParser#eventParameter.
    def exitEventParameter(self, ctx:CryptlangParser.EventParameterContext):
        pass


    # Enter a parse tree produced by CryptlangParser#functionTypeParameterList.
    def enterFunctionTypeParameterList(self, ctx:CryptlangParser.FunctionTypeParameterListContext):
        pass

    # Exit a parse tree produced by CryptlangParser#functionTypeParameterList.
    def exitFunctionTypeParameterList(self, ctx:CryptlangParser.FunctionTypeParameterListContext):
        pass


    # Enter a parse tree produced by CryptlangParser#functionTypeParameter.
    def enterFunctionTypeParameter(self, ctx:CryptlangParser.FunctionTypeParameterContext):
        pass

    # Exit a parse tree produced by CryptlangParser#functionTypeParameter.
    def exitFunctionTypeParameter(self, ctx:CryptlangParser.FunctionTypeParameterContext):
        pass


    # Enter a parse tree produced by CryptlangParser#variableDeclaration.
    def enterVariableDeclaration(self, ctx:CryptlangParser.VariableDeclarationContext):
        pass

    # Exit a parse tree produced by CryptlangParser#variableDeclaration.
    def exitVariableDeclaration(self, ctx:CryptlangParser.VariableDeclarationContext):
        pass


    # Enter a parse tree produced by CryptlangParser#typeName.
    def enterTypeName(self, ctx:CryptlangParser.TypeNameContext):
        pass

    # Exit a parse tree produced by CryptlangParser#typeName.
    def exitTypeName(self, ctx:CryptlangParser.TypeNameContext):
        pass


    # Enter a parse tree produced by CryptlangParser#userDefinedTypeName.
    def enterUserDefinedTypeName(self, ctx:CryptlangParser.UserDefinedTypeNameContext):
        pass

    # Exit a parse tree produced by CryptlangParser#userDefinedTypeName.
    def exitUserDefinedTypeName(self, ctx:CryptlangParser.UserDefinedTypeNameContext):
        pass


    # Enter a parse tree produced by CryptlangParser#mapping.
    def enterMapping(self, ctx:CryptlangParser.MappingContext):
        pass

    # Exit a parse tree produced by CryptlangParser#mapping.
    def exitMapping(self, ctx:CryptlangParser.MappingContext):
        pass


    # Enter a parse tree produced by CryptlangParser#functionTypeName.
    def enterFunctionTypeName(self, ctx:CryptlangParser.FunctionTypeNameContext):
        pass

    # Exit a parse tree produced by CryptlangParser#functionTypeName.
    def exitFunctionTypeName(self, ctx:CryptlangParser.FunctionTypeNameContext):
        pass


    # Enter a parse tree produced by CryptlangParser#storageLocation.
    def enterStorageLocation(self, ctx:CryptlangParser.StorageLocationContext):
        pass

    # Exit a parse tree produced by CryptlangParser#storageLocation.
    def exitStorageLocation(self, ctx:CryptlangParser.StorageLocationContext):
        pass


    # Enter a parse tree produced by CryptlangParser#stateMutability.
    def enterStateMutability(self, ctx:CryptlangParser.StateMutabilityContext):
        pass

    # Exit a parse tree produced by CryptlangParser#stateMutability.
    def exitStateMutability(self, ctx:CryptlangParser.StateMutabilityContext):
        pass


    # Enter a parse tree produced by CryptlangParser#block.
    def enterBlock(self, ctx:CryptlangParser.BlockContext):
        pass

    # Exit a parse tree produced by CryptlangParser#block.
    def exitBlock(self, ctx:CryptlangParser.BlockContext):
        pass


    # Enter a parse tree produced by CryptlangParser#statement.
    def enterStatement(self, ctx:CryptlangParser.StatementContext):
        pass

    # Exit a parse tree produced by CryptlangParser#statement.
    def exitStatement(self, ctx:CryptlangParser.StatementContext):
        pass


    # Enter a parse tree produced by CryptlangParser#expressionStatement.
    def enterExpressionStatement(self, ctx:CryptlangParser.ExpressionStatementContext):
        pass

    # Exit a parse tree produced by CryptlangParser#expressionStatement.
    def exitExpressionStatement(self, ctx:CryptlangParser.ExpressionStatementContext):
        pass


    # Enter a parse tree produced by CryptlangParser#statementSymbol.
    def enterStatementSymbol(self, ctx:CryptlangParser.StatementSymbolContext):
        pass

    # Exit a parse tree produced by CryptlangParser#statementSymbol.
    def exitStatementSymbol(self, ctx:CryptlangParser.StatementSymbolContext):
        pass


    # Enter a parse tree produced by CryptlangParser#privateSymbol.
    def enterPrivateSymbol(self, ctx:CryptlangParser.PrivateSymbolContext):
        pass

    # Exit a parse tree produced by CryptlangParser#privateSymbol.
    def exitPrivateSymbol(self, ctx:CryptlangParser.PrivateSymbolContext):
        pass


    # Enter a parse tree produced by CryptlangParser#privateIdentifier.
    def enterPrivateIdentifier(self, ctx:CryptlangParser.PrivateIdentifierContext):
        pass

    # Exit a parse tree produced by CryptlangParser#privateIdentifier.
    def exitPrivateIdentifier(self, ctx:CryptlangParser.PrivateIdentifierContext):
        pass


    # Enter a parse tree produced by CryptlangParser#privateIdentifierList.
    def enterPrivateIdentifierList(self, ctx:CryptlangParser.PrivateIdentifierListContext):
        pass

    # Exit a parse tree produced by CryptlangParser#privateIdentifierList.
    def exitPrivateIdentifierList(self, ctx:CryptlangParser.PrivateIdentifierListContext):
        pass


    # Enter a parse tree produced by CryptlangParser#hashMethod.
    def enterHashMethod(self, ctx:CryptlangParser.HashMethodContext):
        pass

    # Exit a parse tree produced by CryptlangParser#hashMethod.
    def exitHashMethod(self, ctx:CryptlangParser.HashMethodContext):
        pass


    # Enter a parse tree produced by CryptlangParser#signatureMethod.
    def enterSignatureMethod(self, ctx:CryptlangParser.SignatureMethodContext):
        pass

    # Exit a parse tree produced by CryptlangParser#signatureMethod.
    def exitSignatureMethod(self, ctx:CryptlangParser.SignatureMethodContext):
        pass


    # Enter a parse tree produced by CryptlangParser#commitmentMethod.
    def enterCommitmentMethod(self, ctx:CryptlangParser.CommitmentMethodContext):
        pass

    # Exit a parse tree produced by CryptlangParser#commitmentMethod.
    def exitCommitmentMethod(self, ctx:CryptlangParser.CommitmentMethodContext):
        pass


    # Enter a parse tree produced by CryptlangParser#proofMethod.
    def enterProofMethod(self, ctx:CryptlangParser.ProofMethodContext):
        pass

    # Exit a parse tree produced by CryptlangParser#proofMethod.
    def exitProofMethod(self, ctx:CryptlangParser.ProofMethodContext):
        pass


    # Enter a parse tree produced by CryptlangParser#signatureStatement.
    def enterSignatureStatement(self, ctx:CryptlangParser.SignatureStatementContext):
        pass

    # Exit a parse tree produced by CryptlangParser#signatureStatement.
    def exitSignatureStatement(self, ctx:CryptlangParser.SignatureStatementContext):
        pass


    # Enter a parse tree produced by CryptlangParser#commitmentStatement.
    def enterCommitmentStatement(self, ctx:CryptlangParser.CommitmentStatementContext):
        pass

    # Exit a parse tree produced by CryptlangParser#commitmentStatement.
    def exitCommitmentStatement(self, ctx:CryptlangParser.CommitmentStatementContext):
        pass


    # Enter a parse tree produced by CryptlangParser#taskStatement.
    def enterTaskStatement(self, ctx:CryptlangParser.TaskStatementContext):
        pass

    # Exit a parse tree produced by CryptlangParser#taskStatement.
    def exitTaskStatement(self, ctx:CryptlangParser.TaskStatementContext):
        pass


    # Enter a parse tree produced by CryptlangParser#otherStatement.
    def enterOtherStatement(self, ctx:CryptlangParser.OtherStatementContext):
        pass

    # Exit a parse tree produced by CryptlangParser#otherStatement.
    def exitOtherStatement(self, ctx:CryptlangParser.OtherStatementContext):
        pass


    # Enter a parse tree produced by CryptlangParser#ifStatement.
    def enterIfStatement(self, ctx:CryptlangParser.IfStatementContext):
        pass

    # Exit a parse tree produced by CryptlangParser#ifStatement.
    def exitIfStatement(self, ctx:CryptlangParser.IfStatementContext):
        pass


    # Enter a parse tree produced by CryptlangParser#whileStatement.
    def enterWhileStatement(self, ctx:CryptlangParser.WhileStatementContext):
        pass

    # Exit a parse tree produced by CryptlangParser#whileStatement.
    def exitWhileStatement(self, ctx:CryptlangParser.WhileStatementContext):
        pass


    # Enter a parse tree produced by CryptlangParser#simpleStatement.
    def enterSimpleStatement(self, ctx:CryptlangParser.SimpleStatementContext):
        pass

    # Exit a parse tree produced by CryptlangParser#simpleStatement.
    def exitSimpleStatement(self, ctx:CryptlangParser.SimpleStatementContext):
        pass


    # Enter a parse tree produced by CryptlangParser#forStatement.
    def enterForStatement(self, ctx:CryptlangParser.ForStatementContext):
        pass

    # Exit a parse tree produced by CryptlangParser#forStatement.
    def exitForStatement(self, ctx:CryptlangParser.ForStatementContext):
        pass


    # Enter a parse tree produced by CryptlangParser#inlineAssemblyStatement.
    def enterInlineAssemblyStatement(self, ctx:CryptlangParser.InlineAssemblyStatementContext):
        pass

    # Exit a parse tree produced by CryptlangParser#inlineAssemblyStatement.
    def exitInlineAssemblyStatement(self, ctx:CryptlangParser.InlineAssemblyStatementContext):
        pass


    # Enter a parse tree produced by CryptlangParser#doWhileStatement.
    def enterDoWhileStatement(self, ctx:CryptlangParser.DoWhileStatementContext):
        pass

    # Exit a parse tree produced by CryptlangParser#doWhileStatement.
    def exitDoWhileStatement(self, ctx:CryptlangParser.DoWhileStatementContext):
        pass


    # Enter a parse tree produced by CryptlangParser#continueStatement.
    def enterContinueStatement(self, ctx:CryptlangParser.ContinueStatementContext):
        pass

    # Exit a parse tree produced by CryptlangParser#continueStatement.
    def exitContinueStatement(self, ctx:CryptlangParser.ContinueStatementContext):
        pass


    # Enter a parse tree produced by CryptlangParser#breakStatement.
    def enterBreakStatement(self, ctx:CryptlangParser.BreakStatementContext):
        pass

    # Exit a parse tree produced by CryptlangParser#breakStatement.
    def exitBreakStatement(self, ctx:CryptlangParser.BreakStatementContext):
        pass


    # Enter a parse tree produced by CryptlangParser#returnStatement.
    def enterReturnStatement(self, ctx:CryptlangParser.ReturnStatementContext):
        pass

    # Exit a parse tree produced by CryptlangParser#returnStatement.
    def exitReturnStatement(self, ctx:CryptlangParser.ReturnStatementContext):
        pass


    # Enter a parse tree produced by CryptlangParser#throwStatement.
    def enterThrowStatement(self, ctx:CryptlangParser.ThrowStatementContext):
        pass

    # Exit a parse tree produced by CryptlangParser#throwStatement.
    def exitThrowStatement(self, ctx:CryptlangParser.ThrowStatementContext):
        pass


    # Enter a parse tree produced by CryptlangParser#emitStatement.
    def enterEmitStatement(self, ctx:CryptlangParser.EmitStatementContext):
        pass

    # Exit a parse tree produced by CryptlangParser#emitStatement.
    def exitEmitStatement(self, ctx:CryptlangParser.EmitStatementContext):
        pass


    # Enter a parse tree produced by CryptlangParser#variableDeclarationStatement.
    def enterVariableDeclarationStatement(self, ctx:CryptlangParser.VariableDeclarationStatementContext):
        pass

    # Exit a parse tree produced by CryptlangParser#variableDeclarationStatement.
    def exitVariableDeclarationStatement(self, ctx:CryptlangParser.VariableDeclarationStatementContext):
        pass


    # Enter a parse tree produced by CryptlangParser#variableDeclarationList.
    def enterVariableDeclarationList(self, ctx:CryptlangParser.VariableDeclarationListContext):
        pass

    # Exit a parse tree produced by CryptlangParser#variableDeclarationList.
    def exitVariableDeclarationList(self, ctx:CryptlangParser.VariableDeclarationListContext):
        pass


    # Enter a parse tree produced by CryptlangParser#identifierList.
    def enterIdentifierList(self, ctx:CryptlangParser.IdentifierListContext):
        pass

    # Exit a parse tree produced by CryptlangParser#identifierList.
    def exitIdentifierList(self, ctx:CryptlangParser.IdentifierListContext):
        pass


    # Enter a parse tree produced by CryptlangParser#elementaryTypeName.
    def enterElementaryTypeName(self, ctx:CryptlangParser.ElementaryTypeNameContext):
        pass

    # Exit a parse tree produced by CryptlangParser#elementaryTypeName.
    def exitElementaryTypeName(self, ctx:CryptlangParser.ElementaryTypeNameContext):
        pass


    # Enter a parse tree produced by CryptlangParser#expression.
    def enterExpression(self, ctx:CryptlangParser.ExpressionContext):
        pass

    # Exit a parse tree produced by CryptlangParser#expression.
    def exitExpression(self, ctx:CryptlangParser.ExpressionContext):
        pass


    # Enter a parse tree produced by CryptlangParser#primaryExpression.
    def enterPrimaryExpression(self, ctx:CryptlangParser.PrimaryExpressionContext):
        pass

    # Exit a parse tree produced by CryptlangParser#primaryExpression.
    def exitPrimaryExpression(self, ctx:CryptlangParser.PrimaryExpressionContext):
        pass


    # Enter a parse tree produced by CryptlangParser#expressionList.
    def enterExpressionList(self, ctx:CryptlangParser.ExpressionListContext):
        pass

    # Exit a parse tree produced by CryptlangParser#expressionList.
    def exitExpressionList(self, ctx:CryptlangParser.ExpressionListContext):
        pass


    # Enter a parse tree produced by CryptlangParser#nameValueList.
    def enterNameValueList(self, ctx:CryptlangParser.NameValueListContext):
        pass

    # Exit a parse tree produced by CryptlangParser#nameValueList.
    def exitNameValueList(self, ctx:CryptlangParser.NameValueListContext):
        pass


    # Enter a parse tree produced by CryptlangParser#nameValue.
    def enterNameValue(self, ctx:CryptlangParser.NameValueContext):
        pass

    # Exit a parse tree produced by CryptlangParser#nameValue.
    def exitNameValue(self, ctx:CryptlangParser.NameValueContext):
        pass


    # Enter a parse tree produced by CryptlangParser#functionCallArguments.
    def enterFunctionCallArguments(self, ctx:CryptlangParser.FunctionCallArgumentsContext):
        pass

    # Exit a parse tree produced by CryptlangParser#functionCallArguments.
    def exitFunctionCallArguments(self, ctx:CryptlangParser.FunctionCallArgumentsContext):
        pass


    # Enter a parse tree produced by CryptlangParser#functionCall.
    def enterFunctionCall(self, ctx:CryptlangParser.FunctionCallContext):
        pass

    # Exit a parse tree produced by CryptlangParser#functionCall.
    def exitFunctionCall(self, ctx:CryptlangParser.FunctionCallContext):
        pass


    # Enter a parse tree produced by CryptlangParser#assemblyBlock.
    def enterAssemblyBlock(self, ctx:CryptlangParser.AssemblyBlockContext):
        pass

    # Exit a parse tree produced by CryptlangParser#assemblyBlock.
    def exitAssemblyBlock(self, ctx:CryptlangParser.AssemblyBlockContext):
        pass


    # Enter a parse tree produced by CryptlangParser#assemblyItem.
    def enterAssemblyItem(self, ctx:CryptlangParser.AssemblyItemContext):
        pass

    # Exit a parse tree produced by CryptlangParser#assemblyItem.
    def exitAssemblyItem(self, ctx:CryptlangParser.AssemblyItemContext):
        pass


    # Enter a parse tree produced by CryptlangParser#assemblyExpression.
    def enterAssemblyExpression(self, ctx:CryptlangParser.AssemblyExpressionContext):
        pass

    # Exit a parse tree produced by CryptlangParser#assemblyExpression.
    def exitAssemblyExpression(self, ctx:CryptlangParser.AssemblyExpressionContext):
        pass


    # Enter a parse tree produced by CryptlangParser#assemblyCall.
    def enterAssemblyCall(self, ctx:CryptlangParser.AssemblyCallContext):
        pass

    # Exit a parse tree produced by CryptlangParser#assemblyCall.
    def exitAssemblyCall(self, ctx:CryptlangParser.AssemblyCallContext):
        pass


    # Enter a parse tree produced by CryptlangParser#assemblyLocalDefinition.
    def enterAssemblyLocalDefinition(self, ctx:CryptlangParser.AssemblyLocalDefinitionContext):
        pass

    # Exit a parse tree produced by CryptlangParser#assemblyLocalDefinition.
    def exitAssemblyLocalDefinition(self, ctx:CryptlangParser.AssemblyLocalDefinitionContext):
        pass


    # Enter a parse tree produced by CryptlangParser#assemblyAssignment.
    def enterAssemblyAssignment(self, ctx:CryptlangParser.AssemblyAssignmentContext):
        pass

    # Exit a parse tree produced by CryptlangParser#assemblyAssignment.
    def exitAssemblyAssignment(self, ctx:CryptlangParser.AssemblyAssignmentContext):
        pass


    # Enter a parse tree produced by CryptlangParser#assemblyIdentifierOrList.
    def enterAssemblyIdentifierOrList(self, ctx:CryptlangParser.AssemblyIdentifierOrListContext):
        pass

    # Exit a parse tree produced by CryptlangParser#assemblyIdentifierOrList.
    def exitAssemblyIdentifierOrList(self, ctx:CryptlangParser.AssemblyIdentifierOrListContext):
        pass


    # Enter a parse tree produced by CryptlangParser#assemblyIdentifierList.
    def enterAssemblyIdentifierList(self, ctx:CryptlangParser.AssemblyIdentifierListContext):
        pass

    # Exit a parse tree produced by CryptlangParser#assemblyIdentifierList.
    def exitAssemblyIdentifierList(self, ctx:CryptlangParser.AssemblyIdentifierListContext):
        pass


    # Enter a parse tree produced by CryptlangParser#assemblyStackAssignment.
    def enterAssemblyStackAssignment(self, ctx:CryptlangParser.AssemblyStackAssignmentContext):
        pass

    # Exit a parse tree produced by CryptlangParser#assemblyStackAssignment.
    def exitAssemblyStackAssignment(self, ctx:CryptlangParser.AssemblyStackAssignmentContext):
        pass


    # Enter a parse tree produced by CryptlangParser#labelDefinition.
    def enterLabelDefinition(self, ctx:CryptlangParser.LabelDefinitionContext):
        pass

    # Exit a parse tree produced by CryptlangParser#labelDefinition.
    def exitLabelDefinition(self, ctx:CryptlangParser.LabelDefinitionContext):
        pass


    # Enter a parse tree produced by CryptlangParser#assemblySwitch.
    def enterAssemblySwitch(self, ctx:CryptlangParser.AssemblySwitchContext):
        pass

    # Exit a parse tree produced by CryptlangParser#assemblySwitch.
    def exitAssemblySwitch(self, ctx:CryptlangParser.AssemblySwitchContext):
        pass


    # Enter a parse tree produced by CryptlangParser#assemblyCase.
    def enterAssemblyCase(self, ctx:CryptlangParser.AssemblyCaseContext):
        pass

    # Exit a parse tree produced by CryptlangParser#assemblyCase.
    def exitAssemblyCase(self, ctx:CryptlangParser.AssemblyCaseContext):
        pass


    # Enter a parse tree produced by CryptlangParser#assemblyFunctionDefinition.
    def enterAssemblyFunctionDefinition(self, ctx:CryptlangParser.AssemblyFunctionDefinitionContext):
        pass

    # Exit a parse tree produced by CryptlangParser#assemblyFunctionDefinition.
    def exitAssemblyFunctionDefinition(self, ctx:CryptlangParser.AssemblyFunctionDefinitionContext):
        pass


    # Enter a parse tree produced by CryptlangParser#assemblyFunctionReturns.
    def enterAssemblyFunctionReturns(self, ctx:CryptlangParser.AssemblyFunctionReturnsContext):
        pass

    # Exit a parse tree produced by CryptlangParser#assemblyFunctionReturns.
    def exitAssemblyFunctionReturns(self, ctx:CryptlangParser.AssemblyFunctionReturnsContext):
        pass


    # Enter a parse tree produced by CryptlangParser#assemblyFor.
    def enterAssemblyFor(self, ctx:CryptlangParser.AssemblyForContext):
        pass

    # Exit a parse tree produced by CryptlangParser#assemblyFor.
    def exitAssemblyFor(self, ctx:CryptlangParser.AssemblyForContext):
        pass


    # Enter a parse tree produced by CryptlangParser#assemblyIf.
    def enterAssemblyIf(self, ctx:CryptlangParser.AssemblyIfContext):
        pass

    # Exit a parse tree produced by CryptlangParser#assemblyIf.
    def exitAssemblyIf(self, ctx:CryptlangParser.AssemblyIfContext):
        pass


    # Enter a parse tree produced by CryptlangParser#assemblyLiteral.
    def enterAssemblyLiteral(self, ctx:CryptlangParser.AssemblyLiteralContext):
        pass

    # Exit a parse tree produced by CryptlangParser#assemblyLiteral.
    def exitAssemblyLiteral(self, ctx:CryptlangParser.AssemblyLiteralContext):
        pass


    # Enter a parse tree produced by CryptlangParser#subAssembly.
    def enterSubAssembly(self, ctx:CryptlangParser.SubAssemblyContext):
        pass

    # Exit a parse tree produced by CryptlangParser#subAssembly.
    def exitSubAssembly(self, ctx:CryptlangParser.SubAssemblyContext):
        pass


    # Enter a parse tree produced by CryptlangParser#tupleExpression.
    def enterTupleExpression(self, ctx:CryptlangParser.TupleExpressionContext):
        pass

    # Exit a parse tree produced by CryptlangParser#tupleExpression.
    def exitTupleExpression(self, ctx:CryptlangParser.TupleExpressionContext):
        pass


    # Enter a parse tree produced by CryptlangParser#typeNameExpression.
    def enterTypeNameExpression(self, ctx:CryptlangParser.TypeNameExpressionContext):
        pass

    # Exit a parse tree produced by CryptlangParser#typeNameExpression.
    def exitTypeNameExpression(self, ctx:CryptlangParser.TypeNameExpressionContext):
        pass


    # Enter a parse tree produced by CryptlangParser#numberLiteral.
    def enterNumberLiteral(self, ctx:CryptlangParser.NumberLiteralContext):
        pass

    # Exit a parse tree produced by CryptlangParser#numberLiteral.
    def exitNumberLiteral(self, ctx:CryptlangParser.NumberLiteralContext):
        pass


    # Enter a parse tree produced by CryptlangParser#identifier.
    def enterIdentifier(self, ctx:CryptlangParser.IdentifierContext):
        pass

    # Exit a parse tree produced by CryptlangParser#identifier.
    def exitIdentifier(self, ctx:CryptlangParser.IdentifierContext):
        pass



del CryptlangParser