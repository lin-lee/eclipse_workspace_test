package activeMq.openwire.pub_sub;

import javax.jms.JMSException;  
import javax.jms.Message;  
import javax.jms.MessageListener;  
import javax.jms.TextMessage;  
  
/** 
 * 订阅者1的监听 
 * 消息监听类 
 * @author xx   
 */  
public class Listener1 implements MessageListener {  
  
    @Override  
    public void onMessage(Message message) {  
        try {  
            System.out.println("订阅者一收到的消息：" + ((TextMessage)message).getText());  
        } catch (JMSException e) {  
            e.printStackTrace();  
        }  
    }  
  
}  
