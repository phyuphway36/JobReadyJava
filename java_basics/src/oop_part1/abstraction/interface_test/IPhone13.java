package oop_part1.abstraction.interface_test;

//interface phit loz extends lote lo ma ya
public final class IPhone13 extends AppleEcoSystem implements SmartPhone,LeciaCamera{

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("IPhone13 is shuting down");
		
	}

	@Override
	public void restart() {
		// TODO Auto-generated method stub
		System.out.println("IPhone13 is restarting.");
		
	}//override  ka same method ma ya 

	@Override
	public void canPlayGame() {
		// TODO Auto-generated method stub
		System.out.println("Can play games on IPhone13");
		
	}

	@Override
	public void canUseSociallMedia() {
		// TODO Auto-generated method stub
		System.out.println("Can use social media on IPhone13");
		
	}
	
	@Override
	public void AIFeatures() {
//		// TODO Auto-generated method stub
//		SmartPhone.super.AIFeatures();
		LeciaCamera.super.AIFeatures();
		System.out.println("IPhone13 AIFeatures");
		SmartPhone.super.AIFeatures();
	}
	
	@Override
	public void CameraAI() {
//		// TODO Auto-generated method stub
//		SmartPhone.super.CameraAI();
		System.out.println("IPhone13 Camera AI");
	}
	
	@Override
	public void VideoAI() {
//		// TODO Auto-generated method stub
		SmartPhone.super.VideoAI();
		System.out.println("HDR with IPhone 13 AI assist.");
	}
	
	@Override
	public void fingerprint() {
		// TODO Auto-generated method stub
		//SmartPhone.super.fingerprint();
		System.out.println("Under screen fingerprint");
	}

	@Override
	public void processCPU() {
		// TODO Auto-generated method stub
		System.out.println("IPhone13 can process CPU OP");
		
	}

	@Override
	public void processGPU() {
		// TODO Auto-generated method stub
		System.out.println("IPhone13 can process GPU OP");

		
	}

	@Override
	public void sharpImage() {
		// TODO Auto-generated method stub
		System.out.println("IPhone13 with Lecia cann shot sharpImage");
		
	}

	@Override
	public void FourKVideo() {
		// TODO Auto-generated method stub
		System.out.println("IPhone13 with Lecia can perform 4K video KP");
		
	}

	@Override
	void appleLogo() {
		// TODO Auto-generated method stub
		System.out.println("Show apple logo");
	}

	@Override
	void expensive() {
		// TODO Auto-generated method stub
		System.out.println("Super Expensive");
		
	}
	
	
	

}
