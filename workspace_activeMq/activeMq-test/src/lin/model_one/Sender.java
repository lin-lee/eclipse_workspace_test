package lin.model_one;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
/**
 * p2p 点对点模式
 */
public class Sender {
	
	private static final int SEND_NUMBER = 5;
	
	public static void main(String [] args){
		
		ConnectionFactory connectionFactory;
		
		Connection connection = null;
		Session session;
		Destination destination;
		MessageProducer producer;
		
		connectionFactory = new ActiveMQConnectionFactory(
				ActiveMQConnection.DEFAULT_USER,
				ActiveMQConnection.DEFAULT_PASSWORD,
				"tcp://localhost:61616");
		try{
			connection = connectionFactory.createConnection();
			connection.start();
			session =connection.createSession(Boolean.TRUE,
					Session.AUTO_ACKNOWLEDGE);
			destination = session.createQueue("FirstQueue");
			producer = session.createProducer(destination);
			producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
			
			sendMessage(session, producer);
			session.commit();
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			try{
				if (connection != null)
					connection.close();
			}catch (Throwable ignore){
				
			}
		}
	}
		
	public static void sendMessage(Session session,  MessageProducer producer)
		throws Exception {
		
		for(int i = 1; i <= SEND_NUMBER; i++){
			TextMessage message = session.createTextMessage("ActiveMq发送的消息" + i);
			System.out.println("发送消息："+ "ActiveMq发送的消息" + i);
			producer.send(message);
		}
		
	}


}
