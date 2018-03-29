package my.java.Arrays.ArrayList;

import java.util.Arrays;

class Person{
	Person(){
		
	}
}


public class PrintArray {

	public static void main(String args[]){
		int arr[]=new int[5];
		System.out.println(Arrays.toString(arr));
		arr[2]=100;
		System.out.println(Arrays.toString(arr));
		
		//with user defined type
		Person person[]=new Person[5];
		System.out.println(Arrays.toString(person));
		
	}
	
	
	
}
