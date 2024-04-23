package oop_part1.polymorphism;

public class Dog extends Animal{
//	Dog
//	(String arg) {
//		super(arg);
//		// TODO Auto-generated constructor stub
//	}

	@Override
	protected void makeSound() {
		System.out.println("Wote Wote");
	}
	
	@Override
	protected void eat() {
		System.out.println("Meat");	
		}
	
	@Override
	protected void walk() {
		System.out.println("Dogs walks lazy ");
	}
	
	void bite() {
		System.out.println("Dog can bite");
	}

}
