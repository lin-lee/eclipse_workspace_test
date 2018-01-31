package parsing.memoize;

import parsing.backtrack.RecognitionException;




public class Test {
    public static void main(String[] args) throws RecognitionException {
        BacktrackLexer lexer = new BacktrackLexer(args[0]); // parse arg
        BacktrackParser parser = new BacktrackParser(lexer);     
        parser.stat(); // begin parsing at rule stat
    }
}