package lin.service.impl;

import java.text.DateFormat;
import java.util.Date;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import lin.service.TimeServer;

@WebService(endpointInterface="lin.service.TimeServer")
@SOAPBinding(style=Style.RPC)
public class TimeServerImpl implements TimeServer {

	@Override
	public String getTimeAsString(String name) {
		// TODO Auto-generated method stub
		Date date = new Date();
		DateFormat df = DateFormat.getDateInstance();
		return name+":"+df.format(date);
	}

	@Override
	public long getTimeAsElapsed(String name) {
		// TODO Auto-generated method stub
		return new Date().getTime();
	}

}
