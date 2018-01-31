package com.lin.java.chapter3.oom;

import java.lang.reflect.Method;
import java.net.URLClassLoader;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ClassPermGenFullGC {
	
	private static URLClassLoader parentClassLoader = 
					(URLClassLoader) ClassPermGenFullGC.class.getClassLoader();

	public static Object createProxy(Class<?> targetClass){
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(targetClass);
		enhancer.setUseCache(false);
		enhancer.setClassLoader(new URLClassLoader(parentClassLoader.getURLs(),
								parentClassLoader));
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
			Object o = createProxy(ClassPermGenFullGC.class);
		}
	}
}
