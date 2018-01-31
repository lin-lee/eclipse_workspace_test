package three.thirteen;

public class Test {
	
	void tryItOut(){
		
	}
	
	void handleExc(Exception e){
		
	}
	
	void wrapItUp(){
		
	}
	
	void tryFinally() {
		try {
			tryItOut();
		} finally {
			wrapItUp();
		}
	}
	
	void tryCatchFinally() {
		try {
			tryItOut();
		} catch (Exception e) {
			handleExc(e);
		} finally {
			wrapItUp();
		}
	}
	
}
