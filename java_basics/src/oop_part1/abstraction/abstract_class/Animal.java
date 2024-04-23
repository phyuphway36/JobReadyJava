package oop_part1.abstraction.abstract_class;

public sealed abstract class Animal permits Cat,Dog,GermanyHorse,Gorilla{
	static boolean livingThing = true;
	private String animalClass;
	private String animalSpecies;
	
	

	
	public Animal(String animalClass, String animalSpecies) {
		super();
		this.animalClass = animalClass;
		this.animalSpecies = animalSpecies;
	}

	protected abstract void makeSound(); 
	
	protected abstract void eat();
	
	protected abstract void walk();

	public String getAnimalClass() {
		return animalClass;
	}

	public void setAnimalClass(String animalClass) {
		this.animalClass = animalClass;
	}

	public String getAnimalSpecies() {
		return animalSpecies;
	}

	public void setAnimalSpecies(String animalSpecies) {
		this.animalSpecies = animalSpecies;
	}
	
	static void defineSize(int pound) {
		if(pound <= 1)
			System.out.println("Too small");
		else if(pound > 1 && pound <= 100)
			System.out.println("Normal Size");
		else
			System.out.println("Too big");
	}



}
