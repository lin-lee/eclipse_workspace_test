import java.security.Signature;
import java.util.Calendar;
import java.util.Date;


public class A {
	
	public static void main(String [] args){
		
		Date d = new Date();
		System.out.println(addDays(d, 1));
		  
	}
	
	public static Date addDays(Date date, int amount)
	{
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_MONTH, amount);
		return cal.getTime();
	}

}
