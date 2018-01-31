package symtab.aggr;

// $ANTLR 3.5.2 DefRef.g 2016-12-26 14:57:33

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class DefRef extends TreeFilter {
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
	public TreeFilter[] getDelegates() {
		return new TreeFilter[] {};
	}

	// delegators


	public DefRef(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public DefRef(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return DefRef.tokenNames; }
	@Override public String getGrammarFileName() { return "DefRef.g"; }


	    SymbolTable symtab;
	    Scope currentScope;
	    public DefRef(TreeNodeStream input, SymbolTable symtab) {
	        this(input);
	        this.symtab = symtab;
	        currentScope = symtab.globals;
	    }



	// $ANTLR start "topdown"
	// DefRef.g:19:1: topdown : ( enterBlock | enterMethod | enterStruct | varDeclaration | resolveExpr | assignment );
	public final void topdown() throws RecognitionException {
		try {
			// DefRef.g:20:5: ( enterBlock | enterMethod | enterStruct | varDeclaration | resolveExpr | assignment )
			int alt1=6;
			switch ( input.LA(1) ) {
			case BLOCK:
				{
				alt1=1;
				}
				break;
			case METHOD_DECL:
				{
				alt1=2;
				}
				break;
			case 27:
				{
				alt1=3;
				}
				break;
			case ARG_DECL:
			case FIELD_DECL:
			case VAR_DECL:
				{
				alt1=4;
				}
				break;
			case EXPR:
				{
				alt1=5;
				}
				break;
			case 23:
				{
				alt1=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// DefRef.g:20:9: enterBlock
					{
					pushFollow(FOLLOW_enterBlock_in_topdown56);
					enterBlock();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// DefRef.g:21:9: enterMethod
					{
					pushFollow(FOLLOW_enterMethod_in_topdown66);
					enterMethod();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// DefRef.g:22:9: enterStruct
					{
					pushFollow(FOLLOW_enterStruct_in_topdown76);
					enterStruct();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// DefRef.g:23:9: varDeclaration
					{
					pushFollow(FOLLOW_varDeclaration_in_topdown86);
					varDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// DefRef.g:24:9: resolveExpr
					{
					pushFollow(FOLLOW_resolveExpr_in_topdown96);
					resolveExpr();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// DefRef.g:25:9: assignment
					{
					pushFollow(FOLLOW_assignment_in_topdown106);
					assignment();
					state._fsp--;
					if (state.failed) return;
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
	// $ANTLR end "topdown"



	// $ANTLR start "bottomup"
	// DefRef.g:28:1: bottomup : ( exitBlock | exitMethod | exitStruct );
	public final void bottomup() throws RecognitionException {
		try {
			// DefRef.g:29:5: ( exitBlock | exitMethod | exitStruct )
			int alt2=3;
			switch ( input.LA(1) ) {
			case BLOCK:
				{
				alt2=1;
				}
				break;
			case METHOD_DECL:
				{
				alt2=2;
				}
				break;
			case 27:
				{
				alt2=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// DefRef.g:29:9: exitBlock
					{
					pushFollow(FOLLOW_exitBlock_in_bottomup125);
					exitBlock();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// DefRef.g:30:9: exitMethod
					{
					pushFollow(FOLLOW_exitMethod_in_bottomup135);
					exitMethod();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// DefRef.g:31:9: exitStruct
					{
					pushFollow(FOLLOW_exitStruct_in_bottomup145);
					exitStruct();
					state._fsp--;
					if (state.failed) return;
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
	// $ANTLR end "bottomup"



	// $ANTLR start "enterBlock"
	// DefRef.g:36:1: enterBlock : BLOCK ;
	public final void enterBlock() throws RecognitionException {
		try {
			// DefRef.g:37:5: ( BLOCK )
			// DefRef.g:37:9: BLOCK
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_enterBlock166); if (state.failed) return;
			if ( state.backtracking==1 ) {currentScope = new LocalScope(currentScope);}
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
	// $ANTLR end "enterBlock"



	// $ANTLR start "exitBlock"
	// DefRef.g:39:1: exitBlock : BLOCK ;
	public final void exitBlock() throws RecognitionException {
		try {
			// DefRef.g:40:5: ( BLOCK )
			// DefRef.g:40:9: BLOCK
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_exitBlock187); if (state.failed) return;
			if ( state.backtracking==1 ) {
			        System.out.println("locals: "+currentScope);
			        currentScope = currentScope.getEnclosingScope();    // pop scope
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
	// $ANTLR end "exitBlock"



	// $ANTLR start "enterStruct"
	// DefRef.g:48:1: enterStruct : ^( 'struct' ID ( . )+ ) ;
	public final void enterStruct() throws RecognitionException {
		CommonTree ID1=null;

		try {
			// DefRef.g:49:5: ( ^( 'struct' ID ( . )+ ) )
			// DefRef.g:49:7: ^( 'struct' ID ( . )+ )
			{
			match(input,27,FOLLOW_27_in_enterStruct217); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_enterStruct219); if (state.failed) return;
			// DefRef.g:49:21: ( . )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= ARG_DECL && LA3_0 <= 30)) ) {
					alt3=1;
				}
				else if ( (LA3_0==UP) ) {
					alt3=2;
				}

				switch (alt3) {
				case 1 :
					// DefRef.g:49:21: .
					{
					matchAny(input); if (state.failed) return;
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==1 ) {
			      System.out.println("line "+ID1.getLine()+": def struct "+(ID1!=null?ID1.getText():null));
			      StructSymbol ss = new StructSymbol((ID1!=null?ID1.getText():null), currentScope);
			      currentScope.define(ss); // def struct in current scope
			      currentScope = ss;       // set current scope to struct scope
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
	// $ANTLR end "enterStruct"



	// $ANTLR start "exitStruct"
	// DefRef.g:57:1: exitStruct : 'struct' ;
	public final void exitStruct() throws RecognitionException {
		try {
			// DefRef.g:58:5: ( 'struct' )
			// DefRef.g:58:9: 'struct'
			{
			match(input,27,FOLLOW_27_in_exitStruct250); if (state.failed) return;
			if ( state.backtracking==1 ) {
			        System.out.println("fields: "+currentScope);
			        currentScope = currentScope.getEnclosingScope();    // pop scope
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
	// $ANTLR end "exitStruct"



	// $ANTLR start "enterMethod"
	// DefRef.g:66:1: enterMethod : ^( METHOD_DECL type ID ( . )* ) ;
	public final void enterMethod() throws RecognitionException {
		CommonTree ID2=null;
		TreeRuleReturnScope type3 =null;

		try {
			// DefRef.g:67:5: ( ^( METHOD_DECL type ID ( . )* ) )
			// DefRef.g:67:9: ^( METHOD_DECL type ID ( . )* )
			{
			match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_enterMethod282); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_type_in_enterMethod284);
			type3=type();
			state._fsp--;
			if (state.failed) return;
			ID2=(CommonTree)match(input,ID,FOLLOW_ID_in_enterMethod286); if (state.failed) return;
			// DefRef.g:67:31: ( . )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= ARG_DECL && LA4_0 <= 30)) ) {
					alt4=1;
				}
				else if ( (LA4_0==UP) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// DefRef.g:67:31: .
					{
					matchAny(input); if (state.failed) return;
					}
					break;

				default :
					break loop4;
				}
			}

			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==1 ) {
			        System.out.println("line "+ID2.getLine()+": def method "+(ID2!=null?ID2.getText():null));
			        MethodSymbol ms = new MethodSymbol((ID2!=null?ID2.getText():null),(type3!=null?((DefRef.type_return)type3).tsym:null),currentScope);
			        currentScope.define(ms); // def method in globals
			        currentScope = ms;       // set current scope to method scope
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
	// $ANTLR end "enterMethod"



	// $ANTLR start "exitMethod"
	// DefRef.g:75:1: exitMethod : METHOD_DECL ;
	public final void exitMethod() throws RecognitionException {
		try {
			// DefRef.g:76:5: ( METHOD_DECL )
			// DefRef.g:76:9: METHOD_DECL
			{
			match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_exitMethod319); if (state.failed) return;
			if ( state.backtracking==1 ) {
			        System.out.println("args: "+currentScope);
			        currentScope = currentScope.getEnclosingScope();    // pop method scope
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
	// $ANTLR end "exitMethod"



	// $ANTLR start "varDeclaration"
	// DefRef.g:86:1: varDeclaration : ^( ( FIELD_DECL | VAR_DECL | ARG_DECL ) type ID ( . )? ) ;
	public final void varDeclaration() throws RecognitionException {
		CommonTree ID4=null;
		TreeRuleReturnScope type5 =null;

		try {
			// DefRef.g:87:5: ( ^( ( FIELD_DECL | VAR_DECL | ARG_DECL ) type ID ( . )? ) )
			// DefRef.g:87:9: ^( ( FIELD_DECL | VAR_DECL | ARG_DECL ) type ID ( . )? )
			{
			if ( input.LA(1)==ARG_DECL||input.LA(1)==FIELD_DECL||input.LA(1)==VAR_DECL ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_type_in_varDeclaration361);
			type5=type();
			state._fsp--;
			if (state.failed) return;
			ID4=(CommonTree)match(input,ID,FOLLOW_ID_in_varDeclaration363); if (state.failed) return;
			// DefRef.g:87:50: ( . )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= ARG_DECL && LA5_0 <= 30)) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// DefRef.g:87:50: .
					{
					matchAny(input); if (state.failed) return;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==1 ) {
			        System.out.println("line "+ID4.getLine()+": def "+(ID4!=null?ID4.getText():null));
			        VariableSymbol vs = new VariableSymbol((ID4!=null?ID4.getText():null),(type5!=null?((DefRef.type_return)type5).tsym:null));
			        currentScope.define(vs);
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
	// $ANTLR end "varDeclaration"


	public static class type_return extends TreeRuleReturnScope {
		public Type tsym;
	};


	// $ANTLR start "type"
	// DefRef.g:97:1: type returns [Type tsym] : ( 'float' | 'int' | 'void' | ID );
	public final DefRef.type_return type() throws RecognitionException {
		DefRef.type_return retval = new DefRef.type_return();
		retval.start = input.LT(1);

		try {
			// DefRef.g:99:5: ( 'float' | 'int' | 'void' | ID )
			// DefRef.g:
			{
			if ( input.LA(1)==ID||(input.LA(1) >= 24 && input.LA(1) <= 25)||input.LA(1)==28 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			if ( state.backtracking==1 ) {retval.tsym = (Type)currentScope.resolve(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(retval.start),input.getTreeAdaptor().getTokenStopIndex(retval.start)));}
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



	// $ANTLR start "assignment"
	// DefRef.g:107:1: assignment : ^(eq= '=' member . ) ;
	public final void assignment() throws RecognitionException {
		CommonTree eq=null;
		Type member6 =null;

		try {
			// DefRef.g:108:5: ( ^(eq= '=' member . ) )
			// DefRef.g:108:9: ^(eq= '=' member . )
			{
			eq=(CommonTree)match(input,23,FOLLOW_23_in_assignment469); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_member_in_assignment471);
			member6=member();
			state._fsp--;
			if (state.failed) return;
			matchAny(input); if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==1 ) {
			        System.out.println("line "+eq.getLine()+": assign to type "+
			                           member6.getName());
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
	// $ANTLR end "assignment"



	// $ANTLR start "resolveExpr"
	// DefRef.g:115:1: resolveExpr : ^( EXPR member ) ;
	public final void resolveExpr() throws RecognitionException {
		try {
			// DefRef.g:115:13: ( ^( EXPR member ) )
			// DefRef.g:115:15: ^( EXPR member )
			{
			match(input,EXPR,FOLLOW_EXPR_in_resolveExpr499); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_member_in_resolveExpr501);
			member();
			state._fsp--;
			if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

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
	// $ANTLR end "resolveExpr"



	// $ANTLR start "member"
	// DefRef.g:118:1: member returns [Type type] : ( ^( '.' m= member ID ) | ID );
	public final Type member() throws RecognitionException {
		Type type = null;


		CommonTree ID7=null;
		CommonTree ID8=null;
		Type m =null;

		try {
			// DefRef.g:119:5: ( ^( '.' m= member ID ) | ID )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==21) ) {
				alt6=1;
			}
			else if ( (LA6_0==ID) ) {
				alt6=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return type;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// DefRef.g:119:7: ^( '.' m= member ID )
					{
					match(input,21,FOLLOW_21_in_member522); if (state.failed) return type;
					match(input, Token.DOWN, null); if (state.failed) return type;
					pushFollow(FOLLOW_member_in_member526);
					m=member();
					state._fsp--;
					if (state.failed) return type;
					ID7=(CommonTree)match(input,ID,FOLLOW_ID_in_member528); if (state.failed) return type;
					match(input, Token.UP, null); if (state.failed) return type;

					if ( state.backtracking==1 ) {
					      StructSymbol scope=(StructSymbol)m;// get scope of expr
					      Symbol s = scope.resolveMember((ID7!=null?ID7.getText():null));// resolve ID in scope
					      System.out.println("line "+ID7.getLine()+": ref "+
					                         m.getName()+"."+(ID7!=null?ID7.getText():null)+"="+s);
					      if ( s!=null ) type = s.type;           // return ID's type
					      }
					}
					break;
				case 2 :
					// DefRef.g:127:7: ID
					{
					ID8=(CommonTree)match(input,ID,FOLLOW_ID_in_member545); if (state.failed) return type;
					if ( state.backtracking==1 ) {
					      Symbol s = currentScope.resolve((ID8!=null?ID8.getText():null));
					      System.out.println("line "+ID8.getLine()+": ref "+(ID8!=null?ID8.getText():null)+"="+s);
					      if ( s!=null ) type = s.type;
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
		return type;
	}
	// $ANTLR end "member"

	// Delegated rules



	public static final BitSet FOLLOW_enterBlock_in_topdown56 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enterMethod_in_topdown66 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enterStruct_in_topdown76 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varDeclaration_in_topdown86 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_resolveExpr_in_topdown96 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_topdown106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exitBlock_in_bottomup125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exitMethod_in_bottomup135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exitStruct_in_bottomup145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_enterBlock166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_exitBlock187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_enterStruct217 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_enterStruct219 = new BitSet(new long[]{0x000000007FFFFFF0L});
	public static final BitSet FOLLOW_27_in_exitStruct250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_METHOD_DECL_in_enterMethod282 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_enterMethod284 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_enterMethod286 = new BitSet(new long[]{0x000000007FFFFFF8L});
	public static final BitSet FOLLOW_METHOD_DECL_in_exitMethod319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_varDeclaration353 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_varDeclaration361 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_varDeclaration363 = new BitSet(new long[]{0x000000007FFFFFF8L});
	public static final BitSet FOLLOW_23_in_assignment469 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_member_in_assignment471 = new BitSet(new long[]{0x000000007FFFFFF0L});
	public static final BitSet FOLLOW_EXPR_in_resolveExpr499 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_member_in_resolveExpr501 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_21_in_member522 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_member_in_member526 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ID_in_member528 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_member545 = new BitSet(new long[]{0x0000000000000002L});
}
