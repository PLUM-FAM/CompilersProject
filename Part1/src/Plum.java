// Generated from Plum.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Plum extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, KEYWORD=2, OPERATOR=3, COMMENT=4, IDENTIFIER=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "KEYWORD", "OPERATOR", "COMMENT", "IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "KEYWORD", "OPERATOR", "COMMENT", "IDENTIFIER"
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


	public Plum(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Plum.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7\u0093\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\17\n\2\r\2\16\2\20\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3r\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4~\n\4\3\5\3\5\3\5\3\5\7\5\u0084\n\5\f\5\16\5\u0087\13\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\7\6\u008f\n\6\f\6\16\6\u0092\13\6\3\u0085\2\7\3\3\5\4"+
		"\7\5\t\6\13\7\3\2\7\5\2\13\f\17\17\"\"\6\2,-//\61\61??\6\2*+..=>@@\3\2"+
		"C|\4\2\62;C|\2\u00ab\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\3\16\3\2\2\2\5q\3\2\2\2\7}\3\2\2\2\t\177\3\2\2\2\13\u008c"+
		"\3\2\2\2\r\17\t\2\2\2\16\r\3\2\2\2\17\20\3\2\2\2\20\16\3\2\2\2\20\21\3"+
		"\2\2\2\21\22\3\2\2\2\22\23\b\2\2\2\23\4\3\2\2\2\24\25\7R\2\2\25\26\7T"+
		"\2\2\26\27\7Q\2\2\27\30\7I\2\2\30\31\7T\2\2\31\32\7C\2\2\32r\7O\2\2\33"+
		"\34\7D\2\2\34\35\7G\2\2\35\36\7I\2\2\36\37\7K\2\2\37r\7P\2\2 !\7G\2\2"+
		"!\"\7P\2\2\"r\7F\2\2#$\7H\2\2$%\7W\2\2%&\7P\2\2&\'\7E\2\2\'(\7V\2\2()"+
		"\7K\2\2)*\7Q\2\2*r\7P\2\2+,\7T\2\2,-\7G\2\2-.\7C\2\2.r\7F\2\2/\60\7Y\2"+
		"\2\60\61\7T\2\2\61\62\7K\2\2\62\63\7V\2\2\63r\7G\2\2\64\65\7K\2\2\65r"+
		"\7H\2\2\66\67\7G\2\2\678\7N\2\289\7U\2\29r\7G\2\2:;\7G\2\2;<\7P\2\2<="+
		"\7F\2\2=>\7K\2\2>r\7H\2\2?@\7Y\2\2@A\7J\2\2AB\7K\2\2BC\7N\2\2Cr\7G\2\2"+
		"DE\7G\2\2EF\7P\2\2FG\7F\2\2GH\7Y\2\2HI\7J\2\2IJ\7K\2\2JK\7N\2\2Kr\7G\2"+
		"\2LM\7E\2\2MN\7Q\2\2NO\7P\2\2OP\7V\2\2PQ\7K\2\2QR\7P\2\2RS\7W\2\2Sr\7"+
		"G\2\2TU\7D\2\2UV\7T\2\2VW\7G\2\2WX\7C\2\2Xr\7M\2\2YZ\7T\2\2Z[\7G\2\2["+
		"\\\7V\2\2\\]\7W\2\2]^\7T\2\2^r\7P\2\2_`\7K\2\2`a\7P\2\2ar\7V\2\2bc\7X"+
		"\2\2cd\7Q\2\2de\7K\2\2er\7F\2\2fg\7U\2\2gh\7V\2\2hi\7T\2\2ij\7K\2\2jk"+
		"\7P\2\2kr\7I\2\2lm\7H\2\2mn\7N\2\2no\7Q\2\2op\7C\2\2pr\7V\2\2q\24\3\2"+
		"\2\2q\33\3\2\2\2q \3\2\2\2q#\3\2\2\2q+\3\2\2\2q/\3\2\2\2q\64\3\2\2\2q"+
		"\66\3\2\2\2q:\3\2\2\2q?\3\2\2\2qD\3\2\2\2qL\3\2\2\2qT\3\2\2\2qY\3\2\2"+
		"\2q_\3\2\2\2qb\3\2\2\2qf\3\2\2\2ql\3\2\2\2r\6\3\2\2\2st\7<\2\2t~\7?\2"+
		"\2u~\t\3\2\2vw\7#\2\2w~\7?\2\2x~\t\4\2\2yz\7>\2\2z~\7?\2\2{|\7@\2\2|~"+
		"\7?\2\2}s\3\2\2\2}u\3\2\2\2}v\3\2\2\2}x\3\2\2\2}y\3\2\2\2}{\3\2\2\2~\b"+
		"\3\2\2\2\177\u0080\7/\2\2\u0080\u0081\7/\2\2\u0081\u0085\3\2\2\2\u0082"+
		"\u0084\13\2\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u0089\7\f\2\2\u0089\u008a\3\2\2\2\u008a\u008b\b\5\2\2\u008b\n\3\2\2\2"+
		"\u008c\u0090\t\5\2\2\u008d\u008f\t\6\2\2\u008e\u008d\3\2\2\2\u008f\u0092"+
		"\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\f\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\t\2\20q}\u0085\u008e\u0090\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}