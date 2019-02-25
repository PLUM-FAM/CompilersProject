// Generated from Plum.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlumParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		KEYWORD=32, OPERATOR=33, COMMENT=34, IDENTIFIER=35, STRINGLITERAL=36, 
		FLOATLITERAL=37, INTLITERAL=38, WS=39;
	public static final int
		RULE_r = 0, RULE_program = 1, RULE_id = 2, RULE_pgm_body = 3, RULE_decl = 4, 
		RULE_string_decl = 5, RULE_str = 6, RULE_var_decl = 7, RULE_var_type = 8, 
		RULE_any_type = 9, RULE_id_list = 10, RULE_id_tail = 11, RULE_param_decl_list = 12, 
		RULE_param_decl = 13, RULE_param_decl_tail = 14, RULE_func_declarations = 15, 
		RULE_func_decl = 16, RULE_func_body = 17, RULE_stmt_list = 18, RULE_stmt = 19, 
		RULE_base_stmt = 20, RULE_assign_stmt = 21, RULE_assign_expr = 22, RULE_read_stmt = 23, 
		RULE_write_stmt = 24, RULE_return_stmt = 25, RULE_expr = 26, RULE_expr_prefix = 27, 
		RULE_expr_recurse = 28, RULE_factor = 29, RULE_factor_prefix = 30, RULE_factor_recurse = 31, 
		RULE_postfix_expr = 32, RULE_call_expr = 33, RULE_expr_list = 34, RULE_expr_list_tail = 35, 
		RULE_primary = 36, RULE_addop = 37, RULE_mulop = 38, RULE_if_stmt = 39, 
		RULE_else_part = 40, RULE_cond = 41, RULE_compop = 42, RULE_while_stmt = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "program", "id", "pgm_body", "decl", "string_decl", "str", "var_decl", 
			"var_type", "any_type", "id_list", "id_tail", "param_decl_list", "param_decl", 
			"param_decl_tail", "func_declarations", "func_decl", "func_body", "stmt_list", 
			"stmt", "base_stmt", "assign_stmt", "assign_expr", "read_stmt", "write_stmt", 
			"return_stmt", "expr", "expr_prefix", "expr_recurse", "factor", "factor_prefix", 
			"factor_recurse", "postfix_expr", "call_expr", "expr_list", "expr_list_tail", 
			"primary", "addop", "mulop", "if_stmt", "else_part", "cond", "compop", 
			"while_stmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'BEGIN'", "'END'", "'STRING'", "':='", "';'", "'FLOAT'", 
			"'INT'", "'VOID'", "','", "'FUNCTION'", "'('", "')'", "'READ'", "'WRITE'", 
			"'RETURN'", "'+'", "'-'", "'*'", "'/'", "'IF'", "'ENDIF'", "'ELSE'", 
			"'<'", "'>'", "'='", "'!='", "'<='", "'>='", "'WHILE'", "'ENDWHILE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "KEYWORD", "OPERATOR", 
			"COMMENT", "IDENTIFIER", "STRINGLITERAL", "FLOATLITERAL", "INTLITERAL", 
			"WS"
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
	public String getGrammarFileName() { return "Plum.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlumParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PlumParser.EOF, 0); }
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			program();
			setState(89);
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

	public static class ProgramContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Pgm_bodyContext pgm_body() {
			return getRuleContext(Pgm_bodyContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__0);
			setState(92);
			id();
			setState(93);
			match(T__1);
			setState(94);
			pgm_body();
			setState(95);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PlumParser.IDENTIFIER, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pgm_bodyContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Func_declarationsContext func_declarations() {
			return getRuleContext(Func_declarationsContext.class,0);
		}
		public Pgm_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pgm_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterPgm_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitPgm_body(this);
		}
	}

	public final Pgm_bodyContext pgm_body() throws RecognitionException {
		Pgm_bodyContext _localctx = new Pgm_bodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pgm_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(99);
				decl();
				}
				break;
			}
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(102);
				func_declarations();
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

	public static class DeclContext extends ParserRuleContext {
		public String_declContext string_decl() {
			return getRuleContext(String_declContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decl);
		int _la;
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(105);
					string_decl();
					setState(106);
					decl();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6 || _la==T__7) {
					{
					setState(110);
					var_decl();
					setState(111);
					decl();
					}
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

	public static class String_declContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public StrContext str() {
			return getRuleContext(StrContext.class,0);
		}
		public String_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterString_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitString_decl(this);
		}
	}

	public final String_declContext string_decl() throws RecognitionException {
		String_declContext _localctx = new String_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_string_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__3);
			setState(118);
			id();
			setState(119);
			match(T__4);
			setState(120);
			str();
			setState(121);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL() { return getToken(PlumParser.STRINGLITERAL, 0); }
		public StrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitStr(this);
		}
	}

	public final StrContext str() throws RecognitionException {
		StrContext _localctx = new StrContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_str);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(STRINGLITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			var_type();
			setState(126);
			id_list();
			setState(127);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_typeContext extends ParserRuleContext {
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitVar_type(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
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

	public static class Any_typeContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public Any_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterAny_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitAny_type(this);
		}
	}

	public final Any_typeContext any_type() throws RecognitionException {
		Any_typeContext _localctx = new Any_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_any_type);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				var_type();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(T__8);
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

	public static class Id_listContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Id_tailContext id_tail() {
			return getRuleContext(Id_tailContext.class,0);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterId_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitId_list(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		Id_listContext _localctx = new Id_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_id_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			id();
			setState(136);
			id_tail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Id_tailContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Id_tailContext id_tail() {
			return getRuleContext(Id_tailContext.class,0);
		}
		public Id_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterId_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitId_tail(this);
		}
	}

	public final Id_tailContext id_tail() throws RecognitionException {
		Id_tailContext _localctx = new Id_tailContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_id_tail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(138);
				match(T__9);
				setState(139);
				id();
				setState(140);
				id_tail();
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

	public static class Param_decl_listContext extends ParserRuleContext {
		public Param_declContext param_decl() {
			return getRuleContext(Param_declContext.class,0);
		}
		public Param_decl_tailContext param_decl_tail() {
			return getRuleContext(Param_decl_tailContext.class,0);
		}
		public Param_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterParam_decl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitParam_decl_list(this);
		}
	}

	public final Param_decl_listContext param_decl_list() throws RecognitionException {
		Param_decl_listContext _localctx = new Param_decl_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_param_decl_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			param_decl();
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(145);
				param_decl_tail();
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

	public static class Param_declContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Param_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterParam_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitParam_decl(this);
		}
	}

	public final Param_declContext param_decl() throws RecognitionException {
		Param_declContext _localctx = new Param_declContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_param_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			var_type();
			setState(149);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Param_decl_tailContext extends ParserRuleContext {
		public Param_declContext param_decl() {
			return getRuleContext(Param_declContext.class,0);
		}
		public Param_decl_tailContext param_decl_tail() {
			return getRuleContext(Param_decl_tailContext.class,0);
		}
		public Param_decl_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterParam_decl_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitParam_decl_tail(this);
		}
	}

	public final Param_decl_tailContext param_decl_tail() throws RecognitionException {
		Param_decl_tailContext _localctx = new Param_decl_tailContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_param_decl_tail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(151);
				match(T__9);
				setState(152);
				param_decl();
				setState(153);
				param_decl_tail();
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

	public static class Func_declarationsContext extends ParserRuleContext {
		public Func_declContext func_decl() {
			return getRuleContext(Func_declContext.class,0);
		}
		public Func_declarationsContext func_declarations() {
			return getRuleContext(Func_declarationsContext.class,0);
		}
		public Func_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterFunc_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitFunc_declarations(this);
		}
	}

	public final Func_declarationsContext func_declarations() throws RecognitionException {
		Func_declarationsContext _localctx = new Func_declarationsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_func_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			func_decl();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(158);
				func_declarations();
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

	public static class Func_declContext extends ParserRuleContext {
		public Any_typeContext any_type() {
			return getRuleContext(Any_typeContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Param_decl_listContext param_decl_list() {
			return getRuleContext(Param_decl_listContext.class,0);
		}
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public Func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterFunc_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitFunc_decl(this);
		}
	}

	public final Func_declContext func_decl() throws RecognitionException {
		Func_declContext _localctx = new Func_declContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_func_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__10);
			setState(162);
			any_type();
			setState(163);
			id();
			setState(164);
			match(T__11);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6 || _la==T__7) {
				{
				setState(165);
				param_decl_list();
				}
			}

			setState(168);
			match(T__12);
			setState(169);
			match(T__1);
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(170);
				func_body();
				}
				break;
			}
			setState(173);
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

	public static class Func_bodyContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterFunc_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitFunc_body(this);
		}
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_func_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			decl();
			setState(176);
			stmt_list();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stmt_listContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterStmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitStmt_list(this);
		}
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__20) | (1L << T__29) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(178);
				stmt();
				setState(179);
				stmt_list();
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

	public static class StmtContext extends ParserRuleContext {
		public Base_stmtContext base_stmt() {
			return getRuleContext(Base_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stmt);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__14:
			case T__15:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				base_stmt();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				if_stmt();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				while_stmt();
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

	public static class Base_stmtContext extends ParserRuleContext {
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public Read_stmtContext read_stmt() {
			return getRuleContext(Read_stmtContext.class,0);
		}
		public Write_stmtContext write_stmt() {
			return getRuleContext(Write_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Base_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterBase_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitBase_stmt(this);
		}
	}

	public final Base_stmtContext base_stmt() throws RecognitionException {
		Base_stmtContext _localctx = new Base_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_base_stmt);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				assign_stmt();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				read_stmt();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				write_stmt();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				return_stmt();
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

	public static class Assign_stmtContext extends ParserRuleContext {
		public Assign_exprContext assign_expr() {
			return getRuleContext(Assign_exprContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitAssign_stmt(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			assign_expr();
			setState(195);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_exprContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterAssign_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitAssign_expr(this);
		}
	}

	public final Assign_exprContext assign_expr() throws RecognitionException {
		Assign_exprContext _localctx = new Assign_exprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assign_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			id();
			setState(198);
			match(T__4);
			setState(199);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Read_stmtContext extends ParserRuleContext {
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Read_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterRead_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitRead_stmt(this);
		}
	}

	public final Read_stmtContext read_stmt() throws RecognitionException {
		Read_stmtContext _localctx = new Read_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_read_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__13);
			setState(202);
			match(T__11);
			setState(203);
			id_list();
			setState(204);
			match(T__12);
			setState(205);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Write_stmtContext extends ParserRuleContext {
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Write_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterWrite_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitWrite_stmt(this);
		}
	}

	public final Write_stmtContext write_stmt() throws RecognitionException {
		Write_stmtContext _localctx = new Write_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_write_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__14);
			setState(208);
			match(T__11);
			setState(209);
			id_list();
			setState(210);
			match(T__12);
			setState(211);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitReturn_stmt(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__15);
			setState(214);
			expr();
			setState(215);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Expr_prefixContext expr_prefix() {
			return getRuleContext(Expr_prefixContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			expr_prefix();
			setState(218);
			factor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_prefixContext extends ParserRuleContext {
		public Expr_recurseContext expr_recurse() {
			return getRuleContext(Expr_recurseContext.class,0);
		}
		public Expr_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterExpr_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitExpr_prefix(this);
		}
	}

	public final Expr_prefixContext expr_prefix() throws RecognitionException {
		Expr_prefixContext _localctx = new Expr_prefixContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expr_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			expr_recurse();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_recurseContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public AddopContext addop() {
			return getRuleContext(AddopContext.class,0);
		}
		public Expr_recurseContext expr_recurse() {
			return getRuleContext(Expr_recurseContext.class,0);
		}
		public Expr_recurseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_recurse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterExpr_recurse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitExpr_recurse(this);
		}
	}

	public final Expr_recurseContext expr_recurse() throws RecognitionException {
		Expr_recurseContext _localctx = new Expr_recurseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expr_recurse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(222);
				factor();
				setState(223);
				addop();
				setState(224);
				expr_recurse();
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

	public static class FactorContext extends ParserRuleContext {
		public Factor_prefixContext factor_prefix() {
			return getRuleContext(Factor_prefixContext.class,0);
		}
		public Postfix_exprContext postfix_expr() {
			return getRuleContext(Postfix_exprContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			factor_prefix();
			setState(229);
			postfix_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor_prefixContext extends ParserRuleContext {
		public Factor_recurseContext factor_recurse() {
			return getRuleContext(Factor_recurseContext.class,0);
		}
		public Factor_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterFactor_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitFactor_prefix(this);
		}
	}

	public final Factor_prefixContext factor_prefix() throws RecognitionException {
		Factor_prefixContext _localctx = new Factor_prefixContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_factor_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			factor_recurse();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factor_recurseContext extends ParserRuleContext {
		public Postfix_exprContext postfix_expr() {
			return getRuleContext(Postfix_exprContext.class,0);
		}
		public MulopContext mulop() {
			return getRuleContext(MulopContext.class,0);
		}
		public Factor_recurseContext factor_recurse() {
			return getRuleContext(Factor_recurseContext.class,0);
		}
		public Factor_recurseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_recurse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterFactor_recurse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitFactor_recurse(this);
		}
	}

	public final Factor_recurseContext factor_recurse() throws RecognitionException {
		Factor_recurseContext _localctx = new Factor_recurseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_factor_recurse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(233);
				postfix_expr();
				setState(234);
				mulop();
				setState(235);
				factor_recurse();
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

	public static class Postfix_exprContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public Call_exprContext call_expr() {
			return getRuleContext(Call_exprContext.class,0);
		}
		public Postfix_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterPostfix_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitPostfix_expr(this);
		}
	}

	public final Postfix_exprContext postfix_expr() throws RecognitionException {
		Postfix_exprContext _localctx = new Postfix_exprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_postfix_expr);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				call_expr();
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

	public static class Call_exprContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Call_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterCall_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitCall_expr(this);
		}
	}

	public final Call_exprContext call_expr() throws RecognitionException {
		Call_exprContext _localctx = new Call_exprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_call_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			id();
			setState(244);
			match(T__11);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << IDENTIFIER) | (1L << FLOATLITERAL) | (1L << INTLITERAL))) != 0)) {
				{
				setState(245);
				expr_list();
				}
			}

			setState(248);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_listContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_list_tailContext expr_list_tail() {
			return getRuleContext(Expr_list_tailContext.class,0);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterExpr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitExpr_list(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expr_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			expr();
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(251);
				expr_list_tail();
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

	public static class Expr_list_tailContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_list_tailContext expr_list_tail() {
			return getRuleContext(Expr_list_tailContext.class,0);
		}
		public Expr_list_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterExpr_list_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitExpr_list_tail(this);
		}
	}

	public final Expr_list_tailContext expr_list_tail() throws RecognitionException {
		Expr_list_tailContext _localctx = new Expr_list_tailContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expr_list_tail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(254);
				match(T__9);
				setState(255);
				expr();
				setState(256);
				expr_list_tail();
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

	public static class PrimaryContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode INTLITERAL() { return getToken(PlumParser.INTLITERAL, 0); }
		public TerminalNode FLOATLITERAL() { return getToken(PlumParser.FLOATLITERAL, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_primary);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(T__11);
				setState(261);
				expr();
				setState(262);
				match(T__12);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				id();
				}
				break;
			case INTLITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				match(INTLITERAL);
				}
				break;
			case FLOATLITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				match(FLOATLITERAL);
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

	public static class AddopContext extends ParserRuleContext {
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterAddop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitAddop(this);
		}
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
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

	public static class MulopContext extends ParserRuleContext {
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterMulop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitMulop(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !(_la==T__18 || _la==T__19) ) {
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

	public static class If_stmtContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Else_partContext else_part() {
			return getRuleContext(Else_partContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T__20);
			setState(274);
			match(T__11);
			setState(275);
			cond();
			setState(276);
			match(T__12);
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(277);
				decl();
				}
				break;
			}
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(280);
				stmt_list();
				}
				break;
			}
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(283);
				else_part();
				}
				break;
			}
			setState(286);
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

	public static class Else_partContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public Else_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterElse_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitElse_part(this);
		}
	}

	public final Else_partContext else_part() throws RecognitionException {
		Else_partContext _localctx = new Else_partContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_else_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(288);
				match(T__22);
				setState(289);
				decl();
				setState(290);
				stmt_list();
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

	public static class CondContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompopContext compop() {
			return getRuleContext(CompopContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			expr();
			setState(295);
			compop();
			setState(296);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompopContext extends ParserRuleContext {
		public CompopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterCompop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitCompop(this);
		}
	}

	public final CompopContext compop() throws RecognitionException {
		CompopContext _localctx = new CompopContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_compop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
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

	public static class While_stmtContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlumListener ) ((PlumListener)listener).exitWhile_stmt(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__29);
			setState(301);
			match(T__11);
			setState(302);
			cond();
			setState(303);
			match(T__12);
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(304);
				decl();
				}
				break;
			}
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(307);
				stmt_list();
				}
				break;
			}
			setState(310);
			match(T__30);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u013b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\5\5g\n\5\3"+
		"\5\5\5j\n\5\3\6\3\6\3\6\5\6o\n\6\3\6\3\6\3\6\5\6t\n\6\5\6v\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\5\13\u0088"+
		"\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0091\n\r\3\16\3\16\5\16\u0095\n"+
		"\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u009e\n\20\3\21\3\21\5\21"+
		"\u00a2\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u00a9\n\22\3\22\3\22\3\22\5"+
		"\22\u00ae\n\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u00b8\n\24"+
		"\3\25\3\25\3\25\5\25\u00bd\n\25\3\26\3\26\3\26\3\26\5\26\u00c3\n\26\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\5\36\u00e5\n\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3!\5"+
		"!\u00f0\n!\3\"\3\"\5\"\u00f4\n\"\3#\3#\3#\5#\u00f9\n#\3#\3#\3$\3$\5$\u00ff"+
		"\n$\3%\3%\3%\3%\5%\u0105\n%\3&\3&\3&\3&\3&\3&\3&\5&\u010e\n&\3\'\3\'\3"+
		"(\3(\3)\3)\3)\3)\3)\5)\u0119\n)\3)\5)\u011c\n)\3)\5)\u011f\n)\3)\3)\3"+
		"*\3*\3*\3*\5*\u0127\n*\3+\3+\3+\3+\3,\3,\3-\3-\3-\3-\3-\5-\u0134\n-\3"+
		"-\5-\u0137\n-\3-\3-\3-\2\2.\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX\2\6\3\2\t\n\3\2\23\24\3\2\25\26\3"+
		"\2\32\37\2\u012f\2Z\3\2\2\2\4]\3\2\2\2\6c\3\2\2\2\bf\3\2\2\2\nu\3\2\2"+
		"\2\fw\3\2\2\2\16}\3\2\2\2\20\177\3\2\2\2\22\u0083\3\2\2\2\24\u0087\3\2"+
		"\2\2\26\u0089\3\2\2\2\30\u0090\3\2\2\2\32\u0092\3\2\2\2\34\u0096\3\2\2"+
		"\2\36\u009d\3\2\2\2 \u009f\3\2\2\2\"\u00a3\3\2\2\2$\u00b1\3\2\2\2&\u00b7"+
		"\3\2\2\2(\u00bc\3\2\2\2*\u00c2\3\2\2\2,\u00c4\3\2\2\2.\u00c7\3\2\2\2\60"+
		"\u00cb\3\2\2\2\62\u00d1\3\2\2\2\64\u00d7\3\2\2\2\66\u00db\3\2\2\28\u00de"+
		"\3\2\2\2:\u00e4\3\2\2\2<\u00e6\3\2\2\2>\u00e9\3\2\2\2@\u00ef\3\2\2\2B"+
		"\u00f3\3\2\2\2D\u00f5\3\2\2\2F\u00fc\3\2\2\2H\u0104\3\2\2\2J\u010d\3\2"+
		"\2\2L\u010f\3\2\2\2N\u0111\3\2\2\2P\u0113\3\2\2\2R\u0126\3\2\2\2T\u0128"+
		"\3\2\2\2V\u012c\3\2\2\2X\u012e\3\2\2\2Z[\5\4\3\2[\\\7\2\2\3\\\3\3\2\2"+
		"\2]^\7\3\2\2^_\5\6\4\2_`\7\4\2\2`a\5\b\5\2ab\7\5\2\2b\5\3\2\2\2cd\7%\2"+
		"\2d\7\3\2\2\2eg\5\n\6\2fe\3\2\2\2fg\3\2\2\2gi\3\2\2\2hj\5 \21\2ih\3\2"+
		"\2\2ij\3\2\2\2j\t\3\2\2\2kl\5\f\7\2lm\5\n\6\2mo\3\2\2\2nk\3\2\2\2no\3"+
		"\2\2\2ov\3\2\2\2pq\5\20\t\2qr\5\n\6\2rt\3\2\2\2sp\3\2\2\2st\3\2\2\2tv"+
		"\3\2\2\2un\3\2\2\2us\3\2\2\2v\13\3\2\2\2wx\7\6\2\2xy\5\6\4\2yz\7\7\2\2"+
		"z{\5\16\b\2{|\7\b\2\2|\r\3\2\2\2}~\7&\2\2~\17\3\2\2\2\177\u0080\5\22\n"+
		"\2\u0080\u0081\5\26\f\2\u0081\u0082\7\b\2\2\u0082\21\3\2\2\2\u0083\u0084"+
		"\t\2\2\2\u0084\23\3\2\2\2\u0085\u0088\5\22\n\2\u0086\u0088\7\13\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\25\3\2\2\2\u0089\u008a\5\6\4"+
		"\2\u008a\u008b\5\30\r\2\u008b\27\3\2\2\2\u008c\u008d\7\f\2\2\u008d\u008e"+
		"\5\6\4\2\u008e\u008f\5\30\r\2\u008f\u0091\3\2\2\2\u0090\u008c\3\2\2\2"+
		"\u0090\u0091\3\2\2\2\u0091\31\3\2\2\2\u0092\u0094\5\34\17\2\u0093\u0095"+
		"\5\36\20\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\33\3\2\2\2\u0096"+
		"\u0097\5\22\n\2\u0097\u0098\5\6\4\2\u0098\35\3\2\2\2\u0099\u009a\7\f\2"+
		"\2\u009a\u009b\5\34\17\2\u009b\u009c\5\36\20\2\u009c\u009e\3\2\2\2\u009d"+
		"\u0099\3\2\2\2\u009d\u009e\3\2\2\2\u009e\37\3\2\2\2\u009f\u00a1\5\"\22"+
		"\2\u00a0\u00a2\5 \21\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2!"+
		"\3\2\2\2\u00a3\u00a4\7\r\2\2\u00a4\u00a5\5\24\13\2\u00a5\u00a6\5\6\4\2"+
		"\u00a6\u00a8\7\16\2\2\u00a7\u00a9\5\32\16\2\u00a8\u00a7\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\17\2\2\u00ab\u00ad\7"+
		"\4\2\2\u00ac\u00ae\5$\23\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b0\7\5\2\2\u00b0#\3\2\2\2\u00b1\u00b2\5\n\6\2"+
		"\u00b2\u00b3\5&\24\2\u00b3%\3\2\2\2\u00b4\u00b5\5(\25\2\u00b5\u00b6\5"+
		"&\24\2\u00b6\u00b8\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\'\3\2\2\2\u00b9\u00bd\5*\26\2\u00ba\u00bd\5P)\2\u00bb\u00bd\5X-\2\u00bc"+
		"\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd)\3\2\2\2"+
		"\u00be\u00c3\5,\27\2\u00bf\u00c3\5\60\31\2\u00c0\u00c3\5\62\32\2\u00c1"+
		"\u00c3\5\64\33\2\u00c2\u00be\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c2\u00c0\3"+
		"\2\2\2\u00c2\u00c1\3\2\2\2\u00c3+\3\2\2\2\u00c4\u00c5\5.\30\2\u00c5\u00c6"+
		"\7\b\2\2\u00c6-\3\2\2\2\u00c7\u00c8\5\6\4\2\u00c8\u00c9\7\7\2\2\u00c9"+
		"\u00ca\5\66\34\2\u00ca/\3\2\2\2\u00cb\u00cc\7\20\2\2\u00cc\u00cd\7\16"+
		"\2\2\u00cd\u00ce\5\26\f\2\u00ce\u00cf\7\17\2\2\u00cf\u00d0\7\b\2\2\u00d0"+
		"\61\3\2\2\2\u00d1\u00d2\7\21\2\2\u00d2\u00d3\7\16\2\2\u00d3\u00d4\5\26"+
		"\f\2\u00d4\u00d5\7\17\2\2\u00d5\u00d6\7\b\2\2\u00d6\63\3\2\2\2\u00d7\u00d8"+
		"\7\22\2\2\u00d8\u00d9\5\66\34\2\u00d9\u00da\7\b\2\2\u00da\65\3\2\2\2\u00db"+
		"\u00dc\58\35\2\u00dc\u00dd\5<\37\2\u00dd\67\3\2\2\2\u00de\u00df\5:\36"+
		"\2\u00df9\3\2\2\2\u00e0\u00e1\5<\37\2\u00e1\u00e2\5L\'\2\u00e2\u00e3\5"+
		":\36\2\u00e3\u00e5\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		";\3\2\2\2\u00e6\u00e7\5> \2\u00e7\u00e8\5B\"\2\u00e8=\3\2\2\2\u00e9\u00ea"+
		"\5@!\2\u00ea?\3\2\2\2\u00eb\u00ec\5B\"\2\u00ec\u00ed\5N(\2\u00ed\u00ee"+
		"\5@!\2\u00ee\u00f0\3\2\2\2\u00ef\u00eb\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"A\3\2\2\2\u00f1\u00f4\5J&\2\u00f2\u00f4\5D#\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f2\3\2\2\2\u00f4C\3\2\2\2\u00f5\u00f6\5\6\4\2\u00f6\u00f8\7\16\2\2"+
		"\u00f7\u00f9\5F$\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u00fb\7\17\2\2\u00fbE\3\2\2\2\u00fc\u00fe\5\66\34\2\u00fd"+
		"\u00ff\5H%\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ffG\3\2\2\2\u0100"+
		"\u0101\7\f\2\2\u0101\u0102\5\66\34\2\u0102\u0103\5H%\2\u0103\u0105\3\2"+
		"\2\2\u0104\u0100\3\2\2\2\u0104\u0105\3\2\2\2\u0105I\3\2\2\2\u0106\u0107"+
		"\7\16\2\2\u0107\u0108\5\66\34\2\u0108\u0109\7\17\2\2\u0109\u010e\3\2\2"+
		"\2\u010a\u010e\5\6\4\2\u010b\u010e\7(\2\2\u010c\u010e\7\'\2\2\u010d\u0106"+
		"\3\2\2\2\u010d\u010a\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e"+
		"K\3\2\2\2\u010f\u0110\t\3\2\2\u0110M\3\2\2\2\u0111\u0112\t\4\2\2\u0112"+
		"O\3\2\2\2\u0113\u0114\7\27\2\2\u0114\u0115\7\16\2\2\u0115\u0116\5T+\2"+
		"\u0116\u0118\7\17\2\2\u0117\u0119\5\n\6\2\u0118\u0117\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u011c\5&\24\2\u011b\u011a\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011f\5R*\2\u011e\u011d\3\2\2"+
		"\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\7\30\2\2\u0121"+
		"Q\3\2\2\2\u0122\u0123\7\31\2\2\u0123\u0124\5\n\6\2\u0124\u0125\5&\24\2"+
		"\u0125\u0127\3\2\2\2\u0126\u0122\3\2\2\2\u0126\u0127\3\2\2\2\u0127S\3"+
		"\2\2\2\u0128\u0129\5\66\34\2\u0129\u012a\5V,\2\u012a\u012b\5\66\34\2\u012b"+
		"U\3\2\2\2\u012c\u012d\t\5\2\2\u012dW\3\2\2\2\u012e\u012f\7 \2\2\u012f"+
		"\u0130\7\16\2\2\u0130\u0131\5T+\2\u0131\u0133\7\17\2\2\u0132\u0134\5\n"+
		"\6\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135"+
		"\u0137\5&\24\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138\u0139\7!\2\2\u0139Y\3\2\2\2\36finsu\u0087\u0090\u0094\u009d"+
		"\u00a1\u00a8\u00ad\u00b7\u00bc\u00c2\u00e4\u00ef\u00f3\u00f8\u00fe\u0104"+
		"\u010d\u0118\u011b\u011e\u0126\u0133\u0136";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}