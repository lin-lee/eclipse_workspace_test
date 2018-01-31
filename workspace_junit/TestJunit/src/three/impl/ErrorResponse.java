package three.impl;

import three.Request;
import three.Response;

public class ErrorResponse implements Response {
	
	private Request originalRequest;
	private Exception originalException;
	public ErrorResponse(Request request, Exception exception){
		this.originalRequest = request;
		this.originalException = exception;
	}
	private static final String NAME = "Test";
	public String getName(){
		return NAME;
	}
	
	public Request getOriginalRequest()
    {
        return this.originalRequest;
    }

    public Exception getOriginalException()
    {
        return this.originalException;
    }
}
