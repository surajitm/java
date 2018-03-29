package my.java.output.puzzle;

//Overloading puzzle

public class Basic3 {

	public static void foo(Object o){
		System.out.print("Object");
	}
	
	public static void foo(String s){
		System.out.print("String");
	}
	
	public static void main(String args[]){
		foo(null);
	}
	
}


