package oop_part1.abstraction.interface_test;

public sealed interface SmartPhone extends BionicChip permits IPhone13{
	
	 String SCREEN_TYPE = "Touch Screen";
	
	void shutdown();
	void restart();
	void canPlayGame();
	void canUseSociallMedia();
//	void fingerprint();
	
	static void description() {
		System.out.println("Parent interface for all smartPhone.");
	}
	
	private void AISystem() {
		
		System.out.println("Apple Advanced AI System");
		}
	
	default void AIFeatures() {
		AISystem();
		System.out.println("Added AIFeatures ");
	}
	
	default void CameraAI() {
		AIFeatures();
		System.out.println("Added CameraAI ");
	}
	default void VideoAI() {
		AIFeatures();
//		System.out.println("Apple Advanced AI System");
		System.out.println("Added VideoAI ");
	}
	default void fingerprint() {
		System.out.println("Added fingerprint system");
	}
	
//	 @Override
//		default void processCPU() {
//			// TODO Auto-generated method stub
//		 System.out.println("SmartPhone can perform CPU process");
//			
//		}
//		 
//		 @Override
//		default void processGPU() {
//			// TODO Auto-generated method stub
//			 System.out.println("SmartPhone can perform GPU process");
//			
//		}
//		

}
