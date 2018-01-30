package org.crazyit.cxfapp.service;

import java.util.*;
import javax.jws.*;

import org.crazyit.cxfapp.domain.*;

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

//以@WebService Annotation标注，表明该接口将对应一个Web Service
@WebService
public interface FirstWs 
{
	//定义几个方法，每个方法将被暴露成一个Web Service操作
	String sayHi(String text);
	String sayHiToUser(User user);
	List<User> getUserList();
}