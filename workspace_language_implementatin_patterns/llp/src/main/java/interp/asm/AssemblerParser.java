package interp.asm;

// $ANTLR 3.5.2 Assembler.g 2017-01-01 11:16:34

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/** A generic bytecode assembler whose instructions take 0..3 operands.
 *  Instruction set is dictated externally with a String[].  Implement
 *  specifics by subclassing and defining gen() methods. Comments start
 *  with ';' and all instructions end with '\n'.  Handles both register (rN)
 *  and stack-based assembly instructions.  Labels are "ID:".  "main:" label
 *  is where we start execution.  Use .globals and .def for global data
 *  and function definitions, respectively.
 */
@SuppressWarnings("all")
public class AssemblerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "FLOAT", "FUNC", "ID", 
		"INT", "LETTER", "NEWLINE", "REG", "STRING", "STR_CHARS", "WS", "','", 
		"'.def'", "'.globals'", "':'", "'='", "'args'", "'locals'"
	};
	public static final int EOF=-1;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int CHAR=4;
	public static final int FLOAT=5;
	public static final int FUNC=6;
	public static final int ID=7;
	public static final int INT=8;
	public static final int LETTER=9;
	public static final int NEWLINE=10;
	public static final int REG=11;
	public static final int STRING=12;
	public static final int STR_CHARS=13;
	public static final int WS=14;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public AssemblerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public AssemblerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return AssemblerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Assembler.g"; }


	    // Define the functionality required by the parser for code generation
	    protected void gen(Token instrToken) {;}
	    protected void gen(Token instrToken, Token operandToken) {;}
	    protected void gen(Token instrToken, Token oToken1, Token oToken2) {;}
	    protected void gen(Token instrToken, Token oToken1, Token oToken2, Token oToken3) {;}
	    protected void checkForUnresolvedReferences() {;}
	    protected void defineFunction(Token idToken, int nargs, int nlocals) {;}
	    protected void defineDataSize(int n) {;}
	    protected void defineLabel(Token idToken) {;}



	// $ANTLR start "program"
	// Assembler.g:25:1: program : ( globals )? ( functionDeclaration | instr | label | NEWLINE )+ ;
	public final void program() throws RecognitionException {
		try {
			// Assembler.g:26:5: ( ( globals )? ( functionDeclaration | instr | label | NEWLINE )+ )
			// Assembler.g:26:9: ( globals )? ( functionDeclaration | instr | label | NEWLINE )+
			{
			// Assembler.g:26:9: ( globals )?
			int alt1=2;
			alt1 = dfa1.predict(input);
			switch (alt1) {
				case 1 :
					// Assembler.g:26:9: globals
					{
					pushFollow(FOLLOW_globals_in_program26);
					globals();
					state._fsp--;

					}
					break;

			}

			// Assembler.g:27:9: ( functionDeclaration | instr | label | NEWLINE )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=5;
				switch ( input.LA(1) ) {
				case 16:
					{
					alt2=1;
					}
					break;
				case ID:
					{
					int LA2_3 = input.LA(2);
					if ( ((LA2_3 >= CHAR && LA2_3 <= INT)||(LA2_3 >= NEWLINE && LA2_3 <= STRING)) ) {
						alt2=2;
					}
					else if ( (LA2_3==18) ) {
						alt2=3;
					}

					}
					break;
				case NEWLINE:
					{
					alt2=4;
					}
					break;
				}
				switch (alt2) {
				case 1 :
					// Assembler.g:27:11: functionDeclaration
					{
					pushFollow(FOLLOW_functionDeclaration_in_program39);
					functionDeclaration();
					state._fsp--;

					}
					break;
				case 2 :
					// Assembler.g:27:33: instr
					{
					pushFollow(FOLLOW_instr_in_program43);
					instr();
					state._fsp--;

					}
					break;
				case 3 :
					// Assembler.g:27:41: label
					{
					pushFollow(FOLLOW_label_in_program47);
					label();
					state._fsp--;

					}
					break;
				case 4 :
					// Assembler.g:27:49: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_program51); 
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			checkForUnresolvedReferences();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "globals"
	// Assembler.g:33:1: globals : ( NEWLINE )* '.globals' INT NEWLINE ;
	public final void globals() throws RecognitionException {
		Token INT1=null;

		try {
			// Assembler.g:33:9: ( ( NEWLINE )* '.globals' INT NEWLINE )
			// Assembler.g:33:11: ( NEWLINE )* '.globals' INT NEWLINE
			{
			// Assembler.g:33:11: ( NEWLINE )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==NEWLINE) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Assembler.g:33:11: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_globals82); 
					}
					break;

				default :
					break loop3;
				}
			}

			match(input,17,FOLLOW_17_in_globals85); 
			INT1=(Token)match(input,INT,FOLLOW_INT_in_globals87); 
			match(input,NEWLINE,FOLLOW_NEWLINE_in_globals89); 
			defineDataSize((INT1!=null?Integer.valueOf(INT1.getText()):0));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "globals"



	// $ANTLR start "functionDeclaration"
	// Assembler.g:38:1: functionDeclaration : '.def' name= ID ':' 'args' '=' a= INT ',' 'locals' '=' n= INT NEWLINE ;
	public final void functionDeclaration() throws RecognitionException {
		Token name=null;
		Token a=null;
		Token n=null;

		try {
			// Assembler.g:39:5: ( '.def' name= ID ':' 'args' '=' a= INT ',' 'locals' '=' n= INT NEWLINE )
			// Assembler.g:39:7: '.def' name= ID ':' 'args' '=' a= INT ',' 'locals' '=' n= INT NEWLINE
			{
			match(input,16,FOLLOW_16_in_functionDeclaration107); 
			name=(Token)match(input,ID,FOLLOW_ID_in_functionDeclaration111); 
			match(input,18,FOLLOW_18_in_functionDeclaration113); 
			match(input,20,FOLLOW_20_in_functionDeclaration115); 
			match(input,19,FOLLOW_19_in_functionDeclaration117); 
			a=(Token)match(input,INT,FOLLOW_INT_in_functionDeclaration121); 
			match(input,15,FOLLOW_15_in_functionDeclaration123); 
			match(input,21,FOLLOW_21_in_functionDeclaration125); 
			match(input,19,FOLLOW_19_in_functionDeclaration127); 
			n=(Token)match(input,INT,FOLLOW_INT_in_functionDeclaration131); 
			match(input,NEWLINE,FOLLOW_NEWLINE_in_functionDeclaration133); 
			defineFunction(name, (a!=null?Integer.valueOf(a.getText()):0), (n!=null?Integer.valueOf(n.getText()):0));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "functionDeclaration"



	// $ANTLR start "instr"
	// Assembler.g:45:1: instr : ( ID NEWLINE | ID operand NEWLINE | ID a= operand ',' b= operand NEWLINE | ID a= operand ',' b= operand ',' c= operand NEWLINE );
	public final void instr() throws RecognitionException {
		Token ID2=null;
		Token ID3=null;
		Token ID5=null;
		Token ID6=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;
		ParserRuleReturnScope operand4 =null;

		try {
			// Assembler.g:46:5: ( ID NEWLINE | ID operand NEWLINE | ID a= operand ',' b= operand NEWLINE | ID a= operand ',' b= operand ',' c= operand NEWLINE )
			int alt4=4;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==ID) ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1==NEWLINE) ) {
					alt4=1;
				}
				else if ( ((LA4_1 >= CHAR && LA4_1 <= INT)||(LA4_1 >= REG && LA4_1 <= STRING)) ) {
					int LA4_3 = input.LA(3);
					if ( (LA4_3==NEWLINE) ) {
						alt4=2;
					}
					else if ( (LA4_3==15) ) {
						int LA4_5 = input.LA(4);
						if ( ((LA4_5 >= CHAR && LA4_5 <= INT)||(LA4_5 >= REG && LA4_5 <= STRING)) ) {
							int LA4_6 = input.LA(5);
							if ( (LA4_6==NEWLINE) ) {
								alt4=3;
							}
							else if ( (LA4_6==15) ) {
								alt4=4;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 4, 6, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// Assembler.g:46:9: ID NEWLINE
					{
					ID2=(Token)match(input,ID,FOLLOW_ID_in_instr162); 
					match(input,NEWLINE,FOLLOW_NEWLINE_in_instr164); 
					gen(ID2);
					}
					break;
				case 2 :
					// Assembler.g:47:9: ID operand NEWLINE
					{
					ID3=(Token)match(input,ID,FOLLOW_ID_in_instr200); 
					pushFollow(FOLLOW_operand_in_instr202);
					operand4=operand();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_instr204); 
					gen(ID3,(operand4!=null?(operand4.start):null));
					}
					break;
				case 3 :
					// Assembler.g:48:9: ID a= operand ',' b= operand NEWLINE
					{
					ID5=(Token)match(input,ID,FOLLOW_ID_in_instr232); 
					pushFollow(FOLLOW_operand_in_instr236);
					a=operand();
					state._fsp--;

					match(input,15,FOLLOW_15_in_instr238); 
					pushFollow(FOLLOW_operand_in_instr242);
					b=operand();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_instr244); 
					gen(ID5,(a!=null?(a.start):null),(b!=null?(b.start):null));
					}
					break;
				case 4 :
					// Assembler.g:49:9: ID a= operand ',' b= operand ',' c= operand NEWLINE
					{
					ID6=(Token)match(input,ID,FOLLOW_ID_in_instr256); 
					pushFollow(FOLLOW_operand_in_instr260);
					a=operand();
					state._fsp--;

					match(input,15,FOLLOW_15_in_instr262); 
					pushFollow(FOLLOW_operand_in_instr266);
					b=operand();
					state._fsp--;

					match(input,15,FOLLOW_15_in_instr268); 
					pushFollow(FOLLOW_operand_in_instr272);
					c=operand();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_instr274); 
					gen(ID6,(a!=null?(a.start):null),(b!=null?(b.start):null),(c!=null?(c.start):null));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "instr"


	public static class operand_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "operand"
	// Assembler.g:55:1: operand : ( ID | REG | FUNC | INT | CHAR | STRING | FLOAT );
	public final AssemblerParser.operand_return operand() throws RecognitionException {
		AssemblerParser.operand_return retval = new AssemblerParser.operand_return();
		retval.start = input.LT(1);

		try {
			// Assembler.g:56:5: ( ID | REG | FUNC | INT | CHAR | STRING | FLOAT )
			// Assembler.g:
			{
			if ( (input.LA(1) >= CHAR && input.LA(1) <= INT)||(input.LA(1) >= REG && input.LA(1) <= STRING) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "operand"



	// $ANTLR start "label"
	// Assembler.g:67:1: label : ID ':' ;
	public final void label() throws RecognitionException {
		Token ID7=null;

		try {
			// Assembler.g:68:5: ( ID ':' )
			// Assembler.g:68:9: ID ':'
			{
			ID7=(Token)match(input,ID,FOLLOW_ID_in_label392); 
			match(input,18,FOLLOW_18_in_label394); 
			defineLabel(ID7);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "label"

	// Delegated rules


	protected DFA1 dfa1 = new DFA1(this);
	static final String DFA1_eotS =
		"\4\uffff";
	static final String DFA1_eofS =
		"\1\uffff\1\3\2\uffff";
	static final String DFA1_minS =
		"\2\7\2\uffff";
	static final String DFA1_maxS =
		"\2\21\2\uffff";
	static final String DFA1_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA1_specialS =
		"\4\uffff}>";
	static final String[] DFA1_transitionS = {
			"\1\3\2\uffff\1\1\5\uffff\1\3\1\2",
			"\1\3\2\uffff\1\1\5\uffff\1\3\1\2",
			"",
			""
	};

	static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
	static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
	static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
	static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
	static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
	static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
	static final short[][] DFA1_transition;

	static {
		int numStates = DFA1_transitionS.length;
		DFA1_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
		}
	}

	protected class DFA1 extends DFA {

		public DFA1(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 1;
			this.eot = DFA1_eot;
			this.eof = DFA1_eof;
			this.min = DFA1_min;
			this.max = DFA1_max;
			this.accept = DFA1_accept;
			this.special = DFA1_special;
			this.transition = DFA1_transition;
		}
		@Override
		public String getDescription() {
			return "26:9: ( globals )?";
		}
	}

	public static final BitSet FOLLOW_globals_in_program26 = new BitSet(new long[]{0x0000000000010480L});
	public static final BitSet FOLLOW_functionDeclaration_in_program39 = new BitSet(new long[]{0x0000000000010482L});
	public static final BitSet FOLLOW_instr_in_program43 = new BitSet(new long[]{0x0000000000010482L});
	public static final BitSet FOLLOW_label_in_program47 = new BitSet(new long[]{0x0000000000010482L});
	public static final BitSet FOLLOW_NEWLINE_in_program51 = new BitSet(new long[]{0x0000000000010482L});
	public static final BitSet FOLLOW_NEWLINE_in_globals82 = new BitSet(new long[]{0x0000000000020400L});
	public static final BitSet FOLLOW_17_in_globals85 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_INT_in_globals87 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_NEWLINE_in_globals89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_functionDeclaration107 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ID_in_functionDeclaration111 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_functionDeclaration113 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_functionDeclaration115 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_functionDeclaration117 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_INT_in_functionDeclaration121 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_functionDeclaration123 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_functionDeclaration125 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_functionDeclaration127 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_INT_in_functionDeclaration131 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_NEWLINE_in_functionDeclaration133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_instr162 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_NEWLINE_in_instr164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_instr200 = new BitSet(new long[]{0x00000000000019F0L});
	public static final BitSet FOLLOW_operand_in_instr202 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_NEWLINE_in_instr204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_instr232 = new BitSet(new long[]{0x00000000000019F0L});
	public static final BitSet FOLLOW_operand_in_instr236 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_instr238 = new BitSet(new long[]{0x00000000000019F0L});
	public static final BitSet FOLLOW_operand_in_instr242 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_NEWLINE_in_instr244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_instr256 = new BitSet(new long[]{0x00000000000019F0L});
	public static final BitSet FOLLOW_operand_in_instr260 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_instr262 = new BitSet(new long[]{0x00000000000019F0L});
	public static final BitSet FOLLOW_operand_in_instr266 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_instr268 = new BitSet(new long[]{0x00000000000019F0L});
	public static final BitSet FOLLOW_operand_in_instr272 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_NEWLINE_in_instr274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_label392 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_label394 = new BitSet(new long[]{0x0000000000000002L});
}