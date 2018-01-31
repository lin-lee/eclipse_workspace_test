package thirteen.four;

class Hyper3 {
	void hello() {
		System.out.println("hello from Hyper");
	}
}

class Super3 extends Hyper3 {
}

public class Test3 extends Super3 {
	public static void main(String[] args) {
		new Test3().hello();
	}

	@Override
	void hello() {
		super.hello();
	}
}
