package lambda;

public class GenericLambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomComparable<Integer> integerComparator = (Integer a,Integer b)
				-> (a >= b)?(a.equals(b))? 0:1:-1;
				
			 int a = 200;
			 int b = 200;
//			 Integer result =integerComparator.compare(a, b);	
		    CustomComparable<String> stringComparator = (String s1,String s2)
		    		-> (s1.charAt(0) > s2.charAt(0))?(s1.charAt(0) == s2.charAt(0))?"equal":"max":"min" ;
		    	String result = stringComparator.compare("Apple", "Banana");
		    	System.out.println(result);
			
//			String status = switch (result) {
//			case 1 -> "Object 1 is Max than Object 2";
//			case -1 -> "Object 1 is Min than Object 2";
//			case 0 -> "Object 1 is equal to  Object 2";
//			default -> throw new IllegalArgumentException("Unexpected value: " + result);
//			
//			};
//			System.out.println(status);

	}

}
