package oop_part1.inheritance;

public class Developer extends IT_Employee{
	public Developer() {
		super("Sample");
		System.out.println("Inside Developer No args Constructor.");
		
	}
	
	Developer(String arg){
		super("Sample");
		System.out.println("Inside Developer one args Constructor.");
		
	}
	
	
	void designClasses() {
		System.out.println("Developer is designing Classes");
	}
}
