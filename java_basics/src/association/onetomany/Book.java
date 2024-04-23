package association.onetomany;

public class Book {

	private String title;
	private String author;
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
}
