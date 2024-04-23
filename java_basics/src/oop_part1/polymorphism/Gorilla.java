package oop_part1.polymorphism;

public class Gorilla extends Animal{
	
//	Gorilla(String arg) {
//		super(arg);
//		// TODO Auto-generated constructor stub
//	}
//
	@Override
	protected void makeSound() {
		// TODO Auto-generated method stub
		super.makeSound();
	}
	
	@Override
		protected void eat() {
			// TODO Auto-generated method stub
			System.out.println("Gorrila eat banana");
		}
	
	@Override
		protected void walk() {
			// TODO Auto-generated method stub
			System.out.println("Gorrila walk kyata");		}
}
