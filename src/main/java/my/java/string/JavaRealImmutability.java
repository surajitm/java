package my.java.string;

public class JavaRealImmutability {

	
	public static void main(String[] args) {
		
		Age1 age=new Age1();
		age.setDay(10);
		age.setMon(12);
		age.setYear(1989);
		Student1 s1=new Student1("Shiva", "1", age);
		System.out.println(s1);
		age.setYear(1990);
		System.out.println(s1);
	}
}


final class Student1{
	private final String name;
	private final String id;
	private final Age age;
	
	
	
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", id=" + id + ", age=" + age + "]";
	}



	public String getName() {
		return name;
	}



	public String getId() {
		return id;
	}



	public Age getAge() {
		Age cloneAge=new Age();
		cloneAge.setDay(this.age.getDay());
		cloneAge.setMon(this.age.getMon());
		cloneAge.setYear(this.age.getYear());
		
		return cloneAge;
	}



	public Student1(String name,String id,Age1 age2) {
		this.name=name;
		this.id=id;
		Age cloneAge=new Age();
		cloneAge.setDay(age2.getDay());
		cloneAge.setMon(age2.getMon());
		cloneAge.setYear(age2.getYear());
		this.age=cloneAge;
	}
	
	
}



class Age1{
	
	int day;
	int mon;
	int year;
	
	
	@Override
	public String toString() {
		return "Age1 [day=" + day + ", mon=" + mon + ", year=" + year + "]";
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMon() {
		return mon;
	}
	public void setMon(int mon) {
		this.mon = mon;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}