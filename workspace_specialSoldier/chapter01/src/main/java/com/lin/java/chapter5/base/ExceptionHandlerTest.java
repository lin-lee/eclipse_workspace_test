package com.lin.java.chapter5.base;

import java.lang.Thread.UncaughtExceptionHandler;

class TestExceptionHandler implements UncaughtExceptionHandler{
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("线程:"+t.getName()+"出现异常");
		e.printStackTrace();
	}
}

public class ExceptionHandlerTest {

	public static void main(String [] args){
		Thread t = new Thread("线程1"){
			@Override
			public void run(){
				Integer.parseInt("ABC");
			}
		};
		t.setUncaughtExceptionHandler(new TestExceptionHandler());
		t.start();
	}
}
