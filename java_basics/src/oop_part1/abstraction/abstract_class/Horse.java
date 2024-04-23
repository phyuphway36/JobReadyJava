package oop_part1.abstraction.abstract_class;

public final class Horse extends GermanyHorse{

	public Horse(String animalClass, String animalSpecies) {
		super(animalClass, animalSpecies);
		// TODO Auto-generated constructor stub
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Horse can run");
		
	}

	@Override
	void jump() {
		// TODO Auto-generated method stub
		System.out.println("Horse can jump");
		
	}

	@Override
	protected void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Hee...Hee...");
		
	}

	@Override
	protected void eat() {
		// TODO Auto-generated method stub
		System.out.println("Grass");
		
	}

	@Override
	protected void walk() {
		// TODO Auto-generated method stub
		System.out.println("Horse walk like horse");
		
	}

}
