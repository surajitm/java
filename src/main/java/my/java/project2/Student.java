package my.java.project2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Student {

	private String name;
	private int[] marks;
	
	public Student(String name,int[] marks){
		this.name=name;
		this.marks=marks;
	}
	
	public int getNumberOfMarks(){
		return marks.length;
	}
	
	public int getTotalSumOfMarks(){
		int sum=0;
		for(int mark:marks){
			sum+=mark;
		}
		return sum;
	}
	
	public int getMaximumMark(){
		int max=Integer.MIN_VALUE;
		for(int mark:marks){
			if(mark>max){
				max=mark;
			}
		}
		return max;
	}
	
	public int getMinimumMark(){
		int min=Integer.MAX_VALUE;
		for(int mark:marks){
			if(mark<min){
				min=mark;
			}
		}
		return min;
	}
	
	public void getAllMarks(){
		System.out.println(Arrays.toString(marks));
	}
	
	public BigDecimal getAverageMarks(){
		
		BigDecimal sum=new BigDecimal(getTotalSumOfMarks());
		BigDecimal n=new BigDecimal(getNumberOfMarks());
		BigDecimal avg=sum.divide(n,3,RoundingMode.HALF_UP);
		
		return avg;
	}
	
	public static void showStudentDetail(Student student){
		System.out.println(student.getNumberOfMarks()+"\t\t"+student.getTotalSumOfMarks()+"\t\t"+student.getAverageMarks());
	}
	
	
	
	
}
