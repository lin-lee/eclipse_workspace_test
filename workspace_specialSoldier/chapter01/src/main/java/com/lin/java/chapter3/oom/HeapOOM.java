package com.lin.java.chapter3.oom;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {
	
	public static void main(String [] args){
		List<String> list = new ArrayList<String>();
		while(true){
			list.add("内存溢出啦！内存溢出啦！");
		}
	}

}