package java_practice;

import java.util.Scanner;

public class Branching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testString = " I am listening to music."+ "Songs name is night changes";
		String test = testString.toUpperCase();
		System.out.println(test);
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter search query string?: ");
		String subString = userInput.nextLine();
		userInput.close();
		
		
		int max =test.length() - subString.length();
		boolean foundIt = false;
		
		test:
		for (int i = 0; i <= max; i++) {
			
			int n =subString.length();
			int j = i;
			int k = 0;
			
			while (--n != 0) {
				if(test.charAt(j++) != subString.charAt(k++))
					continue test;
			
			}
			foundIt = true;
			break test;
		}
		System.out.println(foundIt?  "found substring" : "not found substring");
		
		
	}

}
