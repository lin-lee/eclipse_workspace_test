package three.twelve;

public class Test {
	
	void cantBeZero(int i) throws Exception {
		if (i == 0) {
			throw new Exception();
		}
	}
	
	void tryItOut() throws Exception{
		
	}
	
	void handleExc(Exception e){
		
	}
	
	void catchOne() {
		try {
			tryItOut();
		} catch (Exception e) {
			handleExc(e);
		}
	}
	
	void catchTwo() {
		try {
			tryItOut();
		} catch (NullPointerException e) {
			handleExc(e);
		} catch (IndexOutOfBoundsException e) {
			handleExc(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void nestedCatch() {
		try {
			try {
				tryItOut();
			} catch (NullPointerException e) {
				handleExc(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
