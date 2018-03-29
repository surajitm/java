package my.java.oops;

/*
 * super class can hold subclass 
 * If it's overriding situation then it can override the sub class
 * Otherwise it can not access other method of subclass.
 */



public class OverridePuzzle {
	
	public static void main(String args[]){
		 
		AllAnimal animal=new AllAnimal();
		animal.say();
		AllAnimal dog=new AllDog();
		dog.say();
		
		AllAnimal cat=new AllCat();
		cat.say();
		
	}
	
}

class AllAnimal{
	void say(){
		System.out.println("Nothing to say");
	}
}

class AllDog extends AllAnimal{
	void say(){
		System.out.println("wow! wow!");
	}
	void tellYourName(){
		System.out.println("Tommy");
	}
}


class AllCat extends AllAnimal{
	void say(){
		System.out.println("mew! mew!");
	}
}