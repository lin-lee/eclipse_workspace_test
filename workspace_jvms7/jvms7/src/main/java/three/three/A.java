package three.three;

public class A {
	
	@SuppressWarnings("unused")
	private static final int i = -1;
	
	int align2grain(int i, int grain) {
		return ((i + grain-1) & ~(grain-1));
	}

	public static void main(String [] args){
		System.out.println(~i);
	}
}
