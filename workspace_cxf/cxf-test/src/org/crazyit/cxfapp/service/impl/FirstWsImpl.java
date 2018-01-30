package org.crazyit.cxfapp.service.impl;

import java.util.*;
import javax.jws.WebService;

import org.crazyit.cxfapp.domain.*;
import org.crazyit.cxfapp.service.*;


/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a> 
 * <br/>Copyright (C), 2001-2012, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */

//����Web Service�ӿڵ�ʵ���࣬Web Service������
@WebService(endpointInterface = "org.crazyit.cxfapp.service.FirstWs"
	,serviceName = "FirstWsService")
public class FirstWsImpl implements FirstWs 
{
	//��һ��HashMap��ģ�����ݿ⣨ֻҪ��Web Service���رգ���Map�������һֱ���ڣ�
	Map<Integer, User> users = new HashMap<Integer, User>();
	//ʵ��Web Service��3��������������
	public String sayHi(String name) 
	{
		System.out.println("����sayHi����");
		return "Hello��" + name;
	}

	public String sayHiToUser(User user) 
	{
		System.out.println("����sayHiToUser ����");
		users.put(user.getId(), user);
		return user.getName() + "����ӭʹ��CXF";
	}

	public List<User> getUserList() 
	{
		System.out.println("����getUserList����" + users);
		List<User> result = new ArrayList<User>();
		for (Object obj : users.values() )
		{
			result.add((User)obj);
		}
		return result;
	}
}