package com.lin.java.chapter7.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodInvokeSample {
	
	public static void main(String [] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Method method = MethodInvokeSample.class.getDeclaredMethod("test",
				String.class, int.class);
		String result = (String) method.invoke(null,  "f", 2);
		System.out.println(result);
	}
	
	public static String test(String a, int b){
		return "传入参数1:"+a+",传入参数2："+b;
	}

}
