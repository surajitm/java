package my.java.output.puzzle;

public class Basic4 {

	public static void foo(String s){
		System.out.print("String");
	}
	
	public static void foo(Object a){
		System.out.print("Object");
	}
	
	public static void foo(Integer a){
		System.out.print("Integer");
	}
	
	public static void main(String args[]){
		//foo(null);//ambiguous type {String,Integer}
	}
	
}
