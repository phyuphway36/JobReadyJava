package model;

public class Programmer {

	private int id;
	private String name;
	private String role;
	private double height;
	
	
	public Programmer(String name, String role, double height) {
		super();
		this.name = name;
		this.role = role;
		this.height = height;
	}


	public Programmer(int id, String name, String role, double height) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.height = height;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	@Override
	public String toString() {
		return "Programmer [id=" + id + ", name=" + name + ", role=" + role + ", height=" + height + "]";
	}
	
	
}
