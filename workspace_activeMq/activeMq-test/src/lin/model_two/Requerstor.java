package lin.model_two; 
import javax.jms.*; 
import javax.jms.Queue; 

import java.util.*; 

import javax.naming.*; 
/**
 * 请求/应答模式
 * @author lilin
 *
 */
public class Requerstor { 

/** 
* @param args 
*/ 
	private QueueSession session = null;
	private QueueConnection conn = null;
	private MessageProducer producer = null;
	private MessageProducer invalidProducer = null;
	private Destination replyQueue = null;
	private MessageConsumer replyConsumer;

	public void send() throws JMSException {
		TextMessage requestMessage = session.createTextMessage();
		requestMessage.setText("Hello world");
		requestMessage.setJMSReplyTo(replyQueue);
		producer.send(requestMessage);
		System.out.println("sent request ");
		System.out
				.println("\t Time:      " + System.currentTimeMillis() + "ms");
		System.out.println("\t Message ID:" + requestMessage.getJMSMessageID());
		System.out.println("\t Correl. ID:"
				+ requestMessage.getJMSCorrelationID());
		System.out.println("\t reply to: " + requestMessage.getJMSReplyTo());
		System.out.println("\t contents:" + requestMessage.getText());
	}

	public void receive() throws JMSException {
		Message msg = replyConsumer.receive();
		if (msg instanceof TextMessage) {
			TextMessage replyMessage = (TextMessage) msg;
			System.out.println("recive reply ");
			System.out.println("\t Time:      " + System.currentTimeMillis()
					+ "ms");
			System.out.println("\t Message ID:"
					+ replyMessage.getJMSMessageID());
			System.out.println("\t Correl. ID:"
					+ replyMessage.getJMSCorrelationID());
			System.out.println("\t reply to: " + replyMessage.getJMSReplyTo());
			System.out.println("\t contents:" + replyMessage.getText());
		} else {
			System.out.println("Invalid message detected");
			System.out.println("\t Type:   " + msg.getClass().getName());
			System.out.println("\t Time:   " + System.currentTimeMillis());
			System.out.println("\t Message ID:" + msg.getJMSMessageID());
			System.out.println("\t Correl. ID:" + msg.getJMSCorrelationID());
			System.out.println("\t reply to: " + msg.getJMSReplyTo());

			msg.setJMSCorrelationID(msg.getJMSMessageID());
			invalidProducer.send(msg);
			System.out.println("\t Type:   " + msg.getClass().getName());
			System.out.println("\t Time:   " + System.currentTimeMillis());
			System.out.println("\t Message ID:" + msg.getJMSMessageID());
			System.out.println("\t Correl. ID:" + msg.getJMSCorrelationID());
			System.out.println("\t reply to: " + msg.getJMSReplyTo());
		}
	}

	protected void init() {
		try {
			Properties props = new Properties();
			props.setProperty(Context.INITIAL_CONTEXT_FACTORY,
					"org.jnp.interfaces.NamingContextFactory");
			props.setProperty(Context.PROVIDER_URL, "localhost:1099");
			props.setProperty(Context.URL_PKG_PREFIXES,
					"org.jboss.naming:org.jnp.interfaces");
			InitialContext ctx = new InitialContext(props);

			QueueConnectionFactory factory = 
					(QueueConnectionFactory) ctx
					.lookup("QueueConnectionFactory");
			conn = factory.createQueueConnection();
			session = conn.createQueueSession(false,
					QueueSession.AUTO_ACKNOWLEDGE);
			Destination requestDestination = (Queue) ctx
					.lookup("queue/requestQueue");
			Destination invalidDestination = (Queue) ctx
					.lookup("queue/invalidQueue");
			replyQueue = (Queue) ctx.lookup("queue/replyQueue");
			producer = session.createProducer(requestDestination);
			invalidProducer = session.createProducer(invalidDestination);
			replyConsumer = session.createConsumer(replyQueue);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Requerstor r = new Requerstor();
		try {
			r.init();
			r.send();
		} catch (Exception e) {
			System.out.println(e.toString() + "    Requerstor problems");
		}
	}

}