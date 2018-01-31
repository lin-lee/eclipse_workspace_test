package com.lin.java.chapter1;

import junit.framework.Assert;

import org.junit.Test;

public class StringTest1 {
	
	@Test
	public void StringEqualsTest(){
		//this code compiler optimization finally 
		//is this
		//String a = "ab1";
		String a = "a" + "b" + 1;
		String b = "ab1";
		Assert.assertEquals("String is not equals",a, b);
	}

	@Test
	public void StringEqualsTest2(){
		String a = "a";
		final String c = "a";
		
		String b = a + "b";
		String d = c + "b";
		String e = getA() + "b";
		
		String compare = "ab";
		System.out.println(b == compare);
		System.out.println(d == compare);
		System.out.println(e == compare);
	}
	
	@Test
	public void StringEqualsTest3(){
		String a = "a";
		String b = a + "b";
		String c = "ab";
		String d = new String(b);
		
		int i = Integer.parseInt("16", 3);
		
		System.out.println(b == c);
		System.out.println(c == d);
		System.out.println(c == d.intern());
		System.out.println(b.intern() == d.intern());
	}
	
	private static String getA(){
		return "a";
	}
	
}
