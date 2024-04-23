package hybrid_inheritance;

public class Huawei extends SmartPhone{
	@Override
	void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("Huawei can send message easily");
	}
	
	@Override
	void takeSelfie() {
		// TODO Auto-generated method stub
		System.out.println("Huawei takes selfie .");
	}

	void heavyDuty() {
		System.out.println("Huawei is heavyDuty.");
	}
}
