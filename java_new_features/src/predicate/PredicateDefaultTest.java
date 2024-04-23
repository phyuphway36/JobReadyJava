package predicate;

import java.util.function.Predicate;

public class PredicateDefaultTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> shortSentanceTest = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.length() <= 30;
			}
		};
//		Predicate<String> shortSentanceTest = str -> str.length() <= 30;//Declarative
		Predicate<String> sentanceValidTest = str -> str.endsWith(".");

		//And
//		String sampleAndTrue = "My Name is MgMg.";
//		String sampleAndFalse = "My Name is MgMg.My Name is MgMgMy Name is MgMgMy Name is MgMgMy Name is MgMg";
//
//		boolean resultAndTrue = shortSentanceTest.and(sentanceValidTest).test(sampleAndTrue);
//		System.out.println("SampleAndTrue is short Sent : & Valid?"+ resultAndTrue);
		
//		boolean resultAndFalse = shortSentanceTest.and(sentanceValidTest).test(sampleAndFalse);
//		System.out.println("SampleAndTrue is short Sent : & Valid?"+ resultAndFalse);
		
		//OR
//		String stringORTrue = "My Name is MgMg. ";
//		boolean resultORTrue = shortSentanceTest.or(sentanceValidTest).test(stringORTrue);
//		System.out.println(resultORTrue);
		
		String stringORFalse = "My Name is MgMgMy Name is MgMgMy Name is MgMgMy Name is MgMgMy Name is MgMgMy Name is MgMg ";
		boolean resultORFalse = shortSentanceTest.or(sentanceValidTest).test(stringORFalse);
		System.out.println(resultORFalse);
		
		String negateString = "Mg Mg is a student";
		System.out.println(shortSentanceTest.negate().test(negateString));
		
		System.out.println(shortSentanceTest.and(sentanceValidTest).negate().test(negateString));
	}

}
