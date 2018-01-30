package dynamic_proxy_3_2_4;

import java.lang.reflect.Proxy;

public class Test {
	
	public static void main(String[] args){
		Calculator calculator = new CalculatorImpl();
		LogHandler lh = new LogHandler(calculator);
		Calculator proxy = (Calculator) Proxy.newProxyInstance(calculator.getClass().getClassLoader(),
				calculator.getClass().getInterfaces(), lh);
		proxy.add(1, 1);
	}

}
