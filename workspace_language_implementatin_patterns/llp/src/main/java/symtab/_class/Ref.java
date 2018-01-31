package symtab._class;

// $ANTLR 3.5.2 Ref.g 2016-12-27 11:36:55

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class Ref extends TreeFilter {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARG_DECL", "ASSIGN", "BLOCK", 
		"CALL", "ELIST", "EXPR", "EXTENDS", "FIELD_DECL", "ID", "INT", "LETTER", 
		"MEMBERS", "METHOD_DECL", "SL_COMMENT", "VAR_DECL", "WS", "'('", "')'", 
		"'+'", "','", "'.'", "':'", "';'", "'class'", "'float'", "'int'", "'public'", 
		"'return'", "'super'", "'this'", "'void'", "'{'", "'}'"
	};
	public static final int EOF=-1;
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
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int ARG_DECL=4;
	public static final int ASSIGN=5;
	public static final int BLOCK=6;
	public static final int CALL=7;
	public static final int ELIST=8;
	public static final int EXPR=9;
	public static final int EXTENDS=10;
	public static final int FIELD_DECL=11;
	public static final int ID=12;
	public static final int INT=13;
	public static final int LETTER=14;
	public static final int MEMBERS=15;
	public static final int METHOD_DECL=16;
	public static final int SL_COMMENT=17;
	public static final int VAR_DECL=18;
	public static final int WS=19;

	// delegates
	public TreeFilter[] getDelegates() {
		return new TreeFilter[] {};
	}

	// delegators


	public Ref(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public Ref(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return Ref.tokenNames; }
	@Override public String getGrammarFileName() { return "Ref.g"; }


	    SymbolTable symtab;
	    public Ref(TreeNodeStream input, SymbolTable symtab) {
	        this(input);
	        this.symtab = symtab;
	    }
	    



	// $ANTLR start "topdown"
	// Ref.g:21:1: topdown : ( enterMethod | enterClass | varDeclaration | assignment | resolveExpr );
	public final void topdown() throws RecognitionException {
		try {
			// Ref.g:22:5: ( enterMethod | enterClass | varDeclaration | assignment | resolveExpr )
			int alt1=5;
			switch ( input.LA(1) ) {
			case METHOD_DECL:
				{
				alt1=1;
				}
				break;
			case 27:
				{
				alt1=2;
				}
				break;
			case ARG_DECL:
			case FIELD_DECL:
			case VAR_DECL:
				{
				alt1=3;
				}
				break;
			case ASSIGN:
				{
				alt1=4;
				}
				break;
			case EXPR:
				{
				alt1=5;
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
					// Ref.g:22:9: enterMethod
					{
					pushFollow(FOLLOW_enterMethod_in_topdown58);
					enterMethod();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// Ref.g:23:9: enterClass
					{
					pushFollow(FOLLOW_enterClass_in_topdown68);
					enterClass();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// Ref.g:24:9: varDeclaration
					{
					pushFollow(FOLLOW_varDeclaration_in_topdown78);
					varDeclaration();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// Ref.g:25:9: assignment
					{
					pushFollow(FOLLOW_assignment_in_topdown88);
					assignment();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// Ref.g:26:9: resolveExpr
					{
					pushFollow(FOLLOW_resolveExpr_in_topdown98);
					resolveExpr();
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



	// $ANTLR start "enterClass"
	// Ref.g:32:1: enterClass : ^( 'class' name= ID ( ^( EXTENDS sup= ID ) )? ^( MEMBERS ( . )* ) ) ;
	public final void enterClass() throws RecognitionException {
		CymbolAST name=null;
		CymbolAST sup=null;

		try {
			// Ref.g:33:5: ( ^( 'class' name= ID ( ^( EXTENDS sup= ID ) )? ^( MEMBERS ( . )* ) ) )
			// Ref.g:33:9: ^( 'class' name= ID ( ^( EXTENDS sup= ID ) )? ^( MEMBERS ( . )* ) )
			{
			match(input,27,FOLLOW_27_in_enterClass121); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			name=(CymbolAST)match(input,ID,FOLLOW_ID_in_enterClass125); if (state.failed) return;
			// Ref.g:33:27: ( ^( EXTENDS sup= ID ) )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==EXTENDS) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// Ref.g:33:28: ^( EXTENDS sup= ID )
					{
					match(input,EXTENDS,FOLLOW_EXTENDS_in_enterClass129); if (state.failed) return;
					match(input, Token.DOWN, null); if (state.failed) return;
					sup=(CymbolAST)match(input,ID,FOLLOW_ID_in_enterClass133); if (state.failed) return;
					match(input, Token.UP, null); if (state.failed) return;

					}
					break;

			}

			match(input,MEMBERS,FOLLOW_MEMBERS_in_enterClass139); if (state.failed) return;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return;
				// Ref.g:33:58: ( . )*
				loop3:
				while (true) {
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( ((LA3_0 >= ARG_DECL && LA3_0 <= 36)) ) {
						alt3=1;
					}
					else if ( (LA3_0==UP) ) {
						alt3=2;
					}

					switch (alt3) {
					case 1 :
						// Ref.g:33:58: .
						{
						matchAny(input); if (state.failed) return;
						}
						break;

					default :
						break loop3;
					}
				}

				match(input, Token.UP, null); if (state.failed) return;
			}

			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==1 ) {
			        if ( sup!=null ) {
			            // look up superclass (if any)
			            sup.symbol = sup.scope.resolve((sup!=null?sup.getText():null));
			            ((ClassSymbol)name.symbol).superClass =
			                (ClassSymbol)sup.symbol;                // set superclass
			            System.out.println("line "+name.getLine()+": set "+(name!=null?name.getText():null)+
			                " super to "+((ClassSymbol)name.symbol).superClass.name);
			        }
			        else {
			            System.out.println("line "+name.getLine()+": set "+(name!=null?name.getText():null));
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
	// $ANTLR end "enterClass"



	// $ANTLR start "enterMethod"
	// Ref.g:50:1: enterMethod : ^( METHOD_DECL type ID ( . )* ) ;
	public final void enterMethod() throws RecognitionException {
		CymbolAST ID1=null;
		TreeRuleReturnScope type2 =null;

		try {
			// Ref.g:51:5: ( ^( METHOD_DECL type ID ( . )* ) )
			// Ref.g:51:9: ^( METHOD_DECL type ID ( . )* )
			{
			match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_enterMethod175); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_type_in_enterMethod177);
			type2=type();
			state._fsp--;
			if (state.failed) return;
			ID1=(CymbolAST)match(input,ID,FOLLOW_ID_in_enterMethod179); if (state.failed) return;
			// Ref.g:51:31: ( . )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= ARG_DECL && LA4_0 <= 36)) ) {
					alt4=1;
				}
				else if ( (LA4_0==UP) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// Ref.g:51:31: .
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
			        ID1.symbol.type = (type2!=null?((Ref.type_return)type2).tsym:null); // set return type of method
			        System.out.println("line "+ID1.getLine()+": set method type "+ID1.symbol);
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



	// $ANTLR start "varDeclaration"
	// Ref.g:61:1: varDeclaration : ^( ( FIELD_DECL | VAR_DECL | ARG_DECL ) type ID ( . )? ) ;
	public final void varDeclaration() throws RecognitionException {
		CymbolAST ID3=null;
		TreeRuleReturnScope type4 =null;

		try {
			// Ref.g:62:5: ( ^( ( FIELD_DECL | VAR_DECL | ARG_DECL ) type ID ( . )? ) )
			// Ref.g:62:9: ^( ( FIELD_DECL | VAR_DECL | ARG_DECL ) type ID ( . )? )
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
			pushFollow(FOLLOW_type_in_varDeclaration226);
			type4=type();
			state._fsp--;
			if (state.failed) return;
			ID3=(CymbolAST)match(input,ID,FOLLOW_ID_in_varDeclaration228); if (state.failed) return;
			// Ref.g:62:50: ( . )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( ((LA5_0 >= ARG_DECL && LA5_0 <= 36)) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Ref.g:62:50: .
					{
					matchAny(input); if (state.failed) return;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return;

			if ( state.backtracking==1 ) {
			        ID3.symbol.type = (type4!=null?((Ref.type_return)type4).tsym:null); // set return type of variable
			        System.out.println("line "+ID3.getLine()+": set var type "+ID3.symbol);
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
	// Ref.g:71:1: type returns [Type tsym] : ( 'float' | 'int' | 'void' | ID );
	public final Ref.type_return type() throws RecognitionException {
		Ref.type_return retval = new Ref.type_return();
		retval.start = input.LT(1);


		    // get scope from AST; use to resolve type name and save it in AST
		    ((CymbolAST)retval.start).symbol = ((CymbolAST)retval.start).scope.resolve(((CymbolAST)retval.start).getText());
		    retval.tsym = (Type)((CymbolAST)retval.start).symbol; // return Type from this rule

		try {
			// Ref.g:77:5: ( 'float' | 'int' | 'void' | ID )
			// Ref.g:
			{
			if ( input.LA(1)==ID||(input.LA(1) >= 28 && input.LA(1) <= 29)||input.LA(1)==34 ) {
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
	// Ref.g:84:1: assignment : ^( '=' expr expr ) ;
	public final void assignment() throws RecognitionException {
		try {
			// Ref.g:84:13: ( ^( '=' expr expr ) )
			// Ref.g:84:15: ^( '=' expr expr )
			{
			match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment321); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_assignment323);
			expr();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_expr_in_assignment325);
			expr();
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
	// $ANTLR end "assignment"



	// $ANTLR start "resolveExpr"
	// Ref.g:85:1: resolveExpr : ^( EXPR expr ) ;
	public final void resolveExpr() throws RecognitionException {
		try {
			// Ref.g:85:13: ( ^( EXPR expr ) )
			// Ref.g:85:15: ^( EXPR expr )
			{
			match(input,EXPR,FOLLOW_EXPR_in_resolveExpr337); if (state.failed) return;
			match(input, Token.DOWN, null); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_resolveExpr339);
			expr();
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


	public static class expr_return extends TreeRuleReturnScope {
		public Type type;
	};


	// $ANTLR start "expr"
	// Ref.g:92:1: expr returns [Type type] : ( member | ^( CALL expr ) | ^( '+' expr expr ) | id | INT );
	public final Ref.expr_return expr() throws RecognitionException {
		Ref.expr_return retval = new Ref.expr_return();
		retval.start = input.LT(1);

		Type member5 =null;
		Type id6 =null;

		try {
			// Ref.g:93:5: ( member | ^( CALL expr ) | ^( '+' expr expr ) | id | INT )
			int alt6=5;
			switch ( input.LA(1) ) {
			case 24:
				{
				alt6=1;
				}
				break;
			case CALL:
				{
				alt6=2;
				}
				break;
			case 22:
				{
				alt6=3;
				}
				break;
			case ID:
			case 33:
				{
				alt6=4;
				}
				break;
			case INT:
				{
				alt6=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// Ref.g:93:9: member
					{
					pushFollow(FOLLOW_member_in_expr364);
					member5=member();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) {retval.type = member5;}
					}
					break;
				case 2 :
					// Ref.g:94:9: ^( CALL expr )
					{
					match(input,CALL,FOLLOW_CALL_in_expr378); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_expr380);
					expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					}
					break;
				case 3 :
					// Ref.g:95:9: ^( '+' expr expr )
					{
					match(input,22,FOLLOW_22_in_expr392); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_expr394);
					expr();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_expr396);
					expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					}
					break;
				case 4 :
					// Ref.g:96:9: id
					{
					pushFollow(FOLLOW_id_in_expr407);
					id6=id();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) {retval.type = id6;}
					}
					break;
				case 5 :
					// Ref.g:97:9: INT
					{
					match(input,INT,FOLLOW_INT_in_expr428); if (state.failed) return retval;
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
	// $ANTLR end "expr"



	// $ANTLR start "id"
	// Ref.g:102:1: id returns [Type type] : ( ID |t= 'this' );
	public final Type id() throws RecognitionException {
		Type type = null;


		CymbolAST t=null;
		CymbolAST ID7=null;

		try {
			// Ref.g:103:5: ( ID |t= 'this' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ID) ) {
				alt7=1;
			}
			else if ( (LA7_0==33) ) {
				alt7=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return type;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// Ref.g:103:9: ID
					{
					ID7=(CymbolAST)match(input,ID,FOLLOW_ID_in_id453); if (state.failed) return type;
					if ( state.backtracking==1 ) {
					        // do usual resolve(ID) then check for illegal forward references
					        ID7.symbol = SymbolTable.resolveID(ID7);
					        if ( ID7.symbol!=null ) type = ID7.symbol.type;
					        }
					}
					break;
				case 2 :
					// Ref.g:109:9: t= 'this'
					{
					t=(CymbolAST)match(input,33,FOLLOW_33_in_id475); if (state.failed) return type;
					if ( state.backtracking==1 ) {type = SymbolTable.getEnclosingClass(t.scope);}
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
	// $ANTLR end "id"



	// $ANTLR start "member"
	// Ref.g:114:1: member returns [Type type] : ^( '.' m= expr ID ) ;
	public final Type member() throws RecognitionException {
		Type type = null;


		CymbolAST ID8=null;
		TreeRuleReturnScope m =null;

		try {
			// Ref.g:115:5: ( ^( '.' m= expr ID ) )
			// Ref.g:115:9: ^( '.' m= expr ID )
			{
			match(input,24,FOLLOW_24_in_member504); if (state.failed) return type;
			match(input, Token.DOWN, null); if (state.failed) return type;
			pushFollow(FOLLOW_expr_in_member508);
			m=expr();
			state._fsp--;
			if (state.failed) return type;
			ID8=(CymbolAST)match(input,ID,FOLLOW_ID_in_member510); if (state.failed) return type;
			match(input, Token.UP, null); if (state.failed) return type;

			if ( state.backtracking==1 ) {
			        ClassSymbol scope = (ClassSymbol)(m!=null?((Ref.expr_return)m).type:null);
			        Symbol s = scope.resolveMember((ID8!=null?ID8.getText():null));
			        ID8.symbol = s;
			        System.out.println("line "+ID8.getLine()+
			            ": resolve "+(m!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(m.start),input.getTreeAdaptor().getTokenStopIndex(m.start))):null)+"."+(ID8!=null?ID8.getText():null)+" to "+s);
			        if ( s!=null ) type = s.type;
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
		return type;
	}
	// $ANTLR end "member"

	// Delegated rules



	public static final BitSet FOLLOW_enterMethod_in_topdown58 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enterClass_in_topdown68 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varDeclaration_in_topdown78 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_topdown88 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_resolveExpr_in_topdown98 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_enterClass121 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_enterClass125 = new BitSet(new long[]{0x0000000000008400L});
	public static final BitSet FOLLOW_EXTENDS_in_enterClass129 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_enterClass133 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MEMBERS_in_enterClass139 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_DECL_in_enterMethod175 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_enterMethod177 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_enterMethod179 = new BitSet(new long[]{0x0000001FFFFFFFF8L});
	public static final BitSet FOLLOW_set_in_varDeclaration218 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_type_in_varDeclaration226 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_varDeclaration228 = new BitSet(new long[]{0x0000001FFFFFFFF8L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment321 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_assignment323 = new BitSet(new long[]{0x0000000201403080L});
	public static final BitSet FOLLOW_expr_in_assignment325 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPR_in_resolveExpr337 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_resolveExpr339 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_member_in_expr364 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CALL_in_expr378 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr380 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_22_in_expr392 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_expr394 = new BitSet(new long[]{0x0000000201403080L});
	public static final BitSet FOLLOW_expr_in_expr396 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_id_in_expr407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_expr428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_id453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_id475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_member504 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_in_member508 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ID_in_member510 = new BitSet(new long[]{0x0000000000000008L});
}
