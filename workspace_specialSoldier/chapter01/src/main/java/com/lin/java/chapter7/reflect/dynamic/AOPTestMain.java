package com.lin.java.chapter7.reflect.dynamic;

import java.lang.reflect.Method;

public class AOPTestMain {

	public static void main(String []args) {
		try {
			HelloInterface hello = BeanFactory.getBean("com.lin.java.chapter7.reflect.dynamic.HelloImpl" , HelloInterface.class);
			hello.setInfo("xieyuooo", "xiaopang");
			
			Method method = HelloInterface.class.getDeclaredMethod("setInfo",
					String.class, String.class);
			method.invoke(new HelloImpl(), "aaa", "bbb");
//			hello.getInfos1();
//			hello.getInfos2();
//			hello.display();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}