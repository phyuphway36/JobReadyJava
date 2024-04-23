package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResource {

	public static void main(String[] args) {
		//File file = new File("C:\\Trytest\\text.txt");
		File file = new File("C:\\Trytest\\text.txt");
		

		Scanner  scanner = null;
		try {
			  scanner = new Scanner(file);
			
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Inside Catch Block");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("Inside finally");
			if(scanner != null) {
			scanner.close();
			System.out.println("scanner is closed");
			}
		}
//		System.out.println("Enter Your name");
		
		
	}
}
