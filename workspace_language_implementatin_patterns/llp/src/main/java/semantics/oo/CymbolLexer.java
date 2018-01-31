package semantics.oo;

// $ANTLR 3.5.2 Cymbol.g 2016-12-29 09:09:45

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CymbolLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int ADD=4;
	public static final int ADDR=5;
	public static final int ARG_DECL=6;
	public static final int ASSIGN=7;
	public static final int BLOCK=8;
	public static final int CALL=9;
	public static final int CHAR=10;
	public static final int DEREF=11;
	public static final int ELIST=12;
	public static final int EXPR=13;
	public static final int FIELD_DECL=14;
	public static final int FLOAT=15;
	public static final int ID=16;
	public static final int INT=17;
	public static final int LETTER=18;
	public static final int MEMBER=19;
	public static final int METHOD_DECL=20;
	public static final int SL_COMMENT=21;
	public static final int UNARY_MINUS=22;
	public static final int UNARY_NOT=23;
	public static final int VAR_DECL=24;
	public static final int WS=25;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public CymbolLexer() {} 
	public CymbolLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public CymbolLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Cymbol.g"; }

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:2:5: ( '+' )
			// Cymbol.g:2:7: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:3:8: ( '=' )
			// Cymbol.g:3:10: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "MEMBER"
	public final void mMEMBER() throws RecognitionException {
		try {
			int _type = MEMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:4:8: ( '.' )
			// Cymbol.g:4:10: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MEMBER"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:5:7: ( '!' )
			// Cymbol.g:5:9: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:6:7: ( '!=' )
			// Cymbol.g:6:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:7:7: ( '&' )
			// Cymbol.g:7:9: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:8:7: ( '(' )
			// Cymbol.g:8:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:9:7: ( ')' )
			// Cymbol.g:9:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:10:7: ( '*' )
			// Cymbol.g:10:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:11:7: ( ',' )
			// Cymbol.g:11:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:12:7: ( '-' )
			// Cymbol.g:12:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:13:7: ( '->' )
			// Cymbol.g:13:9: '->'
			{
			match("->"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:14:7: ( '/' )
			// Cymbol.g:14:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:15:7: ( ':' )
			// Cymbol.g:15:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:16:7: ( ';' )
			// Cymbol.g:16:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:17:7: ( '<' )
			// Cymbol.g:17:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:18:7: ( '<=' )
			// Cymbol.g:18:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:19:7: ( '==' )
			// Cymbol.g:19:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:20:7: ( '>' )
			// Cymbol.g:20:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:21:7: ( '>=' )
			// Cymbol.g:21:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:22:7: ( '[' )
			// Cymbol.g:22:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:23:7: ( '[]' )
			// Cymbol.g:23:9: '[]'
			{
			match("[]"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:24:7: ( ']' )
			// Cymbol.g:24:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:25:7: ( 'boolean' )
			// Cymbol.g:25:9: 'boolean'
			{
			match("boolean"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:26:7: ( 'char' )
			// Cymbol.g:26:9: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:27:7: ( 'class' )
			// Cymbol.g:27:9: 'class'
			{
			match("class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:28:7: ( 'else' )
			// Cymbol.g:28:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:29:7: ( 'false' )
			// Cymbol.g:29:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:30:7: ( 'float' )
			// Cymbol.g:30:9: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:31:7: ( 'if' )
			// Cymbol.g:31:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:32:7: ( 'int' )
			// Cymbol.g:32:9: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:33:7: ( 'return' )
			// Cymbol.g:33:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:34:7: ( 'true' )
			// Cymbol.g:34:9: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:35:7: ( 'void' )
			// Cymbol.g:35:9: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:36:7: ( '{' )
			// Cymbol.g:36:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:37:7: ( '}' )
			// Cymbol.g:37:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:177:5: ( LETTER ( LETTER | '0' .. '9' )* )
			// Cymbol.g:177:9: LETTER ( LETTER | '0' .. '9' )*
			{
			mLETTER(); 

			// Cymbol.g:177:16: ( LETTER | '0' .. '9' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Cymbol.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// Cymbol.g:183:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
			// Cymbol.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:185:5: ( '\\'' . '\\'' )
			// Cymbol.g:185:9: '\\'' . '\\''
			{
			match('\''); 
			matchAny(); 
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:187:5: ( ( '0' .. '9' )+ )
			// Cymbol.g:187:9: ( '0' .. '9' )+
			{
			// Cymbol.g:187:9: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Cymbol.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:190:5: ( INT '.' ( INT )* | '.' ( INT )+ )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
				alt5=1;
			}
			else if ( (LA5_0=='.') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// Cymbol.g:190:9: INT '.' ( INT )*
					{
					mINT(); 

					match('.'); 
					// Cymbol.g:190:17: ( INT )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// Cymbol.g:190:17: INT
							{
							mINT(); 

							}
							break;

						default :
							break loop3;
						}
					}

					}
					break;
				case 2 :
					// Cymbol.g:191:9: '.' ( INT )+
					{
					match('.'); 
					// Cymbol.g:191:13: ( INT )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// Cymbol.g:191:13: INT
							{
							mINT(); 

							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:194:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
			// Cymbol.g:194:9: ( ' ' | '\\r' | '\\t' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "SL_COMMENT"
	public final void mSL_COMMENT() throws RecognitionException {
		try {
			int _type = SL_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:198:5: ( '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' )? '\\n' )
			// Cymbol.g:198:9: '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// Cymbol.g:198:14: (~ ( '\\r' | '\\n' ) )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Cymbol.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			// Cymbol.g:198:28: ( '\\r' )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='\r') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// Cymbol.g:198:28: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SL_COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// Cymbol.g:1:8: ( ADD | ASSIGN | MEMBER | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | ID | CHAR | INT | FLOAT | WS | SL_COMMENT )
		int alt8=42;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// Cymbol.g:1:10: ADD
				{
				mADD(); 

				}
				break;
			case 2 :
				// Cymbol.g:1:14: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 3 :
				// Cymbol.g:1:21: MEMBER
				{
				mMEMBER(); 

				}
				break;
			case 4 :
				// Cymbol.g:1:28: T__26
				{
				mT__26(); 

				}
				break;
			case 5 :
				// Cymbol.g:1:34: T__27
				{
				mT__27(); 

				}
				break;
			case 6 :
				// Cymbol.g:1:40: T__28
				{
				mT__28(); 

				}
				break;
			case 7 :
				// Cymbol.g:1:46: T__29
				{
				mT__29(); 

				}
				break;
			case 8 :
				// Cymbol.g:1:52: T__30
				{
				mT__30(); 

				}
				break;
			case 9 :
				// Cymbol.g:1:58: T__31
				{
				mT__31(); 

				}
				break;
			case 10 :
				// Cymbol.g:1:64: T__32
				{
				mT__32(); 

				}
				break;
			case 11 :
				// Cymbol.g:1:70: T__33
				{
				mT__33(); 

				}
				break;
			case 12 :
				// Cymbol.g:1:76: T__34
				{
				mT__34(); 

				}
				break;
			case 13 :
				// Cymbol.g:1:82: T__35
				{
				mT__35(); 

				}
				break;
			case 14 :
				// Cymbol.g:1:88: T__36
				{
				mT__36(); 

				}
				break;
			case 15 :
				// Cymbol.g:1:94: T__37
				{
				mT__37(); 

				}
				break;
			case 16 :
				// Cymbol.g:1:100: T__38
				{
				mT__38(); 

				}
				break;
			case 17 :
				// Cymbol.g:1:106: T__39
				{
				mT__39(); 

				}
				break;
			case 18 :
				// Cymbol.g:1:112: T__40
				{
				mT__40(); 

				}
				break;
			case 19 :
				// Cymbol.g:1:118: T__41
				{
				mT__41(); 

				}
				break;
			case 20 :
				// Cymbol.g:1:124: T__42
				{
				mT__42(); 

				}
				break;
			case 21 :
				// Cymbol.g:1:130: T__43
				{
				mT__43(); 

				}
				break;
			case 22 :
				// Cymbol.g:1:136: T__44
				{
				mT__44(); 

				}
				break;
			case 23 :
				// Cymbol.g:1:142: T__45
				{
				mT__45(); 

				}
				break;
			case 24 :
				// Cymbol.g:1:148: T__46
				{
				mT__46(); 

				}
				break;
			case 25 :
				// Cymbol.g:1:154: T__47
				{
				mT__47(); 

				}
				break;
			case 26 :
				// Cymbol.g:1:160: T__48
				{
				mT__48(); 

				}
				break;
			case 27 :
				// Cymbol.g:1:166: T__49
				{
				mT__49(); 

				}
				break;
			case 28 :
				// Cymbol.g:1:172: T__50
				{
				mT__50(); 

				}
				break;
			case 29 :
				// Cymbol.g:1:178: T__51
				{
				mT__51(); 

				}
				break;
			case 30 :
				// Cymbol.g:1:184: T__52
				{
				mT__52(); 

				}
				break;
			case 31 :
				// Cymbol.g:1:190: T__53
				{
				mT__53(); 

				}
				break;
			case 32 :
				// Cymbol.g:1:196: T__54
				{
				mT__54(); 

				}
				break;
			case 33 :
				// Cymbol.g:1:202: T__55
				{
				mT__55(); 

				}
				break;
			case 34 :
				// Cymbol.g:1:208: T__56
				{
				mT__56(); 

				}
				break;
			case 35 :
				// Cymbol.g:1:214: T__57
				{
				mT__57(); 

				}
				break;
			case 36 :
				// Cymbol.g:1:220: T__58
				{
				mT__58(); 

				}
				break;
			case 37 :
				// Cymbol.g:1:226: ID
				{
				mID(); 

				}
				break;
			case 38 :
				// Cymbol.g:1:229: CHAR
				{
				mCHAR(); 

				}
				break;
			case 39 :
				// Cymbol.g:1:234: INT
				{
				mINT(); 

				}
				break;
			case 40 :
				// Cymbol.g:1:238: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 41 :
				// Cymbol.g:1:244: WS
				{
				mWS(); 

				}
				break;
			case 42 :
				// Cymbol.g:1:247: SL_COMMENT
				{
				mSL_COMMENT(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\2\uffff\1\41\1\42\1\45\5\uffff\1\47\1\51\2\uffff\1\53\1\55\1\57\1\uffff"+
		"\10\34\4\uffff\1\73\21\uffff\6\34\1\102\4\34\1\uffff\6\34\1\uffff\1\115"+
		"\4\34\1\122\1\34\1\124\2\34\1\uffff\1\34\1\130\1\131\1\34\1\uffff\1\133"+
		"\1\uffff\1\134\1\135\1\34\2\uffff\1\34\3\uffff\1\140\1\141\2\uffff";
	static final String DFA8_eofS =
		"\142\uffff";
	static final String DFA8_minS =
		"\1\11\1\uffff\1\75\1\60\1\75\5\uffff\1\76\1\57\2\uffff\2\75\1\135\1\uffff"+
		"\1\157\1\150\1\154\1\141\1\146\1\145\1\162\1\157\4\uffff\1\56\21\uffff"+
		"\1\157\2\141\1\163\1\154\1\157\1\60\2\164\1\165\1\151\1\uffff\1\154\1"+
		"\162\1\163\1\145\1\163\1\141\1\uffff\1\60\1\165\1\145\1\144\1\145\1\60"+
		"\1\163\1\60\1\145\1\164\1\uffff\1\162\2\60\1\141\1\uffff\1\60\1\uffff"+
		"\2\60\1\156\2\uffff\1\156\3\uffff\2\60\2\uffff";
	static final String DFA8_maxS =
		"\1\175\1\uffff\1\75\1\71\1\75\5\uffff\1\76\1\57\2\uffff\2\75\1\135\1\uffff"+
		"\1\157\3\154\1\156\1\145\1\162\1\157\4\uffff\1\71\21\uffff\1\157\2\141"+
		"\1\163\1\154\1\157\1\172\2\164\1\165\1\151\1\uffff\1\154\1\162\1\163\1"+
		"\145\1\163\1\141\1\uffff\1\172\1\165\1\145\1\144\1\145\1\172\1\163\1\172"+
		"\1\145\1\164\1\uffff\1\162\2\172\1\141\1\uffff\1\172\1\uffff\2\172\1\156"+
		"\2\uffff\1\156\3\uffff\2\172\2\uffff";
	static final String DFA8_acceptS =
		"\1\uffff\1\1\3\uffff\1\6\1\7\1\10\1\11\1\12\2\uffff\1\16\1\17\3\uffff"+
		"\1\27\10\uffff\1\43\1\44\1\45\1\46\1\uffff\1\51\1\22\1\2\1\3\1\50\1\5"+
		"\1\4\1\14\1\13\1\52\1\15\1\21\1\20\1\24\1\23\1\26\1\25\13\uffff\1\47\6"+
		"\uffff\1\36\12\uffff\1\37\4\uffff\1\31\1\uffff\1\33\3\uffff\1\41\1\42"+
		"\1\uffff\1\32\1\34\1\35\2\uffff\1\40\1\30";
	static final String DFA8_specialS =
		"\142\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\37\2\uffff\1\37\22\uffff\1\37\1\4\4\uffff\1\5\1\35\1\6\1\7\1\10\1"+
			"\1\1\11\1\12\1\3\1\13\12\36\1\14\1\15\1\16\1\2\1\17\2\uffff\32\34\1\20"+
			"\1\uffff\1\21\3\uffff\1\34\1\22\1\23\1\34\1\24\1\25\2\34\1\26\10\34\1"+
			"\27\1\34\1\30\1\34\1\31\4\34\1\32\1\uffff\1\33",
			"",
			"\1\40",
			"\12\43",
			"\1\44",
			"",
			"",
			"",
			"",
			"",
			"\1\46",
			"\1\50",
			"",
			"",
			"\1\52",
			"\1\54",
			"\1\56",
			"",
			"\1\60",
			"\1\61\3\uffff\1\62",
			"\1\63",
			"\1\64\12\uffff\1\65",
			"\1\66\7\uffff\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"",
			"",
			"",
			"",
			"\1\43\1\uffff\12\36",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\1\123",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\1\125",
			"\1\126",
			"",
			"\1\127",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\1\132",
			"",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\1\136",
			"",
			"",
			"\1\137",
			"",
			"",
			"",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"\12\34\7\uffff\32\34\6\uffff\32\34",
			"",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( ADD | ASSIGN | MEMBER | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | ID | CHAR | INT | FLOAT | WS | SL_COMMENT );";
		}
	}

}
