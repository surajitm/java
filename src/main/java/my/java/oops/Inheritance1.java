package my.java.oops;

public class Inheritance1 {

	public static void main(String[] args) {
		Animal ani=new Dog(4,2);
		ani.myAnimal();
		Dog dog=new Dog(4,2);
		dog.myAnimal();
		dog.myDog();
	}
	
}


class Animal{
	int leg;
	int eye;
	
	public Animal(int leg,int eye) {
		this.leg=leg;
		this.eye=eye;
	}
	
	public void myAnimal(){
		System.out.println("This is my animal");
	}
	
}


class Dog extends Animal{

	public Dog(int leg, int eye) {
		super(leg, eye);
		
	}
	
	@Override
	public String toString() {
		return "leg:"+leg+","+"eye:"+eye;
	}
	
	public void myDog(){
		System.out.println("This is my dog.");
	}
	
}


