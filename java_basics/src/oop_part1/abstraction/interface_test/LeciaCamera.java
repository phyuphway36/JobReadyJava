package oop_part1.abstraction.interface_test;

public interface LeciaCamera {
	void sharpImage();
	void FourKVideo();
	
	void restart();
		
	default void AIFeatures() {
		System.out.println("Added Lecia AI Features");
	}
	

}
