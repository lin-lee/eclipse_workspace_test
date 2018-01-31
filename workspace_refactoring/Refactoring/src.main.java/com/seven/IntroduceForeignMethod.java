package com.seven;

import java.util.Date;

public class IntroduceForeignMethod {
	
	public void test(){
		DateTest previousEnd = new DateTest();
		Date newStart = new Date(previousEnd.getYear(),
				previousEnd.getMonth(), previousEnd.getDate() + 1);
		//TODO refactoring
		Date newStart2 = nextDay(previousEnd);
	}
	private static Date nextDay(Date arg){
		//foreign method, should be on date
		return new Date(arg.getYear(),
				arg.getMonth(), arg.getDate() + 1);
	}
	
	class DateTest extends Date{
		
	}

}
