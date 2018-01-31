package thirteen.four;

import java.awt.AWTException;
import java.lang.instrument.IllegalClassFormatException;

class Hyper {
	char h = 'h';
}

class Super extends Hyper {
	char s = 's';
}

public class Test extends Super {
	
	public static void printH(Hyper h) {
		System.out.println(h.h);
	}

	public static void main(String[] args) {
		try{
			printH(new Super());
		
				throw new Exception("");
			
		}catch(AWTException  | IllegalClassFormatException e){
			
		}catch(Exception e){
			
		}
	}
}