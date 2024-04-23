package oop_part1.abstraction_abstract_class;

public final class Dog extends Animal{
	
	public Dog(String animalClass, String animalSpecies) {
		super(animalClass, animalSpecies);
		// TODO Auto-generated constructor stub
	}

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
