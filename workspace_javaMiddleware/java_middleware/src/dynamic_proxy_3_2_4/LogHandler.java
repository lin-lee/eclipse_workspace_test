package dynamic_proxy_3_2_4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LogHandler implements InvocationHandler{

	Object obj;
	LogHandler(Object obj){
		this.obj = obj;
	}
	
	@Override
	public Object invoke(Object obj1, Method method, Object[] args)
			throws Throwable {
		this.doBefore();
		Object o = method.invoke(obj1, args);
		this.doAfter();
		return o;
	}

	public void doBefore(){
		System.out.println("a");
	}
	public void doAfter(){
		System.out.println("b");
	}
	

	public static void main(String[] args){
		Calculator calculator = new CalculatorImpl();
		LogHandler lh = new LogHandler(calculator);
		Calculator proxy = (Calculator) Proxy.newProxyInstance(calculator.getClass().getClassLoader(),
				calculator.getClass().getInterfaces(), lh);
		proxy.add(1, 1);
	}
}
