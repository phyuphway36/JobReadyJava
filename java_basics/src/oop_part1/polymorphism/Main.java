package oop_part1.polymorphism;

import java_basics.MathTest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Benefit - Generalized -> Flexible
//		Animal animal = new Animal(String args);
//		animal.makeSound();
		Animal cat = new Cat();
//		cat.defineSize(100);
//		((Cat)cat).defineSize(30);
		Animal.defineSize(2);
		cat.defineSize(5);
		cat.controlDNA();
		cat.animalMyth();
		
		
//		 Animal gorilla = new Gorilla();
//		 gorilla.makeSound();
		 
//		Animal cat = new Cat();//Upcasting
//		cat.makeSound();
//		cat.eat();
//		cat.walk();
//		
//		Cat originalCat = (Cat) cat;
//		originalCat.scratch();
		
		
		//type safety check - instanceof
//		if(cat instanceof Dog)
//			((Dog)cat).bite();
//		else
//			System.out.println("Dude You cannot change Cat to Dog");
		
//		((Cat)cat).scratch();
		
	//		Animal dog = new Dog();
//		dog.makeSound();
//		dog.eat();
//		dog.walk();
//		
//		if(dog instanceof Dog)
//			((Dog)dog).bite();
//		else
//			System.out.println("You cannot change into Dog");
		
		
//		addAnimalToZoo(cat);
//		addAnimalToZoo(dog);
//		addAnimalToZoo(gorilla);
//
//	}
//	static void addAnimalToZoo(Animal animal) {
//		if(animal instanceof Cat) {
//			System.out.println("Added Cat into Zoo");
//			System.out.println(animal);
//		}
//		
//		if(animal instanceof Dog) {
//			System.out.println("Added Dog into Zoo");
//			System.out.println(animal);
//		}
//		
//		if(animal instanceof Gorilla) {
//			System.out.println("Added Gorrila into Zoo");
//			System.out.println(animal);
//		}
//		
	}

}
