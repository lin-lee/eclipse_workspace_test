package lin.client;

import java.net.MalformedURLException;

import lin.service.IHelloService;
import lin.service.bean.User;

import org.codehaus.xfire.XFireFactory;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;

public class ClientTest {
	
	public static void main(String [] args) throws MalformedURLException{
		Service service = new ObjectServiceFactory().create(IHelloService.class);
		XFireProxyFactory factory = new XFireProxyFactory(XFireFactory
				.newInstance().getXFire());
		String url = "http://localhost:8080/xfire-test/services/HelloService";
		IHelloService helloService = (IHelloService)factory.create(service, url);
		System.out.println(helloService.sayHello("张三"));
		
		User user = new User();
		user.setName("张三");
		System.out.println(helloService.getUser(user).getName());
	}

}
