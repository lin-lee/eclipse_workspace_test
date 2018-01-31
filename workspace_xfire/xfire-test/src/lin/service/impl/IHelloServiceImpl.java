package lin.service.impl;

import lin.service.IHelloService;
import lin.service.bean.User;

public class IHelloServiceImpl implements IHelloService {

	@Override
	public String sayHello(String name) {
		
		return "Hello, " + name;
	}

	@Override
	public User getUser(User user) {
		User userNew = new User();
		userNew.setId("new: " + user.getId());
		userNew.setName("new : " + userNew.getName());
		return userNew;
	}

}
