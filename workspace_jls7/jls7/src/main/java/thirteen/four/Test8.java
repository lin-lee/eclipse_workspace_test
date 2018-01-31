package thirteen.four;

class Super8 {
	static void out(float f) {
		System.out.println("float");
	}
	
	static void out(int f) {
		System.out.println("int");
	}
}

public class Test8 {
	public static void main(String[] args) {
		Super8.out(2);
	}
}
