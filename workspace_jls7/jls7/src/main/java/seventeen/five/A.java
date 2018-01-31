package seventeen.five;

import java.lang.reflect.Field;

public class A {
	final int x;

	A() {
		x = 1;
	}

	int f() {
		return d(this, this);
	}

	int d(A a1, A a2) {
		int i = a1.x;
		g(a1);
		int j = a2.x;
		return j - i;
	}

	static void g(A a)  {
		// uses reflection to change a.x to 2
		Class<? extends A> a1 = a.getClass();
		Field x;
		try {
			Field[] fs = a1.getDeclaredFields();
			x = a1.getDeclaredField("x");
			x.setAccessible(true);
			x.setInt(a, 2);
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String [] args){
		A a = new A();
		System.out.println(a.f());
		
	}
}
