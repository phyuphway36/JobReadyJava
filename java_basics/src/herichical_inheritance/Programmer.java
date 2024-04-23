package herichical_inheritance;

public class Programmer extends Person{

	@Override
	void work() {
		// TODO Auto-generated method stub
		System.out.println("Programmer is working");
	}
	@Override
	void eat() {
		// TODO Auto-generated method stub
	System.out.println("Programmer like coffee");
	}
	
	void coding() {
		System.out.println("Programmer is Coding");
	}
}
