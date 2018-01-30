package com.springactivemq;

import javax.jms.Destination;
import javax.jms.TextMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

public class ProxyJMSConsumer {
	
	public ProxyJMSConsumer(){}
	private JmsTemplate jmsTemplate;
	
	public JmsTemplate getJmsTemplate(){
		return jmsTemplate;
	}
	public void setJmsTemplate(JmsTemplate jmsTemplate){
		this.jmsTemplate = jmsTemplate;
	}
	
	public void recive(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-jms.xml");
		Destination destination = (Destination)applicationContext.getBean("destination");
		while(true){
			try{
				TextMessage textmsg = (TextMessage)jmsTemplate.receive(destination);
				if(null != textmsg){
					System.out.println("[DB Proxy] " +textmsg);
					System.out.println("[DB Proxy] 收到的消息内容为："+ textmsg.getText());
				}else
					break;
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}

}
