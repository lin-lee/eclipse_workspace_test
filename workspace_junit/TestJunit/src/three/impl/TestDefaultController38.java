package three.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import three.Request;
import three.RequestHandler;
import three.Response;

public class TestDefaultController38 {
	
	private DefaultController controller;
	private Request request;
	private RequestHandler handler;
	
	@Before
	public void initialize() throws Exception{
		controller = new DefaultController();
		request = new SampleRequest();
		handler = new SampleHandler();
		
		controller.addHandler(request, handler);
	}
	@Test
	public void testAddHandler(){
		RequestHandler handler2 = controller.getHandler(request);
		assertSame(handler2, handler);
	}
	@Test
	public void testProcessRequest(){
		Response response = controller.processRequest(request);
		assertNotNull("Must not return a null response", response);
		assertEquals("Response should be of type SampleResponse",
				new SampleResponse(), response);
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
	
	

}
