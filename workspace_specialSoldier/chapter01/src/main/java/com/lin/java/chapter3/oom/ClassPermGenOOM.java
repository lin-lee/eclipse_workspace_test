package com.lin.java.chapter3.oom;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ClassPermGenOOM {

	public static Object createProxy(Class<?> targetClass){
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(targetClass);
		enhancer.setUseCache(false);
		enhancer.setCallback(new MethodInterceptor(){
			@Override
			public Object intercept(Object object, Method method, Object[] args,
					MethodProxy methodProxy) throws Throwable {
				return methodProxy.invokeSuper(object, args);
			}
			
		});
		return enhancer.create();
	}
	
	public static void main(String [] args){
		while(true){
			createProxy(ClassPermGenOOM.class);
		}
	}
}
