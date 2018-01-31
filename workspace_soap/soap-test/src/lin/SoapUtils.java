package lin;

import java.util.Calendar;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

public class SoapUtils {
	
	 public static void main(String args[]) {  
		  
	        try {  
	  
	            // ��������  
	            // ==================================================  
	            SOAPConnectionFactory soapConnFactory = SOAPConnectionFactory  
	                    .newInstance();  
	            SOAPConnection connection = soapConnFactory.createConnection();  
	  
	            //  ������Ϣ����  
	            // ===========================================  
	            MessageFactory messageFactory = MessageFactory.newInstance();  
	            SOAPMessage message = messageFactory.createMessage();  
//	          message.setProperty(SOAPMessage.CHARACTER_SET_ENCODING, "gb2312");  
	  
	            // ����soap��Ϣ����==========================================  
	            SOAPPart soapPart = message.getSOAPPart();// ����soap����  
	            SOAPEnvelope envelope = soapPart.getEnvelope();  
	            SOAPBody body = envelope.getBody();  
	            //  ����Ҫ����mule�Ĳ�����������Ϣbody���ݡ�������������ÿ��Բ���Ӧ�ü��ɽӿڼ����淶1.1�汾  
	            // =====================================  
	            SOAPElement bodyElement = body.addChildElement(envelope.createName(  
	                    "process", "Request", "http://esb.service.com/"));  
	            bodyElement.addChildElement("ServiceCode").addTextNode("10000061");  
	            bodyElement.addChildElement("OrigAppId").addTextNode("999");  
	            bodyElement.addChildElement("HomeAppId").addTextNode("998");  
	            Calendar c = Calendar.getInstance();  
	            String reqTime = String.valueOf(c.getTimeInMillis());  
	            bodyElement.addChildElement("ReqTime").addTextNode(reqTime);  
	            bodyElement.addChildElement("IpAddress").addTextNode("10.212.40.112");  
	            bodyElement.addChildElement("OrigSerialNo").addTextNode("201205242011");  
	            //��ServiceCode+ OrigAppId+ ReqTime+ IpAddress��ǩ��  
	            String AppSignature = "10000061"+"999"+reqTime+"10.212.40.112"+"123456";  
	            bodyElement.addChildElement("AppSignature").addTextNode(AppSignature);  
	            bodyElement.addChildElement("Version").addTextNode("014");  
//	          bodyElement.addChildElement("RelSessionId").addTextNode("RelSessionId");  
//	          bodyElement.addChildElement("ReplyCode").addTextNode("ReplyCode");  
	            bodyElement.addChildElement("ReplyVersion").addTextNode("05");  
	            bodyElement.addChildElement("TimeOut").addTextNode("30");  
//	          bodyElement.addChildElement("FtpDir").addTextNode("FtpDir");  
//	          bodyElement.addChildElement("FileList").addTextNode("FileList");  
	            bodyElement.addChildElement("serviceParas").addTextNode("<param><name>apptest</name><password>apptest</password></param>");  
	            // Save the message  
	            message.saveChanges();  
	            // ��ӡ�ͻ��˷�����soap���ģ�����֤����  
	            System.out.println(" REQUEST: ");  
	            System.out.println("<param><name>apptest</name><password>apptest</password></param>");
	            message.writeTo(System.out);  
	            System.out.println(" ");  
	        }catch(Exception e){
	        	e.printStackTrace();
	        }
	 }

}
