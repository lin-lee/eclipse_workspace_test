package IR.Normalized;

import IR.Homo.Token;

public class IntNode extends ExprNode{
	public IntNode(Token t){
		super(t);
		evalType = tINTEGER;
	}

}
