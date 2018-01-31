package lin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import lin.bean.Item;
import lin.bean.Ref;

public class StaxTest {  
    //�����¼����ķ�ʽ�����ģ�ͨ��ʹ�����ģ��Уɣ���ָ��һ�����������ĵ���ÿһ���ڵ㶼���Է���һ���¼����������Ժ���JVM�������ڴ档  
    public static void main(String[] args) throws IOException,  
            XMLStreamException {  
  
        StaxTest test = new StaxTest();  
        File file = new File("src/test.xml");  
        test.read(file);  
    }  
  
    public void read(File file) throws IOException, XMLStreamException {  
        Long time = null;  
        XMLInputFactory factory = XMLInputFactory.newInstance();  
        Reader fileReader = new FileReader(file);  
        factory.setProperty(XMLInputFactory.IS_COALESCING, Boolean.TRUE);  
        XMLStreamReader reader = factory.createXMLStreamReader(fileReader);  
        try {  
            int event = reader.getEventType();//��ȡ�ڵ�����,����������εķ�ʽ���صġ�  
  
            //�����3�������Ǿ����POJO  
            Item item = null;  
            Ref ref = null;  
            List<Ref> refList = null;//�������POJO�ļ���  
  
            while (true) {  
                switch (event) {  
                case XMLStreamConstants.START_DOCUMENT://��ʾ�����ĵ��Ŀ�ͨ�ڵ㡣  
                    time = System.currentTimeMillis();  
                    break;  
                case XMLStreamConstants.START_ELEMENT://��ʼ������ʼ�ڵ�  
                    if (reader.getLocalName().equals("item")) {//�жϽڵ������  
                        item = new Item();//ʵ����һ���ڵ�Уϣʣ���  
                        refList = new ArrayList<Ref>();  
  
                        //���ڵ㸳ֵ  
                        item.setType(reader.getAttributeValue(0));//getAttributeValue(index)��ȡ���Ե�ֵ�������ж�����ԡ�  
                        item.setName(reader.getAttributeValue(1));  
                        item.setSeq(reader.getAttributeValue(2));  
  
                    }  
  
                    if (reader.getLocalName().equals("status")) {  
  
                        item.setStatus(reader.getElementText());  
  
                    }  
  
                    if (reader.getLocalName().equals("desc")) {  
                        item.setDesc(reader.getElementText());  
  
                    }  
  
                    if (reader.getLocalName().equals("ref")) {  
  
                        ref = new Ref();  
                        ref.setSource(reader.getAttributeValue(0));  
                        System.out.println("-----------refs--ref-------------");  
                        if (reader.getAttributeCount() > 1) {  
                            ref.setUrl(reader.getAttributeValue(1));  
                            System.out.println("url: " + ref.getUrl());  
                        }  
                        ref.setText(reader.getElementText());  
                        System.out.println("source: "+ref.getSource());
                        System.out.println("text: "+ref.getText());
                       
  
                    }  
                    break;  
  
                case XMLStreamConstants.CHARACTERS:  
                    // if(reader.isWhiteSpace())  
                    // break;  
                    break;  
                    //�ĵ��Ľ���Ԫ��  
                case XMLStreamConstants.END_ELEMENT:  
                    if (reader.getLocalName().equals("item")) {  
                        item.setRefList(refList);  
                    }  
  
                    break;  
                    //�ĵ��Ľ�����  
                case XMLStreamConstants.END_DOCUMENT:  
                    System.out.println("-----------end Document--------");  
                    time = System.currentTimeMillis() - time;  
                    System.out.println("��ʱ: " + time + "����");  
                    break;  
                }  
  
                if (!reader.hasNext()) {  
                    break;  
                }  
                event = reader.next();  
            }  
        } finally {  
            reader.close();  
        }  
    }  
  
}  
