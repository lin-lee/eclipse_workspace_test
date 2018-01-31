package parsing.antlr;

// $ANTLR 3.5.2 Graphics.g 2016-12-14 08:58:33

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GraphicsParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "WS", "','", "'from'", 
		"'line'", "'to'"
	};
	public static final int EOF=-1;
	public static final int T__6=6;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int INT=4;
	public static final int WS=5;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public GraphicsParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public GraphicsParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return GraphicsParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Graphics.g"; }



	// $ANTLR start "file"
	// Graphics.g:6:1: file : ( command )+ ;
	public final void file() throws RecognitionException {
		try {
			// Graphics.g:6:6: ( ( command )+ )
			// Graphics.g:6:8: ( command )+
			{
			// Graphics.g:6:8: ( command )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==8) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Graphics.g:6:8: command
					{
					pushFollow(FOLLOW_command_in_file13);
					command();
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
	// $ANTLR end "file"



	// $ANTLR start "command"
	// Graphics.g:7:1: command : 'line' 'from' point 'to' point ;
	public final void command() throws RecognitionException {
		try {
			// Graphics.g:7:9: ( 'line' 'from' point 'to' point )
			// Graphics.g:7:11: 'line' 'from' point 'to' point
			{
			match(input,8,FOLLOW_8_in_command22); 
			match(input,7,FOLLOW_7_in_command24); 
			pushFollow(FOLLOW_point_in_command26);
			point();
			state._fsp--;

			match(input,9,FOLLOW_9_in_command28); 
			pushFollow(FOLLOW_point_in_command30);
			point();
			state._fsp--;

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
	// $ANTLR end "command"



	// $ANTLR start "point"
	// Graphics.g:8:1: point : INT ',' INT ;
	public final void point() throws RecognitionException {
		try {
			// Graphics.g:8:7: ( INT ',' INT )
			// Graphics.g:8:9: INT ',' INT
			{
			match(input,INT,FOLLOW_INT_in_point38); 
			match(input,6,FOLLOW_6_in_point40); 
			match(input,INT,FOLLOW_INT_in_point42); 
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
	// $ANTLR end "point"

	// Delegated rules



	public static final BitSet FOLLOW_command_in_file13 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_8_in_command22 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_command24 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_point_in_command26 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_command28 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_point_in_command30 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_point38 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_6_in_point40 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_INT_in_point42 = new BitSet(new long[]{0x0000000000000002L});
}
