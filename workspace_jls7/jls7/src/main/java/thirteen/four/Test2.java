package thirteen.four;

class Hyper2 {
	void hello() {
		System.out.println("hello from Hyper");
	}
}

class Super2 extends Hyper2 {
	void hello() {
		System.out.println("hello from Super");
	}
}

public class Test2 {
	public static void main(String[] args) {
		new Super2().hello();
	}
}
