package lambda;

public interface ExpressionLambdaTest {
	
		public static void main(String[] args) {
		
			//Addition
			Calculatable addition = (op1,op2) -> op1 + op2;
			System.out.println("Addition: "+ addition.calculate(30,50));
			
			Calculatable subtraction = (op1,op2) -> op1- op2;
			System.out.println("Subtraction : "+ subtraction.calculate(100, 60));
			
			Calculatable multiplication = (op1,op2) -> op1 * op2;
			System.out.println("Multiplication : "+ multiplication.calculate(100, 60));
			
			Calculatable division = (op1,op2) -> (op2!=0)?op1/op2:0;
			System.out.println("Division : "+ division.calculate(100, 60));
			
			Calculatable modulo = (op1,op2) -> op1 % op2;
			System.out.println("Modulo : "+ modulo.calculate(100, 60));
			
			Calculatable max = (op1,op2) -> (op1> op2)?op1:op2;
			System.out.println("Max : "+ max.calculate(100, 60));
			
			Calculatable min = (op1,op2) -> (op1> op2)?op1:op2;
			System.out.println("Min : "+ min.calculate(100, 60));
			
			System.out.println("TripleMultiply : " +tripleMultiply(20, 40, multiplication));

	}
		static double tripleMultiply (double op1,double op2,Calculatable multiplication) {
			return multiplication.calculate(op1,op2) * 3;
		}
			
		
}
