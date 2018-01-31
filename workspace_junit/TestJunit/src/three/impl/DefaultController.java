package three.impl;

import java.util.HashMap;
import java.util.Map;

import three.Controller;
import three.Request;
import three.RequestHandler;
import three.Response;

public class DefaultController implements Controller {
	
	private Map requestHandler = new HashMap();
	
	protected RequestHandler getHandler(Request request){
		if(!this.requestHandler.containsKey(request.getName())){
			String message = "Cannot find handler for request name "
					+"[" + request.getName() + "]";
			throw new RuntimeException(message);
		}
		return (RequestHandler)
				this.requestHandler.get(request.getName());
	}
	@Override
	public Response processRequest(Request request) {
		Response response;
		try{
			response = getHandler(request).process(request);
		}catch(Exception exception){
			response = new ErrorResponse(request, exception);
		}
		return response;
	}

	@Override
	public void addHandler(Request request, RequestHandler requestHander) {
		
		if(this.requestHandler.containsKey(request.getName())){
			throw new RuntimeException("A request handler has "
					+"already been registered for request name "
					+"[" + request.getName() + "]");
		}else{
			this.requestHandler.put(request.getName(), requestHander);
		}

	}

}
