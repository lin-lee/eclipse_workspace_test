package com.lin.java.chapter7.reflect.annotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TestMain {
	
	public static void main(String [] args) throws InstantiationException, IllegalAccessException{
		@SuppressWarnings({ "unchecked", "serial" })
		List<HashMap<String, String>> list = Arrays.asList(
				new HashMap<String, String>(){
					{
						put("name", "xie");
						put("title", "的");
					}
				},
				new HashMap<String, String>(){
					{
						put("name", "ffff");
						put("title", "标题");
					}
				}
		);
		
		List<UserDO> users = new ArrayList<UserDO>(list.size());
		for(HashMap<String, String> row : list){
			users.add(ConvertionService.convertMapToBean(row, UserDO.class));
		}
		System.out.println(users);
	}

}
