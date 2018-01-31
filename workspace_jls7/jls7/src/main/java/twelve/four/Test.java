package twelve.four;

class Super {
	static {
		System.out.print("Super ");
	}
}

class One {
	static {
		System.out.print("One ");
	}
	
	public static final int O  = 1;
}

class Two extends Super {
	static {
		System.out.print("Two ");
	}
}

public class Test {
	public static void main(String[] args) {
		One o = null;
		//when One.O is a Constant or static variable, please check the different between them.
		int i = One.O ;
		System.out.println(i);
		Two t = new Two();
		System.out.println((Object) o == (Object) t);
	}
}
