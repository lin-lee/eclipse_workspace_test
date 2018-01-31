package parsing.memoize;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import parsing.backtrack.MismatchedTokenException;
import parsing.backtrack.Token;

public abstract class Parser {
	
	public static final int FAILED = -1;
	
	Lexer input;
	List<Integer> markers;
    List<Token> lookahead;		//dynamically-sized lookahead buffer
	int p = 0;
	
	public Parser(Lexer input) {		
	    this.input = input;
	    markers = new ArrayList<Integer>(); // make marker stack
	    lookahead = new ArrayList<Token>(); // make lookahead buffer
	    sync(1); // prime buffer with at least 1 token
	 }
	
	public Token LT(int i){
		sync(i);
		return lookahead.get(p+i-1);
	}
	
	public int LA(int i){
		return LT(i).type;
	}
	
	public void match(int x) throws MismatchedTokenException{
		if(LA(1)==x)
			consume();
		else
			throw new MismatchedTokenException("excepting "+
					input.getTokenName(x)+" found "+LT(1));
	}
	
	public void sync(int i){
		if(p+i-1 > (lookahead.size()-1)){
			int n = (p+i-1) - (lookahead.size()-1);
			fill(n);
		}
	}
	
	public void fill(int n){
		for(int i=1; i<=n; i++){
			lookahead.add(input.nextToken());
		}
	}
	 
	public void consume(){
		p++;
		if(p==lookahead.size() && ! isSpeculating()){
			p = 0;
			lookahead.clear();
			clearMemo();
		}
		sync(1);
	}
	 public abstract void clearMemo();
	
	public int mark(){
		markers.add(p);
		return p;
	}
	public void release(){
		int marker = markers.get(markers.size()-1);
		markers.remove(markers.size()-1);
		seek(marker);
	}
	public void seek(int index){
		p = index;
	}
	
	public boolean isSpeculating(){
		return markers.size() > 0;
	}
	
	public boolean alreadyParsedRule(Map<Integer, Integer> memoization)
		throws PreviousParseFailedException{
		Integer memoI = memoization.get(index());
		if(memoI==null){
			return false;
		}
		int memo = memoI.intValue();
		System.out.println("parsed list before at index "+index()+
				"; skip ahead to token index "+memo+": "+
				lookahead.get(memo).text);
		if(memo==FAILED)
			throw new PreviousParseFailedException();
		seek(memo);
		return true;
	}
	
	public void memoize(Map<Integer, Integer> memoization,
			int startTokenIndex, boolean failed){
		int stopTokenIndex = failed ? FAILED : index();
		memoization.put(startTokenIndex, stopTokenIndex);
	}
	
	public int index(){
		return p;
	}

}
