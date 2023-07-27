// Generated from /home/xialb/dsl_project/Cryplang/Cryptlang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CryptlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, NatSpecSingleLine=104, NatSpecMultiLine=105, Int=106, 
		Uint=107, Byte=108, Fixed=109, Ufixed=110, VersionLiteral=111, BooleanLiteral=112, 
		DecimalNumber=113, HexNumber=114, NumberUnit=115, HexLiteral=116, ReservedKeyword=117, 
		AnonymousKeyword=118, BreakKeyword=119, ConstantKeyword=120, ContinueKeyword=121, 
		ExternalKeyword=122, IndexedKeyword=123, InternalKeyword=124, PayableKeyword=125, 
		PrivateKeyword=126, PublicKeyword=127, PureKeyword=128, TypeKeyword=129, 
		ViewKeyword=130, Identifier=131, StringLiteral=132, WS=133, COMMENT=134, 
		LINE_COMMENT=135;
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
		RULE_statementSymbol = 41, RULE_privateSymbol = 42, RULE_privateIdentifier = 43, 
		RULE_privateIdentifierList = 44, RULE_hashMethod = 45, RULE_signatureMethod = 46, 
		RULE_commitmentMethod = 47, RULE_proofMethod = 48, RULE_signatureStatement = 49, 
		RULE_commitmentStatement = 50, RULE_proofStatement = 51, RULE_taskStatement = 52, 
		RULE_ifStatement = 53, RULE_whileStatement = 54, RULE_simpleStatement = 55, 
		RULE_forStatement = 56, RULE_inlineAssemblyStatement = 57, RULE_doWhileStatement = 58, 
		RULE_continueStatement = 59, RULE_breakStatement = 60, RULE_returnStatement = 61, 
		RULE_throwStatement = 62, RULE_emitStatement = 63, RULE_variableDeclarationStatement = 64, 
		RULE_variableDeclarationList = 65, RULE_identifierList = 66, RULE_elementaryTypeName = 67, 
		RULE_expression = 68, RULE_primaryExpression = 69, RULE_expressionList = 70, 
		RULE_nameValueList = 71, RULE_nameValue = 72, RULE_functionCallArguments = 73, 
		RULE_functionCall = 74, RULE_assemblyBlock = 75, RULE_assemblyItem = 76, 
		RULE_assemblyExpression = 77, RULE_assemblyCall = 78, RULE_assemblyLocalDefinition = 79, 
		RULE_assemblyAssignment = 80, RULE_assemblyIdentifierOrList = 81, RULE_assemblyIdentifierList = 82, 
		RULE_assemblyStackAssignment = 83, RULE_labelDefinition = 84, RULE_assemblySwitch = 85, 
		RULE_assemblyCase = 86, RULE_assemblyFunctionDefinition = 87, RULE_assemblyFunctionReturns = 88, 
		RULE_assemblyFor = 89, RULE_assemblyIf = 90, RULE_assemblyLiteral = 91, 
		RULE_subAssembly = 92, RULE_tupleExpression = 93, RULE_typeNameExpression = 94, 
		RULE_numberLiteral = 95, RULE_identifier = 96;
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
			"expressionStatement", "statementSymbol", "privateSymbol", "privateIdentifier", 
			"privateIdentifierList", "hashMethod", "signatureMethod", "commitmentMethod", 
			"proofMethod", "signatureStatement", "commitmentStatement", "proofStatement", 
			"taskStatement", "ifStatement", "whileStatement", "simpleStatement", 
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
			null, "'pragma'", "';'", "'Cryptlang'", "'^'", "'~'", "'>='", "'>'", 
			"'<'", "'<='", "'='", "'as'", "'import'", "'*'", "'from'", "'{'", "','", 
			"'}'", "'contract'", "'interface'", "'library'", "'is'", "'('", "')'", 
			"'using'", "'for'", "'struct'", "'constructor'", "'modifier'", "'function'", 
			"'returns'", "'event'", "'enum'", "'['", "']'", "'address'", "'.'", "'mapping'", 
			"'=>'", "'memory'", "'storage'", "'calldata'", "'@'", "'#'", "'SHA3-256'", 
			"'SHA2-256'", "'RIPEMD160'", "'ECDSA'", "'BLS'", "'Pedersen'", "'Merkle'", 
			"'Groth16'", "'PLONK'", "'with'", "'if'", "'else'", "'while'", "'assembly'", 
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "NatSpecSingleLine", 
			"NatSpecMultiLine", "Int", "Uint", "Byte", "Fixed", "Ufixed", "VersionLiteral", 
			"BooleanLiteral", "DecimalNumber", "HexNumber", "NumberUnit", "HexLiteral", 
			"ReservedKeyword", "AnonymousKeyword", "BreakKeyword", "ConstantKeyword", 
			"ContinueKeyword", "ExternalKeyword", "IndexedKeyword", "InternalKeyword", 
			"PayableKeyword", "PrivateKeyword", "PublicKeyword", "PureKeyword", "TypeKeyword", 
			"ViewKeyword", "Identifier", "StringLiteral", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Cryptlang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CryptlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SourceUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CryptlangParser.EOF, 0); }
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
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0) || _la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(197);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(194);
					pragmaDirective();
					}
					break;
				case T__11:
					{
					setState(195);
					importDirective();
					}
					break;
				case T__17:
				case T__18:
				case T__19:
				case NatSpecSingleLine:
				case NatSpecMultiLine:
					{
					setState(196);
					contractDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
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
			setState(204);
			match(T__0);
			setState(205);
			pragmaName();
			setState(206);
			pragmaValue();
			setState(207);
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

	public static class PragmaNameContext extends ParserRuleContext {
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
			setState(209);
			match(T__2);
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
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				version();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
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
			setState(215);
			versionConstraint();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0) || _la==VersionLiteral) {
				{
				setState(216);
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
			setState(219);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
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

	public static class VersionConstraintContext extends ParserRuleContext {
		public TerminalNode VersionLiteral() { return getToken(CryptlangParser.VersionLiteral, 0); }
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
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
				{
				setState(221);
				versionOperator();
				}
			}

			setState(224);
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
			setState(226);
			identifier();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(227);
				match(T__10);
				setState(228);
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

	public static class ImportDirectiveContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(CryptlangParser.StringLiteral, 0); }
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
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(T__11);
				setState(232);
				match(StringLiteral);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(233);
					match(T__10);
					setState(234);
					identifier();
					}
				}

				setState(237);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(T__11);
				setState(241);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(239);
					match(T__12);
					}
					break;
				case T__13:
				case T__40:
				case Identifier:
					{
					setState(240);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(243);
					match(T__10);
					setState(244);
					identifier();
					}
				}

				setState(247);
				match(T__13);
				setState(248);
				match(StringLiteral);
				setState(249);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(T__11);
				setState(251);
				match(T__14);
				setState(252);
				importDeclaration();
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(253);
					match(T__15);
					setState(254);
					importDeclaration();
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(260);
				match(T__16);
				setState(261);
				match(T__13);
				setState(262);
				match(StringLiteral);
				setState(263);
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

	public static class NatSpecContext extends ParserRuleContext {
		public TerminalNode NatSpecSingleLine() { return getToken(CryptlangParser.NatSpecSingleLine, 0); }
		public TerminalNode NatSpecMultiLine() { return getToken(CryptlangParser.NatSpecMultiLine, 0); }
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
			setState(267);
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
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(269);
				natSpec();
				}
			}

			setState(272);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(273);
			identifier();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(274);
				match(T__20);
				setState(275);
				inheritanceSpecifier();
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(276);
					match(T__15);
					setState(277);
					inheritanceSpecifier();
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(285);
			match(T__14);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__23 - 14)) | (1L << (T__25 - 14)) | (1L << (T__26 - 14)) | (1L << (T__27 - 14)) | (1L << (T__28 - 14)) | (1L << (T__30 - 14)) | (1L << (T__31 - 14)) | (1L << (T__34 - 14)) | (1L << (T__36 - 14)) | (1L << (T__40 - 14)) | (1L << (T__61 - 14)) | (1L << (T__62 - 14)) | (1L << (T__63 - 14)) | (1L << (T__64 - 14)))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (NatSpecSingleLine - 104)) | (1L << (NatSpecMultiLine - 104)) | (1L << (Int - 104)) | (1L << (Uint - 104)) | (1L << (Byte - 104)) | (1L << (Fixed - 104)) | (1L << (Ufixed - 104)) | (1L << (Identifier - 104)))) != 0)) {
				{
				{
				setState(286);
				contractPart();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			match(T__16);
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
			setState(294);
			userDefinedTypeName();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(295);
				match(T__21);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__21 - 5)) | (1L << (T__32 - 5)) | (1L << (T__34 - 5)) | (1L << (T__40 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)) | (1L << (T__67 - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (T__70 - 69)) | (1L << (T__71 - 69)) | (1L << (T__72 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (DecimalNumber - 69)) | (1L << (HexNumber - 69)) | (1L << (HexLiteral - 69)) | (1L << (TypeKeyword - 69)) | (1L << (Identifier - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
					{
					setState(296);
					expressionList();
					}
				}

				setState(299);
				match(T__22);
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
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				stateVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				usingForDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(305);
				constructorDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(306);
				modifierDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(307);
				functionDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(308);
				eventDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(309);
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
		public List<TerminalNode> PublicKeyword() { return getTokens(CryptlangParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(CryptlangParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(CryptlangParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(CryptlangParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(CryptlangParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(CryptlangParser.PrivateKeyword, i);
		}
		public List<TerminalNode> ConstantKeyword() { return getTokens(CryptlangParser.ConstantKeyword); }
		public TerminalNode ConstantKeyword(int i) {
			return getToken(CryptlangParser.ConstantKeyword, i);
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
			setState(312);
			typeName(0);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & ((1L << (ConstantKeyword - 120)) | (1L << (InternalKeyword - 120)) | (1L << (PrivateKeyword - 120)) | (1L << (PublicKeyword - 120)))) != 0)) {
				{
				{
				setState(313);
				_la = _input.LA(1);
				if ( !(((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & ((1L << (ConstantKeyword - 120)) | (1L << (InternalKeyword - 120)) | (1L << (PrivateKeyword - 120)) | (1L << (PublicKeyword - 120)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
			identifier();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(320);
				match(T__9);
				setState(321);
				expression(0);
				}
			}

			setState(324);
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
			setState(326);
			match(T__23);
			setState(327);
			identifier();
			setState(328);
			match(T__24);
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				{
				setState(329);
				match(T__12);
				}
				break;
			case T__13:
			case T__28:
			case T__34:
			case T__36:
			case T__40:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
				{
				setState(330);
				typeName(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(333);
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
			setState(335);
			match(T__25);
			setState(336);
			identifier();
			setState(337);
			match(T__14);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__28 - 14)) | (1L << (T__34 - 14)) | (1L << (T__36 - 14)) | (1L << (T__40 - 14)) | (1L << (T__61 - 14)) | (1L << (T__62 - 14)) | (1L << (T__63 - 14)) | (1L << (T__64 - 14)))) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (Int - 106)) | (1L << (Uint - 106)) | (1L << (Byte - 106)) | (1L << (Fixed - 106)) | (1L << (Ufixed - 106)) | (1L << (Identifier - 106)))) != 0)) {
				{
				setState(338);
				variableDeclaration();
				setState(339);
				match(T__1);
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__28 - 14)) | (1L << (T__34 - 14)) | (1L << (T__36 - 14)) | (1L << (T__40 - 14)) | (1L << (T__61 - 14)) | (1L << (T__62 - 14)) | (1L << (T__63 - 14)) | (1L << (T__64 - 14)))) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (Int - 106)) | (1L << (Uint - 106)) | (1L << (Byte - 106)) | (1L << (Fixed - 106)) | (1L << (Ufixed - 106)) | (1L << (Identifier - 106)))) != 0)) {
					{
					{
					setState(340);
					variableDeclaration();
					setState(341);
					match(T__1);
					}
					}
					setState(347);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(350);
			match(T__16);
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
			setState(352);
			match(T__26);
			setState(353);
			parameterList();
			setState(354);
			modifierList();
			setState(355);
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
			setState(357);
			match(T__27);
			setState(358);
			identifier();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(359);
				parameterList();
				}
			}

			setState(362);
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
			setState(364);
			identifier();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(365);
				match(T__21);
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__21 - 5)) | (1L << (T__32 - 5)) | (1L << (T__34 - 5)) | (1L << (T__40 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)) | (1L << (T__67 - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (T__70 - 69)) | (1L << (T__71 - 69)) | (1L << (T__72 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (DecimalNumber - 69)) | (1L << (HexNumber - 69)) | (1L << (HexLiteral - 69)) | (1L << (TypeKeyword - 69)) | (1L << (Identifier - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
					{
					setState(366);
					expressionList();
					}
				}

				setState(369);
				match(T__22);
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
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(372);
				natSpec();
				}
			}

			setState(375);
			match(T__28);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__40 || _la==Identifier) {
				{
				setState(376);
				identifier();
				}
			}

			setState(379);
			parameterList();
			setState(380);
			modifierList();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(381);
				returnParameters();
				}
			}

			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(384);
				match(T__1);
				}
				break;
			case T__14:
				{
				setState(385);
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
			setState(388);
			match(T__29);
			setState(389);
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
		public List<TerminalNode> ExternalKeyword() { return getTokens(CryptlangParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(CryptlangParser.ExternalKeyword, i);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(CryptlangParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(CryptlangParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(CryptlangParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(CryptlangParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(CryptlangParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(CryptlangParser.PrivateKeyword, i);
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
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13 || _la==T__40 || ((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & ((1L << (ConstantKeyword - 120)) | (1L << (ExternalKeyword - 120)) | (1L << (InternalKeyword - 120)) | (1L << (PayableKeyword - 120)) | (1L << (PrivateKeyword - 120)) | (1L << (PublicKeyword - 120)) | (1L << (PureKeyword - 120)) | (1L << (ViewKeyword - 120)) | (1L << (Identifier - 120)))) != 0)) {
				{
				setState(397);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__13:
				case T__40:
				case Identifier:
					{
					setState(391);
					modifierInvocation();
					}
					break;
				case ConstantKeyword:
				case PayableKeyword:
				case PureKeyword:
				case ViewKeyword:
					{
					setState(392);
					stateMutability();
					}
					break;
				case ExternalKeyword:
					{
					setState(393);
					match(ExternalKeyword);
					}
					break;
				case PublicKeyword:
					{
					setState(394);
					match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(395);
					match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(396);
					match(PrivateKeyword);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(401);
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
		public TerminalNode AnonymousKeyword() { return getToken(CryptlangParser.AnonymousKeyword, 0); }
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
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(402);
				natSpec();
				}
			}

			setState(405);
			match(T__30);
			setState(406);
			identifier();
			setState(407);
			eventParameterList();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(408);
				match(AnonymousKeyword);
				}
			}

			setState(411);
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
			setState(413);
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
			setState(415);
			match(T__31);
			setState(416);
			identifier();
			setState(417);
			match(T__14);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__40 || _la==Identifier) {
				{
				setState(418);
				enumValue();
				}
			}

			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(421);
				match(T__15);
				setState(422);
				enumValue();
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(428);
			match(T__16);
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
			setState(430);
			match(T__21);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__28 - 14)) | (1L << (T__34 - 14)) | (1L << (T__36 - 14)) | (1L << (T__40 - 14)) | (1L << (T__61 - 14)) | (1L << (T__62 - 14)) | (1L << (T__63 - 14)) | (1L << (T__64 - 14)))) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (Int - 106)) | (1L << (Uint - 106)) | (1L << (Byte - 106)) | (1L << (Fixed - 106)) | (1L << (Ufixed - 106)) | (1L << (Identifier - 106)))) != 0)) {
				{
				setState(431);
				parameter();
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(432);
					match(T__15);
					setState(433);
					parameter();
					}
					}
					setState(438);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(441);
			match(T__22);
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
			setState(443);
			typeName(0);
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(444);
				storageLocation();
				}
				break;
			}
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__40 || _la==Identifier) {
				{
				setState(447);
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
			setState(450);
			match(T__21);
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__28 - 14)) | (1L << (T__34 - 14)) | (1L << (T__36 - 14)) | (1L << (T__40 - 14)) | (1L << (T__61 - 14)) | (1L << (T__62 - 14)) | (1L << (T__63 - 14)) | (1L << (T__64 - 14)))) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (Int - 106)) | (1L << (Uint - 106)) | (1L << (Byte - 106)) | (1L << (Fixed - 106)) | (1L << (Ufixed - 106)) | (1L << (Identifier - 106)))) != 0)) {
				{
				setState(451);
				eventParameter();
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(452);
					match(T__15);
					setState(453);
					eventParameter();
					}
					}
					setState(458);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(461);
			match(T__22);
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

	public static class EventParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode IndexedKeyword() { return getToken(CryptlangParser.IndexedKeyword, 0); }
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
			setState(463);
			typeName(0);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(464);
				match(IndexedKeyword);
				}
			}

			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__40 || _la==Identifier) {
				{
				setState(467);
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
			setState(470);
			match(T__21);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__28 - 14)) | (1L << (T__34 - 14)) | (1L << (T__36 - 14)) | (1L << (T__40 - 14)) | (1L << (T__61 - 14)) | (1L << (T__62 - 14)) | (1L << (T__63 - 14)) | (1L << (T__64 - 14)))) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (Int - 106)) | (1L << (Uint - 106)) | (1L << (Byte - 106)) | (1L << (Fixed - 106)) | (1L << (Ufixed - 106)) | (1L << (Identifier - 106)))) != 0)) {
				{
				setState(471);
				functionTypeParameter();
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(472);
					match(T__15);
					setState(473);
					functionTypeParameter();
					}
					}
					setState(478);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(481);
			match(T__22);
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
			setState(483);
			typeName(0);
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) {
				{
				setState(484);
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
			setState(487);
			typeName(0);
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(488);
				storageLocation();
				}
				break;
			}
			setState(491);
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
		public TerminalNode PayableKeyword() { return getToken(CryptlangParser.PayableKeyword, 0); }
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
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(494);
				elementaryTypeName();
				}
				break;
			case 2:
				{
				setState(495);
				userDefinedTypeName();
				}
				break;
			case 3:
				{
				setState(496);
				mapping();
				}
				break;
			case 4:
				{
				setState(497);
				functionTypeName();
				}
				break;
			case 5:
				{
				setState(498);
				match(T__34);
				setState(499);
				match(PayableKeyword);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(510);
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
					setState(502);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(503);
					match(T__32);
					setState(505);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__21 - 5)) | (1L << (T__32 - 5)) | (1L << (T__34 - 5)) | (1L << (T__40 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)) | (1L << (T__67 - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (T__70 - 69)) | (1L << (T__71 - 69)) | (1L << (T__72 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (DecimalNumber - 69)) | (1L << (HexNumber - 69)) | (1L << (HexLiteral - 69)) | (1L << (TypeKeyword - 69)) | (1L << (Identifier - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
						{
						setState(504);
						expression(0);
						}
					}

					setState(507);
					match(T__33);
					}
					} 
				}
				setState(512);
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
			setState(513);
			identifier();
			setState(518);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(514);
					match(T__35);
					setState(515);
					identifier();
					}
					} 
				}
				setState(520);
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
			setState(521);
			match(T__36);
			setState(522);
			match(T__21);
			setState(523);
			elementaryTypeName();
			setState(524);
			match(T__37);
			setState(525);
			typeName(0);
			setState(526);
			match(T__22);
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

	public static class FunctionTypeNameContext extends ParserRuleContext {
		public List<FunctionTypeParameterListContext> functionTypeParameterList() {
			return getRuleContexts(FunctionTypeParameterListContext.class);
		}
		public FunctionTypeParameterListContext functionTypeParameterList(int i) {
			return getRuleContext(FunctionTypeParameterListContext.class,i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(CryptlangParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(CryptlangParser.InternalKeyword, i);
		}
		public List<TerminalNode> ExternalKeyword() { return getTokens(CryptlangParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(CryptlangParser.ExternalKeyword, i);
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
			setState(528);
			match(T__28);
			setState(529);
			functionTypeParameterList();
			setState(535);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(533);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case InternalKeyword:
						{
						setState(530);
						match(InternalKeyword);
						}
						break;
					case ExternalKeyword:
						{
						setState(531);
						match(ExternalKeyword);
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(532);
						stateMutability();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(537);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(538);
				match(T__29);
				setState(539);
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
			setState(542);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) ) {
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

	public static class StateMutabilityContext extends ParserRuleContext {
		public TerminalNode PureKeyword() { return getToken(CryptlangParser.PureKeyword, 0); }
		public TerminalNode ConstantKeyword() { return getToken(CryptlangParser.ConstantKeyword, 0); }
		public TerminalNode ViewKeyword() { return getToken(CryptlangParser.ViewKeyword, 0); }
		public TerminalNode PayableKeyword() { return getToken(CryptlangParser.PayableKeyword, 0); }
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
			setState(544);
			_la = _input.LA(1);
			if ( !(((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & ((1L << (ConstantKeyword - 120)) | (1L << (PayableKeyword - 120)) | (1L << (PureKeyword - 120)) | (1L << (ViewKeyword - 120)))) != 0)) ) {
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
			setState(546);
			match(T__14);
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__14 - 5)) | (1L << (T__21 - 5)) | (1L << (T__24 - 5)) | (1L << (T__28 - 5)) | (1L << (T__32 - 5)) | (1L << (T__34 - 5)) | (1L << (T__36 - 5)) | (1L << (T__40 - 5)) | (1L << (T__41 - 5)) | (1L << (T__53 - 5)) | (1L << (T__55 - 5)) | (1L << (T__56 - 5)) | (1L << (T__57 - 5)) | (1L << (T__58 - 5)) | (1L << (T__59 - 5)) | (1L << (T__60 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)) | (1L << (T__67 - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (T__70 - 69)) | (1L << (T__71 - 69)) | (1L << (T__72 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (DecimalNumber - 69)) | (1L << (HexNumber - 69)) | (1L << (HexLiteral - 69)) | (1L << (BreakKeyword - 69)) | (1L << (ContinueKeyword - 69)) | (1L << (TypeKeyword - 69)) | (1L << (Identifier - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
				{
				{
				setState(547);
				statement();
				}
				}
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(553);
			match(T__16);
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
		public TaskStatementContext taskStatement() {
			return getRuleContext(TaskStatementContext.class,0);
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
			setState(568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__53:
				enterOuterAlt(_localctx, 1);
				{
				setState(555);
				ifStatement();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				whileStatement();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(557);
				forStatement();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(558);
				block();
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 5);
				{
				setState(559);
				inlineAssemblyStatement();
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 6);
				{
				setState(560);
				doWhileStatement();
				}
				break;
			case ContinueKeyword:
				enterOuterAlt(_localctx, 7);
				{
				setState(561);
				continueStatement();
				}
				break;
			case BreakKeyword:
				enterOuterAlt(_localctx, 8);
				{
				setState(562);
				breakStatement();
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 9);
				{
				setState(563);
				returnStatement();
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 10);
				{
				setState(564);
				throwStatement();
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 11);
				{
				setState(565);
				emitStatement();
				}
				break;
			case T__4:
			case T__13:
			case T__21:
			case T__28:
			case T__32:
			case T__34:
			case T__36:
			case T__40:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
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
				setState(566);
				simpleStatement();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 13);
				{
				setState(567);
				taskStatement();
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
			setState(570);
			expression(0);
			setState(571);
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

	public static class StatementSymbolContext extends ParserRuleContext {
		public StatementSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementSymbol; }
	}

	public final StatementSymbolContext statementSymbol() throws RecognitionException {
		StatementSymbolContext _localctx = new StatementSymbolContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_statementSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(T__41);
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

	public static class PrivateSymbolContext extends ParserRuleContext {
		public PrivateSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateSymbol; }
	}

	public final PrivateSymbolContext privateSymbol() throws RecognitionException {
		PrivateSymbolContext _localctx = new PrivateSymbolContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_privateSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(T__42);
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

	public static class PrivateIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PrivateSymbolContext privateSymbol() {
			return getRuleContext(PrivateSymbolContext.class,0);
		}
		public PrivateIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateIdentifier; }
	}

	public final PrivateIdentifierContext privateIdentifier() throws RecognitionException {
		PrivateIdentifierContext _localctx = new PrivateIdentifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_privateIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__42) {
				{
				setState(577);
				privateSymbol();
				}
			}

			setState(580);
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

	public static class PrivateIdentifierListContext extends ParserRuleContext {
		public List<PrivateIdentifierContext> privateIdentifier() {
			return getRuleContexts(PrivateIdentifierContext.class);
		}
		public PrivateIdentifierContext privateIdentifier(int i) {
			return getRuleContext(PrivateIdentifierContext.class,i);
		}
		public PrivateIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateIdentifierList; }
	}

	public final PrivateIdentifierListContext privateIdentifierList() throws RecognitionException {
		PrivateIdentifierListContext _localctx = new PrivateIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_privateIdentifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(583);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__40) | (1L << T__42))) != 0) || _la==Identifier) {
						{
						setState(582);
						privateIdentifier();
						}
					}

					setState(585);
					match(T__15);
					}
					} 
				}
				setState(590);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__40) | (1L << T__42))) != 0) || _la==Identifier) {
				{
				setState(591);
				privateIdentifier();
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

	public static class HashMethodContext extends ParserRuleContext {
		public HashMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hashMethod; }
	}

	public final HashMethodContext hashMethod() throws RecognitionException {
		HashMethodContext _localctx = new HashMethodContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_hashMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__43) | (1L << T__44) | (1L << T__45))) != 0)) ) {
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

	public static class SignatureMethodContext extends ParserRuleContext {
		public SignatureMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signatureMethod; }
	}

	public final SignatureMethodContext signatureMethod() throws RecognitionException {
		SignatureMethodContext _localctx = new SignatureMethodContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_signatureMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			_la = _input.LA(1);
			if ( !(_la==T__46 || _la==T__47) ) {
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

	public static class CommitmentMethodContext extends ParserRuleContext {
		public CommitmentMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commitmentMethod; }
	}

	public final CommitmentMethodContext commitmentMethod() throws RecognitionException {
		CommitmentMethodContext _localctx = new CommitmentMethodContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_commitmentMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			_la = _input.LA(1);
			if ( !(_la==T__48 || _la==T__49) ) {
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

	public static class ProofMethodContext extends ParserRuleContext {
		public ProofMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proofMethod; }
	}

	public final ProofMethodContext proofMethod() throws RecognitionException {
		ProofMethodContext _localctx = new ProofMethodContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_proofMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			_la = _input.LA(1);
			if ( !(_la==T__50 || _la==T__51) ) {
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

	public static class SignatureStatementContext extends ParserRuleContext {
		public StatementSymbolContext statementSymbol() {
			return getRuleContext(StatementSymbolContext.class,0);
		}
		public SignatureMethodContext signatureMethod() {
			return getRuleContext(SignatureMethodContext.class,0);
		}
		public HashMethodContext hashMethod() {
			return getRuleContext(HashMethodContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public SignatureStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signatureStatement; }
	}

	public final SignatureStatementContext signatureStatement() throws RecognitionException {
		SignatureStatementContext _localctx = new SignatureStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_signatureStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			statementSymbol();
			setState(603);
			signatureMethod();
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__52) {
				{
				setState(604);
				match(T__52);
				setState(605);
				hashMethod();
				}
			}

			setState(608);
			match(T__21);
			setState(615);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(610);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__13 || _la==T__40 || _la==Identifier) {
						{
						setState(609);
						identifier();
						}
					}

					setState(612);
					match(T__15);
					}
					} 
				}
				setState(617);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__40 || _la==Identifier) {
				{
				setState(618);
				identifier();
				}
			}

			setState(621);
			match(T__15);
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__21 - 14)) | (1L << (T__32 - 14)) | (1L << (T__34 - 14)) | (1L << (T__40 - 14)) | (1L << (T__61 - 14)) | (1L << (T__62 - 14)) | (1L << (T__63 - 14)) | (1L << (T__64 - 14)))) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (Int - 106)) | (1L << (Uint - 106)) | (1L << (Byte - 106)) | (1L << (Fixed - 106)) | (1L << (Ufixed - 106)) | (1L << (BooleanLiteral - 106)) | (1L << (DecimalNumber - 106)) | (1L << (HexNumber - 106)) | (1L << (HexLiteral - 106)) | (1L << (TypeKeyword - 106)) | (1L << (Identifier - 106)) | (1L << (StringLiteral - 106)))) != 0)) {
				{
				setState(622);
				primaryExpression();
				}
			}

			setState(625);
			match(T__22);
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

	public static class CommitmentStatementContext extends ParserRuleContext {
		public StatementSymbolContext statementSymbol() {
			return getRuleContext(StatementSymbolContext.class,0);
		}
		public CommitmentMethodContext commitmentMethod() {
			return getRuleContext(CommitmentMethodContext.class,0);
		}
		public HashMethodContext hashMethod() {
			return getRuleContext(HashMethodContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public CommitmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commitmentStatement; }
	}

	public final CommitmentStatementContext commitmentStatement() throws RecognitionException {
		CommitmentStatementContext _localctx = new CommitmentStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_commitmentStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			statementSymbol();
			setState(628);
			commitmentMethod();
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__52) {
				{
				setState(629);
				match(T__52);
				setState(630);
				hashMethod();
				}
			}

			setState(633);
			match(T__21);
			setState(640);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(635);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__13 || _la==T__40 || _la==Identifier) {
						{
						setState(634);
						identifier();
						}
					}

					setState(637);
					match(T__15);
					}
					} 
				}
				setState(642);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__40 || _la==Identifier) {
				{
				setState(643);
				identifier();
				}
			}

			setState(646);
			match(T__22);
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

	public static class ProofStatementContext extends ParserRuleContext {
		public StatementSymbolContext statementSymbol() {
			return getRuleContext(StatementSymbolContext.class,0);
		}
		public ProofMethodContext proofMethod() {
			return getRuleContext(ProofMethodContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PrivateIdentifierListContext privateIdentifierList() {
			return getRuleContext(PrivateIdentifierListContext.class,0);
		}
		public ProofStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proofStatement; }
	}

	public final ProofStatementContext proofStatement() throws RecognitionException {
		ProofStatementContext _localctx = new ProofStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_proofStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			statementSymbol();
			setState(649);
			proofMethod();
			setState(650);
			match(T__52);
			setState(651);
			primaryExpression();
			setState(652);
			match(T__21);
			setState(653);
			privateIdentifierList();
			setState(654);
			match(T__22);
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

	public static class TaskStatementContext extends ParserRuleContext {
		public SignatureStatementContext signatureStatement() {
			return getRuleContext(SignatureStatementContext.class,0);
		}
		public CommitmentStatementContext commitmentStatement() {
			return getRuleContext(CommitmentStatementContext.class,0);
		}
		public ProofStatementContext proofStatement() {
			return getRuleContext(ProofStatementContext.class,0);
		}
		public TaskStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_taskStatement; }
	}

	public final TaskStatementContext taskStatement() throws RecognitionException {
		TaskStatementContext _localctx = new TaskStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_taskStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(656);
				signatureStatement();
				}
				break;
			case 2:
				{
				setState(657);
				commitmentStatement();
				}
				break;
			case 3:
				{
				setState(658);
				proofStatement();
				}
				break;
			}
			setState(661);
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
		enterRule(_localctx, 106, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(T__53);
			setState(664);
			match(T__21);
			setState(665);
			expression(0);
			setState(666);
			match(T__22);
			setState(667);
			statement();
			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(668);
				match(T__54);
				setState(669);
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
		enterRule(_localctx, 108, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			match(T__55);
			setState(673);
			match(T__21);
			setState(674);
			expression(0);
			setState(675);
			match(T__22);
			setState(676);
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
		enterRule(_localctx, 110, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(678);
				variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(679);
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
		enterRule(_localctx, 112, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			match(T__24);
			setState(683);
			match(T__21);
			setState(686);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__13:
			case T__21:
			case T__28:
			case T__32:
			case T__34:
			case T__36:
			case T__40:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
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
				setState(684);
				simpleStatement();
				}
				break;
			case T__1:
				{
				setState(685);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(690);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__13:
			case T__21:
			case T__32:
			case T__34:
			case T__40:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
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
				setState(688);
				expressionStatement();
				}
				break;
			case T__1:
				{
				setState(689);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__21 - 5)) | (1L << (T__32 - 5)) | (1L << (T__34 - 5)) | (1L << (T__40 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)) | (1L << (T__67 - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (T__70 - 69)) | (1L << (T__71 - 69)) | (1L << (T__72 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (DecimalNumber - 69)) | (1L << (HexNumber - 69)) | (1L << (HexLiteral - 69)) | (1L << (TypeKeyword - 69)) | (1L << (Identifier - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
				{
				setState(692);
				expression(0);
				}
			}

			setState(695);
			match(T__22);
			setState(696);
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

	public static class InlineAssemblyStatementContext extends ParserRuleContext {
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(CryptlangParser.StringLiteral, 0); }
		public InlineAssemblyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineAssemblyStatement; }
	}

	public final InlineAssemblyStatementContext inlineAssemblyStatement() throws RecognitionException {
		InlineAssemblyStatementContext _localctx = new InlineAssemblyStatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_inlineAssemblyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(T__56);
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(699);
				match(StringLiteral);
				}
			}

			setState(702);
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
		enterRule(_localctx, 116, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(T__57);
			setState(705);
			statement();
			setState(706);
			match(T__55);
			setState(707);
			match(T__21);
			setState(708);
			expression(0);
			setState(709);
			match(T__22);
			setState(710);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode ContinueKeyword() { return getToken(CryptlangParser.ContinueKeyword, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			match(ContinueKeyword);
			setState(713);
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BreakKeyword() { return getToken(CryptlangParser.BreakKeyword, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			match(BreakKeyword);
			setState(716);
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
		enterRule(_localctx, 122, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(T__58);
			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__21 - 5)) | (1L << (T__32 - 5)) | (1L << (T__34 - 5)) | (1L << (T__40 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)) | (1L << (T__67 - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (T__70 - 69)) | (1L << (T__71 - 69)) | (1L << (T__72 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (DecimalNumber - 69)) | (1L << (HexNumber - 69)) | (1L << (HexLiteral - 69)) | (1L << (TypeKeyword - 69)) | (1L << (Identifier - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
				{
				setState(719);
				expression(0);
				}
			}

			setState(722);
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

	public static class ThrowStatementContext extends ParserRuleContext {
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(T__59);
			setState(725);
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
		enterRule(_localctx, 126, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(T__60);
			setState(728);
			functionCall();
			setState(729);
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
		enterRule(_localctx, 128, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(731);
				match(T__61);
				setState(732);
				identifierList();
				}
				break;
			case 2:
				{
				setState(733);
				variableDeclaration();
				}
				break;
			case 3:
				{
				setState(734);
				match(T__21);
				setState(735);
				variableDeclarationList();
				setState(736);
				match(T__22);
				}
				break;
			}
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(740);
				match(T__9);
				setState(741);
				expression(0);
				}
			}

			setState(744);
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
		enterRule(_localctx, 130, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__28 - 14)) | (1L << (T__34 - 14)) | (1L << (T__36 - 14)) | (1L << (T__40 - 14)) | (1L << (T__61 - 14)) | (1L << (T__62 - 14)) | (1L << (T__63 - 14)) | (1L << (T__64 - 14)))) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (Int - 106)) | (1L << (Uint - 106)) | (1L << (Byte - 106)) | (1L << (Fixed - 106)) | (1L << (Ufixed - 106)) | (1L << (Identifier - 106)))) != 0)) {
				{
				setState(746);
				variableDeclaration();
				}
			}

			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(749);
				match(T__15);
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__28 - 14)) | (1L << (T__34 - 14)) | (1L << (T__36 - 14)) | (1L << (T__40 - 14)) | (1L << (T__61 - 14)) | (1L << (T__62 - 14)) | (1L << (T__63 - 14)) | (1L << (T__64 - 14)))) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (Int - 106)) | (1L << (Uint - 106)) | (1L << (Byte - 106)) | (1L << (Fixed - 106)) | (1L << (Ufixed - 106)) | (1L << (Identifier - 106)))) != 0)) {
					{
					setState(750);
					variableDeclaration();
					}
				}

				}
				}
				setState(757);
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
		enterRule(_localctx, 132, RULE_identifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			match(T__21);
			setState(765);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(760);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__13 || _la==T__40 || _la==Identifier) {
						{
						setState(759);
						identifier();
						}
					}

					setState(762);
					match(T__15);
					}
					} 
				}
				setState(767);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__40 || _la==Identifier) {
				{
				setState(768);
				identifier();
				}
			}

			setState(771);
			match(T__22);
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

	public static class ElementaryTypeNameContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(CryptlangParser.Int, 0); }
		public TerminalNode Uint() { return getToken(CryptlangParser.Uint, 0); }
		public TerminalNode Byte() { return getToken(CryptlangParser.Byte, 0); }
		public TerminalNode Fixed() { return getToken(CryptlangParser.Fixed, 0); }
		public TerminalNode Ufixed() { return getToken(CryptlangParser.Ufixed, 0); }
		public ElementaryTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementaryTypeName; }
	}

	public final ElementaryTypeNameContext elementaryTypeName() throws RecognitionException {
		ElementaryTypeNameContext _localctx = new ElementaryTypeNameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_elementaryTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)))) != 0)) ) {
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
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(776);
				match(T__67);
				setState(777);
				typeName(0);
				}
				break;
			case 2:
				{
				setState(778);
				match(T__21);
				setState(779);
				expression(0);
				setState(780);
				match(T__22);
				}
				break;
			case 3:
				{
				setState(782);
				_la = _input.LA(1);
				if ( !(_la==T__65 || _la==T__66) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(783);
				expression(19);
				}
				break;
			case 4:
				{
				setState(784);
				_la = _input.LA(1);
				if ( !(_la==T__68 || _la==T__69) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(785);
				expression(18);
				}
				break;
			case 5:
				{
				setState(786);
				_la = _input.LA(1);
				if ( !(_la==T__70 || _la==T__71) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(787);
				expression(17);
				}
				break;
			case 6:
				{
				setState(788);
				match(T__72);
				setState(789);
				expression(16);
				}
				break;
			case 7:
				{
				setState(790);
				match(T__4);
				setState(791);
				expression(15);
				}
				break;
			case 8:
				{
				setState(792);
				primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(854);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(852);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(795);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(796);
						match(T__73);
						setState(797);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(798);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(799);
						_la = _input.LA(1);
						if ( !(((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__74 - 13)) | (1L << (T__75 - 13)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(800);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(801);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(802);
						_la = _input.LA(1);
						if ( !(_la==T__68 || _la==T__69) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(803);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(804);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(805);
						_la = _input.LA(1);
						if ( !(_la==T__76 || _la==T__77) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(806);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(807);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(808);
						match(T__78);
						setState(809);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(810);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(811);
						match(T__3);
						setState(812);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(813);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(814);
						match(T__79);
						setState(815);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(816);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(817);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(818);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(819);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(820);
						_la = _input.LA(1);
						if ( !(_la==T__80 || _la==T__81) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(821);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(822);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(823);
						match(T__82);
						setState(824);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(825);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(826);
						match(T__83);
						setState(827);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(828);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(829);
						match(T__84);
						setState(830);
						expression(0);
						setState(831);
						match(T__85);
						setState(832);
						expression(4);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(834);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(835);
						_la = _input.LA(1);
						if ( !(_la==T__9 || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T__86 - 87)) | (1L << (T__87 - 87)) | (1L << (T__88 - 87)) | (1L << (T__89 - 87)) | (1L << (T__90 - 87)) | (1L << (T__91 - 87)) | (1L << (T__92 - 87)) | (1L << (T__93 - 87)) | (1L << (T__94 - 87)) | (1L << (T__95 - 87)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(836);
						expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(837);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(838);
						_la = _input.LA(1);
						if ( !(_la==T__65 || _la==T__66) ) {
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
						setState(839);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(840);
						match(T__32);
						setState(841);
						expression(0);
						setState(842);
						match(T__33);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(844);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(845);
						match(T__21);
						setState(846);
						functionCallArguments();
						setState(847);
						match(T__22);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(849);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(850);
						match(T__35);
						setState(851);
						identifier();
						}
						break;
					}
					} 
				}
				setState(856);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(CryptlangParser.BooleanLiteral, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode HexLiteral() { return getToken(CryptlangParser.HexLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(CryptlangParser.StringLiteral, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TypeKeyword() { return getToken(CryptlangParser.TypeKeyword, 0); }
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
		enterRule(_localctx, 138, RULE_primaryExpression);
		try {
			setState(873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(857);
				match(BooleanLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(858);
				numberLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(859);
				match(HexLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(860);
				match(StringLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(861);
				identifier();
				setState(864);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(862);
					match(T__32);
					setState(863);
					match(T__33);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(866);
				match(TypeKeyword);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(867);
				tupleExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(868);
				typeNameExpression();
				setState(871);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(869);
					match(T__32);
					setState(870);
					match(T__33);
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
		enterRule(_localctx, 140, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			expression(0);
			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(876);
				match(T__15);
				setState(877);
				expression(0);
				}
				}
				setState(882);
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
		enterRule(_localctx, 142, RULE_nameValueList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			nameValue();
			setState(888);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(884);
					match(T__15);
					setState(885);
					nameValue();
					}
					} 
				}
				setState(890);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			}
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(891);
				match(T__15);
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
		enterRule(_localctx, 144, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			identifier();
			setState(895);
			match(T__85);
			setState(896);
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
		enterRule(_localctx, 146, RULE_functionCallArguments);
		int _la;
		try {
			setState(906);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(898);
				match(T__14);
				setState(900);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13 || _la==T__40 || _la==Identifier) {
					{
					setState(899);
					nameValueList();
					}
				}

				setState(902);
				match(T__16);
				}
				break;
			case T__4:
			case T__13:
			case T__21:
			case T__22:
			case T__32:
			case T__34:
			case T__40:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
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
				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__21 - 5)) | (1L << (T__32 - 5)) | (1L << (T__34 - 5)) | (1L << (T__40 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)) | (1L << (T__67 - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (T__70 - 69)) | (1L << (T__71 - 69)) | (1L << (T__72 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (DecimalNumber - 69)) | (1L << (HexNumber - 69)) | (1L << (HexLiteral - 69)) | (1L << (TypeKeyword - 69)) | (1L << (Identifier - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
					{
					setState(903);
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
		enterRule(_localctx, 148, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			expression(0);
			setState(909);
			match(T__21);
			setState(910);
			functionCallArguments();
			setState(911);
			match(T__22);
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
		enterRule(_localctx, 150, RULE_assemblyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			match(T__14);
			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__14 - 14)) | (1L << (T__21 - 14)) | (1L << (T__24 - 14)) | (1L << (T__28 - 14)) | (1L << (T__34 - 14)) | (1L << (T__40 - 14)) | (1L << (T__53 - 14)) | (1L << (T__56 - 14)) | (1L << (T__58 - 14)) | (1L << (T__64 - 14)))) != 0) || ((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (T__96 - 97)) | (1L << (T__98 - 97)) | (1L << (T__99 - 97)) | (1L << (DecimalNumber - 97)) | (1L << (HexNumber - 97)) | (1L << (HexLiteral - 97)) | (1L << (BreakKeyword - 97)) | (1L << (ContinueKeyword - 97)) | (1L << (Identifier - 97)) | (1L << (StringLiteral - 97)))) != 0)) {
				{
				{
				setState(914);
				assemblyItem();
				}
				}
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(920);
			match(T__16);
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
		public TerminalNode BreakKeyword() { return getToken(CryptlangParser.BreakKeyword, 0); }
		public TerminalNode ContinueKeyword() { return getToken(CryptlangParser.ContinueKeyword, 0); }
		public SubAssemblyContext subAssembly() {
			return getRuleContext(SubAssemblyContext.class,0);
		}
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(CryptlangParser.StringLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(CryptlangParser.HexLiteral, 0); }
		public AssemblyItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyItem; }
	}

	public final AssemblyItemContext assemblyItem() throws RecognitionException {
		AssemblyItemContext _localctx = new AssemblyItemContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_assemblyItem);
		try {
			setState(939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(922);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(923);
				assemblyBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(924);
				assemblyExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(925);
				assemblyLocalDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(926);
				assemblyAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(927);
				assemblyStackAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(928);
				labelDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(929);
				assemblySwitch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(930);
				assemblyFunctionDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(931);
				assemblyFor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(932);
				assemblyIf();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(933);
				match(BreakKeyword);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(934);
				match(ContinueKeyword);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(935);
				subAssembly();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(936);
				numberLiteral();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(937);
				match(StringLiteral);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(938);
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
		enterRule(_localctx, 154, RULE_assemblyExpression);
		try {
			setState(943);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__34:
			case T__40:
			case T__58:
			case T__64:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(941);
				assemblyCall();
				}
				break;
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(942);
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
		enterRule(_localctx, 156, RULE_assemblyCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__58:
				{
				setState(945);
				match(T__58);
				}
				break;
			case T__34:
				{
				setState(946);
				match(T__34);
				}
				break;
			case T__64:
				{
				setState(947);
				match(T__64);
				}
				break;
			case T__13:
			case T__40:
			case Identifier:
				{
				setState(948);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(963);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(951);
				match(T__21);
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__34 - 14)) | (1L << (T__40 - 14)) | (1L << (T__58 - 14)) | (1L << (T__64 - 14)))) != 0) || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (DecimalNumber - 113)) | (1L << (HexNumber - 113)) | (1L << (HexLiteral - 113)) | (1L << (Identifier - 113)) | (1L << (StringLiteral - 113)))) != 0)) {
					{
					setState(952);
					assemblyExpression();
					}
				}

				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(955);
					match(T__15);
					setState(956);
					assemblyExpression();
					}
					}
					setState(961);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(962);
				match(T__22);
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
		enterRule(_localctx, 158, RULE_assemblyLocalDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			match(T__96);
			setState(966);
			assemblyIdentifierOrList();
			setState(969);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__97) {
				{
				setState(967);
				match(T__97);
				setState(968);
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
		enterRule(_localctx, 160, RULE_assemblyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			assemblyIdentifierOrList();
			setState(972);
			match(T__97);
			setState(973);
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
		enterRule(_localctx, 162, RULE_assemblyIdentifierOrList);
		try {
			setState(980);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__40:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(975);
				identifier();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(976);
				match(T__21);
				setState(977);
				assemblyIdentifierList();
				setState(978);
				match(T__22);
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
		enterRule(_localctx, 164, RULE_assemblyIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			identifier();
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(983);
				match(T__15);
				setState(984);
				identifier();
				}
				}
				setState(989);
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
		enterRule(_localctx, 166, RULE_assemblyStackAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			match(T__98);
			setState(991);
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
		enterRule(_localctx, 168, RULE_labelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			identifier();
			setState(994);
			match(T__85);
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
		enterRule(_localctx, 170, RULE_assemblySwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			match(T__99);
			setState(997);
			assemblyExpression();
			setState(1001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__100 || _la==T__101) {
				{
				{
				setState(998);
				assemblyCase();
				}
				}
				setState(1003);
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
		enterRule(_localctx, 172, RULE_assemblyCase);
		try {
			setState(1010);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__100:
				enterOuterAlt(_localctx, 1);
				{
				setState(1004);
				match(T__100);
				setState(1005);
				assemblyLiteral();
				setState(1006);
				assemblyBlock();
				}
				break;
			case T__101:
				enterOuterAlt(_localctx, 2);
				{
				setState(1008);
				match(T__101);
				setState(1009);
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
		enterRule(_localctx, 174, RULE_assemblyFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1012);
			match(T__28);
			setState(1013);
			identifier();
			setState(1014);
			match(T__21);
			setState(1016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__40 || _la==Identifier) {
				{
				setState(1015);
				assemblyIdentifierList();
				}
			}

			setState(1018);
			match(T__22);
			setState(1020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__102) {
				{
				setState(1019);
				assemblyFunctionReturns();
				}
			}

			setState(1022);
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
		enterRule(_localctx, 176, RULE_assemblyFunctionReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1024);
			match(T__102);
			setState(1025);
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
		enterRule(_localctx, 178, RULE_assemblyFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			match(T__24);
			setState(1030);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(1028);
				assemblyBlock();
				}
				break;
			case T__13:
			case T__34:
			case T__40:
			case T__58:
			case T__64:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(1029);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1032);
			assemblyExpression();
			setState(1035);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(1033);
				assemblyBlock();
				}
				break;
			case T__13:
			case T__34:
			case T__40:
			case T__58:
			case T__64:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(1034);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1037);
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
		enterRule(_localctx, 180, RULE_assemblyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			match(T__53);
			setState(1040);
			assemblyExpression();
			setState(1041);
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

	public static class AssemblyLiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(CryptlangParser.StringLiteral, 0); }
		public TerminalNode DecimalNumber() { return getToken(CryptlangParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(CryptlangParser.HexNumber, 0); }
		public TerminalNode HexLiteral() { return getToken(CryptlangParser.HexLiteral, 0); }
		public AssemblyLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLiteral; }
	}

	public final AssemblyLiteralContext assemblyLiteral() throws RecognitionException {
		AssemblyLiteralContext _localctx = new AssemblyLiteralContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_assemblyLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			_la = _input.LA(1);
			if ( !(((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (DecimalNumber - 113)) | (1L << (HexNumber - 113)) | (1L << (HexLiteral - 113)) | (1L << (StringLiteral - 113)))) != 0)) ) {
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
		enterRule(_localctx, 184, RULE_subAssembly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			match(T__56);
			setState(1046);
			identifier();
			setState(1047);
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
		enterRule(_localctx, 186, RULE_tupleExpression);
		int _la;
		try {
			setState(1075);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(1049);
				match(T__21);
				{
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__21 - 5)) | (1L << (T__32 - 5)) | (1L << (T__34 - 5)) | (1L << (T__40 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)) | (1L << (T__67 - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (T__70 - 69)) | (1L << (T__71 - 69)) | (1L << (T__72 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (DecimalNumber - 69)) | (1L << (HexNumber - 69)) | (1L << (HexLiteral - 69)) | (1L << (TypeKeyword - 69)) | (1L << (Identifier - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
					{
					setState(1050);
					expression(0);
					}
				}

				setState(1059);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(1053);
					match(T__15);
					setState(1055);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__21 - 5)) | (1L << (T__32 - 5)) | (1L << (T__34 - 5)) | (1L << (T__40 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)) | (1L << (T__67 - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (T__70 - 69)) | (1L << (T__71 - 69)) | (1L << (T__72 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (DecimalNumber - 69)) | (1L << (HexNumber - 69)) | (1L << (HexLiteral - 69)) | (1L << (TypeKeyword - 69)) | (1L << (Identifier - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
						{
						setState(1054);
						expression(0);
						}
					}

					}
					}
					setState(1061);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1062);
				match(T__22);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(1063);
				match(T__32);
				setState(1072);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__21 - 5)) | (1L << (T__32 - 5)) | (1L << (T__34 - 5)) | (1L << (T__40 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)) | (1L << (T__67 - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (T__70 - 69)) | (1L << (T__71 - 69)) | (1L << (T__72 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (DecimalNumber - 69)) | (1L << (HexNumber - 69)) | (1L << (HexLiteral - 69)) | (1L << (TypeKeyword - 69)) | (1L << (Identifier - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
					{
					setState(1064);
					expression(0);
					setState(1069);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__15) {
						{
						{
						setState(1065);
						match(T__15);
						setState(1066);
						expression(0);
						}
						}
						setState(1071);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1074);
				match(T__33);
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
		enterRule(_localctx, 188, RULE_typeNameExpression);
		try {
			setState(1079);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				enterOuterAlt(_localctx, 1);
				{
				setState(1077);
				elementaryTypeName();
				}
				break;
			case T__13:
			case T__40:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1078);
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

	public static class NumberLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalNumber() { return getToken(CryptlangParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(CryptlangParser.HexNumber, 0); }
		public TerminalNode NumberUnit() { return getToken(CryptlangParser.NumberUnit, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			_la = _input.LA(1);
			if ( !(_la==DecimalNumber || _la==HexNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1083);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1082);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CryptlangParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__40 || _la==Identifier) ) {
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
		case 68:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0089\u0442\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\3\2\3\2\3\2\7\2\u00c8\n\2\f\2\16\2\u00cb\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\5\5\u00d8\n\5\3\6\3\6\5\6\u00dc\n"+
		"\6\3\7\3\7\3\b\5\b\u00e1\n\b\3\b\3\b\3\t\3\t\3\t\5\t\u00e8\n\t\3\n\3\n"+
		"\3\n\3\n\5\n\u00ee\n\n\3\n\3\n\3\n\3\n\5\n\u00f4\n\n\3\n\3\n\5\n\u00f8"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0102\n\n\f\n\16\n\u0105\13\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u010c\n\n\3\13\3\13\3\f\5\f\u0111\n\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\7\f\u0119\n\f\f\f\16\f\u011c\13\f\5\f\u011e\n\f\3\f\3"+
		"\f\7\f\u0122\n\f\f\f\16\f\u0125\13\f\3\f\3\f\3\r\3\r\3\r\5\r\u012c\n\r"+
		"\3\r\5\r\u012f\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0139"+
		"\n\16\3\17\3\17\7\17\u013d\n\17\f\17\16\17\u0140\13\17\3\17\3\17\3\17"+
		"\5\17\u0145\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u014e\n\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u015a\n\21\f\21"+
		"\16\21\u015d\13\21\5\21\u015f\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\5\23\u016b\n\23\3\23\3\23\3\24\3\24\3\24\5\24\u0172\n"+
		"\24\3\24\5\24\u0175\n\24\3\25\5\25\u0178\n\25\3\25\3\25\5\25\u017c\n\25"+
		"\3\25\3\25\3\25\5\25\u0181\n\25\3\25\3\25\5\25\u0185\n\25\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0190\n\27\f\27\16\27\u0193\13"+
		"\27\3\30\5\30\u0196\n\30\3\30\3\30\3\30\3\30\5\30\u019c\n\30\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u01a6\n\32\3\32\3\32\7\32\u01aa\n"+
		"\32\f\32\16\32\u01ad\13\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u01b5\n"+
		"\33\f\33\16\33\u01b8\13\33\5\33\u01ba\n\33\3\33\3\33\3\34\3\34\5\34\u01c0"+
		"\n\34\3\34\5\34\u01c3\n\34\3\35\3\35\3\35\3\35\7\35\u01c9\n\35\f\35\16"+
		"\35\u01cc\13\35\5\35\u01ce\n\35\3\35\3\35\3\36\3\36\5\36\u01d4\n\36\3"+
		"\36\5\36\u01d7\n\36\3\37\3\37\3\37\3\37\7\37\u01dd\n\37\f\37\16\37\u01e0"+
		"\13\37\5\37\u01e2\n\37\3\37\3\37\3 \3 \5 \u01e8\n \3!\3!\5!\u01ec\n!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01f7\n\"\3\"\3\"\3\"\5\"\u01fc\n"+
		"\"\3\"\7\"\u01ff\n\"\f\"\16\"\u0202\13\"\3#\3#\3#\7#\u0207\n#\f#\16#\u020a"+
		"\13#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\7%\u0218\n%\f%\16%\u021b\13%"+
		"\3%\3%\5%\u021f\n%\3&\3&\3\'\3\'\3(\3(\7(\u0227\n(\f(\16(\u022a\13(\3"+
		"(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u023b\n)\3*\3*\3*\3+\3"+
		"+\3,\3,\3-\5-\u0245\n-\3-\3-\3.\5.\u024a\n.\3.\7.\u024d\n.\f.\16.\u0250"+
		"\13.\3.\5.\u0253\n.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\5\63\u0261\n\63\3\63\3\63\5\63\u0265\n\63\3\63\7\63\u0268\n\63\f"+
		"\63\16\63\u026b\13\63\3\63\5\63\u026e\n\63\3\63\3\63\5\63\u0272\n\63\3"+
		"\63\3\63\3\64\3\64\3\64\3\64\5\64\u027a\n\64\3\64\3\64\5\64\u027e\n\64"+
		"\3\64\7\64\u0281\n\64\f\64\16\64\u0284\13\64\3\64\5\64\u0287\n\64\3\64"+
		"\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\5\66\u0296"+
		"\n\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u02a1\n\67\38"+
		"\38\38\38\38\38\39\39\59\u02ab\n9\3:\3:\3:\3:\5:\u02b1\n:\3:\3:\5:\u02b5"+
		"\n:\3:\5:\u02b8\n:\3:\3:\3:\3;\3;\5;\u02bf\n;\3;\3;\3<\3<\3<\3<\3<\3<"+
		"\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\5?\u02d3\n?\3?\3?\3@\3@\3@\3A\3A\3A\3A"+
		"\3B\3B\3B\3B\3B\3B\3B\5B\u02e5\nB\3B\3B\5B\u02e9\nB\3B\3B\3C\5C\u02ee"+
		"\nC\3C\3C\5C\u02f2\nC\7C\u02f4\nC\fC\16C\u02f7\13C\3D\3D\5D\u02fb\nD\3"+
		"D\7D\u02fe\nD\fD\16D\u0301\13D\3D\5D\u0304\nD\3D\3D\3E\3E\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u031c\nF\3F\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F"+
		"\3F\3F\3F\3F\3F\3F\7F\u0357\nF\fF\16F\u035a\13F\3G\3G\3G\3G\3G\3G\3G\5"+
		"G\u0363\nG\3G\3G\3G\3G\3G\5G\u036a\nG\5G\u036c\nG\3H\3H\3H\7H\u0371\n"+
		"H\fH\16H\u0374\13H\3I\3I\3I\7I\u0379\nI\fI\16I\u037c\13I\3I\5I\u037f\n"+
		"I\3J\3J\3J\3J\3K\3K\5K\u0387\nK\3K\3K\5K\u038b\nK\5K\u038d\nK\3L\3L\3"+
		"L\3L\3L\3M\3M\7M\u0396\nM\fM\16M\u0399\13M\3M\3M\3N\3N\3N\3N\3N\3N\3N"+
		"\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u03ae\nN\3O\3O\5O\u03b2\nO\3P\3P\3P"+
		"\3P\5P\u03b8\nP\3P\3P\5P\u03bc\nP\3P\3P\7P\u03c0\nP\fP\16P\u03c3\13P\3"+
		"P\5P\u03c6\nP\3Q\3Q\3Q\3Q\5Q\u03cc\nQ\3R\3R\3R\3R\3S\3S\3S\3S\3S\5S\u03d7"+
		"\nS\3T\3T\3T\7T\u03dc\nT\fT\16T\u03df\13T\3U\3U\3U\3V\3V\3V\3W\3W\3W\7"+
		"W\u03ea\nW\fW\16W\u03ed\13W\3X\3X\3X\3X\3X\3X\5X\u03f5\nX\3Y\3Y\3Y\3Y"+
		"\5Y\u03fb\nY\3Y\3Y\5Y\u03ff\nY\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\5[\u0409\n[\3["+
		"\3[\3[\5[\u040e\n[\3[\3[\3\\\3\\\3\\\3\\\3]\3]\3^\3^\3^\3^\3_\3_\5_\u041e"+
		"\n_\3_\3_\5_\u0422\n_\7_\u0424\n_\f_\16_\u0427\13_\3_\3_\3_\3_\3_\7_\u042e"+
		"\n_\f_\16_\u0431\13_\5_\u0433\n_\3_\5_\u0436\n_\3`\3`\5`\u043a\n`\3a\3"+
		"a\5a\u043e\na\3b\3b\3b\2\4B\u008ac\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\2\30\3\2\6\f\3\2jk\3"+
		"\2\24\26\5\2zz~~\u0080\u0081\3\2)+\6\2zz\177\177\u0082\u0082\u0084\u0084"+
		"\3\2.\60\3\2\61\62\3\2\63\64\3\2\65\66\5\2%%@Clp\3\2DE\3\2GH\3\2IJ\4\2"+
		"\17\17MN\3\2OP\3\2\b\13\3\2ST\4\2\f\fYb\5\2stvv\u0086\u0086\3\2st\5\2"+
		"\20\20++\u0085\u0085\2\u04a3\2\u00c9\3\2\2\2\4\u00ce\3\2\2\2\6\u00d3\3"+
		"\2\2\2\b\u00d7\3\2\2\2\n\u00d9\3\2\2\2\f\u00dd\3\2\2\2\16\u00e0\3\2\2"+
		"\2\20\u00e4\3\2\2\2\22\u010b\3\2\2\2\24\u010d\3\2\2\2\26\u0110\3\2\2\2"+
		"\30\u0128\3\2\2\2\32\u0138\3\2\2\2\34\u013a\3\2\2\2\36\u0148\3\2\2\2 "+
		"\u0151\3\2\2\2\"\u0162\3\2\2\2$\u0167\3\2\2\2&\u016e\3\2\2\2(\u0177\3"+
		"\2\2\2*\u0186\3\2\2\2,\u0191\3\2\2\2.\u0195\3\2\2\2\60\u019f\3\2\2\2\62"+
		"\u01a1\3\2\2\2\64\u01b0\3\2\2\2\66\u01bd\3\2\2\28\u01c4\3\2\2\2:\u01d1"+
		"\3\2\2\2<\u01d8\3\2\2\2>\u01e5\3\2\2\2@\u01e9\3\2\2\2B\u01f6\3\2\2\2D"+
		"\u0203\3\2\2\2F\u020b\3\2\2\2H\u0212\3\2\2\2J\u0220\3\2\2\2L\u0222\3\2"+
		"\2\2N\u0224\3\2\2\2P\u023a\3\2\2\2R\u023c\3\2\2\2T\u023f\3\2\2\2V\u0241"+
		"\3\2\2\2X\u0244\3\2\2\2Z\u024e\3\2\2\2\\\u0254\3\2\2\2^\u0256\3\2\2\2"+
		"`\u0258\3\2\2\2b\u025a\3\2\2\2d\u025c\3\2\2\2f\u0275\3\2\2\2h\u028a\3"+
		"\2\2\2j\u0295\3\2\2\2l\u0299\3\2\2\2n\u02a2\3\2\2\2p\u02aa\3\2\2\2r\u02ac"+
		"\3\2\2\2t\u02bc\3\2\2\2v\u02c2\3\2\2\2x\u02ca\3\2\2\2z\u02cd\3\2\2\2|"+
		"\u02d0\3\2\2\2~\u02d6\3\2\2\2\u0080\u02d9\3\2\2\2\u0082\u02e4\3\2\2\2"+
		"\u0084\u02ed\3\2\2\2\u0086\u02f8\3\2\2\2\u0088\u0307\3\2\2\2\u008a\u031b"+
		"\3\2\2\2\u008c\u036b\3\2\2\2\u008e\u036d\3\2\2\2\u0090\u0375\3\2\2\2\u0092"+
		"\u0380\3\2\2\2\u0094\u038c\3\2\2\2\u0096\u038e\3\2\2\2\u0098\u0393\3\2"+
		"\2\2\u009a\u03ad\3\2\2\2\u009c\u03b1\3\2\2\2\u009e\u03b7\3\2\2\2\u00a0"+
		"\u03c7\3\2\2\2\u00a2\u03cd\3\2\2\2\u00a4\u03d6\3\2\2\2\u00a6\u03d8\3\2"+
		"\2\2\u00a8\u03e0\3\2\2\2\u00aa\u03e3\3\2\2\2\u00ac\u03e6\3\2\2\2\u00ae"+
		"\u03f4\3\2\2\2\u00b0\u03f6\3\2\2\2\u00b2\u0402\3\2\2\2\u00b4\u0405\3\2"+
		"\2\2\u00b6\u0411\3\2\2\2\u00b8\u0415\3\2\2\2\u00ba\u0417\3\2\2\2\u00bc"+
		"\u0435\3\2\2\2\u00be\u0439\3\2\2\2\u00c0\u043b\3\2\2\2\u00c2\u043f\3\2"+
		"\2\2\u00c4\u00c8\5\4\3\2\u00c5\u00c8\5\22\n\2\u00c6\u00c8\5\26\f\2\u00c7"+
		"\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00cd\7\2\2\3\u00cd\3\3\2\2\2\u00ce\u00cf\7\3\2\2"+
		"\u00cf\u00d0\5\6\4\2\u00d0\u00d1\5\b\5\2\u00d1\u00d2\7\4\2\2\u00d2\5\3"+
		"\2\2\2\u00d3\u00d4\7\5\2\2\u00d4\7\3\2\2\2\u00d5\u00d8\5\n\6\2\u00d6\u00d8"+
		"\5\u008aF\2\u00d7\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\t\3\2\2\2\u00d9"+
		"\u00db\5\16\b\2\u00da\u00dc\5\16\b\2\u00db\u00da\3\2\2\2\u00db\u00dc\3"+
		"\2\2\2\u00dc\13\3\2\2\2\u00dd\u00de\t\2\2\2\u00de\r\3\2\2\2\u00df\u00e1"+
		"\5\f\7\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\7q\2\2\u00e3\17\3\2\2\2\u00e4\u00e7\5\u00c2b\2\u00e5\u00e6\7\r"+
		"\2\2\u00e6\u00e8\5\u00c2b\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\21\3\2\2\2\u00e9\u00ea\7\16\2\2\u00ea\u00ed\7\u0086\2\2\u00eb\u00ec\7"+
		"\r\2\2\u00ec\u00ee\5\u00c2b\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2"+
		"\u00ee\u00ef\3\2\2\2\u00ef\u010c\7\4\2\2\u00f0\u00f3\7\16\2\2\u00f1\u00f4"+
		"\7\17\2\2\u00f2\u00f4\5\u00c2b\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2"+
		"\2\u00f4\u00f7\3\2\2\2\u00f5\u00f6\7\r\2\2\u00f6\u00f8\5\u00c2b\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7\20"+
		"\2\2\u00fa\u00fb\7\u0086\2\2\u00fb\u010c\7\4\2\2\u00fc\u00fd\7\16\2\2"+
		"\u00fd\u00fe\7\21\2\2\u00fe\u0103\5\20\t\2\u00ff\u0100\7\22\2\2\u0100"+
		"\u0102\5\20\t\2\u0101\u00ff\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3"+
		"\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106"+
		"\u0107\7\23\2\2\u0107\u0108\7\20\2\2\u0108\u0109\7\u0086\2\2\u0109\u010a"+
		"\7\4\2\2\u010a\u010c\3\2\2\2\u010b\u00e9\3\2\2\2\u010b\u00f0\3\2\2\2\u010b"+
		"\u00fc\3\2\2\2\u010c\23\3\2\2\2\u010d\u010e\t\3\2\2\u010e\25\3\2\2\2\u010f"+
		"\u0111\5\24\13\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3"+
		"\2\2\2\u0112\u0113\t\4\2\2\u0113\u011d\5\u00c2b\2\u0114\u0115\7\27\2\2"+
		"\u0115\u011a\5\30\r\2\u0116\u0117\7\22\2\2\u0117\u0119\5\30\r\2\u0118"+
		"\u0116\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2"+
		"\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u0114\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0123\7\21\2\2\u0120\u0122\5"+
		"\32\16\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\7\23"+
		"\2\2\u0127\27\3\2\2\2\u0128\u012e\5D#\2\u0129\u012b\7\30\2\2\u012a\u012c"+
		"\5\u008eH\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2"+
		"\2\u012d\u012f\7\31\2\2\u012e\u0129\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\31\3\2\2\2\u0130\u0139\5\34\17\2\u0131\u0139\5\36\20\2\u0132\u0139\5"+
		" \21\2\u0133\u0139\5\"\22\2\u0134\u0139\5$\23\2\u0135\u0139\5(\25\2\u0136"+
		"\u0139\5.\30\2\u0137\u0139\5\62\32\2\u0138\u0130\3\2\2\2\u0138\u0131\3"+
		"\2\2\2\u0138\u0132\3\2\2\2\u0138\u0133\3\2\2\2\u0138\u0134\3\2\2\2\u0138"+
		"\u0135\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139\33\3\2\2"+
		"\2\u013a\u013e\5B\"\2\u013b\u013d\t\5\2\2\u013c\u013b\3\2\2\2\u013d\u0140"+
		"\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140"+
		"\u013e\3\2\2\2\u0141\u0144\5\u00c2b\2\u0142\u0143\7\f\2\2\u0143\u0145"+
		"\5\u008aF\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2"+
		"\2\u0146\u0147\7\4\2\2\u0147\35\3\2\2\2\u0148\u0149\7\32\2\2\u0149\u014a"+
		"\5\u00c2b\2\u014a\u014d\7\33\2\2\u014b\u014e\7\17\2\2\u014c\u014e\5B\""+
		"\2\u014d\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150"+
		"\7\4\2\2\u0150\37\3\2\2\2\u0151\u0152\7\34\2\2\u0152\u0153\5\u00c2b\2"+
		"\u0153\u015e\7\21\2\2\u0154\u0155\5@!\2\u0155\u015b\7\4\2\2\u0156\u0157"+
		"\5@!\2\u0157\u0158\7\4\2\2\u0158\u015a\3\2\2\2\u0159\u0156\3\2\2\2\u015a"+
		"\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015f\3\2"+
		"\2\2\u015d\u015b\3\2\2\2\u015e\u0154\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0161\7\23\2\2\u0161!\3\2\2\2\u0162\u0163\7\35\2"+
		"\2\u0163\u0164\5\64\33\2\u0164\u0165\5,\27\2\u0165\u0166\5N(\2\u0166#"+
		"\3\2\2\2\u0167\u0168\7\36\2\2\u0168\u016a\5\u00c2b\2\u0169\u016b\5\64"+
		"\33\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016d\5N(\2\u016d%\3\2\2\2\u016e\u0174\5\u00c2b\2\u016f\u0171\7\30\2"+
		"\2\u0170\u0172\5\u008eH\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0175\7\31\2\2\u0174\u016f\3\2\2\2\u0174\u0175\3"+
		"\2\2\2\u0175\'\3\2\2\2\u0176\u0178\5\24\13\2\u0177\u0176\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\7\37\2\2\u017a\u017c\5"+
		"\u00c2b\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2"+
		"\u017d\u017e\5\64\33\2\u017e\u0180\5,\27\2\u017f\u0181\5*\26\2\u0180\u017f"+
		"\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0185\7\4\2\2\u0183"+
		"\u0185\5N(\2\u0184\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0185)\3\2\2\2\u0186"+
		"\u0187\7 \2\2\u0187\u0188\5\64\33\2\u0188+\3\2\2\2\u0189\u0190\5&\24\2"+
		"\u018a\u0190\5L\'\2\u018b\u0190\7|\2\2\u018c\u0190\7\u0081\2\2\u018d\u0190"+
		"\7~\2\2\u018e\u0190\7\u0080\2\2\u018f\u0189\3\2\2\2\u018f\u018a\3\2\2"+
		"\2\u018f\u018b\3\2\2\2\u018f\u018c\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u018e"+
		"\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192"+
		"-\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0196\5\24\13\2\u0195\u0194\3\2\2"+
		"\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\7!\2\2\u0198\u0199"+
		"\5\u00c2b\2\u0199\u019b\58\35\2\u019a\u019c\7x\2\2\u019b\u019a\3\2\2\2"+
		"\u019b\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\7\4\2\2\u019e/\3"+
		"\2\2\2\u019f\u01a0\5\u00c2b\2\u01a0\61\3\2\2\2\u01a1\u01a2\7\"\2\2\u01a2"+
		"\u01a3\5\u00c2b\2\u01a3\u01a5\7\21\2\2\u01a4\u01a6\5\60\31\2\u01a5\u01a4"+
		"\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01ab\3\2\2\2\u01a7\u01a8\7\22\2\2"+
		"\u01a8\u01aa\5\60\31\2\u01a9\u01a7\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9"+
		"\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae"+
		"\u01af\7\23\2\2\u01af\63\3\2\2\2\u01b0\u01b9\7\30\2\2\u01b1\u01b6\5\66"+
		"\34\2\u01b2\u01b3\7\22\2\2\u01b3\u01b5\5\66\34\2\u01b4\u01b2\3\2\2\2\u01b5"+
		"\u01b8\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01ba\3\2"+
		"\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01b1\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01bb\3\2\2\2\u01bb\u01bc\7\31\2\2\u01bc\65\3\2\2\2\u01bd\u01bf\5B\""+
		"\2\u01be\u01c0\5J&\2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c2"+
		"\3\2\2\2\u01c1\u01c3\5\u00c2b\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2"+
		"\2\u01c3\67\3\2\2\2\u01c4\u01cd\7\30\2\2\u01c5\u01ca\5:\36\2\u01c6\u01c7"+
		"\7\22\2\2\u01c7\u01c9\5:\36\2\u01c8\u01c6\3\2\2\2\u01c9\u01cc\3\2\2\2"+
		"\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca"+
		"\3\2\2\2\u01cd\u01c5\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"\u01d0\7\31\2\2\u01d09\3\2\2\2\u01d1\u01d3\5B\"\2\u01d2\u01d4\7}\2\2\u01d3"+
		"\u01d2\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d7\5\u00c2"+
		"b\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7;\3\2\2\2\u01d8\u01e1"+
		"\7\30\2\2\u01d9\u01de\5> \2\u01da\u01db\7\22\2\2\u01db\u01dd\5> \2\u01dc"+
		"\u01da\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2"+
		"\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01d9\3\2\2\2\u01e1"+
		"\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\7\31\2\2\u01e4=\3\2\2\2"+
		"\u01e5\u01e7\5B\"\2\u01e6\u01e8\5J&\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8"+
		"\3\2\2\2\u01e8?\3\2\2\2\u01e9\u01eb\5B\"\2\u01ea\u01ec\5J&\2\u01eb\u01ea"+
		"\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\5\u00c2b"+
		"\2\u01eeA\3\2\2\2\u01ef\u01f0\b\"\1\2\u01f0\u01f7\5\u0088E\2\u01f1\u01f7"+
		"\5D#\2\u01f2\u01f7\5F$\2\u01f3\u01f7\5H%\2\u01f4\u01f5\7%\2\2\u01f5\u01f7"+
		"\7\177\2\2\u01f6\u01ef\3\2\2\2\u01f6\u01f1\3\2\2\2\u01f6\u01f2\3\2\2\2"+
		"\u01f6\u01f3\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u0200\3\2\2\2\u01f8\u01f9"+
		"\f\5\2\2\u01f9\u01fb\7#\2\2\u01fa\u01fc\5\u008aF\2\u01fb\u01fa\3\2\2\2"+
		"\u01fb\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\7$\2\2\u01fe\u01f8"+
		"\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201"+
		"C\3\2\2\2\u0202\u0200\3\2\2\2\u0203\u0208\5\u00c2b\2\u0204\u0205\7&\2"+
		"\2\u0205\u0207\5\u00c2b\2\u0206\u0204\3\2\2\2\u0207\u020a\3\2\2\2\u0208"+
		"\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209E\3\2\2\2\u020a\u0208\3\2\2\2"+
		"\u020b\u020c\7\'\2\2\u020c\u020d\7\30\2\2\u020d\u020e\5\u0088E\2\u020e"+
		"\u020f\7(\2\2\u020f\u0210\5B\"\2\u0210\u0211\7\31\2\2\u0211G\3\2\2\2\u0212"+
		"\u0213\7\37\2\2\u0213\u0219\5<\37\2\u0214\u0218\7~\2\2\u0215\u0218\7|"+
		"\2\2\u0216\u0218\5L\'\2\u0217\u0214\3\2\2\2\u0217\u0215\3\2\2\2\u0217"+
		"\u0216\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2"+
		"\2\2\u021a\u021e\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u021d\7 \2\2\u021d"+
		"\u021f\5<\37\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021fI\3\2\2\2"+
		"\u0220\u0221\t\6\2\2\u0221K\3\2\2\2\u0222\u0223\t\7\2\2\u0223M\3\2\2\2"+
		"\u0224\u0228\7\21\2\2\u0225\u0227\5P)\2\u0226\u0225\3\2\2\2\u0227\u022a"+
		"\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\3\2\2\2\u022a"+
		"\u0228\3\2\2\2\u022b\u022c\7\23\2\2\u022cO\3\2\2\2\u022d\u023b\5l\67\2"+
		"\u022e\u023b\5n8\2\u022f\u023b\5r:\2\u0230\u023b\5N(\2\u0231\u023b\5t"+
		";\2\u0232\u023b\5v<\2\u0233\u023b\5x=\2\u0234\u023b\5z>\2\u0235\u023b"+
		"\5|?\2\u0236\u023b\5~@\2\u0237\u023b\5\u0080A\2\u0238\u023b\5p9\2\u0239"+
		"\u023b\5j\66\2\u023a\u022d\3\2\2\2\u023a\u022e\3\2\2\2\u023a\u022f\3\2"+
		"\2\2\u023a\u0230\3\2\2\2\u023a\u0231\3\2\2\2\u023a\u0232\3\2\2\2\u023a"+
		"\u0233\3\2\2\2\u023a\u0234\3\2\2\2\u023a\u0235\3\2\2\2\u023a\u0236\3\2"+
		"\2\2\u023a\u0237\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u0239\3\2\2\2\u023b"+
		"Q\3\2\2\2\u023c\u023d\5\u008aF\2\u023d\u023e\7\4\2\2\u023eS\3\2\2\2\u023f"+
		"\u0240\7,\2\2\u0240U\3\2\2\2\u0241\u0242\7-\2\2\u0242W\3\2\2\2\u0243\u0245"+
		"\5V,\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\3\2\2\2\u0246"+
		"\u0247\5\u00c2b\2\u0247Y\3\2\2\2\u0248\u024a\5X-\2\u0249\u0248\3\2\2\2"+
		"\u0249\u024a\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024d\7\22\2\2\u024c\u0249"+
		"\3\2\2\2\u024d\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f"+
		"\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0251\u0253\5X-\2\u0252\u0251\3\2\2"+
		"\2\u0252\u0253\3\2\2\2\u0253[\3\2\2\2\u0254\u0255\t\b\2\2\u0255]\3\2\2"+
		"\2\u0256\u0257\t\t\2\2\u0257_\3\2\2\2\u0258\u0259\t\n\2\2\u0259a\3\2\2"+
		"\2\u025a\u025b\t\13\2\2\u025bc\3\2\2\2\u025c\u025d\5T+\2\u025d\u0260\5"+
		"^\60\2\u025e\u025f\7\67\2\2\u025f\u0261\5\\/\2\u0260\u025e\3\2\2\2\u0260"+
		"\u0261\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0269\7\30\2\2\u0263\u0265\5"+
		"\u00c2b\2\u0264\u0263\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\3\2\2\2"+
		"\u0266\u0268\7\22\2\2\u0267\u0264\3\2\2\2\u0268\u026b\3\2\2\2\u0269\u0267"+
		"\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026c"+
		"\u026e\5\u00c2b\2\u026d\u026c\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026f"+
		"\3\2\2\2\u026f\u0271\7\22\2\2\u0270\u0272\5\u008cG\2\u0271\u0270\3\2\2"+
		"\2\u0271\u0272\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\7\31\2\2\u0274"+
		"e\3\2\2\2\u0275\u0276\5T+\2\u0276\u0279\5`\61\2\u0277\u0278\7\67\2\2\u0278"+
		"\u027a\5\\/\2\u0279\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027b\3\2"+
		"\2\2\u027b\u0282\7\30\2\2\u027c\u027e\5\u00c2b\2\u027d\u027c\3\2\2\2\u027d"+
		"\u027e\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0281\7\22\2\2\u0280\u027d\3"+
		"\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283"+
		"\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0285\u0287\5\u00c2b\2\u0286\u0285"+
		"\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0289\7\31\2\2"+
		"\u0289g\3\2\2\2\u028a\u028b\5T+\2\u028b\u028c\5b\62\2\u028c\u028d\7\67"+
		"\2\2\u028d\u028e\5\u008cG\2\u028e\u028f\7\30\2\2\u028f\u0290\5Z.\2\u0290"+
		"\u0291\7\31\2\2\u0291i\3\2\2\2\u0292\u0296\5d\63\2\u0293\u0296\5f\64\2"+
		"\u0294\u0296\5h\65\2\u0295\u0292\3\2\2\2\u0295\u0293\3\2\2\2\u0295\u0294"+
		"\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0298\7\4\2\2\u0298k\3\2\2\2\u0299"+
		"\u029a\78\2\2\u029a\u029b\7\30\2\2\u029b\u029c\5\u008aF\2\u029c\u029d"+
		"\7\31\2\2\u029d\u02a0\5P)\2\u029e\u029f\79\2\2\u029f\u02a1\5P)\2\u02a0"+
		"\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1m\3\2\2\2\u02a2\u02a3\7:\2\2\u02a3"+
		"\u02a4\7\30\2\2\u02a4\u02a5\5\u008aF\2\u02a5\u02a6\7\31\2\2\u02a6\u02a7"+
		"\5P)\2\u02a7o\3\2\2\2\u02a8\u02ab\5\u0082B\2\u02a9\u02ab\5R*\2\u02aa\u02a8"+
		"\3\2\2\2\u02aa\u02a9\3\2\2\2\u02abq\3\2\2\2\u02ac\u02ad\7\33\2\2\u02ad"+
		"\u02b0\7\30\2\2\u02ae\u02b1\5p9\2\u02af\u02b1\7\4\2\2\u02b0\u02ae\3\2"+
		"\2\2\u02b0\u02af\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2\u02b5\5R*\2\u02b3\u02b5"+
		"\7\4\2\2\u02b4\u02b2\3\2\2\2\u02b4\u02b3\3\2\2\2\u02b5\u02b7\3\2\2\2\u02b6"+
		"\u02b8\5\u008aF\2\u02b7\u02b6\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9"+
		"\3\2\2\2\u02b9\u02ba\7\31\2\2\u02ba\u02bb\5P)\2\u02bbs\3\2\2\2\u02bc\u02be"+
		"\7;\2\2\u02bd\u02bf\7\u0086\2\2\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2"+
		"\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1\5\u0098M\2\u02c1u\3\2\2\2\u02c2\u02c3"+
		"\7<\2\2\u02c3\u02c4\5P)\2\u02c4\u02c5\7:\2\2\u02c5\u02c6\7\30\2\2\u02c6"+
		"\u02c7\5\u008aF\2\u02c7\u02c8\7\31\2\2\u02c8\u02c9\7\4\2\2\u02c9w\3\2"+
		"\2\2\u02ca\u02cb\7{\2\2\u02cb\u02cc\7\4\2\2\u02ccy\3\2\2\2\u02cd\u02ce"+
		"\7y\2\2\u02ce\u02cf\7\4\2\2\u02cf{\3\2\2\2\u02d0\u02d2\7=\2\2\u02d1\u02d3"+
		"\5\u008aF\2\u02d2\u02d1\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\3\2\2"+
		"\2\u02d4\u02d5\7\4\2\2\u02d5}\3\2\2\2\u02d6\u02d7\7>\2\2\u02d7\u02d8\7"+
		"\4\2\2\u02d8\177\3\2\2\2\u02d9\u02da\7?\2\2\u02da\u02db\5\u0096L\2\u02db"+
		"\u02dc\7\4\2\2\u02dc\u0081\3\2\2\2\u02dd\u02de\7@\2\2\u02de\u02e5\5\u0086"+
		"D\2\u02df\u02e5\5@!\2\u02e0\u02e1\7\30\2\2\u02e1\u02e2\5\u0084C\2\u02e2"+
		"\u02e3\7\31\2\2\u02e3\u02e5\3\2\2\2\u02e4\u02dd\3\2\2\2\u02e4\u02df\3"+
		"\2\2\2\u02e4\u02e0\3\2\2\2\u02e5\u02e8\3\2\2\2\u02e6\u02e7\7\f\2\2\u02e7"+
		"\u02e9\5\u008aF\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ea"+
		"\3\2\2\2\u02ea\u02eb\7\4\2\2\u02eb\u0083\3\2\2\2\u02ec\u02ee\5@!\2\u02ed"+
		"\u02ec\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f5\3\2\2\2\u02ef\u02f1\7\22"+
		"\2\2\u02f0\u02f2\5@!\2\u02f1\u02f0\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f4"+
		"\3\2\2\2\u02f3\u02ef\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5"+
		"\u02f6\3\2\2\2\u02f6\u0085\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u02ff\7\30"+
		"\2\2\u02f9\u02fb\5\u00c2b\2\u02fa\u02f9\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb"+
		"\u02fc\3\2\2\2\u02fc\u02fe\7\22\2\2\u02fd\u02fa\3\2\2\2\u02fe\u0301\3"+
		"\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0303\3\2\2\2\u0301"+
		"\u02ff\3\2\2\2\u0302\u0304\5\u00c2b\2\u0303\u0302\3\2\2\2\u0303\u0304"+
		"\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0306\7\31\2\2\u0306\u0087\3\2\2\2"+
		"\u0307\u0308\t\f\2\2\u0308\u0089\3\2\2\2\u0309\u030a\bF\1\2\u030a\u030b"+
		"\7F\2\2\u030b\u031c\5B\"\2\u030c\u030d\7\30\2\2\u030d\u030e\5\u008aF\2"+
		"\u030e\u030f\7\31\2\2\u030f\u031c\3\2\2\2\u0310\u0311\t\r\2\2\u0311\u031c"+
		"\5\u008aF\25\u0312\u0313\t\16\2\2\u0313\u031c\5\u008aF\24\u0314\u0315"+
		"\t\17\2\2\u0315\u031c\5\u008aF\23\u0316\u0317\7K\2\2\u0317\u031c\5\u008a"+
		"F\22\u0318\u0319\7\7\2\2\u0319\u031c\5\u008aF\21\u031a\u031c\5\u008cG"+
		"\2\u031b\u0309\3\2\2\2\u031b\u030c\3\2\2\2\u031b\u0310\3\2\2\2\u031b\u0312"+
		"\3\2\2\2\u031b\u0314\3\2\2\2\u031b\u0316\3\2\2\2\u031b\u0318\3\2\2\2\u031b"+
		"\u031a\3\2\2\2\u031c\u0358\3\2\2\2\u031d\u031e\f\20\2\2\u031e\u031f\7"+
		"L\2\2\u031f\u0357\5\u008aF\21\u0320\u0321\f\17\2\2\u0321\u0322\t\20\2"+
		"\2\u0322\u0357\5\u008aF\20\u0323\u0324\f\16\2\2\u0324\u0325\t\16\2\2\u0325"+
		"\u0357\5\u008aF\17\u0326\u0327\f\r\2\2\u0327\u0328\t\21\2\2\u0328\u0357"+
		"\5\u008aF\16\u0329\u032a\f\f\2\2\u032a\u032b\7Q\2\2\u032b\u0357\5\u008a"+
		"F\r\u032c\u032d\f\13\2\2\u032d\u032e\7\6\2\2\u032e\u0357\5\u008aF\f\u032f"+
		"\u0330\f\n\2\2\u0330\u0331\7R\2\2\u0331\u0357\5\u008aF\13\u0332\u0333"+
		"\f\t\2\2\u0333\u0334\t\22\2\2\u0334\u0357\5\u008aF\n\u0335\u0336\f\b\2"+
		"\2\u0336\u0337\t\23\2\2\u0337\u0357\5\u008aF\t\u0338\u0339\f\7\2\2\u0339"+
		"\u033a\7U\2\2\u033a\u0357\5\u008aF\b\u033b\u033c\f\6\2\2\u033c\u033d\7"+
		"V\2\2\u033d\u0357\5\u008aF\7\u033e\u033f\f\5\2\2\u033f\u0340\7W\2\2\u0340"+
		"\u0341\5\u008aF\2\u0341\u0342\7X\2\2\u0342\u0343\5\u008aF\6\u0343\u0357"+
		"\3\2\2\2\u0344\u0345\f\4\2\2\u0345\u0346\t\24\2\2\u0346\u0357\5\u008a"+
		"F\5\u0347\u0348\f\33\2\2\u0348\u0357\t\r\2\2\u0349\u034a\f\31\2\2\u034a"+
		"\u034b\7#\2\2\u034b\u034c\5\u008aF\2\u034c\u034d\7$\2\2\u034d\u0357\3"+
		"\2\2\2\u034e\u034f\f\30\2\2\u034f\u0350\7\30\2\2\u0350\u0351\5\u0094K"+
		"\2\u0351\u0352\7\31\2\2\u0352\u0357\3\2\2\2\u0353\u0354\f\27\2\2\u0354"+
		"\u0355\7&\2\2\u0355\u0357\5\u00c2b\2\u0356\u031d\3\2\2\2\u0356\u0320\3"+
		"\2\2\2\u0356\u0323\3\2\2\2\u0356\u0326\3\2\2\2\u0356\u0329\3\2\2\2\u0356"+
		"\u032c\3\2\2\2\u0356\u032f\3\2\2\2\u0356\u0332\3\2\2\2\u0356\u0335\3\2"+
		"\2\2\u0356\u0338\3\2\2\2\u0356\u033b\3\2\2\2\u0356\u033e\3\2\2\2\u0356"+
		"\u0344\3\2\2\2\u0356\u0347\3\2\2\2\u0356\u0349\3\2\2\2\u0356\u034e\3\2"+
		"\2\2\u0356\u0353\3\2\2\2\u0357\u035a\3\2\2\2\u0358\u0356\3\2\2\2\u0358"+
		"\u0359\3\2\2\2\u0359\u008b\3\2\2\2\u035a\u0358\3\2\2\2\u035b\u036c\7r"+
		"\2\2\u035c\u036c\5\u00c0a\2\u035d\u036c\7v\2\2\u035e\u036c\7\u0086\2\2"+
		"\u035f\u0362\5\u00c2b\2\u0360\u0361\7#\2\2\u0361\u0363\7$\2\2\u0362\u0360"+
		"\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u036c\3\2\2\2\u0364\u036c\7\u0083\2"+
		"\2\u0365\u036c\5\u00bc_\2\u0366\u0369\5\u00be`\2\u0367\u0368\7#\2\2\u0368"+
		"\u036a\7$\2\2\u0369\u0367\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036c\3\2"+
		"\2\2\u036b\u035b\3\2\2\2\u036b\u035c\3\2\2\2\u036b\u035d\3\2\2\2\u036b"+
		"\u035e\3\2\2\2\u036b\u035f\3\2\2\2\u036b\u0364\3\2\2\2\u036b\u0365\3\2"+
		"\2\2\u036b\u0366\3\2\2\2\u036c\u008d\3\2\2\2\u036d\u0372\5\u008aF\2\u036e"+
		"\u036f\7\22\2\2\u036f\u0371\5\u008aF\2\u0370\u036e\3\2\2\2\u0371\u0374"+
		"\3\2\2\2\u0372\u0370\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u008f\3\2\2\2\u0374"+
		"\u0372\3\2\2\2\u0375\u037a\5\u0092J\2\u0376\u0377\7\22\2\2\u0377\u0379"+
		"\5\u0092J\2\u0378\u0376\3\2\2\2\u0379\u037c\3\2\2\2\u037a\u0378\3\2\2"+
		"\2\u037a\u037b\3\2\2\2\u037b\u037e\3\2\2\2\u037c\u037a\3\2\2\2\u037d\u037f"+
		"\7\22\2\2\u037e\u037d\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0091\3\2\2\2"+
		"\u0380\u0381\5\u00c2b\2\u0381\u0382\7X\2\2\u0382\u0383\5\u008aF\2\u0383"+
		"\u0093\3\2\2\2\u0384\u0386\7\21\2\2\u0385\u0387\5\u0090I\2\u0386\u0385"+
		"\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u038d\7\23\2\2"+
		"\u0389\u038b\5\u008eH\2\u038a\u0389\3\2\2\2\u038a\u038b\3\2\2\2\u038b"+
		"\u038d\3\2\2\2\u038c\u0384\3\2\2\2\u038c\u038a\3\2\2\2\u038d\u0095\3\2"+
		"\2\2\u038e\u038f\5\u008aF\2\u038f\u0390\7\30\2\2\u0390\u0391\5\u0094K"+
		"\2\u0391\u0392\7\31\2\2\u0392\u0097\3\2\2\2\u0393\u0397\7\21\2\2\u0394"+
		"\u0396\5\u009aN\2\u0395\u0394\3\2\2\2\u0396\u0399\3\2\2\2\u0397\u0395"+
		"\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u039a\3\2\2\2\u0399\u0397\3\2\2\2\u039a"+
		"\u039b\7\23\2\2\u039b\u0099\3\2\2\2\u039c\u03ae\5\u00c2b\2\u039d\u03ae"+
		"\5\u0098M\2\u039e\u03ae\5\u009cO\2\u039f\u03ae\5\u00a0Q\2\u03a0\u03ae"+
		"\5\u00a2R\2\u03a1\u03ae\5\u00a8U\2\u03a2\u03ae\5\u00aaV\2\u03a3\u03ae"+
		"\5\u00acW\2\u03a4\u03ae\5\u00b0Y\2\u03a5\u03ae\5\u00b4[\2\u03a6\u03ae"+
		"\5\u00b6\\\2\u03a7\u03ae\7y\2\2\u03a8\u03ae\7{\2\2\u03a9\u03ae\5\u00ba"+
		"^\2\u03aa\u03ae\5\u00c0a\2\u03ab\u03ae\7\u0086\2\2\u03ac\u03ae\7v\2\2"+
		"\u03ad\u039c\3\2\2\2\u03ad\u039d\3\2\2\2\u03ad\u039e\3\2\2\2\u03ad\u039f"+
		"\3\2\2\2\u03ad\u03a0\3\2\2\2\u03ad\u03a1\3\2\2\2\u03ad\u03a2\3\2\2\2\u03ad"+
		"\u03a3\3\2\2\2\u03ad\u03a4\3\2\2\2\u03ad\u03a5\3\2\2\2\u03ad\u03a6\3\2"+
		"\2\2\u03ad\u03a7\3\2\2\2\u03ad\u03a8\3\2\2\2\u03ad\u03a9\3\2\2\2\u03ad"+
		"\u03aa\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ad\u03ac\3\2\2\2\u03ae\u009b\3\2"+
		"\2\2\u03af\u03b2\5\u009eP\2\u03b0\u03b2\5\u00b8]\2\u03b1\u03af\3\2\2\2"+
		"\u03b1\u03b0\3\2\2\2\u03b2\u009d\3\2\2\2\u03b3\u03b8\7=\2\2\u03b4\u03b8"+
		"\7%\2\2\u03b5\u03b8\7C\2\2\u03b6\u03b8\5\u00c2b\2\u03b7\u03b3\3\2\2\2"+
		"\u03b7\u03b4\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b7\u03b6\3\2\2\2\u03b8\u03c5"+
		"\3\2\2\2\u03b9\u03bb\7\30\2\2\u03ba\u03bc\5\u009cO\2\u03bb\u03ba\3\2\2"+
		"\2\u03bb\u03bc\3\2\2\2\u03bc\u03c1\3\2\2\2\u03bd\u03be\7\22\2\2\u03be"+
		"\u03c0\5\u009cO\2\u03bf\u03bd\3\2\2\2\u03c0\u03c3\3\2\2\2\u03c1\u03bf"+
		"\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c4\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c4"+
		"\u03c6\7\31\2\2\u03c5\u03b9\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u009f\3"+
		"\2\2\2\u03c7\u03c8\7c\2\2\u03c8\u03cb\5\u00a4S\2\u03c9\u03ca\7d\2\2\u03ca"+
		"\u03cc\5\u009cO\2\u03cb\u03c9\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u00a1"+
		"\3\2\2\2\u03cd\u03ce\5\u00a4S\2\u03ce\u03cf\7d\2\2\u03cf\u03d0\5\u009c"+
		"O\2\u03d0\u00a3\3\2\2\2\u03d1\u03d7\5\u00c2b\2\u03d2\u03d3\7\30\2\2\u03d3"+
		"\u03d4\5\u00a6T\2\u03d4\u03d5\7\31\2\2\u03d5\u03d7\3\2\2\2\u03d6\u03d1"+
		"\3\2\2\2\u03d6\u03d2\3\2\2\2\u03d7\u00a5\3\2\2\2\u03d8\u03dd\5\u00c2b"+
		"\2\u03d9\u03da\7\22\2\2\u03da\u03dc\5\u00c2b\2\u03db\u03d9\3\2\2\2\u03dc"+
		"\u03df\3\2\2\2\u03dd\u03db\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u00a7\3\2"+
		"\2\2\u03df\u03dd\3\2\2\2\u03e0\u03e1\7e\2\2\u03e1\u03e2\5\u00c2b\2\u03e2"+
		"\u00a9\3\2\2\2\u03e3\u03e4\5\u00c2b\2\u03e4\u03e5\7X\2\2\u03e5\u00ab\3"+
		"\2\2\2\u03e6\u03e7\7f\2\2\u03e7\u03eb\5\u009cO\2\u03e8\u03ea\5\u00aeX"+
		"\2\u03e9\u03e8\3\2\2\2\u03ea\u03ed\3\2\2\2\u03eb\u03e9\3\2\2\2\u03eb\u03ec"+
		"\3\2\2\2\u03ec\u00ad\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ee\u03ef\7g\2\2\u03ef"+
		"\u03f0\5\u00b8]\2\u03f0\u03f1\5\u0098M\2\u03f1\u03f5\3\2\2\2\u03f2\u03f3"+
		"\7h\2\2\u03f3\u03f5\5\u0098M\2\u03f4\u03ee\3\2\2\2\u03f4\u03f2\3\2\2\2"+
		"\u03f5\u00af\3\2\2\2\u03f6\u03f7\7\37\2\2\u03f7\u03f8\5\u00c2b\2\u03f8"+
		"\u03fa\7\30\2\2\u03f9\u03fb\5\u00a6T\2\u03fa\u03f9\3\2\2\2\u03fa\u03fb"+
		"\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fe\7\31\2\2\u03fd\u03ff\5\u00b2"+
		"Z\2\u03fe\u03fd\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0400\3\2\2\2\u0400"+
		"\u0401\5\u0098M\2\u0401\u00b1\3\2\2\2\u0402\u0403\7i\2\2\u0403\u0404\5"+
		"\u00a6T\2\u0404\u00b3\3\2\2\2\u0405\u0408\7\33\2\2\u0406\u0409\5\u0098"+
		"M\2\u0407\u0409\5\u009cO\2\u0408\u0406\3\2\2\2\u0408\u0407\3\2\2\2\u0409"+
		"\u040a\3\2\2\2\u040a\u040d\5\u009cO\2\u040b\u040e\5\u0098M\2\u040c\u040e"+
		"\5\u009cO\2\u040d\u040b\3\2\2\2\u040d\u040c\3\2\2\2\u040e\u040f\3\2\2"+
		"\2\u040f\u0410\5\u0098M\2\u0410\u00b5\3\2\2\2\u0411\u0412\78\2\2\u0412"+
		"\u0413\5\u009cO\2\u0413\u0414\5\u0098M\2\u0414\u00b7\3\2\2\2\u0415\u0416"+
		"\t\25\2\2\u0416\u00b9\3\2\2\2\u0417\u0418\7;\2\2\u0418\u0419\5\u00c2b"+
		"\2\u0419\u041a\5\u0098M\2\u041a\u00bb\3\2\2\2\u041b\u041d\7\30\2\2\u041c"+
		"\u041e\5\u008aF\2\u041d\u041c\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u0425"+
		"\3\2\2\2\u041f\u0421\7\22\2\2\u0420\u0422\5\u008aF\2\u0421\u0420\3\2\2"+
		"\2\u0421\u0422\3\2\2\2\u0422\u0424\3\2\2\2\u0423\u041f\3\2\2\2\u0424\u0427"+
		"\3\2\2\2\u0425\u0423\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0428\3\2\2\2\u0427"+
		"\u0425\3\2\2\2\u0428\u0436\7\31\2\2\u0429\u0432\7#\2\2\u042a\u042f\5\u008a"+
		"F\2\u042b\u042c\7\22\2\2\u042c\u042e\5\u008aF\2\u042d\u042b\3\2\2\2\u042e"+
		"\u0431\3\2\2\2\u042f\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0433\3\2"+
		"\2\2\u0431\u042f\3\2\2\2\u0432\u042a\3\2\2\2\u0432\u0433\3\2\2\2\u0433"+
		"\u0434\3\2\2\2\u0434\u0436\7$\2\2\u0435\u041b\3\2\2\2\u0435\u0429\3\2"+
		"\2\2\u0436\u00bd\3\2\2\2\u0437\u043a\5\u0088E\2\u0438\u043a\5D#\2\u0439"+
		"\u0437\3\2\2\2\u0439\u0438\3\2\2\2\u043a\u00bf\3\2\2\2\u043b\u043d\t\26"+
		"\2\2\u043c\u043e\7u\2\2\u043d\u043c\3\2\2\2\u043d\u043e\3\2\2\2\u043e"+
		"\u00c1\3\2\2\2\u043f\u0440\t\27\2\2\u0440\u00c3\3\2\2\2|\u00c7\u00c9\u00d7"+
		"\u00db\u00e0\u00e7\u00ed\u00f3\u00f7\u0103\u010b\u0110\u011a\u011d\u0123"+
		"\u012b\u012e\u0138\u013e\u0144\u014d\u015b\u015e\u016a\u0171\u0174\u0177"+
		"\u017b\u0180\u0184\u018f\u0191\u0195\u019b\u01a5\u01ab\u01b6\u01b9\u01bf"+
		"\u01c2\u01ca\u01cd\u01d3\u01d6\u01de\u01e1\u01e7\u01eb\u01f6\u01fb\u0200"+
		"\u0208\u0217\u0219\u021e\u0228\u023a\u0244\u0249\u024e\u0252\u0260\u0264"+
		"\u0269\u026d\u0271\u0279\u027d\u0282\u0286\u0295\u02a0\u02aa\u02b0\u02b4"+
		"\u02b7\u02be\u02d2\u02e4\u02e8\u02ed\u02f1\u02f5\u02fa\u02ff\u0303\u031b"+
		"\u0356\u0358\u0362\u0369\u036b\u0372\u037a\u037e\u0386\u038a\u038c\u0397"+
		"\u03ad\u03b1\u03b7\u03bb\u03c1\u03c5\u03cb\u03d6\u03dd\u03eb\u03f4\u03fa"+
		"\u03fe\u0408\u040d\u041d\u0421\u0425\u042f\u0432\u0435\u0439\u043d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}