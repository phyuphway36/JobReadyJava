package oop_part2.innerclass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArithmeticOperation ao1 =new ArithmeticOperation(50.0,60.0);
		System.out.println(ao1.getAdditionResult());
		
		// field - additionResult
		
//		ArithmeticOperation.Addition addition = ao1.new Addition();//non static nested class's obj
//		System.out.println(addition.add());

	}

}
