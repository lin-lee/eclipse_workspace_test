package walking.tree_grammar;


import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public class Test {
	
	public static void main(String [] args) throws Exception{
		VecMathLexer lex = new VecMathLexer(new ANTLRInputStream(System.in));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		VecMathParser p = new VecMathParser(tokens);
		RuleReturnScope r = p.prog();
		
		CommonTree tree = (CommonTree) r.getTree();
		System.out.println(tree.toStringTree());
		
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
		Printer tp = new Printer(nodes);
		tp.prog();
		
	}

}
