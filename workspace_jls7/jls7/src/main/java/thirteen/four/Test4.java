package thirteen.four;

class Point {
	public int x, y;

	public void print() {
		System.out.println("(" + x + "," + y + ")");
	}
}

public class Test4 extends Point {
	public static void main(String[] args) {
		Test4 t = new Test4();
		t.print();
	}

	@Override
	protected void print() {
		System.out.println("Test");
	}
}
