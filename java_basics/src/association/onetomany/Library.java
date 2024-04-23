package association.onetomany;

import java.util.List;
//library bat ka one to many
//book bat ka many to one
public class Library {
	private String name;
	//onetomany composition
	private final List<Book> books;
	//onetomany
	private List<Librarian> librarians;
	public Library(String name, List<Book> books) {
		super();
		this.name = name;
		this.books = books;
	}
	
	public List<Librarian> getLibrarians() {
		return librarians;
	}

	public void setLibrarians(List<Librarian> librarians) {
		this.librarians = librarians;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Book> getBooks() {
		return books;
	}
	@Override
	public String toString() {
		return "Library [name=" + name + ", books=" + books + "]";
	}
	
	

}
