package my.java.oops;

public class CricketerSimpleClass {

	public static void main(String[] args) {
		Cricketer Sourav=new Cricketer();
		Sourav.hitSix();
		Sourav.hitFour();
		Sourav.hitFour();
		System.out.println("Run hit by Sourav:"+Sourav.getScore());
		
		
		Cricketer Sachin =new Cricketer();
		Sachin.hitFour();
		Sachin.hitFour();
		System.out.println("Run hit by Sachin:"+Sachin.getScore());
		
		
	}
	
	
}



class Cricketer{
	
	private int run=0;
	
	
	public void hitSix(){
		run+=6;
	}
	
	public void hitFour(){
		run+=4;
	}
	
	public int getScore(){
		return run;
	}
}

