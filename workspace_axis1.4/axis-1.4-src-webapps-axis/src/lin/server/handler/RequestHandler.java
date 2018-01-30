package lin.server.handler;

import org.apache.axis.AxisFault;
import org.apache.axis.Message;
import org.apache.axis.MessageContext;
import org.apache.axis.handlers.BasicHandler;
import org.apache.axis.message.SOAPEnvelope;

public class RequestHandler extends BasicHandler{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static long COUNT = 0L;
	private static int REQUEST_COUNT = 0;
	
	public void invoke(MessageContext msgContext) throws AxisFault {
		/**
		 * MessageContext相当于当前Services的一个上下文，
		 * 里面存储的是当前服务和调用的一些信息
		 */
		
		Message  msg = msgContext.getRequestMessage();
        SOAPEnvelope env = (SOAPEnvelope) msg.getSOAPEnvelope();
        msgContext.setResponseMessage( new Message( env ) );
		
		
		COUNT ++;
		REQUEST_COUNT ++;
		String state = (String) this.getOption("state");
		System.out.println("state: " + state + ", count: " + COUNT + ", requestCount: " + REQUEST_COUNT);
	}
}


