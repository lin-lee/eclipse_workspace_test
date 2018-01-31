package com.lilin;

/**
 * Hello world!
 *
 */
public class HelloWorld {
	
	public String sayHello(){
		return "Hello Maven";
	}
	
    public static String say(){
    	String result = new HelloWorld().sayHello();
        System.out.println(result);
        return result;
    }
    
    public static void main(String [] args){
    	System.out.println(new HelloWorld().sayHello());
    }
}
