package oop_part2.innerclass;

public class LocalClassTest {
	
	
	void checkPhoneNumber(String phno1,String phno2,String phno3) {
		
		class PhoneNumberChecker {
		
			
			boolean checkPhno1() {
				if(phno1.startsWith("09")&& phno1.length() == 11)
					return true;
				else
					return false;
			}
			
			boolean checkPhno2() {
				if(phno1.startsWith("09")&& phno2.length() == 11)
					return true;
				else
					return false;
			}
			
			boolean checkPhno3() {
				if(phno1.startsWith("09")&& phno3.length() == 11)
					return true;
				else
					return false;
			}
			

			
			
		}
		PhoneNumberChecker checker = new PhoneNumberChecker();
		
		if(checker.checkPhno1())
			System.out.println("Phno1 is valid");
		else
			System.out.println("Phno1 is invalid");
		
		System.out.println(checker.checkPhno2()?"":"Phno1 is valid");
		System.out.println(checker.checkPhno2()?"":"Phno1 is invalid");
	}

	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalClassTest lct = new LocalClassTest();
		lct.checkPhoneNumber("09787666777", "09786543290", "09567776789");

	}

}
