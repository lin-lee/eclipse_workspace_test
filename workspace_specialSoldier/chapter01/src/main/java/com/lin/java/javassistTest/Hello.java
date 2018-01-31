package com.lin.java.javassistTest;

public class Hello {
	
	public static void main(String [] args) throws Exception{
		test();
	}
    public static String test() throws Exception{
    	
           Thread.currentThread ().sleep(1000);
           return "test";
    }

}