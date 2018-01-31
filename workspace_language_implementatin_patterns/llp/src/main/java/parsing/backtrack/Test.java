package parsing.backtrack;




public class Test {
    public static void main(String[] args) throws RecognitionException {
        BacktrackLexer lexer = new BacktrackLexer(args[0]); // parse arg
        BacktrackParser parser = new BacktrackParser(lexer);     
        //System.out.println(parser.LT(11)); // can look far ahead
        parser.stat(); // begin parsing at rule stat
    }
}