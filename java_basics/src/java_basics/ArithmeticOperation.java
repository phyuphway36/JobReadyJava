package java_basics;

public class ArithmeticOperation {
	
	static double e =  2.72;
	double opSample1 = 100;
	double opSample2 = 200;
	
	void divide(double operand1 , double operand2) {
	if(operand2 == 0) {
		System.out.println("operand 2 is 0.cant done division");
		return;
	}
	System.out.println(operand1/operand2);
	
}
	
	static void description() {
	System.out.println("This class is to perform arithmetic operation");
}

	
	static void getEValue() {
		System.out.println(e);
		System.out.println(getPiValue());
	}
	
	//write only
	//Instance method
	void addSample (double op1, double op2) {
		if(op1 == 0.0 && op2 != 0.0 )
			System.out.println(add(op1,op2));
		else
			System.out.println(opSample1 +opSample2);
		
		System.out.println(getPiValue());
		System.out.println(e);
		
		
	}
	//Instance method
	//Read write method
	double add(double operand1,double operand2) {
		System.out.println("Inside three double method");
		return operand1+operand2;
		
	}
	//overload method2
	int add(int op1,int op2) {
		System.out.println("Inside two int method");
		return(op1+op2);
	}
	//overload method1
	double add(double operand1,double operand2,double operand3) {
		return (operand1+operand2+operand3);
	}
	
	double add(boolean check, double... operands) {
		double result = 0;
		for (double operand :operands)
			result += operand;
		return result;
	}
//	double add(double[] operands) {
//		double result = 0;
//		for (double operand :operands)
//			result += operand;
//		return result;
//	}
	//read only method
	static double getPiValue() {
		return 3.142;
	}
}

//	static void getEvalue() {
//		
//		System.out.println(e);
//		System.out.println(getPiValue());
//		
//		//add(23.44,56.78);
//		double add(double operand1 , double operand2) {
//			System.out.println("Inside two double method");
//			return (operand1 + operand2);
//		
//		}
////		double add(double[] operands) {
////			double result = 0;
////			for(double temp: operands)
////				result += operand;
////			return result;
////		}
//		
//		//overload method2
//		int add(int op1,int op2) {
//			return (op1+op2);
//		}
//		//overload method1
//		double add(double op1,double op2,double op3) {
//			return (op1+op2+op3);
//		}

//	}
//	
//	
//	//write only
//	//Instance method
//	void addSample (double op1, double op2) {
//		if(op1 == 0.0 && op2 !=0.0 )
//			System.out.println(add(op1,op2));
//		else
//			System.out.println(opSample1 +opSample2);
//		
//		System.out.println(getPivalue());
	
//	}

//	
//	//Instance method
//	//Read,Write method
//	double add(double operand1,double operand2) {
//		return (operand1 + operand2) ;
//	}
//	//read only method
//	static double getPiValue() {
//		return 3.142;
//	}
//
//	public char[] add(double[] add1) {
//		// TODO Auto-generated method stub
//		return null;
	


