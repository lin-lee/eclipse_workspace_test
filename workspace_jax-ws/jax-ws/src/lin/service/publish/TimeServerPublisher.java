package lin.service.publish;

import javax.xml.ws.Endpoint;

import lin.service.impl.TimeServerImpl;

public class TimeServerPublisher {

	public static void main(String [] args){
		Endpoint.publish("http://127.0.0.1:10100/myweb", new TimeServerImpl());
	}
}
