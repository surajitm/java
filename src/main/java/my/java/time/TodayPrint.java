package my.java.time;

import java.time.*;

public class TodayPrint {

	private  LocalDate today;
	
	public TodayPrint(){
		today=LocalDate.now();
	}
	
	public   int getToDayDay(){
		return today.getDayOfMonth();
	}
	
	public  int getTodayMonth(){
		return today.getMonth().getValue();
	}
	
	public  int getTodayYear(){
		return today.getYear();
	}
	
	public String getDayOfWeek(){
		return today.getDayOfWeek().toString();
	}
	
	
	public static void main(String args[]){
		TodayPrint today=new TodayPrint();
		System.out.println("Date:"+today.getToDayDay()+"/"+today.getTodayMonth()+"/"+today.getTodayYear());
		System.out.println("Today is:"+today.getDayOfWeek());
	}
	
}
