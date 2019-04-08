// Generated from /Users/joel/Documents/GitHub/CompilersProject/Part2/src/Plum.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, KEYWORD=2, OPERATOR=3, COMMENT=4, IDENTIFIER=5, STRINGLITERAL=6, 
		FLOATLITERAL=7, INTLITERAL=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "KEYWORD", "OPERATOR", "COMMENT", "IDENTIFIER", "STRINGLITERAL", 
		"FLOATLITERAL", "INTLITERAL"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "KEYWORD", "OPERATOR", "COMMENT", "IDENTIFIER", "STRINGLITERAL", 
		"FLOATLITERAL", "INTLITERAL"
	};
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n\u00b3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\25"+
		"\n\2\r\2\16\2\26\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3x\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0084\n\4\3\5\3\5\3\5\3\5\7\5\u008a\n\5"+
		"\f\5\16\5\u008d\13\5\3\5\3\5\3\5\3\5\3\6\3\6\7\6\u0095\n\6\f\6\16\6\u0098"+
		"\13\6\3\7\3\7\7\7\u009c\n\7\f\7\16\7\u009f\13\7\3\7\3\7\3\b\7\b\u00a4"+
		"\n\b\f\b\16\b\u00a7\13\b\3\b\3\b\6\b\u00ab\n\b\r\b\16\b\u00ac\3\t\6\t"+
		"\u00b0\n\t\r\t\16\t\u00b1\4\u008b\u009d\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\3\2\b\5\2\13\f\17\17\"\"\6\2,-//\61\61??\6\2*+..=>@@\3\2C|\4\2"+
		"\62;C|\3\2\62;\2\u00cf\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\24\3\2\2\2\5w\3"+
		"\2\2\2\7\u0083\3\2\2\2\t\u0085\3\2\2\2\13\u0092\3\2\2\2\r\u0099\3\2\2"+
		"\2\17\u00a5\3\2\2\2\21\u00af\3\2\2\2\23\25\t\2\2\2\24\23\3\2\2\2\25\26"+
		"\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\30\3\2\2\2\30\31\b\2\2\2\31\4"+
		"\3\2\2\2\32\33\7R\2\2\33\34\7T\2\2\34\35\7Q\2\2\35\36\7I\2\2\36\37\7T"+
		"\2\2\37 \7C\2\2 x\7O\2\2!\"\7D\2\2\"#\7G\2\2#$\7I\2\2$%\7K\2\2%x\7P\2"+
		"\2&\'\7G\2\2\'(\7P\2\2(x\7F\2\2)*\7H\2\2*+\7W\2\2+,\7P\2\2,-\7E\2\2-."+
		"\7V\2\2./\7K\2\2/\60\7Q\2\2\60x\7P\2\2\61\62\7T\2\2\62\63\7G\2\2\63\64"+
		"\7C\2\2\64x\7F\2\2\65\66\7Y\2\2\66\67\7T\2\2\678\7K\2\289\7V\2\29x\7G"+
		"\2\2:;\7K\2\2;x\7H\2\2<=\7G\2\2=>\7N\2\2>?\7U\2\2?x\7G\2\2@A\7G\2\2AB"+
		"\7P\2\2BC\7F\2\2CD\7K\2\2Dx\7H\2\2EF\7Y\2\2FG\7J\2\2GH\7K\2\2HI\7N\2\2"+
		"Ix\7G\2\2JK\7G\2\2KL\7P\2\2LM\7F\2\2MN\7Y\2\2NO\7J\2\2OP\7K\2\2PQ\7N\2"+
		"\2Qx\7G\2\2RS\7E\2\2ST\7Q\2\2TU\7P\2\2UV\7V\2\2VW\7K\2\2WX\7P\2\2XY\7"+
		"W\2\2Yx\7G\2\2Z[\7D\2\2[\\\7T\2\2\\]\7G\2\2]^\7C\2\2^x\7M\2\2_`\7T\2\2"+
		"`a\7G\2\2ab\7V\2\2bc\7W\2\2cd\7T\2\2dx\7P\2\2ef\7K\2\2fg\7P\2\2gx\7V\2"+
		"\2hi\7X\2\2ij\7Q\2\2jk\7K\2\2kx\7F\2\2lm\7U\2\2mn\7V\2\2no\7T\2\2op\7"+
		"K\2\2pq\7P\2\2qx\7I\2\2rs\7H\2\2st\7N\2\2tu\7Q\2\2uv\7C\2\2vx\7V\2\2w"+
		"\32\3\2\2\2w!\3\2\2\2w&\3\2\2\2w)\3\2\2\2w\61\3\2\2\2w\65\3\2\2\2w:\3"+
		"\2\2\2w<\3\2\2\2w@\3\2\2\2wE\3\2\2\2wJ\3\2\2\2wR\3\2\2\2wZ\3\2\2\2w_\3"+
		"\2\2\2we\3\2\2\2wh\3\2\2\2wl\3\2\2\2wr\3\2\2\2x\6\3\2\2\2yz\7<\2\2z\u0084"+
		"\7?\2\2{\u0084\t\3\2\2|}\7#\2\2}\u0084\7?\2\2~\u0084\t\4\2\2\177\u0080"+
		"\7>\2\2\u0080\u0084\7?\2\2\u0081\u0082\7@\2\2\u0082\u0084\7?\2\2\u0083"+
		"y\3\2\2\2\u0083{\3\2\2\2\u0083|\3\2\2\2\u0083~\3\2\2\2\u0083\177\3\2\2"+
		"\2\u0083\u0081\3\2\2\2\u0084\b\3\2\2\2\u0085\u0086\7/\2\2\u0086\u0087"+
		"\7/\2\2\u0087\u008b\3\2\2\2\u0088\u008a\13\2\2\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008d\3\2\2\2\u008b\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\f\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\b\5\2\2\u0091\n\3\2\2\2\u0092\u0096\t\5\2\2\u0093\u0095\t\6\2\2"+
		"\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\f\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009d\7$\2\2\u009a"+
		"\u009c\13\2\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009e\3"+
		"\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\u00a1\7$\2\2\u00a1\16\3\2\2\2\u00a2\u00a4\t\7\2\2\u00a3\u00a2\3\2\2\2"+
		"\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00aa\7\60\2\2\u00a9\u00ab\t\7\2\2"+
		"\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad"+
		"\3\2\2\2\u00ad\20\3\2\2\2\u00ae\u00b0\t\7\2\2\u00af\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\22\3\2\2"+
		"\2\r\2\26w\u0083\u008b\u0094\u0096\u009d\u00a5\u00ac\u00b1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}