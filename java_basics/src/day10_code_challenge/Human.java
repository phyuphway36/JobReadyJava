package day10_code_challenge;

public class Human {
	public static void main(String[] args) {
		Human human = new Human();
		human.name="myamya";
		human.height = 6;
		
		System.out.println("Name is "+human.name);
		System.out.println("Height is "+human.height);
		human.eat();
		human.walk();
		human.work();
	
	}
	String name;
	int height;
	
	
	public void eat() {
		
		System.out.println("Noodle");
	}
		
	public void walk() {
			System.out.println("Human can walk.");
	}
			
	public void work() {
		    System.out.println("Human can work.");
		
		
	}

}