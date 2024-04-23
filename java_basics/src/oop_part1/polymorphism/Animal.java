package oop_part1.polymorphism;

public /*finall */class Animal {
//	private Animal() {} //instance off
//	
//	Animal(String arg){
//		System.out.println("Inside animal no args constructor");
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
	protected void makeSound() {
		System.out.println("Guu Guu Gar Gar");
		}
	
	protected void eat() {
		System.out.println("Eatable Foods");
		}
	
	protected void walk() {
		System.out.println("Animal is walking");
		}

	final void controlDNA() {//final = not control child class by overriding
		System.out.println("Animal control DNA of Child Animal");
	}
	
	private void hideFantasticBeats() {
		System.out.println("Wizard hide fantastic beats.");
	}

	final void animalMyth() {//not direct
		hideFantasticBeats();
	}

}
