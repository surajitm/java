package my.java.Assignment3;

public class DayOfWeek {

	private static final String dayOfWeek[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	
	String getDayWithMostNumberOfLetters(){
		String maxDay="";
		int maxLen=Integer.MIN_VALUE;
		int len=0;
		for(String day:dayOfWeek){
			len=day.length();
			if(len>maxLen){
				maxLen=len;
				maxDay=day;
			}
		}
		System.out.println("Length:"+maxLen);
		return maxDay;
	}
	
	void printDaysOfWeekBackword(){
		int len = dayOfWeek.length-1;
		for(int i=len;i>=0;i--){
			System.out.print(dayOfWeek[i]+" ");
		}
	}
	
	
	public static void main(String args[]){
		DayOfWeek weekday=new DayOfWeek();
		String maxDay=weekday.getDayWithMostNumberOfLetters();
		System.out.println(maxDay);
		weekday.printDaysOfWeekBackword();
	}
	
}
