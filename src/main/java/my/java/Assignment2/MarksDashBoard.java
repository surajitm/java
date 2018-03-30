package my.java.Assignment2;


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
		
		//We can pass using inline
		//Right click -> Refactor -> inline
		Student ram=new Student("Ram",new int[] {80,80,80,90,60});
		Student.showStudentDetail(ram);
		
		
	}
	
	
}
