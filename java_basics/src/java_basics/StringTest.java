package java_basics;

public class StringTest {

	public static void main(String[] args) {
////		String username = "PhyuPhyuPhway ";
////		String role = "Manager";
////		String greeting = "Hello Good Morning";
////		System.out.println(username + role + greeting);
//		
//		//String utility methods
//		
//		
////		//Searching
////		String s1 = "Advengers : Infinity Wars";
////		System.out.println(s1.contains("Wars"));//ta ku ku shar chin yin .contains 
////		
////		
////		//Extract char
////		int index = s1.indexOf("I");//string thae ka char swal htote tar
////		char charA = s1.charAt(12);//index nae shar tar
////		System.out.println(charA);
////		System.out.println(index);
////		
////		//Extract subString
////		String infinityString = s1.substring(12,20);//exclusive
////		System.out.println(infinityString);
////		System.out.println(s1.substring(21));
//		
//		//Check
//		String s2 ="Why so serious bro?";
//		String emptyString = "";
//		String spaceString = " fg ";
//		System.out.println(s2.startsWith("why"));
//		System.out.println(s2.endsWith("bro?"));
//		System.out.println(s2.isEmpty());
//		System.out.println("Check Empty String: "+emptyString.isEmpty());
//		System.out.println(spaceString.isBlank());
//		
//		//Replace
//		String modifiedS2 = s2.replace("bro","sis");
//		System.out.println(modifiedS2);
//		
//		//Case Conversion
//		String upperCaseS2 = s2.toUpperCase();
//		System.out.println(upperCaseS2);
//		System.out.println(upperCaseS2.toLowerCase());
//		
//		//Trim
//		String s3 = "          is blabla.            ";
//		System.out.println("Origin : "+s3+"just test man...");
//		System.out.println("Trim:"+s3.trim()+"just test man....");
		
		//split & join
		
		String countries = "Myanmar,Thailand,USA,Japan,Korea";
		
		String[] countryArray = countries.split(",");//limiter
		
		System.out.println(countryArray.length);
		System.out.println(countryArray[0]);
		System.out.println(countryArray[1]);
		System.out.println(countryArray[2]);
		System.out.println(countryArray[3]);
		System.out.println(countryArray[4]);
		
		String countryString = String.join("*", countryArray);//delimiter		
		System.out.println(countryString);



		
		
		
		
		
		
			}

}
