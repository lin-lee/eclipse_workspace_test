package org.crazyit.cxfapp.service.impl;

import java.util.*;
import javax.jws.WebService;

import org.crazyit.cxfapp.domain.*;
import org.crazyit.cxfapp.service.*;


/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> 
 * <br/>Copyright (C), 2001-2012, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */

//定义Web Service接口的实现类，Web Service的名字
@WebService(endpointInterface = "org.crazyit.cxfapp.service.FirstWs"
	,serviceName = "FirstWsService")
public class FirstWsImpl implements FirstWs 
{
	//以一个HashMap来模拟数据库（只要该Web Service不关闭，该Map里的数据一直存在）
	Map<Integer, User> users = new HashMap<Integer, User>();
	//实现Web Service的3个操作（方法）
	public String sayHi(String name) 
	{
		System.out.println("调用sayHi方法");
		return "Hello，" + name;
	}

	public String sayHiToUser(User user) 
	{
		System.out.println("调用sayHiToUser 方法");
		users.put(user.getId(), user);
		return user.getName() + "，欢迎使用CXF";
	}

	public List<User> getUserList() 
	{
		System.out.println("调用getUserList方法" + users);
		List<User> result = new ArrayList<User>();
		for (Object obj : users.values() )
		{
			result.add((User)obj);
		}
		return result;
	}
}