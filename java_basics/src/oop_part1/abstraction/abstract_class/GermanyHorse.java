package oop_part1.abstraction.abstract_class;

public sealed abstract class GermanyHorse extends Animal permits Horse{

	public GermanyHorse(String animalClass, String animalSpecies) {
		super(animalClass, animalSpecies);
		// TODO Auto-generated constructor stub
	}
	
	abstract void run();
	
	abstract void jump();

}
