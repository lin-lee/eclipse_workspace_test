package lin;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.InitialContext;

public class JmsSender {
	
	public static void main(String [] args){
		new JmsSender().send();
	}
	
	public void send(){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Enter ConnectionFactory name:");
			String factoryName = reader.readLine();
			
			System.out.println("Enter Destination name:");
			String destinationName = reader.readLine();
			
			InitialContext initContext = new InitialContext();
			ConnectionFactory factory = 
					(ConnectionFactory)initContext.lookup("java:JmsXA");
			
			
			initContext.close();
			
			Connection connection = factory.createConnection();
			Session session = 
					connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			Destination destination = session.createQueue(destinationName);
					//(Destination)initContext.lookup(destinationName);
			MessageProducer sender = session.createProducer(destination);
			
			String messageText = null;
			while(true){
				System.out.println("Enter message to send or 'quit':");
				messageText = reader.readLine();
				if("quit".equals(messageText))
					break;
				TextMessage message = session.createTextMessage(messageText);
				sender.send(message);
			}
			
			System.out.println("Exiting...");
			reader.close();
			connection.close();
			
		}catch(Exception e){
			e.printStackTrace();
			System.exit(1);
		}
	}

}
