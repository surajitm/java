package my.java.Assignment4;

public class App {
  public static void main(String args[]){
	  Fan fan=new Fan("Manufacturer1",120.08,"Brown");//All the number literal by default integer
	  System.out.println(fan);
	  fan.adjustSpeedTo((byte)5);
	  fan.switchOn();
	  System.out.println(fan);
	  
  }
}
