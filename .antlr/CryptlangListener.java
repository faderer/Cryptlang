// Generated from /home/xialb/dsl_project/Cryplang/Cryptlang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CryptlangParser}.
 */
public interface CryptlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#sourceUnit}.
	 * @param ctx the parse tree
	 */
	void enterSourceUnit(CryptlangParser.SourceUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#sourceUnit}.
	 * @param ctx the parse tree
	 */
	void exitSourceUnit(CryptlangParser.SourceUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#pragmaDirective}.
	 * @param ctx the parse tree
	 */
	void enterPragmaDirective(CryptlangParser.PragmaDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#pragmaDirective}.
	 * @param ctx the parse tree
	 */
	void exitPragmaDirective(CryptlangParser.PragmaDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#pragmaName}.
	 * @param ctx the parse tree
	 */
	void enterPragmaName(CryptlangParser.PragmaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#pragmaName}.
	 * @param ctx the parse tree
	 */
	void exitPragmaName(CryptlangParser.PragmaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#pragmaValue}.
	 * @param ctx the parse tree
	 */
	void enterPragmaValue(CryptlangParser.PragmaValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#pragmaValue}.
	 * @param ctx the parse tree
	 */
	void exitPragmaValue(CryptlangParser.PragmaValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#version}.
	 * @param ctx the parse tree
	 */
	void enterVersion(CryptlangParser.VersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#version}.
	 * @param ctx the parse tree
	 */
	void exitVersion(CryptlangParser.VersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#versionOperator}.
	 * @param ctx the parse tree
	 */
	void enterVersionOperator(CryptlangParser.VersionOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#versionOperator}.
	 * @param ctx the parse tree
	 */
	void exitVersionOperator(CryptlangParser.VersionOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#versionConstraint}.
	 * @param ctx the parse tree
	 */
	void enterVersionConstraint(CryptlangParser.VersionConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#versionConstraint}.
	 * @param ctx the parse tree
	 */
	void exitVersionConstraint(CryptlangParser.VersionConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(CryptlangParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(CryptlangParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#importDirective}.
	 * @param ctx the parse tree
	 */
	void enterImportDirective(CryptlangParser.ImportDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#importDirective}.
	 * @param ctx the parse tree
	 */
	void exitImportDirective(CryptlangParser.ImportDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#natSpec}.
	 * @param ctx the parse tree
	 */
	void enterNatSpec(CryptlangParser.NatSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#natSpec}.
	 * @param ctx the parse tree
	 */
	void exitNatSpec(CryptlangParser.NatSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#contractDefinition}.
	 * @param ctx the parse tree
	 */
	void enterContractDefinition(CryptlangParser.ContractDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#contractDefinition}.
	 * @param ctx the parse tree
	 */
	void exitContractDefinition(CryptlangParser.ContractDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#inheritanceSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterInheritanceSpecifier(CryptlangParser.InheritanceSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#inheritanceSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitInheritanceSpecifier(CryptlangParser.InheritanceSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#contractPart}.
	 * @param ctx the parse tree
	 */
	void enterContractPart(CryptlangParser.ContractPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#contractPart}.
	 * @param ctx the parse tree
	 */
	void exitContractPart(CryptlangParser.ContractPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#stateVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStateVariableDeclaration(CryptlangParser.StateVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#stateVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStateVariableDeclaration(CryptlangParser.StateVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#usingForDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUsingForDeclaration(CryptlangParser.UsingForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#usingForDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUsingForDeclaration(CryptlangParser.UsingForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStructDefinition(CryptlangParser.StructDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStructDefinition(CryptlangParser.StructDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#constructorDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDefinition(CryptlangParser.ConstructorDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#constructorDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDefinition(CryptlangParser.ConstructorDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#modifierDefinition}.
	 * @param ctx the parse tree
	 */
	void enterModifierDefinition(CryptlangParser.ModifierDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#modifierDefinition}.
	 * @param ctx the parse tree
	 */
	void exitModifierDefinition(CryptlangParser.ModifierDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#modifierInvocation}.
	 * @param ctx the parse tree
	 */
	void enterModifierInvocation(CryptlangParser.ModifierInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#modifierInvocation}.
	 * @param ctx the parse tree
	 */
	void exitModifierInvocation(CryptlangParser.ModifierInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(CryptlangParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(CryptlangParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#returnParameters}.
	 * @param ctx the parse tree
	 */
	void enterReturnParameters(CryptlangParser.ReturnParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#returnParameters}.
	 * @param ctx the parse tree
	 */
	void exitReturnParameters(CryptlangParser.ReturnParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#modifierList}.
	 * @param ctx the parse tree
	 */
	void enterModifierList(CryptlangParser.ModifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#modifierList}.
	 * @param ctx the parse tree
	 */
	void exitModifierList(CryptlangParser.ModifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#eventDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEventDefinition(CryptlangParser.EventDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#eventDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEventDefinition(CryptlangParser.EventDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void enterEnumValue(CryptlangParser.EnumValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void exitEnumValue(CryptlangParser.EnumValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumDefinition(CryptlangParser.EnumDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#enumDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumDefinition(CryptlangParser.EnumDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(CryptlangParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(CryptlangParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(CryptlangParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(CryptlangParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#eventParameterList}.
	 * @param ctx the parse tree
	 */
	void enterEventParameterList(CryptlangParser.EventParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#eventParameterList}.
	 * @param ctx the parse tree
	 */
	void exitEventParameterList(CryptlangParser.EventParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#eventParameter}.
	 * @param ctx the parse tree
	 */
	void enterEventParameter(CryptlangParser.EventParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#eventParameter}.
	 * @param ctx the parse tree
	 */
	void exitEventParameter(CryptlangParser.EventParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#functionTypeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeParameterList(CryptlangParser.FunctionTypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#functionTypeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeParameterList(CryptlangParser.FunctionTypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#functionTypeParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeParameter(CryptlangParser.FunctionTypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#functionTypeParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeParameter(CryptlangParser.FunctionTypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(CryptlangParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(CryptlangParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(CryptlangParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(CryptlangParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#userDefinedTypeName}.
	 * @param ctx the parse tree
	 */
	void enterUserDefinedTypeName(CryptlangParser.UserDefinedTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#userDefinedTypeName}.
	 * @param ctx the parse tree
	 */
	void exitUserDefinedTypeName(CryptlangParser.UserDefinedTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapping(CryptlangParser.MappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapping(CryptlangParser.MappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#functionTypeName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeName(CryptlangParser.FunctionTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#functionTypeName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeName(CryptlangParser.FunctionTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#storageLocation}.
	 * @param ctx the parse tree
	 */
	void enterStorageLocation(CryptlangParser.StorageLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#storageLocation}.
	 * @param ctx the parse tree
	 */
	void exitStorageLocation(CryptlangParser.StorageLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#stateMutability}.
	 * @param ctx the parse tree
	 */
	void enterStateMutability(CryptlangParser.StateMutabilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#stateMutability}.
	 * @param ctx the parse tree
	 */
	void exitStateMutability(CryptlangParser.StateMutabilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CryptlangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CryptlangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CryptlangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CryptlangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(CryptlangParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(CryptlangParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#statementSymbol}.
	 * @param ctx the parse tree
	 */
	void enterStatementSymbol(CryptlangParser.StatementSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#statementSymbol}.
	 * @param ctx the parse tree
	 */
	void exitStatementSymbol(CryptlangParser.StatementSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#privateSymbol}.
	 * @param ctx the parse tree
	 */
	void enterPrivateSymbol(CryptlangParser.PrivateSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#privateSymbol}.
	 * @param ctx the parse tree
	 */
	void exitPrivateSymbol(CryptlangParser.PrivateSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#privateIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterPrivateIdentifier(CryptlangParser.PrivateIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#privateIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitPrivateIdentifier(CryptlangParser.PrivateIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#privateIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterPrivateIdentifierList(CryptlangParser.PrivateIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#privateIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitPrivateIdentifierList(CryptlangParser.PrivateIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#hashMethod}.
	 * @param ctx the parse tree
	 */
	void enterHashMethod(CryptlangParser.HashMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#hashMethod}.
	 * @param ctx the parse tree
	 */
	void exitHashMethod(CryptlangParser.HashMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#signatureMethod}.
	 * @param ctx the parse tree
	 */
	void enterSignatureMethod(CryptlangParser.SignatureMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#signatureMethod}.
	 * @param ctx the parse tree
	 */
	void exitSignatureMethod(CryptlangParser.SignatureMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#commitmentMethod}.
	 * @param ctx the parse tree
	 */
	void enterCommitmentMethod(CryptlangParser.CommitmentMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#commitmentMethod}.
	 * @param ctx the parse tree
	 */
	void exitCommitmentMethod(CryptlangParser.CommitmentMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#proofMethod}.
	 * @param ctx the parse tree
	 */
	void enterProofMethod(CryptlangParser.ProofMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#proofMethod}.
	 * @param ctx the parse tree
	 */
	void exitProofMethod(CryptlangParser.ProofMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#signatureStatement}.
	 * @param ctx the parse tree
	 */
	void enterSignatureStatement(CryptlangParser.SignatureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#signatureStatement}.
	 * @param ctx the parse tree
	 */
	void exitSignatureStatement(CryptlangParser.SignatureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#commitmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterCommitmentStatement(CryptlangParser.CommitmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#commitmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitCommitmentStatement(CryptlangParser.CommitmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#proofStatement}.
	 * @param ctx the parse tree
	 */
	void enterProofStatement(CryptlangParser.ProofStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#proofStatement}.
	 * @param ctx the parse tree
	 */
	void exitProofStatement(CryptlangParser.ProofStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#taskStatement}.
	 * @param ctx the parse tree
	 */
	void enterTaskStatement(CryptlangParser.TaskStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#taskStatement}.
	 * @param ctx the parse tree
	 */
	void exitTaskStatement(CryptlangParser.TaskStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#otherStatement}.
	 * @param ctx the parse tree
	 */
	void enterOtherStatement(CryptlangParser.OtherStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#otherStatement}.
	 * @param ctx the parse tree
	 */
	void exitOtherStatement(CryptlangParser.OtherStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(CryptlangParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(CryptlangParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(CryptlangParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(CryptlangParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(CryptlangParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(CryptlangParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(CryptlangParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(CryptlangParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#inlineAssemblyStatement}.
	 * @param ctx the parse tree
	 */
	void enterInlineAssemblyStatement(CryptlangParser.InlineAssemblyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#inlineAssemblyStatement}.
	 * @param ctx the parse tree
	 */
	void exitInlineAssemblyStatement(CryptlangParser.InlineAssemblyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(CryptlangParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(CryptlangParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(CryptlangParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(CryptlangParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(CryptlangParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(CryptlangParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(CryptlangParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(CryptlangParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(CryptlangParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(CryptlangParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#emitStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmitStatement(CryptlangParser.EmitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#emitStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmitStatement(CryptlangParser.EmitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStatement(CryptlangParser.VariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStatement(CryptlangParser.VariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationList(CryptlangParser.VariableDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationList(CryptlangParser.VariableDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(CryptlangParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(CryptlangParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#elementaryTypeName}.
	 * @param ctx the parse tree
	 */
	void enterElementaryTypeName(CryptlangParser.ElementaryTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#elementaryTypeName}.
	 * @param ctx the parse tree
	 */
	void exitElementaryTypeName(CryptlangParser.ElementaryTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CryptlangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CryptlangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(CryptlangParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(CryptlangParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(CryptlangParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(CryptlangParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#nameValueList}.
	 * @param ctx the parse tree
	 */
	void enterNameValueList(CryptlangParser.NameValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#nameValueList}.
	 * @param ctx the parse tree
	 */
	void exitNameValueList(CryptlangParser.NameValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#nameValue}.
	 * @param ctx the parse tree
	 */
	void enterNameValue(CryptlangParser.NameValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#nameValue}.
	 * @param ctx the parse tree
	 */
	void exitNameValue(CryptlangParser.NameValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallArguments(CryptlangParser.FunctionCallArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#functionCallArguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallArguments(CryptlangParser.FunctionCallArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(CryptlangParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(CryptlangParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#assemblyBlock}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyBlock(CryptlangParser.AssemblyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#assemblyBlock}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyBlock(CryptlangParser.AssemblyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#assemblyItem}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyItem(CryptlangParser.AssemblyItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#assemblyItem}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyItem(CryptlangParser.AssemblyItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#assemblyExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyExpression(CryptlangParser.AssemblyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#assemblyExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyExpression(CryptlangParser.AssemblyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#assemblyCall}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyCall(CryptlangParser.AssemblyCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#assemblyCall}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyCall(CryptlangParser.AssemblyCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#assemblyLocalDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyLocalDefinition(CryptlangParser.AssemblyLocalDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#assemblyLocalDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyLocalDefinition(CryptlangParser.AssemblyLocalDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#assemblyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyAssignment(CryptlangParser.AssemblyAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#assemblyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyAssignment(CryptlangParser.AssemblyAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#assemblyIdentifierOrList}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyIdentifierOrList(CryptlangParser.AssemblyIdentifierOrListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#assemblyIdentifierOrList}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyIdentifierOrList(CryptlangParser.AssemblyIdentifierOrListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#assemblyIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyIdentifierList(CryptlangParser.AssemblyIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#assemblyIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyIdentifierList(CryptlangParser.AssemblyIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#assemblyStackAssignment}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyStackAssignment(CryptlangParser.AssemblyStackAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#assemblyStackAssignment}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyStackAssignment(CryptlangParser.AssemblyStackAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#labelDefinition}.
	 * @param ctx the parse tree
	 */
	void enterLabelDefinition(CryptlangParser.LabelDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#labelDefinition}.
	 * @param ctx the parse tree
	 */
	void exitLabelDefinition(CryptlangParser.LabelDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#assemblySwitch}.
	 * @param ctx the parse tree
	 */
	void enterAssemblySwitch(CryptlangParser.AssemblySwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#assemblySwitch}.
	 * @param ctx the parse tree
	 */
	void exitAssemblySwitch(CryptlangParser.AssemblySwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#assemblyCase}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyCase(CryptlangParser.AssemblyCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#assemblyCase}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyCase(CryptlangParser.AssemblyCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#assemblyFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyFunctionDefinition(CryptlangParser.AssemblyFunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#assemblyFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyFunctionDefinition(CryptlangParser.AssemblyFunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#assemblyFunctionReturns}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyFunctionReturns(CryptlangParser.AssemblyFunctionReturnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#assemblyFunctionReturns}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyFunctionReturns(CryptlangParser.AssemblyFunctionReturnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#assemblyFor}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyFor(CryptlangParser.AssemblyForContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#assemblyFor}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyFor(CryptlangParser.AssemblyForContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#assemblyIf}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyIf(CryptlangParser.AssemblyIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#assemblyIf}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyIf(CryptlangParser.AssemblyIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#assemblyLiteral}.
	 * @param ctx the parse tree
	 */
	void enterAssemblyLiteral(CryptlangParser.AssemblyLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#assemblyLiteral}.
	 * @param ctx the parse tree
	 */
	void exitAssemblyLiteral(CryptlangParser.AssemblyLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#subAssembly}.
	 * @param ctx the parse tree
	 */
	void enterSubAssembly(CryptlangParser.SubAssemblyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#subAssembly}.
	 * @param ctx the parse tree
	 */
	void exitSubAssembly(CryptlangParser.SubAssemblyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#tupleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTupleExpression(CryptlangParser.TupleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#tupleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTupleExpression(CryptlangParser.TupleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#typeNameExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeNameExpression(CryptlangParser.TypeNameExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#typeNameExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeNameExpression(CryptlangParser.TypeNameExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(CryptlangParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#numberLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(CryptlangParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CryptlangParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(CryptlangParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CryptlangParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(CryptlangParser.IdentifierContext ctx);
}