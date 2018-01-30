package dynamic_proxy_3_2_4;

public class CalculatorProxy implements Calculator {

	private Calculator calculator;
	CalculatorProxy(Calculator calculator){
		this.calculator = calculator;
	}
	
	@Override
	public int add(int a, int b) {
		//Ç°
		int result = calculator.add(a, b);
		//ºó
		return a + b;
	}

}
