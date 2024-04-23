package java_basics;

import java.util.Scanner;

public class BranchingStmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Search Query String: ");
		String subString = userInput.nextLine();
		userInput.close();
		//Algorithm - testString -outter loop maxLength
		String testString ="Titanic is a love movie that release in 1990."
				+"It grows worldwide upto 2.5 billions dollar.";
		int max =  testString.length() - subString.length();
		boolean foundIt = false;
		test:
		for(int i = 0; i<= max;i++) {
			int n = subString.length();
			int j = i;
			int k = 0;
			
			while (--n !=0) {
				if(testString.charAt(j++) != subString.charAt(k++))
						continue test;
				
			}
			foundIt =  true;
			break test;
		}
		System.out.println(foundIt? "Found subString" : "subString is not found");
//		
//		
//		
		
//		Scanner userInput = new Scanner(System.in);
//		System.out.println("Enter Search Query integers: ");
//		char searchChar = userInput.next().charAt(0);
//		userInput.close();
//		//Algorithm - Loop String char!= ourChar -> not -> skip -> loop round
//		String testString = "radar rado radae rodar rar rar";
//		int occured=0;
//		for (int i = 0; i< testString.length();i++) {
//			occured++;
//			if(searchChar != testString.charAt(i))
//				continue;
//			occured++;
//			
//		}
//		System.out.println("Found" +searchChar+""+occured +"times");
//		
		
		//Searching array
//		Scanner userInput = new Scanner(System.in);
//		System.out.println("Enter Search Query integers: ");
//		int searchInt = userInput.nextInt();
//		userInput.close();
//		
//		
//		int[][] numArray = {{23,45,67,89,789,34,345},{10,20,30},{66,77,88}};
//		boolean foundIt = false;
//		int index1 = 0;
//		int index2 = 0;
//		int count = 0;
//		//Outer loop
//		
//		search://label tat tar
//		for(int i=0;i< numArray.length;i++) {
//			
//			for(int j = 0;j<numArray[i].length;j++) {
//			
//				count++;
//				if(searchInt == numArray[i][j]) {
//					foundIt = true;
//					index1 = i;
//					index2 =j;
//					break search;//labeled break
//				}	
//			}
//			
//		}
//		
//		String result = foundIt ? "Found" +searchInt+"at index(" 
//				+index1+","+index2 + ") in this array":
//				searchInt +"is not founnd in this array";
//		System.out.println(result);
//		System.out.println("Loop" +count+"times");
//		

		
//		int[] numArray = {23,45,67,89,789,34,345};
//		boolean foundIt = false;
//		int index = 0;
//		int count = 0;
//		for(int i=0;i< numArray.length;i++) {
//			
//			count++;
//			if(searchInt == numArray[i]) {
//				foundIt = true;
//				index = i;
//				break;//normal break
//			}
//			
//		}
//		String result = foundIt ? "Found" +searchInt+"at index" +index + "in this array":searchInt +"is not founnd in this array";
		
//		System.out.println(result);
//		System.out.println("Loop" +count+"times");
//		
		
		

	}

}
