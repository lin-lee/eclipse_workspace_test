package enumTest;

import enumTest.PassPortConstant.PASSCODE_STATUS;

public   enum Seasons {
	Spring("春天"), Summer("夏天"), Fall("秋天"), Winter("冬天");
	
	public String cName;
	private Seasons(String cName){
		this.cName = cName;
	}
	
	public static void main(String [] args){
		Seasons s = Enum.valueOf(Seasons.class, "Summer");
		PASSCODE_STATUS n = PassPortConstant.PASSCODE_STATUS.ABANDON;
		System.out.println(n.name());
	}

}
