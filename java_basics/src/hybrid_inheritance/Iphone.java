package hybrid_inheritance;

public class Iphone extends SmartPhone{

	@Override
	void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("Iphone can send message with large screen.");
	}
	
	@Override
	void takeSelfie() {
		// TODO Auto-generated method stub
		System.out.println("Iphone camera is so beautiful.");
	}
	
	void size() {
		System.out.println("Iphone's size is big.");
	}

}
