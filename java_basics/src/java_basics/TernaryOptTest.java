package java_basics;

public class TernaryOptTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//boolean expression ? expression 1 : expression 2;
		
		int x = 8;
		String result = (x >= 8) ? (x != 8) ? "X is greater than 8" :"x is equal to 8":"x is less than 8";
		System.out.println(result);
	}
	
}