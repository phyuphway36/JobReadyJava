package herichical_inheritance;

public class Singer extends Person{

	@Override
	void work() {
		// TODO Auto-generated method stub
		System.out.println("Singer is workin");
	}
	@Override
	void eat() {
		// TODO Auto-generated method stub
	System.out.println("Singer should eat crackers");
	}
	
	void singing() {
		System.out.println("Happily singing");
	}
}
