package thirteen.four;

import java.lang.reflect.Method;

class Super7 {
	void out() {
		System.out.println("Out");
	}
}

public class Test7 extends Super7 {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Test7 t = new Test7();
		Class<? extends Test7> a = t.getClass();
		Method m = a.getDeclaredMethod("", a);
		
		System.out.println("Way ");
		t.out();
	}
}