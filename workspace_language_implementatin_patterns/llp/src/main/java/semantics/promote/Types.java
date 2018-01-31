package semantics.promote;

// $ANTLR 3.5.2 Types.g 2016-12-28 13:39:59

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class Types extends TreeFilter {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARG_DECL", "ASSIGN", "BLOCK", 
		"CALL", "CHAR", "ELIST", "EXPR", "FIELD_DECL", "FLOAT", "ID", "INDEX", 
		"INT", "LETTER", "METHOD_DECL", "SL_COMMENT", "UNARY_MINUS", "UNARY_NOT", 
		"VAR_DECL", "WS", "'!'", "'!='", "'('", "')'", "'*'", "'+'", "','", "'-'", 
		"'.'", "'/'", "';'", "'<'", "'<='", "'=='", "'>'", "'>='", "'['", "'[]'", 
		"']'", "'boolean'", "'char'", "'else'", "'false'", "'float'", "'if'", 
		"'int'", "'return'", "'struct'", "'true'", "'void'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
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
	public static final int ARG_DECL=4;
	public static final int ASSIGN=5;
	public static final int BLOCK=6;
	public static final int CALL=7;
	public static final int CHAR=8;
	public static final int ELIST=9;
	public static final int EXPR=10;
	public static final int FIELD_DECL=11;
	public static final int FLOAT=12;
	public static final int ID=13;
	public static final int INDEX=14;
	public static final int INT=15;
	public static final int LETTER=16;
	public static final int METHOD_DECL=17;
	public static final int SL_COMMENT=18;
	public static final int UNARY_MINUS=19;
	public static final int UNARY_NOT=20;
	public static final int VAR_DECL=21;
	public static final int WS=22;

	// delegates
	public TreeFilter[] getDelegates() {
		return new TreeFilter[] {};
	}

	// delegators


	public Types(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public Types(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return Types.tokenNames; }
	@Override public String getGrammarFileName() { return "Types.g"; }


	    SymbolTable symtab;
	    public Types(TreeNodeStream input, SymbolTable symtab) {
	        this(input);
	        this.symtab = symtab;
	    }



	// $ANTLR start "bottomup"
	// Types.g:17:1: bottomup : ( exprRoot | decl | ret | assignment );
	public final void bottomup() throws RecognitionException {
		try {
			// Types.g:18:5: ( exprRoot | decl | ret | assignment )
			int alt1=4;
			switch ( input.LA(1) ) {
			case EXPR:
				{
				alt1=1;
				}
				break;
			case VAR_DECL:
				{
				alt1=2;
				}
				break;
			case 49:
				{
				alt1=3;
				}
				break;
			case ASSIGN:
				{
				alt1=4;
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
					// Types.g:18:9: exprRoot
					{
					pushFollow(FOLLOW_exprRoot_in_bottomup57);
					exprRoot();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Types.g:19:9: decl
					{
					pushFollow(FOLLOW_decl_in_bottomup67);
					decl();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Types.g:20:9: ret
					{
					pushFollow(FOLLOW_ret_in_bottomup77);
					ret();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Types.g:21:9: assignment
					{
					pushFollow(FOLLOW_assignment_in_bottomup87);
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
	// $ANTLR end "bottomup"



	// $ANTLR start "decl"
	// Types.g:25:1: decl : ^( VAR_DECL . ID (init= . )? ) ;
	public final void decl() throws RecognitionException {
		CymbolAST ID1=null;
		CymbolAST init=null;

		try {
			// Types.g:25:5: ( ^( VAR_DECL . ID (init= . )? ) )
			// Types.g:25:9: ^( VAR_DECL . ID (init= . )? )
			{
			match(input,VAR_DECL,FOLLOW_VAR_DECL_in_decl103); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			matchAny(input); if (state.failed) return;
			ID1=(CymbolAST)match(input,ID,FOLLOW_ID_in_decl107); if (state.failed) return;
			// Types.g:25:25: (init= . )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= ARG_DECL && LA2_0 <= 54)) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// Types.g:25:26: init= .
					{
					init=(CymbolAST)input.LT(1);
					matchAny(input); if (state.failed) return;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==1 ) {if ( init!=null && init.evalType!=null )
			             symtab.declinit(ID1, init);}
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
	// $ANTLR end "decl"


	public static class ret_return extends TreeRuleReturnScope {
	};


	// $ANTLR start "ret"
	// Types.g:29:1: ret : ^( 'return' v= . ) ;
	public final Types.ret_return ret() throws RecognitionException {
		Types.ret_return retval = new Types.ret_return();
		retval.start = input.LT(1);

		CymbolAST v=null;

		try {
			// Types.g:29:5: ( ^( 'return' v= . ) )
			// Types.g:29:9: ^( 'return' v= . )
			{
			match(input,49,FOLLOW_49_in_ret145); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			v=(CymbolAST)input.LT(1);
			matchAny(input); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			if ( state.backtracking==1 ) {symtab.ret((MethodSymbol)((CymbolAST)retval.start).symbol, v);}
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
	// $ANTLR end "ret"



	// $ANTLR start "assignment"
	// Types.g:30:1: assignment : ^( '=' lhs= . rhs= . ) ;
	public final void assignment() throws RecognitionException {
		CymbolAST lhs=null;
		CymbolAST rhs=null;

		try {
			// Types.g:31:5: ( ^( '=' lhs= . rhs= . ) )
			// Types.g:31:9: ^( '=' lhs= . rhs= . )
			{
			match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment168); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			lhs=(CymbolAST)input.LT(1);
			matchAny(input); if (state.failed) return;
			rhs=(CymbolAST)input.LT(1);
			matchAny(input); if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==1 ) {symtab.assign(lhs, rhs);}
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



	// $ANTLR start "exprRoot"
	// Types.g:35:1: exprRoot : ^( EXPR expr ) ;
	public final void exprRoot() throws RecognitionException {
		CymbolAST EXPR2=null;
		TreeRuleReturnScope expr3 =null;

		try {
			// Types.g:36:5: ( ^( EXPR expr ) )
			// Types.g:36:9: ^( EXPR expr )
			{
			EXPR2=(CymbolAST)match(input,EXPR,FOLLOW_EXPR_in_exprRoot201); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_exprRoot203);
			expr3=expr();
			state._fsp--;
			if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==1 ) {EXPR2.evalType = (expr3!=null?((Types.expr_return)expr3).type:null);}
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
	// $ANTLR end "exprRoot"


	public static class expr_return extends TreeRuleReturnScope {
		public Type type;
	};


	// $ANTLR start "expr"
	// Types.g:39:1: expr returns [Type type] : ( 'true' | 'false' | CHAR | INT | FLOAT | ID | ^( UNARY_MINUS a= expr ) | ^( UNARY_NOT a= expr ) | member | arrayRef | call | binaryOps );
	public final Types.expr_return expr() throws RecognitionException {
		Types.expr_return retval = new Types.expr_return();
		retval.start = input.LT(1);

		CymbolAST ID4=null;
		TreeRuleReturnScope a =null;
		TreeRuleReturnScope member5 =null;
		TreeRuleReturnScope arrayRef6 =null;
		TreeRuleReturnScope call7 =null;
		TreeRuleReturnScope binaryOps8 =null;

		try {
			// Types.g:41:5: ( 'true' | 'false' | CHAR | INT | FLOAT | ID | ^( UNARY_MINUS a= expr ) | ^( UNARY_NOT a= expr ) | member | arrayRef | call | binaryOps )
			int alt3=12;
			switch ( input.LA(1) ) {
			case 51:
				{
				alt3=1;
				}
				break;
			case 45:
				{
				alt3=2;
				}
				break;
			case CHAR:
				{
				alt3=3;
				}
				break;
			case INT:
				{
				alt3=4;
				}
				break;
			case FLOAT:
				{
				alt3=5;
				}
				break;
			case ID:
				{
				alt3=6;
				}
				break;
			case UNARY_MINUS:
				{
				alt3=7;
				}
				break;
			case UNARY_NOT:
				{
				alt3=8;
				}
				break;
			case 31:
				{
				alt3=9;
				}
				break;
			case INDEX:
				{
				alt3=10;
				}
				break;
			case CALL:
				{
				alt3=11;
				}
				break;
			case 24:
			case 27:
			case 28:
			case 30:
			case 32:
			case 34:
			case 35:
			case 36:
			case 37:
			case 38:
				{
				alt3=12;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// Types.g:41:9: 'true'
					{
					match(input,51,FOLLOW_51_in_expr235); if (state.failed) return retval;
					if ( state.backtracking==1 ) {retval.type = SymbolTable._boolean;}
					}
					break;
				case 2 :
					// Types.g:42:9: 'false'
					{
					match(input,45,FOLLOW_45_in_expr252); if (state.failed) return retval;
					if ( state.backtracking==1 ) {retval.type = SymbolTable._boolean;}
					}
					break;
				case 3 :
					// Types.g:43:9: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_expr268); if (state.failed) return retval;
					if ( state.backtracking==1 ) {retval.type = SymbolTable._char;}
					}
					break;
				case 4 :
					// Types.g:44:9: INT
					{
					match(input,INT,FOLLOW_INT_in_expr287); if (state.failed) return retval;
					if ( state.backtracking==1 ) {retval.type = SymbolTable._int;}
					}
					break;
				case 5 :
					// Types.g:45:9: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_expr307); if (state.failed) return retval;
					if ( state.backtracking==1 ) {retval.type = SymbolTable._float;}
					}
					break;
				case 6 :
					// Types.g:46:9: ID
					{
					ID4=(CymbolAST)match(input,ID,FOLLOW_ID_in_expr325); if (state.failed) return retval;
					if ( state.backtracking==1 ) {VariableSymbol s=(VariableSymbol)ID4.scope.resolve((ID4!=null?ID4.getText():null));
					            ID4.symbol = s; retval.type = s.type;}
					}
					break;
				case 7 :
					// Types.g:48:9: ^( UNARY_MINUS a= expr )
					{
					match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expr338); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_expr342);
					a=expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==1 ) {retval.type =symtab.uminus((a!=null?((CymbolAST)a.start):null));}
					}
					break;
				case 8 :
					// Types.g:49:9: ^( UNARY_NOT a= expr )
					{
					match(input,UNARY_NOT,FOLLOW_UNARY_NOT_in_expr358); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_expr362);
					a=expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==1 ) {retval.type =symtab.unot((a!=null?((CymbolAST)a.start):null));}
					}
					break;
				case 9 :
					// Types.g:50:9: member
					{
					pushFollow(FOLLOW_member_in_expr379);
					member5=member();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) {retval.type = (member5!=null?((Types.member_return)member5).type:null);}
					}
					break;
				case 10 :
					// Types.g:51:9: arrayRef
					{
					pushFollow(FOLLOW_arrayRef_in_expr396);
					arrayRef6=arrayRef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) {retval.type = (arrayRef6!=null?((Types.arrayRef_return)arrayRef6).type:null);}
					}
					break;
				case 11 :
					// Types.g:52:9: call
					{
					pushFollow(FOLLOW_call_in_expr411);
					call7=call();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) {retval.type = (call7!=null?((Types.call_return)call7).type:null);}
					}
					break;
				case 12 :
					// Types.g:53:9: binaryOps
					{
					pushFollow(FOLLOW_binaryOps_in_expr430);
					binaryOps8=binaryOps();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) {retval.type = (binaryOps8!=null?((Types.binaryOps_return)binaryOps8).type:null);}
					}
					break;

			}
			if ( state.backtracking==1 ) { ((CymbolAST)retval.start).evalType = retval.type; }
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
	// $ANTLR end "expr"


	public static class binaryOps_return extends TreeRuleReturnScope {
		public Type type;
	};


	// $ANTLR start "binaryOps"
	// Types.g:56:1: binaryOps returns [Type type] : ( ^( bop a= expr b= expr ) | ^( relop a= expr b= expr ) | ^( eqop a= expr b= expr ) ) ;
	public final Types.binaryOps_return binaryOps() throws RecognitionException {
		Types.binaryOps_return retval = new Types.binaryOps_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope a =null;
		TreeRuleReturnScope b =null;

		try {
			// Types.g:58:5: ( ( ^( bop a= expr b= expr ) | ^( relop a= expr b= expr ) | ^( eqop a= expr b= expr ) ) )
			// Types.g:58:9: ( ^( bop a= expr b= expr ) | ^( relop a= expr b= expr ) | ^( eqop a= expr b= expr ) )
			{
			// Types.g:58:9: ( ^( bop a= expr b= expr ) | ^( relop a= expr b= expr ) | ^( eqop a= expr b= expr ) )
			int alt4=3;
			switch ( input.LA(1) ) {
			case 27:
			case 28:
			case 30:
			case 32:
				{
				alt4=1;
				}
				break;
			case 34:
			case 35:
			case 37:
			case 38:
				{
				alt4=2;
				}
				break;
			case 24:
			case 36:
				{
				alt4=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// Types.g:58:13: ^( bop a= expr b= expr )
					{
					pushFollow(FOLLOW_bop_in_binaryOps467);
					bop();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_binaryOps471);
					a=expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_binaryOps475);
					b=expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==1 ) {retval.type =symtab.bop((a!=null?((CymbolAST)a.start):null), (b!=null?((CymbolAST)b.start):null));}
					}
					break;
				case 2 :
					// Types.g:59:13: ^( relop a= expr b= expr )
					{
					pushFollow(FOLLOW_relop_in_binaryOps495);
					relop();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_binaryOps499);
					a=expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_binaryOps503);
					b=expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==1 ) {retval.type =symtab.relop((a!=null?((CymbolAST)a.start):null), (b!=null?((CymbolAST)b.start):null));}
					}
					break;
				case 3 :
					// Types.g:60:13: ^( eqop a= expr b= expr )
					{
					pushFollow(FOLLOW_eqop_in_binaryOps521);
					eqop();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_binaryOps525);
					a=expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_binaryOps529);
					b=expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==1 ) {retval.type =symtab.eqop((a!=null?((CymbolAST)a.start):null), (b!=null?((CymbolAST)b.start):null));}
					}
					break;

			}

			}

			if ( state.backtracking==1 ) { ((CymbolAST)retval.start).evalType = retval.type; }
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
	// $ANTLR end "binaryOps"


	public static class arrayRef_return extends TreeRuleReturnScope {
		public Type type;
	};


	// $ANTLR start "arrayRef"
	// Types.g:64:1: arrayRef returns [Type type] : ^( INDEX ID expr ) ;
	public final Types.arrayRef_return arrayRef() throws RecognitionException {
		Types.arrayRef_return retval = new Types.arrayRef_return();
		retval.start = input.LT(1);

		CymbolAST ID9=null;
		TreeRuleReturnScope expr10 =null;

		try {
			// Types.g:65:5: ( ^( INDEX ID expr ) )
			// Types.g:65:9: ^( INDEX ID expr )
			{
			match(input,INDEX,FOLLOW_INDEX_in_arrayRef567); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			ID9=(CymbolAST)match(input,ID,FOLLOW_ID_in_arrayRef569); if (state.failed) return retval;
			pushFollow(FOLLOW_expr_in_arrayRef571);
			expr10=expr();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			if ( state.backtracking==1 ) {
			        retval.type = symtab.arrayIndex(ID9, (expr10!=null?((CymbolAST)expr10.start):null));
			        ((CymbolAST)retval.start).evalType = retval.type;
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
	// $ANTLR end "arrayRef"


	public static class call_return extends TreeRuleReturnScope {
		public Type type;
	};


	// $ANTLR start "call"
	// Types.g:72:1: call returns [Type type] : ^( CALL ID ^( ELIST ( expr )* ) ) ;
	public final Types.call_return call() throws RecognitionException {
		Types.call_return retval = new Types.call_return();
		retval.start = input.LT(1);

		CymbolAST ID12=null;
		TreeRuleReturnScope expr11 =null;

		List args = new ArrayList();
		try {
			// Types.g:74:5: ( ^( CALL ID ^( ELIST ( expr )* ) ) )
			// Types.g:74:9: ^( CALL ID ^( ELIST ( expr )* ) )
			{
			match(input,CALL,FOLLOW_CALL_in_call611); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			ID12=(CymbolAST)match(input,ID,FOLLOW_ID_in_call613); if (state.failed) return retval;
			match(input,ELIST,FOLLOW_ELIST_in_call616); if (state.failed) return retval;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return retval;
				// Types.g:74:27: ( expr )*
				loop5:
				while (true) {
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( ((LA5_0 >= CALL && LA5_0 <= CHAR)||(LA5_0 >= FLOAT && LA5_0 <= INT)||(LA5_0 >= UNARY_MINUS && LA5_0 <= UNARY_NOT)||LA5_0==24||(LA5_0 >= 27 && LA5_0 <= 28)||(LA5_0 >= 30 && LA5_0 <= 32)||(LA5_0 >= 34 && LA5_0 <= 38)||LA5_0==45||LA5_0==51) ) {
						alt5=1;
					}

					switch (alt5) {
					case 1 :
						// Types.g:74:28: expr
						{
						pushFollow(FOLLOW_expr_in_call619);
						expr11=expr();
						state._fsp--;
						if (state.failed) return retval;
						if ( state.backtracking==1 ) {args.add((expr11!=null?((CymbolAST)expr11.start):null));}
						}
						break;

					default :
						break loop5;
					}
				}

				match(input, Token.UP, null); if (state.failed) return retval;
			}

			match(input, Token.UP, null); if (state.failed) return retval;

			if ( state.backtracking==1 ) {
			        retval.type = symtab.call(ID12, args);
			        ((CymbolAST)retval.start).evalType = retval.type;
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
	// $ANTLR end "call"


	public static class member_return extends TreeRuleReturnScope {
		public Type type;
	};


	// $ANTLR start "member"
	// Types.g:81:1: member returns [Type type] : ^( '.' expr ID ) ;
	public final Types.member_return member() throws RecognitionException {
		Types.member_return retval = new Types.member_return();
		retval.start = input.LT(1);

		CymbolAST ID14=null;
		TreeRuleReturnScope expr13 =null;

		try {
			// Types.g:82:5: ( ^( '.' expr ID ) )
			// Types.g:82:9: ^( '.' expr ID )
			{
			match(input,31,FOLLOW_31_in_member659); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_expr_in_member661);
			expr13=expr();
			state._fsp--;
			if (state.failed) return retval;
			ID14=(CymbolAST)match(input,ID,FOLLOW_ID_in_member663); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			if ( state.backtracking==1 ) {
			        retval.type = symtab.member((expr13!=null?((CymbolAST)expr13.start):null), ID14);
			        ((CymbolAST)retval.start).evalType = retval.type;
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
	// $ANTLR end "member"



	// $ANTLR start "bop"
	// Types.g:89:1: bop : ( '+' | '-' | '*' | '/' );
	public final void bop() throws RecognitionException {
		try {
			// Types.g:89:5: ( '+' | '-' | '*' | '/' )
			// Types.g:
			{
			if ( (input.LA(1) >= 27 && input.LA(1) <= 28)||input.LA(1)==30||input.LA(1)==32 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	// $ANTLR end "bop"



	// $ANTLR start "relop"
	// Types.g:91:1: relop : ( '<' | '>' | '<=' | '>=' );
	public final void relop() throws RecognitionException {
		try {
			// Types.g:91:6: ( '<' | '>' | '<=' | '>=' )
			// Types.g:
			{
			if ( (input.LA(1) >= 34 && input.LA(1) <= 35)||(input.LA(1) >= 37 && input.LA(1) <= 38) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	// $ANTLR end "relop"



	// $ANTLR start "eqop"
	// Types.g:93:1: eqop : ( '!=' | '==' );
	public final void eqop() throws RecognitionException {
		try {
			// Types.g:93:5: ( '!=' | '==' )
			// Types.g:
			{
			if ( input.LA(1)==24||input.LA(1)==36 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
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
	// $ANTLR end "eqop"

	// Delegated rules



	public static final BitSet FOLLOW_exprRoot_in_bottomup57 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_bottomup67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ret_in_bottomup77 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_bottomup87 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_DECL_in_decl103 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_decl107 = new BitSet(new long[]{0x007FFFFFFFFFFFF8L});
	public static final BitSet FOLLOW_49_in_ret145 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment168 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_EXPR_in_exprRoot201 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_exprRoot203 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_51_in_expr235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_expr252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_expr268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_expr307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expr325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_expr338 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr342 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_NOT_in_expr358 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr362 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_member_in_expr379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrayRef_in_expr396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_call_in_expr411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binaryOps_in_expr430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bop_in_binaryOps467 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_binaryOps471 = new BitSet(new long[]{0x0008207DD918F180L});
	public static final BitSet FOLLOW_expr_in_binaryOps475 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_relop_in_binaryOps495 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_binaryOps499 = new BitSet(new long[]{0x0008207DD918F180L});
	public static final BitSet FOLLOW_expr_in_binaryOps503 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_eqop_in_binaryOps521 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_binaryOps525 = new BitSet(new long[]{0x0008207DD918F180L});
	public static final BitSet FOLLOW_expr_in_binaryOps529 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INDEX_in_arrayRef567 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_arrayRef569 = new BitSet(new long[]{0x0008207DD918F180L});
	public static final BitSet FOLLOW_expr_in_arrayRef571 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CALL_in_call611 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_call613 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ELIST_in_call616 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_call619 = new BitSet(new long[]{0x0008207DD918F188L});
	public static final BitSet FOLLOW_31_in_member659 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_member661 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_member663 = new BitSet(new long[]{0x0000000000000008L});
}
