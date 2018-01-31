package IR.Normalized;

import IR.Homo.AST;
import IR.Homo.Token;

public class ExprNode extends AST {
	
	public static final int tINVALID = 0;
	public static final int tINTEGER = 1;
	public static final int tVECTOR = 2;
	
	/**Track expression type(integer or vector) for each expr node.
	 * This is the type of the associated value not the getNodeType()
	 * used by an external visitor to distinguish between nodes. 
	 */
	int evalType;

	public int getEvalType(){
		return evalType;
	}
	
	public ExprNode(Token payload){
		super(payload);
	}
	
	public String toString(){
		if(evalType != tINVALID){
			return super.toString()+"<type="+
					(evalType == tINTEGER ? "tINTEGER" : "tVECTOR")+">";
		}
		return super.toString();
	}
}
