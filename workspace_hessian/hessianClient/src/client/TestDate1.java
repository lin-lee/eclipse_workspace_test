package client;

public class TestDate1(){
	
	@Test
	public void testAdd(){
		Date Date = DateUtil.toDate("2015-03-24", "yyyyMMddHHmm");//��Ʒ�����ڽ���ʱ��
		Date visiteDate = DateUtil.toDate("2015-03-25", "yyyyMMddHHmm");
		if(DateUtil.isCompareTime(DateUtils.addDays(Date,1),DateUtils.addMinutes( DateUtils.addHours(visiteDate, 23), 59) )){
			System.out.println("d");
		}
	}
	
}