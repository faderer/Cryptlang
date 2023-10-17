// Generated from /home/xialb/dsl_project/Cryplang/Solidity.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SolidityParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, NatSpecSingleLine=91, NatSpecMultiLine=92, 
		Int=93, Uint=94, Byte=95, Fixed=96, Ufixed=97, VersionLiteral=98, BooleanLiteral=99, 
		DecimalNumber=100, HexNumber=101, NumberUnit=102, HexLiteral=103, ReservedKeyword=104, 
		AnonymousKeyword=105, BreakKeyword=106, ConstantKeyword=107, ContinueKeyword=108, 
		ExternalKeyword=109, IndexedKeyword=110, InternalKeyword=111, PayableKeyword=112, 
		PrivateKeyword=113, PublicKeyword=114, PureKeyword=115, TypeKeyword=116, 
		ViewKeyword=117, Identifier=118, StringLiteral=119, WS=120, COMMENT=121, 
		LINE_COMMENT=122;
	public static final int
		RULE_sourceUnit = 0, RULE_pragmaDirective = 1, RULE_pragmaName = 2, RULE_pragmaValue = 3, 
		RULE_version = 4, RULE_versionOperator = 5, RULE_versionConstraint = 6, 
		RULE_importDeclaration = 7, RULE_importDirective = 8, RULE_natSpec = 9, 
		RULE_contractDefinition = 10, RULE_inheritanceSpecifier = 11, RULE_contractPart = 12, 
		RULE_stateVariableDeclaration = 13, RULE_usingForDeclaration = 14, RULE_structDefinition = 15, 
		RULE_constructorDefinition = 16, RULE_modifierDefinition = 17, RULE_modifierInvocation = 18, 
		RULE_functionDefinition = 19, RULE_returnParameters = 20, RULE_modifierList = 21, 
		RULE_eventDefinition = 22, RULE_enumValue = 23, RULE_enumDefinition = 24, 
		RULE_parameterList = 25, RULE_parameter = 26, RULE_eventParameterList = 27, 
		RULE_eventParameter = 28, RULE_functionTypeParameterList = 29, RULE_functionTypeParameter = 30, 
		RULE_variableDeclaration = 31, RULE_typeName = 32, RULE_userDefinedTypeName = 33, 
		RULE_mapping = 34, RULE_functionTypeName = 35, RULE_storageLocation = 36, 
		RULE_stateMutability = 37, RULE_block = 38, RULE_statement = 39, RULE_expressionStatement = 40, 
		RULE_ifStatement = 41, RULE_whileStatement = 42, RULE_simpleStatement = 43, 
		RULE_forStatement = 44, RULE_inlineAssemblyStatement = 45, RULE_doWhileStatement = 46, 
		RULE_continueStatement = 47, RULE_breakStatement = 48, RULE_returnStatement = 49, 
		RULE_throwStatement = 50, RULE_emitStatement = 51, RULE_variableDeclarationStatement = 52, 
		RULE_variableDeclarationList = 53, RULE_identifierList = 54, RULE_elementaryTypeName = 55, 
		RULE_expression = 56, RULE_primaryExpression = 57, RULE_expressionList = 58, 
		RULE_nameValueList = 59, RULE_nameValue = 60, RULE_functionCallArguments = 61, 
		RULE_functionCall = 62, RULE_assemblyBlock = 63, RULE_assemblyItem = 64, 
		RULE_assemblyExpression = 65, RULE_assemblyCall = 66, RULE_assemblyLocalDefinition = 67, 
		RULE_assemblyAssignment = 68, RULE_assemblyIdentifierOrList = 69, RULE_assemblyIdentifierList = 70, 
		RULE_assemblyStackAssignment = 71, RULE_labelDefinition = 72, RULE_assemblySwitch = 73, 
		RULE_assemblyCase = 74, RULE_assemblyFunctionDefinition = 75, RULE_assemblyFunctionReturns = 76, 
		RULE_assemblyFor = 77, RULE_assemblyIf = 78, RULE_assemblyLiteral = 79, 
		RULE_subAssembly = 80, RULE_tupleExpression = 81, RULE_typeNameExpression = 82, 
		RULE_numberLiteral = 83, RULE_identifier = 84;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceUnit", "pragmaDirective", "pragmaName", "pragmaValue", "version", 
			"versionOperator", "versionConstraint", "importDeclaration", "importDirective", 
			"natSpec", "contractDefinition", "inheritanceSpecifier", "contractPart", 
			"stateVariableDeclaration", "usingForDeclaration", "structDefinition", 
			"constructorDefinition", "modifierDefinition", "modifierInvocation", 
			"functionDefinition", "returnParameters", "modifierList", "eventDefinition", 
			"enumValue", "enumDefinition", "parameterList", "parameter", "eventParameterList", 
			"eventParameter", "functionTypeParameterList", "functionTypeParameter", 
			"variableDeclaration", "typeName", "userDefinedTypeName", "mapping", 
			"functionTypeName", "storageLocation", "stateMutability", "block", "statement", 
			"expressionStatement", "ifStatement", "whileStatement", "simpleStatement", 
			"forStatement", "inlineAssemblyStatement", "doWhileStatement", "continueStatement", 
			"breakStatement", "returnStatement", "throwStatement", "emitStatement", 
			"variableDeclarationStatement", "variableDeclarationList", "identifierList", 
			"elementaryTypeName", "expression", "primaryExpression", "expressionList", 
			"nameValueList", "nameValue", "functionCallArguments", "functionCall", 
			"assemblyBlock", "assemblyItem", "assemblyExpression", "assemblyCall", 
			"assemblyLocalDefinition", "assemblyAssignment", "assemblyIdentifierOrList", 
			"assemblyIdentifierList", "assemblyStackAssignment", "labelDefinition", 
			"assemblySwitch", "assemblyCase", "assemblyFunctionDefinition", "assemblyFunctionReturns", 
			"assemblyFor", "assemblyIf", "assemblyLiteral", "subAssembly", "tupleExpression", 
			"typeNameExpression", "numberLiteral", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pragma'", "';'", "'^'", "'~'", "'>='", "'>'", "'<'", "'<='", 
			"'='", "'as'", "'import'", "'*'", "'from'", "'{'", "','", "'}'", "'contract'", 
			"'interface'", "'library'", "'is'", "'('", "')'", "'using'", "'for'", 
			"'struct'", "'constructor'", "'modifier'", "'function'", "'returns'", 
			"'event'", "'enum'", "'['", "']'", "'address'", "'.'", "'mapping'", "'=>'", 
			"'memory'", "'storage'", "'calldata'", "'if'", "'else'", "'while'", "'assembly'", 
			"'do'", "'return'", "'throw'", "'emit'", "'var'", "'bool'", "'string'", 
			"'byte'", "'++'", "'--'", "'new'", "'+'", "'-'", "'after'", "'delete'", 
			"'!'", "'**'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'=='", "'!='", 
			"'&&'", "'||'", "'?'", "':'", "'|='", "'^='", "'&='", "'<<='", "'>>='", 
			"'+='", "'-='", "'*='", "'/='", "'%='", "'let'", "':='", "'=:'", "'switch'", 
			"'case'", "'default'", "'->'", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'anonymous'", "'break'", "'constant'", 
			"'continue'", "'external'", "'indexed'", "'internal'", "'payable'", "'private'", 
			"'public'", "'pure'", "'type'", "'view'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "NatSpecSingleLine", "NatSpecMultiLine", 
			"Int", "Uint", "Byte", "Fixed", "Ufixed", "VersionLiteral", "BooleanLiteral", 
			"DecimalNumber", "HexNumber", "NumberUnit", "HexLiteral", "ReservedKeyword", 
			"AnonymousKeyword", "BreakKeyword", "ConstantKeyword", "ContinueKeyword", 
			"ExternalKeyword", "IndexedKeyword", "InternalKeyword", "PayableKeyword", 
			"PrivateKeyword", "PublicKeyword", "PureKeyword", "TypeKeyword", "ViewKeyword", 
			"Identifier", "StringLiteral", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Solidity.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SolidityParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SolidityParser.EOF, 0); }
		public List<PragmaDirectiveContext> pragmaDirective() {
			return getRuleContexts(PragmaDirectiveContext.class);
		}
		public PragmaDirectiveContext pragmaDirective(int i) {
			return getRuleContext(PragmaDirectiveContext.class,i);
		}
		public List<ImportDirectiveContext> importDirective() {
			return getRuleContexts(ImportDirectiveContext.class);
		}
		public ImportDirectiveContext importDirective(int i) {
			return getRuleContext(ImportDirectiveContext.class,i);
		}
		public List<ContractDefinitionContext> contractDefinition() {
			return getRuleContexts(ContractDefinitionContext.class);
		}
		public ContractDefinitionContext contractDefinition(int i) {
			return getRuleContext(ContractDefinitionContext.class,i);
		}
		public SourceUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceUnit; }
	}

	public final SourceUnitContext sourceUnit() throws RecognitionException {
		SourceUnitContext _localctx = new SourceUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 919554L) != 0) || _la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(173);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(170);
					pragmaDirective();
					}
					break;
				case T__10:
					{
					setState(171);
					importDirective();
					}
					break;
				case T__16:
				case T__17:
				case T__18:
				case NatSpecSingleLine:
				case NatSpecMultiLine:
					{
					setState(172);
					contractDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PragmaDirectiveContext extends ParserRuleContext {
		public PragmaNameContext pragmaName() {
			return getRuleContext(PragmaNameContext.class,0);
		}
		public PragmaValueContext pragmaValue() {
			return getRuleContext(PragmaValueContext.class,0);
		}
		public PragmaDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaDirective; }
	}

	public final PragmaDirectiveContext pragmaDirective() throws RecognitionException {
		PragmaDirectiveContext _localctx = new PragmaDirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pragmaDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__0);
			setState(181);
			pragmaName();
			setState(182);
			pragmaValue();
			setState(183);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PragmaNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PragmaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaName; }
	}

	public final PragmaNameContext pragmaName() throws RecognitionException {
		PragmaNameContext _localctx = new PragmaNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pragmaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PragmaValueContext extends ParserRuleContext {
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PragmaValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaValue; }
	}

	public final PragmaValueContext pragmaValue() throws RecognitionException {
		PragmaValueContext _localctx = new PragmaValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pragmaValue);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				version();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VersionContext extends ParserRuleContext {
		public List<VersionConstraintContext> versionConstraint() {
			return getRuleContexts(VersionConstraintContext.class);
		}
		public VersionConstraintContext versionConstraint(int i) {
			return getRuleContext(VersionConstraintContext.class,i);
		}
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_version);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			versionConstraint();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1016L) != 0) || _la==VersionLiteral) {
				{
				setState(192);
				versionConstraint();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VersionOperatorContext extends ParserRuleContext {
		public VersionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionOperator; }
	}

	public final VersionOperatorContext versionOperator() throws RecognitionException {
		VersionOperatorContext _localctx = new VersionOperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_versionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1016L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VersionConstraintContext extends ParserRuleContext {
		public TerminalNode VersionLiteral() { return getToken(SolidityParser.VersionLiteral, 0); }
		public VersionOperatorContext versionOperator() {
			return getRuleContext(VersionOperatorContext.class,0);
		}
		public VersionConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionConstraint; }
	}

	public final VersionConstraintContext versionConstraint() throws RecognitionException {
		VersionConstraintContext _localctx = new VersionConstraintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_versionConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1016L) != 0)) {
				{
				setState(197);
				versionOperator();
				}
			}

			setState(200);
			match(VersionLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDeclarationContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			identifier();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(203);
				match(T__9);
				setState(204);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDirectiveContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public ImportDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDirective; }
	}

	public final ImportDirectiveContext importDirective() throws RecognitionException {
		ImportDirectiveContext _localctx = new ImportDirectiveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_importDirective);
		int _la;
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(T__10);
				setState(208);
				match(StringLiteral);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(209);
					match(T__9);
					setState(210);
					identifier();
					}
				}

				setState(213);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(T__10);
				setState(217);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					setState(215);
					match(T__11);
					}
					break;
				case T__12:
				case T__39:
				case Identifier:
					{
					setState(216);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(219);
					match(T__9);
					setState(220);
					identifier();
					}
				}

				setState(223);
				match(T__12);
				setState(224);
				match(StringLiteral);
				setState(225);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				match(T__10);
				setState(227);
				match(T__13);
				setState(228);
				importDeclaration();
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(229);
					match(T__14);
					setState(230);
					importDeclaration();
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(236);
				match(T__15);
				setState(237);
				match(T__12);
				setState(238);
				match(StringLiteral);
				setState(239);
				match(T__1);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NatSpecContext extends ParserRuleContext {
		public TerminalNode NatSpecSingleLine() { return getToken(SolidityParser.NatSpecSingleLine, 0); }
		public TerminalNode NatSpecMultiLine() { return getToken(SolidityParser.NatSpecMultiLine, 0); }
		public NatSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natSpec; }
	}

	public final NatSpecContext natSpec() throws RecognitionException {
		NatSpecContext _localctx = new NatSpecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_natSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !(_la==NatSpecSingleLine || _la==NatSpecMultiLine) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContractDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NatSpecContext natSpec() {
			return getRuleContext(NatSpecContext.class,0);
		}
		public List<InheritanceSpecifierContext> inheritanceSpecifier() {
			return getRuleContexts(InheritanceSpecifierContext.class);
		}
		public InheritanceSpecifierContext inheritanceSpecifier(int i) {
			return getRuleContext(InheritanceSpecifierContext.class,i);
		}
		public List<ContractPartContext> contractPart() {
			return getRuleContexts(ContractPartContext.class);
		}
		public ContractPartContext contractPart(int i) {
			return getRuleContext(ContractPartContext.class,i);
		}
		public ContractDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractDefinition; }
	}

	public final ContractDefinitionContext contractDefinition() throws RecognitionException {
		ContractDefinitionContext _localctx = new ContractDefinitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_contractDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(245);
				natSpec();
				}
			}

			setState(248);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(249);
			identifier();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(250);
				match(T__19);
				setState(251);
				inheritanceSpecifier();
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(252);
					match(T__14);
					setState(253);
					inheritanceSpecifier();
					}
					}
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(261);
			match(T__13);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8445438445232128L) != 0) || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 134217855L) != 0)) {
				{
				{
				setState(262);
				contractPart();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InheritanceSpecifierContext extends ParserRuleContext {
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public InheritanceSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceSpecifier; }
	}

	public final InheritanceSpecifierContext inheritanceSpecifier() throws RecognitionException {
		InheritanceSpecifierContext _localctx = new InheritanceSpecifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inheritanceSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			userDefinedTypeName();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(271);
				match(T__20);
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305281180248842256L) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 109053407L) != 0)) {
					{
					setState(272);
					expressionList();
					}
				}

				setState(275);
				match(T__21);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContractPartContext extends ParserRuleContext {
		public StateVariableDeclarationContext stateVariableDeclaration() {
			return getRuleContext(StateVariableDeclarationContext.class,0);
		}
		public UsingForDeclarationContext usingForDeclaration() {
			return getRuleContext(UsingForDeclarationContext.class,0);
		}
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public ConstructorDefinitionContext constructorDefinition() {
			return getRuleContext(ConstructorDefinitionContext.class,0);
		}
		public ModifierDefinitionContext modifierDefinition() {
			return getRuleContext(ModifierDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public EventDefinitionContext eventDefinition() {
			return getRuleContext(EventDefinitionContext.class,0);
		}
		public EnumDefinitionContext enumDefinition() {
			return getRuleContext(EnumDefinitionContext.class,0);
		}
		public ContractPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractPart; }
	}

	public final ContractPartContext contractPart() throws RecognitionException {
		ContractPartContext _localctx = new ContractPartContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_contractPart);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				stateVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				usingForDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				constructorDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				modifierDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(283);
				functionDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(284);
				eventDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(285);
				enumDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StateVariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public List<TerminalNode> ConstantKeyword() { return getTokens(SolidityParser.ConstantKeyword); }
		public TerminalNode ConstantKeyword(int i) {
			return getToken(SolidityParser.ConstantKeyword, i);
		}
		public StateVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVariableDeclaration; }
	}

	public final StateVariableDeclarationContext stateVariableDeclaration() throws RecognitionException {
		StateVariableDeclarationContext _localctx = new StateVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stateVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			typeName(0);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & 209L) != 0)) {
				{
				{
				setState(289);
				_la = _input.LA(1);
				if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & 209L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
			identifier();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(296);
				match(T__8);
				setState(297);
				expression(0);
				}
			}

			setState(300);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UsingForDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public UsingForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingForDeclaration; }
	}

	public final UsingForDeclarationContext usingForDeclaration() throws RecognitionException {
		UsingForDeclarationContext _localctx = new UsingForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_usingForDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(T__22);
			setState(303);
			identifier();
			setState(304);
			match(T__23);
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				setState(305);
				match(T__11);
				}
				break;
			case T__12:
			case T__27:
			case T__33:
			case T__35:
			case T__39:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
				{
				setState(306);
				typeName(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(309);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(T__24);
			setState(312);
			identifier();
			setState(313);
			match(T__13);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8445434980737024L) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 33554463L) != 0)) {
				{
				setState(314);
				variableDeclaration();
				setState(315);
				match(T__1);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8445434980737024L) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 33554463L) != 0)) {
					{
					{
					setState(316);
					variableDeclaration();
					setState(317);
					match(T__1);
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(326);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDefinitionContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDefinition; }
	}

	public final ConstructorDefinitionContext constructorDefinition() throws RecognitionException {
		ConstructorDefinitionContext _localctx = new ConstructorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_constructorDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__25);
			setState(329);
			parameterList();
			setState(330);
			modifierList();
			setState(331);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModifierDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierDefinition; }
	}

	public final ModifierDefinitionContext modifierDefinition() throws RecognitionException {
		ModifierDefinitionContext _localctx = new ModifierDefinitionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_modifierDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(T__26);
			setState(334);
			identifier();
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(335);
				parameterList();
				}
			}

			setState(338);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModifierInvocationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ModifierInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierInvocation; }
	}

	public final ModifierInvocationContext modifierInvocation() throws RecognitionException {
		ModifierInvocationContext _localctx = new ModifierInvocationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_modifierInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			identifier();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(341);
				match(T__20);
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305281180248842256L) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 109053407L) != 0)) {
					{
					setState(342);
					expressionList();
					}
				}

				setState(345);
				match(T__21);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public NatSpecContext natSpec() {
			return getRuleContext(NatSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReturnParametersContext returnParameters() {
			return getRuleContext(ReturnParametersContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(348);
				natSpec();
				}
			}

			setState(351);
			match(T__27);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__39 || _la==Identifier) {
				{
				setState(352);
				identifier();
				}
			}

			setState(355);
			parameterList();
			setState(356);
			modifierList();
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(357);
				returnParameters();
				}
			}

			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(360);
				match(T__1);
				}
				break;
			case T__13:
				{
				setState(361);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnParametersContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ReturnParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnParameters; }
	}

	public final ReturnParametersContext returnParameters() throws RecognitionException {
		ReturnParametersContext _localctx = new ReturnParametersContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_returnParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(T__28);
			setState(365);
			parameterList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModifierListContext extends ParserRuleContext {
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public ModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierList; }
	}

	public final ModifierListContext modifierList() throws RecognitionException {
		ModifierListContext _localctx = new ModifierListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_modifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__39 || ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & 3573L) != 0)) {
				{
				setState(373);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
				case T__39:
				case Identifier:
					{
					setState(367);
					modifierInvocation();
					}
					break;
				case ConstantKeyword:
				case PayableKeyword:
				case PureKeyword:
				case ViewKeyword:
					{
					setState(368);
					stateMutability();
					}
					break;
				case ExternalKeyword:
					{
					setState(369);
					match(ExternalKeyword);
					}
					break;
				case PublicKeyword:
					{
					setState(370);
					match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(371);
					match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(372);
					match(PrivateKeyword);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EventDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterListContext eventParameterList() {
			return getRuleContext(EventParameterListContext.class,0);
		}
		public NatSpecContext natSpec() {
			return getRuleContext(NatSpecContext.class,0);
		}
		public TerminalNode AnonymousKeyword() { return getToken(SolidityParser.AnonymousKeyword, 0); }
		public EventDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDefinition; }
	}

	public final EventDefinitionContext eventDefinition() throws RecognitionException {
		EventDefinitionContext _localctx = new EventDefinitionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_eventDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(378);
				natSpec();
				}
			}

			setState(381);
			match(T__29);
			setState(382);
			identifier();
			setState(383);
			eventParameterList();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(384);
				match(AnonymousKeyword);
				}
			}

			setState(387);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<EnumValueContext> enumValue() {
			return getRuleContexts(EnumValueContext.class);
		}
		public EnumValueContext enumValue(int i) {
			return getRuleContext(EnumValueContext.class,i);
		}
		public EnumDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDefinition; }
	}

	public final EnumDefinitionContext enumDefinition() throws RecognitionException {
		EnumDefinitionContext _localctx = new EnumDefinitionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_enumDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(T__30);
			setState(392);
			identifier();
			setState(393);
			match(T__13);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__39 || _la==Identifier) {
				{
				setState(394);
				enumValue();
				}
			}

			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(397);
				match(T__14);
				setState(398);
				enumValue();
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(404);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(T__20);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8445434980737024L) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 33554463L) != 0)) {
				{
				setState(407);
				parameter();
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(408);
					match(T__14);
					setState(409);
					parameter();
					}
					}
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(417);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			typeName(0);
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(420);
				storageLocation();
				}
				break;
			}
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__39 || _la==Identifier) {
				{
				setState(423);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EventParameterListContext extends ParserRuleContext {
		public List<EventParameterContext> eventParameter() {
			return getRuleContexts(EventParameterContext.class);
		}
		public EventParameterContext eventParameter(int i) {
			return getRuleContext(EventParameterContext.class,i);
		}
		public EventParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameterList; }
	}

	public final EventParameterListContext eventParameterList() throws RecognitionException {
		EventParameterListContext _localctx = new EventParameterListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_eventParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(T__20);
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8445434980737024L) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 33554463L) != 0)) {
				{
				setState(427);
				eventParameter();
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(428);
					match(T__14);
					setState(429);
					eventParameter();
					}
					}
					setState(434);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(437);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EventParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode IndexedKeyword() { return getToken(SolidityParser.IndexedKeyword, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameter; }
	}

	public final EventParameterContext eventParameter() throws RecognitionException {
		EventParameterContext _localctx = new EventParameterContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_eventParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			typeName(0);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(440);
				match(IndexedKeyword);
				}
			}

			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__39 || _la==Identifier) {
				{
				setState(443);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTypeParameterListContext extends ParserRuleContext {
		public List<FunctionTypeParameterContext> functionTypeParameter() {
			return getRuleContexts(FunctionTypeParameterContext.class);
		}
		public FunctionTypeParameterContext functionTypeParameter(int i) {
			return getRuleContext(FunctionTypeParameterContext.class,i);
		}
		public FunctionTypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeParameterList; }
	}

	public final FunctionTypeParameterListContext functionTypeParameterList() throws RecognitionException {
		FunctionTypeParameterListContext _localctx = new FunctionTypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_functionTypeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(T__20);
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8445434980737024L) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 33554463L) != 0)) {
				{
				setState(447);
				functionTypeParameter();
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(448);
					match(T__14);
					setState(449);
					functionTypeParameter();
					}
					}
					setState(454);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(457);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTypeParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public FunctionTypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeParameter; }
	}

	public final FunctionTypeParameterContext functionTypeParameter() throws RecognitionException {
		FunctionTypeParameterContext _localctx = new FunctionTypeParameterContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_functionTypeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			typeName(0);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1924145348608L) != 0)) {
				{
				setState(460);
				storageLocation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			typeName(0);
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(464);
				storageLocation();
				}
				break;
			}
			setState(467);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public FunctionTypeNameContext functionTypeName() {
			return getRuleContext(FunctionTypeNameContext.class,0);
		}
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		return typeName(0);
	}

	private TypeNameContext typeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeNameContext _localctx = new TypeNameContext(_ctx, _parentState);
		TypeNameContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_typeName, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(470);
				elementaryTypeName();
				}
				break;
			case 2:
				{
				setState(471);
				userDefinedTypeName();
				}
				break;
			case 3:
				{
				setState(472);
				mapping();
				}
				break;
			case 4:
				{
				setState(473);
				functionTypeName();
				}
				break;
			case 5:
				{
				setState(474);
				match(T__33);
				setState(475);
				match(PayableKeyword);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(486);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeName);
					setState(478);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(479);
					match(T__31);
					setState(481);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305281180248842256L) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 109053407L) != 0)) {
						{
						setState(480);
						expression(0);
						}
					}

					setState(483);
					match(T__32);
					}
					} 
				}
				setState(488);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UserDefinedTypeNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UserDefinedTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userDefinedTypeName; }
	}

	public final UserDefinedTypeNameContext userDefinedTypeName() throws RecognitionException {
		UserDefinedTypeNameContext _localctx = new UserDefinedTypeNameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_userDefinedTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			identifier();
			setState(494);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(490);
					match(T__34);
					setState(491);
					identifier();
					}
					} 
				}
				setState(496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MappingContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping; }
	}

	public final MappingContext mapping() throws RecognitionException {
		MappingContext _localctx = new MappingContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mapping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(T__35);
			setState(498);
			match(T__20);
			setState(499);
			elementaryTypeName();
			setState(500);
			match(T__36);
			setState(501);
			typeName(0);
			setState(502);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTypeNameContext extends ParserRuleContext {
		public List<FunctionTypeParameterListContext> functionTypeParameterList() {
			return getRuleContexts(FunctionTypeParameterListContext.class);
		}
		public FunctionTypeParameterListContext functionTypeParameterList(int i) {
			return getRuleContext(FunctionTypeParameterListContext.class,i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public FunctionTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeName; }
	}

	public final FunctionTypeNameContext functionTypeName() throws RecognitionException {
		FunctionTypeNameContext _localctx = new FunctionTypeNameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_functionTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(T__27);
			setState(505);
			functionTypeParameterList();
			setState(511);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(509);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case InternalKeyword:
						{
						setState(506);
						match(InternalKeyword);
						}
						break;
					case ExternalKeyword:
						{
						setState(507);
						match(ExternalKeyword);
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(508);
						stateMutability();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(514);
				match(T__28);
				setState(515);
				functionTypeParameterList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StorageLocationContext extends ParserRuleContext {
		public StorageLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageLocation; }
	}

	public final StorageLocationContext storageLocation() throws RecognitionException {
		StorageLocationContext _localctx = new StorageLocationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_storageLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1924145348608L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StateMutabilityContext extends ParserRuleContext {
		public TerminalNode PureKeyword() { return getToken(SolidityParser.PureKeyword, 0); }
		public TerminalNode ConstantKeyword() { return getToken(SolidityParser.ConstantKeyword, 0); }
		public TerminalNode ViewKeyword() { return getToken(SolidityParser.ViewKeyword, 0); }
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public StateMutabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateMutability; }
	}

	public final StateMutabilityContext stateMutability() throws RecognitionException {
		StateMutabilityContext _localctx = new StateMutabilityContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_stateMutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			_la = _input.LA(1);
			if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & 1313L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(T__13);
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305837602137202704L) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 109094367L) != 0)) {
				{
				{
				setState(523);
				statement();
				}
				}
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(529);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InlineAssemblyStatementContext inlineAssemblyStatement() {
			return getRuleContext(InlineAssemblyStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public EmitStatementContext emitStatement() {
			return getRuleContext(EmitStatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_statement);
		try {
			setState(543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				ifStatement();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				whileStatement();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(533);
				forStatement();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(534);
				block();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 5);
				{
				setState(535);
				inlineAssemblyStatement();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 6);
				{
				setState(536);
				doWhileStatement();
				}
				break;
			case ContinueKeyword:
				enterOuterAlt(_localctx, 7);
				{
				setState(537);
				continueStatement();
				}
				break;
			case BreakKeyword:
				enterOuterAlt(_localctx, 8);
				{
				setState(538);
				breakStatement();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 9);
				{
				setState(539);
				returnStatement();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 10);
				{
				setState(540);
				throwStatement();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 11);
				{
				setState(541);
				emitStatement();
				}
				break;
			case T__3:
			case T__12:
			case T__20:
			case T__27:
			case T__31:
			case T__33:
			case T__35:
			case T__39:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case TypeKeyword:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 12);
				{
				setState(542);
				simpleStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			expression(0);
			setState(546);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(T__40);
			setState(549);
			match(T__20);
			setState(550);
			expression(0);
			setState(551);
			match(T__21);
			setState(552);
			statement();
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(553);
				match(T__41);
				setState(554);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(T__42);
			setState(558);
			match(T__20);
			setState(559);
			expression(0);
			setState(560);
			match(T__21);
			setState(561);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStatementContext extends ParserRuleContext {
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(563);
				variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(564);
				expressionStatement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(T__23);
			setState(568);
			match(T__20);
			setState(571);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__12:
			case T__20:
			case T__27:
			case T__31:
			case T__33:
			case T__35:
			case T__39:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case TypeKeyword:
			case Identifier:
			case StringLiteral:
				{
				setState(569);
				simpleStatement();
				}
				break;
			case T__1:
				{
				setState(570);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(575);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__12:
			case T__20:
			case T__31:
			case T__33:
			case T__39:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case TypeKeyword:
			case Identifier:
			case StringLiteral:
				{
				setState(573);
				expressionStatement();
				}
				break;
			case T__1:
				{
				setState(574);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305281180248842256L) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 109053407L) != 0)) {
				{
				setState(577);
				expression(0);
				}
			}

			setState(580);
			match(T__21);
			setState(581);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InlineAssemblyStatementContext extends ParserRuleContext {
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public InlineAssemblyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineAssemblyStatement; }
	}

	public final InlineAssemblyStatementContext inlineAssemblyStatement() throws RecognitionException {
		InlineAssemblyStatementContext _localctx = new InlineAssemblyStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_inlineAssemblyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(T__43);
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(584);
				match(StringLiteral);
				}
			}

			setState(587);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(T__44);
			setState(590);
			statement();
			setState(591);
			match(T__42);
			setState(592);
			match(T__20);
			setState(593);
			expression(0);
			setState(594);
			match(T__21);
			setState(595);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode ContinueKeyword() { return getToken(SolidityParser.ContinueKeyword, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(ContinueKeyword);
			setState(598);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BreakKeyword() { return getToken(SolidityParser.BreakKeyword, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(BreakKeyword);
			setState(601);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(T__45);
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305281180248842256L) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 109053407L) != 0)) {
				{
				setState(604);
				expression(0);
				}
			}

			setState(607);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThrowStatementContext extends ParserRuleContext {
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(T__46);
			setState(610);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmitStatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public EmitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatement; }
	}

	public final EmitStatementContext emitStatement() throws RecognitionException {
		EmitStatementContext _localctx = new EmitStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(T__47);
			setState(613);
			functionCall();
			setState(614);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationStatementContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationStatement; }
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(616);
				match(T__48);
				setState(617);
				identifierList();
				}
				break;
			case 2:
				{
				setState(618);
				variableDeclaration();
				}
				break;
			case 3:
				{
				setState(619);
				match(T__20);
				setState(620);
				variableDeclarationList();
				setState(621);
				match(T__21);
				}
				break;
			}
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(625);
				match(T__8);
				setState(626);
				expression(0);
				}
			}

			setState(629);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8445434980737024L) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 33554463L) != 0)) {
				{
				setState(631);
				variableDeclaration();
				}
			}

			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(634);
				match(T__14);
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8445434980737024L) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 33554463L) != 0)) {
					{
					setState(635);
					variableDeclaration();
					}
				}

				}
				}
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_identifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(T__20);
			setState(650);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(645);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__12 || _la==T__39 || _la==Identifier) {
						{
						setState(644);
						identifier();
						}
					}

					setState(647);
					match(T__14);
					}
					} 
				}
				setState(652);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__39 || _la==Identifier) {
				{
				setState(653);
				identifier();
				}
			}

			setState(656);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementaryTypeNameContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(SolidityParser.Int, 0); }
		public TerminalNode Uint() { return getToken(SolidityParser.Uint, 0); }
		public TerminalNode Byte() { return getToken(SolidityParser.Byte, 0); }
		public TerminalNode Fixed() { return getToken(SolidityParser.Fixed, 0); }
		public TerminalNode Ufixed() { return getToken(SolidityParser.Ufixed, 0); }
		public ElementaryTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementaryTypeName; }
	}

	public final ElementaryTypeNameContext elementaryTypeName() throws RecognitionException {
		ElementaryTypeNameContext _localctx = new ElementaryTypeNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_elementaryTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			_la = _input.LA(1);
			if ( !(((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & -576460752302931967L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(661);
				match(T__54);
				setState(662);
				typeName(0);
				}
				break;
			case 2:
				{
				setState(663);
				match(T__20);
				setState(664);
				expression(0);
				setState(665);
				match(T__21);
				}
				break;
			case 3:
				{
				setState(667);
				_la = _input.LA(1);
				if ( !(_la==T__52 || _la==T__53) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(668);
				expression(19);
				}
				break;
			case 4:
				{
				setState(669);
				_la = _input.LA(1);
				if ( !(_la==T__55 || _la==T__56) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(670);
				expression(18);
				}
				break;
			case 5:
				{
				setState(671);
				_la = _input.LA(1);
				if ( !(_la==T__57 || _la==T__58) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(672);
				expression(17);
				}
				break;
			case 6:
				{
				setState(673);
				match(T__59);
				setState(674);
				expression(16);
				}
				break;
			case 7:
				{
				setState(675);
				match(T__3);
				setState(676);
				expression(15);
				}
				break;
			case 8:
				{
				setState(677);
				primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(739);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(737);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(680);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(681);
						match(T__60);
						setState(682);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(683);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(684);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611686018427383808L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(685);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(686);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(687);
						_la = _input.LA(1);
						if ( !(_la==T__55 || _la==T__56) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(688);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(689);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(690);
						_la = _input.LA(1);
						if ( !(_la==T__63 || _la==T__64) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(691);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(692);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(693);
						match(T__65);
						setState(694);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(695);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(696);
						match(T__2);
						setState(697);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(698);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(699);
						match(T__66);
						setState(700);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(701);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(702);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 480L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(703);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(704);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(705);
						_la = _input.LA(1);
						if ( !(_la==T__67 || _la==T__68) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(706);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(707);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(708);
						match(T__69);
						setState(709);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(710);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(711);
						match(T__70);
						setState(712);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(713);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(714);
						match(T__71);
						setState(715);
						expression(0);
						setState(716);
						match(T__72);
						setState(717);
						expression(4);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(719);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(720);
						_la = _input.LA(1);
						if ( !(_la==T__8 || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 1023L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(721);
						expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(722);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(723);
						_la = _input.LA(1);
						if ( !(_la==T__52 || _la==T__53) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(724);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(725);
						match(T__31);
						setState(726);
						expression(0);
						setState(727);
						match(T__32);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(729);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(730);
						match(T__20);
						setState(731);
						functionCallArguments();
						setState(732);
						match(T__21);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(734);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(735);
						match(T__34);
						setState(736);
						identifier();
						}
						break;
					}
					} 
				}
				setState(741);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(SolidityParser.BooleanLiteral, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode HexLiteral() { return getToken(SolidityParser.HexLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TypeKeyword() { return getToken(SolidityParser.TypeKeyword, 0); }
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public TypeNameExpressionContext typeNameExpression() {
			return getRuleContext(TypeNameExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_primaryExpression);
		try {
			setState(758);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(742);
				match(BooleanLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
				numberLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(744);
				match(HexLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(745);
				match(StringLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(746);
				identifier();
				setState(749);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(747);
					match(T__31);
					setState(748);
					match(T__32);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(751);
				match(TypeKeyword);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(752);
				tupleExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(753);
				typeNameExpression();
				setState(756);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(754);
					match(T__31);
					setState(755);
					match(T__32);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			expression(0);
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(761);
				match(T__14);
				setState(762);
				expression(0);
				}
				}
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameValueListContext extends ParserRuleContext {
		public List<NameValueContext> nameValue() {
			return getRuleContexts(NameValueContext.class);
		}
		public NameValueContext nameValue(int i) {
			return getRuleContext(NameValueContext.class,i);
		}
		public NameValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValueList; }
	}

	public final NameValueListContext nameValueList() throws RecognitionException {
		NameValueListContext _localctx = new NameValueListContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_nameValueList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			nameValue();
			setState(773);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(769);
					match(T__14);
					setState(770);
					nameValue();
					}
					} 
				}
				setState(775);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(776);
				match(T__14);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NameValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValue; }
	}

	public final NameValueContext nameValue() throws RecognitionException {
		NameValueContext _localctx = new NameValueContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			identifier();
			setState(780);
			match(T__72);
			setState(781);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallArgumentsContext extends ParserRuleContext {
		public NameValueListContext nameValueList() {
			return getRuleContext(NameValueListContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallArguments; }
	}

	public final FunctionCallArgumentsContext functionCallArguments() throws RecognitionException {
		FunctionCallArgumentsContext _localctx = new FunctionCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_functionCallArguments);
		int _la;
		try {
			setState(791);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				match(T__13);
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12 || _la==T__39 || _la==Identifier) {
					{
					setState(784);
					nameValueList();
					}
				}

				setState(787);
				match(T__15);
				}
				break;
			case T__3:
			case T__12:
			case T__20:
			case T__21:
			case T__31:
			case T__33:
			case T__39:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case TypeKeyword:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305281180248842256L) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 109053407L) != 0)) {
					{
					setState(788);
					expressionList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			expression(0);
			setState(794);
			match(T__20);
			setState(795);
			functionCallArguments();
			setState(796);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyBlockContext extends ParserRuleContext {
		public List<AssemblyItemContext> assemblyItem() {
			return getRuleContexts(AssemblyItemContext.class);
		}
		public AssemblyItemContext assemblyItem(int i) {
			return getRuleContext(AssemblyItemContext.class,i);
		}
		public AssemblyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyBlock; }
	}

	public final AssemblyBlockContext assemblyBlock() throws RecognitionException {
		AssemblyBlockContext _localctx = new AssemblyBlockContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_assemblyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(T__13);
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4594876559679488L) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 51561299981L) != 0)) {
				{
				{
				setState(799);
				assemblyItem();
				}
				}
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(805);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyItemContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyLocalDefinitionContext assemblyLocalDefinition() {
			return getRuleContext(AssemblyLocalDefinitionContext.class,0);
		}
		public AssemblyAssignmentContext assemblyAssignment() {
			return getRuleContext(AssemblyAssignmentContext.class,0);
		}
		public AssemblyStackAssignmentContext assemblyStackAssignment() {
			return getRuleContext(AssemblyStackAssignmentContext.class,0);
		}
		public LabelDefinitionContext labelDefinition() {
			return getRuleContext(LabelDefinitionContext.class,0);
		}
		public AssemblySwitchContext assemblySwitch() {
			return getRuleContext(AssemblySwitchContext.class,0);
		}
		public AssemblyFunctionDefinitionContext assemblyFunctionDefinition() {
			return getRuleContext(AssemblyFunctionDefinitionContext.class,0);
		}
		public AssemblyForContext assemblyFor() {
			return getRuleContext(AssemblyForContext.class,0);
		}
		public AssemblyIfContext assemblyIf() {
			return getRuleContext(AssemblyIfContext.class,0);
		}
		public TerminalNode BreakKeyword() { return getToken(SolidityParser.BreakKeyword, 0); }
		public TerminalNode ContinueKeyword() { return getToken(SolidityParser.ContinueKeyword, 0); }
		public SubAssemblyContext subAssembly() {
			return getRuleContext(SubAssemblyContext.class,0);
		}
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(SolidityParser.HexLiteral, 0); }
		public AssemblyItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyItem; }
	}

	public final AssemblyItemContext assemblyItem() throws RecognitionException {
		AssemblyItemContext _localctx = new AssemblyItemContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_assemblyItem);
		try {
			setState(824);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(807);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(808);
				assemblyBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(809);
				assemblyExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(810);
				assemblyLocalDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(811);
				assemblyAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(812);
				assemblyStackAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(813);
				labelDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(814);
				assemblySwitch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(815);
				assemblyFunctionDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(816);
				assemblyFor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(817);
				assemblyIf();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(818);
				match(BreakKeyword);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(819);
				match(ContinueKeyword);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(820);
				subAssembly();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(821);
				numberLiteral();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(822);
				match(StringLiteral);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(823);
				match(HexLiteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyExpressionContext extends ParserRuleContext {
		public AssemblyCallContext assemblyCall() {
			return getRuleContext(AssemblyCallContext.class,0);
		}
		public AssemblyLiteralContext assemblyLiteral() {
			return getRuleContext(AssemblyLiteralContext.class,0);
		}
		public AssemblyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyExpression; }
	}

	public final AssemblyExpressionContext assemblyExpression() throws RecognitionException {
		AssemblyExpressionContext _localctx = new AssemblyExpressionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_assemblyExpression);
		try {
			setState(828);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__33:
			case T__39:
			case T__45:
			case T__51:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(826);
				assemblyCall();
				}
				break;
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(827);
				assemblyLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<AssemblyExpressionContext> assemblyExpression() {
			return getRuleContexts(AssemblyExpressionContext.class);
		}
		public AssemblyExpressionContext assemblyExpression(int i) {
			return getRuleContext(AssemblyExpressionContext.class,i);
		}
		public AssemblyCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyCall; }
	}

	public final AssemblyCallContext assemblyCall() throws RecognitionException {
		AssemblyCallContext _localctx = new AssemblyCallContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_assemblyCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
				{
				setState(830);
				match(T__45);
				}
				break;
			case T__33:
				{
				setState(831);
				match(T__33);
				}
				break;
			case T__51:
				{
				setState(832);
				match(T__51);
				}
				break;
			case T__12:
			case T__39:
			case Identifier:
				{
				setState(833);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(836);
				match(T__20);
				setState(838);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4575085063053312L) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 786443L) != 0)) {
					{
					setState(837);
					assemblyExpression();
					}
				}

				setState(844);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(840);
					match(T__14);
					setState(841);
					assemblyExpression();
					}
					}
					setState(846);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(847);
				match(T__21);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyLocalDefinitionContext extends ParserRuleContext {
		public AssemblyIdentifierOrListContext assemblyIdentifierOrList() {
			return getRuleContext(AssemblyIdentifierOrListContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyLocalDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLocalDefinition; }
	}

	public final AssemblyLocalDefinitionContext assemblyLocalDefinition() throws RecognitionException {
		AssemblyLocalDefinitionContext _localctx = new AssemblyLocalDefinitionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_assemblyLocalDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			match(T__83);
			setState(851);
			assemblyIdentifierOrList();
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__84) {
				{
				setState(852);
				match(T__84);
				setState(853);
				assemblyExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyAssignmentContext extends ParserRuleContext {
		public AssemblyIdentifierOrListContext assemblyIdentifierOrList() {
			return getRuleContext(AssemblyIdentifierOrListContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyAssignment; }
	}

	public final AssemblyAssignmentContext assemblyAssignment() throws RecognitionException {
		AssemblyAssignmentContext _localctx = new AssemblyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_assemblyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			assemblyIdentifierOrList();
			setState(857);
			match(T__84);
			setState(858);
			assemblyExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyIdentifierOrListContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyIdentifierOrListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIdentifierOrList; }
	}

	public final AssemblyIdentifierOrListContext assemblyIdentifierOrList() throws RecognitionException {
		AssemblyIdentifierOrListContext _localctx = new AssemblyIdentifierOrListContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_assemblyIdentifierOrList);
		try {
			setState(865);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__39:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(860);
				identifier();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(861);
				match(T__20);
				setState(862);
				assemblyIdentifierList();
				setState(863);
				match(T__21);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyIdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public AssemblyIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIdentifierList; }
	}

	public final AssemblyIdentifierListContext assemblyIdentifierList() throws RecognitionException {
		AssemblyIdentifierListContext _localctx = new AssemblyIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_assemblyIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			identifier();
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(868);
				match(T__14);
				setState(869);
				identifier();
				}
				}
				setState(874);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyStackAssignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyStackAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyStackAssignment; }
	}

	public final AssemblyStackAssignmentContext assemblyStackAssignment() throws RecognitionException {
		AssemblyStackAssignmentContext _localctx = new AssemblyStackAssignmentContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_assemblyStackAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			match(T__85);
			setState(876);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LabelDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabelDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDefinition; }
	}

	public final LabelDefinitionContext labelDefinition() throws RecognitionException {
		LabelDefinitionContext _localctx = new LabelDefinitionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_labelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			identifier();
			setState(879);
			match(T__72);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblySwitchContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public List<AssemblyCaseContext> assemblyCase() {
			return getRuleContexts(AssemblyCaseContext.class);
		}
		public AssemblyCaseContext assemblyCase(int i) {
			return getRuleContext(AssemblyCaseContext.class,i);
		}
		public AssemblySwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblySwitch; }
	}

	public final AssemblySwitchContext assemblySwitch() throws RecognitionException {
		AssemblySwitchContext _localctx = new AssemblySwitchContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_assemblySwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			match(T__86);
			setState(882);
			assemblyExpression();
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__87 || _la==T__88) {
				{
				{
				setState(883);
				assemblyCase();
				}
				}
				setState(888);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyCaseContext extends ParserRuleContext {
		public AssemblyLiteralContext assemblyLiteral() {
			return getRuleContext(AssemblyLiteralContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyCase; }
	}

	public final AssemblyCaseContext assemblyCase() throws RecognitionException {
		AssemblyCaseContext _localctx = new AssemblyCaseContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_assemblyCase);
		try {
			setState(895);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__87:
				enterOuterAlt(_localctx, 1);
				{
				setState(889);
				match(T__87);
				setState(890);
				assemblyLiteral();
				setState(891);
				assemblyBlock();
				}
				break;
			case T__88:
				enterOuterAlt(_localctx, 2);
				{
				setState(893);
				match(T__88);
				setState(894);
				assemblyBlock();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyFunctionDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyFunctionReturnsContext assemblyFunctionReturns() {
			return getRuleContext(AssemblyFunctionReturnsContext.class,0);
		}
		public AssemblyFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFunctionDefinition; }
	}

	public final AssemblyFunctionDefinitionContext assemblyFunctionDefinition() throws RecognitionException {
		AssemblyFunctionDefinitionContext _localctx = new AssemblyFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_assemblyFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			match(T__27);
			setState(898);
			identifier();
			setState(899);
			match(T__20);
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12 || _la==T__39 || _la==Identifier) {
				{
				setState(900);
				assemblyIdentifierList();
				}
			}

			setState(903);
			match(T__21);
			setState(905);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__89) {
				{
				setState(904);
				assemblyFunctionReturns();
				}
			}

			setState(907);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyFunctionReturnsContext extends ParserRuleContext {
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyFunctionReturnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFunctionReturns; }
	}

	public final AssemblyFunctionReturnsContext assemblyFunctionReturns() throws RecognitionException {
		AssemblyFunctionReturnsContext _localctx = new AssemblyFunctionReturnsContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_assemblyFunctionReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(909);
			match(T__89);
			setState(910);
			assemblyIdentifierList();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyForContext extends ParserRuleContext {
		public List<AssemblyExpressionContext> assemblyExpression() {
			return getRuleContexts(AssemblyExpressionContext.class);
		}
		public AssemblyExpressionContext assemblyExpression(int i) {
			return getRuleContext(AssemblyExpressionContext.class,i);
		}
		public List<AssemblyBlockContext> assemblyBlock() {
			return getRuleContexts(AssemblyBlockContext.class);
		}
		public AssemblyBlockContext assemblyBlock(int i) {
			return getRuleContext(AssemblyBlockContext.class,i);
		}
		public AssemblyForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFor; }
	}

	public final AssemblyForContext assemblyFor() throws RecognitionException {
		AssemblyForContext _localctx = new AssemblyForContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_assemblyFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			match(T__23);
			setState(915);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(913);
				assemblyBlock();
				}
				break;
			case T__12:
			case T__33:
			case T__39:
			case T__45:
			case T__51:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(914);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(917);
			assemblyExpression();
			setState(920);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(918);
				assemblyBlock();
				}
				break;
			case T__12:
			case T__33:
			case T__39:
			case T__45:
			case T__51:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(919);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(922);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyIfContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIf; }
	}

	public final AssemblyIfContext assemblyIf() throws RecognitionException {
		AssemblyIfContext _localctx = new AssemblyIfContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_assemblyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			match(T__40);
			setState(925);
			assemblyExpression();
			setState(926);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblyLiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SolidityParser.HexNumber, 0); }
		public TerminalNode HexLiteral() { return getToken(SolidityParser.HexLiteral, 0); }
		public AssemblyLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLiteral; }
	}

	public final AssemblyLiteralContext assemblyLiteral() throws RecognitionException {
		AssemblyLiteralContext _localctx = new AssemblyLiteralContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_assemblyLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			_la = _input.LA(1);
			if ( !(((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 524299L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubAssemblyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public SubAssemblyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subAssembly; }
	}

	public final SubAssemblyContext subAssembly() throws RecognitionException {
		SubAssemblyContext _localctx = new SubAssemblyContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_subAssembly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			match(T__43);
			setState(931);
			identifier();
			setState(932);
			assemblyBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TupleExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TupleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleExpression; }
	}

	public final TupleExpressionContext tupleExpression() throws RecognitionException {
		TupleExpressionContext _localctx = new TupleExpressionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_tupleExpression);
		int _la;
		try {
			setState(960);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(934);
				match(T__20);
				{
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305281180248842256L) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 109053407L) != 0)) {
					{
					setState(935);
					expression(0);
					}
				}

				setState(944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(938);
					match(T__14);
					setState(940);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305281180248842256L) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 109053407L) != 0)) {
						{
						setState(939);
						expression(0);
						}
					}

					}
					}
					setState(946);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(947);
				match(T__21);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(948);
				match(T__31);
				setState(957);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305281180248842256L) != 0) || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 109053407L) != 0)) {
					{
					setState(949);
					expression(0);
					setState(954);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__14) {
						{
						{
						setState(950);
						match(T__14);
						setState(951);
						expression(0);
						}
						}
						setState(956);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(959);
				match(T__32);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameExpressionContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public TypeNameExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNameExpression; }
	}

	public final TypeNameExpressionContext typeNameExpression() throws RecognitionException {
		TypeNameExpressionContext _localctx = new TypeNameExpressionContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_typeNameExpression);
		try {
			setState(964);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				enterOuterAlt(_localctx, 1);
				{
				setState(962);
				elementaryTypeName();
				}
				break;
			case T__12:
			case T__39:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(963);
				userDefinedTypeName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(SolidityParser.HexNumber, 0); }
		public TerminalNode NumberUnit() { return getToken(SolidityParser.NumberUnit, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			_la = _input.LA(1);
			if ( !(_la==DecimalNumber || _la==HexNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(968);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(967);
				match(NumberUnit);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__39 || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 32:
			return typeName_sempred((TypeNameContext)_localctx, predIndex);
		case 56:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean typeName_sempred(TypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 5);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 25);
		case 15:
			return precpred(_ctx, 23);
		case 16:
			return precpred(_ctx, 22);
		case 17:
			return precpred(_ctx, 21);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001z\u03cd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u00ae\b\u0000\n\u0000\f\u0000"+
		"\u00b1\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u00be\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u00c2\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0003\u0006\u00c7\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00ce"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00d4\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00da\b\b\u0001\b\u0001\b\u0003\b\u00de\b\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u00e8\b\b\n\b\f\b\u00eb\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0003\b\u00f2\b\b\u0001\t\u0001\t\u0001\n\u0003\n\u00f7\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00ff\b\n\n\n\f\n\u0102\t\n"+
		"\u0003\n\u0104\b\n\u0001\n\u0001\n\u0005\n\u0108\b\n\n\n\f\n\u010b\t\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0112"+
		"\b\u000b\u0001\u000b\u0003\u000b\u0115\b\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u011f\b\f\u0001\r\u0001"+
		"\r\u0005\r\u0123\b\r\n\r\f\r\u0126\t\r\u0001\r\u0001\r\u0001\r\u0003\r"+
		"\u012b\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0134\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u0140\b\u000f\n\u000f\f\u000f\u0143\t\u000f\u0003"+
		"\u000f\u0145\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u0151\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u0158\b\u0012\u0001\u0012\u0003\u0012\u015b\b\u0012"+
		"\u0001\u0013\u0003\u0013\u015e\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0162\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0167\b"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u016b\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u0176\b\u0015\n\u0015\f\u0015\u0179\t\u0015"+
		"\u0001\u0016\u0003\u0016\u017c\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0182\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u018c\b\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0190\b\u0018\n\u0018"+
		"\f\u0018\u0193\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u019b\b\u0019\n\u0019\f\u0019\u019e"+
		"\t\u0019\u0003\u0019\u01a0\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u01a6\b\u001a\u0001\u001a\u0003\u001a\u01a9\b"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u01af"+
		"\b\u001b\n\u001b\f\u001b\u01b2\t\u001b\u0003\u001b\u01b4\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u01ba\b\u001c\u0001"+
		"\u001c\u0003\u001c\u01bd\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u01c3\b\u001d\n\u001d\f\u001d\u01c6\t\u001d\u0003\u001d"+
		"\u01c8\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u01ce\b\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u01d2\b\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u01dd\b \u0001 \u0001 \u0001 \u0003 \u01e2\b \u0001 \u0005 \u01e5\b"+
		" \n \f \u01e8\t \u0001!\u0001!\u0001!\u0005!\u01ed\b!\n!\f!\u01f0\t!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0005#\u01fe\b#\n#\f#\u0201\t#\u0001#\u0001#\u0003#\u0205"+
		"\b#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0005&\u020d\b&\n&\f&\u0210"+
		"\t&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0220\b\'\u0001(\u0001"+
		"(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u022c"+
		"\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0003+\u0236"+
		"\b+\u0001,\u0001,\u0001,\u0001,\u0003,\u023c\b,\u0001,\u0001,\u0003,\u0240"+
		"\b,\u0001,\u0003,\u0243\b,\u0001,\u0001,\u0001,\u0001-\u0001-\u0003-\u024a"+
		"\b-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00011\u00011\u00031\u025e"+
		"\b1\u00011\u00011\u00012\u00012\u00012\u00013\u00013\u00013\u00013\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00034\u0270\b4\u00014\u0001"+
		"4\u00034\u0274\b4\u00014\u00014\u00015\u00035\u0279\b5\u00015\u00015\u0003"+
		"5\u027d\b5\u00055\u027f\b5\n5\f5\u0282\t5\u00016\u00016\u00036\u0286\b"+
		"6\u00016\u00056\u0289\b6\n6\f6\u028c\t6\u00016\u00036\u028f\b6\u00016"+
		"\u00016\u00017\u00017\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00038\u02a7\b8\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00058\u02e2\b8\n8\f8\u02e5\t8\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00039\u02ee\b9\u00019\u00019\u00019\u00019\u00019\u00039\u02f5"+
		"\b9\u00039\u02f7\b9\u0001:\u0001:\u0001:\u0005:\u02fc\b:\n:\f:\u02ff\t"+
		":\u0001;\u0001;\u0001;\u0005;\u0304\b;\n;\f;\u0307\t;\u0001;\u0003;\u030a"+
		"\b;\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0003=\u0312\b=\u0001=\u0001"+
		"=\u0003=\u0316\b=\u0003=\u0318\b=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		"?\u0001?\u0005?\u0321\b?\n?\f?\u0324\t?\u0001?\u0001?\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0001@\u0003@\u0339\b@\u0001A\u0001A\u0003A\u033d"+
		"\bA\u0001B\u0001B\u0001B\u0001B\u0003B\u0343\bB\u0001B\u0001B\u0003B\u0347"+
		"\bB\u0001B\u0001B\u0005B\u034b\bB\nB\fB\u034e\tB\u0001B\u0003B\u0351\b"+
		"B\u0001C\u0001C\u0001C\u0001C\u0003C\u0357\bC\u0001D\u0001D\u0001D\u0001"+
		"D\u0001E\u0001E\u0001E\u0001E\u0001E\u0003E\u0362\bE\u0001F\u0001F\u0001"+
		"F\u0005F\u0367\bF\nF\fF\u036a\tF\u0001G\u0001G\u0001G\u0001H\u0001H\u0001"+
		"H\u0001I\u0001I\u0001I\u0005I\u0375\bI\nI\fI\u0378\tI\u0001J\u0001J\u0001"+
		"J\u0001J\u0001J\u0001J\u0003J\u0380\bJ\u0001K\u0001K\u0001K\u0001K\u0003"+
		"K\u0386\bK\u0001K\u0001K\u0003K\u038a\bK\u0001K\u0001K\u0001L\u0001L\u0001"+
		"L\u0001M\u0001M\u0001M\u0003M\u0394\bM\u0001M\u0001M\u0001M\u0003M\u0399"+
		"\bM\u0001M\u0001M\u0001N\u0001N\u0001N\u0001N\u0001O\u0001O\u0001P\u0001"+
		"P\u0001P\u0001P\u0001Q\u0001Q\u0003Q\u03a9\bQ\u0001Q\u0001Q\u0003Q\u03ad"+
		"\bQ\u0005Q\u03af\bQ\nQ\fQ\u03b2\tQ\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q"+
		"\u0005Q\u03b9\bQ\nQ\fQ\u03bc\tQ\u0003Q\u03be\bQ\u0001Q\u0003Q\u03c1\b"+
		"Q\u0001R\u0001R\u0003R\u03c5\bR\u0001S\u0001S\u0003S\u03c9\bS\u0001T\u0001"+
		"T\u0001T\u0000\u0002@pU\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u0000\u0012\u0001\u0000\u0003\t\u0001\u0000[\\\u0001\u0000\u0011\u0013"+
		"\u0003\u0000kkooqr\u0001\u0000&(\u0004\u0000kkppssuu\u0003\u0000\"\"1"+
		"4]a\u0001\u000056\u0001\u000089\u0001\u0000:;\u0002\u0000\f\f>?\u0001"+
		"\u0000@A\u0001\u0000\u0005\b\u0001\u0000DE\u0002\u0000\t\tJS\u0003\u0000"+
		"deggww\u0001\u0000de\u0003\u0000\r\r((vv\u042a\u0000\u00af\u0001\u0000"+
		"\u0000\u0000\u0002\u00b4\u0001\u0000\u0000\u0000\u0004\u00b9\u0001\u0000"+
		"\u0000\u0000\u0006\u00bd\u0001\u0000\u0000\u0000\b\u00bf\u0001\u0000\u0000"+
		"\u0000\n\u00c3\u0001\u0000\u0000\u0000\f\u00c6\u0001\u0000\u0000\u0000"+
		"\u000e\u00ca\u0001\u0000\u0000\u0000\u0010\u00f1\u0001\u0000\u0000\u0000"+
		"\u0012\u00f3\u0001\u0000\u0000\u0000\u0014\u00f6\u0001\u0000\u0000\u0000"+
		"\u0016\u010e\u0001\u0000\u0000\u0000\u0018\u011e\u0001\u0000\u0000\u0000"+
		"\u001a\u0120\u0001\u0000\u0000\u0000\u001c\u012e\u0001\u0000\u0000\u0000"+
		"\u001e\u0137\u0001\u0000\u0000\u0000 \u0148\u0001\u0000\u0000\u0000\""+
		"\u014d\u0001\u0000\u0000\u0000$\u0154\u0001\u0000\u0000\u0000&\u015d\u0001"+
		"\u0000\u0000\u0000(\u016c\u0001\u0000\u0000\u0000*\u0177\u0001\u0000\u0000"+
		"\u0000,\u017b\u0001\u0000\u0000\u0000.\u0185\u0001\u0000\u0000\u00000"+
		"\u0187\u0001\u0000\u0000\u00002\u0196\u0001\u0000\u0000\u00004\u01a3\u0001"+
		"\u0000\u0000\u00006\u01aa\u0001\u0000\u0000\u00008\u01b7\u0001\u0000\u0000"+
		"\u0000:\u01be\u0001\u0000\u0000\u0000<\u01cb\u0001\u0000\u0000\u0000>"+
		"\u01cf\u0001\u0000\u0000\u0000@\u01dc\u0001\u0000\u0000\u0000B\u01e9\u0001"+
		"\u0000\u0000\u0000D\u01f1\u0001\u0000\u0000\u0000F\u01f8\u0001\u0000\u0000"+
		"\u0000H\u0206\u0001\u0000\u0000\u0000J\u0208\u0001\u0000\u0000\u0000L"+
		"\u020a\u0001\u0000\u0000\u0000N\u021f\u0001\u0000\u0000\u0000P\u0221\u0001"+
		"\u0000\u0000\u0000R\u0224\u0001\u0000\u0000\u0000T\u022d\u0001\u0000\u0000"+
		"\u0000V\u0235\u0001\u0000\u0000\u0000X\u0237\u0001\u0000\u0000\u0000Z"+
		"\u0247\u0001\u0000\u0000\u0000\\\u024d\u0001\u0000\u0000\u0000^\u0255"+
		"\u0001\u0000\u0000\u0000`\u0258\u0001\u0000\u0000\u0000b\u025b\u0001\u0000"+
		"\u0000\u0000d\u0261\u0001\u0000\u0000\u0000f\u0264\u0001\u0000\u0000\u0000"+
		"h\u026f\u0001\u0000\u0000\u0000j\u0278\u0001\u0000\u0000\u0000l\u0283"+
		"\u0001\u0000\u0000\u0000n\u0292\u0001\u0000\u0000\u0000p\u02a6\u0001\u0000"+
		"\u0000\u0000r\u02f6\u0001\u0000\u0000\u0000t\u02f8\u0001\u0000\u0000\u0000"+
		"v\u0300\u0001\u0000\u0000\u0000x\u030b\u0001\u0000\u0000\u0000z\u0317"+
		"\u0001\u0000\u0000\u0000|\u0319\u0001\u0000\u0000\u0000~\u031e\u0001\u0000"+
		"\u0000\u0000\u0080\u0338\u0001\u0000\u0000\u0000\u0082\u033c\u0001\u0000"+
		"\u0000\u0000\u0084\u0342\u0001\u0000\u0000\u0000\u0086\u0352\u0001\u0000"+
		"\u0000\u0000\u0088\u0358\u0001\u0000\u0000\u0000\u008a\u0361\u0001\u0000"+
		"\u0000\u0000\u008c\u0363\u0001\u0000\u0000\u0000\u008e\u036b\u0001\u0000"+
		"\u0000\u0000\u0090\u036e\u0001\u0000\u0000\u0000\u0092\u0371\u0001\u0000"+
		"\u0000\u0000\u0094\u037f\u0001\u0000\u0000\u0000\u0096\u0381\u0001\u0000"+
		"\u0000\u0000\u0098\u038d\u0001\u0000\u0000\u0000\u009a\u0390\u0001\u0000"+
		"\u0000\u0000\u009c\u039c\u0001\u0000\u0000\u0000\u009e\u03a0\u0001\u0000"+
		"\u0000\u0000\u00a0\u03a2\u0001\u0000\u0000\u0000\u00a2\u03c0\u0001\u0000"+
		"\u0000\u0000\u00a4\u03c4\u0001\u0000\u0000\u0000\u00a6\u03c6\u0001\u0000"+
		"\u0000\u0000\u00a8\u03ca\u0001\u0000\u0000\u0000\u00aa\u00ae\u0003\u0002"+
		"\u0001\u0000\u00ab\u00ae\u0003\u0010\b\u0000\u00ac\u00ae\u0003\u0014\n"+
		"\u0000\u00ad\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000"+
		"\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0005\u0000\u0000\u0001\u00b3\u0001\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0005\u0001\u0000\u0000\u00b5\u00b6\u0003\u0004\u0002"+
		"\u0000\u00b6\u00b7\u0003\u0006\u0003\u0000\u00b7\u00b8\u0005\u0002\u0000"+
		"\u0000\u00b8\u0003\u0001\u0000\u0000\u0000\u00b9\u00ba\u0003\u00a8T\u0000"+
		"\u00ba\u0005\u0001\u0000\u0000\u0000\u00bb\u00be\u0003\b\u0004\u0000\u00bc"+
		"\u00be\u0003p8\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00bc\u0001"+
		"\u0000\u0000\u0000\u00be\u0007\u0001\u0000\u0000\u0000\u00bf\u00c1\u0003"+
		"\f\u0006\u0000\u00c0\u00c2\u0003\f\u0006\u0000\u00c1\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\t\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0007\u0000\u0000\u0000\u00c4\u000b\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c7\u0003\n\u0005\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0005b\u0000\u0000\u00c9\r\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cd\u0003\u00a8T\u0000\u00cb\u00cc\u0005\n\u0000\u0000\u00cc\u00ce"+
		"\u0003\u00a8T\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001"+
		"\u0000\u0000\u0000\u00ce\u000f\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005"+
		"\u000b\u0000\u0000\u00d0\u00d3\u0005w\u0000\u0000\u00d1\u00d2\u0005\n"+
		"\u0000\u0000\u00d2\u00d4\u0003\u00a8T\u0000\u00d3\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d5\u00f2\u0005\u0002\u0000\u0000\u00d6\u00d9\u0005\u000b\u0000"+
		"\u0000\u00d7\u00da\u0005\f\u0000\u0000\u00d8\u00da\u0003\u00a8T\u0000"+
		"\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000"+
		"\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\n\u0000\u0000\u00dc"+
		"\u00de\u0003\u00a8T\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0005\r\u0000\u0000\u00e0\u00e1\u0005w\u0000\u0000\u00e1\u00f2\u0005"+
		"\u0002\u0000\u0000\u00e2\u00e3\u0005\u000b\u0000\u0000\u00e3\u00e4\u0005"+
		"\u000e\u0000\u0000\u00e4\u00e9\u0003\u000e\u0007\u0000\u00e5\u00e6\u0005"+
		"\u000f\u0000\u0000\u00e6\u00e8\u0003\u000e\u0007\u0000\u00e7\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00ec\u0001"+
		"\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005"+
		"\u0010\u0000\u0000\u00ed\u00ee\u0005\r\u0000\u0000\u00ee\u00ef\u0005w"+
		"\u0000\u0000\u00ef\u00f0\u0005\u0002\u0000\u0000\u00f0\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f1\u00cf\u0001\u0000\u0000\u0000\u00f1\u00d6\u0001\u0000"+
		"\u0000\u0000\u00f1\u00e2\u0001\u0000\u0000\u0000\u00f2\u0011\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0007\u0001\u0000\u0000\u00f4\u0013\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f7\u0003\u0012\t\u0000\u00f6\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0007\u0002\u0000\u0000\u00f9\u0103\u0003\u00a8T\u0000"+
		"\u00fa\u00fb\u0005\u0014\u0000\u0000\u00fb\u0100\u0003\u0016\u000b\u0000"+
		"\u00fc\u00fd\u0005\u000f\u0000\u0000\u00fd\u00ff\u0003\u0016\u000b\u0000"+
		"\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000"+
		"\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000"+
		"\u0101\u0104\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000"+
		"\u0103\u00fa\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0109\u0005\u000e\u0000\u0000"+
		"\u0106\u0108\u0003\u0018\f\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108"+
		"\u010b\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u0001\u0000\u0000\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b"+
		"\u0109\u0001\u0000\u0000\u0000\u010c\u010d\u0005\u0010\u0000\u0000\u010d"+
		"\u0015\u0001\u0000\u0000\u0000\u010e\u0114\u0003B!\u0000\u010f\u0111\u0005"+
		"\u0015\u0000\u0000\u0110\u0112\u0003t:\u0000\u0111\u0110\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000"+
		"\u0000\u0113\u0115\u0005\u0016\u0000\u0000\u0114\u010f\u0001\u0000\u0000"+
		"\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0017\u0001\u0000\u0000"+
		"\u0000\u0116\u011f\u0003\u001a\r\u0000\u0117\u011f\u0003\u001c\u000e\u0000"+
		"\u0118\u011f\u0003\u001e\u000f\u0000\u0119\u011f\u0003 \u0010\u0000\u011a"+
		"\u011f\u0003\"\u0011\u0000\u011b\u011f\u0003&\u0013\u0000\u011c\u011f"+
		"\u0003,\u0016\u0000\u011d\u011f\u00030\u0018\u0000\u011e\u0116\u0001\u0000"+
		"\u0000\u0000\u011e\u0117\u0001\u0000\u0000\u0000\u011e\u0118\u0001\u0000"+
		"\u0000\u0000\u011e\u0119\u0001\u0000\u0000\u0000\u011e\u011a\u0001\u0000"+
		"\u0000\u0000\u011e\u011b\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000"+
		"\u0000\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011f\u0019\u0001\u0000"+
		"\u0000\u0000\u0120\u0124\u0003@ \u0000\u0121\u0123\u0007\u0003\u0000\u0000"+
		"\u0122\u0121\u0001\u0000\u0000\u0000\u0123\u0126\u0001\u0000\u0000\u0000"+
		"\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000"+
		"\u0125\u0127\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000"+
		"\u0127\u012a\u0003\u00a8T\u0000\u0128\u0129\u0005\t\u0000\u0000\u0129"+
		"\u012b\u0003p8\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001"+
		"\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012d\u0005"+
		"\u0002\u0000\u0000\u012d\u001b\u0001\u0000\u0000\u0000\u012e\u012f\u0005"+
		"\u0017\u0000\u0000\u012f\u0130\u0003\u00a8T\u0000\u0130\u0133\u0005\u0018"+
		"\u0000\u0000\u0131\u0134\u0005\f\u0000\u0000\u0132\u0134\u0003@ \u0000"+
		"\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0132\u0001\u0000\u0000\u0000"+
		"\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0136\u0005\u0002\u0000\u0000"+
		"\u0136\u001d\u0001\u0000\u0000\u0000\u0137\u0138\u0005\u0019\u0000\u0000"+
		"\u0138\u0139\u0003\u00a8T\u0000\u0139\u0144\u0005\u000e\u0000\u0000\u013a"+
		"\u013b\u0003>\u001f\u0000\u013b\u0141\u0005\u0002\u0000\u0000\u013c\u013d"+
		"\u0003>\u001f\u0000\u013d\u013e\u0005\u0002\u0000\u0000\u013e\u0140\u0001"+
		"\u0000\u0000\u0000\u013f\u013c\u0001\u0000\u0000\u0000\u0140\u0143\u0001"+
		"\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001"+
		"\u0000\u0000\u0000\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0141\u0001"+
		"\u0000\u0000\u0000\u0144\u013a\u0001\u0000\u0000\u0000\u0144\u0145\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0005"+
		"\u0010\u0000\u0000\u0147\u001f\u0001\u0000\u0000\u0000\u0148\u0149\u0005"+
		"\u001a\u0000\u0000\u0149\u014a\u00032\u0019\u0000\u014a\u014b\u0003*\u0015"+
		"\u0000\u014b\u014c\u0003L&\u0000\u014c!\u0001\u0000\u0000\u0000\u014d"+
		"\u014e\u0005\u001b\u0000\u0000\u014e\u0150\u0003\u00a8T\u0000\u014f\u0151"+
		"\u00032\u0019\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0150\u0151\u0001"+
		"\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0153\u0003"+
		"L&\u0000\u0153#\u0001\u0000\u0000\u0000\u0154\u015a\u0003\u00a8T\u0000"+
		"\u0155\u0157\u0005\u0015\u0000\u0000\u0156\u0158\u0003t:\u0000\u0157\u0156"+
		"\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u0159"+
		"\u0001\u0000\u0000\u0000\u0159\u015b\u0005\u0016\u0000\u0000\u015a\u0155"+
		"\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b%\u0001"+
		"\u0000\u0000\u0000\u015c\u015e\u0003\u0012\t\u0000\u015d\u015c\u0001\u0000"+
		"\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000"+
		"\u0000\u0000\u015f\u0161\u0005\u001c\u0000\u0000\u0160\u0162\u0003\u00a8"+
		"T\u0000\u0161\u0160\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0164\u00032\u0019\u0000"+
		"\u0164\u0166\u0003*\u0015\u0000\u0165\u0167\u0003(\u0014\u0000\u0166\u0165"+
		"\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u016a"+
		"\u0001\u0000\u0000\u0000\u0168\u016b\u0005\u0002\u0000\u0000\u0169\u016b"+
		"\u0003L&\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a\u0169\u0001\u0000"+
		"\u0000\u0000\u016b\'\u0001\u0000\u0000\u0000\u016c\u016d\u0005\u001d\u0000"+
		"\u0000\u016d\u016e\u00032\u0019\u0000\u016e)\u0001\u0000\u0000\u0000\u016f"+
		"\u0176\u0003$\u0012\u0000\u0170\u0176\u0003J%\u0000\u0171\u0176\u0005"+
		"m\u0000\u0000\u0172\u0176\u0005r\u0000\u0000\u0173\u0176\u0005o\u0000"+
		"\u0000\u0174\u0176\u0005q\u0000\u0000\u0175\u016f\u0001\u0000\u0000\u0000"+
		"\u0175\u0170\u0001\u0000\u0000\u0000\u0175\u0171\u0001\u0000\u0000\u0000"+
		"\u0175\u0172\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000"+
		"\u0175\u0174\u0001\u0000\u0000\u0000\u0176\u0179\u0001\u0000\u0000\u0000"+
		"\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000"+
		"\u0178+\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u017a"+
		"\u017c\u0003\u0012\t\u0000\u017b\u017a\u0001\u0000\u0000\u0000\u017b\u017c"+
		"\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017e"+
		"\u0005\u001e\u0000\u0000\u017e\u017f\u0003\u00a8T\u0000\u017f\u0181\u0003"+
		"6\u001b\u0000\u0180\u0182\u0005i\u0000\u0000\u0181\u0180\u0001\u0000\u0000"+
		"\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000"+
		"\u0000\u0183\u0184\u0005\u0002\u0000\u0000\u0184-\u0001\u0000\u0000\u0000"+
		"\u0185\u0186\u0003\u00a8T\u0000\u0186/\u0001\u0000\u0000\u0000\u0187\u0188"+
		"\u0005\u001f\u0000\u0000\u0188\u0189\u0003\u00a8T\u0000\u0189\u018b\u0005"+
		"\u000e\u0000\u0000\u018a\u018c\u0003.\u0017\u0000\u018b\u018a\u0001\u0000"+
		"\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u0191\u0001\u0000"+
		"\u0000\u0000\u018d\u018e\u0005\u000f\u0000\u0000\u018e\u0190\u0003.\u0017"+
		"\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u0190\u0193\u0001\u0000\u0000"+
		"\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000"+
		"\u0000\u0192\u0194\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000"+
		"\u0000\u0194\u0195\u0005\u0010\u0000\u0000\u01951\u0001\u0000\u0000\u0000"+
		"\u0196\u019f\u0005\u0015\u0000\u0000\u0197\u019c\u00034\u001a\u0000\u0198"+
		"\u0199\u0005\u000f\u0000\u0000\u0199\u019b\u00034\u001a\u0000\u019a\u0198"+
		"\u0001\u0000\u0000\u0000\u019b\u019e\u0001\u0000\u0000\u0000\u019c\u019a"+
		"\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u01a0"+
		"\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019f\u0197"+
		"\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005\u0016\u0000\u0000\u01a23\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a5\u0003@ \u0000\u01a4\u01a6\u0003H$\u0000"+
		"\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a8\u0001\u0000\u0000\u0000\u01a7\u01a9\u0003\u00a8T\u0000\u01a8"+
		"\u01a7\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9"+
		"5\u0001\u0000\u0000\u0000\u01aa\u01b3\u0005\u0015\u0000\u0000\u01ab\u01b0"+
		"\u00038\u001c\u0000\u01ac\u01ad\u0005\u000f\u0000\u0000\u01ad\u01af\u0003"+
		"8\u001c\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01af\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000"+
		"\u0000\u0000\u01b1\u01b4\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b3\u01ab\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005\u0016"+
		"\u0000\u0000\u01b67\u0001\u0000\u0000\u0000\u01b7\u01b9\u0003@ \u0000"+
		"\u01b8\u01ba\u0005n\u0000\u0000\u01b9\u01b8\u0001\u0000\u0000\u0000\u01b9"+
		"\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bc\u0001\u0000\u0000\u0000\u01bb"+
		"\u01bd\u0003\u00a8T\u0000\u01bc\u01bb\u0001\u0000\u0000\u0000\u01bc\u01bd"+
		"\u0001\u0000\u0000\u0000\u01bd9\u0001\u0000\u0000\u0000\u01be\u01c7\u0005"+
		"\u0015\u0000\u0000\u01bf\u01c4\u0003<\u001e\u0000\u01c0\u01c1\u0005\u000f"+
		"\u0000\u0000\u01c1\u01c3\u0003<\u001e\u0000\u01c2\u01c0\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c6\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c8\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c7\u01bf\u0001\u0000\u0000"+
		"\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000"+
		"\u0000\u01c9\u01ca\u0005\u0016\u0000\u0000\u01ca;\u0001\u0000\u0000\u0000"+
		"\u01cb\u01cd\u0003@ \u0000\u01cc\u01ce\u0003H$\u0000\u01cd\u01cc\u0001"+
		"\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce=\u0001\u0000"+
		"\u0000\u0000\u01cf\u01d1\u0003@ \u0000\u01d0\u01d2\u0003H$\u0000\u01d1"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d4\u0003\u00a8T\u0000\u01d4?\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d6\u0006 \uffff\uffff\u0000\u01d6\u01dd\u0003"+
		"n7\u0000\u01d7\u01dd\u0003B!\u0000\u01d8\u01dd\u0003D\"\u0000\u01d9\u01dd"+
		"\u0003F#\u0000\u01da\u01db\u0005\"\u0000\u0000\u01db\u01dd\u0005p\u0000"+
		"\u0000\u01dc\u01d5\u0001\u0000\u0000\u0000\u01dc\u01d7\u0001\u0000\u0000"+
		"\u0000\u01dc\u01d8\u0001\u0000\u0000\u0000\u01dc\u01d9\u0001\u0000\u0000"+
		"\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dd\u01e6\u0001\u0000\u0000"+
		"\u0000\u01de\u01df\n\u0003\u0000\u0000\u01df\u01e1\u0005 \u0000\u0000"+
		"\u01e0\u01e2\u0003p8\u0000\u01e1\u01e0\u0001\u0000\u0000\u0000\u01e1\u01e2"+
		"\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e5"+
		"\u0005!\u0000\u0000\u01e4\u01de\u0001\u0000\u0000\u0000\u01e5\u01e8\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001"+
		"\u0000\u0000\u0000\u01e7A\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e9\u01ee\u0003\u00a8T\u0000\u01ea\u01eb\u0005#\u0000\u0000"+
		"\u01eb\u01ed\u0003\u00a8T\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ed"+
		"\u01f0\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ee"+
		"\u01ef\u0001\u0000\u0000\u0000\u01efC\u0001\u0000\u0000\u0000\u01f0\u01ee"+
		"\u0001\u0000\u0000\u0000\u01f1\u01f2\u0005$\u0000\u0000\u01f2\u01f3\u0005"+
		"\u0015\u0000\u0000\u01f3\u01f4\u0003n7\u0000\u01f4\u01f5\u0005%\u0000"+
		"\u0000\u01f5\u01f6\u0003@ \u0000\u01f6\u01f7\u0005\u0016\u0000\u0000\u01f7"+
		"E\u0001\u0000\u0000\u0000\u01f8\u01f9\u0005\u001c\u0000\u0000\u01f9\u01ff"+
		"\u0003:\u001d\u0000\u01fa\u01fe\u0005o\u0000\u0000\u01fb\u01fe\u0005m"+
		"\u0000\u0000\u01fc\u01fe\u0003J%\u0000\u01fd\u01fa\u0001\u0000\u0000\u0000"+
		"\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fc\u0001\u0000\u0000\u0000"+
		"\u01fe\u0201\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000"+
		"\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0204\u0001\u0000\u0000\u0000"+
		"\u0201\u01ff\u0001\u0000\u0000\u0000\u0202\u0203\u0005\u001d\u0000\u0000"+
		"\u0203\u0205\u0003:\u001d\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0204"+
		"\u0205\u0001\u0000\u0000\u0000\u0205G\u0001\u0000\u0000\u0000\u0206\u0207"+
		"\u0007\u0004\u0000\u0000\u0207I\u0001\u0000\u0000\u0000\u0208\u0209\u0007"+
		"\u0005\u0000\u0000\u0209K\u0001\u0000\u0000\u0000\u020a\u020e\u0005\u000e"+
		"\u0000\u0000\u020b\u020d\u0003N\'\u0000\u020c\u020b\u0001\u0000\u0000"+
		"\u0000\u020d\u0210\u0001\u0000\u0000\u0000\u020e\u020c\u0001\u0000\u0000"+
		"\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u0211\u0001\u0000\u0000"+
		"\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0211\u0212\u0005\u0010\u0000"+
		"\u0000\u0212M\u0001\u0000\u0000\u0000\u0213\u0220\u0003R)\u0000\u0214"+
		"\u0220\u0003T*\u0000\u0215\u0220\u0003X,\u0000\u0216\u0220\u0003L&\u0000"+
		"\u0217\u0220\u0003Z-\u0000\u0218\u0220\u0003\\.\u0000\u0219\u0220\u0003"+
		"^/\u0000\u021a\u0220\u0003`0\u0000\u021b\u0220\u0003b1\u0000\u021c\u0220"+
		"\u0003d2\u0000\u021d\u0220\u0003f3\u0000\u021e\u0220\u0003V+\u0000\u021f"+
		"\u0213\u0001\u0000\u0000\u0000\u021f\u0214\u0001\u0000\u0000\u0000\u021f"+
		"\u0215\u0001\u0000\u0000\u0000\u021f\u0216\u0001\u0000\u0000\u0000\u021f"+
		"\u0217\u0001\u0000\u0000\u0000\u021f\u0218\u0001\u0000\u0000\u0000\u021f"+
		"\u0219\u0001\u0000\u0000\u0000\u021f\u021a\u0001\u0000\u0000\u0000\u021f"+
		"\u021b\u0001\u0000\u0000\u0000\u021f\u021c\u0001\u0000\u0000\u0000\u021f"+
		"\u021d\u0001\u0000\u0000\u0000\u021f\u021e\u0001\u0000\u0000\u0000\u0220"+
		"O\u0001\u0000\u0000\u0000\u0221\u0222\u0003p8\u0000\u0222\u0223\u0005"+
		"\u0002\u0000\u0000\u0223Q\u0001\u0000\u0000\u0000\u0224\u0225\u0005)\u0000"+
		"\u0000\u0225\u0226\u0005\u0015\u0000\u0000\u0226\u0227\u0003p8\u0000\u0227"+
		"\u0228\u0005\u0016\u0000\u0000\u0228\u022b\u0003N\'\u0000\u0229\u022a"+
		"\u0005*\u0000\u0000\u022a\u022c\u0003N\'\u0000\u022b\u0229\u0001\u0000"+
		"\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022cS\u0001\u0000\u0000"+
		"\u0000\u022d\u022e\u0005+\u0000\u0000\u022e\u022f\u0005\u0015\u0000\u0000"+
		"\u022f\u0230\u0003p8\u0000\u0230\u0231\u0005\u0016\u0000\u0000\u0231\u0232"+
		"\u0003N\'\u0000\u0232U\u0001\u0000\u0000\u0000\u0233\u0236\u0003h4\u0000"+
		"\u0234\u0236\u0003P(\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0235\u0234"+
		"\u0001\u0000\u0000\u0000\u0236W\u0001\u0000\u0000\u0000\u0237\u0238\u0005"+
		"\u0018\u0000\u0000\u0238\u023b\u0005\u0015\u0000\u0000\u0239\u023c\u0003"+
		"V+\u0000\u023a\u023c\u0005\u0002\u0000\u0000\u023b\u0239\u0001\u0000\u0000"+
		"\u0000\u023b\u023a\u0001\u0000\u0000\u0000\u023c\u023f\u0001\u0000\u0000"+
		"\u0000\u023d\u0240\u0003P(\u0000\u023e\u0240\u0005\u0002\u0000\u0000\u023f"+
		"\u023d\u0001\u0000\u0000\u0000\u023f\u023e\u0001\u0000\u0000\u0000\u0240"+
		"\u0242\u0001\u0000\u0000\u0000\u0241\u0243\u0003p8\u0000\u0242\u0241\u0001"+
		"\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243\u0244\u0001"+
		"\u0000\u0000\u0000\u0244\u0245\u0005\u0016\u0000\u0000\u0245\u0246\u0003"+
		"N\'\u0000\u0246Y\u0001\u0000\u0000\u0000\u0247\u0249\u0005,\u0000\u0000"+
		"\u0248\u024a\u0005w\u0000\u0000\u0249\u0248\u0001\u0000\u0000\u0000\u0249"+
		"\u024a\u0001\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b"+
		"\u024c\u0003~?\u0000\u024c[\u0001\u0000\u0000\u0000\u024d\u024e\u0005"+
		"-\u0000\u0000\u024e\u024f\u0003N\'\u0000\u024f\u0250\u0005+\u0000\u0000"+
		"\u0250\u0251\u0005\u0015\u0000\u0000\u0251\u0252\u0003p8\u0000\u0252\u0253"+
		"\u0005\u0016\u0000\u0000\u0253\u0254\u0005\u0002\u0000\u0000\u0254]\u0001"+
		"\u0000\u0000\u0000\u0255\u0256\u0005l\u0000\u0000\u0256\u0257\u0005\u0002"+
		"\u0000\u0000\u0257_\u0001\u0000\u0000\u0000\u0258\u0259\u0005j\u0000\u0000"+
		"\u0259\u025a\u0005\u0002\u0000\u0000\u025aa\u0001\u0000\u0000\u0000\u025b"+
		"\u025d\u0005.\u0000\u0000\u025c\u025e\u0003p8\u0000\u025d\u025c\u0001"+
		"\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u025f\u0001"+
		"\u0000\u0000\u0000\u025f\u0260\u0005\u0002\u0000\u0000\u0260c\u0001\u0000"+
		"\u0000\u0000\u0261\u0262\u0005/\u0000\u0000\u0262\u0263\u0005\u0002\u0000"+
		"\u0000\u0263e\u0001\u0000\u0000\u0000\u0264\u0265\u00050\u0000\u0000\u0265"+
		"\u0266\u0003|>\u0000\u0266\u0267\u0005\u0002\u0000\u0000\u0267g\u0001"+
		"\u0000\u0000\u0000\u0268\u0269\u00051\u0000\u0000\u0269\u0270\u0003l6"+
		"\u0000\u026a\u0270\u0003>\u001f\u0000\u026b\u026c\u0005\u0015\u0000\u0000"+
		"\u026c\u026d\u0003j5\u0000\u026d\u026e\u0005\u0016\u0000\u0000\u026e\u0270"+
		"\u0001\u0000\u0000\u0000\u026f\u0268\u0001\u0000\u0000\u0000\u026f\u026a"+
		"\u0001\u0000\u0000\u0000\u026f\u026b\u0001\u0000\u0000\u0000\u0270\u0273"+
		"\u0001\u0000\u0000\u0000\u0271\u0272\u0005\t\u0000\u0000\u0272\u0274\u0003"+
		"p8\u0000\u0273\u0271\u0001\u0000\u0000\u0000\u0273\u0274\u0001\u0000\u0000"+
		"\u0000\u0274\u0275\u0001\u0000\u0000\u0000\u0275\u0276\u0005\u0002\u0000"+
		"\u0000\u0276i\u0001\u0000\u0000\u0000\u0277\u0279\u0003>\u001f\u0000\u0278"+
		"\u0277\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000\u0279"+
		"\u0280\u0001\u0000\u0000\u0000\u027a\u027c\u0005\u000f\u0000\u0000\u027b"+
		"\u027d\u0003>\u001f\u0000\u027c\u027b\u0001\u0000\u0000\u0000\u027c\u027d"+
		"\u0001\u0000\u0000\u0000\u027d\u027f\u0001\u0000\u0000\u0000\u027e\u027a"+
		"\u0001\u0000\u0000\u0000\u027f\u0282\u0001\u0000\u0000\u0000\u0280\u027e"+
		"\u0001\u0000\u0000\u0000\u0280\u0281\u0001\u0000\u0000\u0000\u0281k\u0001"+
		"\u0000\u0000\u0000\u0282\u0280\u0001\u0000\u0000\u0000\u0283\u028a\u0005"+
		"\u0015\u0000\u0000\u0284\u0286\u0003\u00a8T\u0000\u0285\u0284\u0001\u0000"+
		"\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286\u0287\u0001\u0000"+
		"\u0000\u0000\u0287\u0289\u0005\u000f\u0000\u0000\u0288\u0285\u0001\u0000"+
		"\u0000\u0000\u0289\u028c\u0001\u0000\u0000\u0000\u028a\u0288\u0001\u0000"+
		"\u0000\u0000\u028a\u028b\u0001\u0000\u0000\u0000\u028b\u028e\u0001\u0000"+
		"\u0000\u0000\u028c\u028a\u0001\u0000\u0000\u0000\u028d\u028f\u0003\u00a8"+
		"T\u0000\u028e\u028d\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000"+
		"\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290\u0291\u0005\u0016\u0000"+
		"\u0000\u0291m\u0001\u0000\u0000\u0000\u0292\u0293\u0007\u0006\u0000\u0000"+
		"\u0293o\u0001\u0000\u0000\u0000\u0294\u0295\u00068\uffff\uffff\u0000\u0295"+
		"\u0296\u00057\u0000\u0000\u0296\u02a7\u0003@ \u0000\u0297\u0298\u0005"+
		"\u0015\u0000\u0000\u0298\u0299\u0003p8\u0000\u0299\u029a\u0005\u0016\u0000"+
		"\u0000\u029a\u02a7\u0001\u0000\u0000\u0000\u029b\u029c\u0007\u0007\u0000"+
		"\u0000\u029c\u02a7\u0003p8\u0013\u029d\u029e\u0007\b\u0000\u0000\u029e"+
		"\u02a7\u0003p8\u0012\u029f\u02a0\u0007\t\u0000\u0000\u02a0\u02a7\u0003"+
		"p8\u0011\u02a1\u02a2\u0005<\u0000\u0000\u02a2\u02a7\u0003p8\u0010\u02a3"+
		"\u02a4\u0005\u0004\u0000\u0000\u02a4\u02a7\u0003p8\u000f\u02a5\u02a7\u0003"+
		"r9\u0000\u02a6\u0294\u0001\u0000\u0000\u0000\u02a6\u0297\u0001\u0000\u0000"+
		"\u0000\u02a6\u029b\u0001\u0000\u0000\u0000\u02a6\u029d\u0001\u0000\u0000"+
		"\u0000\u02a6\u029f\u0001\u0000\u0000\u0000\u02a6\u02a1\u0001\u0000\u0000"+
		"\u0000\u02a6\u02a3\u0001\u0000\u0000\u0000\u02a6\u02a5\u0001\u0000\u0000"+
		"\u0000\u02a7\u02e3\u0001\u0000\u0000\u0000\u02a8\u02a9\n\u000e\u0000\u0000"+
		"\u02a9\u02aa\u0005=\u0000\u0000\u02aa\u02e2\u0003p8\u000f\u02ab\u02ac"+
		"\n\r\u0000\u0000\u02ac\u02ad\u0007\n\u0000\u0000\u02ad\u02e2\u0003p8\u000e"+
		"\u02ae\u02af\n\f\u0000\u0000\u02af\u02b0\u0007\b\u0000\u0000\u02b0\u02e2"+
		"\u0003p8\r\u02b1\u02b2\n\u000b\u0000\u0000\u02b2\u02b3\u0007\u000b\u0000"+
		"\u0000\u02b3\u02e2\u0003p8\f\u02b4\u02b5\n\n\u0000\u0000\u02b5\u02b6\u0005"+
		"B\u0000\u0000\u02b6\u02e2\u0003p8\u000b\u02b7\u02b8\n\t\u0000\u0000\u02b8"+
		"\u02b9\u0005\u0003\u0000\u0000\u02b9\u02e2\u0003p8\n\u02ba\u02bb\n\b\u0000"+
		"\u0000\u02bb\u02bc\u0005C\u0000\u0000\u02bc\u02e2\u0003p8\t\u02bd\u02be"+
		"\n\u0007\u0000\u0000\u02be\u02bf\u0007\f\u0000\u0000\u02bf\u02e2\u0003"+
		"p8\b\u02c0\u02c1\n\u0006\u0000\u0000\u02c1\u02c2\u0007\r\u0000\u0000\u02c2"+
		"\u02e2\u0003p8\u0007\u02c3\u02c4\n\u0005\u0000\u0000\u02c4\u02c5\u0005"+
		"F\u0000\u0000\u02c5\u02e2\u0003p8\u0006\u02c6\u02c7\n\u0004\u0000\u0000"+
		"\u02c7\u02c8\u0005G\u0000\u0000\u02c8\u02e2\u0003p8\u0005\u02c9\u02ca"+
		"\n\u0003\u0000\u0000\u02ca\u02cb\u0005H\u0000\u0000\u02cb\u02cc\u0003"+
		"p8\u0000\u02cc\u02cd\u0005I\u0000\u0000\u02cd\u02ce\u0003p8\u0004\u02ce"+
		"\u02e2\u0001\u0000\u0000\u0000\u02cf\u02d0\n\u0002\u0000\u0000\u02d0\u02d1"+
		"\u0007\u000e\u0000\u0000\u02d1\u02e2\u0003p8\u0003\u02d2\u02d3\n\u0019"+
		"\u0000\u0000\u02d3\u02e2\u0007\u0007\u0000\u0000\u02d4\u02d5\n\u0017\u0000"+
		"\u0000\u02d5\u02d6\u0005 \u0000\u0000\u02d6\u02d7\u0003p8\u0000\u02d7"+
		"\u02d8\u0005!\u0000\u0000\u02d8\u02e2\u0001\u0000\u0000\u0000\u02d9\u02da"+
		"\n\u0016\u0000\u0000\u02da\u02db\u0005\u0015\u0000\u0000\u02db\u02dc\u0003"+
		"z=\u0000\u02dc\u02dd\u0005\u0016\u0000\u0000\u02dd\u02e2\u0001\u0000\u0000"+
		"\u0000\u02de\u02df\n\u0015\u0000\u0000\u02df\u02e0\u0005#\u0000\u0000"+
		"\u02e0\u02e2\u0003\u00a8T\u0000\u02e1\u02a8\u0001\u0000\u0000\u0000\u02e1"+
		"\u02ab\u0001\u0000\u0000\u0000\u02e1\u02ae\u0001\u0000\u0000\u0000\u02e1"+
		"\u02b1\u0001\u0000\u0000\u0000\u02e1\u02b4\u0001\u0000\u0000\u0000\u02e1"+
		"\u02b7\u0001\u0000\u0000\u0000\u02e1\u02ba\u0001\u0000\u0000\u0000\u02e1"+
		"\u02bd\u0001\u0000\u0000\u0000\u02e1\u02c0\u0001\u0000\u0000\u0000\u02e1"+
		"\u02c3\u0001\u0000\u0000\u0000\u02e1\u02c6\u0001\u0000\u0000\u0000\u02e1"+
		"\u02c9\u0001\u0000\u0000\u0000\u02e1\u02cf\u0001\u0000\u0000\u0000\u02e1"+
		"\u02d2\u0001\u0000\u0000\u0000\u02e1\u02d4\u0001\u0000\u0000\u0000\u02e1"+
		"\u02d9\u0001\u0000\u0000\u0000\u02e1\u02de\u0001\u0000\u0000\u0000\u02e2"+
		"\u02e5\u0001\u0000\u0000\u0000\u02e3\u02e1\u0001\u0000\u0000\u0000\u02e3"+
		"\u02e4\u0001\u0000\u0000\u0000\u02e4q\u0001\u0000\u0000\u0000\u02e5\u02e3"+
		"\u0001\u0000\u0000\u0000\u02e6\u02f7\u0005c\u0000\u0000\u02e7\u02f7\u0003"+
		"\u00a6S\u0000\u02e8\u02f7\u0005g\u0000\u0000\u02e9\u02f7\u0005w\u0000"+
		"\u0000\u02ea\u02ed\u0003\u00a8T\u0000\u02eb\u02ec\u0005 \u0000\u0000\u02ec"+
		"\u02ee\u0005!\u0000\u0000\u02ed\u02eb\u0001\u0000\u0000\u0000\u02ed\u02ee"+
		"\u0001\u0000\u0000\u0000\u02ee\u02f7\u0001\u0000\u0000\u0000\u02ef\u02f7"+
		"\u0005t\u0000\u0000\u02f0\u02f7\u0003\u00a2Q\u0000\u02f1\u02f4\u0003\u00a4"+
		"R\u0000\u02f2\u02f3\u0005 \u0000\u0000\u02f3\u02f5\u0005!\u0000\u0000"+
		"\u02f4\u02f2\u0001\u0000\u0000\u0000\u02f4\u02f5\u0001\u0000\u0000\u0000"+
		"\u02f5\u02f7\u0001\u0000\u0000\u0000\u02f6\u02e6\u0001\u0000\u0000\u0000"+
		"\u02f6\u02e7\u0001\u0000\u0000\u0000\u02f6\u02e8\u0001\u0000\u0000\u0000"+
		"\u02f6\u02e9\u0001\u0000\u0000\u0000\u02f6\u02ea\u0001\u0000\u0000\u0000"+
		"\u02f6\u02ef\u0001\u0000\u0000\u0000\u02f6\u02f0\u0001\u0000\u0000\u0000"+
		"\u02f6\u02f1\u0001\u0000\u0000\u0000\u02f7s\u0001\u0000\u0000\u0000\u02f8"+
		"\u02fd\u0003p8\u0000\u02f9\u02fa\u0005\u000f\u0000\u0000\u02fa\u02fc\u0003"+
		"p8\u0000\u02fb\u02f9\u0001\u0000\u0000\u0000\u02fc\u02ff\u0001\u0000\u0000"+
		"\u0000\u02fd\u02fb\u0001\u0000\u0000\u0000\u02fd\u02fe\u0001\u0000\u0000"+
		"\u0000\u02feu\u0001\u0000\u0000\u0000\u02ff\u02fd\u0001\u0000\u0000\u0000"+
		"\u0300\u0305\u0003x<\u0000\u0301\u0302\u0005\u000f\u0000\u0000\u0302\u0304"+
		"\u0003x<\u0000\u0303\u0301\u0001\u0000\u0000\u0000\u0304\u0307\u0001\u0000"+
		"\u0000\u0000\u0305\u0303\u0001\u0000\u0000\u0000\u0305\u0306\u0001\u0000"+
		"\u0000\u0000\u0306\u0309\u0001\u0000\u0000\u0000\u0307\u0305\u0001\u0000"+
		"\u0000\u0000\u0308\u030a\u0005\u000f\u0000\u0000\u0309\u0308\u0001\u0000"+
		"\u0000\u0000\u0309\u030a\u0001\u0000\u0000\u0000\u030aw\u0001\u0000\u0000"+
		"\u0000\u030b\u030c\u0003\u00a8T\u0000\u030c\u030d\u0005I\u0000\u0000\u030d"+
		"\u030e\u0003p8\u0000\u030ey\u0001\u0000\u0000\u0000\u030f\u0311\u0005"+
		"\u000e\u0000\u0000\u0310\u0312\u0003v;\u0000\u0311\u0310\u0001\u0000\u0000"+
		"\u0000\u0311\u0312\u0001\u0000\u0000\u0000\u0312\u0313\u0001\u0000\u0000"+
		"\u0000\u0313\u0318\u0005\u0010\u0000\u0000\u0314\u0316\u0003t:\u0000\u0315"+
		"\u0314\u0001\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000\u0316"+
		"\u0318\u0001\u0000\u0000\u0000\u0317\u030f\u0001\u0000\u0000\u0000\u0317"+
		"\u0315\u0001\u0000\u0000\u0000\u0318{\u0001\u0000\u0000\u0000\u0319\u031a"+
		"\u0003p8\u0000\u031a\u031b\u0005\u0015\u0000\u0000\u031b\u031c\u0003z"+
		"=\u0000\u031c\u031d\u0005\u0016\u0000\u0000\u031d}\u0001\u0000\u0000\u0000"+
		"\u031e\u0322\u0005\u000e\u0000\u0000\u031f\u0321\u0003\u0080@\u0000\u0320"+
		"\u031f\u0001\u0000\u0000\u0000\u0321\u0324\u0001\u0000\u0000\u0000\u0322"+
		"\u0320\u0001\u0000\u0000\u0000\u0322\u0323\u0001\u0000\u0000\u0000\u0323"+
		"\u0325\u0001\u0000\u0000\u0000\u0324\u0322\u0001\u0000\u0000\u0000\u0325"+
		"\u0326\u0005\u0010\u0000\u0000\u0326\u007f\u0001\u0000\u0000\u0000\u0327"+
		"\u0339\u0003\u00a8T\u0000\u0328\u0339\u0003~?\u0000\u0329\u0339\u0003"+
		"\u0082A\u0000\u032a\u0339\u0003\u0086C\u0000\u032b\u0339\u0003\u0088D"+
		"\u0000\u032c\u0339\u0003\u008eG\u0000\u032d\u0339\u0003\u0090H\u0000\u032e"+
		"\u0339\u0003\u0092I\u0000\u032f\u0339\u0003\u0096K\u0000\u0330\u0339\u0003"+
		"\u009aM\u0000\u0331\u0339\u0003\u009cN\u0000\u0332\u0339\u0005j\u0000"+
		"\u0000\u0333\u0339\u0005l\u0000\u0000\u0334\u0339\u0003\u00a0P\u0000\u0335"+
		"\u0339\u0003\u00a6S\u0000\u0336\u0339\u0005w\u0000\u0000\u0337\u0339\u0005"+
		"g\u0000\u0000\u0338\u0327\u0001\u0000\u0000\u0000\u0338\u0328\u0001\u0000"+
		"\u0000\u0000\u0338\u0329\u0001\u0000\u0000\u0000\u0338\u032a\u0001\u0000"+
		"\u0000\u0000\u0338\u032b\u0001\u0000\u0000\u0000\u0338\u032c\u0001\u0000"+
		"\u0000\u0000\u0338\u032d\u0001\u0000\u0000\u0000\u0338\u032e\u0001\u0000"+
		"\u0000\u0000\u0338\u032f\u0001\u0000\u0000\u0000\u0338\u0330\u0001\u0000"+
		"\u0000\u0000\u0338\u0331\u0001\u0000\u0000\u0000\u0338\u0332\u0001\u0000"+
		"\u0000\u0000\u0338\u0333\u0001\u0000\u0000\u0000\u0338\u0334\u0001\u0000"+
		"\u0000\u0000\u0338\u0335\u0001\u0000\u0000\u0000\u0338\u0336\u0001\u0000"+
		"\u0000\u0000\u0338\u0337\u0001\u0000\u0000\u0000\u0339\u0081\u0001\u0000"+
		"\u0000\u0000\u033a\u033d\u0003\u0084B\u0000\u033b\u033d\u0003\u009eO\u0000"+
		"\u033c\u033a\u0001\u0000\u0000\u0000\u033c\u033b\u0001\u0000\u0000\u0000"+
		"\u033d\u0083\u0001\u0000\u0000\u0000\u033e\u0343\u0005.\u0000\u0000\u033f"+
		"\u0343\u0005\"\u0000\u0000\u0340\u0343\u00054\u0000\u0000\u0341\u0343"+
		"\u0003\u00a8T\u0000\u0342\u033e\u0001\u0000\u0000\u0000\u0342\u033f\u0001"+
		"\u0000\u0000\u0000\u0342\u0340\u0001\u0000\u0000\u0000\u0342\u0341\u0001"+
		"\u0000\u0000\u0000\u0343\u0350\u0001\u0000\u0000\u0000\u0344\u0346\u0005"+
		"\u0015\u0000\u0000\u0345\u0347\u0003\u0082A\u0000\u0346\u0345\u0001\u0000"+
		"\u0000\u0000\u0346\u0347\u0001\u0000\u0000\u0000\u0347\u034c\u0001\u0000"+
		"\u0000\u0000\u0348\u0349\u0005\u000f\u0000\u0000\u0349\u034b\u0003\u0082"+
		"A\u0000\u034a\u0348\u0001\u0000\u0000\u0000\u034b\u034e\u0001\u0000\u0000"+
		"\u0000\u034c\u034a\u0001\u0000\u0000\u0000\u034c\u034d\u0001\u0000\u0000"+
		"\u0000\u034d\u034f\u0001\u0000\u0000\u0000\u034e\u034c\u0001\u0000\u0000"+
		"\u0000\u034f\u0351\u0005\u0016\u0000\u0000\u0350\u0344\u0001\u0000\u0000"+
		"\u0000\u0350\u0351\u0001\u0000\u0000\u0000\u0351\u0085\u0001\u0000\u0000"+
		"\u0000\u0352\u0353\u0005T\u0000\u0000\u0353\u0356\u0003\u008aE\u0000\u0354"+
		"\u0355\u0005U\u0000\u0000\u0355\u0357\u0003\u0082A\u0000\u0356\u0354\u0001"+
		"\u0000\u0000\u0000\u0356\u0357\u0001\u0000\u0000\u0000\u0357\u0087\u0001"+
		"\u0000\u0000\u0000\u0358\u0359\u0003\u008aE\u0000\u0359\u035a\u0005U\u0000"+
		"\u0000\u035a\u035b\u0003\u0082A\u0000\u035b\u0089\u0001\u0000\u0000\u0000"+
		"\u035c\u0362\u0003\u00a8T\u0000\u035d\u035e\u0005\u0015\u0000\u0000\u035e"+
		"\u035f\u0003\u008cF\u0000\u035f\u0360\u0005\u0016\u0000\u0000\u0360\u0362"+
		"\u0001\u0000\u0000\u0000\u0361\u035c\u0001\u0000\u0000\u0000\u0361\u035d"+
		"\u0001\u0000\u0000\u0000\u0362\u008b\u0001\u0000\u0000\u0000\u0363\u0368"+
		"\u0003\u00a8T\u0000\u0364\u0365\u0005\u000f\u0000\u0000\u0365\u0367\u0003"+
		"\u00a8T\u0000\u0366\u0364\u0001\u0000\u0000\u0000\u0367\u036a\u0001\u0000"+
		"\u0000\u0000\u0368\u0366\u0001\u0000\u0000\u0000\u0368\u0369\u0001\u0000"+
		"\u0000\u0000\u0369\u008d\u0001\u0000\u0000\u0000\u036a\u0368\u0001\u0000"+
		"\u0000\u0000\u036b\u036c\u0005V\u0000\u0000\u036c\u036d\u0003\u00a8T\u0000"+
		"\u036d\u008f\u0001\u0000\u0000\u0000\u036e\u036f\u0003\u00a8T\u0000\u036f"+
		"\u0370\u0005I\u0000\u0000\u0370\u0091\u0001\u0000\u0000\u0000\u0371\u0372"+
		"\u0005W\u0000\u0000\u0372\u0376\u0003\u0082A\u0000\u0373\u0375\u0003\u0094"+
		"J\u0000\u0374\u0373\u0001\u0000\u0000\u0000\u0375\u0378\u0001\u0000\u0000"+
		"\u0000\u0376\u0374\u0001\u0000\u0000\u0000\u0376\u0377\u0001\u0000\u0000"+
		"\u0000\u0377\u0093\u0001\u0000\u0000\u0000\u0378\u0376\u0001\u0000\u0000"+
		"\u0000\u0379\u037a\u0005X\u0000\u0000\u037a\u037b\u0003\u009eO\u0000\u037b"+
		"\u037c\u0003~?\u0000\u037c\u0380\u0001\u0000\u0000\u0000\u037d\u037e\u0005"+
		"Y\u0000\u0000\u037e\u0380\u0003~?\u0000\u037f\u0379\u0001\u0000\u0000"+
		"\u0000\u037f\u037d\u0001\u0000\u0000\u0000\u0380\u0095\u0001\u0000\u0000"+
		"\u0000\u0381\u0382\u0005\u001c\u0000\u0000\u0382\u0383\u0003\u00a8T\u0000"+
		"\u0383\u0385\u0005\u0015\u0000\u0000\u0384\u0386\u0003\u008cF\u0000\u0385"+
		"\u0384\u0001\u0000\u0000\u0000\u0385\u0386\u0001\u0000\u0000\u0000\u0386"+
		"\u0387\u0001\u0000\u0000\u0000\u0387\u0389\u0005\u0016\u0000\u0000\u0388"+
		"\u038a\u0003\u0098L\u0000\u0389\u0388\u0001\u0000\u0000\u0000\u0389\u038a"+
		"\u0001\u0000\u0000\u0000\u038a\u038b\u0001\u0000\u0000\u0000\u038b\u038c"+
		"\u0003~?\u0000\u038c\u0097\u0001\u0000\u0000\u0000\u038d\u038e\u0005Z"+
		"\u0000\u0000\u038e\u038f\u0003\u008cF\u0000\u038f\u0099\u0001\u0000\u0000"+
		"\u0000\u0390\u0393\u0005\u0018\u0000\u0000\u0391\u0394\u0003~?\u0000\u0392"+
		"\u0394\u0003\u0082A\u0000\u0393\u0391\u0001\u0000\u0000\u0000\u0393\u0392"+
		"\u0001\u0000\u0000\u0000\u0394\u0395\u0001\u0000\u0000\u0000\u0395\u0398"+
		"\u0003\u0082A\u0000\u0396\u0399\u0003~?\u0000\u0397\u0399\u0003\u0082"+
		"A\u0000\u0398\u0396\u0001\u0000\u0000\u0000\u0398\u0397\u0001\u0000\u0000"+
		"\u0000\u0399\u039a\u0001\u0000\u0000\u0000\u039a\u039b\u0003~?\u0000\u039b"+
		"\u009b\u0001\u0000\u0000\u0000\u039c\u039d\u0005)\u0000\u0000\u039d\u039e"+
		"\u0003\u0082A\u0000\u039e\u039f\u0003~?\u0000\u039f\u009d\u0001\u0000"+
		"\u0000\u0000\u03a0\u03a1\u0007\u000f\u0000\u0000\u03a1\u009f\u0001\u0000"+
		"\u0000\u0000\u03a2\u03a3\u0005,\u0000\u0000\u03a3\u03a4\u0003\u00a8T\u0000"+
		"\u03a4\u03a5\u0003~?\u0000\u03a5\u00a1\u0001\u0000\u0000\u0000\u03a6\u03a8"+
		"\u0005\u0015\u0000\u0000\u03a7\u03a9\u0003p8\u0000\u03a8\u03a7\u0001\u0000"+
		"\u0000\u0000\u03a8\u03a9\u0001\u0000\u0000\u0000\u03a9\u03b0\u0001\u0000"+
		"\u0000\u0000\u03aa\u03ac\u0005\u000f\u0000\u0000\u03ab\u03ad\u0003p8\u0000"+
		"\u03ac\u03ab\u0001\u0000\u0000\u0000\u03ac\u03ad\u0001\u0000\u0000\u0000"+
		"\u03ad\u03af\u0001\u0000\u0000\u0000\u03ae\u03aa\u0001\u0000\u0000\u0000"+
		"\u03af\u03b2\u0001\u0000\u0000\u0000\u03b0\u03ae\u0001\u0000\u0000\u0000"+
		"\u03b0\u03b1\u0001\u0000\u0000\u0000\u03b1\u03b3\u0001\u0000\u0000\u0000"+
		"\u03b2\u03b0\u0001\u0000\u0000\u0000\u03b3\u03c1\u0005\u0016\u0000\u0000"+
		"\u03b4\u03bd\u0005 \u0000\u0000\u03b5\u03ba\u0003p8\u0000\u03b6\u03b7"+
		"\u0005\u000f\u0000\u0000\u03b7\u03b9\u0003p8\u0000\u03b8\u03b6\u0001\u0000"+
		"\u0000\u0000\u03b9\u03bc\u0001\u0000\u0000\u0000\u03ba\u03b8\u0001\u0000"+
		"\u0000\u0000\u03ba\u03bb\u0001\u0000\u0000\u0000\u03bb\u03be\u0001\u0000"+
		"\u0000\u0000\u03bc\u03ba\u0001\u0000\u0000\u0000\u03bd\u03b5\u0001\u0000"+
		"\u0000\u0000\u03bd\u03be\u0001\u0000\u0000\u0000\u03be\u03bf\u0001\u0000"+
		"\u0000\u0000\u03bf\u03c1\u0005!\u0000\u0000\u03c0\u03a6\u0001\u0000\u0000"+
		"\u0000\u03c0\u03b4\u0001\u0000\u0000\u0000\u03c1\u00a3\u0001\u0000\u0000"+
		"\u0000\u03c2\u03c5\u0003n7\u0000\u03c3\u03c5\u0003B!\u0000\u03c4\u03c2"+
		"\u0001\u0000\u0000\u0000\u03c4\u03c3\u0001\u0000\u0000\u0000\u03c5\u00a5"+
		"\u0001\u0000\u0000\u0000\u03c6\u03c8\u0007\u0010\u0000\u0000\u03c7\u03c9"+
		"\u0005f\u0000\u0000\u03c8\u03c7\u0001\u0000\u0000\u0000\u03c8\u03c9\u0001"+
		"\u0000\u0000\u0000\u03c9\u00a7\u0001\u0000\u0000\u0000\u03ca\u03cb\u0007"+
		"\u0011\u0000\u0000\u03cb\u00a9\u0001\u0000\u0000\u0000l\u00ad\u00af\u00bd"+
		"\u00c1\u00c6\u00cd\u00d3\u00d9\u00dd\u00e9\u00f1\u00f6\u0100\u0103\u0109"+
		"\u0111\u0114\u011e\u0124\u012a\u0133\u0141\u0144\u0150\u0157\u015a\u015d"+
		"\u0161\u0166\u016a\u0175\u0177\u017b\u0181\u018b\u0191\u019c\u019f\u01a5"+
		"\u01a8\u01b0\u01b3\u01b9\u01bc\u01c4\u01c7\u01cd\u01d1\u01dc\u01e1\u01e6"+
		"\u01ee\u01fd\u01ff\u0204\u020e\u021f\u022b\u0235\u023b\u023f\u0242\u0249"+
		"\u025d\u026f\u0273\u0278\u027c\u0280\u0285\u028a\u028e\u02a6\u02e1\u02e3"+
		"\u02ed\u02f4\u02f6\u02fd\u0305\u0309\u0311\u0315\u0317\u0322\u0338\u033c"+
		"\u0342\u0346\u034c\u0350\u0356\u0361\u0368\u0376\u037f\u0385\u0389\u0393"+
		"\u0398\u03a8\u03ac\u03b0\u03ba\u03bd\u03c0\u03c4\u03c8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}