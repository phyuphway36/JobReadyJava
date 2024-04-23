package java_practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arithmetic a1 = new Arithmetic();
		double result =a1.subtract(40.0, 30.0);
		
		System.out.println(result);
		
		
		double result1 = Arithmetic.multiply(20.0, 30.0);
		System.out.println(result1);
	}

}
