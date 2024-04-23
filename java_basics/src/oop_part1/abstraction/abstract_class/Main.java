package oop_part1.abstraction.abstract_class;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Animal dog = new Dog("Mamal","Husky");
//		dog.makeSound();
//		dog.eat();
//		dog.walk();
//		
//		System.out.println(dog.getAnimalClass());
//		System.out.println(dog.getAnimalSpecies());
//		System.out.println(Animal.livingThing);
//		Animal.defineSize(100);
		
		GermanyHorse horse = new Horse("Mamal","GermanyHorse");
		horse.run();
		horse.jump();
		horse.makeSound();
		horse.eat();
		horse.walk();
		System.out.println(horse.getAnimalClass());
		System.out.println(horse.getAnimalSpecies());
		
	}

}
