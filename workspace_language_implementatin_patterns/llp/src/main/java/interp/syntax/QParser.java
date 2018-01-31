package interp.syntax;

// $ANTLR 3.5.2 Q.g 2016-12-30 08:56:57

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class QParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ID", "INT", "STRING", 
		"WS", "'('", "')'", "','", "';'", "'='", "'create'", "'from'", "'insert'", 
		"'into'", "'key'", "'primary'", "'print'", "'select'", "'set'", "'table'", 
		"'where'"
	};
	public static final int EOF=-1;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int COMMENT=4;
	public static final int ID=5;
	public static final int INT=6;
	public static final int STRING=7;
	public static final int WS=8;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public QParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public QParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return QParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Q.g"; }


	    Interpreter interp;
	    public QParser(TokenStream input, Interpreter interp) {
	        this(input);
	        this.interp = interp;
	    }



	// $ANTLR start "program"
	// Q.g:11:1: program : ( stat )+ ;
	public final void program() throws RecognitionException {
		try {
			// Q.g:12:5: ( ( stat )+ )
			// Q.g:12:9: ( stat )+
			{
			// Q.g:12:9: ( stat )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==14||LA1_0==16||(LA1_0 >= 20 && LA1_0 <= 21)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Q.g:12:9: stat
					{
					pushFollow(FOLLOW_stat_in_program22);
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
	// $ANTLR end "program"



	// $ANTLR start "stat"
	// Q.g:15:1: stat : ( table | insert | assign | query | print );
	public final void stat() throws RecognitionException {
		try {
			// Q.g:15:5: ( table | insert | assign | query | print )
			int alt2=5;
			switch ( input.LA(1) ) {
			case 14:
				{
				alt2=1;
				}
				break;
			case 16:
				{
				alt2=2;
				}
				break;
			case ID:
				{
				alt2=3;
				}
				break;
			case 21:
				{
				alt2=4;
				}
				break;
			case 20:
				{
				alt2=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// Q.g:15:9: table
					{
					pushFollow(FOLLOW_table_in_stat37);
					table();
					state._fsp--;

					}
					break;
				case 2 :
					// Q.g:16:9: insert
					{
					pushFollow(FOLLOW_insert_in_stat47);
					insert();
					state._fsp--;

					}
					break;
				case 3 :
					// Q.g:17:9: assign
					{
					pushFollow(FOLLOW_assign_in_stat57);
					assign();
					state._fsp--;

					}
					break;
				case 4 :
					// Q.g:18:9: query
					{
					pushFollow(FOLLOW_query_in_stat67);
					query();
					state._fsp--;

					}
					break;
				case 5 :
					// Q.g:19:9: print
					{
					pushFollow(FOLLOW_print_in_stat77);
					print();
					state._fsp--;

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



	// $ANTLR start "print"
	// Q.g:22:1: print : 'print' expr ';' ;
	public final void print() throws RecognitionException {
		Object expr1 =null;

		try {
			// Q.g:22:6: ( 'print' expr ';' )
			// Q.g:22:9: 'print' expr ';'
			{
			match(input,20,FOLLOW_20_in_print90); 
			pushFollow(FOLLOW_expr_in_print92);
			expr1=expr();
			state._fsp--;

			match(input,12,FOLLOW_12_in_print94); 
			interp.print(expr1);
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
	// $ANTLR end "print"



	// $ANTLR start "table"
	// Q.g:26:1: table : 'create' 'table' tbl= ID '(' 'primary' 'key' key= ID ( ',' columns+= ID )+ ')' ';' ;
	public final void table() throws RecognitionException {
		Token tbl=null;
		Token key=null;
		Token columns=null;
		List<Token> list_columns=null;

		try {
			// Q.g:27:5: ( 'create' 'table' tbl= ID '(' 'primary' 'key' key= ID ( ',' columns+= ID )+ ')' ';' )
			// Q.g:27:9: 'create' 'table' tbl= ID '(' 'primary' 'key' key= ID ( ',' columns+= ID )+ ')' ';'
			{
			match(input,14,FOLLOW_14_in_table116); 
			match(input,23,FOLLOW_23_in_table118); 
			tbl=(Token)match(input,ID,FOLLOW_ID_in_table122); 
			match(input,9,FOLLOW_9_in_table132); 
			match(input,19,FOLLOW_19_in_table134); 
			match(input,18,FOLLOW_18_in_table136); 
			key=(Token)match(input,ID,FOLLOW_ID_in_table140); 
			// Q.g:28:36: ( ',' columns+= ID )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==11) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Q.g:28:37: ',' columns+= ID
					{
					match(input,11,FOLLOW_11_in_table143); 
					columns=(Token)match(input,ID,FOLLOW_ID_in_table147); 
					if (list_columns==null) list_columns=new ArrayList<Token>();
					list_columns.add(columns);
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			match(input,10,FOLLOW_10_in_table151); 
			match(input,12,FOLLOW_12_in_table153); 
			interp.createTable((tbl!=null?tbl.getText():null), (key!=null?key.getText():null), list_columns);
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
	// $ANTLR end "table"



	// $ANTLR start "assign"
	// Q.g:34:1: assign : ID '=' expr ';' ;
	public final void assign() throws RecognitionException {
		Token ID2=null;
		Object expr3 =null;

		try {
			// Q.g:34:8: ( ID '=' expr ';' )
			// Q.g:34:10: ID '=' expr ';'
			{
			ID2=(Token)match(input,ID,FOLLOW_ID_in_assign178); 
			match(input,13,FOLLOW_13_in_assign180); 
			pushFollow(FOLLOW_expr_in_assign182);
			expr3=expr();
			state._fsp--;

			match(input,12,FOLLOW_12_in_assign184); 
			interp.store((ID2!=null?ID2.getText():null), expr3);
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
	// $ANTLR end "assign"



	// $ANTLR start "insert"
	// Q.g:38:1: insert : 'insert' 'into' ID 'set' setFields[interp.tables.get($ID.text)] ';' ;
	public final void insert() throws RecognitionException {
		Token ID4=null;
		Row setFields5 =null;

		try {
			// Q.g:39:5: ( 'insert' 'into' ID 'set' setFields[interp.tables.get($ID.text)] ';' )
			// Q.g:39:7: 'insert' 'into' ID 'set' setFields[interp.tables.get($ID.text)] ';'
			{
			match(input,16,FOLLOW_16_in_insert202); 
			match(input,17,FOLLOW_17_in_insert204); 
			ID4=(Token)match(input,ID,FOLLOW_ID_in_insert206); 
			match(input,22,FOLLOW_22_in_insert208); 
			pushFollow(FOLLOW_setFields_in_insert210);
			setFields5=setFields(interp.tables.get((ID4!=null?ID4.getText():null)));
			state._fsp--;

			match(input,12,FOLLOW_12_in_insert213); 
			interp.insertInto((ID4!=null?ID4.getText():null), setFields5);
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
	// $ANTLR end "insert"



	// $ANTLR start "setFields"
	// Q.g:45:1: setFields[Table t] returns [Row row] : set[$row] ( ',' set[$row] )* ;
	public final Row setFields(Table t) throws RecognitionException {
		Row row = null;


		 row = new Row(t.columns); 
		try {
			// Q.g:47:5: ( set[$row] ( ',' set[$row] )* )
			// Q.g:47:9: set[$row] ( ',' set[$row] )*
			{
			pushFollow(FOLLOW_set_in_setFields257);
			set(row);
			state._fsp--;

			// Q.g:47:19: ( ',' set[$row] )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==11) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Q.g:47:20: ',' set[$row]
					{
					match(input,11,FOLLOW_11_in_setFields261); 
					pushFollow(FOLLOW_set_in_setFields263);
					set(row);
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
		return row;
	}
	// $ANTLR end "setFields"



	// $ANTLR start "set"
	// Q.g:49:1: set[Row row] : ID '=' expr ;
	public final void set(Row row) throws RecognitionException {
		Token ID6=null;
		Object expr7 =null;

		try {
			// Q.g:50:5: ( ID '=' expr )
			// Q.g:50:9: ID '=' expr
			{
			ID6=(Token)match(input,ID,FOLLOW_ID_in_set286); 
			match(input,13,FOLLOW_13_in_set288); 
			pushFollow(FOLLOW_expr_in_set290);
			expr7=expr();
			state._fsp--;

			row.set((ID6!=null?ID6.getText():null), expr7);
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
	// $ANTLR end "set"



	// $ANTLR start "query"
	// Q.g:54:1: query returns [Object value] : 'select' columns+= ID ( ',' columns+= ID )* 'from' tbl= ID ( 'where' key= ID '=' expr |) ;
	public final Object query() throws RecognitionException {
		Object value = null;


		Token tbl=null;
		Token key=null;
		Token columns=null;
		List<Token> list_columns=null;
		Object expr8 =null;

		try {
			// Q.g:55:5: ( 'select' columns+= ID ( ',' columns+= ID )* 'from' tbl= ID ( 'where' key= ID '=' expr |) )
			// Q.g:55:9: 'select' columns+= ID ( ',' columns+= ID )* 'from' tbl= ID ( 'where' key= ID '=' expr |)
			{
			match(input,21,FOLLOW_21_in_query320); 
			columns=(Token)match(input,ID,FOLLOW_ID_in_query324); 
			if (list_columns==null) list_columns=new ArrayList<Token>();
			list_columns.add(columns);
			// Q.g:55:30: ( ',' columns+= ID )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==11) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// Q.g:55:31: ',' columns+= ID
					{
					match(input,11,FOLLOW_11_in_query327); 
					columns=(Token)match(input,ID,FOLLOW_ID_in_query331); 
					if (list_columns==null) list_columns=new ArrayList<Token>();
					list_columns.add(columns);
					}
					break;

				default :
					break loop5;
				}
			}

			match(input,15,FOLLOW_15_in_query335); 
			tbl=(Token)match(input,ID,FOLLOW_ID_in_query339); 
			// Q.g:56:9: ( 'where' key= ID '=' expr |)
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==24) ) {
				alt6=1;
			}
			else if ( (LA6_0==EOF||LA6_0==ID||(LA6_0 >= 11 && LA6_0 <= 12)||LA6_0==14||LA6_0==16||(LA6_0 >= 20 && LA6_0 <= 21)) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// Q.g:56:13: 'where' key= ID '=' expr
					{
					match(input,24,FOLLOW_24_in_query353); 
					key=(Token)match(input,ID,FOLLOW_ID_in_query357); 
					match(input,13,FOLLOW_13_in_query359); 
					pushFollow(FOLLOW_expr_in_query361);
					expr8=expr();
					state._fsp--;

					value = interp.select((tbl!=null?tbl.getText():null), list_columns, (key!=null?key.getText():null), expr8);
					}
					break;
				case 2 :
					// Q.g:58:13: 
					{
					value = interp.select((tbl!=null?tbl.getText():null), list_columns);
					}
					break;

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
		return value;
	}
	// $ANTLR end "query"



	// $ANTLR start "expr"
	// Q.g:64:1: expr returns [Object value] : ( ID | INT | STRING | query );
	public final Object expr() throws RecognitionException {
		Object value = null;


		Token ID9=null;
		Token INT10=null;
		Token STRING11=null;
		Object query12 =null;

		try {
			// Q.g:65:5: ( ID | INT | STRING | query )
			int alt7=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt7=1;
				}
				break;
			case INT:
				{
				alt7=2;
				}
				break;
			case STRING:
				{
				alt7=3;
				}
				break;
			case 21:
				{
				alt7=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// Q.g:65:9: ID
					{
					ID9=(Token)match(input,ID,FOLLOW_ID_in_expr425); 
					value = interp.load((ID9!=null?ID9.getText():null));
					}
					break;
				case 2 :
					// Q.g:66:9: INT
					{
					INT10=(Token)match(input,INT,FOLLOW_INT_in_expr442); 
					value = (INT10!=null?Integer.valueOf(INT10.getText()):0);
					}
					break;
				case 3 :
					// Q.g:67:9: STRING
					{
					STRING11=(Token)match(input,STRING,FOLLOW_STRING_in_expr458); 
					value = (STRING11!=null?STRING11.getText():null);
					}
					break;
				case 4 :
					// Q.g:68:9: query
					{
					pushFollow(FOLLOW_query_in_expr471);
					query12=query();
					state._fsp--;

					value = query12;
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
		return value;
	}
	// $ANTLR end "expr"

	// Delegated rules



	public static final BitSet FOLLOW_stat_in_program22 = new BitSet(new long[]{0x0000000000314022L});
	public static final BitSet FOLLOW_table_in_stat37 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insert_in_stat47 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assign_in_stat57 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_in_stat67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_stat77 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_print90 = new BitSet(new long[]{0x00000000002000E0L});
	public static final BitSet FOLLOW_expr_in_print92 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_print94 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_table116 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_table118 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_table122 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_table132 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_table134 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_table136 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_table140 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_table143 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_table147 = new BitSet(new long[]{0x0000000000000C00L});
	public static final BitSet FOLLOW_10_in_table151 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_table153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assign178 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_assign180 = new BitSet(new long[]{0x00000000002000E0L});
	public static final BitSet FOLLOW_expr_in_assign182 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_assign184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_insert202 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_insert204 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_insert206 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_insert208 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_setFields_in_insert210 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_insert213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_setFields257 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_setFields261 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_set_in_setFields263 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ID_in_set286 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_set288 = new BitSet(new long[]{0x00000000002000E0L});
	public static final BitSet FOLLOW_expr_in_set290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_query320 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_query324 = new BitSet(new long[]{0x0000000000008800L});
	public static final BitSet FOLLOW_11_in_query327 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_query331 = new BitSet(new long[]{0x0000000000008800L});
	public static final BitSet FOLLOW_15_in_query335 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_query339 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_24_in_query353 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_query357 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_query359 = new BitSet(new long[]{0x00000000002000E0L});
	public static final BitSet FOLLOW_expr_in_query361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_expr458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_query_in_expr471 = new BitSet(new long[]{0x0000000000000002L});
}
