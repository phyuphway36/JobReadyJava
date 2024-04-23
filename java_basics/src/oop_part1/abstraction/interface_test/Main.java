package oop_part1.abstraction.interface_test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SmartPhone sm = new SmartPhone();//di lo ma ya

		SmartPhone iPhone13 = new IPhone13();
//		iPhone13.shutdown();
//		iPhone13.canPlayGame();
//		iPhone13.canUseSociallMedia();
//		iPhone13.AIFeatures();
//		iPhone13.restart();
		
//		System.out.println(SmartPhone.SCREEN_TYPE);
//		SmartPhone.description();
//		iPhone13.AIFeatures();
//		iPhone13.CameraAI();
//		iPhone13.VideoAI();
//		iPhone13.fingerprint();
//		iPhone13.processCPU();
//		iPhone13.processGPU();
		
//		if(iPhone13 instanceof IPhone13) {
//		LeciaCamera leciaCamera = (LeciaCamera) iPhone13;
//		leciaCamera.sharpImage();
//		leciaCamera.FourKVideo();
//		leciaCamera.restart();
//		leciaCamera.AIFeatures();
//		}
		
		if(iPhone13 instanceof IPhone13) {
			AppleEcoSystem aes = (AppleEcoSystem) iPhone13;
			aes.appleLogo();
			aes.expensive();
		}
	}

}
