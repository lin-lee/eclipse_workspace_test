package org.crazyit.cxfapp.service;

import java.util.*;
import javax.jws.*;

import org.crazyit.cxfapp.domain.*;

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

//��@WebService Annotation��ע�������ýӿڽ���Ӧһ��Web Service
@WebService
public interface FirstWs 
{
	//���弸��������ÿ������������¶��һ��Web Service����
	String sayHi(String text);
	String sayHiToUser(User user);
	List<User> getUserList();
}