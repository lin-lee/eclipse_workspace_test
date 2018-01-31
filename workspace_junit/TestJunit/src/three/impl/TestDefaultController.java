package three.impl;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;
import org.junit.Before;
import org.junit.Test;

import three.Request;
import three.RequestHandler;
import three.Response;

public class TestDefaultController {
	
	private DefaultController controller;
	
	@Before
	public void instantiate(){
		controller = new DefaultController();
		System.out.println("Before annotations execute!");
	}
	@Test
	public void testMethod(){
		System.out.println("Hello");
		throw new RuntimeException("implememt me");
		
	}
	@Test
	public void testAddHandler(){
		Request request = new SampleRequest();
		RequestHandler handler = new SampleHandler();
		controller.addHandler(request, handler);
		RequestHandler handler2 = controller.getHandler(request);
		assertSame("Hander we set in controller should be the"
				+ " same handler we get", handler2, handler);
	}
	
	@Test
	public void testProcessRequest(){
		Request request = new SampleRequest();
		RequestHandler handler = new SampleHandler();
		controller.addHandler(request, handler);
		Response response = controller.processRequest(request);
		assertNotNull("Must not return a null response", response);
		assertEquals("Response should be of type SampleResponse",
				SampleResponse.class, response.getClass());
	}
	
	
	private class SampleRequest implements Request{
		public String getName(){
			return "Test";
		}
	}
	
	private class SampleHandler implements RequestHandler{
		public Response process(Request request) throws Exception{
			return new SampleResponse();
		}
	}
	
	private class SampleResponse implements Response{
		public String getName(){
			return "Test";
		}
	}

}
