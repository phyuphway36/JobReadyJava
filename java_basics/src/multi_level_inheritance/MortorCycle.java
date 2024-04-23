package multi_level_inheritance;

public class MortorCycle extends Vehicle{

	@Override
	void hasEngine() {
		// TODO Auto-generated method stub
		System.out.println("Two stroke engine is used for motorcycle.");
	}
	
	@Override
	void hasWheel() {
		// TODO Auto-generated method stub
		System.out.println("MotorCycle has two wheels");	
		}
	
	void brake() {
		System.out.println("MotorCycle can brake with hand and leg");
	}
}
