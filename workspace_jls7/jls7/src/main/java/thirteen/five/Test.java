package thirteen.five;

interface I {
	void hello();
}

public class Test implements I {
	public static void main(String[] args) {
		I anI = new Test();
		anI.hello();
	}

	public void hello() {
		System.out.println("hello");
		char c ='\u5535';
	}
}
