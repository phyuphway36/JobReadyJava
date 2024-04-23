package oop_part1.inheritance;

public class IT_Employee {

	protected int id;
	protected String name = "MgMg";
	protected String role;
	protected int salary;
	private int secretMethod;

	
	  public IT_Employee() {
	  System.out.println("Inside IT_Employee No Arg Constructors"); }
	 

	IT_Employee(String arg) {
		System.out.println("Inside IT_Employee one Arg Constructors");
	}

	protected void writeCode() {
		System.out.println("Writing Code");
	}

	protected void thinkAlgorithms() {
		System.out.println("IT_Employee is thinking algorithms");
	}

	private void secretMethod() {
		System.out.println("This is secretmethods");

	}

}
