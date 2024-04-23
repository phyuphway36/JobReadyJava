package single_inheritance;

public class Bulb extends Electronic{
	
	@Override
	void charged() {
		System.out.println("When 1 hour charging, bulb is fulled.");
	}

	void makedLight() {
		System.out.println("Bulb is lighting...");
	}
	
}
