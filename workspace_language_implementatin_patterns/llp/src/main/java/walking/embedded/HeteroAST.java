package walking.embedded;

public class HeteroAST {
	Token token;
	
	public HeteroAST(){
		;
	}
	public HeteroAST(Token token){
		this.token = token;
	}
	@Override
	public String toString(){
		return token.toString();
	}

}
