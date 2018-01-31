package twelve.four;

interface I {
	int i = 1, ii = Test3.out("ii", 2);

}

interface J extends I {
	int j = Test3.out("j", 3), jj = Test3.out("jj", 4);
}

interface K extends J {
	int k = Test3.out("k", 5);
}

public class Test3 {
	public static void main(String[] args) {
		System.out.println(J.i);
		System.out.println(K.j);
	}

	static int out(String s, int i) {
		System.out.println(s + "=" + i);
		return i;
	}
}