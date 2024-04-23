package association.onetomany;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("BookTitle1", "Author1");
		Book book2 = new Book("BookTitle2", "Author2");
		Book book3 = new Book("BookTitle3", "Author3");
		Book book4 = new Book("BookTitle4", "Author4");
		Book book5 = new Book("BookTitle5", "Author5");
		//fixed List
		List<Book> books = Arrays.asList(book1,book2,book3,book4,book5);
		Library library = new Library("IdeaDevelop", books);

		System.out.println(library);
		for (Book book : library.getBooks())
			System.out.println(book);
		
		Librarian librarian1 = new Librarian(1001, "mgaung");
		Librarian librarian2 = new Librarian(1002, "mgmya");
		
		List<Librarian> librarians = Arrays.asList(librarian1,librarian2);
		
		library.setLibrarians(librarians);
		
		for(Librarian librarian : library.getLibrarians())
			System.out.println(librarian);

		
	}

}
