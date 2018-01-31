package walking.tree_grammar;

// $ANTLR 3.5.2 Printer.g 2016-12-16 09:37:58

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Printer extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "VEC", "WS", "'*'", 
		"'+'", "','", "'.'", "'='", "'['", "']'", "'print'"
	};
	public static final int EOF=-1;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int ID=4;
	public static final int INT=5;
	public static final int VEC=6;
	public static final int WS=7;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public Printer(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public Printer(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return Printer.tokenNames; }
	@Override public String getGrammarFileName() { return "Printer.g"; }

	 void print(String s){ System.out.print(s); } 


	// $ANTLR start "prog"
	// Printer.g:11:1: prog : ( stat )+ ;
	public final void prog() throws RecognitionException {
		try {
			// Printer.g:11:6: ( ( stat )+ )
			// Printer.g:11:8: ( stat )+
			{
			// Printer.g:11:8: ( stat )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==12||LA1_0==15) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Printer.g:11:8: stat
					{
					pushFollow(FOLLOW_stat_in_prog36);
					stat();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

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
	// $ANTLR end "prog"



	// $ANTLR start "stat"
	// Printer.g:12:1: stat : ( ^( '=' ID expr ) | ^( 'print' expr ) );
	public final void stat() throws RecognitionException {
		CommonTree ID1=null;

		try {
			// Printer.g:12:6: ( ^( '=' ID expr ) | ^( 'print' expr ) )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==12) ) {
				alt2=1;
			}
			else if ( (LA2_0==15) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// Printer.g:12:8: ^( '=' ID expr )
					{
					match(input,12,FOLLOW_12_in_stat46); 
					match(input, Token.DOWN, null); 
					ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_stat48); 
					print((ID1!=null?ID1.getText():null)+" = ");
					pushFollow(FOLLOW_expr_in_stat52);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					print("\n");
					}
					break;
				case 2 :
					// Printer.g:13:5: ^( 'print' expr )
					{
					match(input,15,FOLLOW_15_in_stat62); 
					print("print ");
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_stat67);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					print("\n"); 
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
	// $ANTLR end "stat"



	// $ANTLR start "expr"
	// Printer.g:18:1: expr : ( ^( '+' expr expr ) | ^( '*' expr expr ) | ^( '.' expr expr ) | ^( VEC expr ( expr )* ) | INT | ID );
	public final void expr() throws RecognitionException {
		CommonTree INT2=null;
		CommonTree ID3=null;

		try {
			// Printer.g:18:6: ( ^( '+' expr expr ) | ^( '*' expr expr ) | ^( '.' expr expr ) | ^( VEC expr ( expr )* ) | INT | ID )
			int alt4=6;
			switch ( input.LA(1) ) {
			case 9:
				{
				alt4=1;
				}
				break;
			case 8:
				{
				alt4=2;
				}
				break;
			case 11:
				{
				alt4=3;
				}
				break;
			case VEC:
				{
				alt4=4;
				}
				break;
			case INT:
				{
				alt4=5;
				}
				break;
			case ID:
				{
				alt4=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// Printer.g:18:8: ^( '+' expr expr )
					{
					match(input,9,FOLLOW_9_in_expr85); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr87);
					expr();
					state._fsp--;

					print("+");
					pushFollow(FOLLOW_expr_in_expr91);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// Printer.g:19:5: ^( '*' expr expr )
					{
					match(input,8,FOLLOW_8_in_expr99); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr101);
					expr();
					state._fsp--;

					print("*");
					pushFollow(FOLLOW_expr_in_expr105);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// Printer.g:20:5: ^( '.' expr expr )
					{
					match(input,11,FOLLOW_11_in_expr113); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr115);
					expr();
					state._fsp--;

					print(".");
					pushFollow(FOLLOW_expr_in_expr119);
					expr();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// Printer.g:21:5: ^( VEC expr ( expr )* )
					{
					match(input,VEC,FOLLOW_VEC_in_expr127); 
					print("[");
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_expr_in_expr131);
					expr();
					state._fsp--;

					// Printer.g:21:30: ( expr )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= ID && LA3_0 <= VEC)||(LA3_0 >= 8 && LA3_0 <= 9)||LA3_0==11) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// Printer.g:21:31: expr
							{
							print(", ");
							pushFollow(FOLLOW_expr_in_expr136);
							expr();
							state._fsp--;

							}
							break;

						default :
							break loop3;
						}
					}

					print("]");
					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// Printer.g:22:5: INT
					{
					INT2=(CommonTree)match(input,INT,FOLLOW_INT_in_expr147); 
					print((INT2!=null?INT2.getText():null));
					}
					break;
				case 6 :
					// Printer.g:23:5: ID
					{
					ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_expr155); 
					print((ID3!=null?ID3.getText():null)); 
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
	// $ANTLR end "expr"

	// Delegated rules



	public static final BitSet FOLLOW_stat_in_prog36 = new BitSet(new long[]{0x0000000000009002L});
	public static final BitSet FOLLOW_12_in_stat46 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_stat48 = new BitSet(new long[]{0x0000000000000B70L});
	public static final BitSet FOLLOW_expr_in_stat52 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_15_in_stat62 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_stat67 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_9_in_expr85 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr87 = new BitSet(new long[]{0x0000000000000B70L});
	public static final BitSet FOLLOW_expr_in_expr91 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_8_in_expr99 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr101 = new BitSet(new long[]{0x0000000000000B70L});
	public static final BitSet FOLLOW_expr_in_expr105 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_11_in_expr113 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr115 = new BitSet(new long[]{0x0000000000000B70L});
	public static final BitSet FOLLOW_expr_in_expr119 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VEC_in_expr127 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr131 = new BitSet(new long[]{0x0000000000000B78L});
	public static final BitSet FOLLOW_expr_in_expr136 = new BitSet(new long[]{0x0000000000000B78L});
	public static final BitSet FOLLOW_INT_in_expr147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr155 = new BitSet(new long[]{0x0000000000000002L});
}
