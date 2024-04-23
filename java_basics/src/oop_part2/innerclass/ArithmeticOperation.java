package oop_part2.innerclass;

public class ArithmeticOperation {
	static int staticOutter1;
	private double operand1;
	private double operand2;
	
	static void staticOutterMethod1() {
		
	}
	public ArithmeticOperation(double operand1, double operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	
	//non-static nested class
	//encapsulation - strong
	private class Addition {
		static final int CONSTANT = 100;
		static int static1 = 200;
		int instance1;
		int instance2;
		public Addition() {
			// TODO Auto-generated constructor stub
		}
		
		static void staticMethod() {
			
		}
		void instanceMethod() {}
		
	
	double add() {
		System.out.println(staticOutter1);
		staticOutterMethod1();
		instanceOutter1();
		return operand1 + operand2;
		
	}
	}
	
	void instanceOutter1() {
		
	}
	double getAdditionResult() {
		Addition addition = new Addition();
		return addition.add();
	}
	

}

