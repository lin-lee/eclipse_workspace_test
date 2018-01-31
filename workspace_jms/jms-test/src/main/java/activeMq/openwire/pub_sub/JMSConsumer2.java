package activeMq.openwire.pub_sub;

import javax.jms.Connection;  
import javax.jms.ConnectionFactory;  
import javax.jms.Destination;  
import javax.jms.MessageConsumer;  
import javax.jms.Session;  
 
  
import org.apache.activemq.ActiveMQConnection;  
import org.apache.activemq.ActiveMQConnectionFactory;  
  
/** 
 * 消息的订阅者一 
 * @author xx 
 */  
public class JMSConsumer2 {  
  
    //默认连接用户名  
    private static final String USERNAME = ActiveMQConnection.DEFAULT_USER;  
    //默认连接密码  
    private static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD;  
    //默认的连接地址  
    private static final String BROKEURL = ActiveMQConnection.DEFAULT_BROKER_URL;  
      
    public static void main(String[] args) {  
        ConnectionFactory factory ; //连接工厂  
        Connection connection = null ; //连接  
        Session session ; //会话，接收或者发送消息的线程  
        Destination destination; //消息的目的地  
        MessageConsumer messageConsumer; //消息消费者  
        //实例化连接工厂  
        factory = new ActiveMQConnectionFactory(JMSConsumer2.USERNAME, JMSConsumer2.PASSWORD, JMSConsumer2.BROKEURL);  
        //通过连接工厂获取connection  
        try {  
            connection = factory.createConnection();  
            connection.start(); //启动连接  
            //创建session  
            session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);  
            //创建连接消息队列,消息到达的目的地  
//          destination = session.createQueue("FirstQueue");  
            destination = session.createTopic("topic1");  
            //创建消费者  
            messageConsumer = session.createConsumer(destination);  
            //注册消息监听  
            messageConsumer.setMessageListener(new Listener1());  
        }catch(Exception e){  
            e.printStackTrace();  
        }  
    }  
} 
