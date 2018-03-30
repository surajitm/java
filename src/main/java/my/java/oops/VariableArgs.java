package my.java.oops;

import java.util.Arrays;

public class VariableArgs {

	
	//Variable arguments
	public void sum(int... values){
		System.out.println(Arrays.toString(values));
	}
	
	public static void main(String args[]){
		VariableArgs arg=new VariableArgs();
		arg.sum(1);
		arg.sum(1,2);
		arg.sum(1,2,3);
		
	}
	
	
	
	
}
