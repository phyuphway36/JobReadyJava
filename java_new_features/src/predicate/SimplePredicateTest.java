package predicate;

import java.util.function.Predicate;

public class SimplePredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> greaterthan20 = number -> number > 20;
		System.out.println(greaterthan20.test(30));
		
		Predicate<String> startWithG = string -> string.startsWith("G");
		System.out.println("startWithG test: " +startWithG.test("Goal"));
		
		Predicate<String> containA = str -> str.contains("A");
		System.out.println("containA Test : "+containA.test("BORA"));
	}

}
