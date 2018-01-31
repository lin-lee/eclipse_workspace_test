package thirteen.four;


class Hyper5 {
	String h = "hyper";
}

class Super5 extends Hyper5 {
	String s = "super";
	//int h = 0;
}


public class Test5 {
	public static void main(String[] args) {
		System.out.println(new Super5().h);
	}
}
