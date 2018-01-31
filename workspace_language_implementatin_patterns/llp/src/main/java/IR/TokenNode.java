package IR;

import parsing.lexer.Token;

public class TokenNode extends ParseTree {
    public Token token;
    public TokenNode(Token token) {
    	this.token = token; 
    }
}