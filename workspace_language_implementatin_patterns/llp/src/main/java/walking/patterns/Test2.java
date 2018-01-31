package walking.patterns;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public class Test2 {
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
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
        Reduce red = new Reduce(nodes);
        t = (CommonTree) red.downup(t, true);
        System.out.println("Simplified tree: "+t.toStringTree());
        
    }

}
