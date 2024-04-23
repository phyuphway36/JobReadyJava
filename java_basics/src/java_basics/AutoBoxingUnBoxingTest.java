package java_basics;

public class AutoBoxingUnBoxingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AutoBoxing
		Integer intObj = 100;
		System.out.println(intObj);
		
		//AutoUnBoxing
//		int x =intObj.intValue();//Manual Unboxing
//		int x = intObj;
//		
//		Integer intObj2= Integer.valueOf(10000);//ManualBoxing
//		
//		Double dObj = 20.444;
//		Character charObj ='A';
//		Boolean bObj = true;
//		
//		System.out.println(intObj);
//		System.out.println(x);
//		System.out.println(intObj2);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.BYTES);
//		System.out.println(Integer.SIZE);
		
//	Integer x =100;
//	
//	//System.out.println(square(x));//AutoUnBoxing
//	Integer result = square(x);//AutoUnBoxing AutoBoxing
//	System.out.println(result);
	
		double x = 20.55;
		double result = sqroot(x);//AutoBoxing
		System.out.println(result);
	

	}
	static int square(int x) {
		return x*x;
	}
	static Double sqroot(Double x) {
		return Math.sqrt(x);//AutoBoxing AutoUnBoxing
	}

}
