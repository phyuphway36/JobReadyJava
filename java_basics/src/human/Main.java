package human;

public class Main {
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

}
