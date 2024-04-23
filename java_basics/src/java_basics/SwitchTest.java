package java_basics;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter your favourite Number : 1 - 7");
		int noOfDay = userInput.nextInt();
		userInput.close();
		//old switch
		//String switch java 7
		//Worst case scenario case 1 with no break
//		switch (noOfDay) {
//		case 1:
//			System.out.println("Super Sunday");
//			break;//fallthrough
//		case 2:
//			System.out.println("Active Monday");
//			break;
//		case 3:
//			System.out.println("Boring Tuesday");
//			break;
//		case 4:
//				System.out.println("Boring Wednesday");
//				break;
//		case 5:
//				System.out.println("Normal Thursday");
//				break;
//		case 6:
//			System.out.println("Happy Friday");
//			break;
//		case 7:
//			System.out.println("Drinking Saturday");
//			break;
//			
//		default:
//			System.out.println("Invalid input");
//			break;
////			
//		
//		}
//		System.out.println("Out of switch");
		//case grouping
//		switch(noOfDay) {
//		case 1:case 2:case 3:case 4:
//			
//			System.out.println("Weekday");
//			break;
//		case 5:case 6:
//			System.out.println("Weekend");
//			break;
//		default:
//			System.out.println("Invalid input");
//			break;
//		
//			
//		}
		
		//new switch(enhanced switch)- Java 14 
		//yield expression Java 13
		//verbose
		
		String result = switch (noOfDay) {
		case 1,2,3,4,5: {
			String day = "Weekday -"+noOfDay;
			yield day;
		}
	    case 6,7: {
	    	String day = "Weekend -"+noOfDay;
			yield day;
	    }
		default:
			yield "Invalid Input";
		};
		
		//concise
//		String result = switch (noOfDay) {
//		case 1,2,3,4,5 ->"Weekday";
//		case 6,7 -> "Weekend";
//		default ->"Invalid Input";
//		};
		
		
		
		
//		String result = switch (noOfDay) {
//		case 1 -> "Super Sunday";
//		case 2 -> "Active Monday";
//		case 3 -> "Boring Tuesday";
//		case 4 -> " Boring Wednesday";
//		case 5 -> "Normal Thursday";
//		case 6 -> "Happy Friday ";
//		case 7 -> "Drinking Saturday ";
//		
//		
//		
//		
//		default -> "Invalid Input";
//		
//		};
//		System.out.println(result);
		
		
		}

	}


