package com.lin.java.chapter1;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;

import org.junit.Test;

public class SimpleChineseSort {

	private static final Comparator<Object> CHINA_COMPARE = Collator.getInstance(java.util.Locale.CHINA);

	@Test
	public void test(){
		sortArray();
		sortList();
	}
	
	private static void sortList(){
		List<String> list = Arrays.asList("张三", "李四", "王五");
		Collections.sort(list, CHINA_COMPARE);
		for(String str : list){
			System.out.println(str);
		}
	}
	
	private static void sortArray(){
		String[] arr = {"张三", "李四", "王五"};
		Arrays.sort(arr, CHINA_COMPARE);
		for(String str : arr){
			System.out.println(str);
		}
	}
}
