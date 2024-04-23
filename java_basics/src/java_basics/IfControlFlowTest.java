package java_basics;

import java.util.Scanner;

public class IfControlFlowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Simple If
		//else if() ...
		
//		int x=10;
//		
//		if(x < 10) {
//			System.out.println("x is less than 10");
//		}
//		else if(x==10) {
//			System.out.println("x is equal to 10");
//		}
//		else {
//			System.out.println("x is greater than 10");
//		}
//		System.out.println("Out of If");
		
		//Nested If Nested Block Infinity
		//Semantics - 2 level
		//Vote
		
//		int age = 20;
//		boolean nrc = true;
//		
//		if (nrc && age >= 18) 
//			System.out.println("You can vote");
//		
//			else 
//				System.out.println("You cannot vote");
			
		
//		if(nrc) {
//			System.out.println("Checked NRC");
//			if(age >= 18)
//				System.out.println("You can vote");
//			else 
//				System.out.println("You are underage.You can vote");
//		}
//		else {
//			System.out.println("You cannot vote");
//		}
		//nrc == true
//		if (nrc) {
//			System.out.println("You can vote.");
//			
//		}
//		else if(age > 18) {
//			System.out.println("You can vote");
//			
//		}
//		else {
//			System.out.println("You cannot vote");
//			
//			
//		}
		
		
		//User - 1 -7
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter your favourite Number : 1 - 7");
		int noOfDay = userInput.nextInt();
		userInput.close();
		
		//Worst case sinerio
		if(noOfDay==1)
			System.out.println("Super sunday");
		else if(noOfDay==2)
			System.out.println("Sad Monday");
		else if(noOfDay==3)
			System.out.println("Boring Tuesday");
		else if(noOfDay==4)
			System.out.println("Boring Wednesday");
		else if(noOfDay==5)
			System.out.println("Normal Thursday");
		else if(noOfDay==6)
			System.out.println("Happy Friday");		
		else if(noOfDay==7)
				System.out.println("Drinking Saturday");
		else
			System.out.println("Invalid input");
			
		
		
		
		
		

	}

}
