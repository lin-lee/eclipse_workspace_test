package lee;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.crazyit.cxfapp.service.FirstWs;
import org.crazyit.cxfapp.service.impl.FirstWsImpl;

public class Server {
	
	public static void main(String [] args){
		System.out.println("Æô¶¯·þÎñÆ÷");
		FirstWs implementor = new FirstWsImpl();
		String address = "http://localhost:9999/crazyit";
		JaxWsServerFactoryBean jwsf = new JaxWsServerFactoryBean();
		jwsf.setServiceClass(FirstWs.class);
		jwsf.setAddress(address);
		jwsf.setServiceBean(implementor);
		
		jwsf.getInInterceptors().add(new LoggingInInterceptor());
		jwsf.getOutInterceptors().add(new LoggingOutInterceptor());
		
		jwsf.create();
	}

}
