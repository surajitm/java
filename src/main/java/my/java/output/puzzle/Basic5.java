package my.java.output.puzzle;

public class Basic5 {
     public static void main(String args[]){
    	 new T3();
     }
}

class T1{
	public T1(){
		System.out.println("I am in T1");
	}
}

class T2 extends T1{
	public T2(){
		System.out.println("I am in T2");
	}
}

class T3 extends T2{
	public T3(){
		System.out.println("I am in T3");
	}
}