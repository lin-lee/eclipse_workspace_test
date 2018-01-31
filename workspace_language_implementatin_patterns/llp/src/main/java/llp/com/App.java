package llp.com;

import java.util.Date;

import org.apache.bcel.generic.MethodGen;



/**
 * Hello world!
 *
 */
public class App 
{
	
	  static final ThreadLocal<String> trackNumberContext = new ThreadLocal<String>();

	    static final ThreadLocal<String> parentAppNameContext = new ThreadLocal<String>();

	    public static String appName;
	    
	    public static void setTrackNumber(String trackNumber) {
	        trackNumberContext.set(trackNumber);
	    }
	    
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        printFloat(5);
        Date d = null;
        bcelTest(d);
        System.out.println(d);
        
    }
    
    public static int printFloat(int i){
    	float t = 1.5f;
    	System.out.println(t);
    	return 1;
    }
    
    public static void bcelTest(Date time){
    	time = new Date();
    	System.out.println(time);
    }
}
