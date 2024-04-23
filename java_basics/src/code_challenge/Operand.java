package code_challenge;

import java.util.Scanner;

public class Operand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter your operator:");
		char operator = userInput.next().charAt(0);
		
		int x = 10;
		int y = 5;
		int z = 0;
		if(operator == '+') {
			z = x+y;
			System.out.println("Add"+z);
		}
			else if(operator == '-') {
			z = x-y;
		System.out.println("Subtract: "+z);
			}
			else if(operator == '*') {
				z = x*y;
			System.out.println("Multiple: "+z);
				}
			else if(operator == '/') {
				z = x/y;
			System.out.println("Division: "+z);
				}
			else if(operator == '%') {
				z = x%y;
			System.out.println("Modolus: "+z);
				}
			else
				System.out.println("Invalid Operator");
		
		
	
	}

}
