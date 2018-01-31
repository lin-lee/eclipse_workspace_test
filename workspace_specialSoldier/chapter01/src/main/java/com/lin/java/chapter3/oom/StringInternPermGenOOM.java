package com.lin.java.chapter3.oom;

import java.util.ArrayList;
import java.util.List;

public class StringInternPermGenOOM {
	
	public static void main(String [] args){
		int i = 0;
		List<String> list = new ArrayList<String>();
		while(true){
			list.add(
					("dddddd" + i++).intern());
		}
	}

}
