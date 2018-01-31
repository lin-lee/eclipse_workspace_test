package twelve.four;

class Super2 {
	static int taxi = 1729;
}

class Sub extends Super2 {
	static {
		System.out.print("Sub ");
	}
}
/**
 * only the class that declares static field is initialized
 *
 */
public class Test2 {
	public static void main(String[] args) {
		System.out.println(Sub.taxi);
	}
}

