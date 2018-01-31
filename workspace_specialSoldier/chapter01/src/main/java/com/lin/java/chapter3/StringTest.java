package com.lin.java.chapter3;

import org.junit.Test;

public class StringTest {
	
	@Test
	public void test1(){
		String a = "a" + "b" + 1;
		String b = "ab1";
		System.out.println(a == b);
	}

}
