package symtab.nested;

// $ANTLR 3.5.2 DefRef.g 2016-12-20 11:16:46

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
		"EXPR", "ID", "INT", "LETTER", "METHOD_DECL", "SL_COMMENT", "VAR_DECL", 
		"WS", "'('", "')'", "'+'", "','", "';'", "'='", "'float'", "'int'", "'return'", 
		"'void'", "'{'", "'}'"
	};
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
	// DefRef.g:19:1: topdown : ( enterBlock | enterMethod | varDeclaration );
	public final void topdown() throws RecognitionException {
		try {
			// DefRef.g:20:5: ( enterBlock | enterMethod | varDeclaration )
			int alt1=3;
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
			case ARG_DECL:
			case VAR_DECL:
				{
				alt1=3;
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
					// DefRef.g:22:9: varDeclaration
					{
					pushFollow(FOLLOW_varDeclaration_in_topdown76);
					varDeclaration();
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
	// DefRef.g:25:1: bottomup : ( exitBlock | exitMethod | assignment | idref );
	public final void bottomup() throws RecognitionException {
		try {
			// DefRef.g:26:5: ( exitBlock | exitMethod | assignment | idref )
			int alt2=4;
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
			case 21:
				{
				alt2=3;
				}
				break;
			case ID:
				{
				alt2=4;
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
					// DefRef.g:26:9: exitBlock
					{
					pushFollow(FOLLOW_exitBlock_in_bottomup95);
					exitBlock();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// DefRef.g:27:9: exitMethod
					{
					pushFollow(FOLLOW_exitMethod_in_bottomup105);
					exitMethod();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// DefRef.g:28:9: assignment
					{
					pushFollow(FOLLOW_assignment_in_bottomup115);
					assignment();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// DefRef.g:29:9: idref
					{
					pushFollow(FOLLOW_idref_in_bottomup125);
					idref();
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
	// DefRef.g:35:1: enterBlock : BLOCK ;
	public final void enterBlock() throws RecognitionException {
		try {
			// DefRef.g:36:5: ( BLOCK )
			// DefRef.g:36:9: BLOCK
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_enterBlock147); if (state.failed) return;
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
	// DefRef.g:38:1: exitBlock : BLOCK ;
	public final void exitBlock() throws RecognitionException {
		try {
			// DefRef.g:39:5: ( BLOCK )
			// DefRef.g:39:9: BLOCK
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_exitBlock167); if (state.failed) return;
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



	// $ANTLR start "enterMethod"
	// DefRef.g:48:1: enterMethod : ^( METHOD_DECL type ID ( . )* ) ;
	public final void enterMethod() throws RecognitionException {
		CommonTree ID1=null;
		TreeRuleReturnScope type2 =null;

		try {
			// DefRef.g:49:5: ( ^( METHOD_DECL type ID ( . )* ) )
			// DefRef.g:49:9: ^( METHOD_DECL type ID ( . )* )
			{
			match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_enterMethod200); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_type_in_enterMethod202);
			type2=type();
			state._fsp--;
			if (state.failed) return;
			ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_enterMethod204); if (state.failed) return;
			// DefRef.g:49:31: ( . )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= ARG_DECL && LA3_0 <= 27)) ) {
					alt3=1;
				}
				else if ( (LA3_0==UP) ) {
					alt3=2;
				}

				switch (alt3) {
				case 1 :
					// DefRef.g:49:31: .
					{
					matchAny(input); if (state.failed) return;
					}
					break;

				default :
					break loop3;
				}
			}

			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==1 ) {
			        System.out.println("line "+ID1.getLine()+": def method "+
			                           (ID1!=null?ID1.getText():null));
			        Type retType = (type2!=null?((DefRef.type_return)type2).tsym:null); // rule type returns a Type symbol
			        MethodSymbol ms = new MethodSymbol((ID1!=null?ID1.getText():null),retType,
			                                           currentScope);
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
	// DefRef.g:60:1: exitMethod : METHOD_DECL ;
	public final void exitMethod() throws RecognitionException {
		try {
			// DefRef.g:61:5: ( METHOD_DECL )
			// DefRef.g:61:9: METHOD_DECL
			{
			match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_exitMethod237); if (state.failed) return;
			if ( state.backtracking==1 ) {
			        System.out.println("args: "+currentScope);
			        currentScope = currentScope.getEnclosingScope();// pop method scope
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
	// DefRef.g:72:1: varDeclaration : ^( ( ARG_DECL | VAR_DECL ) type ID ( . )? ) ;
	public final void varDeclaration() throws RecognitionException {
		CommonTree ID3=null;
		TreeRuleReturnScope type4 =null;

		try {
			// DefRef.g:73:5: ( ^( ( ARG_DECL | VAR_DECL ) type ID ( . )? ) )
			// DefRef.g:73:9: ^( ( ARG_DECL | VAR_DECL ) type ID ( . )? )
			{
			if ( input.LA(1)==ARG_DECL||input.LA(1)==VAR_DECL ) {
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
			pushFollow(FOLLOW_type_in_varDeclaration278);
			type4=type();
			state._fsp--;
			if (state.failed) return;
			ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_varDeclaration280); if (state.failed) return;
			// DefRef.g:73:39: ( . )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= ARG_DECL && LA4_0 <= 27)) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// DefRef.g:73:39: .
					{
					matchAny(input); if (state.failed) return;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==1 ) {
			        System.out.println("line "+ID3.getLine()+": def "+(ID3!=null?ID3.getText():null));
			        VariableSymbol vs = new VariableSymbol((ID3!=null?ID3.getText():null),(type4!=null?((DefRef.type_return)type4).tsym:null));
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
	// DefRef.g:83:1: type returns [Type tsym] : ( 'float' | 'int' | 'void' );
	public final DefRef.type_return type() throws RecognitionException {
		DefRef.type_return retval = new DefRef.type_return();
		retval.start = input.LT(1);

		try {
			// DefRef.g:85:5: ( 'float' | 'int' | 'void' )
			// DefRef.g:
			{
			if ( (input.LA(1) >= 22 && input.LA(1) <= 23)||input.LA(1)==25 ) {
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
	// DefRef.g:92:1: assignment : ^( '=' ID . ) ;
	public final void assignment() throws RecognitionException {
		CommonTree ID5=null;

		try {
			// DefRef.g:93:5: ( ^( '=' ID . ) )
			// DefRef.g:93:9: ^( '=' ID . )
			{
			match(input,21,FOLLOW_21_in_assignment369); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			ID5=(CommonTree)match(input,ID,FOLLOW_ID_in_assignment371); if (state.failed) return;
			matchAny(input); if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==1 ) {
			        VariableSymbol vs = (VariableSymbol)currentScope.resolve((ID5!=null?ID5.getText():null));
			        System.out.println("line "+ID5.getLine()+": assign to "+vs);
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


	public static class idref_return extends TreeRuleReturnScope {
	};


	// $ANTLR start "idref"
	// DefRef.g:101:1: idref :{...}? ID ;
	public final DefRef.idref_return idref() throws RecognitionException {
		DefRef.idref_return retval = new DefRef.idref_return();
		retval.start = input.LT(1);

		CommonTree ID6=null;

		try {
			// DefRef.g:102:5: ({...}? ID )
			// DefRef.g:102:9: {...}? ID
			{
			if ( !((((CommonTree)retval.start).hasAncestor(EXPR))) ) {
				if (state.backtracking>0) {state.failed=true; return retval;}
				throw new FailedPredicateException(input, "idref", "$start.hasAncestor(EXPR)");
			}
			ID6=(CommonTree)match(input,ID,FOLLOW_ID_in_idref406); if (state.failed) return retval;
			if ( state.backtracking==1 ) {
			        Symbol s = currentScope.resolve((ID6!=null?ID6.getText():null));
			        System.out.println("line "+ID6.getLine()+": ref "+s);
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
	// $ANTLR end "idref"

	// Delegated rules



	public static final BitSet FOLLOW_enterBlock_in_topdown56 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enterMethod_in_topdown66 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varDeclaration_in_topdown76 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exitBlock_in_bottomup95 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exitMethod_in_bottomup105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_bottomup115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_idref_in_bottomup125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_enterBlock147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_exitBlock167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_METHOD_DECL_in_enterMethod200 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_enterMethod202 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_enterMethod204 = new BitSet(new long[]{0x000000000FFFFFF8L});
	public static final BitSet FOLLOW_METHOD_DECL_in_exitMethod237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_varDeclaration272 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_varDeclaration278 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ID_in_varDeclaration280 = new BitSet(new long[]{0x000000000FFFFFF8L});
	public static final BitSet FOLLOW_21_in_assignment369 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_assignment371 = new BitSet(new long[]{0x000000000FFFFFF0L});
	public static final BitSet FOLLOW_ID_in_idref406 = new BitSet(new long[]{0x0000000000000002L});
}
