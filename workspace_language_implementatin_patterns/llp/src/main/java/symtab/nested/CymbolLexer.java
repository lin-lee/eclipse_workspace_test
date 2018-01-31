package symtab.nested;

// $ANTLR 3.5.2 Cymbol.g 2016-12-20 11:16:46

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CymbolLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int ARG_DECL=4;
	public static final int BLOCK=5;
	public static final int CALL=6;
	public static final int ELIST=7;
	public static final int EXPR=8;
	public static final int ID=9;
	public static final int INT=10;
	public static final int LETTER=11;
	public static final int METHOD_DECL=12;
	public static final int SL_COMMENT=13;
	public static final int VAR_DECL=14;
	public static final int WS=15;

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

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:2:7: ( '(' )
			// Cymbol.g:2:9: '('
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:3:7: ( ')' )
			// Cymbol.g:3:9: ')'
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:4:7: ( '+' )
			// Cymbol.g:4:9: '+'
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:5:7: ( ',' )
			// Cymbol.g:5:9: ','
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:6:7: ( ';' )
			// Cymbol.g:6:9: ';'
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:7:7: ( '=' )
			// Cymbol.g:7:9: '='
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:8:7: ( 'float' )
			// Cymbol.g:8:9: 'float'
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:9:7: ( 'int' )
			// Cymbol.g:9:9: 'int'
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:10:7: ( 'return' )
			// Cymbol.g:10:9: 'return'
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
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:11:7: ( 'void' )
			// Cymbol.g:11:9: 'void'
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:12:7: ( '{' )
			// Cymbol.g:12:9: '{'
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
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:13:7: ( '}' )
			// Cymbol.g:13:9: '}'
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
	// $ANTLR end "T__27"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:87:5: ( LETTER ( LETTER | '0' .. '9' )* )
			// Cymbol.g:87:9: LETTER ( LETTER | '0' .. '9' )*
			{
			mLETTER(); 

			// Cymbol.g:87:16: ( LETTER | '0' .. '9' )*
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
			// Cymbol.g:92:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
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

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:94:5: ( ( '0' .. '9' )+ )
			// Cymbol.g:94:9: ( '0' .. '9' )+
			{
			// Cymbol.g:94:9: ( '0' .. '9' )+
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Cymbol.g:97:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
			// Cymbol.g:97:9: ( ' ' | '\\r' | '\\t' | '\\n' )
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
			// Cymbol.g:101:5: ( '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' )? '\\n' )
			// Cymbol.g:101:9: '//' (~ ( '\\r' | '\\n' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// Cymbol.g:101:14: (~ ( '\\r' | '\\n' ) )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
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
					break loop3;
				}
			}

			// Cymbol.g:101:28: ( '\\r' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='\r') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// Cymbol.g:101:28: '\\r'
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
		// Cymbol.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | ID | INT | WS | SL_COMMENT )
		int alt5=16;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt5=1;
			}
			break;
		case ')':
			{
			alt5=2;
			}
			break;
		case '+':
			{
			alt5=3;
			}
			break;
		case ',':
			{
			alt5=4;
			}
			break;
		case ';':
			{
			alt5=5;
			}
			break;
		case '=':
			{
			alt5=6;
			}
			break;
		case 'f':
			{
			int LA5_7 = input.LA(2);
			if ( (LA5_7=='l') ) {
				int LA5_17 = input.LA(3);
				if ( (LA5_17=='o') ) {
					int LA5_21 = input.LA(4);
					if ( (LA5_21=='a') ) {
						int LA5_25 = input.LA(5);
						if ( (LA5_25=='t') ) {
							int LA5_29 = input.LA(6);
							if ( ((LA5_29 >= '0' && LA5_29 <= '9')||(LA5_29 >= 'A' && LA5_29 <= 'Z')||(LA5_29 >= 'a' && LA5_29 <= 'z')) ) {
								alt5=13;
							}

							else {
								alt5=7;
							}

						}

						else {
							alt5=13;
						}

					}

					else {
						alt5=13;
					}

				}

				else {
					alt5=13;
				}

			}

			else {
				alt5=13;
			}

			}
			break;
		case 'i':
			{
			int LA5_8 = input.LA(2);
			if ( (LA5_8=='n') ) {
				int LA5_18 = input.LA(3);
				if ( (LA5_18=='t') ) {
					int LA5_22 = input.LA(4);
					if ( ((LA5_22 >= '0' && LA5_22 <= '9')||(LA5_22 >= 'A' && LA5_22 <= 'Z')||(LA5_22 >= 'a' && LA5_22 <= 'z')) ) {
						alt5=13;
					}

					else {
						alt5=8;
					}

				}

				else {
					alt5=13;
				}

			}

			else {
				alt5=13;
			}

			}
			break;
		case 'r':
			{
			int LA5_9 = input.LA(2);
			if ( (LA5_9=='e') ) {
				int LA5_19 = input.LA(3);
				if ( (LA5_19=='t') ) {
					int LA5_23 = input.LA(4);
					if ( (LA5_23=='u') ) {
						int LA5_27 = input.LA(5);
						if ( (LA5_27=='r') ) {
							int LA5_30 = input.LA(6);
							if ( (LA5_30=='n') ) {
								int LA5_33 = input.LA(7);
								if ( ((LA5_33 >= '0' && LA5_33 <= '9')||(LA5_33 >= 'A' && LA5_33 <= 'Z')||(LA5_33 >= 'a' && LA5_33 <= 'z')) ) {
									alt5=13;
								}

								else {
									alt5=9;
								}

							}

							else {
								alt5=13;
							}

						}

						else {
							alt5=13;
						}

					}

					else {
						alt5=13;
					}

				}

				else {
					alt5=13;
				}

			}

			else {
				alt5=13;
			}

			}
			break;
		case 'v':
			{
			int LA5_10 = input.LA(2);
			if ( (LA5_10=='o') ) {
				int LA5_20 = input.LA(3);
				if ( (LA5_20=='i') ) {
					int LA5_24 = input.LA(4);
					if ( (LA5_24=='d') ) {
						int LA5_28 = input.LA(5);
						if ( ((LA5_28 >= '0' && LA5_28 <= '9')||(LA5_28 >= 'A' && LA5_28 <= 'Z')||(LA5_28 >= 'a' && LA5_28 <= 'z')) ) {
							alt5=13;
						}

						else {
							alt5=10;
						}

					}

					else {
						alt5=13;
					}

				}

				else {
					alt5=13;
				}

			}

			else {
				alt5=13;
			}

			}
			break;
		case '{':
			{
			alt5=11;
			}
			break;
		case '}':
			{
			alt5=12;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 's':
		case 't':
		case 'u':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt5=13;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt5=14;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt5=15;
			}
			break;
		case '/':
			{
			alt5=16;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 5, 0, input);
			throw nvae;
		}
		switch (alt5) {
			case 1 :
				// Cymbol.g:1:10: T__16
				{
				mT__16(); 

				}
				break;
			case 2 :
				// Cymbol.g:1:16: T__17
				{
				mT__17(); 

				}
				break;
			case 3 :
				// Cymbol.g:1:22: T__18
				{
				mT__18(); 

				}
				break;
			case 4 :
				// Cymbol.g:1:28: T__19
				{
				mT__19(); 

				}
				break;
			case 5 :
				// Cymbol.g:1:34: T__20
				{
				mT__20(); 

				}
				break;
			case 6 :
				// Cymbol.g:1:40: T__21
				{
				mT__21(); 

				}
				break;
			case 7 :
				// Cymbol.g:1:46: T__22
				{
				mT__22(); 

				}
				break;
			case 8 :
				// Cymbol.g:1:52: T__23
				{
				mT__23(); 

				}
				break;
			case 9 :
				// Cymbol.g:1:58: T__24
				{
				mT__24(); 

				}
				break;
			case 10 :
				// Cymbol.g:1:64: T__25
				{
				mT__25(); 

				}
				break;
			case 11 :
				// Cymbol.g:1:70: T__26
				{
				mT__26(); 

				}
				break;
			case 12 :
				// Cymbol.g:1:76: T__27
				{
				mT__27(); 

				}
				break;
			case 13 :
				// Cymbol.g:1:82: ID
				{
				mID(); 

				}
				break;
			case 14 :
				// Cymbol.g:1:85: INT
				{
				mINT(); 

				}
				break;
			case 15 :
				// Cymbol.g:1:89: WS
				{
				mWS(); 

				}
				break;
			case 16 :
				// Cymbol.g:1:92: SL_COMMENT
				{
				mSL_COMMENT(); 

				}
				break;

		}
	}



}
