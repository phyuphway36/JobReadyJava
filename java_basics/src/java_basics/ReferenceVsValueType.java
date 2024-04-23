package java_basics;

public class ReferenceVsValueType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x = 10;//Value Type
//		addOne(x);
//		System.out.println(x);//output ka 1  ma toe bu
		
		int[] array = {10,20,30,40};//Reference Type
		addOneToArray(array);
		printArray(array);
		

	}

//	static void addOne(int x) {
//		x++;
//	}
	
	static void addOneToArray(int[] array) {
		
		for(int i = 0;i<array.length;i++) {
			array[i] += 1;
			
		}
		
	}
	static void printArray(int[] array) {
		for(int element: array) {
			element += 1;
			System.out.print(element +" ");
			
		}	
	}
}
