package java_basics;

public class BoxedTypeVsPremitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long startTime = System.nanoTime();
//		System.out.println(speedPrimitive());
//		System.out.println(((System.nanoTime() - startTime)/1000000)+"ms");//232ms
		
		long startTime = System.nanoTime();
		System.out.println(speedBoxedType());
		System.out.println(((System.nanoTime() - startTime)/1000000)+"ms");
		
//		System.out.println("Primitive is faster than "+(4906/239)+"times than BoxedType");
		

	}
	static long speedPrimitive() {
		long result = 0L;
		
		for(long i = 1L;i< 674485488;i++) {
			result += i;
		}
		return result;
		
		
	}
	static long speedBoxedType() {
		long result = 0L;
		
		for(long i = 1L;i< 674485488;i++) {
			result += i;
		}
		return result;
		
		
	}


}
