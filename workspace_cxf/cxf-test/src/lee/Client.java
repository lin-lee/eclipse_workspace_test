package lee;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.crazyit.cxfapp.domain.User;
import org.crazyit.cxfapp.service.FirstWs;

public class Client {
	
	public static void main(String [] args){
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(FirstWs.class);
		factory.setAddress("http://localhost:9999/crazyit");
		FirstWs client = (FirstWs)factory.create();
		String reply = client.sayHi("�����");
		System.out.println("���������أ�"+reply);
		User user = new User(2, "��˽�", "��", 1.86);
		System.out.println(client.sayHiToUser(user));
		System.out.println(client.getUserList());
	}

}
