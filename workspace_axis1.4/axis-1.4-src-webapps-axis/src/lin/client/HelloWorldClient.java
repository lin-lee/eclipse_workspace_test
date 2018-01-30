package lin.client;

import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.log4j.Logger;

public class HelloWorldClient {
	
	private static final Logger log = Logger.getLogger(HelloWorldClient.class);
	
	public static void main(String [] args) 
			throws ServiceException, RemoteException{
		String url = "http://localhost:8080/axis-1.4-src-webapps-axis/services/HelloWorldWSDD1";
		//String url = "http://localhost:8080/axis/services/HelloWorldWSDD";
		Service service = new Service();
		Call call =(Call)service.createCall();
		call.setTargetEndpointAddress(url);
		
		call.setOperationName(new QName(null, "getName"));
		
		String result = (String)call.invoke(new Object[]{"jack"});
		log.info(result);
		System.out.println(result);
	}

}
