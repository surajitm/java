package my.java.data.type;
import java.math.*;
public class BigDecimalExlore {

	/*
	 * For comparing two object we can use x.compareTo(y)
	 * 
	 * (x>y): 1
	 * (x==y): 0
	 * (x<y): -1
	 * 
	 */
	
	
	
	public static BigDecimal add(String num1,String num2){
		BigDecimal n1=new BigDecimal(num1);
		BigDecimal n2=new BigDecimal(num2);
		return n1.add(n2);
	}
	
	public static BigDecimal sub(String num1,String num2){
		BigDecimal n1=new BigDecimal(num1);
		BigDecimal n2=new BigDecimal(num2);
		return n1.subtract(n2);
	}
	
	
	public static BigDecimal mul(String num1 , String num2){
		BigDecimal n1=new BigDecimal(num1);
		BigDecimal n2=new BigDecimal(num2);
		return n1.multiply(n2);
	}	
	
	
	public static BigDecimal div(String num1,String num2){
		BigDecimal n1=new BigDecimal(num1);
		BigDecimal n2=new BigDecimal(num2);
		return n1.divide(n2);
	}
		
	
	public static BigDecimal fact1(BigDecimal num){
		if(num==BigDecimal.ZERO){
			return BigDecimal.ONE;
		}
		return num.multiply(fact1(num.subtract(BigDecimal.ONE)));
	}
	
	public static BigDecimal max(String num1,String num2){
		BigDecimal n1=new BigDecimal(num1);
		BigDecimal n2=new BigDecimal(num2);
		
		if(n1.compareTo(n2)==0){
			System.out.println("Both are equal.");
			return n1;
		}
		
		if(n1.compareTo(n2)>0){
			return n1;
		}else{
			return n2;
		}
		
	}
	
	//Exersize: use bigdecimal to calculate factorial by iteration.
	
	
	
	
	public static void main(String args[]){
		BigDecimal res=max("10","10");
		BigDecimal fact=fact1(new BigDecimal("40"));
		
		System.out.println(res.toString());
		System.out.println(fact.toString());
	}
	
}
