package com.lin.java.chapter3;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

import org.junit.Test;

public class IntTest2 {
	
	@Test
	public void test(){
		int i=1;
		int m = (i++)+(++i)+(i++);
		System.out.println(i);
		System.out.println(m);
		
	}
	

}
