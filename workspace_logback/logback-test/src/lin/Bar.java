package lin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Bar {   
  
    public static Logger logger = LoggerFactory.getLogger(Bar.class);   
  
    public void doIt() {   
        logger.debug("doing my job");   
    }  
    
    public static void main(String [] args){
    	logger.info("main方法启动........");
    	Bar b = new Bar();
    	b.doIt();
    			
    }
}