package symtab.aggr;

// $ANTLR 3.5.2 Cymbol.g 2016-12-26 14:57:33

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class CymbolParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARG_DECL", "BLOCK", "CALL", "ELIST", 
		"EXPR", "FIELD_DECL", "ID", "INT", "LETTER", "METHOD_DECL", "SL_COMMENT", 
		"VAR_DECL", "WS", "'('", "')'", "'+'", "','", "'.'", "';'", "'='", "'float'", 
		"'int'", "'return'", "'struct'", "'void'", "'{'", "'}'"
	};
	public static final int EOF=-1;
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
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int ARG_DECL=4;
	public static final int BLOCK=5;
	public static final int CALL=6;
	public static final int ELIST=7;
	public static final int EXPR=8;
	public static final int FIELD_DECL=9;
	public static final int ID=10;
	public static final int INT=11;
	public static final int LETTER=12;
	public static final int METHOD_DECL=13;
	public static final int SL_COMMENT=14;
	public static final int VAR_DECL=15;
	public static final int WS=16;

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

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return CymbolParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Cymbol.g"; }


	public static class compilationUnit_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "compilationUnit"
	// Cymbol.g:18:1: compilationUnit : ( options {backtrack=true; } : structDeclaration | methodDeclaration | varDeclaration )+ ;
	public final CymbolParser.compilationUnit_return compilationUnit() throws RecognitionException {
		CymbolParser.compilationUnit_return retval = new CymbolParser.compilationUnit_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope structDeclaration1 =null;
		ParserRuleReturnScope methodDeclaration2 =null;
		ParserRuleReturnScope varDeclaration3 =null;


		try {
			// Cymbol.g:19:5: ( ( options {backtrack=true; } : structDeclaration | methodDeclaration | varDeclaration )+ )
			// Cymbol.g:19:9: ( options {backtrack=true; } : structDeclaration | methodDeclaration | varDeclaration )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// Cymbol.g:19:9: ( options {backtrack=true; } : structDeclaration | methodDeclaration | varDeclaration )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=4;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==27) ) {
					alt1=1;
				}
				else if ( (LA1_0==ID||(LA1_0 >= 24 && LA1_0 <= 25)||LA1_0==28) ) {
					int LA1_3 = input.LA(2);
					if ( (LA1_3==ID) ) {
						int LA1_4 = input.LA(3);
						if ( (LA1_4==17) ) {
							alt1=2;
						}
						else if ( ((LA1_4 >= 22 && LA1_4 <= 23)) ) {
							alt1=3;
						}

					}

				}

				switch (alt1) {
				case 1 :
					// Cymbol.g:21:5: structDeclaration
					{
					pushFollow(FOLLOW_structDeclaration_in_compilationUnit136);
					structDeclaration1=structDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, structDeclaration1.getTree());

					}
					break;
				case 2 :
					// Cymbol.g:21:25: methodDeclaration
					{
					pushFollow(FOLLOW_methodDeclaration_in_compilationUnit140);
					methodDeclaration2=methodDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDeclaration2.getTree());

					}
					break;
				case 3 :
					// Cymbol.g:21:45: varDeclaration
					{
					pushFollow(FOLLOW_varDeclaration_in_compilationUnit144);
					varDeclaration3=varDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration3.getTree());

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compilationUnit"


	public static class structDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "structDeclaration"
	// Cymbol.g:25:1: structDeclaration : 'struct' ID '{' ( structMember )+ '}' ';' -> ^( 'struct' ID ( structMember )+ ) ;
	public final CymbolParser.structDeclaration_return structDeclaration() throws RecognitionException {
		CymbolParser.structDeclaration_return retval = new CymbolParser.structDeclaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal4=null;
		Token ID5=null;
		Token char_literal6=null;
		Token char_literal8=null;
		Token char_literal9=null;
		ParserRuleReturnScope structMember7 =null;

		CommonTree string_literal4_tree=null;
		CommonTree ID5_tree=null;
		CommonTree char_literal6_tree=null;
		CommonTree char_literal8_tree=null;
		CommonTree char_literal9_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_structMember=new RewriteRuleSubtreeStream(adaptor,"rule structMember");

		try {
			// Cymbol.g:26:2: ( 'struct' ID '{' ( structMember )+ '}' ';' -> ^( 'struct' ID ( structMember )+ ) )
			// Cymbol.g:26:4: 'struct' ID '{' ( structMember )+ '}' ';'
			{
			string_literal4=(Token)match(input,27,FOLLOW_27_in_structDeclaration163); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_27.add(string_literal4);

			ID5=(Token)match(input,ID,FOLLOW_ID_in_structDeclaration165); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(ID5);

			char_literal6=(Token)match(input,29,FOLLOW_29_in_structDeclaration167); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_29.add(char_literal6);

			// Cymbol.g:26:20: ( structMember )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==ID||(LA2_0 >= 24 && LA2_0 <= 25)||(LA2_0 >= 27 && LA2_0 <= 28)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Cymbol.g:26:20: structMember
					{
					pushFollow(FOLLOW_structMember_in_structDeclaration169);
					structMember7=structMember();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_structMember.add(structMember7.getTree());
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			char_literal8=(Token)match(input,30,FOLLOW_30_in_structDeclaration172); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_30.add(char_literal8);

			char_literal9=(Token)match(input,22,FOLLOW_22_in_structDeclaration174); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_22.add(char_literal9);

			// AST REWRITE
			// elements: ID, 27, structMember
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 26:42: -> ^( 'struct' ID ( structMember )+ )
			{
				// Cymbol.g:26:45: ^( 'struct' ID ( structMember )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot(stream_27.nextNode(), root_1);
				adaptor.addChild(root_1, stream_ID.nextNode());
				if ( !(stream_structMember.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_structMember.hasNext() ) {
					adaptor.addChild(root_1, stream_structMember.nextTree());
				}
				stream_structMember.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "structDeclaration"


	public static class structMember_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "structMember"
	// Cymbol.g:29:1: structMember : ( type ID ';' -> ^( FIELD_DECL type ID ) | structDeclaration );
	public final CymbolParser.structMember_return structMember() throws RecognitionException {
		CymbolParser.structMember_return retval = new CymbolParser.structMember_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID11=null;
		Token char_literal12=null;
		ParserRuleReturnScope type10 =null;
		ParserRuleReturnScope structDeclaration13 =null;

		CommonTree ID11_tree=null;
		CommonTree char_literal12_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// Cymbol.g:30:2: ( type ID ';' -> ^( FIELD_DECL type ID ) | structDeclaration )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==ID||(LA3_0 >= 24 && LA3_0 <= 25)||LA3_0==28) ) {
				alt3=1;
			}
			else if ( (LA3_0==27) ) {
				alt3=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// Cymbol.g:30:4: type ID ';'
					{
					pushFollow(FOLLOW_type_in_structMember198);
					type10=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_type.add(type10.getTree());
					ID11=(Token)match(input,ID,FOLLOW_ID_in_structMember200); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(ID11);

					char_literal12=(Token)match(input,22,FOLLOW_22_in_structMember202); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_22.add(char_literal12);

					// AST REWRITE
					// elements: type, ID
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 30:16: -> ^( FIELD_DECL type ID )
					{
						// Cymbol.g:30:19: ^( FIELD_DECL type ID )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FIELD_DECL, "FIELD_DECL"), root_1);
						adaptor.addChild(root_1, stream_type.nextTree());
						adaptor.addChild(root_1, stream_ID.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Cymbol.g:31:4: structDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_structDeclaration_in_structMember217);
					structDeclaration13=structDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, structDeclaration13.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "structMember"


	public static class methodDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "methodDeclaration"
	// Cymbol.g:35:1: methodDeclaration : type ID '(' ( formalParameters )? ')' block -> ^( METHOD_DECL type ID ( formalParameters )? block ) ;
	public final CymbolParser.methodDeclaration_return methodDeclaration() throws RecognitionException {
		CymbolParser.methodDeclaration_return retval = new CymbolParser.methodDeclaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID15=null;
		Token char_literal16=null;
		Token char_literal18=null;
		ParserRuleReturnScope type14 =null;
		ParserRuleReturnScope formalParameters17 =null;
		ParserRuleReturnScope block19 =null;

		CommonTree ID15_tree=null;
		CommonTree char_literal16_tree=null;
		CommonTree char_literal18_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
		RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
		RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// Cymbol.g:36:5: ( type ID '(' ( formalParameters )? ')' block -> ^( METHOD_DECL type ID ( formalParameters )? block ) )
			// Cymbol.g:36:9: type ID '(' ( formalParameters )? ')' block
			{
			pushFollow(FOLLOW_type_in_methodDeclaration235);
			type14=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type.add(type14.getTree());
			ID15=(Token)match(input,ID,FOLLOW_ID_in_methodDeclaration237); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(ID15);

			char_literal16=(Token)match(input,17,FOLLOW_17_in_methodDeclaration239); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_17.add(char_literal16);

			// Cymbol.g:36:21: ( formalParameters )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==ID||(LA4_0 >= 24 && LA4_0 <= 25)||LA4_0==28) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// Cymbol.g:36:21: formalParameters
					{
					pushFollow(FOLLOW_formalParameters_in_methodDeclaration241);
					formalParameters17=formalParameters();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters17.getTree());
					}
					break;

			}

			char_literal18=(Token)match(input,18,FOLLOW_18_in_methodDeclaration244); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_18.add(char_literal18);

			pushFollow(FOLLOW_block_in_methodDeclaration246);
			block19=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_block.add(block19.getTree());
			// AST REWRITE
			// elements: block, ID, formalParameters, type
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 37:9: -> ^( METHOD_DECL type ID ( formalParameters )? block )
			{
				// Cymbol.g:37:12: ^( METHOD_DECL type ID ( formalParameters )? block )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHOD_DECL, "METHOD_DECL"), root_1);
				adaptor.addChild(root_1, stream_type.nextTree());
				adaptor.addChild(root_1, stream_ID.nextNode());
				// Cymbol.g:37:34: ( formalParameters )?
				if ( stream_formalParameters.hasNext() ) {
					adaptor.addChild(root_1, stream_formalParameters.nextTree());
				}
				stream_formalParameters.reset();

				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "methodDeclaration"


	public static class formalParameters_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "formalParameters"
	// Cymbol.g:41:1: formalParameters : type ID ( ',' type ID )* -> ( ^( ARG_DECL type ID ) )+ ;
	public final CymbolParser.formalParameters_return formalParameters() throws RecognitionException {
		CymbolParser.formalParameters_return retval = new CymbolParser.formalParameters_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID21=null;
		Token char_literal22=null;
		Token ID24=null;
		ParserRuleReturnScope type20 =null;
		ParserRuleReturnScope type23 =null;

		CommonTree ID21_tree=null;
		CommonTree char_literal22_tree=null;
		CommonTree ID24_tree=null;
		RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// Cymbol.g:42:5: ( type ID ( ',' type ID )* -> ( ^( ARG_DECL type ID ) )+ )
			// Cymbol.g:42:9: type ID ( ',' type ID )*
			{
			pushFollow(FOLLOW_type_in_formalParameters289);
			type20=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type.add(type20.getTree());
			ID21=(Token)match(input,ID,FOLLOW_ID_in_formalParameters291); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(ID21);

			// Cymbol.g:42:17: ( ',' type ID )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==20) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// Cymbol.g:42:18: ',' type ID
					{
					char_literal22=(Token)match(input,20,FOLLOW_20_in_formalParameters294); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_20.add(char_literal22);

					pushFollow(FOLLOW_type_in_formalParameters296);
					type23=type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_type.add(type23.getTree());
					ID24=(Token)match(input,ID,FOLLOW_ID_in_formalParameters298); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ID.add(ID24);

					}
					break;

				default :
					break loop5;
				}
			}

			// AST REWRITE
			// elements: type, ID
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 42:32: -> ( ^( ARG_DECL type ID ) )+
			{
				if ( !(stream_type.hasNext()||stream_ID.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_type.hasNext()||stream_ID.hasNext() ) {
					// Cymbol.g:42:35: ^( ARG_DECL type ID )
					{
					CommonTree root_1 = (CommonTree)adaptor.nil();
					root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARG_DECL, "ARG_DECL"), root_1);
					adaptor.addChild(root_1, stream_type.nextTree());
					adaptor.addChild(root_1, stream_ID.nextNode());
					adaptor.addChild(root_0, root_1);
					}

				}
				stream_type.reset();
				stream_ID.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formalParameters"


	public static class type_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type"
	// Cymbol.g:45:1: type : ( 'float' | 'int' | 'void' | ID );
	public final CymbolParser.type_return type() throws RecognitionException {
		CymbolParser.type_return retval = new CymbolParser.type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set25=null;

		CommonTree set25_tree=null;

		try {
			// Cymbol.g:45:5: ( 'float' | 'int' | 'void' | ID )
			// Cymbol.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set25=input.LT(1);
			if ( input.LA(1)==ID||(input.LA(1) >= 24 && input.LA(1) <= 25)||input.LA(1)==28 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set25));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class block_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "block"
	// Cymbol.g:52:1: block : '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) ;
	public final CymbolParser.block_return block() throws RecognitionException {
		CymbolParser.block_return retval = new CymbolParser.block_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal26=null;
		Token char_literal28=null;
		ParserRuleReturnScope statement27 =null;

		CommonTree char_literal26_tree=null;
		CommonTree char_literal28_tree=null;
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// Cymbol.g:53:5: ( '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) )
			// Cymbol.g:53:9: '{' ( statement )* '}'
			{
			char_literal26=(Token)match(input,29,FOLLOW_29_in_block372); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_29.add(char_literal26);

			// Cymbol.g:53:13: ( statement )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= ID && LA6_0 <= INT)||LA6_0==17||(LA6_0 >= 24 && LA6_0 <= 29)) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Cymbol.g:53:13: statement
					{
					pushFollow(FOLLOW_statement_in_block374);
					statement27=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement27.getTree());
					}
					break;

				default :
					break loop6;
				}
			}

			char_literal28=(Token)match(input,30,FOLLOW_30_in_block377); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_30.add(char_literal28);

			// AST REWRITE
			// elements: statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 53:28: -> ^( BLOCK ( statement )* )
			{
				// Cymbol.g:53:31: ^( BLOCK ( statement )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK, "BLOCK"), root_1);
				// Cymbol.g:53:39: ( statement )*
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_1, stream_statement.nextTree());
				}
				stream_statement.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"


	public static class varDeclaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "varDeclaration"
	// Cymbol.g:58:1: varDeclaration : type ID ( '=' expression )? ';' -> ^( VAR_DECL type ID ( expression )? ) ;
	public final CymbolParser.varDeclaration_return varDeclaration() throws RecognitionException {
		CymbolParser.varDeclaration_return retval = new CymbolParser.varDeclaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID30=null;
		Token char_literal31=null;
		Token char_literal33=null;
		ParserRuleReturnScope type29 =null;
		ParserRuleReturnScope expression32 =null;

		CommonTree ID30_tree=null;
		CommonTree char_literal31_tree=null;
		CommonTree char_literal33_tree=null;
		RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
		RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
		RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");

		try {
			// Cymbol.g:59:5: ( type ID ( '=' expression )? ';' -> ^( VAR_DECL type ID ( expression )? ) )
			// Cymbol.g:59:9: type ID ( '=' expression )? ';'
			{
			pushFollow(FOLLOW_type_in_varDeclaration407);
			type29=type();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type.add(type29.getTree());
			ID30=(Token)match(input,ID,FOLLOW_ID_in_varDeclaration409); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ID.add(ID30);

			// Cymbol.g:59:17: ( '=' expression )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==23) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// Cymbol.g:59:18: '=' expression
					{
					char_literal31=(Token)match(input,23,FOLLOW_23_in_varDeclaration412); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_23.add(char_literal31);

					pushFollow(FOLLOW_expression_in_varDeclaration414);
					expression32=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression32.getTree());
					}
					break;

			}

			char_literal33=(Token)match(input,22,FOLLOW_22_in_varDeclaration418); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_22.add(char_literal33);

			// AST REWRITE
			// elements: ID, type, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 59:39: -> ^( VAR_DECL type ID ( expression )? )
			{
				// Cymbol.g:59:42: ^( VAR_DECL type ID ( expression )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);
				adaptor.addChild(root_1, stream_type.nextTree());
				adaptor.addChild(root_1, stream_ID.nextNode());
				// Cymbol.g:59:61: ( expression )?
				if ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "varDeclaration"


	public static class statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// Cymbol.g:63:1: statement options {backtrack=true; } : ( block | structDeclaration | varDeclaration | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | postfixExpression ( '=' expression -> ^( '=' postfixExpression expression ) | -> ^( EXPR postfixExpression ) ) ';' );
	public final CymbolParser.statement_return statement() throws RecognitionException {
		CymbolParser.statement_return retval = new CymbolParser.statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal37=null;
		Token char_literal39=null;
		Token char_literal41=null;
		Token char_literal43=null;
		ParserRuleReturnScope block34 =null;
		ParserRuleReturnScope structDeclaration35 =null;
		ParserRuleReturnScope varDeclaration36 =null;
		ParserRuleReturnScope expression38 =null;
		ParserRuleReturnScope postfixExpression40 =null;
		ParserRuleReturnScope expression42 =null;

		CommonTree string_literal37_tree=null;
		CommonTree char_literal39_tree=null;
		CommonTree char_literal41_tree=null;
		CommonTree char_literal43_tree=null;
		RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
		RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_postfixExpression=new RewriteRuleSubtreeStream(adaptor,"rule postfixExpression");

		try {
			// Cymbol.g:65:5: ( block | structDeclaration | varDeclaration | 'return' ( expression )? ';' -> ^( 'return' ( expression )? ) | postfixExpression ( '=' expression -> ^( '=' postfixExpression expression ) | -> ^( EXPR postfixExpression ) ) ';' )
			int alt10=5;
			switch ( input.LA(1) ) {
			case 29:
				{
				alt10=1;
				}
				break;
			case 27:
				{
				alt10=2;
				}
				break;
			case ID:
				{
				int LA10_3 = input.LA(2);
				if ( (LA10_3==ID) ) {
					alt10=3;
				}
				else if ( (LA10_3==17||(LA10_3 >= 21 && LA10_3 <= 23)) ) {
					alt10=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 26:
				{
				alt10=4;
				}
				break;
			case 24:
			case 25:
			case 28:
				{
				alt10=3;
				}
				break;
			case INT:
			case 17:
				{
				alt10=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// Cymbol.g:65:9: block
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_block_in_statement459);
					block34=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, block34.getTree());

					}
					break;
				case 2 :
					// Cymbol.g:66:7: structDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_structDeclaration_in_statement467);
					structDeclaration35=structDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, structDeclaration35.getTree());

					}
					break;
				case 3 :
					// Cymbol.g:67:7: varDeclaration
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_varDeclaration_in_statement475);
					varDeclaration36=varDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, varDeclaration36.getTree());

					}
					break;
				case 4 :
					// Cymbol.g:68:9: 'return' ( expression )? ';'
					{
					string_literal37=(Token)match(input,26,FOLLOW_26_in_statement485); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_26.add(string_literal37);

					// Cymbol.g:68:18: ( expression )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( ((LA8_0 >= ID && LA8_0 <= INT)||LA8_0==17) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// Cymbol.g:68:18: expression
							{
							pushFollow(FOLLOW_expression_in_statement487);
							expression38=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression38.getTree());
							}
							break;

					}

					char_literal39=(Token)match(input,22,FOLLOW_22_in_statement490); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_22.add(char_literal39);

					// AST REWRITE
					// elements: 26, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 68:34: -> ^( 'return' ( expression )? )
					{
						// Cymbol.g:68:37: ^( 'return' ( expression )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_26.nextNode(), root_1);
						// Cymbol.g:68:48: ( expression )?
						if ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// Cymbol.g:69:9: postfixExpression ( '=' expression -> ^( '=' postfixExpression expression ) | -> ^( EXPR postfixExpression ) ) ';'
					{
					pushFollow(FOLLOW_postfixExpression_in_statement509);
					postfixExpression40=postfixExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_postfixExpression.add(postfixExpression40.getTree());
					// Cymbol.g:70:9: ( '=' expression -> ^( '=' postfixExpression expression ) | -> ^( EXPR postfixExpression ) )
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==23) ) {
						alt9=1;
					}
					else if ( (LA9_0==22) ) {
						alt9=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}

					switch (alt9) {
						case 1 :
							// Cymbol.g:70:13: '=' expression
							{
							char_literal41=(Token)match(input,23,FOLLOW_23_in_statement524); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_23.add(char_literal41);

							pushFollow(FOLLOW_expression_in_statement526);
							expression42=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression42.getTree());
							// AST REWRITE
							// elements: postfixExpression, 23, expression
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 70:28: -> ^( '=' postfixExpression expression )
							{
								// Cymbol.g:70:31: ^( '=' postfixExpression expression )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot(stream_23.nextNode(), root_1);
								adaptor.addChild(root_1, stream_postfixExpression.nextTree());
								adaptor.addChild(root_1, stream_expression.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;
						case 2 :
							// Cymbol.g:71:13: 
							{
							// AST REWRITE
							// elements: postfixExpression
							// token labels: 
							// rule labels: retval
							// token list labels: 
							// rule list labels: 
							// wildcard labels: 
							if ( state.backtracking==0 ) {
							retval.tree = root_0;
							RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

							root_0 = (CommonTree)adaptor.nil();
							// 71:13: -> ^( EXPR postfixExpression )
							{
								// Cymbol.g:71:16: ^( EXPR postfixExpression )
								{
								CommonTree root_1 = (CommonTree)adaptor.nil();
								root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_1);
								adaptor.addChild(root_1, stream_postfixExpression.nextTree());
								adaptor.addChild(root_0, root_1);
								}

							}


							retval.tree = root_0;
							}

							}
							break;

					}

					char_literal43=(Token)match(input,22,FOLLOW_22_in_statement576); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_22.add(char_literal43);

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class expressionList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expressionList"
	// Cymbol.g:76:1: expressionList : ( expression ( ',' expression )* -> ^( ELIST ( expression )+ ) | -> ELIST );
	public final CymbolParser.expressionList_return expressionList() throws RecognitionException {
		CymbolParser.expressionList_return retval = new CymbolParser.expressionList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal45=null;
		ParserRuleReturnScope expression44 =null;
		ParserRuleReturnScope expression46 =null;

		CommonTree char_literal45_tree=null;
		RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// Cymbol.g:77:5: ( expression ( ',' expression )* -> ^( ELIST ( expression )+ ) | -> ELIST )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( ((LA12_0 >= ID && LA12_0 <= INT)||LA12_0==17) ) {
				alt12=1;
			}
			else if ( (LA12_0==18) ) {
				alt12=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// Cymbol.g:77:9: expression ( ',' expression )*
					{
					pushFollow(FOLLOW_expression_in_expressionList602);
					expression44=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression44.getTree());
					// Cymbol.g:77:20: ( ',' expression )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==20) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// Cymbol.g:77:21: ',' expression
							{
							char_literal45=(Token)match(input,20,FOLLOW_20_in_expressionList605); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_20.add(char_literal45);

							pushFollow(FOLLOW_expression_in_expressionList607);
							expression46=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression46.getTree());
							}
							break;

						default :
							break loop11;
						}
					}

					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 77:38: -> ^( ELIST ( expression )+ )
					{
						// Cymbol.g:77:41: ^( ELIST ( expression )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELIST, "ELIST"), root_1);
						if ( !(stream_expression.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// Cymbol.g:78:9: 
					{
					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 78:9: -> ELIST
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(ELIST, "ELIST"));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expressionList"


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// Cymbol.g:81:1: expression : addExpression -> ^( EXPR addExpression ) ;
	public final CymbolParser.expression_return expression() throws RecognitionException {
		CymbolParser.expression_return retval = new CymbolParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope addExpression47 =null;

		RewriteRuleSubtreeStream stream_addExpression=new RewriteRuleSubtreeStream(adaptor,"rule addExpression");

		try {
			// Cymbol.g:82:5: ( addExpression -> ^( EXPR addExpression ) )
			// Cymbol.g:82:9: addExpression
			{
			pushFollow(FOLLOW_addExpression_in_expression649);
			addExpression47=addExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_addExpression.add(addExpression47.getTree());
			// AST REWRITE
			// elements: addExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 82:23: -> ^( EXPR addExpression )
			{
				// Cymbol.g:82:26: ^( EXPR addExpression )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_1);
				adaptor.addChild(root_1, stream_addExpression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class addExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "addExpression"
	// Cymbol.g:85:1: addExpression : postfixExpression ( '+' ^ postfixExpression )* ;
	public final CymbolParser.addExpression_return addExpression() throws RecognitionException {
		CymbolParser.addExpression_return retval = new CymbolParser.addExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal49=null;
		ParserRuleReturnScope postfixExpression48 =null;
		ParserRuleReturnScope postfixExpression50 =null;

		CommonTree char_literal49_tree=null;

		try {
			// Cymbol.g:86:2: ( postfixExpression ( '+' ^ postfixExpression )* )
			// Cymbol.g:86:4: postfixExpression ( '+' ^ postfixExpression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_postfixExpression_in_addExpression675);
			postfixExpression48=postfixExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpression48.getTree());

			// Cymbol.g:86:22: ( '+' ^ postfixExpression )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==19) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// Cymbol.g:86:23: '+' ^ postfixExpression
					{
					char_literal49=(Token)match(input,19,FOLLOW_19_in_addExpression678); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal49_tree = (CommonTree)adaptor.create(char_literal49);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal49_tree, root_0);
					}

					pushFollow(FOLLOW_postfixExpression_in_addExpression681);
					postfixExpression50=postfixExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postfixExpression50.getTree());

					}
					break;

				default :
					break loop13;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "addExpression"


	public static class postfixExpression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "postfixExpression"
	// Cymbol.g:90:1: postfixExpression : primary (lp= '(' ^ expressionList ')' !| '.' ^ ID )* ;
	public final CymbolParser.postfixExpression_return postfixExpression() throws RecognitionException {
		CymbolParser.postfixExpression_return retval = new CymbolParser.postfixExpression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token lp=null;
		Token char_literal53=null;
		Token char_literal54=null;
		Token ID55=null;
		ParserRuleReturnScope primary51 =null;
		ParserRuleReturnScope expressionList52 =null;

		CommonTree lp_tree=null;
		CommonTree char_literal53_tree=null;
		CommonTree char_literal54_tree=null;
		CommonTree ID55_tree=null;

		try {
			// Cymbol.g:91:5: ( primary (lp= '(' ^ expressionList ')' !| '.' ^ ID )* )
			// Cymbol.g:91:9: primary (lp= '(' ^ expressionList ')' !| '.' ^ ID )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_primary_in_postfixExpression700);
			primary51=primary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, primary51.getTree());

			// Cymbol.g:92:6: (lp= '(' ^ expressionList ')' !| '.' ^ ID )*
			loop14:
			while (true) {
				int alt14=3;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==17) ) {
					alt14=1;
				}
				else if ( (LA14_0==21) ) {
					alt14=2;
				}

				switch (alt14) {
				case 1 :
					// Cymbol.g:92:8: lp= '(' ^ expressionList ')' !
					{
					lp=(Token)match(input,17,FOLLOW_17_in_postfixExpression711); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					lp_tree = (CommonTree)adaptor.create(lp);
					root_0 = (CommonTree)adaptor.becomeRoot(lp_tree, root_0);
					}

					pushFollow(FOLLOW_expressionList_in_postfixExpression714);
					expressionList52=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList52.getTree());

					char_literal53=(Token)match(input,18,FOLLOW_18_in_postfixExpression716); if (state.failed) return retval;
					if ( state.backtracking==0 ) {lp.setType(CALL);}
					}
					break;
				case 2 :
					// Cymbol.g:93:8: '.' ^ ID
					{
					char_literal54=(Token)match(input,21,FOLLOW_21_in_postfixExpression728); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal54_tree = (CommonTree)adaptor.create(char_literal54);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal54_tree, root_0);
					}

					ID55=(Token)match(input,ID,FOLLOW_ID_in_postfixExpression731); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ID55_tree = (CommonTree)adaptor.create(ID55);
					adaptor.addChild(root_0, ID55_tree);
					}

					}
					break;

				default :
					break loop14;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "postfixExpression"


	public static class primary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "primary"
	// Cymbol.g:98:1: primary : ( ID | INT | '(' expression ')' -> expression );
	public final CymbolParser.primary_return primary() throws RecognitionException {
		CymbolParser.primary_return retval = new CymbolParser.primary_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ID56=null;
		Token INT57=null;
		Token char_literal58=null;
		Token char_literal60=null;
		ParserRuleReturnScope expression59 =null;

		CommonTree ID56_tree=null;
		CommonTree INT57_tree=null;
		CommonTree char_literal58_tree=null;
		CommonTree char_literal60_tree=null;
		RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
		RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// Cymbol.g:99:5: ( ID | INT | '(' expression ')' -> expression )
			int alt15=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt15=1;
				}
				break;
			case INT:
				{
				alt15=2;
				}
				break;
			case 17:
				{
				alt15=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// Cymbol.g:99:9: ID
					{
					root_0 = (CommonTree)adaptor.nil();


					ID56=(Token)match(input,ID,FOLLOW_ID_in_primary759); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ID56_tree = (CommonTree)adaptor.create(ID56);
					adaptor.addChild(root_0, ID56_tree);
					}

					}
					break;
				case 2 :
					// Cymbol.g:100:9: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					INT57=(Token)match(input,INT,FOLLOW_INT_in_primary769); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT57_tree = (CommonTree)adaptor.create(INT57);
					adaptor.addChild(root_0, INT57_tree);
					}

					}
					break;
				case 3 :
					// Cymbol.g:101:9: '(' expression ')'
					{
					char_literal58=(Token)match(input,17,FOLLOW_17_in_primary779); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_17.add(char_literal58);

					pushFollow(FOLLOW_expression_in_primary781);
					expression59=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression59.getTree());
					char_literal60=(Token)match(input,18,FOLLOW_18_in_primary783); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_18.add(char_literal60);

					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 101:28: -> expression
					{
						adaptor.addChild(root_0, stream_expression.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primary"

	// Delegated rules



	public static final BitSet FOLLOW_structDeclaration_in_compilationUnit136 = new BitSet(new long[]{0x000000001B000402L});
	public static final BitSet FOLLOW_methodDeclaration_in_compilationUnit140 = new BitSet(new long[]{0x000000001B000402L});
	public static final BitSet FOLLOW_varDeclaration_in_compilationUnit144 = new BitSet(new long[]{0x000000001B000402L});
	public static final BitSet FOLLOW_27_in_structDeclaration163 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_structDeclaration165 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_structDeclaration167 = new BitSet(new long[]{0x000000001B000400L});
	public static final BitSet FOLLOW_structMember_in_structDeclaration169 = new BitSet(new long[]{0x000000005B000400L});
	public static final BitSet FOLLOW_30_in_structDeclaration172 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_structDeclaration174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_structMember198 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_structMember200 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_structMember202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_structDeclaration_in_structMember217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_methodDeclaration235 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_methodDeclaration237 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_methodDeclaration239 = new BitSet(new long[]{0x0000000013040400L});
	public static final BitSet FOLLOW_formalParameters_in_methodDeclaration241 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_methodDeclaration244 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_block_in_methodDeclaration246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_formalParameters289 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_formalParameters291 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_20_in_formalParameters294 = new BitSet(new long[]{0x0000000013000400L});
	public static final BitSet FOLLOW_type_in_formalParameters296 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_formalParameters298 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_29_in_block372 = new BitSet(new long[]{0x000000007F020C00L});
	public static final BitSet FOLLOW_statement_in_block374 = new BitSet(new long[]{0x000000007F020C00L});
	public static final BitSet FOLLOW_30_in_block377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_varDeclaration407 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_varDeclaration409 = new BitSet(new long[]{0x0000000000C00000L});
	public static final BitSet FOLLOW_23_in_varDeclaration412 = new BitSet(new long[]{0x0000000000020C00L});
	public static final BitSet FOLLOW_expression_in_varDeclaration414 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_varDeclaration418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_statement459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_structDeclaration_in_statement467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varDeclaration_in_statement475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_statement485 = new BitSet(new long[]{0x0000000000420C00L});
	public static final BitSet FOLLOW_expression_in_statement487 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_statement490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postfixExpression_in_statement509 = new BitSet(new long[]{0x0000000000C00000L});
	public static final BitSet FOLLOW_23_in_statement524 = new BitSet(new long[]{0x0000000000020C00L});
	public static final BitSet FOLLOW_expression_in_statement526 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_statement576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList602 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_20_in_expressionList605 = new BitSet(new long[]{0x0000000000020C00L});
	public static final BitSet FOLLOW_expression_in_expressionList607 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_addExpression_in_expression649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postfixExpression_in_addExpression675 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_19_in_addExpression678 = new BitSet(new long[]{0x0000000000020C00L});
	public static final BitSet FOLLOW_postfixExpression_in_addExpression681 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_primary_in_postfixExpression700 = new BitSet(new long[]{0x0000000000220002L});
	public static final BitSet FOLLOW_17_in_postfixExpression711 = new BitSet(new long[]{0x0000000000060C00L});
	public static final BitSet FOLLOW_expressionList_in_postfixExpression714 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_postfixExpression716 = new BitSet(new long[]{0x0000000000220002L});
	public static final BitSet FOLLOW_21_in_postfixExpression728 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_postfixExpression731 = new BitSet(new long[]{0x0000000000220002L});
	public static final BitSet FOLLOW_ID_in_primary759 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_primary769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_primary779 = new BitSet(new long[]{0x0000000000020C00L});
	public static final BitSet FOLLOW_expression_in_primary781 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_primary783 = new BitSet(new long[]{0x0000000000000002L});
}
