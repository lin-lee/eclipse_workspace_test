package com.seven;

import java.util.Date;

public class IntroduceLocalExtension {
	
	public void test(){
		MfDateSub previousEnd = new MfDateSub(new Date());
		Date newStart = new Date(previousEnd.getYear(),
				previousEnd.getMonth(), previousEnd.getDate() + 1);
		//TODO refactoring
		Date newStart2 = previousEnd.nextDay();
	}
	
	
	class MfDateSub extends Date{
		private static final long serialVersionUID = 1L;
		public MfDateSub(String dateString){
			super(dateString);
		}
		public MfDateSub(Date arg){
			super(arg.getTime());
		}
		Date nextDay(){
			return new Date(getYear(),
					getMonth(), getDate() + 1);
		}
	}
	
	class MfDateWrap{
		private Date _original;
		
		public MfDateWrap(String dateString){
			_original = new Date(dateString);
		}
		public MfDateWrap(Date arg){
			_original = arg;
		}
	}

}
