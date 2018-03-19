package my.java.string;

//Java immutability


public class JavaImmutability {

	
	public static void main(String[] args) {
		Age age=new Age();
		age.setDay(10);
		age.setMon(12);
		age.setYear(1990);
		
		Student s1=new Student("Shiva", "0", age);
		System.out.println(s1);
		
		//Let's test immutability
		age.setYear(1991);
		System.out.println(s1);
	}
	
}

//Immutable class
final class Student{
	
	private final String name;
	private final String id;
	private final Age age;
	
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + "]";
	}


	public String getName() {
		return name;
	}


	public String getId() {
		return id;
	}


	public Age getAge() {
		return age;
	}


	public Student(String name, String id,Age age) {
		this.name=name;
		this.id=id;
		this.age=age;
	}
	
}


//Mutable class
class Age{
	
	private int day;
	private int mon;
	private int year;
	
	
	
	@Override
	public String toString() {
		return "Age [day=" + day + ", mon=" + mon + ", year=" + year + "]";
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

