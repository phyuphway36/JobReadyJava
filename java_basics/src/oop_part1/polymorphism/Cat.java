package oop_part1.polymorphism;

import java.util.ResourceBundle.Control;

public class Cat extends Animal{
//	
//	Cat(String arg) {
//		super(arg);
//		// TODO Auto-generated constructor stub
//	}

	static void defineSize(int pound) {
		System.out.println("Inside animal define size");
		if(pound <= 1)
			System.out.println("Too small");
		else if(pound >1 && pound <= 10)
			System.out.println("Normal size");
		else
			System.out.println("Too big");
	}
	@Override //compiler flag
	protected void makeSound() {
		System.out.println("Meow Meow");	
		}

	@Override
	protected void eat() {
		System.out.println("FriedFish");
	}
	
	@Override
	protected void walk() {
		System.out.println("Cat walks like model");
	}
	//custom method call
	void scratch() {
		System.out.println("Cat scrapt Board.");
	}
//	@Override
//	private void controlDNA() {
//		// TODO Auto-generated method stub
//		System.out.println("Cat can control DNA");
//
//	}
//	@Override //can't ovverride
	private void hideFantasticBeats() {
		System.out.println("Wixard hide fantastic beats..");
	}
	
}



