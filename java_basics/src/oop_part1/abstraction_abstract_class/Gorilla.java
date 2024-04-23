package oop_part1.abstraction_abstract_class;

public non-sealed class Gorilla extends Animal{
	
	public Gorilla(String animalClass, String animalSpecies) {
		super(animalClass, animalSpecies);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void makeSound() {
		// TODO Auto-generated method stub
        System.out.println("Guu Guu Gar Gar");	}

	@Override
	protected void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void walk() {
		// TODO Auto-generated method stub
		
	}
	
}
