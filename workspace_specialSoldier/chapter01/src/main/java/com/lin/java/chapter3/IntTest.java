package com.lin.java.chapter3;

import org.junit.Test;

public class IntTest extends IntTestInterface{
	
	@Test
	public void test(){
		String s ="a";
		int a=1, b=1, c=1, d=1;
		
		a++;
		++b;
		
		c=c++;
		d=++d;

		System.out.println(a + "\t" + b + "\t" + c + "\t" + d);		
		System.out.println(IntTest.class.getClassLoader().toString());
	}
	

}
