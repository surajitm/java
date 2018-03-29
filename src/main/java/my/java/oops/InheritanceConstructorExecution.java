package my.java.oops;

/*
 * By default subclass constructor call super class constructor.
 * super() which will be the first statement to be executed by subclass contsructor.
 */



public class InheritanceConstructorExecution {

	public static void main(String[] args) {
		C c=new C(123);
	}
}


class A{
	A(){
		//super();
		System.out.println("I am in class A");
	}
}

class B extends A{
	B(){
		//super();
		System.out.println("I am in class B");
	}
}

class C extends B{
	int id;
	C(int id){
		//super();
		this.id=id;
		System.out.println(id);
		System.out.println("I am in class C");
	}
}