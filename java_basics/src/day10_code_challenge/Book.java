package day10_code_challenge;

public class Book {

	String bkName;
	String auName;
	double price;
	

	

	public void readBook(String bookName,String authorName) {
		bkName = bookName;
		auName = authorName;
		
		System.out.println(bkName);
		System.out.println(auName);
		
	}
	public void bookPrice(double bprice) {
		price = bprice;
		System.out.println(price);
	}

}
