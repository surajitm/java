package my.java.string;

/*
 * Wrapper class basically wraps around primitive datatype and gives it a object appearance.
 * Reason for use:
 *  1.null is a possible value for usage.
 *  2.Use it in a collection.
 *  3.Type convertion - String to integer conversion
 */



public class WrapperClass {

	public static void main(String[] args) {
		
		//Creating direct wrapper class
		Integer i=new Integer("100");
		System.out.println(i);
		
		//Creating wrapper class using static method
		Integer i1=Integer.valueOf("100");
		System.out.println(i1);
		i1=Integer.valueOf("200");//return cached value
		System.out.println(i1); //For long it return (-128 to 127)
		
		//Converting decimal to binary
		Integer i3=Integer.valueOf("111", 2);
		System.out.println(i3);
		Integer ii=new Integer("10");
		ii++;
		
		
		
		
	}
	
}
