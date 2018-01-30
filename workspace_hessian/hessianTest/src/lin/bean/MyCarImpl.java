package lin.bean;

import java.io.Serializable;



public class MyCarImpl extends MyCar{
	
	private String carName;
	private String carModel;
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
	public String toString(){
		return "my car name:[" + this.carName +"] , car model:[" + this.carModel +"]";
	}
	

}
