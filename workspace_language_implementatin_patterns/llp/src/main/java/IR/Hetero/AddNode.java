package IR.Hetero;

public class AddNode extends ExprNode{
	ExprNode left, right;
	
	public AddNode(ExprNode left, Token addToken, ExprNode right){
		super(addToken);
		this.left = left;
		this.right = right;
	}
	
	public String toStringTree(){
		if(left==null || right==null)
			return this.toString();
		StringBuilder buf = new StringBuilder();
		buf.append("(")
		   .append(this.toString())
		   .append(" ")
		   .append(left.toStringTree())
		   .append(" ")
		   .append(right.toStringTree())
		   .append(")");
		return buf.toString();
		
	}

}
