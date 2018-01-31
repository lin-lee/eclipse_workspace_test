package parsing.antlr;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;

public class Test {
	
	public static void main(String [] args) throws Exception{
		CharStream input = null;
		if(args.length>0)
			input = new ANTLRFileStream(args[0]);
		else 
			input = new ANTLRInputStream(System.in);
		//Create the lexer
		GraphicsLexer lex = new GraphicsLexer(input);
		//Create a buffer of tokens between lexer and parser
		CommonTokenStream tokens = new CommonTokenStream(lex);
		//Create the parser, attaching it to the token buffer
		GraphicsParser p = new GraphicsParser(tokens);
		p.file();	//launch parser at rule file
	}

}
