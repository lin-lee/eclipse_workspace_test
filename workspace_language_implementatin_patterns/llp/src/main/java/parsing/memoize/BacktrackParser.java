package parsing.memoize;

import java.util.HashMap;
import java.util.Map;

import parsing.backtrack.NoViableAltException;
import parsing.backtrack.RecognitionException;

public class BacktrackParser extends Parser{
	
	Map<Integer, Integer> list_memo = new HashMap<Integer, Integer>();
	
	public BacktrackParser(Lexer input){
		super(input);
	}
	
	public void clearMemo(){
		list_memo.clear();
	}
	
	public void stat() throws RecognitionException{
		if(speculate_stat_alt1()){
			list();
			match(Lexer.EOF_TYPE);
		}else if(speculate_stat_alt2()){
			System.out.println("predict alternative 2");
			assign();
			match(Lexer.EOF_TYPE);
		}else
			throw new NoViableAltException("expecting stat found "+LT(1));
	}
	
	public boolean speculate_stat_alt1(){
		System.out.println("attempt alternative 1");
		boolean success = true;
		mark();
		try{
			list();
			match(Lexer.EOF_TYPE);
		}catch(RecognitionException e){
			success = false;
		}
		release();
		return success;
	}
	public boolean speculate_stat_alt2(){
		System.out.println("attempt alternative 2");
		boolean success = true;
		mark();
		try{
			assign();
			match(Lexer.EOF_TYPE);
		}catch(RecognitionException e){
			success = false;
		}
		release();
		return success;
	}
	
	public void assign() throws RecognitionException{
		list();
		match(BacktrackLexer.EQUALS);
		list();
	}
	
	public void _list() throws RecognitionException {
		System.out.println("parse list rule at token index: "+index());
		match(BacktrackLexer.LBRACK);
		elements();
		match(BacktrackLexer.RBRACK);
	}

	public void list() throws RecognitionException{
		boolean failed = false;
		int startTokenIndex = index();
		if(isSpeculating() && alreadyParsedRule(list_memo))
			return;
		try{
			_list();
		}catch(RecognitionException re){
			failed = true;
			throw re;
		}finally{
			if(isSpeculating())
				memoize(list_memo, startTokenIndex, failed);
		}
	}
	
	void elements() throws RecognitionException{
		element();
		while(LA(1)==BacktrackLexer.COMMA){
			match(BacktrackLexer.COMMA);
			element();
		}
	}
	
	 void element() throws RecognitionException {
        if ( LA(1)==BacktrackLexer.NAME && LA(2)==BacktrackLexer.EQUALS) {
            match(BacktrackLexer.NAME);
            match(BacktrackLexer.EQUALS);
            match(BacktrackLexer.NAME);
        }
        else if ( LA(1)==BacktrackLexer.NAME )
        	match(BacktrackLexer.NAME);
        else if ( LA(1)==BacktrackLexer.LBRACK )
        	list();
        else 
        	throw new NoViableAltException("expecting element found "+LT(1));
	  }
}
