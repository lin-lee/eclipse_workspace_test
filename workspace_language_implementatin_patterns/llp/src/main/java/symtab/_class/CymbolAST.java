package symtab._class;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class CymbolAST extends CommonTree{
	public Scope scope; // Set by Def.g; ID lives in which scope?
	public Symbol symbol; // Set by Ref.g; point at def in symbol table
	public CymbolAST(Token t){
		super(t);
	}

}
