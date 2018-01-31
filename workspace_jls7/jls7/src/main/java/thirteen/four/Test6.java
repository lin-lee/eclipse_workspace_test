package thirteen.four;

class Hyper6 {
	String h = "Hyper";
}

class Super6 extends Hyper6 {
	char h = 'h';
}

class Test6 extends Super6 {
	public static void main(String[] args) {
		String s = new Test6().h;
		System.out.println(s);
	}
}
