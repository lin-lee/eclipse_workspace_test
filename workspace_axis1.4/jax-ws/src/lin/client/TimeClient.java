package lin.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.sun.xml.internal.ws.client.sei.SEIStub;

import lin.service.TimeServer;

public class TimeClient {
	
	public static void main(String [] args) throws MalformedURLException{
		URL url = new URL("http://127.0.0.1:10100/myweb?wsdl");
		QName qname = new QName("http://impl.service.lin/", "TimeServerImplService");
		
		Service service  = Service.create(url, qname);
		//SEIStub
		TimeServer ts = service.getPort(TimeServer.class);
		System.out.println(ts.getTimeAsString("北京时间："));
		System.out.println(ts.getTimeAsElapsed("xian"));
	}

}
