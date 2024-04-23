package java_basics;

public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticOperation ao1 = new ArithmeticOperation();
		double result = ao1.add(20.44,89.7);//method invocation
		System.out.println(result);
		
		double pi=ArithmeticOperation.getPiValue();
		System.out.println(pi);
		System.out.println(ao1.getPiValue());//ma thone nae
		
		ArithmeticOperation ao2 = new ArithmeticOperation();
		double result1 = ao2.add(12.99, 34.09);
		System.out.println(result1);
//		ao3.divide(pi, result1);
//		ao3.addSample(100, 0);
		
//		ArithmeticOperation ao3 = new ArithmeticOperation();
		ArithmeticOperation ao3 = new ArithmeticOperation();
		double[] add1 = {89.09,87.7,56.45,34.67,67.89};
		double[] add2 = {89.09,87.7,56.45,34.67};
//		double[] addNot = {};
		System.out.println(ao3.add(true,add1));
		System.out.println(ao3.add(true,add1));
		System.out.println(ao3.add(true));
		System.out.println(ao3.add(true,20.0,30.0,40.0,50.0,60.0,70.0));
		
	
		
		//Overloading
		

		
		System.out.println(ao3.add(20.33, 30.77,34.67));
		System.out.println(ao3.add(50.55, 23.78));
		System.out.println(ao3.add(200, 300));


	}

}
