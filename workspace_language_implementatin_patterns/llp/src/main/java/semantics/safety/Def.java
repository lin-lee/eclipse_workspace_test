package semantics.safety;

// $ANTLR 3.5.2 Def.g 2016-12-28 16:03:47

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class Def extends TreeFilter {
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


	public Def(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public Def(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return Def.tokenNames; }
	@Override public String getGrammarFileName() { return "Def.g"; }


	    SymbolTable symtab;
	    Scope currentScope;
	    MethodSymbol currentMethod;
	    public Def(TreeNodeStream input, SymbolTable symtab) {
	        this(input);
	        this.symtab = symtab;
	        currentScope = symtab.globals;
	    }



	// $ANTLR start "topdown"
	// Def.g:20:1: topdown : ( enterBlock | enterMethod | enterStruct | atoms | varDeclaration | ret );
	public final void topdown() throws RecognitionException {
		try {
			// Def.g:21:5: ( enterBlock | enterMethod | enterStruct | atoms | varDeclaration | ret )
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
			case 50:
				{
				alt1=3;
				}
				break;
			case ID:
				{
				alt1=4;
				}
				break;
			case ARG_DECL:
			case FIELD_DECL:
			case VAR_DECL:
				{
				alt1=5;
				}
				break;
			case 49:
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
					// Def.g:21:9: enterBlock
					{
					pushFollow(FOLLOW_enterBlock_in_topdown56);
					enterBlock();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Def.g:22:9: enterMethod
					{
					pushFollow(FOLLOW_enterMethod_in_topdown66);
					enterMethod();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Def.g:23:9: enterStruct
					{
					pushFollow(FOLLOW_enterStruct_in_topdown76);
					enterStruct();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Def.g:24:9: atoms
					{
					pushFollow(FOLLOW_atoms_in_topdown86);
					atoms();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// Def.g:25:9: varDeclaration
					{
					pushFollow(FOLLOW_varDeclaration_in_topdown96);
					varDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// Def.g:26:9: ret
					{
					pushFollow(FOLLOW_ret_in_topdown106);
					ret();
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
	// Def.g:29:1: bottomup : ( exitBlock | exitMethod | exitStruct );
	public final void bottomup() throws RecognitionException {
		try {
			// Def.g:30:5: ( exitBlock | exitMethod | exitStruct )
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
			case 50:
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
					// Def.g:30:9: exitBlock
					{
					pushFollow(FOLLOW_exitBlock_in_bottomup125);
					exitBlock();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Def.g:31:9: exitMethod
					{
					pushFollow(FOLLOW_exitMethod_in_bottomup135);
					exitMethod();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Def.g:32:9: exitStruct
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
	// Def.g:37:1: enterBlock : BLOCK ;
	public final void enterBlock() throws RecognitionException {
		try {
			// Def.g:38:5: ( BLOCK )
			// Def.g:38:9: BLOCK
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
	// Def.g:40:1: exitBlock : BLOCK ;
	public final void exitBlock() throws RecognitionException {
		try {
			// Def.g:41:5: ( BLOCK )
			// Def.g:41:9: BLOCK
			{
			match(input,BLOCK,FOLLOW_BLOCK_in_exitBlock187); if (state.failed) return;
			if ( state.backtracking==1 ) {
			        //System.out.println("locals: "+currentScope);
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
	// Def.g:49:1: enterStruct : ^( 'struct' ID ( . )+ ) ;
	public final void enterStruct() throws RecognitionException {
		CymbolAST ID1=null;

		try {
			// Def.g:50:5: ( ^( 'struct' ID ( . )+ ) )
			// Def.g:50:9: ^( 'struct' ID ( . )+ )
			{
			match(input,50,FOLLOW_50_in_enterStruct218); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			ID1=(CymbolAST)match(input,ID,FOLLOW_ID_in_enterStruct220); if (state.failed) return;
			// Def.g:50:23: ( . )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= ARG_DECL && LA3_0 <= 54)) ) {
					alt3=1;
				}
				else if ( (LA3_0==UP) ) {
					alt3=2;
				}

				switch (alt3) {
				case 1 :
					// Def.g:50:23: .
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
			        //System.out.println("line "+ID1.getLine()+": def struct "+(ID1!=null?ID1.getText():null));
			        StructSymbol ss = new StructSymbol((ID1!=null?ID1.getText():null), currentScope);
			        ss.def = ID1;
			        ID1.symbol = ss;
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
	// Def.g:60:1: exitStruct : 'struct' ;
	public final void exitStruct() throws RecognitionException {
		try {
			// Def.g:61:5: ( 'struct' )
			// Def.g:61:9: 'struct'
			{
			match(input,50,FOLLOW_50_in_exitStruct252); if (state.failed) return;
			if ( state.backtracking==1 ) {
			        //System.out.println("fields: "+currentScope);
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
	// Def.g:69:1: enterMethod : ^( METHOD_DECL type ID ( . )* ) ;
	public final void enterMethod() throws RecognitionException {
		CymbolAST ID2=null;
		Type type3 =null;

		try {
			// Def.g:70:5: ( ^( METHOD_DECL type ID ( . )* ) )
			// Def.g:70:9: ^( METHOD_DECL type ID ( . )* )
			{
			match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_enterMethod283); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_type_in_enterMethod285);
			type3=type();
			state._fsp--;
			if (state.failed) return;
			ID2=(CymbolAST)match(input,ID,FOLLOW_ID_in_enterMethod287); if (state.failed) return;
			// Def.g:70:31: ( . )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= ARG_DECL && LA4_0 <= 54)) ) {
					alt4=1;
				}
				else if ( (LA4_0==UP) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// Def.g:70:31: .
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
			        //System.out.println("line "+ID2.getLine()+": def method "+(ID2!=null?ID2.getText():null));
			        MethodSymbol ms = new MethodSymbol((ID2!=null?ID2.getText():null),type3,currentScope);
			        currentMethod = ms;
			        ms.def = ID2;            // track AST location of def's ID
			        ID2.symbol = ms;         // track in AST
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


	public static class ret_return extends TreeRuleReturnScope {
	};


	// $ANTLR start "ret"
	// Def.g:83:1: ret : ^( 'return' . ) ;
	public final Def.ret_return ret() throws RecognitionException {
		Def.ret_return retval = new Def.ret_return();
		retval.start = input.LT(1);

		try {
			// Def.g:83:5: ( ^( 'return' . ) )
			// Def.g:83:9: ^( 'return' . )
			{
			match(input,49,FOLLOW_49_in_ret320); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			matchAny(input); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			if ( state.backtracking==1 ) {((CymbolAST)retval.start).symbol = currentMethod;}
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



	// $ANTLR start "exitMethod"
	// Def.g:86:1: exitMethod : METHOD_DECL ;
	public final void exitMethod() throws RecognitionException {
		try {
			// Def.g:87:5: ( METHOD_DECL )
			// Def.g:87:9: METHOD_DECL
			{
			match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_exitMethod348); if (state.failed) return;
			if ( state.backtracking==1 ) {
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



	// $ANTLR start "atoms"
	// Def.g:97:1: atoms :{...}? ID ;
	public final void atoms() throws RecognitionException {
		CymbolAST t = (CymbolAST)input.LT(1);
		try {
			// Def.g:99:5: ({...}? ID )
			// Def.g:99:8: {...}? ID
			{
			if ( !((t.hasAncestor(EXPR)||t.hasAncestor(ASSIGN))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "atoms", "t.hasAncestor(EXPR)||t.hasAncestor(ASSIGN)");
			}
			match(input,ID,FOLLOW_ID_in_atoms388); if (state.failed) return;
			if ( state.backtracking==1 ) {t.scope = currentScope;}
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
	// $ANTLR end "atoms"



	// $ANTLR start "varDeclaration"
	// Def.g:105:1: varDeclaration : ^( ( FIELD_DECL | VAR_DECL | ARG_DECL ) type ID ( . )? ) ;
	public final void varDeclaration() throws RecognitionException {
		CymbolAST ID4=null;
		Type type5 =null;

		try {
			// Def.g:106:5: ( ^( ( FIELD_DECL | VAR_DECL | ARG_DECL ) type ID ( . )? ) )
			// Def.g:106:9: ^( ( FIELD_DECL | VAR_DECL | ARG_DECL ) type ID ( . )? )
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
			pushFollow(FOLLOW_type_in_varDeclaration428);
			type5=type();
			state._fsp--;
			if (state.failed) return;
			ID4=(CymbolAST)match(input,ID,FOLLOW_ID_in_varDeclaration430); if (state.failed) return;
			// Def.g:106:50: ( . )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= ARG_DECL && LA5_0 <= 54)) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Def.g:106:50: .
					{
					matchAny(input); if (state.failed) return;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==1 ) {
			        //System.out.println("line "+ID4.getLine()+": def "+(ID4!=null?ID4.getText():null));
			        VariableSymbol vs = new VariableSymbol((ID4!=null?ID4.getText():null),type5);
			        vs.def = ID4;            // track AST location of def's ID
			        ID4.symbol = vs;         // track in AST
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



	// $ANTLR start "type"
	// Def.g:118:1: type returns [Type type] : ( ^( '[]' typeElement ) | typeElement );
	public final Type type() throws RecognitionException {
		Type type = null;


		Type typeElement6 =null;
		Type typeElement7 =null;

		try {
			// Def.g:119:5: ( ^( '[]' typeElement ) | typeElement )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==40) ) {
				alt6=1;
			}
			else if ( (LA6_0==ID||(LA6_0 >= 42 && LA6_0 <= 43)||LA6_0==46||LA6_0==48||LA6_0==52) ) {
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
					// Def.g:119:9: ^( '[]' typeElement )
					{
					match(input,40,FOLLOW_40_in_type471); if (state.failed) return type;
					match(input, Token.DOWN, null); if (state.failed) return type;
					pushFollow(FOLLOW_typeElement_in_type473);
					typeElement6=typeElement();
					state._fsp--;
					if (state.failed) return type;
					match(input, Token.UP, null); if (state.failed) return type;

					if ( state.backtracking==1 ) {type = new ArrayType(typeElement6);}
					}
					break;
				case 2 :
					// Def.g:120:9: typeElement
					{
					pushFollow(FOLLOW_typeElement_in_type486);
					typeElement7=typeElement();
					state._fsp--;
					if (state.failed) return type;
					if ( state.backtracking==1 ) {type = typeElement7;}
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
	// $ANTLR end "type"



	// $ANTLR start "typeElement"
	// Def.g:123:1: typeElement returns [Type type] : ( 'float' | 'int' | 'char' | 'boolean' | 'void' | ID );
	public final Type typeElement() throws RecognitionException {
		Type type = null;


		CymbolAST t = (CymbolAST)input.LT(1);
		try {
			// Def.g:130:5: ( 'float' | 'int' | 'char' | 'boolean' | 'void' | ID )
			// Def.g:
			{
			if ( input.LA(1)==ID||(input.LA(1) >= 42 && input.LA(1) <= 43)||input.LA(1)==46||input.LA(1)==48||input.LA(1)==52 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return type;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			if ( state.backtracking==1 ) {
			    t.symbol = currentScope.resolve(t.getText()); // return Type
			    t.scope = currentScope;
			    type = (Type)t.symbol;
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
	// $ANTLR end "typeElement"

	// Delegated rules



	public static final BitSet FOLLOW_enterBlock_in_topdown56 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enterMethod_in_topdown66 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enterStruct_in_topdown76 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atoms_in_topdown86 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varDeclaration_in_topdown96 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ret_in_topdown106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exitBlock_in_bottomup125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exitMethod_in_bottomup135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exitStruct_in_bottomup145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_enterBlock166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_exitBlock187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_enterStruct218 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_enterStruct220 = new BitSet(new long[]{0x007FFFFFFFFFFFF0L});
	public static final BitSet FOLLOW_50_in_exitStruct252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_METHOD_DECL_in_enterMethod283 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_enterMethod285 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_enterMethod287 = new BitSet(new long[]{0x007FFFFFFFFFFFF8L});
	public static final BitSet FOLLOW_49_in_ret320 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_DECL_in_exitMethod348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atoms388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_varDeclaration420 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_varDeclaration428 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_ID_in_varDeclaration430 = new BitSet(new long[]{0x007FFFFFFFFFFFF8L});
	public static final BitSet FOLLOW_40_in_type471 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeElement_in_type473 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_typeElement_in_type486 = new BitSet(new long[]{0x0000000000000002L});
}
