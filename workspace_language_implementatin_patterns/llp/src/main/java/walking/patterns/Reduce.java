package walking.patterns;

// $ANTLR 3.5.2 Reduce.g 2016-12-16 14:12:07

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


@SuppressWarnings("all")
public class Reduce extends TreeRewriter {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "MULT", "SHIFT", 
		"VEC", "WS", "'('", "')'", "'+'", "','", "'.'", "'='", "'['", "']'", "'print'"
	};
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int ID=4;
	public static final int INT=5;
	public static final int MULT=6;
	public static final int SHIFT=7;
	public static final int VEC=8;
	public static final int WS=9;

	// delegates
	public TreeRewriter[] getDelegates() {
		return new TreeRewriter[] {};
	}

	// delegators


	public Reduce(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public Reduce(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return Reduce.tokenNames; }
	@Override public String getGrammarFileName() { return "Reduce.g"; }


	public static class bottomup_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bottomup"
	// Reduce.g:10:1: bottomup : ( xPlusx | multBy2 | combineShifts );
	@Override
	public final Reduce.bottomup_return bottomup() throws RecognitionException {
		Reduce.bottomup_return retval = new Reduce.bottomup_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope xPlusx1 =null;
		TreeRuleReturnScope multBy22 =null;
		TreeRuleReturnScope combineShifts3 =null;


		try {
			// Reduce.g:11:2: ( xPlusx | multBy2 | combineShifts )
			int alt1=3;
			switch ( input.LA(1) ) {
			case 12:
				{
				alt1=1;
				}
				break;
			case MULT:
				{
				alt1=2;
				}
				break;
			case SHIFT:
				{
				alt1=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// Reduce.g:11:4: xPlusx
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_xPlusx_in_bottomup47);
					xPlusx1=xPlusx();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (CommonTree)xPlusx1.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (CommonTree)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 2 :
					// Reduce.g:12:4: multBy2
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_multBy2_in_bottomup52);
					multBy22=multBy2();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (CommonTree)multBy22.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (CommonTree)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 3 :
					// Reduce.g:13:4: combineShifts
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_combineShifts_in_bottomup57);
					combineShifts3=combineShifts();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (CommonTree)combineShifts3.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (CommonTree)adaptor.getParent(retval.tree);
					}

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
		return retval;
	}
	// $ANTLR end "bottomup"


	public static class xPlusx_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "xPlusx"
	// Reduce.g:18:1: xPlusx : ^( '+' i= INT j= INT {...}?) -> ^( MULT[\"*\"] INT[\"2\"] $j) ;
	public final Reduce.xPlusx_return xPlusx() throws RecognitionException {
		Reduce.xPlusx_return retval = new Reduce.xPlusx_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree i=null;
		CommonTree j=null;
		CommonTree char_literal4=null;

		CommonTree i_tree=null;
		CommonTree j_tree=null;
		CommonTree char_literal4_tree=null;
		RewriteRuleNodeStream stream_INT=new RewriteRuleNodeStream(adaptor,"token INT");
		RewriteRuleNodeStream stream_12=new RewriteRuleNodeStream(adaptor,"token 12");

		try {
			// Reduce.g:18:8: ( ^( '+' i= INT j= INT {...}?) -> ^( MULT[\"*\"] INT[\"2\"] $j) )
			// Reduce.g:18:10: ^( '+' i= INT j= INT {...}?)
			{
			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			_last = (CommonTree)input.LT(1);
			char_literal4=(CommonTree)match(input,12,FOLLOW_12_in_xPlusx70); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_12.add(char_literal4);

			if ( state.backtracking==1 )
			if ( _first_0==null ) _first_0 = char_literal4;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			i=(CommonTree)match(input,INT,FOLLOW_INT_in_xPlusx74); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_INT.add(i);

			_last = (CommonTree)input.LT(1);
			j=(CommonTree)match(input,INT,FOLLOW_INT_in_xPlusx78); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_INT.add(j);

			if ( !(((i!=null?Integer.valueOf(i.getText()):0)==(j!=null?Integer.valueOf(j.getText()):0))) ) {
				if (state.backtracking>0) {state.failed=true; return retval;}
				throw new FailedPredicateException(input, "xPlusx", "$i.int==$j.int");
			}
			match(input, Token.UP, null); if (state.failed) return retval;
			_last = _save_last_1;
			}


			// AST REWRITE
			// elements: j, INT
			// token labels: j
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==1 ) {
			retval.tree = root_0;
			RewriteRuleNodeStream stream_j=new RewriteRuleNodeStream(adaptor,"token j",j);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 18:47: -> ^( MULT[\"*\"] INT[\"2\"] $j)
			{
				// Reduce.g:18:50: ^( MULT[\"*\"] INT[\"2\"] $j)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MULT, "*"), root_1);
				adaptor.addChild(root_1, (CommonTree)adaptor.create(INT, "2"));
				adaptor.addChild(root_1, stream_j.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			input.replaceChildren(adaptor.getParent(retval.start),
								  adaptor.getChildIndex(retval.start),
								  adaptor.getChildIndex(_last),
								  retval.tree);
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
		return retval;
	}
	// $ANTLR end "xPlusx"


	public static class multBy2_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multBy2"
	// Reduce.g:22:1: multBy2 : ( ^( '*' x= INT {...}?y= . ) -> ^( SHIFT[\"<<\"] $y INT[\"1\"] ) | ^( '*' a= . b= INT {...}?) -> ^( SHIFT[\"<<\"] $a INT[\"1\"] ) );
	public final Reduce.multBy2_return multBy2() throws RecognitionException {
		Reduce.multBy2_return retval = new Reduce.multBy2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree x=null;
		CommonTree b=null;
		CommonTree char_literal5=null;
		CommonTree char_literal6=null;
		CommonTree y=null;
		CommonTree a=null;

		CommonTree x_tree=null;
		CommonTree b_tree=null;
		CommonTree char_literal5_tree=null;
		CommonTree char_literal6_tree=null;
		CommonTree y_tree=null;
		CommonTree a_tree=null;
		RewriteRuleNodeStream stream_INT=new RewriteRuleNodeStream(adaptor,"token INT");
		RewriteRuleNodeStream stream_MULT=new RewriteRuleNodeStream(adaptor,"token MULT");

		try {
			// Reduce.g:23:3: ( ^( '*' x= INT {...}?y= . ) -> ^( SHIFT[\"<<\"] $y INT[\"1\"] ) | ^( '*' a= . b= INT {...}?) -> ^( SHIFT[\"<<\"] $a INT[\"1\"] ) )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==MULT) ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1==DOWN) ) {
					int LA2_2 = input.LA(3);
					if ( (LA2_2==INT) ) {
						switch ( input.LA(4) ) {
						case INT:
							{
							int LA2_5 = input.LA(5);
							if ( (LA2_5==DOWN) ) {
								alt2=1;
							}
							else if ( (LA2_5==UP) ) {
								int LA2_7 = input.LA(6);
								if ( (synpred3_Reduce()) ) {
									alt2=1;
								}
								else if ( (true) ) {
									alt2=2;
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 2, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case DOWN:
							{
							alt2=2;
							}
							break;
						case ID:
						case MULT:
						case SHIFT:
						case VEC:
						case WS:
						case 10:
						case 11:
						case 12:
						case 13:
						case 14:
						case 15:
						case 16:
						case 17:
						case 18:
							{
							alt2=1;
							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 2, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else if ( (LA2_2==ID||(LA2_2 >= MULT && LA2_2 <= 18)) ) {
						alt2=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// Reduce.g:23:5: ^( '*' x= INT {...}?y= . )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					_last = (CommonTree)input.LT(1);
					char_literal5=(CommonTree)match(input,MULT,FOLLOW_MULT_in_multBy2108); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MULT.add(char_literal5);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal5;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					x=(CommonTree)match(input,INT,FOLLOW_INT_in_multBy2112); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(x);

					if ( !(((x!=null?Integer.valueOf(x.getText()):0)==2)) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "multBy2", "$x.int==2");
					}
					_last = (CommonTree)input.LT(1);
					y=(CommonTree)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = y;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: INT, y
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: y
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_y=new RewriteRuleSubtreeStream(adaptor,"wildcard y",y);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 23:35: -> ^( SHIFT[\"<<\"] $y INT[\"1\"] )
					{
						// Reduce.g:23:38: ^( SHIFT[\"<<\"] $y INT[\"1\"] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SHIFT, "<<"), root_1);
						adaptor.addChild(root_1, stream_y.nextTree());
						adaptor.addChild(root_1, (CommonTree)adaptor.create(INT, "1"));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// Reduce.g:24:5: ^( '*' a= . b= INT {...}?)
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					_last = (CommonTree)input.LT(1);
					char_literal6=(CommonTree)match(input,MULT,FOLLOW_MULT_in_multBy2139); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MULT.add(char_literal6);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = char_literal6;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (CommonTree)input.LT(1);
					a=(CommonTree)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = a;

					_last = (CommonTree)input.LT(1);
					b=(CommonTree)match(input,INT,FOLLOW_INT_in_multBy2147); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(b);

					if ( !(((b!=null?Integer.valueOf(b.getText()):0)==2)) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "multBy2", "$b.int==2");
					}
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: INT, a
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: a
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"wildcard a",a);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 24:35: -> ^( SHIFT[\"<<\"] $a INT[\"1\"] )
					{
						// Reduce.g:24:38: ^( SHIFT[\"<<\"] $a INT[\"1\"] )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SHIFT, "<<"), root_1);
						adaptor.addChild(root_1, stream_a.nextTree());
						adaptor.addChild(root_1, (CommonTree)adaptor.create(INT, "1"));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

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
		return retval;
	}
	// $ANTLR end "multBy2"


	public static class combineShifts_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "combineShifts"
	// Reduce.g:27:1: combineShifts : ^( SHIFT ^( SHIFT e= . n= INT ) m= INT ) -> ^( SHIFT[\"<<\"] $e INT[String.valueOf($n.int+$m.int)] ) ;
	public final Reduce.combineShifts_return combineShifts() throws RecognitionException {
		Reduce.combineShifts_return retval = new Reduce.combineShifts_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree n=null;
		CommonTree m=null;
		CommonTree SHIFT7=null;
		CommonTree SHIFT8=null;
		CommonTree e=null;

		CommonTree n_tree=null;
		CommonTree m_tree=null;
		CommonTree SHIFT7_tree=null;
		CommonTree SHIFT8_tree=null;
		CommonTree e_tree=null;
		RewriteRuleNodeStream stream_SHIFT=new RewriteRuleNodeStream(adaptor,"token SHIFT");
		RewriteRuleNodeStream stream_INT=new RewriteRuleNodeStream(adaptor,"token INT");

		try {
			// Reduce.g:28:3: ( ^( SHIFT ^( SHIFT e= . n= INT ) m= INT ) -> ^( SHIFT[\"<<\"] $e INT[String.valueOf($n.int+$m.int)] ) )
			// Reduce.g:28:5: ^( SHIFT ^( SHIFT e= . n= INT ) m= INT )
			{
			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			_last = (CommonTree)input.LT(1);
			SHIFT7=(CommonTree)match(input,SHIFT,FOLLOW_SHIFT_in_combineShifts181); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_SHIFT.add(SHIFT7);

			if ( state.backtracking==1 )
			if ( _first_0==null ) _first_0 = SHIFT7;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_2 = _last;
			CommonTree _first_2 = null;
			_last = (CommonTree)input.LT(1);
			SHIFT8=(CommonTree)match(input,SHIFT,FOLLOW_SHIFT_in_combineShifts184); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_SHIFT.add(SHIFT8);

			if ( state.backtracking==1 )
			if ( _first_1==null ) _first_1 = SHIFT8;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (CommonTree)input.LT(1);
			e=(CommonTree)input.LT(1);
			matchAny(input); if (state.failed) return retval;
			 
			if ( state.backtracking==1 )
			if ( _first_2==null ) _first_2 = e;

			_last = (CommonTree)input.LT(1);
			n=(CommonTree)match(input,INT,FOLLOW_INT_in_combineShifts192); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_INT.add(n);

			match(input, Token.UP, null); if (state.failed) return retval;
			_last = _save_last_2;
			}


			_last = (CommonTree)input.LT(1);
			m=(CommonTree)match(input,INT,FOLLOW_INT_in_combineShifts197); if (state.failed) return retval;
			 
			if ( state.backtracking==1 ) stream_INT.add(m);

			match(input, Token.UP, null); if (state.failed) return retval;
			_last = _save_last_1;
			}


			// AST REWRITE
			// elements: SHIFT, e, INT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: e
			if ( state.backtracking==1 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"wildcard e",e);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 28:39: -> ^( SHIFT[\"<<\"] $e INT[String.valueOf($n.int+$m.int)] )
			{
				// Reduce.g:28:42: ^( SHIFT[\"<<\"] $e INT[String.valueOf($n.int+$m.int)] )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SHIFT, "<<"), root_1);
				adaptor.addChild(root_1, stream_e.nextTree());
				adaptor.addChild(root_1, (CommonTree)adaptor.create(INT, String.valueOf((n!=null?Integer.valueOf(n.getText()):0)+(m!=null?Integer.valueOf(m.getText()):0))));
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			input.replaceChildren(adaptor.getParent(retval.start),
								  adaptor.getChildIndex(retval.start),
								  adaptor.getChildIndex(_last),
								  retval.tree);
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
		return retval;
	}
	// $ANTLR end "combineShifts"

	// $ANTLR start synpred3_Reduce
	public final void synpred3_Reduce_fragment() throws RecognitionException {
		CommonTree x=null;
		CommonTree y=null;


		// Reduce.g:23:5: ( ^( '*' x= INT {...}?y= . ) )
		// Reduce.g:23:5: ^( '*' x= INT {...}?y= . )
		{
		match(input,MULT,FOLLOW_MULT_in_synpred3_Reduce108); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		x=(CommonTree)match(input,INT,FOLLOW_INT_in_synpred3_Reduce112); if (state.failed) return;

		if ( !(((x!=null?Integer.valueOf(x.getText()):0)==2)) ) {
			if (state.backtracking>0) {state.failed=true; return;}
			throw new FailedPredicateException(input, "synpred3_Reduce", "$x.int==2");
		}
		y=(CommonTree)input.LT(1);
		matchAny(input); if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred3_Reduce

	// Delegated rules

	public final boolean synpred3_Reduce() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_Reduce_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_xPlusx_in_bottomup47 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multBy2_in_bottomup52 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_combineShifts_in_bottomup57 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_xPlusx70 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_xPlusx74 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_INT_in_xPlusx78 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MULT_in_multBy2108 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_multBy2112 = new BitSet(new long[]{0x000000000007FFF0L});
	public static final BitSet FOLLOW_MULT_in_multBy2139 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_multBy2147 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SHIFT_in_combineShifts181 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SHIFT_in_combineShifts184 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_combineShifts192 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INT_in_combineShifts197 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MULT_in_synpred3_Reduce108 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_synpred3_Reduce112 = new BitSet(new long[]{0x000000000007FFF0L});
}
