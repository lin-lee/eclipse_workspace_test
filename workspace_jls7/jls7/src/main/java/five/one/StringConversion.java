package five.one;

public class StringConversion {
	
	public static void main(String [] args){
		Integer i = null;
		String s = "a" + i;new StringBuilder().append(i);
		System.out.println(s);
		
		StringTest stringTest = new StringTest(5);
		String m = stringTest.toString();
		String w = null;
		System.out.println(m);
	}
	
}
	
	
	class StringTest{
		
		StringTest(int value){
			this.value = value;
		}
		private int value;
		
		public String toString(){
			return null;
		}
		
	}


