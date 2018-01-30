package com.examples;

public class Widget {
	private int i = 0;
	
	public synchronized void doSomething(){
		i++;
		System.out.println("doSomeThing .....: " + i);
	}

}