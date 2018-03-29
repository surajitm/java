package my.java.oops;

/*
 * toString() method one of methods provided by the object class.
 * Basically if helps to print the content of the object.
 * 
 * If any class is extending the Object class can override the toString() method.
 * 
 */


public class ToStringLegacy {

	public static void main(String[] args) {
		Actor sharukh=new Actor("Sharukh");
		System.out.println(sharukh);
		
		Actor tom=new Actor("Tom Cruiz");
		System.out.println(tom);
	}
	
}


class Actor{
	String name;
	
	public Actor(String name) {
		this.name=name;
	}
	@Override
	public String toString(){
		return name;
	}	
	
}