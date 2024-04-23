package java_basics;

public class IntegerTest {

	public static void main(String[] args) {
		//Literal - single value evaluate 1000 - integer literal
				byte byteA = 120;
				byte byteMax = Byte.MAX_VALUE;
				byte byteMin = Byte.MIN_VALUE;
				System.out.println(byteA);	
				System.out.println(byteMax);
				System.out.println(byteMin);
				
				
				char a = '%';
				System.out.println(a);
				
				
				short shortA = 30000;
				short shortMax = Short.MAX_VALUE; //Short is object
				short shortMin = Short.MIN_VALUE;
				System.out.println("Short values =>");

				System.out.println(shortA);
				System.out.println(shortMax);
				System.out.println(shortMin);
				System.out.println("**************************");

				int intA = 2000000;
				int intMax = Integer.MAX_VALUE;
				int intMin = Integer.MIN_VALUE;
				System.out.println(intA);
				System.out.println(intMax);
				System.out.println(intMin);
				
				long longA = 7547665895L;
				long longMax =Long.MAX_VALUE;
				long longMin = Long.MIN_VALUE;
				System.out.println(longA);
				System.out.println(longMax);
				System.out.println(longMin);
				
				System.out.printf("%s %s %s %s = %d.\n","Max", "Value" ,"of", "long",longMax );
				System.out.printf("%s %s %s %s = %d.","Min", "Value" ,"of", "long",longMin );
	}
}
