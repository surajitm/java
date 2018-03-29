package my.java.project2;


/*
 * 
 * Calculate Sum of all marks
 * Calculate no of marks
 * Calculate average of all marks.
 */



public class MarksDashBoard {

	public static void main(String args[]){
		
		
		System.out.println("No. Of Marks\tSUM\t\tAVG");
		System.out.println("----------------------------------------------------");
		
		int marks[]={60,40,80,30,20,50};
		Student sam=new Student("Sam",marks);
		Student.showStudentDetail(sam);
		
		int marks1[]={80,80,80,90,60};
		Student ram=new Student("Ram",marks1);
		Student.showStudentDetail(ram);
		
		
	}
	
	
}
