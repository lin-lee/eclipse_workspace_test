package walking.patterns;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Test {
    public static void main(String[] args) throws Exception {
        CharStream input = null;
        if ( args.length>0 ) {
            input = new ANTLRStringStream(args[0]);
        }
        else {
            input = new ANTLRInputStream(System.in);
        }
        VecMathLexer lex = new VecMathLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        VecMathParser p = new VecMathParser(tokens);
        RuleReturnScope r = p.prog();
        CommonTree t = (CommonTree) r.getTree();
        
        System.out.println("Original tree: "+t.toStringTree());
        //Traverse tree down then up, applying rewrite rules
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
        Simplify s =  new Simplify(nodes);
        s.downup(t, true);
        System.out.println("Simplified tree: "+t.toStringTree());
    }
    
}
