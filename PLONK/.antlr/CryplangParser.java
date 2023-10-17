// Generated from /home/xialb/dsl_project/Cryplang/Cryplang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CryplangParser extends Parser {
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
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		NatSpecSingleLine=108, NatSpecMultiLine=109, Int=110, Uint=111, Byte=112, 
		Fixed=113, Ufixed=114, VersionLiteral=115, BooleanLiteral=116, DecimalNumber=117, 
		HexNumber=118, NumberUnit=119, HexLiteral=120, ReservedKeyword=121, AnonymousKeyword=122, 
		BreakKeyword=123, ConstantKeyword=124, ContinueKeyword=125, ExternalKeyword=126, 
		IndexedKeyword=127, InternalKeyword=128, PayableKeyword=129, PrivateKeyword=130, 
		PublicKeyword=131, PureKeyword=132, TypeKeyword=133, ViewKeyword=134, 
		Identifier=135, StringLiteral=136, WS=137, COMMENT=138, LINE_COMMENT=139;
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
		RULE_commitmentMethod = 47, RULE_proofMethod = 48, RULE_cryptoStatement = 49, 
		RULE_signatureStatement = 50, RULE_commitmentStatement = 51, RULE_proofStatement = 52, 
		RULE_taskStatement = 53, RULE_ifStatement = 54, RULE_whileStatement = 55, 
		RULE_simpleStatement = 56, RULE_forStatement = 57, RULE_inlineAssemblyStatement = 58, 
		RULE_doWhileStatement = 59, RULE_continueStatement = 60, RULE_breakStatement = 61, 
		RULE_returnStatement = 62, RULE_throwStatement = 63, RULE_emitStatement = 64, 
		RULE_variableDeclarationStatement = 65, RULE_variableDeclarationList = 66, 
		RULE_identifierList = 67, RULE_elementaryTypeName = 68, RULE_expression = 69, 
		RULE_primaryExpression = 70, RULE_expressionList = 71, RULE_nameValueList = 72, 
		RULE_nameValue = 73, RULE_functionCallArguments = 74, RULE_functionCall = 75, 
		RULE_assemblyBlock = 76, RULE_assemblyItem = 77, RULE_assemblyExpression = 78, 
		RULE_assemblyCall = 79, RULE_assemblyLocalDefinition = 80, RULE_assemblyAssignment = 81, 
		RULE_assemblyIdentifierOrList = 82, RULE_assemblyIdentifierList = 83, 
		RULE_assemblyStackAssignment = 84, RULE_labelDefinition = 85, RULE_assemblySwitch = 86, 
		RULE_assemblyCase = 87, RULE_assemblyFunctionDefinition = 88, RULE_assemblyFunctionReturns = 89, 
		RULE_assemblyFor = 90, RULE_assemblyIf = 91, RULE_assemblyLiteral = 92, 
		RULE_subAssembly = 93, RULE_tupleExpression = 94, RULE_typeNameExpression = 95, 
		RULE_numberLiteral = 96, RULE_identifier = 97;
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
			"proofMethod", "cryptoStatement", "signatureStatement", "commitmentStatement", 
			"proofStatement", "taskStatement", "ifStatement", "whileStatement", "simpleStatement", 
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
			null, "'pragma'", "';'", "'Cryplang'", "'^'", "'~'", "'>='", "'>'", "'<'", 
			"'<='", "'='", "'as'", "'import'", "'*'", "'from'", "'{'", "','", "'}'", 
			"'contract'", "'interface'", "'library'", "'is'", "'('", "')'", "'using'", 
			"'for'", "'struct'", "'constructor'", "'modifier'", "'function'", "'returns'", 
			"'event'", "'enum'", "'['", "']'", "'address'", "'.'", "'mapping'", "'=>'", 
			"'memory'", "'storage'", "'calldata'", "'@require'", "'#'", "'SHA3-256'", 
			"'SHA2-256'", "'RIPEMD160'", "'BLAKE2F'", "'ECDSA'", "'RSA'", "'BLS'", 
			"'Schorr'", "'Pedersen'", "'Merkel'", "'Groth16'", "'PLONK'", "'GM17'", 
			"'with'", "'if'", "'else'", "'while'", "'assembly'", "'do'", "'return'", 
			"'throw'", "'emit'", "'var'", "'bool'", "'string'", "'byte'", "'++'", 
			"'--'", "'new'", "'+'", "'-'", "'after'", "'delete'", "'!'", "'**'", 
			"'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'=='", "'!='", "'&&'", "'||'", 
			"'?'", "':'", "'|='", "'^='", "'&='", "'<<='", "'>>='", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'let'", "':='", "'=:'", "'switch'", "'case'", 
			"'default'", "'->'", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'anonymous'", "'break'", "'constant'", 
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
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NatSpecSingleLine", "NatSpecMultiLine", "Int", "Uint", "Byte", "Fixed", 
			"Ufixed", "VersionLiteral", "BooleanLiteral", "DecimalNumber", "HexNumber", 
			"NumberUnit", "HexLiteral", "ReservedKeyword", "AnonymousKeyword", "BreakKeyword", 
			"ConstantKeyword", "ContinueKeyword", "ExternalKeyword", "IndexedKeyword", 
			"InternalKeyword", "PayableKeyword", "PrivateKeyword", "PublicKeyword", 
			"PureKeyword", "TypeKeyword", "ViewKeyword", "Identifier", "StringLiteral", 
			"WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Cryplang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CryplangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SourceUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CryplangParser.EOF, 0); }
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
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0) || _la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(199);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(196);
					pragmaDirective();
					}
					break;
				case T__11:
					{
					setState(197);
					importDirective();
					}
					break;
				case T__17:
				case T__18:
				case T__19:
				case NatSpecSingleLine:
				case NatSpecMultiLine:
					{
					setState(198);
					contractDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
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
			setState(206);
			match(T__0);
			setState(207);
			pragmaName();
			setState(208);
			pragmaValue();
			setState(209);
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
			setState(211);
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
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				version();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
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
			setState(217);
			versionConstraint();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0) || _la==VersionLiteral) {
				{
				setState(218);
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
			setState(221);
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
		public TerminalNode VersionLiteral() { return getToken(CryplangParser.VersionLiteral, 0); }
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
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
				{
				setState(223);
				versionOperator();
				}
			}

			setState(226);
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
			setState(228);
			identifier();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(229);
				match(T__10);
				setState(230);
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
		public TerminalNode StringLiteral() { return getToken(CryplangParser.StringLiteral, 0); }
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
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(T__11);
				setState(234);
				match(StringLiteral);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(235);
					match(T__10);
					setState(236);
					identifier();
					}
				}

				setState(239);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(T__11);
				setState(243);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(241);
					match(T__12);
					}
					break;
				case T__13:
				case T__40:
				case Identifier:
					{
					setState(242);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(245);
					match(T__10);
					setState(246);
					identifier();
					}
				}

				setState(249);
				match(T__13);
				setState(250);
				match(StringLiteral);
				setState(251);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				match(T__11);
				setState(253);
				match(T__14);
				setState(254);
				importDeclaration();
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(255);
					match(T__15);
					setState(256);
					importDeclaration();
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				match(T__16);
				setState(263);
				match(T__13);
				setState(264);
				match(StringLiteral);
				setState(265);
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
		public TerminalNode NatSpecSingleLine() { return getToken(CryplangParser.NatSpecSingleLine, 0); }
		public TerminalNode NatSpecMultiLine() { return getToken(CryplangParser.NatSpecMultiLine, 0); }
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
			setState(269);
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
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(271);
				natSpec();
				}
			}

			setState(274);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(275);
			identifier();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(276);
				match(T__20);
				setState(277);
				inheritanceSpecifier();
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(278);
					match(T__15);
					setState(279);
					inheritanceSpecifier();
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(287);
			match(T__14);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__23 - 14)) | (1L << (T__25 - 14)) | (1L << (T__26 - 14)) | (1L << (T__27 - 14)) | (1L << (T__28 - 14)) | (1L << (T__30 - 14)) | (1L << (T__31 - 14)) | (1L << (T__34 - 14)) | (1L << (T__36 - 14)) | (1L << (T__40 - 14)) | (1L << (T__65 - 14)) | (1L << (T__66 - 14)) | (1L << (T__67 - 14)) | (1L << (T__68 - 14)))) != 0) || ((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (NatSpecSingleLine - 108)) | (1L << (NatSpecMultiLine - 108)) | (1L << (Int - 108)) | (1L << (Uint - 108)) | (1L << (Byte - 108)) | (1L << (Fixed - 108)) | (1L << (Ufixed - 108)) | (1L << (Identifier - 108)))) != 0)) {
				{
				{
				setState(288);
				contractPart();
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
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
			setState(296);
			userDefinedTypeName();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(297);
				match(T__21);
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__13) | (1L << T__21) | (1L << T__32) | (1L << T__34) | (1L << T__40))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)) | (1L << (T__69 - 66)) | (1L << (T__70 - 66)) | (1L << (T__71 - 66)) | (1L << (T__72 - 66)) | (1L << (T__73 - 66)) | (1L << (T__74 - 66)) | (1L << (T__75 - 66)) | (1L << (T__76 - 66)) | (1L << (Int - 66)) | (1L << (Uint - 66)) | (1L << (Byte - 66)) | (1L << (Fixed - 66)) | (1L << (Ufixed - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (DecimalNumber - 66)) | (1L << (HexNumber - 66)) | (1L << (HexLiteral - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (TypeKeyword - 133)) | (1L << (Identifier - 133)) | (1L << (StringLiteral - 133)))) != 0)) {
					{
					setState(298);
					expressionList();
					}
				}

				setState(301);
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
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				stateVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				usingForDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				constructorDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(308);
				modifierDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(309);
				functionDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(310);
				eventDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(311);
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
		public List<TerminalNode> PublicKeyword() { return getTokens(CryplangParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(CryplangParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(CryplangParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(CryplangParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(CryplangParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(CryplangParser.PrivateKeyword, i);
		}
		public List<TerminalNode> ConstantKeyword() { return getTokens(CryplangParser.ConstantKeyword); }
		public TerminalNode ConstantKeyword(int i) {
			return getToken(CryplangParser.ConstantKeyword, i);
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
			setState(314);
			typeName(0);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & ((1L << (ConstantKeyword - 124)) | (1L << (InternalKeyword - 124)) | (1L << (PrivateKeyword - 124)) | (1L << (PublicKeyword - 124)))) != 0)) {
				{
				{
				setState(315);
				_la = _input.LA(1);
				if ( !(((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & ((1L << (ConstantKeyword - 124)) | (1L << (InternalKeyword - 124)) | (1L << (PrivateKeyword - 124)) | (1L << (PublicKeyword - 124)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321);
			identifier();
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(322);
				match(T__9);
				setState(323);
				expression(0);
				}
			}

			setState(326);
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
			setState(328);
			match(T__23);
			setState(329);
			identifier();
			setState(330);
			match(T__24);
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				{
				setState(331);
				match(T__12);
				}
				break;
			case T__13:
			case T__28:
			case T__34:
			case T__36:
			case T__40:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
				{
				setState(332);
				typeName(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(335);
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
			setState(337);
			match(T__25);
			setState(338);
			identifier();
			setState(339);
			match(T__14);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__28 - 14)) | (1L << (T__34 - 14)) | (1L << (T__36 - 14)) | (1L << (T__40 - 14)) | (1L << (T__65 - 14)) | (1L << (T__66 - 14)) | (1L << (T__67 - 14)) | (1L << (T__68 - 14)))) != 0) || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (Int - 110)) | (1L << (Uint - 110)) | (1L << (Byte - 110)) | (1L << (Fixed - 110)) | (1L << (Ufixed - 110)) | (1L << (Identifier - 110)))) != 0)) {
				{
				setState(340);
				variableDeclaration();
				setState(341);
				match(T__1);
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__28 - 14)) | (1L << (T__34 - 14)) | (1L << (T__36 - 14)) | (1L << (T__40 - 14)) | (1L << (T__65 - 14)) | (1L << (T__66 - 14)) | (1L << (T__67 - 14)) | (1L << (T__68 - 14)))) != 0) || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (Int - 110)) | (1L << (Uint - 110)) | (1L << (Byte - 110)) | (1L << (Fixed - 110)) | (1L << (Ufixed - 110)) | (1L << (Identifier - 110)))) != 0)) {
					{
					{
					setState(342);
					variableDeclaration();
					setState(343);
					match(T__1);
					}
					}
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(352);
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
			setState(354);
			match(T__26);
			setState(355);
			parameterList();
			setState(356);
			modifierList();
			setState(357);
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
			setState(359);
			match(T__27);
			setState(360);
			identifier();
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(361);
				parameterList();
				}
			}

			setState(364);
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
			setState(366);
			identifier();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(367);
				match(T__21);
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__13) | (1L << T__21) | (1L << T__32) | (1L << T__34) | (1L << T__40))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)) | (1L << (T__69 - 66)) | (1L << (T__70 - 66)) | (1L << (T__71 - 66)) | (1L << (T__72 - 66)) | (1L << (T__73 - 66)) | (1L << (T__74 - 66)) | (1L << (T__75 - 66)) | (1L << (T__76 - 66)) | (1L << (Int - 66)) | (1L << (Uint - 66)) | (1L << (Byte - 66)) | (1L << (Fixed - 66)) | (1L << (Ufixed - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (DecimalNumber - 66)) | (1L << (HexNumber - 66)) | (1L << (HexLiteral - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (TypeKeyword - 133)) | (1L << (Identifier - 133)) | (1L << (StringLiteral - 133)))) != 0)) {
					{
					setState(368);
					expressionList();
					}
				}

				setState(371);
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
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(374);
				natSpec();
				}
			}

			setState(377);
			match(T__28);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__40 || _la==Identifier) {
				{
				setState(378);
				identifier();
				}
			}

			setState(381);
			parameterList();
			setState(382);
			modifierList();
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(383);
				returnParameters();
				}
			}

			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(386);
				match(T__1);
				}
				break;
			case T__14:
				{
				setState(387);
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
			setState(390);
			match(T__29);
			setState(391);
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
		public List<TerminalNode> ExternalKeyword() { return getTokens(CryplangParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(CryplangParser.ExternalKeyword, i);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(CryplangParser.PublicKeyword); }
		public TerminalNode PublicKeyword(int i) {
			return getToken(CryplangParser.PublicKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(CryplangParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(CryplangParser.InternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(CryplangParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(CryplangParser.PrivateKeyword, i);
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
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13 || _la==T__40 || ((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & ((1L << (ConstantKeyword - 124)) | (1L << (ExternalKeyword - 124)) | (1L << (InternalKeyword - 124)) | (1L << (PayableKeyword - 124)) | (1L << (PrivateKeyword - 124)) | (1L << (PublicKeyword - 124)) | (1L << (PureKeyword - 124)) | (1L << (ViewKeyword - 124)) | (1L << (Identifier - 124)))) != 0)) {
				{
				setState(399);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__13:
				case T__40:
				case Identifier:
					{
					setState(393);
					modifierInvocation();
					}
					break;
				case ConstantKeyword:
				case PayableKeyword:
				case PureKeyword:
				case ViewKeyword:
					{
					setState(394);
					stateMutability();
					}
					break;
				case ExternalKeyword:
					{
					setState(395);
					match(ExternalKeyword);
					}
					break;
				case PublicKeyword:
					{
					setState(396);
					match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(397);
					match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(398);
					match(PrivateKeyword);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(403);
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
		public TerminalNode AnonymousKeyword() { return getToken(CryplangParser.AnonymousKeyword, 0); }
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
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(404);
				natSpec();
				}
			}

			setState(407);
			match(T__30);
			setState(408);
			identifier();
			setState(409);
			eventParameterList();
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(410);
				match(AnonymousKeyword);
				}
			}

			setState(413);
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
			setState(415);
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
			setState(417);
			match(T__31);
			setState(418);
			identifier();
			setState(419);
			match(T__14);
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__40 || _la==Identifier) {
				{
				setState(420);
				enumValue();
				}
			}

			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(423);
				match(T__15);
				setState(424);
				enumValue();
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(430);
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
			setState(432);
			match(T__21);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__28 - 14)) | (1L << (T__34 - 14)) | (1L << (T__36 - 14)) | (1L << (T__40 - 14)) | (1L << (T__65 - 14)) | (1L << (T__66 - 14)) | (1L << (T__67 - 14)) | (1L << (T__68 - 14)))) != 0) || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (Int - 110)) | (1L << (Uint - 110)) | (1L << (Byte - 110)) | (1L << (Fixed - 110)) | (1L << (Ufixed - 110)) | (1L << (Identifier - 110)))) != 0)) {
				{
				setState(433);
				parameter();
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(434);
					match(T__15);
					setState(435);
					parameter();
					}
					}
					setState(440);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(443);
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
			setState(445);
			typeName(0);
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(446);
				storageLocation();
				}
				break;
			}
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__40 || _la==Identifier) {
				{
				setState(449);
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
			setState(452);
			match(T__21);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__28 - 14)) | (1L << (T__34 - 14)) | (1L << (T__36 - 14)) | (1L << (T__40 - 14)) | (1L << (T__65 - 14)) | (1L << (T__66 - 14)) | (1L << (T__67 - 14)) | (1L << (T__68 - 14)))) != 0) || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (Int - 110)) | (1L << (Uint - 110)) | (1L << (Byte - 110)) | (1L << (Fixed - 110)) | (1L << (Ufixed - 110)) | (1L << (Identifier - 110)))) != 0)) {
				{
				setState(453);
				eventParameter();
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(454);
					match(T__15);
					setState(455);
					eventParameter();
					}
					}
					setState(460);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(463);
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
		public TerminalNode IndexedKeyword() { return getToken(CryplangParser.IndexedKeyword, 0); }
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
			setState(465);
			typeName(0);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(466);
				match(IndexedKeyword);
				}
			}

			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__40 || _la==Identifier) {
				{
				setState(469);
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
			setState(472);
			match(T__21);
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__28 - 14)) | (1L << (T__34 - 14)) | (1L << (T__36 - 14)) | (1L << (T__40 - 14)) | (1L << (T__65 - 14)) | (1L << (T__66 - 14)) | (1L << (T__67 - 14)) | (1L << (T__68 - 14)))) != 0) || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (Int - 110)) | (1L << (Uint - 110)) | (1L << (Byte - 110)) | (1L << (Fixed - 110)) | (1L << (Ufixed - 110)) | (1L << (Identifier - 110)))) != 0)) {
				{
				setState(473);
				functionTypeParameter();
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(474);
					match(T__15);
					setState(475);
					functionTypeParameter();
					}
					}
					setState(480);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(483);
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
			setState(485);
			typeName(0);
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) {
				{
				setState(486);
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
			setState(489);
			typeName(0);
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(490);
				storageLocation();
				}
				break;
			}
			setState(493);
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
		public TerminalNode PayableKeyword() { return getToken(CryplangParser.PayableKeyword, 0); }
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
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(496);
				elementaryTypeName();
				}
				break;
			case 2:
				{
				setState(497);
				userDefinedTypeName();
				}
				break;
			case 3:
				{
				setState(498);
				mapping();
				}
				break;
			case 4:
				{
				setState(499);
				functionTypeName();
				}
				break;
			case 5:
				{
				setState(500);
				match(T__34);
				setState(501);
				match(PayableKeyword);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(512);
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
					setState(504);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(505);
					match(T__32);
					setState(507);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__13) | (1L << T__21) | (1L << T__32) | (1L << T__34) | (1L << T__40))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)) | (1L << (T__69 - 66)) | (1L << (T__70 - 66)) | (1L << (T__71 - 66)) | (1L << (T__72 - 66)) | (1L << (T__73 - 66)) | (1L << (T__74 - 66)) | (1L << (T__75 - 66)) | (1L << (T__76 - 66)) | (1L << (Int - 66)) | (1L << (Uint - 66)) | (1L << (Byte - 66)) | (1L << (Fixed - 66)) | (1L << (Ufixed - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (DecimalNumber - 66)) | (1L << (HexNumber - 66)) | (1L << (HexLiteral - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (TypeKeyword - 133)) | (1L << (Identifier - 133)) | (1L << (StringLiteral - 133)))) != 0)) {
						{
						setState(506);
						expression(0);
						}
					}

					setState(509);
					match(T__33);
					}
					} 
				}
				setState(514);
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
			setState(515);
			identifier();
			setState(520);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(516);
					match(T__35);
					setState(517);
					identifier();
					}
					} 
				}
				setState(522);
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
			setState(523);
			match(T__36);
			setState(524);
			match(T__21);
			setState(525);
			elementaryTypeName();
			setState(526);
			match(T__37);
			setState(527);
			typeName(0);
			setState(528);
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
		public List<TerminalNode> InternalKeyword() { return getTokens(CryplangParser.InternalKeyword); }
		public TerminalNode InternalKeyword(int i) {
			return getToken(CryplangParser.InternalKeyword, i);
		}
		public List<TerminalNode> ExternalKeyword() { return getTokens(CryplangParser.ExternalKeyword); }
		public TerminalNode ExternalKeyword(int i) {
			return getToken(CryplangParser.ExternalKeyword, i);
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
			setState(530);
			match(T__28);
			setState(531);
			functionTypeParameterList();
			setState(537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(535);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case InternalKeyword:
						{
						setState(532);
						match(InternalKeyword);
						}
						break;
					case ExternalKeyword:
						{
						setState(533);
						match(ExternalKeyword);
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(534);
						stateMutability();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(540);
				match(T__29);
				setState(541);
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
			setState(544);
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
		public TerminalNode PureKeyword() { return getToken(CryplangParser.PureKeyword, 0); }
		public TerminalNode ConstantKeyword() { return getToken(CryplangParser.ConstantKeyword, 0); }
		public TerminalNode ViewKeyword() { return getToken(CryplangParser.ViewKeyword, 0); }
		public TerminalNode PayableKeyword() { return getToken(CryplangParser.PayableKeyword, 0); }
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
			setState(546);
			_la = _input.LA(1);
			if ( !(((((_la - 124)) & ~0x3f) == 0 && ((1L << (_la - 124)) & ((1L << (ConstantKeyword - 124)) | (1L << (PayableKeyword - 124)) | (1L << (PureKeyword - 124)) | (1L << (ViewKeyword - 124)))) != 0)) ) {
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
			setState(548);
			match(T__14);
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__13) | (1L << T__14) | (1L << T__21) | (1L << T__24) | (1L << T__28) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__40) | (1L << T__41) | (1L << T__57) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (Int - 64)) | (1L << (Uint - 64)) | (1L << (Byte - 64)) | (1L << (Fixed - 64)) | (1L << (Ufixed - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (BreakKeyword - 64)) | (1L << (ContinueKeyword - 64)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (TypeKeyword - 133)) | (1L << (Identifier - 133)) | (1L << (StringLiteral - 133)))) != 0)) {
				{
				{
				setState(549);
				statement();
				}
				}
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(555);
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
		public CryptoStatementContext cryptoStatement() {
			return getRuleContext(CryptoStatementContext.class,0);
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
			setState(570);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__57:
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				ifStatement();
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				whileStatement();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(559);
				forStatement();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(560);
				block();
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 5);
				{
				setState(561);
				inlineAssemblyStatement();
				}
				break;
			case T__61:
				enterOuterAlt(_localctx, 6);
				{
				setState(562);
				doWhileStatement();
				}
				break;
			case ContinueKeyword:
				enterOuterAlt(_localctx, 7);
				{
				setState(563);
				continueStatement();
				}
				break;
			case BreakKeyword:
				enterOuterAlt(_localctx, 8);
				{
				setState(564);
				breakStatement();
				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 9);
				{
				setState(565);
				returnStatement();
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 10);
				{
				setState(566);
				throwStatement();
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 11);
				{
				setState(567);
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
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
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
				setState(568);
				simpleStatement();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 13);
				{
				setState(569);
				cryptoStatement();
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
			setState(572);
			expression(0);
			setState(573);
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
			setState(575);
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
			setState(577);
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
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__42) {
				{
				setState(579);
				privateSymbol();
				}
			}

			setState(582);
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
			setState(590);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(585);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__40) | (1L << T__42))) != 0) || _la==Identifier) {
						{
						setState(584);
						privateIdentifier();
						}
					}

					setState(587);
					match(T__15);
					}
					} 
				}
				setState(592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__40) | (1L << T__42))) != 0) || _la==Identifier) {
				{
				setState(593);
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
			setState(596);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46))) != 0)) ) {
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
			setState(598);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0)) ) {
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
			setState(600);
			_la = _input.LA(1);
			if ( !(_la==T__51 || _la==T__52) ) {
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
			setState(602);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__53) | (1L << T__54) | (1L << T__55))) != 0)) ) {
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

	public static class CryptoStatementContext extends ParserRuleContext {
		public SignatureStatementContext signatureStatement() {
			return getRuleContext(SignatureStatementContext.class,0);
		}
		public ProofStatementContext proofStatement() {
			return getRuleContext(ProofStatementContext.class,0);
		}
		public CryptoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cryptoStatement; }
	}

	public final CryptoStatementContext cryptoStatement() throws RecognitionException {
		CryptoStatementContext _localctx = new CryptoStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_cryptoStatement);
		try {
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				signatureStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(605);
				proofStatement();
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

	public static class SignatureStatementContext extends ParserRuleContext {
		public StatementSymbolContext statementSymbol() {
			return getRuleContext(StatementSymbolContext.class,0);
		}
		public SignatureMethodContext signatureMethod() {
			return getRuleContext(SignatureMethodContext.class,0);
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
		enterRule(_localctx, 100, RULE_signatureStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			statementSymbol();
			setState(609);
			match(T__21);
			setState(610);
			signatureMethod();
			setState(611);
			match(T__15);
			setState(618);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(613);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__13 || _la==T__40 || _la==Identifier) {
						{
						setState(612);
						identifier();
						}
					}

					setState(615);
					match(T__15);
					}
					} 
				}
				setState(620);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__40 || _la==Identifier) {
				{
				setState(621);
				identifier();
				}
			}

			setState(624);
			match(T__15);
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__21 - 14)) | (1L << (T__32 - 14)) | (1L << (T__34 - 14)) | (1L << (T__40 - 14)) | (1L << (T__65 - 14)) | (1L << (T__66 - 14)) | (1L << (T__67 - 14)) | (1L << (T__68 - 14)))) != 0) || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (Int - 110)) | (1L << (Uint - 110)) | (1L << (Byte - 110)) | (1L << (Fixed - 110)) | (1L << (Ufixed - 110)) | (1L << (BooleanLiteral - 110)) | (1L << (DecimalNumber - 110)) | (1L << (HexNumber - 110)) | (1L << (HexLiteral - 110)) | (1L << (TypeKeyword - 110)) | (1L << (Identifier - 110)) | (1L << (StringLiteral - 110)))) != 0)) {
				{
				setState(625);
				primaryExpression();
				}
			}

			setState(628);
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
		enterRule(_localctx, 102, RULE_commitmentStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			statementSymbol();
			setState(631);
			match(T__21);
			setState(632);
			commitmentMethod();
			setState(633);
			match(T__15);
			setState(640);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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
		public PrivateIdentifierListContext privateIdentifierList() {
			return getRuleContext(PrivateIdentifierListContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ProofStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proofStatement; }
	}

	public final ProofStatementContext proofStatement() throws RecognitionException {
		ProofStatementContext _localctx = new ProofStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_proofStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			statementSymbol();
			setState(649);
			match(T__21);
			setState(650);
			proofMethod();
			setState(651);
			match(T__15);
			setState(652);
			privateIdentifierList();
			setState(653);
			match(T__15);
			setState(654);
			primaryExpression();
			setState(655);
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
		public HashMethodContext hashMethod() {
			return getRuleContext(HashMethodContext.class,0);
		}
		public TaskStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_taskStatement; }
	}

	public final TaskStatementContext taskStatement() throws RecognitionException {
		TaskStatementContext _localctx = new TaskStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_taskStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(657);
				signatureStatement();
				}
				break;
			case 2:
				{
				setState(658);
				commitmentStatement();
				}
				break;
			case 3:
				{
				setState(659);
				proofStatement();
				}
				break;
			}
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__56) {
				{
				setState(662);
				match(T__56);
				setState(663);
				hashMethod();
				}
			}

			setState(666);
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
		enterRule(_localctx, 108, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(T__57);
			setState(669);
			match(T__21);
			setState(670);
			expression(0);
			setState(671);
			match(T__22);
			setState(672);
			statement();
			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(673);
				match(T__58);
				setState(674);
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
		enterRule(_localctx, 110, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			match(T__59);
			setState(678);
			match(T__21);
			setState(679);
			expression(0);
			setState(680);
			match(T__22);
			setState(681);
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
		enterRule(_localctx, 112, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(683);
				variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(684);
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
		enterRule(_localctx, 114, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(T__24);
			setState(688);
			match(T__21);
			setState(691);
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
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
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
				setState(689);
				simpleStatement();
				}
				break;
			case T__1:
				{
				setState(690);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(695);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__13:
			case T__21:
			case T__32:
			case T__34:
			case T__40:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
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
				setState(693);
				expressionStatement();
				}
				break;
			case T__1:
				{
				setState(694);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__13) | (1L << T__21) | (1L << T__32) | (1L << T__34) | (1L << T__40))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)) | (1L << (T__69 - 66)) | (1L << (T__70 - 66)) | (1L << (T__71 - 66)) | (1L << (T__72 - 66)) | (1L << (T__73 - 66)) | (1L << (T__74 - 66)) | (1L << (T__75 - 66)) | (1L << (T__76 - 66)) | (1L << (Int - 66)) | (1L << (Uint - 66)) | (1L << (Byte - 66)) | (1L << (Fixed - 66)) | (1L << (Ufixed - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (DecimalNumber - 66)) | (1L << (HexNumber - 66)) | (1L << (HexLiteral - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (TypeKeyword - 133)) | (1L << (Identifier - 133)) | (1L << (StringLiteral - 133)))) != 0)) {
				{
				setState(697);
				expression(0);
				}
			}

			setState(700);
			match(T__22);
			setState(701);
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
		public TerminalNode StringLiteral() { return getToken(CryplangParser.StringLiteral, 0); }
		public InlineAssemblyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineAssemblyStatement; }
	}

	public final InlineAssemblyStatementContext inlineAssemblyStatement() throws RecognitionException {
		InlineAssemblyStatementContext _localctx = new InlineAssemblyStatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_inlineAssemblyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(T__60);
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(704);
				match(StringLiteral);
				}
			}

			setState(707);
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
		enterRule(_localctx, 118, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(T__61);
			setState(710);
			statement();
			setState(711);
			match(T__59);
			setState(712);
			match(T__21);
			setState(713);
			expression(0);
			setState(714);
			match(T__22);
			setState(715);
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
		public TerminalNode ContinueKeyword() { return getToken(CryplangParser.ContinueKeyword, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			match(ContinueKeyword);
			setState(718);
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
		public TerminalNode BreakKeyword() { return getToken(CryplangParser.BreakKeyword, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			match(BreakKeyword);
			setState(721);
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
		enterRule(_localctx, 124, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(T__62);
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__13) | (1L << T__21) | (1L << T__32) | (1L << T__34) | (1L << T__40))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)) | (1L << (T__69 - 66)) | (1L << (T__70 - 66)) | (1L << (T__71 - 66)) | (1L << (T__72 - 66)) | (1L << (T__73 - 66)) | (1L << (T__74 - 66)) | (1L << (T__75 - 66)) | (1L << (T__76 - 66)) | (1L << (Int - 66)) | (1L << (Uint - 66)) | (1L << (Byte - 66)) | (1L << (Fixed - 66)) | (1L << (Ufixed - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (DecimalNumber - 66)) | (1L << (HexNumber - 66)) | (1L << (HexLiteral - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (TypeKeyword - 133)) | (1L << (Identifier - 133)) | (1L << (StringLiteral - 133)))) != 0)) {
				{
				setState(724);
				expression(0);
				}
			}

			setState(727);
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
		enterRule(_localctx, 126, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(T__63);
			setState(730);
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
		enterRule(_localctx, 128, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(T__64);
			setState(733);
			functionCall();
			setState(734);
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
		enterRule(_localctx, 130, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(736);
				match(T__65);
				setState(737);
				identifierList();
				}
				break;
			case 2:
				{
				setState(738);
				variableDeclaration();
				}
				break;
			case 3:
				{
				setState(739);
				match(T__21);
				setState(740);
				variableDeclarationList();
				setState(741);
				match(T__22);
				}
				break;
			}
			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(745);
				match(T__9);
				setState(746);
				expression(0);
				}
			}

			setState(749);
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
		enterRule(_localctx, 132, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__28 - 14)) | (1L << (T__34 - 14)) | (1L << (T__36 - 14)) | (1L << (T__40 - 14)) | (1L << (T__65 - 14)) | (1L << (T__66 - 14)) | (1L << (T__67 - 14)) | (1L << (T__68 - 14)))) != 0) || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (Int - 110)) | (1L << (Uint - 110)) | (1L << (Byte - 110)) | (1L << (Fixed - 110)) | (1L << (Ufixed - 110)) | (1L << (Identifier - 110)))) != 0)) {
				{
				setState(751);
				variableDeclaration();
				}
			}

			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(754);
				match(T__15);
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__28 - 14)) | (1L << (T__34 - 14)) | (1L << (T__36 - 14)) | (1L << (T__40 - 14)) | (1L << (T__65 - 14)) | (1L << (T__66 - 14)) | (1L << (T__67 - 14)) | (1L << (T__68 - 14)))) != 0) || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (Int - 110)) | (1L << (Uint - 110)) | (1L << (Byte - 110)) | (1L << (Fixed - 110)) | (1L << (Ufixed - 110)) | (1L << (Identifier - 110)))) != 0)) {
					{
					setState(755);
					variableDeclaration();
					}
				}

				}
				}
				setState(762);
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
		enterRule(_localctx, 134, RULE_identifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			match(T__21);
			setState(770);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(765);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__13 || _la==T__40 || _la==Identifier) {
						{
						setState(764);
						identifier();
						}
					}

					setState(767);
					match(T__15);
					}
					} 
				}
				setState(772);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__40 || _la==Identifier) {
				{
				setState(773);
				identifier();
				}
			}

			setState(776);
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
		public TerminalNode Int() { return getToken(CryplangParser.Int, 0); }
		public TerminalNode Uint() { return getToken(CryplangParser.Uint, 0); }
		public TerminalNode Byte() { return getToken(CryplangParser.Byte, 0); }
		public TerminalNode Fixed() { return getToken(CryplangParser.Fixed, 0); }
		public TerminalNode Ufixed() { return getToken(CryplangParser.Ufixed, 0); }
		public ElementaryTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementaryTypeName; }
	}

	public final ElementaryTypeNameContext elementaryTypeName() throws RecognitionException {
		ElementaryTypeNameContext _localctx = new ElementaryTypeNameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_elementaryTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			_la = _input.LA(1);
			if ( !(_la==T__34 || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)) | (1L << (Int - 66)) | (1L << (Uint - 66)) | (1L << (Byte - 66)) | (1L << (Fixed - 66)) | (1L << (Ufixed - 66)))) != 0)) ) {
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
		int _startState = 138;
		enterRecursionRule(_localctx, 138, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(781);
				match(T__71);
				setState(782);
				typeName(0);
				}
				break;
			case 2:
				{
				setState(783);
				match(T__21);
				setState(784);
				expression(0);
				setState(785);
				match(T__22);
				}
				break;
			case 3:
				{
				setState(787);
				_la = _input.LA(1);
				if ( !(_la==T__69 || _la==T__70) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(788);
				expression(19);
				}
				break;
			case 4:
				{
				setState(789);
				_la = _input.LA(1);
				if ( !(_la==T__72 || _la==T__73) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(790);
				expression(18);
				}
				break;
			case 5:
				{
				setState(791);
				_la = _input.LA(1);
				if ( !(_la==T__74 || _la==T__75) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(792);
				expression(17);
				}
				break;
			case 6:
				{
				setState(793);
				match(T__76);
				setState(794);
				expression(16);
				}
				break;
			case 7:
				{
				setState(795);
				match(T__4);
				setState(796);
				expression(15);
				}
				break;
			case 8:
				{
				setState(797);
				primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(859);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(857);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(800);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(801);
						match(T__77);
						setState(802);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(803);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(804);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==T__78 || _la==T__79) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(805);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(806);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(807);
						_la = _input.LA(1);
						if ( !(_la==T__72 || _la==T__73) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(808);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(809);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(810);
						_la = _input.LA(1);
						if ( !(_la==T__80 || _la==T__81) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(811);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(812);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(813);
						match(T__82);
						setState(814);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(815);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(816);
						match(T__3);
						setState(817);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(818);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(819);
						match(T__83);
						setState(820);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(821);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(822);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(823);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(824);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(825);
						_la = _input.LA(1);
						if ( !(_la==T__84 || _la==T__85) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(826);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(827);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(828);
						match(T__86);
						setState(829);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(830);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(831);
						match(T__87);
						setState(832);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(833);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(834);
						match(T__88);
						setState(835);
						expression(0);
						setState(836);
						match(T__89);
						setState(837);
						expression(4);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(839);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(840);
						_la = _input.LA(1);
						if ( !(_la==T__9 || ((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & ((1L << (T__90 - 91)) | (1L << (T__91 - 91)) | (1L << (T__92 - 91)) | (1L << (T__93 - 91)) | (1L << (T__94 - 91)) | (1L << (T__95 - 91)) | (1L << (T__96 - 91)) | (1L << (T__97 - 91)) | (1L << (T__98 - 91)) | (1L << (T__99 - 91)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(841);
						expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(842);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(843);
						_la = _input.LA(1);
						if ( !(_la==T__69 || _la==T__70) ) {
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
						setState(844);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(845);
						match(T__32);
						setState(846);
						expression(0);
						setState(847);
						match(T__33);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(849);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(850);
						match(T__21);
						setState(851);
						functionCallArguments();
						setState(852);
						match(T__22);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(854);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(855);
						match(T__35);
						setState(856);
						identifier();
						}
						break;
					}
					} 
				}
				setState(861);
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
		public TerminalNode BooleanLiteral() { return getToken(CryplangParser.BooleanLiteral, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode HexLiteral() { return getToken(CryplangParser.HexLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(CryplangParser.StringLiteral, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TypeKeyword() { return getToken(CryplangParser.TypeKeyword, 0); }
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
		enterRule(_localctx, 140, RULE_primaryExpression);
		try {
			setState(878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(862);
				match(BooleanLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(863);
				numberLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(864);
				match(HexLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(865);
				match(StringLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(866);
				identifier();
				setState(869);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(867);
					match(T__32);
					setState(868);
					match(T__33);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(871);
				match(TypeKeyword);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(872);
				tupleExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(873);
				typeNameExpression();
				setState(876);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(874);
					match(T__32);
					setState(875);
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
		enterRule(_localctx, 142, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			expression(0);
			setState(885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(881);
				match(T__15);
				setState(882);
				expression(0);
				}
				}
				setState(887);
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
		enterRule(_localctx, 144, RULE_nameValueList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			nameValue();
			setState(893);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(889);
					match(T__15);
					setState(890);
					nameValue();
					}
					} 
				}
				setState(895);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			}
			setState(897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(896);
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
		enterRule(_localctx, 146, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			identifier();
			setState(900);
			match(T__89);
			setState(901);
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
		enterRule(_localctx, 148, RULE_functionCallArguments);
		int _la;
		try {
			setState(911);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(903);
				match(T__14);
				setState(905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13 || _la==T__40 || _la==Identifier) {
					{
					setState(904);
					nameValueList();
					}
				}

				setState(907);
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
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
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
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__13) | (1L << T__21) | (1L << T__32) | (1L << T__34) | (1L << T__40))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)) | (1L << (T__69 - 66)) | (1L << (T__70 - 66)) | (1L << (T__71 - 66)) | (1L << (T__72 - 66)) | (1L << (T__73 - 66)) | (1L << (T__74 - 66)) | (1L << (T__75 - 66)) | (1L << (T__76 - 66)) | (1L << (Int - 66)) | (1L << (Uint - 66)) | (1L << (Byte - 66)) | (1L << (Fixed - 66)) | (1L << (Ufixed - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (DecimalNumber - 66)) | (1L << (HexNumber - 66)) | (1L << (HexLiteral - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (TypeKeyword - 133)) | (1L << (Identifier - 133)) | (1L << (StringLiteral - 133)))) != 0)) {
					{
					setState(908);
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
		enterRule(_localctx, 150, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913);
			expression(0);
			setState(914);
			match(T__21);
			setState(915);
			functionCallArguments();
			setState(916);
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
		enterRule(_localctx, 152, RULE_assemblyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			match(T__14);
			setState(922);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__14 - 14)) | (1L << (T__21 - 14)) | (1L << (T__24 - 14)) | (1L << (T__28 - 14)) | (1L << (T__34 - 14)) | (1L << (T__40 - 14)) | (1L << (T__57 - 14)) | (1L << (T__60 - 14)) | (1L << (T__62 - 14)) | (1L << (T__68 - 14)))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (T__100 - 101)) | (1L << (T__102 - 101)) | (1L << (T__103 - 101)) | (1L << (DecimalNumber - 101)) | (1L << (HexNumber - 101)) | (1L << (HexLiteral - 101)) | (1L << (BreakKeyword - 101)) | (1L << (ContinueKeyword - 101)) | (1L << (Identifier - 101)) | (1L << (StringLiteral - 101)))) != 0)) {
				{
				{
				setState(919);
				assemblyItem();
				}
				}
				setState(924);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(925);
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
		public TerminalNode BreakKeyword() { return getToken(CryplangParser.BreakKeyword, 0); }
		public TerminalNode ContinueKeyword() { return getToken(CryplangParser.ContinueKeyword, 0); }
		public SubAssemblyContext subAssembly() {
			return getRuleContext(SubAssemblyContext.class,0);
		}
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(CryplangParser.StringLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(CryplangParser.HexLiteral, 0); }
		public AssemblyItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyItem; }
	}

	public final AssemblyItemContext assemblyItem() throws RecognitionException {
		AssemblyItemContext _localctx = new AssemblyItemContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_assemblyItem);
		try {
			setState(944);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(927);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(928);
				assemblyBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(929);
				assemblyExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(930);
				assemblyLocalDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(931);
				assemblyAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(932);
				assemblyStackAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(933);
				labelDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(934);
				assemblySwitch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(935);
				assemblyFunctionDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(936);
				assemblyFor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(937);
				assemblyIf();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(938);
				match(BreakKeyword);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(939);
				match(ContinueKeyword);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(940);
				subAssembly();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(941);
				numberLiteral();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(942);
				match(StringLiteral);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(943);
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
		enterRule(_localctx, 156, RULE_assemblyExpression);
		try {
			setState(948);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__34:
			case T__40:
			case T__62:
			case T__68:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(946);
				assemblyCall();
				}
				break;
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(947);
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
		enterRule(_localctx, 158, RULE_assemblyCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__62:
				{
				setState(950);
				match(T__62);
				}
				break;
			case T__34:
				{
				setState(951);
				match(T__34);
				}
				break;
			case T__68:
				{
				setState(952);
				match(T__68);
				}
				break;
			case T__13:
			case T__40:
			case Identifier:
				{
				setState(953);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(968);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(956);
				match(T__21);
				setState(958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (T__13 - 14)) | (1L << (T__34 - 14)) | (1L << (T__40 - 14)) | (1L << (T__62 - 14)) | (1L << (T__68 - 14)))) != 0) || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (DecimalNumber - 117)) | (1L << (HexNumber - 117)) | (1L << (HexLiteral - 117)) | (1L << (Identifier - 117)) | (1L << (StringLiteral - 117)))) != 0)) {
					{
					setState(957);
					assemblyExpression();
					}
				}

				setState(964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(960);
					match(T__15);
					setState(961);
					assemblyExpression();
					}
					}
					setState(966);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(967);
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
		enterRule(_localctx, 160, RULE_assemblyLocalDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			match(T__100);
			setState(971);
			assemblyIdentifierOrList();
			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__101) {
				{
				setState(972);
				match(T__101);
				setState(973);
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
		enterRule(_localctx, 162, RULE_assemblyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			assemblyIdentifierOrList();
			setState(977);
			match(T__101);
			setState(978);
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
		enterRule(_localctx, 164, RULE_assemblyIdentifierOrList);
		try {
			setState(985);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__40:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(980);
				identifier();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(981);
				match(T__21);
				setState(982);
				assemblyIdentifierList();
				setState(983);
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
		enterRule(_localctx, 166, RULE_assemblyIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			identifier();
			setState(992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(988);
				match(T__15);
				setState(989);
				identifier();
				}
				}
				setState(994);
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
		enterRule(_localctx, 168, RULE_assemblyStackAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			match(T__102);
			setState(996);
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
		enterRule(_localctx, 170, RULE_labelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			identifier();
			setState(999);
			match(T__89);
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
		enterRule(_localctx, 172, RULE_assemblySwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			match(T__103);
			setState(1002);
			assemblyExpression();
			setState(1006);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__104 || _la==T__105) {
				{
				{
				setState(1003);
				assemblyCase();
				}
				}
				setState(1008);
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
		enterRule(_localctx, 174, RULE_assemblyCase);
		try {
			setState(1015);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__104:
				enterOuterAlt(_localctx, 1);
				{
				setState(1009);
				match(T__104);
				setState(1010);
				assemblyLiteral();
				setState(1011);
				assemblyBlock();
				}
				break;
			case T__105:
				enterOuterAlt(_localctx, 2);
				{
				setState(1013);
				match(T__105);
				setState(1014);
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
		enterRule(_localctx, 176, RULE_assemblyFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			match(T__28);
			setState(1018);
			identifier();
			setState(1019);
			match(T__21);
			setState(1021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__40 || _la==Identifier) {
				{
				setState(1020);
				assemblyIdentifierList();
				}
			}

			setState(1023);
			match(T__22);
			setState(1025);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__106) {
				{
				setState(1024);
				assemblyFunctionReturns();
				}
			}

			setState(1027);
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
		enterRule(_localctx, 178, RULE_assemblyFunctionReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1029);
			match(T__106);
			setState(1030);
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
		enterRule(_localctx, 180, RULE_assemblyFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			match(T__24);
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
			case T__62:
			case T__68:
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
			assemblyExpression();
			setState(1040);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(1038);
				assemblyBlock();
				}
				break;
			case T__13:
			case T__34:
			case T__40:
			case T__62:
			case T__68:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(1039);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1042);
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
		enterRule(_localctx, 182, RULE_assemblyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1044);
			match(T__57);
			setState(1045);
			assemblyExpression();
			setState(1046);
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
		public TerminalNode StringLiteral() { return getToken(CryplangParser.StringLiteral, 0); }
		public TerminalNode DecimalNumber() { return getToken(CryplangParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(CryplangParser.HexNumber, 0); }
		public TerminalNode HexLiteral() { return getToken(CryplangParser.HexLiteral, 0); }
		public AssemblyLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLiteral; }
	}

	public final AssemblyLiteralContext assemblyLiteral() throws RecognitionException {
		AssemblyLiteralContext _localctx = new AssemblyLiteralContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_assemblyLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			_la = _input.LA(1);
			if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (DecimalNumber - 117)) | (1L << (HexNumber - 117)) | (1L << (HexLiteral - 117)) | (1L << (StringLiteral - 117)))) != 0)) ) {
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
		enterRule(_localctx, 186, RULE_subAssembly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			match(T__60);
			setState(1051);
			identifier();
			setState(1052);
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
		enterRule(_localctx, 188, RULE_tupleExpression);
		int _la;
		try {
			setState(1080);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(1054);
				match(T__21);
				{
				setState(1056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__13) | (1L << T__21) | (1L << T__32) | (1L << T__34) | (1L << T__40))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)) | (1L << (T__69 - 66)) | (1L << (T__70 - 66)) | (1L << (T__71 - 66)) | (1L << (T__72 - 66)) | (1L << (T__73 - 66)) | (1L << (T__74 - 66)) | (1L << (T__75 - 66)) | (1L << (T__76 - 66)) | (1L << (Int - 66)) | (1L << (Uint - 66)) | (1L << (Byte - 66)) | (1L << (Fixed - 66)) | (1L << (Ufixed - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (DecimalNumber - 66)) | (1L << (HexNumber - 66)) | (1L << (HexLiteral - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (TypeKeyword - 133)) | (1L << (Identifier - 133)) | (1L << (StringLiteral - 133)))) != 0)) {
					{
					setState(1055);
					expression(0);
					}
				}

				setState(1064);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(1058);
					match(T__15);
					setState(1060);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__13) | (1L << T__21) | (1L << T__32) | (1L << T__34) | (1L << T__40))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)) | (1L << (T__69 - 66)) | (1L << (T__70 - 66)) | (1L << (T__71 - 66)) | (1L << (T__72 - 66)) | (1L << (T__73 - 66)) | (1L << (T__74 - 66)) | (1L << (T__75 - 66)) | (1L << (T__76 - 66)) | (1L << (Int - 66)) | (1L << (Uint - 66)) | (1L << (Byte - 66)) | (1L << (Fixed - 66)) | (1L << (Ufixed - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (DecimalNumber - 66)) | (1L << (HexNumber - 66)) | (1L << (HexLiteral - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (TypeKeyword - 133)) | (1L << (Identifier - 133)) | (1L << (StringLiteral - 133)))) != 0)) {
						{
						setState(1059);
						expression(0);
						}
					}

					}
					}
					setState(1066);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1067);
				match(T__22);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(1068);
				match(T__32);
				setState(1077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__13) | (1L << T__21) | (1L << T__32) | (1L << T__34) | (1L << T__40))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)) | (1L << (T__69 - 66)) | (1L << (T__70 - 66)) | (1L << (T__71 - 66)) | (1L << (T__72 - 66)) | (1L << (T__73 - 66)) | (1L << (T__74 - 66)) | (1L << (T__75 - 66)) | (1L << (T__76 - 66)) | (1L << (Int - 66)) | (1L << (Uint - 66)) | (1L << (Byte - 66)) | (1L << (Fixed - 66)) | (1L << (Ufixed - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (DecimalNumber - 66)) | (1L << (HexNumber - 66)) | (1L << (HexLiteral - 66)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (TypeKeyword - 133)) | (1L << (Identifier - 133)) | (1L << (StringLiteral - 133)))) != 0)) {
					{
					setState(1069);
					expression(0);
					setState(1074);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__15) {
						{
						{
						setState(1070);
						match(T__15);
						setState(1071);
						expression(0);
						}
						}
						setState(1076);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1079);
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
		enterRule(_localctx, 190, RULE_typeNameExpression);
		try {
			setState(1084);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				enterOuterAlt(_localctx, 1);
				{
				setState(1082);
				elementaryTypeName();
				}
				break;
			case T__13:
			case T__40:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1083);
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
		public TerminalNode DecimalNumber() { return getToken(CryplangParser.DecimalNumber, 0); }
		public TerminalNode HexNumber() { return getToken(CryplangParser.HexNumber, 0); }
		public TerminalNode NumberUnit() { return getToken(CryplangParser.NumberUnit, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1086);
			_la = _input.LA(1);
			if ( !(_la==DecimalNumber || _la==HexNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1088);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1087);
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
		public TerminalNode Identifier() { return getToken(CryplangParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1090);
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
		case 69:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u008d\u0447\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\3\2\3\2\3\2\7\2\u00ca\n\2\f\2\16\2\u00cd\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\5\5\u00da\n\5\3\6\3\6\5\6\u00de"+
		"\n\6\3\7\3\7\3\b\5\b\u00e3\n\b\3\b\3\b\3\t\3\t\3\t\5\t\u00ea\n\t\3\n\3"+
		"\n\3\n\3\n\5\n\u00f0\n\n\3\n\3\n\3\n\3\n\5\n\u00f6\n\n\3\n\3\n\5\n\u00fa"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0104\n\n\f\n\16\n\u0107\13\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u010e\n\n\3\13\3\13\3\f\5\f\u0113\n\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\7\f\u011b\n\f\f\f\16\f\u011e\13\f\5\f\u0120\n\f\3\f\3"+
		"\f\7\f\u0124\n\f\f\f\16\f\u0127\13\f\3\f\3\f\3\r\3\r\3\r\5\r\u012e\n\r"+
		"\3\r\5\r\u0131\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u013b"+
		"\n\16\3\17\3\17\7\17\u013f\n\17\f\17\16\17\u0142\13\17\3\17\3\17\3\17"+
		"\5\17\u0147\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u0150\n\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u015c\n\21\f\21"+
		"\16\21\u015f\13\21\5\21\u0161\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\5\23\u016d\n\23\3\23\3\23\3\24\3\24\3\24\5\24\u0174\n"+
		"\24\3\24\5\24\u0177\n\24\3\25\5\25\u017a\n\25\3\25\3\25\5\25\u017e\n\25"+
		"\3\25\3\25\3\25\5\25\u0183\n\25\3\25\3\25\5\25\u0187\n\25\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0192\n\27\f\27\16\27\u0195\13"+
		"\27\3\30\5\30\u0198\n\30\3\30\3\30\3\30\3\30\5\30\u019e\n\30\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u01a8\n\32\3\32\3\32\7\32\u01ac\n"+
		"\32\f\32\16\32\u01af\13\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u01b7\n"+
		"\33\f\33\16\33\u01ba\13\33\5\33\u01bc\n\33\3\33\3\33\3\34\3\34\5\34\u01c2"+
		"\n\34\3\34\5\34\u01c5\n\34\3\35\3\35\3\35\3\35\7\35\u01cb\n\35\f\35\16"+
		"\35\u01ce\13\35\5\35\u01d0\n\35\3\35\3\35\3\36\3\36\5\36\u01d6\n\36\3"+
		"\36\5\36\u01d9\n\36\3\37\3\37\3\37\3\37\7\37\u01df\n\37\f\37\16\37\u01e2"+
		"\13\37\5\37\u01e4\n\37\3\37\3\37\3 \3 \5 \u01ea\n \3!\3!\5!\u01ee\n!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01f9\n\"\3\"\3\"\3\"\5\"\u01fe\n"+
		"\"\3\"\7\"\u0201\n\"\f\"\16\"\u0204\13\"\3#\3#\3#\7#\u0209\n#\f#\16#\u020c"+
		"\13#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\7%\u021a\n%\f%\16%\u021d\13%"+
		"\3%\3%\5%\u0221\n%\3&\3&\3\'\3\'\3(\3(\7(\u0229\n(\f(\16(\u022c\13(\3"+
		"(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u023d\n)\3*\3*\3*\3+\3"+
		"+\3,\3,\3-\5-\u0247\n-\3-\3-\3.\5.\u024c\n.\3.\7.\u024f\n.\f.\16.\u0252"+
		"\13.\3.\5.\u0255\n.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\5\63"+
		"\u0261\n\63\3\64\3\64\3\64\3\64\3\64\5\64\u0268\n\64\3\64\7\64\u026b\n"+
		"\64\f\64\16\64\u026e\13\64\3\64\5\64\u0271\n\64\3\64\3\64\5\64\u0275\n"+
		"\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\5\65\u027e\n\65\3\65\7\65\u0281"+
		"\n\65\f\65\16\65\u0284\13\65\3\65\5\65\u0287\n\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\5\67\u0297\n\67\3\67"+
		"\3\67\5\67\u029b\n\67\3\67\3\67\38\38\38\38\38\38\38\58\u02a6\n8\39\3"+
		"9\39\39\39\39\3:\3:\5:\u02b0\n:\3;\3;\3;\3;\5;\u02b6\n;\3;\3;\5;\u02ba"+
		"\n;\3;\5;\u02bd\n;\3;\3;\3;\3<\3<\5<\u02c4\n<\3<\3<\3=\3=\3=\3=\3=\3="+
		"\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\5@\u02d8\n@\3@\3@\3A\3A\3A\3B\3B\3B\3B"+
		"\3C\3C\3C\3C\3C\3C\3C\5C\u02ea\nC\3C\3C\5C\u02ee\nC\3C\3C\3D\5D\u02f3"+
		"\nD\3D\3D\5D\u02f7\nD\7D\u02f9\nD\fD\16D\u02fc\13D\3E\3E\5E\u0300\nE\3"+
		"E\7E\u0303\nE\fE\16E\u0306\13E\3E\5E\u0309\nE\3E\3E\3F\3F\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u0321\nG\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\7G\u035c\nG\fG\16G\u035f\13G\3H\3H\3H\3H\3H\3H\3H\5"+
		"H\u0368\nH\3H\3H\3H\3H\3H\5H\u036f\nH\5H\u0371\nH\3I\3I\3I\7I\u0376\n"+
		"I\fI\16I\u0379\13I\3J\3J\3J\7J\u037e\nJ\fJ\16J\u0381\13J\3J\5J\u0384\n"+
		"J\3K\3K\3K\3K\3L\3L\5L\u038c\nL\3L\3L\5L\u0390\nL\5L\u0392\nL\3M\3M\3"+
		"M\3M\3M\3N\3N\7N\u039b\nN\fN\16N\u039e\13N\3N\3N\3O\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u03b3\nO\3P\3P\5P\u03b7\nP\3Q\3Q\3Q"+
		"\3Q\5Q\u03bd\nQ\3Q\3Q\5Q\u03c1\nQ\3Q\3Q\7Q\u03c5\nQ\fQ\16Q\u03c8\13Q\3"+
		"Q\5Q\u03cb\nQ\3R\3R\3R\3R\5R\u03d1\nR\3S\3S\3S\3S\3T\3T\3T\3T\3T\5T\u03dc"+
		"\nT\3U\3U\3U\7U\u03e1\nU\fU\16U\u03e4\13U\3V\3V\3V\3W\3W\3W\3X\3X\3X\7"+
		"X\u03ef\nX\fX\16X\u03f2\13X\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u03fa\nY\3Z\3Z\3Z\3Z"+
		"\5Z\u0400\nZ\3Z\3Z\5Z\u0404\nZ\3Z\3Z\3[\3[\3[\3\\\3\\\3\\\5\\\u040e\n"+
		"\\\3\\\3\\\3\\\5\\\u0413\n\\\3\\\3\\\3]\3]\3]\3]\3^\3^\3_\3_\3_\3_\3`"+
		"\3`\5`\u0423\n`\3`\3`\5`\u0427\n`\7`\u0429\n`\f`\16`\u042c\13`\3`\3`\3"+
		"`\3`\3`\7`\u0433\n`\f`\16`\u0436\13`\5`\u0438\n`\3`\5`\u043b\n`\3a\3a"+
		"\5a\u043f\na\3b\3b\5b\u0443\nb\3c\3c\3c\2\4B\u008cd\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\2\30\3\2\6\f\3\2no\3\2\24\26\5\2~~\u0082\u0082\u0084\u0085\3\2"+
		")+\6\2~~\u0083\u0083\u0086\u0086\u0088\u0088\3\2.\61\3\2\62\65\3\2\66"+
		"\67\3\28:\5\2%%DGpt\3\2HI\3\2KL\3\2MN\4\2\17\17QR\3\2ST\3\2\b\13\3\2W"+
		"X\4\2\f\f]f\5\2wxzz\u008a\u008a\3\2wx\5\2\20\20++\u0089\u0089\2\u04a7"+
		"\2\u00cb\3\2\2\2\4\u00d0\3\2\2\2\6\u00d5\3\2\2\2\b\u00d9\3\2\2\2\n\u00db"+
		"\3\2\2\2\f\u00df\3\2\2\2\16\u00e2\3\2\2\2\20\u00e6\3\2\2\2\22\u010d\3"+
		"\2\2\2\24\u010f\3\2\2\2\26\u0112\3\2\2\2\30\u012a\3\2\2\2\32\u013a\3\2"+
		"\2\2\34\u013c\3\2\2\2\36\u014a\3\2\2\2 \u0153\3\2\2\2\"\u0164\3\2\2\2"+
		"$\u0169\3\2\2\2&\u0170\3\2\2\2(\u0179\3\2\2\2*\u0188\3\2\2\2,\u0193\3"+
		"\2\2\2.\u0197\3\2\2\2\60\u01a1\3\2\2\2\62\u01a3\3\2\2\2\64\u01b2\3\2\2"+
		"\2\66\u01bf\3\2\2\28\u01c6\3\2\2\2:\u01d3\3\2\2\2<\u01da\3\2\2\2>\u01e7"+
		"\3\2\2\2@\u01eb\3\2\2\2B\u01f8\3\2\2\2D\u0205\3\2\2\2F\u020d\3\2\2\2H"+
		"\u0214\3\2\2\2J\u0222\3\2\2\2L\u0224\3\2\2\2N\u0226\3\2\2\2P\u023c\3\2"+
		"\2\2R\u023e\3\2\2\2T\u0241\3\2\2\2V\u0243\3\2\2\2X\u0246\3\2\2\2Z\u0250"+
		"\3\2\2\2\\\u0256\3\2\2\2^\u0258\3\2\2\2`\u025a\3\2\2\2b\u025c\3\2\2\2"+
		"d\u0260\3\2\2\2f\u0262\3\2\2\2h\u0278\3\2\2\2j\u028a\3\2\2\2l\u0296\3"+
		"\2\2\2n\u029e\3\2\2\2p\u02a7\3\2\2\2r\u02af\3\2\2\2t\u02b1\3\2\2\2v\u02c1"+
		"\3\2\2\2x\u02c7\3\2\2\2z\u02cf\3\2\2\2|\u02d2\3\2\2\2~\u02d5\3\2\2\2\u0080"+
		"\u02db\3\2\2\2\u0082\u02de\3\2\2\2\u0084\u02e9\3\2\2\2\u0086\u02f2\3\2"+
		"\2\2\u0088\u02fd\3\2\2\2\u008a\u030c\3\2\2\2\u008c\u0320\3\2\2\2\u008e"+
		"\u0370\3\2\2\2\u0090\u0372\3\2\2\2\u0092\u037a\3\2\2\2\u0094\u0385\3\2"+
		"\2\2\u0096\u0391\3\2\2\2\u0098\u0393\3\2\2\2\u009a\u0398\3\2\2\2\u009c"+
		"\u03b2\3\2\2\2\u009e\u03b6\3\2\2\2\u00a0\u03bc\3\2\2\2\u00a2\u03cc\3\2"+
		"\2\2\u00a4\u03d2\3\2\2\2\u00a6\u03db\3\2\2\2\u00a8\u03dd\3\2\2\2\u00aa"+
		"\u03e5\3\2\2\2\u00ac\u03e8\3\2\2\2\u00ae\u03eb\3\2\2\2\u00b0\u03f9\3\2"+
		"\2\2\u00b2\u03fb\3\2\2\2\u00b4\u0407\3\2\2\2\u00b6\u040a\3\2\2\2\u00b8"+
		"\u0416\3\2\2\2\u00ba\u041a\3\2\2\2\u00bc\u041c\3\2\2\2\u00be\u043a\3\2"+
		"\2\2\u00c0\u043e\3\2\2\2\u00c2\u0440\3\2\2\2\u00c4\u0444\3\2\2\2\u00c6"+
		"\u00ca\5\4\3\2\u00c7\u00ca\5\22\n\2\u00c8\u00ca\5\26\f\2\u00c9\u00c6\3"+
		"\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00ce\u00cf\7\2\2\3\u00cf\3\3\2\2\2\u00d0\u00d1\7\3\2\2\u00d1\u00d2"+
		"\5\6\4\2\u00d2\u00d3\5\b\5\2\u00d3\u00d4\7\4\2\2\u00d4\5\3\2\2\2\u00d5"+
		"\u00d6\7\5\2\2\u00d6\7\3\2\2\2\u00d7\u00da\5\n\6\2\u00d8\u00da\5\u008c"+
		"G\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\t\3\2\2\2\u00db\u00dd"+
		"\5\16\b\2\u00dc\u00de\5\16\b\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2"+
		"\u00de\13\3\2\2\2\u00df\u00e0\t\2\2\2\u00e0\r\3\2\2\2\u00e1\u00e3\5\f"+
		"\7\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\7u\2\2\u00e5\17\3\2\2\2\u00e6\u00e9\5\u00c4c\2\u00e7\u00e8\7\r"+
		"\2\2\u00e8\u00ea\5\u00c4c\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\21\3\2\2\2\u00eb\u00ec\7\16\2\2\u00ec\u00ef\7\u008a\2\2\u00ed\u00ee\7"+
		"\r\2\2\u00ee\u00f0\5\u00c4c\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2"+
		"\u00f0\u00f1\3\2\2\2\u00f1\u010e\7\4\2\2\u00f2\u00f5\7\16\2\2\u00f3\u00f6"+
		"\7\17\2\2\u00f4\u00f6\5\u00c4c\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2"+
		"\2\u00f6\u00f9\3\2\2\2\u00f7\u00f8\7\r\2\2\u00f8\u00fa\5\u00c4c\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7\20"+
		"\2\2\u00fc\u00fd\7\u008a\2\2\u00fd\u010e\7\4\2\2\u00fe\u00ff\7\16\2\2"+
		"\u00ff\u0100\7\21\2\2\u0100\u0105\5\20\t\2\u0101\u0102\7\22\2\2\u0102"+
		"\u0104\5\20\t\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3"+
		"\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108"+
		"\u0109\7\23\2\2\u0109\u010a\7\20\2\2\u010a\u010b\7\u008a\2\2\u010b\u010c"+
		"\7\4\2\2\u010c\u010e\3\2\2\2\u010d\u00eb\3\2\2\2\u010d\u00f2\3\2\2\2\u010d"+
		"\u00fe\3\2\2\2\u010e\23\3\2\2\2\u010f\u0110\t\3\2\2\u0110\25\3\2\2\2\u0111"+
		"\u0113\5\24\13\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3"+
		"\2\2\2\u0114\u0115\t\4\2\2\u0115\u011f\5\u00c4c\2\u0116\u0117\7\27\2\2"+
		"\u0117\u011c\5\30\r\2\u0118\u0119\7\22\2\2\u0119\u011b\5\30\r\2\u011a"+
		"\u0118\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0116\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0125\7\21\2\2\u0122\u0124\5"+
		"\32\16\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\7\23"+
		"\2\2\u0129\27\3\2\2\2\u012a\u0130\5D#\2\u012b\u012d\7\30\2\2\u012c\u012e"+
		"\5\u0090I\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2"+
		"\2\u012f\u0131\7\31\2\2\u0130\u012b\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\31\3\2\2\2\u0132\u013b\5\34\17\2\u0133\u013b\5\36\20\2\u0134\u013b\5"+
		" \21\2\u0135\u013b\5\"\22\2\u0136\u013b\5$\23\2\u0137\u013b\5(\25\2\u0138"+
		"\u013b\5.\30\2\u0139\u013b\5\62\32\2\u013a\u0132\3\2\2\2\u013a\u0133\3"+
		"\2\2\2\u013a\u0134\3\2\2\2\u013a\u0135\3\2\2\2\u013a\u0136\3\2\2\2\u013a"+
		"\u0137\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b\33\3\2\2"+
		"\2\u013c\u0140\5B\"\2\u013d\u013f\t\5\2\2\u013e\u013d\3\2\2\2\u013f\u0142"+
		"\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0143\u0146\5\u00c4c\2\u0144\u0145\7\f\2\2\u0145\u0147"+
		"\5\u008cG\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2"+
		"\2\u0148\u0149\7\4\2\2\u0149\35\3\2\2\2\u014a\u014b\7\32\2\2\u014b\u014c"+
		"\5\u00c4c\2\u014c\u014f\7\33\2\2\u014d\u0150\7\17\2\2\u014e\u0150\5B\""+
		"\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152"+
		"\7\4\2\2\u0152\37\3\2\2\2\u0153\u0154\7\34\2\2\u0154\u0155\5\u00c4c\2"+
		"\u0155\u0160\7\21\2\2\u0156\u0157\5@!\2\u0157\u015d\7\4\2\2\u0158\u0159"+
		"\5@!\2\u0159\u015a\7\4\2\2\u015a\u015c\3\2\2\2\u015b\u0158\3\2\2\2\u015c"+
		"\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0161\3\2"+
		"\2\2\u015f\u015d\3\2\2\2\u0160\u0156\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0163\7\23\2\2\u0163!\3\2\2\2\u0164\u0165\7\35\2"+
		"\2\u0165\u0166\5\64\33\2\u0166\u0167\5,\27\2\u0167\u0168\5N(\2\u0168#"+
		"\3\2\2\2\u0169\u016a\7\36\2\2\u016a\u016c\5\u00c4c\2\u016b\u016d\5\64"+
		"\33\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u016f\5N(\2\u016f%\3\2\2\2\u0170\u0176\5\u00c4c\2\u0171\u0173\7\30\2"+
		"\2\u0172\u0174\5\u0090I\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0177\7\31\2\2\u0176\u0171\3\2\2\2\u0176\u0177\3"+
		"\2\2\2\u0177\'\3\2\2\2\u0178\u017a\5\24\13\2\u0179\u0178\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\7\37\2\2\u017c\u017e\5"+
		"\u00c4c\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2"+
		"\u017f\u0180\5\64\33\2\u0180\u0182\5,\27\2\u0181\u0183\5*\26\2\u0182\u0181"+
		"\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0187\7\4\2\2\u0185"+
		"\u0187\5N(\2\u0186\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u0187)\3\2\2\2\u0188"+
		"\u0189\7 \2\2\u0189\u018a\5\64\33\2\u018a+\3\2\2\2\u018b\u0192\5&\24\2"+
		"\u018c\u0192\5L\'\2\u018d\u0192\7\u0080\2\2\u018e\u0192\7\u0085\2\2\u018f"+
		"\u0192\7\u0082\2\2\u0190\u0192\7\u0084\2\2\u0191\u018b\3\2\2\2\u0191\u018c"+
		"\3\2\2\2\u0191\u018d\3\2\2\2\u0191\u018e\3\2\2\2\u0191\u018f\3\2\2\2\u0191"+
		"\u0190\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2"+
		"\2\2\u0194-\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0198\5\24\13\2\u0197\u0196"+
		"\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\7!\2\2\u019a"+
		"\u019b\5\u00c4c\2\u019b\u019d\58\35\2\u019c\u019e\7|\2\2\u019d\u019c\3"+
		"\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\7\4\2\2\u01a0"+
		"/\3\2\2\2\u01a1\u01a2\5\u00c4c\2\u01a2\61\3\2\2\2\u01a3\u01a4\7\"\2\2"+
		"\u01a4\u01a5\5\u00c4c\2\u01a5\u01a7\7\21\2\2\u01a6\u01a8\5\60\31\2\u01a7"+
		"\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01ad\3\2\2\2\u01a9\u01aa\7\22"+
		"\2\2\u01aa\u01ac\5\60\31\2\u01ab\u01a9\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad"+
		"\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u01ad\3\2"+
		"\2\2\u01b0\u01b1\7\23\2\2\u01b1\63\3\2\2\2\u01b2\u01bb\7\30\2\2\u01b3"+
		"\u01b8\5\66\34\2\u01b4\u01b5\7\22\2\2\u01b5\u01b7\5\66\34\2\u01b6\u01b4"+
		"\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01b3\3\2\2\2\u01bb\u01bc\3\2"+
		"\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\7\31\2\2\u01be\65\3\2\2\2\u01bf\u01c1"+
		"\5B\"\2\u01c0\u01c2\5J&\2\u01c1\u01c0\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u01c4\3\2\2\2\u01c3\u01c5\5\u00c4c\2\u01c4\u01c3\3\2\2\2\u01c4\u01c5"+
		"\3\2\2\2\u01c5\67\3\2\2\2\u01c6\u01cf\7\30\2\2\u01c7\u01cc\5:\36\2\u01c8"+
		"\u01c9\7\22\2\2\u01c9\u01cb\5:\36\2\u01ca\u01c8\3\2\2\2\u01cb\u01ce\3"+
		"\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce"+
		"\u01cc\3\2\2\2\u01cf\u01c7\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2"+
		"\2\2\u01d1\u01d2\7\31\2\2\u01d29\3\2\2\2\u01d3\u01d5\5B\"\2\u01d4\u01d6"+
		"\7\u0081\2\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2\2"+
		"\2\u01d7\u01d9\5\u00c4c\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		";\3\2\2\2\u01da\u01e3\7\30\2\2\u01db\u01e0\5> \2\u01dc\u01dd\7\22\2\2"+
		"\u01dd\u01df\5> \2\u01de\u01dc\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de"+
		"\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3"+
		"\u01db\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\7\31"+
		"\2\2\u01e6=\3\2\2\2\u01e7\u01e9\5B\"\2\u01e8\u01ea\5J&\2\u01e9\u01e8\3"+
		"\2\2\2\u01e9\u01ea\3\2\2\2\u01ea?\3\2\2\2\u01eb\u01ed\5B\"\2\u01ec\u01ee"+
		"\5J&\2\u01ed\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef"+
		"\u01f0\5\u00c4c\2\u01f0A\3\2\2\2\u01f1\u01f2\b\"\1\2\u01f2\u01f9\5\u008a"+
		"F\2\u01f3\u01f9\5D#\2\u01f4\u01f9\5F$\2\u01f5\u01f9\5H%\2\u01f6\u01f7"+
		"\7%\2\2\u01f7\u01f9\7\u0083\2\2\u01f8\u01f1\3\2\2\2\u01f8\u01f3\3\2\2"+
		"\2\u01f8\u01f4\3\2\2\2\u01f8\u01f5\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9\u0202"+
		"\3\2\2\2\u01fa\u01fb\f\5\2\2\u01fb\u01fd\7#\2\2\u01fc\u01fe\5\u008cG\2"+
		"\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0201"+
		"\7$\2\2\u0200\u01fa\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0203C\3\2\2\2\u0204\u0202\3\2\2\2\u0205\u020a\5\u00c4"+
		"c\2\u0206\u0207\7&\2\2\u0207\u0209\5\u00c4c\2\u0208\u0206\3\2\2\2\u0209"+
		"\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020bE\3\2\2\2"+
		"\u020c\u020a\3\2\2\2\u020d\u020e\7\'\2\2\u020e\u020f\7\30\2\2\u020f\u0210"+
		"\5\u008aF\2\u0210\u0211\7(\2\2\u0211\u0212\5B\"\2\u0212\u0213\7\31\2\2"+
		"\u0213G\3\2\2\2\u0214\u0215\7\37\2\2\u0215\u021b\5<\37\2\u0216\u021a\7"+
		"\u0082\2\2\u0217\u021a\7\u0080\2\2\u0218\u021a\5L\'\2\u0219\u0216\3\2"+
		"\2\2\u0219\u0217\3\2\2\2\u0219\u0218\3\2\2\2\u021a\u021d\3\2\2\2\u021b"+
		"\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u0220\3\2\2\2\u021d\u021b\3\2"+
		"\2\2\u021e\u021f\7 \2\2\u021f\u0221\5<\37\2\u0220\u021e\3\2\2\2\u0220"+
		"\u0221\3\2\2\2\u0221I\3\2\2\2\u0222\u0223\t\6\2\2\u0223K\3\2\2\2\u0224"+
		"\u0225\t\7\2\2\u0225M\3\2\2\2\u0226\u022a\7\21\2\2\u0227\u0229\5P)\2\u0228"+
		"\u0227\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2"+
		"\2\2\u022b\u022d\3\2\2\2\u022c\u022a\3\2\2\2\u022d\u022e\7\23\2\2\u022e"+
		"O\3\2\2\2\u022f\u023d\5n8\2\u0230\u023d\5p9\2\u0231\u023d\5t;\2\u0232"+
		"\u023d\5N(\2\u0233\u023d\5v<\2\u0234\u023d\5x=\2\u0235\u023d\5z>\2\u0236"+
		"\u023d\5|?\2\u0237\u023d\5~@\2\u0238\u023d\5\u0080A\2\u0239\u023d\5\u0082"+
		"B\2\u023a\u023d\5r:\2\u023b\u023d\5d\63\2\u023c\u022f\3\2\2\2\u023c\u0230"+
		"\3\2\2\2\u023c\u0231\3\2\2\2\u023c\u0232\3\2\2\2\u023c\u0233\3\2\2\2\u023c"+
		"\u0234\3\2\2\2\u023c\u0235\3\2\2\2\u023c\u0236\3\2\2\2\u023c\u0237\3\2"+
		"\2\2\u023c\u0238\3\2\2\2\u023c\u0239\3\2\2\2\u023c\u023a\3\2\2\2\u023c"+
		"\u023b\3\2\2\2\u023dQ\3\2\2\2\u023e\u023f\5\u008cG\2\u023f\u0240\7\4\2"+
		"\2\u0240S\3\2\2\2\u0241\u0242\7,\2\2\u0242U\3\2\2\2\u0243\u0244\7-\2\2"+
		"\u0244W\3\2\2\2\u0245\u0247\5V,\2\u0246\u0245\3\2\2\2\u0246\u0247\3\2"+
		"\2\2\u0247\u0248\3\2\2\2\u0248\u0249\5\u00c4c\2\u0249Y\3\2\2\2\u024a\u024c"+
		"\5X-\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2\2\2\u024d"+
		"\u024f\7\22\2\2\u024e\u024b\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u024e\3"+
		"\2\2\2\u0250\u0251\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0253"+
		"\u0255\5X-\2\u0254\u0253\3\2\2\2\u0254\u0255\3\2\2\2\u0255[\3\2\2\2\u0256"+
		"\u0257\t\b\2\2\u0257]\3\2\2\2\u0258\u0259\t\t\2\2\u0259_\3\2\2\2\u025a"+
		"\u025b\t\n\2\2\u025ba\3\2\2\2\u025c\u025d\t\13\2\2\u025dc\3\2\2\2\u025e"+
		"\u0261\5f\64\2\u025f\u0261\5j\66\2\u0260\u025e\3\2\2\2\u0260\u025f\3\2"+
		"\2\2\u0261e\3\2\2\2\u0262\u0263\5T+\2\u0263\u0264\7\30\2\2\u0264\u0265"+
		"\5^\60\2\u0265\u026c\7\22\2\2\u0266\u0268\5\u00c4c\2\u0267\u0266\3\2\2"+
		"\2\u0267\u0268\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026b\7\22\2\2\u026a"+
		"\u0267\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2"+
		"\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0271\5\u00c4c\2\u0270"+
		"\u026f\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0274\7\22"+
		"\2\2\u0273\u0275\5\u008eH\2\u0274\u0273\3\2\2\2\u0274\u0275\3\2\2\2\u0275"+
		"\u0276\3\2\2\2\u0276\u0277\7\31\2\2\u0277g\3\2\2\2\u0278\u0279\5T+\2\u0279"+
		"\u027a\7\30\2\2\u027a\u027b\5`\61\2\u027b\u0282\7\22\2\2\u027c\u027e\5"+
		"\u00c4c\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\3\2\2\2"+
		"\u027f\u0281\7\22\2\2\u0280\u027d\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280"+
		"\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0285"+
		"\u0287\5\u00c4c\2\u0286\u0285\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288"+
		"\3\2\2\2\u0288\u0289\7\31\2\2\u0289i\3\2\2\2\u028a\u028b\5T+\2\u028b\u028c"+
		"\7\30\2\2\u028c\u028d\5b\62\2\u028d\u028e\7\22\2\2\u028e\u028f\5Z.\2\u028f"+
		"\u0290\7\22\2\2\u0290\u0291\5\u008eH\2\u0291\u0292\7\31\2\2\u0292k\3\2"+
		"\2\2\u0293\u0297\5f\64\2\u0294\u0297\5h\65\2\u0295\u0297\5j\66\2\u0296"+
		"\u0293\3\2\2\2\u0296\u0294\3\2\2\2\u0296\u0295\3\2\2\2\u0297\u029a\3\2"+
		"\2\2\u0298\u0299\7;\2\2\u0299\u029b\5\\/\2\u029a\u0298\3\2\2\2\u029a\u029b"+
		"\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d\7\4\2\2\u029dm\3\2\2\2\u029e"+
		"\u029f\7<\2\2\u029f\u02a0\7\30\2\2\u02a0\u02a1\5\u008cG\2\u02a1\u02a2"+
		"\7\31\2\2\u02a2\u02a5\5P)\2\u02a3\u02a4\7=\2\2\u02a4\u02a6\5P)\2\u02a5"+
		"\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6o\3\2\2\2\u02a7\u02a8\7>\2\2\u02a8"+
		"\u02a9\7\30\2\2\u02a9\u02aa\5\u008cG\2\u02aa\u02ab\7\31\2\2\u02ab\u02ac"+
		"\5P)\2\u02acq\3\2\2\2\u02ad\u02b0\5\u0084C\2\u02ae\u02b0\5R*\2\u02af\u02ad"+
		"\3\2\2\2\u02af\u02ae\3\2\2\2\u02b0s\3\2\2\2\u02b1\u02b2\7\33\2\2\u02b2"+
		"\u02b5\7\30\2\2\u02b3\u02b6\5r:\2\u02b4\u02b6\7\4\2\2\u02b5\u02b3\3\2"+
		"\2\2\u02b5\u02b4\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02ba\5R*\2\u02b8\u02ba"+
		"\7\4\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02b8\3\2\2\2\u02ba\u02bc\3\2\2\2\u02bb"+
		"\u02bd\5\u008cG\2\u02bc\u02bb\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02be"+
		"\3\2\2\2\u02be\u02bf\7\31\2\2\u02bf\u02c0\5P)\2\u02c0u\3\2\2\2\u02c1\u02c3"+
		"\7?\2\2\u02c2\u02c4\7\u008a\2\2\u02c3\u02c2\3\2\2\2\u02c3\u02c4\3\2\2"+
		"\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\5\u009aN\2\u02c6w\3\2\2\2\u02c7\u02c8"+
		"\7@\2\2\u02c8\u02c9\5P)\2\u02c9\u02ca\7>\2\2\u02ca\u02cb\7\30\2\2\u02cb"+
		"\u02cc\5\u008cG\2\u02cc\u02cd\7\31\2\2\u02cd\u02ce\7\4\2\2\u02cey\3\2"+
		"\2\2\u02cf\u02d0\7\177\2\2\u02d0\u02d1\7\4\2\2\u02d1{\3\2\2\2\u02d2\u02d3"+
		"\7}\2\2\u02d3\u02d4\7\4\2\2\u02d4}\3\2\2\2\u02d5\u02d7\7A\2\2\u02d6\u02d8"+
		"\5\u008cG\2\u02d7\u02d6\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9\3\2\2"+
		"\2\u02d9\u02da\7\4\2\2\u02da\177\3\2\2\2\u02db\u02dc\7B\2\2\u02dc\u02dd"+
		"\7\4\2\2\u02dd\u0081\3\2\2\2\u02de\u02df\7C\2\2\u02df\u02e0\5\u0098M\2"+
		"\u02e0\u02e1\7\4\2\2\u02e1\u0083\3\2\2\2\u02e2\u02e3\7D\2\2\u02e3\u02ea"+
		"\5\u0088E\2\u02e4\u02ea\5@!\2\u02e5\u02e6\7\30\2\2\u02e6\u02e7\5\u0086"+
		"D\2\u02e7\u02e8\7\31\2\2\u02e8\u02ea\3\2\2\2\u02e9\u02e2\3\2\2\2\u02e9"+
		"\u02e4\3\2\2\2\u02e9\u02e5\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb\u02ec\7\f"+
		"\2\2\u02ec\u02ee\5\u008cG\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee"+
		"\u02ef\3\2\2\2\u02ef\u02f0\7\4\2\2\u02f0\u0085\3\2\2\2\u02f1\u02f3\5@"+
		"!\2\u02f2\u02f1\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02fa\3\2\2\2\u02f4"+
		"\u02f6\7\22\2\2\u02f5\u02f7\5@!\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7\3\2"+
		"\2\2\u02f7\u02f9\3\2\2\2\u02f8\u02f4\3\2\2\2\u02f9\u02fc\3\2\2\2\u02fa"+
		"\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u0087\3\2\2\2\u02fc\u02fa\3\2"+
		"\2\2\u02fd\u0304\7\30\2\2\u02fe\u0300\5\u00c4c\2\u02ff\u02fe\3\2\2\2\u02ff"+
		"\u0300\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0303\7\22\2\2\u0302\u02ff\3"+
		"\2\2\2\u0303\u0306\3\2\2\2\u0304\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305"+
		"\u0308\3\2\2\2\u0306\u0304\3\2\2\2\u0307\u0309\5\u00c4c\2\u0308\u0307"+
		"\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030b\7\31\2\2"+
		"\u030b\u0089\3\2\2\2\u030c\u030d\t\f\2\2\u030d\u008b\3\2\2\2\u030e\u030f"+
		"\bG\1\2\u030f\u0310\7J\2\2\u0310\u0321\5B\"\2\u0311\u0312\7\30\2\2\u0312"+
		"\u0313\5\u008cG\2\u0313\u0314\7\31\2\2\u0314\u0321\3\2\2\2\u0315\u0316"+
		"\t\r\2\2\u0316\u0321\5\u008cG\25\u0317\u0318\t\16\2\2\u0318\u0321\5\u008c"+
		"G\24\u0319\u031a\t\17\2\2\u031a\u0321\5\u008cG\23\u031b\u031c\7O\2\2\u031c"+
		"\u0321\5\u008cG\22\u031d\u031e\7\7\2\2\u031e\u0321\5\u008cG\21\u031f\u0321"+
		"\5\u008eH\2\u0320\u030e\3\2\2\2\u0320\u0311\3\2\2\2\u0320\u0315\3\2\2"+
		"\2\u0320\u0317\3\2\2\2\u0320\u0319\3\2\2\2\u0320\u031b\3\2\2\2\u0320\u031d"+
		"\3\2\2\2\u0320\u031f\3\2\2\2\u0321\u035d\3\2\2\2\u0322\u0323\f\20\2\2"+
		"\u0323\u0324\7P\2\2\u0324\u035c\5\u008cG\21\u0325\u0326\f\17\2\2\u0326"+
		"\u0327\t\20\2\2\u0327\u035c\5\u008cG\20\u0328\u0329\f\16\2\2\u0329\u032a"+
		"\t\16\2\2\u032a\u035c\5\u008cG\17\u032b\u032c\f\r\2\2\u032c\u032d\t\21"+
		"\2\2\u032d\u035c\5\u008cG\16\u032e\u032f\f\f\2\2\u032f\u0330\7U\2\2\u0330"+
		"\u035c\5\u008cG\r\u0331\u0332\f\13\2\2\u0332\u0333\7\6\2\2\u0333\u035c"+
		"\5\u008cG\f\u0334\u0335\f\n\2\2\u0335\u0336\7V\2\2\u0336\u035c\5\u008c"+
		"G\13\u0337\u0338\f\t\2\2\u0338\u0339\t\22\2\2\u0339\u035c\5\u008cG\n\u033a"+
		"\u033b\f\b\2\2\u033b\u033c\t\23\2\2\u033c\u035c\5\u008cG\t\u033d\u033e"+
		"\f\7\2\2\u033e\u033f\7Y\2\2\u033f\u035c\5\u008cG\b\u0340\u0341\f\6\2\2"+
		"\u0341\u0342\7Z\2\2\u0342\u035c\5\u008cG\7\u0343\u0344\f\5\2\2\u0344\u0345"+
		"\7[\2\2\u0345\u0346\5\u008cG\2\u0346\u0347\7\\\2\2\u0347\u0348\5\u008c"+
		"G\6\u0348\u035c\3\2\2\2\u0349\u034a\f\4\2\2\u034a\u034b\t\24\2\2\u034b"+
		"\u035c\5\u008cG\5\u034c\u034d\f\33\2\2\u034d\u035c\t\r\2\2\u034e\u034f"+
		"\f\31\2\2\u034f\u0350\7#\2\2\u0350\u0351\5\u008cG\2\u0351\u0352\7$\2\2"+
		"\u0352\u035c\3\2\2\2\u0353\u0354\f\30\2\2\u0354\u0355\7\30\2\2\u0355\u0356"+
		"\5\u0096L\2\u0356\u0357\7\31\2\2\u0357\u035c\3\2\2\2\u0358\u0359\f\27"+
		"\2\2\u0359\u035a\7&\2\2\u035a\u035c\5\u00c4c\2\u035b\u0322\3\2\2\2\u035b"+
		"\u0325\3\2\2\2\u035b\u0328\3\2\2\2\u035b\u032b\3\2\2\2\u035b\u032e\3\2"+
		"\2\2\u035b\u0331\3\2\2\2\u035b\u0334\3\2\2\2\u035b\u0337\3\2\2\2\u035b"+
		"\u033a\3\2\2\2\u035b\u033d\3\2\2\2\u035b\u0340\3\2\2\2\u035b\u0343\3\2"+
		"\2\2\u035b\u0349\3\2\2\2\u035b\u034c\3\2\2\2\u035b\u034e\3\2\2\2\u035b"+
		"\u0353\3\2\2\2\u035b\u0358\3\2\2\2\u035c\u035f\3\2\2\2\u035d\u035b\3\2"+
		"\2\2\u035d\u035e\3\2\2\2\u035e\u008d\3\2\2\2\u035f\u035d\3\2\2\2\u0360"+
		"\u0371\7v\2\2\u0361\u0371\5\u00c2b\2\u0362\u0371\7z\2\2\u0363\u0371\7"+
		"\u008a\2\2\u0364\u0367\5\u00c4c\2\u0365\u0366\7#\2\2\u0366\u0368\7$\2"+
		"\2\u0367\u0365\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0371\3\2\2\2\u0369\u0371"+
		"\7\u0087\2\2\u036a\u0371\5\u00be`\2\u036b\u036e\5\u00c0a\2\u036c\u036d"+
		"\7#\2\2\u036d\u036f\7$\2\2\u036e\u036c\3\2\2\2\u036e\u036f\3\2\2\2\u036f"+
		"\u0371\3\2\2\2\u0370\u0360\3\2\2\2\u0370\u0361\3\2\2\2\u0370\u0362\3\2"+
		"\2\2\u0370\u0363\3\2\2\2\u0370\u0364\3\2\2\2\u0370\u0369\3\2\2\2\u0370"+
		"\u036a\3\2\2\2\u0370\u036b\3\2\2\2\u0371\u008f\3\2\2\2\u0372\u0377\5\u008c"+
		"G\2\u0373\u0374\7\22\2\2\u0374\u0376\5\u008cG\2\u0375\u0373\3\2\2\2\u0376"+
		"\u0379\3\2\2\2\u0377\u0375\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u0091\3\2"+
		"\2\2\u0379\u0377\3\2\2\2\u037a\u037f\5\u0094K\2\u037b\u037c\7\22\2\2\u037c"+
		"\u037e\5\u0094K\2\u037d\u037b\3\2\2\2\u037e\u0381\3\2\2\2\u037f\u037d"+
		"\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0383\3\2\2\2\u0381\u037f\3\2\2\2\u0382"+
		"\u0384\7\22\2\2\u0383\u0382\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0093\3"+
		"\2\2\2\u0385\u0386\5\u00c4c\2\u0386\u0387\7\\\2\2\u0387\u0388\5\u008c"+
		"G\2\u0388\u0095\3\2\2\2\u0389\u038b\7\21\2\2\u038a\u038c\5\u0092J\2\u038b"+
		"\u038a\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u0392\7\23"+
		"\2\2\u038e\u0390\5\u0090I\2\u038f\u038e\3\2\2\2\u038f\u0390\3\2\2\2\u0390"+
		"\u0392\3\2\2\2\u0391\u0389\3\2\2\2\u0391\u038f\3\2\2\2\u0392\u0097\3\2"+
		"\2\2\u0393\u0394\5\u008cG\2\u0394\u0395\7\30\2\2\u0395\u0396\5\u0096L"+
		"\2\u0396\u0397\7\31\2\2\u0397\u0099\3\2\2\2\u0398\u039c\7\21\2\2\u0399"+
		"\u039b\5\u009cO\2\u039a\u0399\3\2\2\2\u039b\u039e\3\2\2\2\u039c\u039a"+
		"\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039f\3\2\2\2\u039e\u039c\3\2\2\2\u039f"+
		"\u03a0\7\23\2\2\u03a0\u009b\3\2\2\2\u03a1\u03b3\5\u00c4c\2\u03a2\u03b3"+
		"\5\u009aN\2\u03a3\u03b3\5\u009eP\2\u03a4\u03b3\5\u00a2R\2\u03a5\u03b3"+
		"\5\u00a4S\2\u03a6\u03b3\5\u00aaV\2\u03a7\u03b3\5\u00acW\2\u03a8\u03b3"+
		"\5\u00aeX\2\u03a9\u03b3\5\u00b2Z\2\u03aa\u03b3\5\u00b6\\\2\u03ab\u03b3"+
		"\5\u00b8]\2\u03ac\u03b3\7}\2\2\u03ad\u03b3\7\177\2\2\u03ae\u03b3\5\u00bc"+
		"_\2\u03af\u03b3\5\u00c2b\2\u03b0\u03b3\7\u008a\2\2\u03b1\u03b3\7z\2\2"+
		"\u03b2\u03a1\3\2\2\2\u03b2\u03a2\3\2\2\2\u03b2\u03a3\3\2\2\2\u03b2\u03a4"+
		"\3\2\2\2\u03b2\u03a5\3\2\2\2\u03b2\u03a6\3\2\2\2\u03b2\u03a7\3\2\2\2\u03b2"+
		"\u03a8\3\2\2\2\u03b2\u03a9\3\2\2\2\u03b2\u03aa\3\2\2\2\u03b2\u03ab\3\2"+
		"\2\2\u03b2\u03ac\3\2\2\2\u03b2\u03ad\3\2\2\2\u03b2\u03ae\3\2\2\2\u03b2"+
		"\u03af\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b1\3\2\2\2\u03b3\u009d\3\2"+
		"\2\2\u03b4\u03b7\5\u00a0Q\2\u03b5\u03b7\5\u00ba^\2\u03b6\u03b4\3\2\2\2"+
		"\u03b6\u03b5\3\2\2\2\u03b7\u009f\3\2\2\2\u03b8\u03bd\7A\2\2\u03b9\u03bd"+
		"\7%\2\2\u03ba\u03bd\7G\2\2\u03bb\u03bd\5\u00c4c\2\u03bc\u03b8\3\2\2\2"+
		"\u03bc\u03b9\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bc\u03bb\3\2\2\2\u03bd\u03ca"+
		"\3\2\2\2\u03be\u03c0\7\30\2\2\u03bf\u03c1\5\u009eP\2\u03c0\u03bf\3\2\2"+
		"\2\u03c0\u03c1\3\2\2\2\u03c1\u03c6\3\2\2\2\u03c2\u03c3\7\22\2\2\u03c3"+
		"\u03c5\5\u009eP\2\u03c4\u03c2\3\2\2\2\u03c5\u03c8\3\2\2\2\u03c6\u03c4"+
		"\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c9\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c9"+
		"\u03cb\7\31\2\2\u03ca\u03be\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u00a1\3"+
		"\2\2\2\u03cc\u03cd\7g\2\2\u03cd\u03d0\5\u00a6T\2\u03ce\u03cf\7h\2\2\u03cf"+
		"\u03d1\5\u009eP\2\u03d0\u03ce\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u00a3"+
		"\3\2\2\2\u03d2\u03d3\5\u00a6T\2\u03d3\u03d4\7h\2\2\u03d4\u03d5\5\u009e"+
		"P\2\u03d5\u00a5\3\2\2\2\u03d6\u03dc\5\u00c4c\2\u03d7\u03d8\7\30\2\2\u03d8"+
		"\u03d9\5\u00a8U\2\u03d9\u03da\7\31\2\2\u03da\u03dc\3\2\2\2\u03db\u03d6"+
		"\3\2\2\2\u03db\u03d7\3\2\2\2\u03dc\u00a7\3\2\2\2\u03dd\u03e2\5\u00c4c"+
		"\2\u03de\u03df\7\22\2\2\u03df\u03e1\5\u00c4c\2\u03e0\u03de\3\2\2\2\u03e1"+
		"\u03e4\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u00a9\3\2"+
		"\2\2\u03e4\u03e2\3\2\2\2\u03e5\u03e6\7i\2\2\u03e6\u03e7\5\u00c4c\2\u03e7"+
		"\u00ab\3\2\2\2\u03e8\u03e9\5\u00c4c\2\u03e9\u03ea\7\\\2\2\u03ea\u00ad"+
		"\3\2\2\2\u03eb\u03ec\7j\2\2\u03ec\u03f0\5\u009eP\2\u03ed\u03ef\5\u00b0"+
		"Y\2\u03ee\u03ed\3\2\2\2\u03ef\u03f2\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f0"+
		"\u03f1\3\2\2\2\u03f1\u00af\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f3\u03f4\7k"+
		"\2\2\u03f4\u03f5\5\u00ba^\2\u03f5\u03f6\5\u009aN\2\u03f6\u03fa\3\2\2\2"+
		"\u03f7\u03f8\7l\2\2\u03f8\u03fa\5\u009aN\2\u03f9\u03f3\3\2\2\2\u03f9\u03f7"+
		"\3\2\2\2\u03fa\u00b1\3\2\2\2\u03fb\u03fc\7\37\2\2\u03fc\u03fd\5\u00c4"+
		"c\2\u03fd\u03ff\7\30\2\2\u03fe\u0400\5\u00a8U\2\u03ff\u03fe\3\2\2\2\u03ff"+
		"\u0400\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0403\7\31\2\2\u0402\u0404\5"+
		"\u00b4[\2\u0403\u0402\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0405\3\2\2\2"+
		"\u0405\u0406\5\u009aN\2\u0406\u00b3\3\2\2\2\u0407\u0408\7m\2\2\u0408\u0409"+
		"\5\u00a8U\2\u0409\u00b5\3\2\2\2\u040a\u040d\7\33\2\2\u040b\u040e\5\u009a"+
		"N\2\u040c\u040e\5\u009eP\2\u040d\u040b\3\2\2\2\u040d\u040c\3\2\2\2\u040e"+
		"\u040f\3\2\2\2\u040f\u0412\5\u009eP\2\u0410\u0413\5\u009aN\2\u0411\u0413"+
		"\5\u009eP\2\u0412\u0410\3\2\2\2\u0412\u0411\3\2\2\2\u0413\u0414\3\2\2"+
		"\2\u0414\u0415\5\u009aN\2\u0415\u00b7\3\2\2\2\u0416\u0417\7<\2\2\u0417"+
		"\u0418\5\u009eP\2\u0418\u0419\5\u009aN\2\u0419\u00b9\3\2\2\2\u041a\u041b"+
		"\t\25\2\2\u041b\u00bb\3\2\2\2\u041c\u041d\7?\2\2\u041d\u041e\5\u00c4c"+
		"\2\u041e\u041f\5\u009aN\2\u041f\u00bd\3\2\2\2\u0420\u0422\7\30\2\2\u0421"+
		"\u0423\5\u008cG\2\u0422\u0421\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u042a"+
		"\3\2\2\2\u0424\u0426\7\22\2\2\u0425\u0427\5\u008cG\2\u0426\u0425\3\2\2"+
		"\2\u0426\u0427\3\2\2\2\u0427\u0429\3\2\2\2\u0428\u0424\3\2\2\2\u0429\u042c"+
		"\3\2\2\2\u042a\u0428\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042d\3\2\2\2\u042c"+
		"\u042a\3\2\2\2\u042d\u043b\7\31\2\2\u042e\u0437\7#\2\2\u042f\u0434\5\u008c"+
		"G\2\u0430\u0431\7\22\2\2\u0431\u0433\5\u008cG\2\u0432\u0430\3\2\2\2\u0433"+
		"\u0436\3\2\2\2\u0434\u0432\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0438\3\2"+
		"\2\2\u0436\u0434\3\2\2\2\u0437\u042f\3\2\2\2\u0437\u0438\3\2\2\2\u0438"+
		"\u0439\3\2\2\2\u0439\u043b\7$\2\2\u043a\u0420\3\2\2\2\u043a\u042e\3\2"+
		"\2\2\u043b\u00bf\3\2\2\2\u043c\u043f\5\u008aF\2\u043d\u043f\5D#\2\u043e"+
		"\u043c\3\2\2\2\u043e\u043d\3\2\2\2\u043f\u00c1\3\2\2\2\u0440\u0442\t\26"+
		"\2\2\u0441\u0443\7y\2\2\u0442\u0441\3\2\2\2\u0442\u0443\3\2\2\2\u0443"+
		"\u00c3\3\2\2\2\u0444\u0445\t\27\2\2\u0445\u00c5\3\2\2\2|\u00c9\u00cb\u00d9"+
		"\u00dd\u00e2\u00e9\u00ef\u00f5\u00f9\u0105\u010d\u0112\u011c\u011f\u0125"+
		"\u012d\u0130\u013a\u0140\u0146\u014f\u015d\u0160\u016c\u0173\u0176\u0179"+
		"\u017d\u0182\u0186\u0191\u0193\u0197\u019d\u01a7\u01ad\u01b8\u01bb\u01c1"+
		"\u01c4\u01cc\u01cf\u01d5\u01d8\u01e0\u01e3\u01e9\u01ed\u01f8\u01fd\u0202"+
		"\u020a\u0219\u021b\u0220\u022a\u023c\u0246\u024b\u0250\u0254\u0260\u0267"+
		"\u026c\u0270\u0274\u027d\u0282\u0286\u0296\u029a\u02a5\u02af\u02b5\u02b9"+
		"\u02bc\u02c3\u02d7\u02e9\u02ed\u02f2\u02f6\u02fa\u02ff\u0304\u0308\u0320"+
		"\u035b\u035d\u0367\u036e\u0370\u0377\u037f\u0383\u038b\u038f\u0391\u039c"+
		"\u03b2\u03b6\u03bc\u03c0\u03c6\u03ca\u03d0\u03db\u03e2\u03f0\u03f9\u03ff"+
		"\u0403\u040d\u0412\u0422\u0426\u042a\u0434\u0437\u043a\u043e\u0442";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}