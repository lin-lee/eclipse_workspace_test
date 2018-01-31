package IR.Homo;

import java.util.ArrayList;
import java.util.List;

public class AST {
	protected Token token;		//From whick token did we create node?
	protected List<AST> children; //normalized list of children
	
	public AST(){	//for making nil-rooted nodes
		;
	}
	public AST(Token token){
		this.token = token;
	}
	/** Create node from token type; used mainly for imaginary tokens */
	public AST(int tokenType){
		this.token = new Token(tokenType);
	}
	
	public int getNodeType(){
		return token.type;
	}
	
	public void addChild(AST t){
		if(children == null)
			children = new ArrayList<AST>();
		children.add(t);
	}
	
	public boolean isNil(){
		return token==null;
	}
	@Override
	public String toString(){
		return token!=null ? token.toString() : "nil";
	}
	
	public String toStringTree(){
		if(children==null || children.size()==0)
			return this.toString();
		StringBuilder buf = new StringBuilder();
		if(!isNil()){
			buf.append("(")
			   .append(this.toString())
			   .append(" ");
		}
		for(int i=0; i<children.size(); i++){
			AST t = children.get(i);
			if(i>0)
				buf.append(" ");
			buf.append(t.toStringTree());
		}
		if(!isNil())
			buf.append(")");
		return buf.toString();
	}

}
