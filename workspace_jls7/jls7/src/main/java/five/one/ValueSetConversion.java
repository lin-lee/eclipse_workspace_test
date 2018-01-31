package five.one;

public class ValueSetConversion {
	public static void main(String [] args){
		StrictfpTest s = new StrictfpTest();
		s.setValue(0.1f);
		System.out.println(s.getValue());
	}

}


strictfp class StrictfpTest{
	
	private float value;
	
	public strictfp void setValue(float value){
		this.value = value;
	}
	
	public float getValue(){
		return this.value;
	}
}
