package oop_part1.abstraction_abstract_class;

public final class Cat extends Animal{
	
	public Cat(String animalClass, String animalSpecies) {
		super(animalClass, animalSpecies);
		// TODO Auto-generated constructor stub
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
}
