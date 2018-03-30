package my.java.Assignment4;

public class Fan {

	private String maker;
	private double radious;
	private String color;
	
	//We can use getter and setter for more flexibility
	//Suppose after creating object someOne want to change the state.
	boolean isOn;
	private byte speed;
	
	public Fan(String maker,double radious,String color){
		   this.maker=maker;
		   this.radious=radious;
		   this.color=color;
	}
	
	public void switchOn(){
		this.isOn=true;
		this.speed=5;
	}
	
	public void switchOff(){
		this.isOn=false;
		this.speed=0;
	}
	
	public void adjustSpeedTo(byte speed){
		this.speed=speed;
	}
	
	//Using String formatter is best practice rather than using String concatenation operator.
	
	@Override
	public String toString(){
		return String.format("maker - %s\t radious-%f \t color-%s \t speed- %d \t  State-%b ",maker,radious,color,speed,isOn);
	}
	
}
