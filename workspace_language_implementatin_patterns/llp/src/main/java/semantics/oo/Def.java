package semantics.oo;

// $ANTLR 3.5.2 Def.g 2016-12-29 09:09:46

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "ADDR", "ARG_DECL", "ASSIGN", 
		"BLOCK", "CALL", "CHAR", "DEREF", "ELIST", "EXPR", "FIELD_DECL", "FLOAT", 
		"ID", "INT", "LETTER", "MEMBER", "METHOD_DECL", "SL_COMMENT", "UNARY_MINUS", 
		"UNARY_NOT", "VAR_DECL", "WS", "'!'", "'!='", "'&'", "'('", "')'", "'*'", 
		"','", "'-'", "'->'", "'/'", "':'", "';'", "'<'", "'<='", "'=='", "'>'", 
		"'>='", "'['", "'[]'", "']'", "'boolean'", "'char'", "'class'", "'else'", 
		"'false'", "'float'", "'if'", "'int'", "'return'", "'true'", "'void'", 
		"'{'", "'}'"
	};
	public static final int EOF=-1;
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
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int ADD=4;
	public static final int ADDR=5;
	public static final int ARG_DECL=6;
	public static final int ASSIGN=7;
	public static final int BLOCK=8;
	public static final int CALL=9;
	public static final int CHAR=10;
	public static final int DEREF=11;
	public static final int ELIST=12;
	public static final int EXPR=13;
	public static final int FIELD_DECL=14;
	public static final int FLOAT=15;
	public static final int ID=16;
	public static final int INT=17;
	public static final int LETTER=18;
	public static final int MEMBER=19;
	public static final int METHOD_DECL=20;
	public static final int SL_COMMENT=21;
	public static final int UNARY_MINUS=22;
	public static final int UNARY_NOT=23;
	public static final int VAR_DECL=24;
	public static final int WS=25;

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
	// Def.g:20:1: topdown : ( enterBlock | enterMethod | enterClass | atoms | varDeclaration | ret );
	public final void topdown() throws RecognitionException {
		try {
			// Def.g:21:5: ( enterBlock | enterMethod | enterClass | atoms | varDeclaration | ret )
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
			case 48:
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
			case 54:
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
					// Def.g:23:9: enterClass
					{
					pushFollow(FOLLOW_enterClass_in_topdown76);
					enterClass();
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
	// Def.g:29:1: bottomup : ( exitBlock | exitMethod | exitClass );
	public final void bottomup() throws RecognitionException {
		try {
			// Def.g:30:5: ( exitBlock | exitMethod | exitClass )
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
			case 48:
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
					// Def.g:32:9: exitClass
					{
					pushFollow(FOLLOW_exitClass_in_bottomup145);
					exitClass();
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



	// $ANTLR start "enterClass"
	// Def.g:49:1: enterClass : ^( 'class' name= ID ( ^( ':' sup= ID ) )? . ) ;
	public final void enterClass() throws RecognitionException {
		CymbolAST name=null;
		CymbolAST sup=null;

		try {
			// Def.g:50:5: ( ^( 'class' name= ID ( ^( ':' sup= ID ) )? . ) )
			// Def.g:50:9: ^( 'class' name= ID ( ^( ':' sup= ID ) )? . )
			{
			match(input,48,FOLLOW_48_in_enterClass218); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			name=(CymbolAST)match(input,ID,FOLLOW_ID_in_enterClass222); if (state.failed) return;
			// Def.g:50:27: ( ^( ':' sup= ID ) )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==36) ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1==DOWN) ) {
					int LA3_3 = input.LA(3);
					if ( (LA3_3==ID) ) {
						int LA3_4 = input.LA(4);
						if ( (LA3_4==UP) ) {
							int LA3_5 = input.LA(5);
							if ( ((LA3_5 >= ADD && LA3_5 <= 58)) ) {
								alt3=1;
							}
						}
					}
				}
			}
			switch (alt3) {
				case 1 :
					// Def.g:50:28: ^( ':' sup= ID )
					{
					match(input,36,FOLLOW_36_in_enterClass226); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					sup=(CymbolAST)match(input,ID,FOLLOW_ID_in_enterClass230); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;

			}

			matchAny(input); if (state.failed) return;
			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==1 ) { // Def class but leave superclass blank until ref phase
			        ClassSymbol superclass = null;
			        if ( sup!=null ) { // can only ref classes above in file
			            superclass = (ClassSymbol)currentScope.resolve((sup!=null?sup.getText():null)); // find superclass
			            sup.symbol = superclass;
			        }
			        ClassSymbol cs = new ClassSymbol((name!=null?name.getText():null), currentScope, superclass);
			        cs.def = name;           // point from symbol table into AST
			        name.symbol = cs;        // point from AST into symbol table
			        currentScope.define(cs);  // def struct in current scope
			        currentScope = cs;        // set current scope to struct scope
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
	// $ANTLR end "enterClass"



	// $ANTLR start "exitClass"
	// Def.g:66:1: exitClass : 'class' ;
	public final void exitClass() throws RecognitionException {
		try {
			// Def.g:67:5: ( 'class' )
			// Def.g:67:9: 'class'
			{
			match(input,48,FOLLOW_48_in_exitClass266); if (state.failed) return;
			if ( state.backtracking==1 ) {currentScope = currentScope.getEnclosingScope();}
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
	// $ANTLR end "exitClass"



	// $ANTLR start "enterMethod"
	// Def.g:70:1: enterMethod : ^( METHOD_DECL type ID ( . )* ) ;
	public final void enterMethod() throws RecognitionException {
		CymbolAST ID1=null;
		Type type2 =null;

		try {
			// Def.g:71:5: ( ^( METHOD_DECL type ID ( . )* ) )
			// Def.g:71:9: ^( METHOD_DECL type ID ( . )* )
			{
			match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_enterMethod291); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_type_in_enterMethod293);
			type2=type();
			state._fsp--;
			if (state.failed) return;
			ID1=(CymbolAST)match(input,ID,FOLLOW_ID_in_enterMethod295); if (state.failed) return;
			// Def.g:71:31: ( . )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= ADD && LA4_0 <= 58)) ) {
					alt4=1;
				}
				else if ( (LA4_0==UP) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// Def.g:71:31: .
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
			        //System.out.println("line "+ID1.getLine()+": def method "+(ID1!=null?ID1.getText():null));
			        MethodSymbol ms = new MethodSymbol((ID1!=null?ID1.getText():null),type2,currentScope);
			        currentMethod = ms;
			        ms.def = ID1;            // track AST location of def's ID
			        ID1.symbol = ms;         // track in AST
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
	// Def.g:84:1: ret : ^( 'return' . ) ;
	public final Def.ret_return ret() throws RecognitionException {
		Def.ret_return retval = new Def.ret_return();
		retval.start = input.LT(1);

		try {
			// Def.g:84:5: ( ^( 'return' . ) )
			// Def.g:84:9: ^( 'return' . )
			{
			match(input,54,FOLLOW_54_in_ret328); if (state.failed) return retval;
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
	// Def.g:87:1: exitMethod : METHOD_DECL ;
	public final void exitMethod() throws RecognitionException {
		try {
			// Def.g:88:5: ( METHOD_DECL )
			// Def.g:88:9: METHOD_DECL
			{
			match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_exitMethod356); if (state.failed) return;
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
	// Def.g:98:1: atoms :{...}? ID ;
	public final void atoms() throws RecognitionException {
		CymbolAST t = (CymbolAST)input.LT(1);
		try {
			// Def.g:100:5: ({...}? ID )
			// Def.g:100:8: {...}? ID
			{
			if ( !((t.hasAncestor(EXPR)||t.hasAncestor(ASSIGN))) ) {
				if (state.backtracking>0) {state.failed=true; return;}
				throw new FailedPredicateException(input, "atoms", "t.hasAncestor(EXPR)||t.hasAncestor(ASSIGN)");
			}
			match(input,ID,FOLLOW_ID_in_atoms396); if (state.failed) return;
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
	// Def.g:106:1: varDeclaration : ^( ( FIELD_DECL | VAR_DECL | ARG_DECL ) type ID ( . )? ) ;
	public final void varDeclaration() throws RecognitionException {
		CymbolAST ID3=null;
		Type type4 =null;

		try {
			// Def.g:107:5: ( ^( ( FIELD_DECL | VAR_DECL | ARG_DECL ) type ID ( . )? ) )
			// Def.g:107:9: ^( ( FIELD_DECL | VAR_DECL | ARG_DECL ) type ID ( . )? )
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
			pushFollow(FOLLOW_type_in_varDeclaration436);
			type4=type();
			state._fsp--;
			if (state.failed) return;
			ID3=(CymbolAST)match(input,ID,FOLLOW_ID_in_varDeclaration438); if (state.failed) return;
			// Def.g:107:50: ( . )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= ADD && LA5_0 <= 58)) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Def.g:107:50: .
					{
					matchAny(input); if (state.failed) return;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==1 ) {
			        //System.out.println("line "+ID3.getLine()+": def "+(ID3!=null?ID3.getText():null));
			        VariableSymbol vs = new VariableSymbol((ID3!=null?ID3.getText():null),type4);
			        vs.def = ID3;            // track AST location of def's ID
			        ID3.symbol = vs;         // track in AST
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
	// Def.g:120:1: type returns [Type type] : ( ^( '*' typeElement ) | typeElement );
	public final Type type() throws RecognitionException {
		Type type = null;


		Type typeElement5 =null;
		Type typeElement6 =null;

		try {
			// Def.g:121:5: ( ^( '*' typeElement ) | typeElement )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==31) ) {
				alt6=1;
			}
			else if ( (LA6_0==ID||(LA6_0 >= 46 && LA6_0 <= 47)||LA6_0==51||LA6_0==53||LA6_0==56) ) {
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
					// Def.g:121:9: ^( '*' typeElement )
					{
					match(input,31,FOLLOW_31_in_type480); if (state.failed) return type;
					match(input, Token.DOWN, null); if (state.failed) return type;
					pushFollow(FOLLOW_typeElement_in_type482);
					typeElement5=typeElement();
					state._fsp--;
					if (state.failed) return type;
					match(input, Token.UP, null); if (state.failed) return type;

					if ( state.backtracking==1 ) {type = new PointerType(typeElement5);}
					}
					break;
				case 2 :
					// Def.g:122:9: typeElement
					{
					pushFollow(FOLLOW_typeElement_in_type496);
					typeElement6=typeElement();
					state._fsp--;
					if (state.failed) return type;
					if ( state.backtracking==1 ) {type = typeElement6;}
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
	// Def.g:127:1: typeElement returns [Type type] : ( 'float' | 'int' | 'char' | 'boolean' | 'void' | ID );
	public final Type typeElement() throws RecognitionException {
		Type type = null;


		CymbolAST t = (CymbolAST)input.LT(1);
		try {
			// Def.g:134:5: ( 'float' | 'int' | 'char' | 'boolean' | 'void' | ID )
			// Def.g:
			{
			if ( input.LA(1)==ID||(input.LA(1) >= 46 && input.LA(1) <= 47)||input.LA(1)==51||input.LA(1)==53||input.LA(1)==56 ) {
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
	public static final BitSet FOLLOW_enterClass_in_topdown76 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atoms_in_topdown86 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varDeclaration_in_topdown96 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ret_in_topdown106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exitBlock_in_bottomup125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exitMethod_in_bottomup135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exitClass_in_bottomup145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_enterBlock166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_exitBlock187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_enterClass218 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_enterClass222 = new BitSet(new long[]{0x07FFFFFFFFFFFFF0L});
	public static final BitSet FOLLOW_36_in_enterClass226 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_enterClass230 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_48_in_exitClass266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_METHOD_DECL_in_enterMethod291 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_enterMethod293 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_enterMethod295 = new BitSet(new long[]{0x07FFFFFFFFFFFFF8L});
	public static final BitSet FOLLOW_54_in_ret328 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_DECL_in_exitMethod356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atoms396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_varDeclaration428 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_varDeclaration436 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ID_in_varDeclaration438 = new BitSet(new long[]{0x07FFFFFFFFFFFFF8L});
	public static final BitSet FOLLOW_31_in_type480 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeElement_in_type482 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_typeElement_in_type496 = new BitSet(new long[]{0x0000000000000002L});
}
