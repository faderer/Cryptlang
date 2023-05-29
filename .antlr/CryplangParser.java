// Generated from c:\Users\24512\研一\科研\合约语言\Cryplang\Cryplang.g4 by ANTLR 4.9.2
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
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, NatSpecSingleLine=101, 
		NatSpecMultiLine=102, Int=103, Uint=104, Byte=105, Fixed=106, Ufixed=107, 
		VersionLiteral=108, BooleanLiteral=109, DecimalNumber=110, HexNumber=111, 
		NumberUnit=112, HexLiteral=113, ReservedKeyword=114, AnonymousKeyword=115, 
		BreakKeyword=116, ConstantKeyword=117, ContinueKeyword=118, ExternalKeyword=119, 
		IndexedKeyword=120, InternalKeyword=121, PayableKeyword=122, PrivateKeyword=123, 
		PublicKeyword=124, PureKeyword=125, TypeKeyword=126, ViewKeyword=127, 
		Identifier=128, StringLiteral=129, WS=130, COMMENT=131, LINE_COMMENT=132;
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
		RULE_privateIdentifierList = 44, RULE_signatureMethod = 45, RULE_proofMethod = 46, 
		RULE_cryptoStatement = 47, RULE_signatureStatement = 48, RULE_proofStatement = 49, 
		RULE_ifStatement = 50, RULE_whileStatement = 51, RULE_simpleStatement = 52, 
		RULE_forStatement = 53, RULE_inlineAssemblyStatement = 54, RULE_doWhileStatement = 55, 
		RULE_continueStatement = 56, RULE_breakStatement = 57, RULE_returnStatement = 58, 
		RULE_throwStatement = 59, RULE_emitStatement = 60, RULE_variableDeclarationStatement = 61, 
		RULE_variableDeclarationList = 62, RULE_identifierList = 63, RULE_elementaryTypeName = 64, 
		RULE_expression = 65, RULE_primaryExpression = 66, RULE_expressionList = 67, 
		RULE_nameValueList = 68, RULE_nameValue = 69, RULE_functionCallArguments = 70, 
		RULE_functionCall = 71, RULE_assemblyBlock = 72, RULE_assemblyItem = 73, 
		RULE_assemblyExpression = 74, RULE_assemblyCall = 75, RULE_assemblyLocalDefinition = 76, 
		RULE_assemblyAssignment = 77, RULE_assemblyIdentifierOrList = 78, RULE_assemblyIdentifierList = 79, 
		RULE_assemblyStackAssignment = 80, RULE_labelDefinition = 81, RULE_assemblySwitch = 82, 
		RULE_assemblyCase = 83, RULE_assemblyFunctionDefinition = 84, RULE_assemblyFunctionReturns = 85, 
		RULE_assemblyFor = 86, RULE_assemblyIf = 87, RULE_assemblyLiteral = 88, 
		RULE_subAssembly = 89, RULE_tupleExpression = 90, RULE_typeNameExpression = 91, 
		RULE_numberLiteral = 92, RULE_identifier = 93;
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
			"privateIdentifierList", "signatureMethod", "proofMethod", "cryptoStatement", 
			"signatureStatement", "proofStatement", "ifStatement", "whileStatement", 
			"simpleStatement", "forStatement", "inlineAssemblyStatement", "doWhileStatement", 
			"continueStatement", "breakStatement", "returnStatement", "throwStatement", 
			"emitStatement", "variableDeclarationStatement", "variableDeclarationList", 
			"identifierList", "elementaryTypeName", "expression", "primaryExpression", 
			"expressionList", "nameValueList", "nameValue", "functionCallArguments", 
			"functionCall", "assemblyBlock", "assemblyItem", "assemblyExpression", 
			"assemblyCall", "assemblyLocalDefinition", "assemblyAssignment", "assemblyIdentifierOrList", 
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
			"'memory'", "'storage'", "'calldata'", "'@require'", "'#'", "'ECDSA'", 
			"'RSA'", "'BLS'", "'Schorr'", "'Groth16'", "'PLONK'", "'GM17'", "'if'", 
			"'else'", "'while'", "'assembly'", "'do'", "'return'", "'throw'", "'emit'", 
			"'var'", "'bool'", "'string'", "'byte'", "'++'", "'--'", "'new'", "'+'", 
			"'-'", "'after'", "'delete'", "'!'", "'**'", "'/'", "'%'", "'<<'", "'>>'", 
			"'&'", "'|'", "'=='", "'!='", "'&&'", "'||'", "'?'", "':'", "'|='", "'^='", 
			"'&='", "'<<='", "'>>='", "'+='", "'-='", "'*='", "'/='", "'%='", "'let'", 
			"':='", "'=:'", "'switch'", "'case'", "'default'", "'->'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'anonymous'", "'break'", "'constant'", "'continue'", "'external'", "'indexed'", 
			"'internal'", "'payable'", "'private'", "'public'", "'pure'", "'type'", 
			"'view'"
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
			null, null, null, null, null, "NatSpecSingleLine", "NatSpecMultiLine", 
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
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__11) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0) || _la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(191);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(188);
					pragmaDirective();
					}
					break;
				case T__11:
					{
					setState(189);
					importDirective();
					}
					break;
				case T__17:
				case T__18:
				case T__19:
				case NatSpecSingleLine:
				case NatSpecMultiLine:
					{
					setState(190);
					contractDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
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
			setState(198);
			match(T__0);
			setState(199);
			pragmaName();
			setState(200);
			pragmaValue();
			setState(201);
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
			setState(203);
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
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				version();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
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
			setState(209);
			versionConstraint();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0) || _la==VersionLiteral) {
				{
				setState(210);
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
			setState(213);
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
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
				{
				setState(215);
				versionOperator();
				}
			}

			setState(218);
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
			setState(220);
			identifier();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(221);
				match(T__10);
				setState(222);
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
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(T__11);
				setState(226);
				match(StringLiteral);
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

				setState(231);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(T__11);
				setState(235);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__12:
					{
					setState(233);
					match(T__12);
					}
					break;
				case T__13:
				case T__40:
				case Identifier:
					{
					setState(234);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(237);
					match(T__10);
					setState(238);
					identifier();
					}
				}

				setState(241);
				match(T__13);
				setState(242);
				match(StringLiteral);
				setState(243);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(T__11);
				setState(245);
				match(T__14);
				setState(246);
				importDeclaration();
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(247);
					match(T__15);
					setState(248);
					importDeclaration();
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(254);
				match(T__16);
				setState(255);
				match(T__13);
				setState(256);
				match(StringLiteral);
				setState(257);
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
			setState(261);
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
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(263);
				natSpec();
				}
			}

			setState(266);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(267);
			identifier();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(268);
				match(T__20);
				setState(269);
				inheritanceSpecifier();
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(270);
					match(T__15);
					setState(271);
					inheritanceSpecifier();
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(279);
			match(T__14);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__30) | (1L << T__31) | (1L << T__34) | (1L << T__36) | (1L << T__40) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (NatSpecSingleLine - 101)) | (1L << (NatSpecMultiLine - 101)) | (1L << (Int - 101)) | (1L << (Uint - 101)) | (1L << (Byte - 101)) | (1L << (Fixed - 101)) | (1L << (Ufixed - 101)) | (1L << (Identifier - 101)))) != 0)) {
				{
				{
				setState(280);
				contractPart();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
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
			setState(288);
			userDefinedTypeName();
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(289);
				match(T__21);
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__21 - 5)) | (1L << (T__32 - 5)) | (1L << (T__34 - 5)) | (1L << (T__40 - 5)) | (1L << (T__58 - 5)) | (1L << (T__59 - 5)) | (1L << (T__60 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)) | (1L << (T__67 - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (DecimalNumber - 69)) | (1L << (HexNumber - 69)) | (1L << (HexLiteral - 69)) | (1L << (TypeKeyword - 69)) | (1L << (Identifier - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
					{
					setState(290);
					expressionList();
					}
				}

				setState(293);
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
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				stateVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				usingForDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				constructorDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(300);
				modifierDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(301);
				functionDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(302);
				eventDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(303);
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
			setState(306);
			typeName(0);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (ConstantKeyword - 117)) | (1L << (InternalKeyword - 117)) | (1L << (PrivateKeyword - 117)) | (1L << (PublicKeyword - 117)))) != 0)) {
				{
				{
				setState(307);
				_la = _input.LA(1);
				if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (ConstantKeyword - 117)) | (1L << (InternalKeyword - 117)) | (1L << (PrivateKeyword - 117)) | (1L << (PublicKeyword - 117)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
			identifier();
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(314);
				match(T__9);
				setState(315);
				expression(0);
				}
			}

			setState(318);
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
			setState(320);
			match(T__23);
			setState(321);
			identifier();
			setState(322);
			match(T__24);
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				{
				setState(323);
				match(T__12);
				}
				break;
			case T__13:
			case T__28:
			case T__34:
			case T__36:
			case T__40:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
				{
				setState(324);
				typeName(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(327);
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
			setState(329);
			match(T__25);
			setState(330);
			identifier();
			setState(331);
			match(T__14);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__28) | (1L << T__34) | (1L << T__36) | (1L << T__40) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (Identifier - 103)))) != 0)) {
				{
				setState(332);
				variableDeclaration();
				setState(333);
				match(T__1);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__28) | (1L << T__34) | (1L << T__36) | (1L << T__40) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (Identifier - 103)))) != 0)) {
					{
					{
					setState(334);
					variableDeclaration();
					setState(335);
					match(T__1);
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(344);
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
			setState(346);
			match(T__26);
			setState(347);
			parameterList();
			setState(348);
			modifierList();
			setState(349);
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
			setState(351);
			match(T__27);
			setState(352);
			identifier();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(353);
				parameterList();
				}
			}

			setState(356);
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
			setState(358);
			identifier();
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(359);
				match(T__21);
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__21 - 5)) | (1L << (T__32 - 5)) | (1L << (T__34 - 5)) | (1L << (T__40 - 5)) | (1L << (T__58 - 5)) | (1L << (T__59 - 5)) | (1L << (T__60 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)) | (1L << (T__67 - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (DecimalNumber - 69)) | (1L << (HexNumber - 69)) | (1L << (HexLiteral - 69)) | (1L << (TypeKeyword - 69)) | (1L << (Identifier - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
					{
					setState(360);
					expressionList();
					}
				}

				setState(363);
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
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(366);
				natSpec();
				}
			}

			setState(369);
			match(T__28);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__40 || _la==Identifier) {
				{
				setState(370);
				identifier();
				}
			}

			setState(373);
			parameterList();
			setState(374);
			modifierList();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(375);
				returnParameters();
				}
			}

			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(378);
				match(T__1);
				}
				break;
			case T__14:
				{
				setState(379);
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
			setState(382);
			match(T__29);
			setState(383);
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
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13 || _la==T__40 || ((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (ConstantKeyword - 117)) | (1L << (ExternalKeyword - 117)) | (1L << (InternalKeyword - 117)) | (1L << (PayableKeyword - 117)) | (1L << (PrivateKeyword - 117)) | (1L << (PublicKeyword - 117)) | (1L << (PureKeyword - 117)) | (1L << (ViewKeyword - 117)) | (1L << (Identifier - 117)))) != 0)) {
				{
				setState(391);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__13:
				case T__40:
				case Identifier:
					{
					setState(385);
					modifierInvocation();
					}
					break;
				case ConstantKeyword:
				case PayableKeyword:
				case PureKeyword:
				case ViewKeyword:
					{
					setState(386);
					stateMutability();
					}
					break;
				case ExternalKeyword:
					{
					setState(387);
					match(ExternalKeyword);
					}
					break;
				case PublicKeyword:
					{
					setState(388);
					match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(389);
					match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(390);
					match(PrivateKeyword);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(395);
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
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NatSpecSingleLine || _la==NatSpecMultiLine) {
				{
				setState(396);
				natSpec();
				}
			}

			setState(399);
			match(T__30);
			setState(400);
			identifier();
			setState(401);
			eventParameterList();
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(402);
				match(AnonymousKeyword);
				}
			}

			setState(405);
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
			setState(407);
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
			setState(409);
			match(T__31);
			setState(410);
			identifier();
			setState(411);
			match(T__14);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__40 || _la==Identifier) {
				{
				setState(412);
				enumValue();
				}
			}

			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(415);
				match(T__15);
				setState(416);
				enumValue();
				}
				}
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(422);
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
			setState(424);
			match(T__21);
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__28) | (1L << T__34) | (1L << T__36) | (1L << T__40) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (Identifier - 103)))) != 0)) {
				{
				setState(425);
				parameter();
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(426);
					match(T__15);
					setState(427);
					parameter();
					}
					}
					setState(432);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(435);
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
			setState(437);
			typeName(0);
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(438);
				storageLocation();
				}
				break;
			}
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__40 || _la==Identifier) {
				{
				setState(441);
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
			setState(444);
			match(T__21);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__28) | (1L << T__34) | (1L << T__36) | (1L << T__40) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (Identifier - 103)))) != 0)) {
				{
				setState(445);
				eventParameter();
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(446);
					match(T__15);
					setState(447);
					eventParameter();
					}
					}
					setState(452);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(455);
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
			setState(457);
			typeName(0);
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(458);
				match(IndexedKeyword);
				}
			}

			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__40 || _la==Identifier) {
				{
				setState(461);
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
			setState(464);
			match(T__21);
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__28) | (1L << T__34) | (1L << T__36) | (1L << T__40) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (Identifier - 103)))) != 0)) {
				{
				setState(465);
				functionTypeParameter();
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(466);
					match(T__15);
					setState(467);
					functionTypeParameter();
					}
					}
					setState(472);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(475);
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
			setState(477);
			typeName(0);
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) {
				{
				setState(478);
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
			setState(481);
			typeName(0);
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(482);
				storageLocation();
				}
				break;
			}
			setState(485);
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
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(488);
				elementaryTypeName();
				}
				break;
			case 2:
				{
				setState(489);
				userDefinedTypeName();
				}
				break;
			case 3:
				{
				setState(490);
				mapping();
				}
				break;
			case 4:
				{
				setState(491);
				functionTypeName();
				}
				break;
			case 5:
				{
				setState(492);
				match(T__34);
				setState(493);
				match(PayableKeyword);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(504);
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
					setState(496);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(497);
					match(T__32);
					setState(499);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__21 - 5)) | (1L << (T__32 - 5)) | (1L << (T__34 - 5)) | (1L << (T__40 - 5)) | (1L << (T__58 - 5)) | (1L << (T__59 - 5)) | (1L << (T__60 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)) | (1L << (T__67 - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (DecimalNumber - 69)) | (1L << (HexNumber - 69)) | (1L << (HexLiteral - 69)) | (1L << (TypeKeyword - 69)) | (1L << (Identifier - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
						{
						setState(498);
						expression(0);
						}
					}

					setState(501);
					match(T__33);
					}
					} 
				}
				setState(506);
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
			setState(507);
			identifier();
			setState(512);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(508);
					match(T__35);
					setState(509);
					identifier();
					}
					} 
				}
				setState(514);
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
			setState(515);
			match(T__36);
			setState(516);
			match(T__21);
			setState(517);
			elementaryTypeName();
			setState(518);
			match(T__37);
			setState(519);
			typeName(0);
			setState(520);
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
			setState(522);
			match(T__28);
			setState(523);
			functionTypeParameterList();
			setState(529);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(527);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case InternalKeyword:
						{
						setState(524);
						match(InternalKeyword);
						}
						break;
					case ExternalKeyword:
						{
						setState(525);
						match(ExternalKeyword);
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(526);
						stateMutability();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(531);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(532);
				match(T__29);
				setState(533);
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
			setState(536);
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
			setState(538);
			_la = _input.LA(1);
			if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (ConstantKeyword - 117)) | (1L << (PayableKeyword - 117)) | (1L << (PureKeyword - 117)) | (1L << (ViewKeyword - 117)))) != 0)) ) {
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
			setState(540);
			match(T__14);
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__14 - 5)) | (1L << (T__21 - 5)) | (1L << (T__24 - 5)) | (1L << (T__28 - 5)) | (1L << (T__32 - 5)) | (1L << (T__34 - 5)) | (1L << (T__36 - 5)) | (1L << (T__40 - 5)) | (1L << (T__41 - 5)) | (1L << (T__50 - 5)) | (1L << (T__52 - 5)) | (1L << (T__53 - 5)) | (1L << (T__54 - 5)) | (1L << (T__55 - 5)) | (1L << (T__56 - 5)) | (1L << (T__57 - 5)) | (1L << (T__58 - 5)) | (1L << (T__59 - 5)) | (1L << (T__60 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)) | (1L << (T__67 - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (DecimalNumber - 69)) | (1L << (HexNumber - 69)) | (1L << (HexLiteral - 69)) | (1L << (BreakKeyword - 69)) | (1L << (ContinueKeyword - 69)) | (1L << (TypeKeyword - 69)) | (1L << (Identifier - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
				{
				{
				setState(541);
				statement();
				}
				}
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(547);
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
			setState(562);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__50:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				ifStatement();
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				whileStatement();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(551);
				forStatement();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(552);
				block();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 5);
				{
				setState(553);
				inlineAssemblyStatement();
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 6);
				{
				setState(554);
				doWhileStatement();
				}
				break;
			case ContinueKeyword:
				enterOuterAlt(_localctx, 7);
				{
				setState(555);
				continueStatement();
				}
				break;
			case BreakKeyword:
				enterOuterAlt(_localctx, 8);
				{
				setState(556);
				breakStatement();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 9);
				{
				setState(557);
				returnStatement();
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 10);
				{
				setState(558);
				throwStatement();
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 11);
				{
				setState(559);
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
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
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
				setState(560);
				simpleStatement();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 13);
				{
				setState(561);
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
			setState(564);
			expression(0);
			setState(565);
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
			setState(567);
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
			setState(569);
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
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__42) {
				{
				setState(571);
				privateSymbol();
				}
			}

			setState(574);
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
			setState(582);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(577);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__40) | (1L << T__42))) != 0) || _la==Identifier) {
						{
						setState(576);
						privateIdentifier();
						}
					}

					setState(579);
					match(T__15);
					}
					} 
				}
				setState(584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__40) | (1L << T__42))) != 0) || _la==Identifier) {
				{
				setState(585);
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

	public static class SignatureMethodContext extends ParserRuleContext {
		public SignatureMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signatureMethod; }
	}

	public final SignatureMethodContext signatureMethod() throws RecognitionException {
		SignatureMethodContext _localctx = new SignatureMethodContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_signatureMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
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

	public static class ProofMethodContext extends ParserRuleContext {
		public ProofMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proofMethod; }
	}

	public final ProofMethodContext proofMethod() throws RecognitionException {
		ProofMethodContext _localctx = new ProofMethodContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_proofMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__47) | (1L << T__48) | (1L << T__49))) != 0)) ) {
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
		enterRule(_localctx, 94, RULE_cryptoStatement);
		try {
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				signatureStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
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
		enterRule(_localctx, 96, RULE_signatureStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			statementSymbol();
			setState(597);
			match(T__21);
			setState(598);
			signatureMethod();
			setState(599);
			match(T__15);
			setState(606);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(601);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__13 || _la==T__40 || _la==Identifier) {
						{
						setState(600);
						identifier();
						}
					}

					setState(603);
					match(T__15);
					}
					} 
				}
				setState(608);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
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
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__21) | (1L << T__32) | (1L << T__34) | (1L << T__40) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (BooleanLiteral - 103)) | (1L << (DecimalNumber - 103)) | (1L << (HexNumber - 103)) | (1L << (HexLiteral - 103)) | (1L << (TypeKeyword - 103)) | (1L << (Identifier - 103)) | (1L << (StringLiteral - 103)))) != 0)) {
				{
				setState(613);
				primaryExpression();
				}
			}

			setState(616);
			match(T__22);
			setState(617);
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
		enterRule(_localctx, 98, RULE_proofStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			statementSymbol();
			setState(620);
			match(T__21);
			setState(621);
			proofMethod();
			setState(622);
			match(T__15);
			setState(623);
			privateIdentifierList();
			setState(624);
			match(T__15);
			setState(625);
			primaryExpression();
			setState(626);
			match(T__22);
			setState(627);
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
		enterRule(_localctx, 100, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(T__50);
			setState(630);
			match(T__21);
			setState(631);
			expression(0);
			setState(632);
			match(T__22);
			setState(633);
			statement();
			setState(636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(634);
				match(T__51);
				setState(635);
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
		enterRule(_localctx, 102, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(T__52);
			setState(639);
			match(T__21);
			setState(640);
			expression(0);
			setState(641);
			match(T__22);
			setState(642);
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
		enterRule(_localctx, 104, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(644);
				variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(645);
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
		enterRule(_localctx, 106, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(T__24);
			setState(649);
			match(T__21);
			setState(652);
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
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
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
				setState(650);
				simpleStatement();
				}
				break;
			case T__1:
				{
				setState(651);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(656);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__13:
			case T__21:
			case T__32:
			case T__34:
			case T__40:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
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
				setState(654);
				expressionStatement();
				}
				break;
			case T__1:
				{
				setState(655);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__21 - 5)) | (1L << (T__32 - 5)) | (1L << (T__34 - 5)) | (1L << (T__40 - 5)) | (1L << (T__58 - 5)) | (1L << (T__59 - 5)) | (1L << (T__60 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)) | (1L << (T__67 - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (DecimalNumber - 69)) | (1L << (HexNumber - 69)) | (1L << (HexLiteral - 69)) | (1L << (TypeKeyword - 69)) | (1L << (Identifier - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
				{
				setState(658);
				expression(0);
				}
			}

			setState(661);
			match(T__22);
			setState(662);
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
		enterRule(_localctx, 108, RULE_inlineAssemblyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			match(T__53);
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(665);
				match(StringLiteral);
				}
			}

			setState(668);
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
		enterRule(_localctx, 110, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(T__54);
			setState(671);
			statement();
			setState(672);
			match(T__52);
			setState(673);
			match(T__21);
			setState(674);
			expression(0);
			setState(675);
			match(T__22);
			setState(676);
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
		enterRule(_localctx, 112, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			match(ContinueKeyword);
			setState(679);
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
		enterRule(_localctx, 114, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(BreakKeyword);
			setState(682);
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
		enterRule(_localctx, 116, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(T__55);
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__21 - 5)) | (1L << (T__32 - 5)) | (1L << (T__34 - 5)) | (1L << (T__40 - 5)) | (1L << (T__58 - 5)) | (1L << (T__59 - 5)) | (1L << (T__60 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)) | (1L << (T__67 - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (DecimalNumber - 69)) | (1L << (HexNumber - 69)) | (1L << (HexLiteral - 69)) | (1L << (TypeKeyword - 69)) | (1L << (Identifier - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
				{
				setState(685);
				expression(0);
				}
			}

			setState(688);
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
		enterRule(_localctx, 118, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			match(T__56);
			setState(691);
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
		enterRule(_localctx, 120, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(T__57);
			setState(694);
			functionCall();
			setState(695);
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
		enterRule(_localctx, 122, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(697);
				match(T__58);
				setState(698);
				identifierList();
				}
				break;
			case 2:
				{
				setState(699);
				variableDeclaration();
				}
				break;
			case 3:
				{
				setState(700);
				match(T__21);
				setState(701);
				variableDeclarationList();
				setState(702);
				match(T__22);
				}
				break;
			}
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(706);
				match(T__9);
				setState(707);
				expression(0);
				}
			}

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
		enterRule(_localctx, 124, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__28) | (1L << T__34) | (1L << T__36) | (1L << T__40) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (Identifier - 103)))) != 0)) {
				{
				setState(712);
				variableDeclaration();
				}
			}

			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(715);
				match(T__15);
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__28) | (1L << T__34) | (1L << T__36) | (1L << T__40) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)) | (1L << (Identifier - 103)))) != 0)) {
					{
					setState(716);
					variableDeclaration();
					}
				}

				}
				}
				setState(723);
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
		enterRule(_localctx, 126, RULE_identifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(T__21);
			setState(731);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(726);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__13 || _la==T__40 || _la==Identifier) {
						{
						setState(725);
						identifier();
						}
					}

					setState(728);
					match(T__15);
					}
					} 
				}
				setState(733);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__40 || _la==Identifier) {
				{
				setState(734);
				identifier();
				}
			}

			setState(737);
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
		enterRule(_localctx, 128, RULE_elementaryTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Int - 103)) | (1L << (Uint - 103)) | (1L << (Byte - 103)) | (1L << (Fixed - 103)) | (1L << (Ufixed - 103)))) != 0)) ) {
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
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(742);
				match(T__64);
				setState(743);
				typeName(0);
				}
				break;
			case 2:
				{
				setState(744);
				match(T__21);
				setState(745);
				expression(0);
				setState(746);
				match(T__22);
				}
				break;
			case 3:
				{
				setState(748);
				_la = _input.LA(1);
				if ( !(_la==T__62 || _la==T__63) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(749);
				expression(19);
				}
				break;
			case 4:
				{
				setState(750);
				_la = _input.LA(1);
				if ( !(_la==T__65 || _la==T__66) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(751);
				expression(18);
				}
				break;
			case 5:
				{
				setState(752);
				_la = _input.LA(1);
				if ( !(_la==T__67 || _la==T__68) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(753);
				expression(17);
				}
				break;
			case 6:
				{
				setState(754);
				match(T__69);
				setState(755);
				expression(16);
				}
				break;
			case 7:
				{
				setState(756);
				match(T__4);
				setState(757);
				expression(15);
				}
				break;
			case 8:
				{
				setState(758);
				primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(820);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(818);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(761);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(762);
						match(T__70);
						setState(763);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(764);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(765);
						_la = _input.LA(1);
						if ( !(((((_la - 13)) & ~0x3f) == 0 && ((1L << (_la - 13)) & ((1L << (T__12 - 13)) | (1L << (T__71 - 13)) | (1L << (T__72 - 13)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(766);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(767);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(768);
						_la = _input.LA(1);
						if ( !(_la==T__65 || _la==T__66) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(769);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(770);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(771);
						_la = _input.LA(1);
						if ( !(_la==T__73 || _la==T__74) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(772);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(773);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(774);
						match(T__75);
						setState(775);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(776);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(777);
						match(T__3);
						setState(778);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(779);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(780);
						match(T__76);
						setState(781);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(782);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(783);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(784);
						expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(785);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(786);
						_la = _input.LA(1);
						if ( !(_la==T__77 || _la==T__78) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(787);
						expression(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(788);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(789);
						match(T__79);
						setState(790);
						expression(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(791);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(792);
						match(T__80);
						setState(793);
						expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(794);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(795);
						match(T__81);
						setState(796);
						expression(0);
						setState(797);
						match(T__82);
						setState(798);
						expression(4);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(800);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(801);
						_la = _input.LA(1);
						if ( !(_la==T__9 || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (T__83 - 84)) | (1L << (T__84 - 84)) | (1L << (T__85 - 84)) | (1L << (T__86 - 84)) | (1L << (T__87 - 84)) | (1L << (T__88 - 84)) | (1L << (T__89 - 84)) | (1L << (T__90 - 84)) | (1L << (T__91 - 84)) | (1L << (T__92 - 84)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(802);
						expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(803);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(804);
						_la = _input.LA(1);
						if ( !(_la==T__62 || _la==T__63) ) {
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
						setState(805);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(806);
						match(T__32);
						setState(807);
						expression(0);
						setState(808);
						match(T__33);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(810);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(811);
						match(T__21);
						setState(812);
						functionCallArguments();
						setState(813);
						match(T__22);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(815);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(816);
						match(T__35);
						setState(817);
						identifier();
						}
						break;
					}
					} 
				}
				setState(822);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
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
		enterRule(_localctx, 132, RULE_primaryExpression);
		try {
			setState(839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(823);
				match(BooleanLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(824);
				numberLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(825);
				match(HexLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(826);
				match(StringLiteral);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(827);
				identifier();
				setState(830);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(828);
					match(T__32);
					setState(829);
					match(T__33);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(832);
				match(TypeKeyword);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(833);
				tupleExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(834);
				typeNameExpression();
				setState(837);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(835);
					match(T__32);
					setState(836);
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
		enterRule(_localctx, 134, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			expression(0);
			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(842);
				match(T__15);
				setState(843);
				expression(0);
				}
				}
				setState(848);
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
		enterRule(_localctx, 136, RULE_nameValueList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			nameValue();
			setState(854);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(850);
					match(T__15);
					setState(851);
					nameValue();
					}
					} 
				}
				setState(856);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			}
			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(857);
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
		enterRule(_localctx, 138, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			identifier();
			setState(861);
			match(T__82);
			setState(862);
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
		enterRule(_localctx, 140, RULE_functionCallArguments);
		int _la;
		try {
			setState(872);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(864);
				match(T__14);
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13 || _la==T__40 || _la==Identifier) {
					{
					setState(865);
					nameValueList();
					}
				}

				setState(868);
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
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
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
				setState(870);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__21 - 5)) | (1L << (T__32 - 5)) | (1L << (T__34 - 5)) | (1L << (T__40 - 5)) | (1L << (T__58 - 5)) | (1L << (T__59 - 5)) | (1L << (T__60 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)) | (1L << (T__67 - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (DecimalNumber - 69)) | (1L << (HexNumber - 69)) | (1L << (HexLiteral - 69)) | (1L << (TypeKeyword - 69)) | (1L << (Identifier - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
					{
					setState(869);
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
		enterRule(_localctx, 142, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			expression(0);
			setState(875);
			match(T__21);
			setState(876);
			functionCallArguments();
			setState(877);
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
		enterRule(_localctx, 144, RULE_assemblyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			match(T__14);
			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__21) | (1L << T__24) | (1L << T__28) | (1L << T__34) | (1L << T__40) | (1L << T__50) | (1L << T__53) | (1L << T__55) | (1L << T__61))) != 0) || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (T__93 - 94)) | (1L << (T__95 - 94)) | (1L << (T__96 - 94)) | (1L << (DecimalNumber - 94)) | (1L << (HexNumber - 94)) | (1L << (HexLiteral - 94)) | (1L << (BreakKeyword - 94)) | (1L << (ContinueKeyword - 94)) | (1L << (Identifier - 94)) | (1L << (StringLiteral - 94)))) != 0)) {
				{
				{
				setState(880);
				assemblyItem();
				}
				}
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(886);
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
		enterRule(_localctx, 146, RULE_assemblyItem);
		try {
			setState(905);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(888);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(889);
				assemblyBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(890);
				assemblyExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(891);
				assemblyLocalDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(892);
				assemblyAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(893);
				assemblyStackAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(894);
				labelDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(895);
				assemblySwitch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(896);
				assemblyFunctionDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(897);
				assemblyFor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(898);
				assemblyIf();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(899);
				match(BreakKeyword);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(900);
				match(ContinueKeyword);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(901);
				subAssembly();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(902);
				numberLiteral();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(903);
				match(StringLiteral);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(904);
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
		enterRule(_localctx, 148, RULE_assemblyExpression);
		try {
			setState(909);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__34:
			case T__40:
			case T__55:
			case T__61:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(907);
				assemblyCall();
				}
				break;
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(908);
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
		enterRule(_localctx, 150, RULE_assemblyCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__55:
				{
				setState(911);
				match(T__55);
				}
				break;
			case T__34:
				{
				setState(912);
				match(T__34);
				}
				break;
			case T__61:
				{
				setState(913);
				match(T__61);
				}
				break;
			case T__13:
			case T__40:
			case Identifier:
				{
				setState(914);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(917);
				match(T__21);
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__34) | (1L << T__40) | (1L << T__55) | (1L << T__61))) != 0) || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (DecimalNumber - 110)) | (1L << (HexNumber - 110)) | (1L << (HexLiteral - 110)) | (1L << (Identifier - 110)) | (1L << (StringLiteral - 110)))) != 0)) {
					{
					setState(918);
					assemblyExpression();
					}
				}

				setState(925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(921);
					match(T__15);
					setState(922);
					assemblyExpression();
					}
					}
					setState(927);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(928);
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
		enterRule(_localctx, 152, RULE_assemblyLocalDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			match(T__93);
			setState(932);
			assemblyIdentifierOrList();
			setState(935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__94) {
				{
				setState(933);
				match(T__94);
				setState(934);
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
		enterRule(_localctx, 154, RULE_assemblyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			assemblyIdentifierOrList();
			setState(938);
			match(T__94);
			setState(939);
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
		enterRule(_localctx, 156, RULE_assemblyIdentifierOrList);
		try {
			setState(946);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__40:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(941);
				identifier();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(942);
				match(T__21);
				setState(943);
				assemblyIdentifierList();
				setState(944);
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
		enterRule(_localctx, 158, RULE_assemblyIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			identifier();
			setState(953);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(949);
				match(T__15);
				setState(950);
				identifier();
				}
				}
				setState(955);
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
		enterRule(_localctx, 160, RULE_assemblyStackAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			match(T__95);
			setState(957);
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
		enterRule(_localctx, 162, RULE_labelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			identifier();
			setState(960);
			match(T__82);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 164, RULE_assemblySwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			match(T__96);
			setState(963);
			assemblyExpression();
			setState(967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__97 || _la==T__98) {
				{
				{
				setState(964);
				assemblyCase();
				}
				}
				setState(969);
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
		enterRule(_localctx, 166, RULE_assemblyCase);
		try {
			setState(976);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__97:
				enterOuterAlt(_localctx, 1);
				{
				setState(970);
				match(T__97);
				setState(971);
				assemblyLiteral();
				setState(972);
				assemblyBlock();
				}
				break;
			case T__98:
				enterOuterAlt(_localctx, 2);
				{
				setState(974);
				match(T__98);
				setState(975);
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
		enterRule(_localctx, 168, RULE_assemblyFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			match(T__28);
			setState(979);
			identifier();
			setState(980);
			match(T__21);
			setState(982);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13 || _la==T__40 || _la==Identifier) {
				{
				setState(981);
				assemblyIdentifierList();
				}
			}

			setState(984);
			match(T__22);
			setState(986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__99) {
				{
				setState(985);
				assemblyFunctionReturns();
				}
			}

			setState(988);
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
		enterRule(_localctx, 170, RULE_assemblyFunctionReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(990);
			match(T__99);
			setState(991);
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
		enterRule(_localctx, 172, RULE_assemblyFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			match(T__24);
			setState(996);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(994);
				assemblyBlock();
				}
				break;
			case T__13:
			case T__34:
			case T__40:
			case T__55:
			case T__61:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(995);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(998);
			assemblyExpression();
			setState(1001);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(999);
				assemblyBlock();
				}
				break;
			case T__13:
			case T__34:
			case T__40:
			case T__55:
			case T__61:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(1000);
				assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1003);
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
		enterRule(_localctx, 174, RULE_assemblyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			match(T__50);
			setState(1006);
			assemblyExpression();
			setState(1007);
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
		enterRule(_localctx, 176, RULE_assemblyLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			_la = _input.LA(1);
			if ( !(((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (DecimalNumber - 110)) | (1L << (HexNumber - 110)) | (1L << (HexLiteral - 110)) | (1L << (StringLiteral - 110)))) != 0)) ) {
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
		enterRule(_localctx, 178, RULE_subAssembly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			match(T__53);
			setState(1012);
			identifier();
			setState(1013);
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
		enterRule(_localctx, 180, RULE_tupleExpression);
		int _la;
		try {
			setState(1041);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(1015);
				match(T__21);
				{
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__21 - 5)) | (1L << (T__32 - 5)) | (1L << (T__34 - 5)) | (1L << (T__40 - 5)) | (1L << (T__58 - 5)) | (1L << (T__59 - 5)) | (1L << (T__60 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)) | (1L << (T__67 - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (DecimalNumber - 69)) | (1L << (HexNumber - 69)) | (1L << (HexLiteral - 69)) | (1L << (TypeKeyword - 69)) | (1L << (Identifier - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
					{
					setState(1016);
					expression(0);
					}
				}

				setState(1025);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(1019);
					match(T__15);
					setState(1021);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__21 - 5)) | (1L << (T__32 - 5)) | (1L << (T__34 - 5)) | (1L << (T__40 - 5)) | (1L << (T__58 - 5)) | (1L << (T__59 - 5)) | (1L << (T__60 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)) | (1L << (T__67 - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (DecimalNumber - 69)) | (1L << (HexNumber - 69)) | (1L << (HexLiteral - 69)) | (1L << (TypeKeyword - 69)) | (1L << (Identifier - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
						{
						setState(1020);
						expression(0);
						}
					}

					}
					}
					setState(1027);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1028);
				match(T__22);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(1029);
				match(T__32);
				setState(1038);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__4 - 5)) | (1L << (T__13 - 5)) | (1L << (T__21 - 5)) | (1L << (T__32 - 5)) | (1L << (T__34 - 5)) | (1L << (T__40 - 5)) | (1L << (T__58 - 5)) | (1L << (T__59 - 5)) | (1L << (T__60 - 5)) | (1L << (T__61 - 5)) | (1L << (T__62 - 5)) | (1L << (T__63 - 5)) | (1L << (T__64 - 5)) | (1L << (T__65 - 5)) | (1L << (T__66 - 5)) | (1L << (T__67 - 5)))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (Int - 69)) | (1L << (Uint - 69)) | (1L << (Byte - 69)) | (1L << (Fixed - 69)) | (1L << (Ufixed - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (DecimalNumber - 69)) | (1L << (HexNumber - 69)) | (1L << (HexLiteral - 69)) | (1L << (TypeKeyword - 69)) | (1L << (Identifier - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
					{
					setState(1030);
					expression(0);
					setState(1035);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__15) {
						{
						{
						setState(1031);
						match(T__15);
						setState(1032);
						expression(0);
						}
						}
						setState(1037);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1040);
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
		enterRule(_localctx, 182, RULE_typeNameExpression);
		try {
			setState(1045);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				enterOuterAlt(_localctx, 1);
				{
				setState(1043);
				elementaryTypeName();
				}
				break;
			case T__13:
			case T__40:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1044);
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
		enterRule(_localctx, 184, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			_la = _input.LA(1);
			if ( !(_la==DecimalNumber || _la==HexNumber) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1048);
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
		enterRule(_localctx, 186, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
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
		case 65:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0086\u0420\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\3"+
		"\2\3\2\3\2\7\2\u00c2\n\2\f\2\16\2\u00c5\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\5\5\u00d2\n\5\3\6\3\6\5\6\u00d6\n\6\3\7\3\7\3\b\5\b"+
		"\u00db\n\b\3\b\3\b\3\t\3\t\3\t\5\t\u00e2\n\t\3\n\3\n\3\n\3\n\5\n\u00e8"+
		"\n\n\3\n\3\n\3\n\3\n\5\n\u00ee\n\n\3\n\3\n\5\n\u00f2\n\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\7\n\u00fc\n\n\f\n\16\n\u00ff\13\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u0106\n\n\3\13\3\13\3\f\5\f\u010b\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u0113\n\f\f\f\16\f\u0116\13\f\5\f\u0118\n\f\3\f\3\f\7\f\u011c\n\f\f"+
		"\f\16\f\u011f\13\f\3\f\3\f\3\r\3\r\3\r\5\r\u0126\n\r\3\r\5\r\u0129\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0133\n\16\3\17\3\17\7\17"+
		"\u0137\n\17\f\17\16\17\u013a\13\17\3\17\3\17\3\17\5\17\u013f\n\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u0148\n\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\7\21\u0154\n\21\f\21\16\21\u0157\13\21\5\21"+
		"\u0159\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u0165"+
		"\n\23\3\23\3\23\3\24\3\24\3\24\5\24\u016c\n\24\3\24\5\24\u016f\n\24\3"+
		"\25\5\25\u0172\n\25\3\25\3\25\5\25\u0176\n\25\3\25\3\25\3\25\5\25\u017b"+
		"\n\25\3\25\3\25\5\25\u017f\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\7\27\u018a\n\27\f\27\16\27\u018d\13\27\3\30\5\30\u0190\n\30\3\30"+
		"\3\30\3\30\3\30\5\30\u0196\n\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\5\32\u01a0\n\32\3\32\3\32\7\32\u01a4\n\32\f\32\16\32\u01a7\13\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\7\33\u01af\n\33\f\33\16\33\u01b2\13\33\5\33"+
		"\u01b4\n\33\3\33\3\33\3\34\3\34\5\34\u01ba\n\34\3\34\5\34\u01bd\n\34\3"+
		"\35\3\35\3\35\3\35\7\35\u01c3\n\35\f\35\16\35\u01c6\13\35\5\35\u01c8\n"+
		"\35\3\35\3\35\3\36\3\36\5\36\u01ce\n\36\3\36\5\36\u01d1\n\36\3\37\3\37"+
		"\3\37\3\37\7\37\u01d7\n\37\f\37\16\37\u01da\13\37\5\37\u01dc\n\37\3\37"+
		"\3\37\3 \3 \5 \u01e2\n \3!\3!\5!\u01e6\n!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\5\"\u01f1\n\"\3\"\3\"\3\"\5\"\u01f6\n\"\3\"\7\"\u01f9\n\"\f\"\16"+
		"\"\u01fc\13\"\3#\3#\3#\7#\u0201\n#\f#\16#\u0204\13#\3$\3$\3$\3$\3$\3$"+
		"\3$\3%\3%\3%\3%\3%\7%\u0212\n%\f%\16%\u0215\13%\3%\3%\5%\u0219\n%\3&\3"+
		"&\3\'\3\'\3(\3(\7(\u0221\n(\f(\16(\u0224\13(\3(\3(\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\5)\u0235\n)\3*\3*\3*\3+\3+\3,\3,\3-\5-\u023f\n-\3"+
		"-\3-\3.\5.\u0244\n.\3.\7.\u0247\n.\f.\16.\u024a\13.\3.\5.\u024d\n.\3/"+
		"\3/\3\60\3\60\3\61\3\61\5\61\u0255\n\61\3\62\3\62\3\62\3\62\3\62\5\62"+
		"\u025c\n\62\3\62\7\62\u025f\n\62\f\62\16\62\u0262\13\62\3\62\5\62\u0265"+
		"\n\62\3\62\3\62\5\62\u0269\n\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u027f"+
		"\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\5\66\u0289\n\66\3\67\3\67"+
		"\3\67\3\67\5\67\u028f\n\67\3\67\3\67\5\67\u0293\n\67\3\67\5\67\u0296\n"+
		"\67\3\67\3\67\3\67\38\38\58\u029d\n8\38\38\39\39\39\39\39\39\39\39\3:"+
		"\3:\3:\3;\3;\3;\3<\3<\5<\u02b1\n<\3<\3<\3=\3=\3=\3>\3>\3>\3>\3?\3?\3?"+
		"\3?\3?\3?\3?\5?\u02c3\n?\3?\3?\5?\u02c7\n?\3?\3?\3@\5@\u02cc\n@\3@\3@"+
		"\5@\u02d0\n@\7@\u02d2\n@\f@\16@\u02d5\13@\3A\3A\5A\u02d9\nA\3A\7A\u02dc"+
		"\nA\fA\16A\u02df\13A\3A\5A\u02e2\nA\3A\3A\3B\3B\3C\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u02fa\nC\3C\3C\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3"+
		"C\3C\3C\7C\u0335\nC\fC\16C\u0338\13C\3D\3D\3D\3D\3D\3D\3D\5D\u0341\nD"+
		"\3D\3D\3D\3D\3D\5D\u0348\nD\5D\u034a\nD\3E\3E\3E\7E\u034f\nE\fE\16E\u0352"+
		"\13E\3F\3F\3F\7F\u0357\nF\fF\16F\u035a\13F\3F\5F\u035d\nF\3G\3G\3G\3G"+
		"\3H\3H\5H\u0365\nH\3H\3H\5H\u0369\nH\5H\u036b\nH\3I\3I\3I\3I\3I\3J\3J"+
		"\7J\u0374\nJ\fJ\16J\u0377\13J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3"+
		"K\3K\3K\3K\3K\3K\5K\u038c\nK\3L\3L\5L\u0390\nL\3M\3M\3M\3M\5M\u0396\n"+
		"M\3M\3M\5M\u039a\nM\3M\3M\7M\u039e\nM\fM\16M\u03a1\13M\3M\5M\u03a4\nM"+
		"\3N\3N\3N\3N\5N\u03aa\nN\3O\3O\3O\3O\3P\3P\3P\3P\3P\5P\u03b5\nP\3Q\3Q"+
		"\3Q\7Q\u03ba\nQ\fQ\16Q\u03bd\13Q\3R\3R\3R\3S\3S\3S\3T\3T\3T\7T\u03c8\n"+
		"T\fT\16T\u03cb\13T\3U\3U\3U\3U\3U\3U\5U\u03d3\nU\3V\3V\3V\3V\5V\u03d9"+
		"\nV\3V\3V\5V\u03dd\nV\3V\3V\3W\3W\3W\3X\3X\3X\5X\u03e7\nX\3X\3X\3X\5X"+
		"\u03ec\nX\3X\3X\3Y\3Y\3Y\3Y\3Z\3Z\3[\3[\3[\3[\3\\\3\\\5\\\u03fc\n\\\3"+
		"\\\3\\\5\\\u0400\n\\\7\\\u0402\n\\\f\\\16\\\u0405\13\\\3\\\3\\\3\\\3\\"+
		"\3\\\7\\\u040c\n\\\f\\\16\\\u040f\13\\\5\\\u0411\n\\\3\\\5\\\u0414\n\\"+
		"\3]\3]\5]\u0418\n]\3^\3^\5^\u041c\n^\3_\3_\3_\2\4B\u0084`\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\2\26\3\2"+
		"\6\f\3\2gh\3\2\24\26\5\2ww{{}~\3\2)+\6\2ww||\177\177\u0081\u0081\3\2."+
		"\61\3\2\62\64\5\2%%=@im\3\2AB\3\2DE\3\2FG\4\2\17\17JK\3\2LM\3\2\b\13\3"+
		"\2PQ\4\2\f\fV_\5\2pqss\u0083\u0083\3\2pq\5\2\20\20++\u0082\u0082\2\u047e"+
		"\2\u00c3\3\2\2\2\4\u00c8\3\2\2\2\6\u00cd\3\2\2\2\b\u00d1\3\2\2\2\n\u00d3"+
		"\3\2\2\2\f\u00d7\3\2\2\2\16\u00da\3\2\2\2\20\u00de\3\2\2\2\22\u0105\3"+
		"\2\2\2\24\u0107\3\2\2\2\26\u010a\3\2\2\2\30\u0122\3\2\2\2\32\u0132\3\2"+
		"\2\2\34\u0134\3\2\2\2\36\u0142\3\2\2\2 \u014b\3\2\2\2\"\u015c\3\2\2\2"+
		"$\u0161\3\2\2\2&\u0168\3\2\2\2(\u0171\3\2\2\2*\u0180\3\2\2\2,\u018b\3"+
		"\2\2\2.\u018f\3\2\2\2\60\u0199\3\2\2\2\62\u019b\3\2\2\2\64\u01aa\3\2\2"+
		"\2\66\u01b7\3\2\2\28\u01be\3\2\2\2:\u01cb\3\2\2\2<\u01d2\3\2\2\2>\u01df"+
		"\3\2\2\2@\u01e3\3\2\2\2B\u01f0\3\2\2\2D\u01fd\3\2\2\2F\u0205\3\2\2\2H"+
		"\u020c\3\2\2\2J\u021a\3\2\2\2L\u021c\3\2\2\2N\u021e\3\2\2\2P\u0234\3\2"+
		"\2\2R\u0236\3\2\2\2T\u0239\3\2\2\2V\u023b\3\2\2\2X\u023e\3\2\2\2Z\u0248"+
		"\3\2\2\2\\\u024e\3\2\2\2^\u0250\3\2\2\2`\u0254\3\2\2\2b\u0256\3\2\2\2"+
		"d\u026d\3\2\2\2f\u0277\3\2\2\2h\u0280\3\2\2\2j\u0288\3\2\2\2l\u028a\3"+
		"\2\2\2n\u029a\3\2\2\2p\u02a0\3\2\2\2r\u02a8\3\2\2\2t\u02ab\3\2\2\2v\u02ae"+
		"\3\2\2\2x\u02b4\3\2\2\2z\u02b7\3\2\2\2|\u02c2\3\2\2\2~\u02cb\3\2\2\2\u0080"+
		"\u02d6\3\2\2\2\u0082\u02e5\3\2\2\2\u0084\u02f9\3\2\2\2\u0086\u0349\3\2"+
		"\2\2\u0088\u034b\3\2\2\2\u008a\u0353\3\2\2\2\u008c\u035e\3\2\2\2\u008e"+
		"\u036a\3\2\2\2\u0090\u036c\3\2\2\2\u0092\u0371\3\2\2\2\u0094\u038b\3\2"+
		"\2\2\u0096\u038f\3\2\2\2\u0098\u0395\3\2\2\2\u009a\u03a5\3\2\2\2\u009c"+
		"\u03ab\3\2\2\2\u009e\u03b4\3\2\2\2\u00a0\u03b6\3\2\2\2\u00a2\u03be\3\2"+
		"\2\2\u00a4\u03c1\3\2\2\2\u00a6\u03c4\3\2\2\2\u00a8\u03d2\3\2\2\2\u00aa"+
		"\u03d4\3\2\2\2\u00ac\u03e0\3\2\2\2\u00ae\u03e3\3\2\2\2\u00b0\u03ef\3\2"+
		"\2\2\u00b2\u03f3\3\2\2\2\u00b4\u03f5\3\2\2\2\u00b6\u0413\3\2\2\2\u00b8"+
		"\u0417\3\2\2\2\u00ba\u0419\3\2\2\2\u00bc\u041d\3\2\2\2\u00be\u00c2\5\4"+
		"\3\2\u00bf\u00c2\5\22\n\2\u00c0\u00c2\5\26\f\2\u00c1\u00be\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\u00c7\7\2\2\3\u00c7\3\3\2\2\2\u00c8\u00c9\7\3\2\2\u00c9\u00ca\5\6\4\2"+
		"\u00ca\u00cb\5\b\5\2\u00cb\u00cc\7\4\2\2\u00cc\5\3\2\2\2\u00cd\u00ce\7"+
		"\5\2\2\u00ce\7\3\2\2\2\u00cf\u00d2\5\n\6\2\u00d0\u00d2\5\u0084C\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\t\3\2\2\2\u00d3\u00d5\5\16\b"+
		"\2\u00d4\u00d6\5\16\b\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\13\3\2\2\2\u00d7\u00d8\t\2\2\2\u00d8\r\3\2\2\2\u00d9\u00db\5\f\7\2\u00da"+
		"\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\7n"+
		"\2\2\u00dd\17\3\2\2\2\u00de\u00e1\5\u00bc_\2\u00df\u00e0\7\r\2\2\u00e0"+
		"\u00e2\5\u00bc_\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\21\3\2"+
		"\2\2\u00e3\u00e4\7\16\2\2\u00e4\u00e7\7\u0083\2\2\u00e5\u00e6\7\r\2\2"+
		"\u00e6\u00e8\5\u00bc_\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u0106\7\4\2\2\u00ea\u00ed\7\16\2\2\u00eb\u00ee\7"+
		"\17\2\2\u00ec\u00ee\5\u00bc_\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2"+
		"\u00ee\u00f1\3\2\2\2\u00ef\u00f0\7\r\2\2\u00f0\u00f2\5\u00bc_\2\u00f1"+
		"\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7\20"+
		"\2\2\u00f4\u00f5\7\u0083\2\2\u00f5\u0106\7\4\2\2\u00f6\u00f7\7\16\2\2"+
		"\u00f7\u00f8\7\21\2\2\u00f8\u00fd\5\20\t\2\u00f9\u00fa\7\22\2\2\u00fa"+
		"\u00fc\5\20\t\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3"+
		"\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100"+
		"\u0101\7\23\2\2\u0101\u0102\7\20\2\2\u0102\u0103\7\u0083\2\2\u0103\u0104"+
		"\7\4\2\2\u0104\u0106\3\2\2\2\u0105\u00e3\3\2\2\2\u0105\u00ea\3\2\2\2\u0105"+
		"\u00f6\3\2\2\2\u0106\23\3\2\2\2\u0107\u0108\t\3\2\2\u0108\25\3\2\2\2\u0109"+
		"\u010b\5\24\13\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3"+
		"\2\2\2\u010c\u010d\t\4\2\2\u010d\u0117\5\u00bc_\2\u010e\u010f\7\27\2\2"+
		"\u010f\u0114\5\30\r\2\u0110\u0111\7\22\2\2\u0111\u0113\5\30\r\2\u0112"+
		"\u0110\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u010e\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011d\7\21\2\2\u011a\u011c\5"+
		"\32\16\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7\23"+
		"\2\2\u0121\27\3\2\2\2\u0122\u0128\5D#\2\u0123\u0125\7\30\2\2\u0124\u0126"+
		"\5\u0088E\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2"+
		"\2\u0127\u0129\7\31\2\2\u0128\u0123\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\31\3\2\2\2\u012a\u0133\5\34\17\2\u012b\u0133\5\36\20\2\u012c\u0133\5"+
		" \21\2\u012d\u0133\5\"\22\2\u012e\u0133\5$\23\2\u012f\u0133\5(\25\2\u0130"+
		"\u0133\5.\30\2\u0131\u0133\5\62\32\2\u0132\u012a\3\2\2\2\u0132\u012b\3"+
		"\2\2\2\u0132\u012c\3\2\2\2\u0132\u012d\3\2\2\2\u0132\u012e\3\2\2\2\u0132"+
		"\u012f\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133\33\3\2\2"+
		"\2\u0134\u0138\5B\"\2\u0135\u0137\t\5\2\2\u0136\u0135\3\2\2\2\u0137\u013a"+
		"\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013b\u013e\5\u00bc_\2\u013c\u013d\7\f\2\2\u013d\u013f"+
		"\5\u0084C\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2"+
		"\2\u0140\u0141\7\4\2\2\u0141\35\3\2\2\2\u0142\u0143\7\32\2\2\u0143\u0144"+
		"\5\u00bc_\2\u0144\u0147\7\33\2\2\u0145\u0148\7\17\2\2\u0146\u0148\5B\""+
		"\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a"+
		"\7\4\2\2\u014a\37\3\2\2\2\u014b\u014c\7\34\2\2\u014c\u014d\5\u00bc_\2"+
		"\u014d\u0158\7\21\2\2\u014e\u014f\5@!\2\u014f\u0155\7\4\2\2\u0150\u0151"+
		"\5@!\2\u0151\u0152\7\4\2\2\u0152\u0154\3\2\2\2\u0153\u0150\3\2\2\2\u0154"+
		"\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0159\3\2"+
		"\2\2\u0157\u0155\3\2\2\2\u0158\u014e\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015b\7\23\2\2\u015b!\3\2\2\2\u015c\u015d\7\35\2"+
		"\2\u015d\u015e\5\64\33\2\u015e\u015f\5,\27\2\u015f\u0160\5N(\2\u0160#"+
		"\3\2\2\2\u0161\u0162\7\36\2\2\u0162\u0164\5\u00bc_\2\u0163\u0165\5\64"+
		"\33\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u0167\5N(\2\u0167%\3\2\2\2\u0168\u016e\5\u00bc_\2\u0169\u016b\7\30\2"+
		"\2\u016a\u016c\5\u0088E\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\u016f\7\31\2\2\u016e\u0169\3\2\2\2\u016e\u016f\3"+
		"\2\2\2\u016f\'\3\2\2\2\u0170\u0172\5\24\13\2\u0171\u0170\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\7\37\2\2\u0174\u0176\5"+
		"\u00bc_\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2"+
		"\u0177\u0178\5\64\33\2\u0178\u017a\5,\27\2\u0179\u017b\5*\26\2\u017a\u0179"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017f\7\4\2\2\u017d"+
		"\u017f\5N(\2\u017e\u017c\3\2\2\2\u017e\u017d\3\2\2\2\u017f)\3\2\2\2\u0180"+
		"\u0181\7 \2\2\u0181\u0182\5\64\33\2\u0182+\3\2\2\2\u0183\u018a\5&\24\2"+
		"\u0184\u018a\5L\'\2\u0185\u018a\7y\2\2\u0186\u018a\7~\2\2\u0187\u018a"+
		"\7{\2\2\u0188\u018a\7}\2\2\u0189\u0183\3\2\2\2\u0189\u0184\3\2\2\2\u0189"+
		"\u0185\3\2\2\2\u0189\u0186\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2"+
		"\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"-\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u0190\5\24\13\2\u018f\u018e\3\2\2"+
		"\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\7!\2\2\u0192\u0193"+
		"\5\u00bc_\2\u0193\u0195\58\35\2\u0194\u0196\7u\2\2\u0195\u0194\3\2\2\2"+
		"\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\7\4\2\2\u0198/\3"+
		"\2\2\2\u0199\u019a\5\u00bc_\2\u019a\61\3\2\2\2\u019b\u019c\7\"\2\2\u019c"+
		"\u019d\5\u00bc_\2\u019d\u019f\7\21\2\2\u019e\u01a0\5\60\31\2\u019f\u019e"+
		"\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a5\3\2\2\2\u01a1\u01a2\7\22\2\2"+
		"\u01a2\u01a4\5\60\31\2\u01a3\u01a1\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3"+
		"\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8"+
		"\u01a9\7\23\2\2\u01a9\63\3\2\2\2\u01aa\u01b3\7\30\2\2\u01ab\u01b0\5\66"+
		"\34\2\u01ac\u01ad\7\22\2\2\u01ad\u01af\5\66\34\2\u01ae\u01ac\3\2\2\2\u01af"+
		"\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b4\3\2"+
		"\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01ab\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\u01b6\7\31\2\2\u01b6\65\3\2\2\2\u01b7\u01b9\5B\""+
		"\2\u01b8\u01ba\5J&\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc"+
		"\3\2\2\2\u01bb\u01bd\5\u00bc_\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2"+
		"\2\u01bd\67\3\2\2\2\u01be\u01c7\7\30\2\2\u01bf\u01c4\5:\36\2\u01c0\u01c1"+
		"\7\22\2\2\u01c1\u01c3\5:\36\2\u01c2\u01c0\3\2\2\2\u01c3\u01c6\3\2\2\2"+
		"\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4"+
		"\3\2\2\2\u01c7\u01bf\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u01ca\7\31\2\2\u01ca9\3\2\2\2\u01cb\u01cd\5B\"\2\u01cc\u01ce\7z\2\2\u01cd"+
		"\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01d1\5\u00bc"+
		"_\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1;\3\2\2\2\u01d2\u01db"+
		"\7\30\2\2\u01d3\u01d8\5> \2\u01d4\u01d5\7\22\2\2\u01d5\u01d7\5> \2\u01d6"+
		"\u01d4\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2"+
		"\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01d3\3\2\2\2\u01db"+
		"\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\7\31\2\2\u01de=\3\2\2\2"+
		"\u01df\u01e1\5B\"\2\u01e0\u01e2\5J&\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2"+
		"\3\2\2\2\u01e2?\3\2\2\2\u01e3\u01e5\5B\"\2\u01e4\u01e6\5J&\2\u01e5\u01e4"+
		"\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\5\u00bc_"+
		"\2\u01e8A\3\2\2\2\u01e9\u01ea\b\"\1\2\u01ea\u01f1\5\u0082B\2\u01eb\u01f1"+
		"\5D#\2\u01ec\u01f1\5F$\2\u01ed\u01f1\5H%\2\u01ee\u01ef\7%\2\2\u01ef\u01f1"+
		"\7|\2\2\u01f0\u01e9\3\2\2\2\u01f0\u01eb\3\2\2\2\u01f0\u01ec\3\2\2\2\u01f0"+
		"\u01ed\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01fa\3\2\2\2\u01f2\u01f3\f\5"+
		"\2\2\u01f3\u01f5\7#\2\2\u01f4\u01f6\5\u0084C\2\u01f5\u01f4\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\7$\2\2\u01f8\u01f2\3\2"+
		"\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"C\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u0202\5\u00bc_\2\u01fe\u01ff\7&\2"+
		"\2\u01ff\u0201\5\u00bc_\2\u0200\u01fe\3\2\2\2\u0201\u0204\3\2\2\2\u0202"+
		"\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203E\3\2\2\2\u0204\u0202\3\2\2\2"+
		"\u0205\u0206\7\'\2\2\u0206\u0207\7\30\2\2\u0207\u0208\5\u0082B\2\u0208"+
		"\u0209\7(\2\2\u0209\u020a\5B\"\2\u020a\u020b\7\31\2\2\u020bG\3\2\2\2\u020c"+
		"\u020d\7\37\2\2\u020d\u0213\5<\37\2\u020e\u0212\7{\2\2\u020f\u0212\7y"+
		"\2\2\u0210\u0212\5L\'\2\u0211\u020e\3\2\2\2\u0211\u020f\3\2\2\2\u0211"+
		"\u0210\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2"+
		"\2\2\u0214\u0218\3\2\2\2\u0215\u0213\3\2\2\2\u0216\u0217\7 \2\2\u0217"+
		"\u0219\5<\37\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219I\3\2\2\2"+
		"\u021a\u021b\t\6\2\2\u021bK\3\2\2\2\u021c\u021d\t\7\2\2\u021dM\3\2\2\2"+
		"\u021e\u0222\7\21\2\2\u021f\u0221\5P)\2\u0220\u021f\3\2\2\2\u0221\u0224"+
		"\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0225\3\2\2\2\u0224"+
		"\u0222\3\2\2\2\u0225\u0226\7\23\2\2\u0226O\3\2\2\2\u0227\u0235\5f\64\2"+
		"\u0228\u0235\5h\65\2\u0229\u0235\5l\67\2\u022a\u0235\5N(\2\u022b\u0235"+
		"\5n8\2\u022c\u0235\5p9\2\u022d\u0235\5r:\2\u022e\u0235\5t;\2\u022f\u0235"+
		"\5v<\2\u0230\u0235\5x=\2\u0231\u0235\5z>\2\u0232\u0235\5j\66\2\u0233\u0235"+
		"\5`\61\2\u0234\u0227\3\2\2\2\u0234\u0228\3\2\2\2\u0234\u0229\3\2\2\2\u0234"+
		"\u022a\3\2\2\2\u0234\u022b\3\2\2\2\u0234\u022c\3\2\2\2\u0234\u022d\3\2"+
		"\2\2\u0234\u022e\3\2\2\2\u0234\u022f\3\2\2\2\u0234\u0230\3\2\2\2\u0234"+
		"\u0231\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0233\3\2\2\2\u0235Q\3\2\2\2"+
		"\u0236\u0237\5\u0084C\2\u0237\u0238\7\4\2\2\u0238S\3\2\2\2\u0239\u023a"+
		"\7,\2\2\u023aU\3\2\2\2\u023b\u023c\7-\2\2\u023cW\3\2\2\2\u023d\u023f\5"+
		"V,\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\3\2\2\2\u0240"+
		"\u0241\5\u00bc_\2\u0241Y\3\2\2\2\u0242\u0244\5X-\2\u0243\u0242\3\2\2\2"+
		"\u0243\u0244\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247\7\22\2\2\u0246\u0243"+
		"\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249"+
		"\u024c\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u024d\5X-\2\u024c\u024b\3\2\2"+
		"\2\u024c\u024d\3\2\2\2\u024d[\3\2\2\2\u024e\u024f\t\b\2\2\u024f]\3\2\2"+
		"\2\u0250\u0251\t\t\2\2\u0251_\3\2\2\2\u0252\u0255\5b\62\2\u0253\u0255"+
		"\5d\63\2\u0254\u0252\3\2\2\2\u0254\u0253\3\2\2\2\u0255a\3\2\2\2\u0256"+
		"\u0257\5T+\2\u0257\u0258\7\30\2\2\u0258\u0259\5\\/\2\u0259\u0260\7\22"+
		"\2\2\u025a\u025c\5\u00bc_\2\u025b\u025a\3\2\2\2\u025b\u025c\3\2\2\2\u025c"+
		"\u025d\3\2\2\2\u025d\u025f\7\22\2\2\u025e\u025b\3\2\2\2\u025f\u0262\3"+
		"\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0264\3\2\2\2\u0262"+
		"\u0260\3\2\2\2\u0263\u0265\5\u00bc_\2\u0264\u0263\3\2\2\2\u0264\u0265"+
		"\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0268\7\22\2\2\u0267\u0269\5\u0086"+
		"D\2\u0268\u0267\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a\3\2\2\2\u026a"+
		"\u026b\7\31\2\2\u026b\u026c\7\4\2\2\u026cc\3\2\2\2\u026d\u026e\5T+\2\u026e"+
		"\u026f\7\30\2\2\u026f\u0270\5^\60\2\u0270\u0271\7\22\2\2\u0271\u0272\5"+
		"Z.\2\u0272\u0273\7\22\2\2\u0273\u0274\5\u0086D\2\u0274\u0275\7\31\2\2"+
		"\u0275\u0276\7\4\2\2\u0276e\3\2\2\2\u0277\u0278\7\65\2\2\u0278\u0279\7"+
		"\30\2\2\u0279\u027a\5\u0084C\2\u027a\u027b\7\31\2\2\u027b\u027e\5P)\2"+
		"\u027c\u027d\7\66\2\2\u027d\u027f\5P)\2\u027e\u027c\3\2\2\2\u027e\u027f"+
		"\3\2\2\2\u027fg\3\2\2\2\u0280\u0281\7\67\2\2\u0281\u0282\7\30\2\2\u0282"+
		"\u0283\5\u0084C\2\u0283\u0284\7\31\2\2\u0284\u0285\5P)\2\u0285i\3\2\2"+
		"\2\u0286\u0289\5|?\2\u0287\u0289\5R*\2\u0288\u0286\3\2\2\2\u0288\u0287"+
		"\3\2\2\2\u0289k\3\2\2\2\u028a\u028b\7\33\2\2\u028b\u028e\7\30\2\2\u028c"+
		"\u028f\5j\66\2\u028d\u028f\7\4\2\2\u028e\u028c\3\2\2\2\u028e\u028d\3\2"+
		"\2\2\u028f\u0292\3\2\2\2\u0290\u0293\5R*\2\u0291\u0293\7\4\2\2\u0292\u0290"+
		"\3\2\2\2\u0292\u0291\3\2\2\2\u0293\u0295\3\2\2\2\u0294\u0296\5\u0084C"+
		"\2\u0295\u0294\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0298"+
		"\7\31\2\2\u0298\u0299\5P)\2\u0299m\3\2\2\2\u029a\u029c\78\2\2\u029b\u029d"+
		"\7\u0083\2\2\u029c\u029b\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e\3\2\2"+
		"\2\u029e\u029f\5\u0092J\2\u029fo\3\2\2\2\u02a0\u02a1\79\2\2\u02a1\u02a2"+
		"\5P)\2\u02a2\u02a3\7\67\2\2\u02a3\u02a4\7\30\2\2\u02a4\u02a5\5\u0084C"+
		"\2\u02a5\u02a6\7\31\2\2\u02a6\u02a7\7\4\2\2\u02a7q\3\2\2\2\u02a8\u02a9"+
		"\7x\2\2\u02a9\u02aa\7\4\2\2\u02aas\3\2\2\2\u02ab\u02ac\7v\2\2\u02ac\u02ad"+
		"\7\4\2\2\u02adu\3\2\2\2\u02ae\u02b0\7:\2\2\u02af\u02b1\5\u0084C\2\u02b0"+
		"\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\7\4"+
		"\2\2\u02b3w\3\2\2\2\u02b4\u02b5\7;\2\2\u02b5\u02b6\7\4\2\2\u02b6y\3\2"+
		"\2\2\u02b7\u02b8\7<\2\2\u02b8\u02b9\5\u0090I\2\u02b9\u02ba\7\4\2\2\u02ba"+
		"{\3\2\2\2\u02bb\u02bc\7=\2\2\u02bc\u02c3\5\u0080A\2\u02bd\u02c3\5@!\2"+
		"\u02be\u02bf\7\30\2\2\u02bf\u02c0\5~@\2\u02c0\u02c1\7\31\2\2\u02c1\u02c3"+
		"\3\2\2\2\u02c2\u02bb\3\2\2\2\u02c2\u02bd\3\2\2\2\u02c2\u02be\3\2\2\2\u02c3"+
		"\u02c6\3\2\2\2\u02c4\u02c5\7\f\2\2\u02c5\u02c7\5\u0084C\2\u02c6\u02c4"+
		"\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\7\4\2\2\u02c9"+
		"}\3\2\2\2\u02ca\u02cc\5@!\2\u02cb\u02ca\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc"+
		"\u02d3\3\2\2\2\u02cd\u02cf\7\22\2\2\u02ce\u02d0\5@!\2\u02cf\u02ce\3\2"+
		"\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2\3\2\2\2\u02d1\u02cd\3\2\2\2\u02d2"+
		"\u02d5\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\177\3\2\2"+
		"\2\u02d5\u02d3\3\2\2\2\u02d6\u02dd\7\30\2\2\u02d7\u02d9\5\u00bc_\2\u02d8"+
		"\u02d7\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02dc\7\22"+
		"\2\2\u02db\u02d8\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd"+
		"\u02de\3\2\2\2\u02de\u02e1\3\2\2\2\u02df\u02dd\3\2\2\2\u02e0\u02e2\5\u00bc"+
		"_\2\u02e1\u02e0\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3"+
		"\u02e4\7\31\2\2\u02e4\u0081\3\2\2\2\u02e5\u02e6\t\n\2\2\u02e6\u0083\3"+
		"\2\2\2\u02e7\u02e8\bC\1\2\u02e8\u02e9\7C\2\2\u02e9\u02fa\5B\"\2\u02ea"+
		"\u02eb\7\30\2\2\u02eb\u02ec\5\u0084C\2\u02ec\u02ed\7\31\2\2\u02ed\u02fa"+
		"\3\2\2\2\u02ee\u02ef\t\13\2\2\u02ef\u02fa\5\u0084C\25\u02f0\u02f1\t\f"+
		"\2\2\u02f1\u02fa\5\u0084C\24\u02f2\u02f3\t\r\2\2\u02f3\u02fa\5\u0084C"+
		"\23\u02f4\u02f5\7H\2\2\u02f5\u02fa\5\u0084C\22\u02f6\u02f7\7\7\2\2\u02f7"+
		"\u02fa\5\u0084C\21\u02f8\u02fa\5\u0086D\2\u02f9\u02e7\3\2\2\2\u02f9\u02ea"+
		"\3\2\2\2\u02f9\u02ee\3\2\2\2\u02f9\u02f0\3\2\2\2\u02f9\u02f2\3\2\2\2\u02f9"+
		"\u02f4\3\2\2\2\u02f9\u02f6\3\2\2\2\u02f9\u02f8\3\2\2\2\u02fa\u0336\3\2"+
		"\2\2\u02fb\u02fc\f\20\2\2\u02fc\u02fd\7I\2\2\u02fd\u0335\5\u0084C\21\u02fe"+
		"\u02ff\f\17\2\2\u02ff\u0300\t\16\2\2\u0300\u0335\5\u0084C\20\u0301\u0302"+
		"\f\16\2\2\u0302\u0303\t\f\2\2\u0303\u0335\5\u0084C\17\u0304\u0305\f\r"+
		"\2\2\u0305\u0306\t\17\2\2\u0306\u0335\5\u0084C\16\u0307\u0308\f\f\2\2"+
		"\u0308\u0309\7N\2\2\u0309\u0335\5\u0084C\r\u030a\u030b\f\13\2\2\u030b"+
		"\u030c\7\6\2\2\u030c\u0335\5\u0084C\f\u030d\u030e\f\n\2\2\u030e\u030f"+
		"\7O\2\2\u030f\u0335\5\u0084C\13\u0310\u0311\f\t\2\2\u0311\u0312\t\20\2"+
		"\2\u0312\u0335\5\u0084C\n\u0313\u0314\f\b\2\2\u0314\u0315\t\21\2\2\u0315"+
		"\u0335\5\u0084C\t\u0316\u0317\f\7\2\2\u0317\u0318\7R\2\2\u0318\u0335\5"+
		"\u0084C\b\u0319\u031a\f\6\2\2\u031a\u031b\7S\2\2\u031b\u0335\5\u0084C"+
		"\7\u031c\u031d\f\5\2\2\u031d\u031e\7T\2\2\u031e\u031f\5\u0084C\2\u031f"+
		"\u0320\7U\2\2\u0320\u0321\5\u0084C\6\u0321\u0335\3\2\2\2\u0322\u0323\f"+
		"\4\2\2\u0323\u0324\t\22\2\2\u0324\u0335\5\u0084C\5\u0325\u0326\f\33\2"+
		"\2\u0326\u0335\t\13\2\2\u0327\u0328\f\31\2\2\u0328\u0329\7#\2\2\u0329"+
		"\u032a\5\u0084C\2\u032a\u032b\7$\2\2\u032b\u0335\3\2\2\2\u032c\u032d\f"+
		"\30\2\2\u032d\u032e\7\30\2\2\u032e\u032f\5\u008eH\2\u032f\u0330\7\31\2"+
		"\2\u0330\u0335\3\2\2\2\u0331\u0332\f\27\2\2\u0332\u0333\7&\2\2\u0333\u0335"+
		"\5\u00bc_\2\u0334\u02fb\3\2\2\2\u0334\u02fe\3\2\2\2\u0334\u0301\3\2\2"+
		"\2\u0334\u0304\3\2\2\2\u0334\u0307\3\2\2\2\u0334\u030a\3\2\2\2\u0334\u030d"+
		"\3\2\2\2\u0334\u0310\3\2\2\2\u0334\u0313\3\2\2\2\u0334\u0316\3\2\2\2\u0334"+
		"\u0319\3\2\2\2\u0334\u031c\3\2\2\2\u0334\u0322\3\2\2\2\u0334\u0325\3\2"+
		"\2\2\u0334\u0327\3\2\2\2\u0334\u032c\3\2\2\2\u0334\u0331\3\2\2\2\u0335"+
		"\u0338\3\2\2\2\u0336\u0334\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0085\3\2"+
		"\2\2\u0338\u0336\3\2\2\2\u0339\u034a\7o\2\2\u033a\u034a\5\u00ba^\2\u033b"+
		"\u034a\7s\2\2\u033c\u034a\7\u0083\2\2\u033d\u0340\5\u00bc_\2\u033e\u033f"+
		"\7#\2\2\u033f\u0341\7$\2\2\u0340\u033e\3\2\2\2\u0340\u0341\3\2\2\2\u0341"+
		"\u034a\3\2\2\2\u0342\u034a\7\u0080\2\2\u0343\u034a\5\u00b6\\\2\u0344\u0347"+
		"\5\u00b8]\2\u0345\u0346\7#\2\2\u0346\u0348\7$\2\2\u0347\u0345\3\2\2\2"+
		"\u0347\u0348\3\2\2\2\u0348\u034a\3\2\2\2\u0349\u0339\3\2\2\2\u0349\u033a"+
		"\3\2\2\2\u0349\u033b\3\2\2\2\u0349\u033c\3\2\2\2\u0349\u033d\3\2\2\2\u0349"+
		"\u0342\3\2\2\2\u0349\u0343\3\2\2\2\u0349\u0344\3\2\2\2\u034a\u0087\3\2"+
		"\2\2\u034b\u0350\5\u0084C\2\u034c\u034d\7\22\2\2\u034d\u034f\5\u0084C"+
		"\2\u034e\u034c\3\2\2\2\u034f\u0352\3\2\2\2\u0350\u034e\3\2\2\2\u0350\u0351"+
		"\3\2\2\2\u0351\u0089\3\2\2\2\u0352\u0350\3\2\2\2\u0353\u0358\5\u008cG"+
		"\2\u0354\u0355\7\22\2\2\u0355\u0357\5\u008cG\2\u0356\u0354\3\2\2\2\u0357"+
		"\u035a\3\2\2\2\u0358\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035c\3\2"+
		"\2\2\u035a\u0358\3\2\2\2\u035b\u035d\7\22\2\2\u035c\u035b\3\2\2\2\u035c"+
		"\u035d\3\2\2\2\u035d\u008b\3\2\2\2\u035e\u035f\5\u00bc_\2\u035f\u0360"+
		"\7U\2\2\u0360\u0361\5\u0084C\2\u0361\u008d\3\2\2\2\u0362\u0364\7\21\2"+
		"\2\u0363\u0365\5\u008aF\2\u0364\u0363\3\2\2\2\u0364\u0365\3\2\2\2\u0365"+
		"\u0366\3\2\2\2\u0366\u036b\7\23\2\2\u0367\u0369\5\u0088E\2\u0368\u0367"+
		"\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036b\3\2\2\2\u036a\u0362\3\2\2\2\u036a"+
		"\u0368\3\2\2\2\u036b\u008f\3\2\2\2\u036c\u036d\5\u0084C\2\u036d\u036e"+
		"\7\30\2\2\u036e\u036f\5\u008eH\2\u036f\u0370\7\31\2\2\u0370\u0091\3\2"+
		"\2\2\u0371\u0375\7\21\2\2\u0372\u0374\5\u0094K\2\u0373\u0372\3\2\2\2\u0374"+
		"\u0377\3\2\2\2\u0375\u0373\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0378\3\2"+
		"\2\2\u0377\u0375\3\2\2\2\u0378\u0379\7\23\2\2\u0379\u0093\3\2\2\2\u037a"+
		"\u038c\5\u00bc_\2\u037b\u038c\5\u0092J\2\u037c\u038c\5\u0096L\2\u037d"+
		"\u038c\5\u009aN\2\u037e\u038c\5\u009cO\2\u037f\u038c\5\u00a2R\2\u0380"+
		"\u038c\5\u00a4S\2\u0381\u038c\5\u00a6T\2\u0382\u038c\5\u00aaV\2\u0383"+
		"\u038c\5\u00aeX\2\u0384\u038c\5\u00b0Y\2\u0385\u038c\7v\2\2\u0386\u038c"+
		"\7x\2\2\u0387\u038c\5\u00b4[\2\u0388\u038c\5\u00ba^\2\u0389\u038c\7\u0083"+
		"\2\2\u038a\u038c\7s\2\2\u038b\u037a\3\2\2\2\u038b\u037b\3\2\2\2\u038b"+
		"\u037c\3\2\2\2\u038b\u037d\3\2\2\2\u038b\u037e\3\2\2\2\u038b\u037f\3\2"+
		"\2\2\u038b\u0380\3\2\2\2\u038b\u0381\3\2\2\2\u038b\u0382\3\2\2\2\u038b"+
		"\u0383\3\2\2\2\u038b\u0384\3\2\2\2\u038b\u0385\3\2\2\2\u038b\u0386\3\2"+
		"\2\2\u038b\u0387\3\2\2\2\u038b\u0388\3\2\2\2\u038b\u0389\3\2\2\2\u038b"+
		"\u038a\3\2\2\2\u038c\u0095\3\2\2\2\u038d\u0390\5\u0098M\2\u038e\u0390"+
		"\5\u00b2Z\2\u038f\u038d\3\2\2\2\u038f\u038e\3\2\2\2\u0390\u0097\3\2\2"+
		"\2\u0391\u0396\7:\2\2\u0392\u0396\7%\2\2\u0393\u0396\7@\2\2\u0394\u0396"+
		"\5\u00bc_\2\u0395\u0391\3\2\2\2\u0395\u0392\3\2\2\2\u0395\u0393\3\2\2"+
		"\2\u0395\u0394\3\2\2\2\u0396\u03a3\3\2\2\2\u0397\u0399\7\30\2\2\u0398"+
		"\u039a\5\u0096L\2\u0399\u0398\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039f"+
		"\3\2\2\2\u039b\u039c\7\22\2\2\u039c\u039e\5\u0096L\2\u039d\u039b\3\2\2"+
		"\2\u039e\u03a1\3\2\2\2\u039f\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a2"+
		"\3\2\2\2\u03a1\u039f\3\2\2\2\u03a2\u03a4\7\31\2\2\u03a3\u0397\3\2\2\2"+
		"\u03a3\u03a4\3\2\2\2\u03a4\u0099\3\2\2\2\u03a5\u03a6\7`\2\2\u03a6\u03a9"+
		"\5\u009eP\2\u03a7\u03a8\7a\2\2\u03a8\u03aa\5\u0096L\2\u03a9\u03a7\3\2"+
		"\2\2\u03a9\u03aa\3\2\2\2\u03aa\u009b\3\2\2\2\u03ab\u03ac\5\u009eP\2\u03ac"+
		"\u03ad\7a\2\2\u03ad\u03ae\5\u0096L\2\u03ae\u009d\3\2\2\2\u03af\u03b5\5"+
		"\u00bc_\2\u03b0\u03b1\7\30\2\2\u03b1\u03b2\5\u00a0Q\2\u03b2\u03b3\7\31"+
		"\2\2\u03b3\u03b5\3\2\2\2\u03b4\u03af\3\2\2\2\u03b4\u03b0\3\2\2\2\u03b5"+
		"\u009f\3\2\2\2\u03b6\u03bb\5\u00bc_\2\u03b7\u03b8\7\22\2\2\u03b8\u03ba"+
		"\5\u00bc_\2\u03b9\u03b7\3\2\2\2\u03ba\u03bd\3\2\2\2\u03bb\u03b9\3\2\2"+
		"\2\u03bb\u03bc\3\2\2\2\u03bc\u00a1\3\2\2\2\u03bd\u03bb\3\2\2\2\u03be\u03bf"+
		"\7b\2\2\u03bf\u03c0\5\u00bc_\2\u03c0\u00a3\3\2\2\2\u03c1\u03c2\5\u00bc"+
		"_\2\u03c2\u03c3\7U\2\2\u03c3\u00a5\3\2\2\2\u03c4\u03c5\7c\2\2\u03c5\u03c9"+
		"\5\u0096L\2\u03c6\u03c8\5\u00a8U\2\u03c7\u03c6\3\2\2\2\u03c8\u03cb\3\2"+
		"\2\2\u03c9\u03c7\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u00a7\3\2\2\2\u03cb"+
		"\u03c9\3\2\2\2\u03cc\u03cd\7d\2\2\u03cd\u03ce\5\u00b2Z\2\u03ce\u03cf\5"+
		"\u0092J\2\u03cf\u03d3\3\2\2\2\u03d0\u03d1\7e\2\2\u03d1\u03d3\5\u0092J"+
		"\2\u03d2\u03cc\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d3\u00a9\3\2\2\2\u03d4\u03d5"+
		"\7\37\2\2\u03d5\u03d6\5\u00bc_\2\u03d6\u03d8\7\30\2\2\u03d7\u03d9\5\u00a0"+
		"Q\2\u03d8\u03d7\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03da\3\2\2\2\u03da"+
		"\u03dc\7\31\2\2\u03db\u03dd\5\u00acW\2\u03dc\u03db\3\2\2\2\u03dc\u03dd"+
		"\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df\5\u0092J\2\u03df\u00ab\3\2\2"+
		"\2\u03e0\u03e1\7f\2\2\u03e1\u03e2\5\u00a0Q\2\u03e2\u00ad\3\2\2\2\u03e3"+
		"\u03e6\7\33\2\2\u03e4\u03e7\5\u0092J\2\u03e5\u03e7\5\u0096L\2\u03e6\u03e4"+
		"\3\2\2\2\u03e6\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03eb\5\u0096L"+
		"\2\u03e9\u03ec\5\u0092J\2\u03ea\u03ec\5\u0096L\2\u03eb\u03e9\3\2\2\2\u03eb"+
		"\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u03ee\5\u0092J\2\u03ee\u00af"+
		"\3\2\2\2\u03ef\u03f0\7\65\2\2\u03f0\u03f1\5\u0096L\2\u03f1\u03f2\5\u0092"+
		"J\2\u03f2\u00b1\3\2\2\2\u03f3\u03f4\t\23\2\2\u03f4\u00b3\3\2\2\2\u03f5"+
		"\u03f6\78\2\2\u03f6\u03f7\5\u00bc_\2\u03f7\u03f8\5\u0092J\2\u03f8\u00b5"+
		"\3\2\2\2\u03f9\u03fb\7\30\2\2\u03fa\u03fc\5\u0084C\2\u03fb\u03fa\3\2\2"+
		"\2\u03fb\u03fc\3\2\2\2\u03fc\u0403\3\2\2\2\u03fd\u03ff\7\22\2\2\u03fe"+
		"\u0400\5\u0084C\2\u03ff\u03fe\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0402"+
		"\3\2\2\2\u0401\u03fd\3\2\2\2\u0402\u0405\3\2\2\2\u0403\u0401\3\2\2\2\u0403"+
		"\u0404\3\2\2\2\u0404\u0406\3\2\2\2\u0405\u0403\3\2\2\2\u0406\u0414\7\31"+
		"\2\2\u0407\u0410\7#\2\2\u0408\u040d\5\u0084C\2\u0409\u040a\7\22\2\2\u040a"+
		"\u040c\5\u0084C\2\u040b\u0409\3\2\2\2\u040c\u040f\3\2\2\2\u040d\u040b"+
		"\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u0411\3\2\2\2\u040f\u040d\3\2\2\2\u0410"+
		"\u0408\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0414\7$"+
		"\2\2\u0413\u03f9\3\2\2\2\u0413\u0407\3\2\2\2\u0414\u00b7\3\2\2\2\u0415"+
		"\u0418\5\u0082B\2\u0416\u0418\5D#\2\u0417\u0415\3\2\2\2\u0417\u0416\3"+
		"\2\2\2\u0418\u00b9\3\2\2\2\u0419\u041b\t\24\2\2\u041a\u041c\7r\2\2\u041b"+
		"\u041a\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u00bb\3\2\2\2\u041d\u041e\t\25"+
		"\2\2\u041e\u00bd\3\2\2\2w\u00c1\u00c3\u00d1\u00d5\u00da\u00e1\u00e7\u00ed"+
		"\u00f1\u00fd\u0105\u010a\u0114\u0117\u011d\u0125\u0128\u0132\u0138\u013e"+
		"\u0147\u0155\u0158\u0164\u016b\u016e\u0171\u0175\u017a\u017e\u0189\u018b"+
		"\u018f\u0195\u019f\u01a5\u01b0\u01b3\u01b9\u01bc\u01c4\u01c7\u01cd\u01d0"+
		"\u01d8\u01db\u01e1\u01e5\u01f0\u01f5\u01fa\u0202\u0211\u0213\u0218\u0222"+
		"\u0234\u023e\u0243\u0248\u024c\u0254\u025b\u0260\u0264\u0268\u027e\u0288"+
		"\u028e\u0292\u0295\u029c\u02b0\u02c2\u02c6\u02cb\u02cf\u02d3\u02d8\u02dd"+
		"\u02e1\u02f9\u0334\u0336\u0340\u0347\u0349\u0350\u0358\u035c\u0364\u0368"+
		"\u036a\u0375\u038b\u038f\u0395\u0399\u039f\u03a3\u03a9\u03b4\u03bb\u03c9"+
		"\u03d2\u03d8\u03dc\u03e6\u03eb\u03fb\u03ff\u0403\u040d\u0410\u0413\u0417"+
		"\u041b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}