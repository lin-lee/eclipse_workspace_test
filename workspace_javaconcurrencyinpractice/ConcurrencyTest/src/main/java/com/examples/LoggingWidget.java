package com.examples;

public class LoggingWidget extends Widget{
	
	public synchronized void doSomething(){
		System.out.println(toString() + ": calling doSomething");
		super.doSomething();
	}
	
	public synchronized void superDosomething(){
		super.doSomething();
	}
	
	public static void main(String [] args){
		
		final LoggingWidget l = new LoggingWidget();
		final Widget w = new Widget();
		Thread t = new Thread(new Runnable(){
			public void run(){
				l.superDosomething();
			}
		});
		t.start();
		l.doSomething();
	}
}
