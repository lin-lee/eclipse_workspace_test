package symtab.monolithic;

// $ANTLR 3.5.2 Cymbol.g 2016-12-19 16:02:22

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CymbolParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "LETTER", "SL_COMMENT", 
		"WS", "'('", "')'", "'+'", "';'", "'='", "'float'", "'int'"
	};
	public static final int EOF=-1;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int ID=4;
	public static final int INT=5;
	public static final int LETTER=6;
	public static final int SL_COMMENT=7;
	public static final int WS=8;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public CymbolParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public CymbolParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return CymbolParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Cymbol.g"; }

	SymbolTable symtab; 


	// $ANTLR start "compilationUnit"
	// Cymbol.g:5:1: compilationUnit[SymbolTable symtab] : ( varDeclaration )+ ;
	public final void compilationUnit(SymbolTable symtab) throws RecognitionException {
		this.symtab = symtab; 
		try {
			// Cymbol.g:7:2: ( ( varDeclaration )+ )
			// Cymbol.g:7:4: ( varDeclaration )+
			{
			// Cymbol.g:7:4: ( varDeclaration )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 14 && LA1_0 <= 15)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Cymbol.g:7:4: varDeclaration
					{
					pushFollow(FOLLOW_varDeclaration_in_compilationUnit25);
					varDeclaration();
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
	// $ANTLR end "compilationUnit"


	public static class type_return extends ParserRuleReturnScope {
		public Type tsym;
	};


	// $ANTLR start "type"
	// Cymbol.g:12:1: type returns [Type tsym] : ( 'float' | 'int' );
	public final CymbolParser.type_return type() throws RecognitionException {
		CymbolParser.type_return retval = new CymbolParser.type_return();
		retval.start = input.LT(1);

		try {
			// Cymbol.g:16:2: ( 'float' | 'int' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==14) ) {
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
					// Cymbol.g:16:4: 'float'
					{
					match(input,14,FOLLOW_14_in_type52); 
					retval.tsym = (Type)symtab.resolve("float"); 
					}
					break;
				case 2 :
					// Cymbol.g:17:4: 'int'
					{
					match(input,15,FOLLOW_15_in_type59); 
					retval.tsym = (Type)symtab.resolve("int"); 
					}
					break;

			}
			retval.stop = input.LT(-1);

				// (retval.start) is the first tree node matched by this rule
				System.out.println("line "+(retval.start).getLine()+": ref "+retval.tsym.getName());

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
	// $ANTLR end "type"



	// $ANTLR start "varDeclaration"
	// Cymbol.g:22:1: varDeclaration : type ID ( '=' expression )? ';' ;
	public final void varDeclaration() throws RecognitionException {
		Token ID1=null;
		ParserRuleReturnScope type2 =null;

		try {
			// Cymbol.g:23:2: ( type ID ( '=' expression )? ';' )
			// Cymbol.g:23:4: type ID ( '=' expression )? ';'
			{
			pushFollow(FOLLOW_type_in_varDeclaration74);
			type2=type();
			state._fsp--;

			ID1=(Token)match(input,ID,FOLLOW_ID_in_varDeclaration76); 
			// Cymbol.g:23:12: ( '=' expression )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==13) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// Cymbol.g:23:13: '=' expression
					{
					match(input,13,FOLLOW_13_in_varDeclaration79); 
					pushFollow(FOLLOW_expression_in_varDeclaration81);
					expression();
					state._fsp--;

					}
					break;

			}

			match(input,12,FOLLOW_12_in_varDeclaration85); 

				  	System.out.println("line "+ID1.getLine()+": def "+(ID1!=null?ID1.getText():null));
				  	VariableSymbol vs = new VariableSymbol((ID1!=null?ID1.getText():null), (type2!=null?((CymbolParser.type_return)type2).tsym:null));
				  	symtab.define(vs);
				  
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
	// $ANTLR end "varDeclaration"



	// $ANTLR start "expression"
	// Cymbol.g:32:1: expression : primary ( '+' primary )* ;
	public final void expression() throws RecognitionException {
		try {
			// Cymbol.g:33:2: ( primary ( '+' primary )* )
			// Cymbol.g:33:4: primary ( '+' primary )*
			{
			pushFollow(FOLLOW_primary_in_expression105);
			primary();
			state._fsp--;

			// Cymbol.g:33:12: ( '+' primary )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==11) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Cymbol.g:33:13: '+' primary
					{
					match(input,11,FOLLOW_11_in_expression108); 
					pushFollow(FOLLOW_primary_in_expression110);
					primary();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
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
	// $ANTLR end "expression"



	// $ANTLR start "primary"
	// Cymbol.g:37:1: primary : ( ID | INT | '(' expression ')' );
	public final void primary() throws RecognitionException {
		Token ID3=null;

		try {
			// Cymbol.g:38:2: ( ID | INT | '(' expression ')' )
			int alt5=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt5=1;
				}
				break;
			case INT:
				{
				alt5=2;
				}
				break;
			case 9:
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// Cymbol.g:38:4: ID
					{
					ID3=(Token)match(input,ID,FOLLOW_ID_in_primary125); 
					System.out.println("line "+ID3.getLine()+": ref to "+
						  	symtab.resolve((ID3!=null?ID3.getText():null))); 
					}
					break;
				case 2 :
					// Cymbol.g:41:4: INT
					{
					match(input,INT,FOLLOW_INT_in_primary135); 
					}
					break;
				case 3 :
					// Cymbol.g:42:4: '(' expression ')'
					{
					match(input,9,FOLLOW_9_in_primary140); 
					pushFollow(FOLLOW_expression_in_primary142);
					expression();
					state._fsp--;

					match(input,10,FOLLOW_10_in_primary144); 
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
	// $ANTLR end "primary"

	// Delegated rules



	public static final BitSet FOLLOW_varDeclaration_in_compilationUnit25 = new BitSet(new long[]{0x000000000000C002L});
	public static final BitSet FOLLOW_14_in_type52 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_type59 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_varDeclaration74 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_varDeclaration76 = new BitSet(new long[]{0x0000000000003000L});
	public static final BitSet FOLLOW_13_in_varDeclaration79 = new BitSet(new long[]{0x0000000000000230L});
	public static final BitSet FOLLOW_expression_in_varDeclaration81 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_varDeclaration85 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_in_expression105 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_expression108 = new BitSet(new long[]{0x0000000000000230L});
	public static final BitSet FOLLOW_primary_in_expression110 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ID_in_primary125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_primary135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_primary140 = new BitSet(new long[]{0x0000000000000230L});
	public static final BitSet FOLLOW_expression_in_primary142 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_primary144 = new BitSet(new long[]{0x0000000000000002L});
}
