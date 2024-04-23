package lambda;

public class BlockLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Testable factorialTest = number -> {
			boolean factorialOK = false;
			if(number <= 20) {
				factorialOK = true;
				long result = 1L;
				for(long i = 1;i <= number;i++) {
					result *= i;
				}
				System.out.println("Factorial result is"+result);
			}
			return factorialOK;

	};
	System.out.println("Factorial can be computed?"+factorialTest.test(5));

	Testable leapYearTest = year ->{
		boolean leapYear = false;
		if(year % 400==0 || (year%4==0 && year%100!=0))
			leapYear = true;
		return leapYear;
	};
	System.out.println("2022 is leapYear?" + leapYearTest.test(2022));
	}
}
