package association.onetomany;

public class Librarian {

	private int id;
	private String name;
	public Librarian(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Librarian [id=" + id + ", name=" + name + "]";
	}
	
}
