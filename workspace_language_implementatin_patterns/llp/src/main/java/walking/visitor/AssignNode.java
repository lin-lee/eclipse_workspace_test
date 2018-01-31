package walking.visitor;

public class AssignNode extends StatNode{
	
	VarNode id;
	ExprNode value;
	
	public AssignNode(VarNode id, Token token, ExprNode value){
		super(token);
		this.id = id;
		this.value = value;
	}
	
	@Override
	public void visit(VecMathVisitor visitor){
		visitor.visit(this);
	}
}
