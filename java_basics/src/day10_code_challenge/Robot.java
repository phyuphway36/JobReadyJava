package day10_code_challenge;

public class Robot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robot = new Robot();
		robot.delay();
		robot.keyPress(1);

	}
	static void delay() {
		System.out.println("Robot delay 10s");
	}
	
	static void keyPress(int keykode) {
		System.out.println("Press given key");
	}

}
