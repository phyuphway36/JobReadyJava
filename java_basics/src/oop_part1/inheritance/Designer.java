package oop_part1.inheritance;

public class Designer extends IT_Employee{
	
	String name = "MgAung";//field
	
//	Designer(String arg) {
//		super(arg);
//		// TODO Auto-generated constructor stub
//	}
	
	public Designer() {
		// TODO Auto-generated constructor stub
		System.out.println(name);
		System.out.println(super.name);//parent yae name ko child class htae ka nay call chin yin super nae call
		writeCode();
	}
	

	void createArt() {
		System.out.println("Designer is creating arts");
	}

}
