package java_basics;
//POJO Plain Ordinary Java Object
public class Employee {
	
//	int id;
//	String name;
//	double height;
//	int age;
//	String role;
	
	private int id;
	private String name;
	private double height;
	private int age;
	private String role;
	
	
	
	//always define
	Employee(){
		System.out.println("Inside default Constructor");
		System.out.println(this);
	}
	
	Employee(String newName){
		System.out.println(this);
		System.out.println("Inside one argument Constructor");
		name = newName;
		
	}
	//all argument constructor

	 Employee(int id, String name, double height, int age, String role) {
//		this(name);//constructor recursive
		System.out.println("Inside all argument Constructor");
		System.out.println(this);
		this.id = id;
//		this.name = name;
		this.height = height;
		this.age = age;
		this.role = role;
//		this.method1();
	}
	 //Accessor Method
	 //Maintenance - Readability
//	 void changeName(String name) {
//		 this.name = name;
//		  }
//	 String showName() {
//		 return name;
//		 }
	 //Standard
	 void setRole(String role) {
		 this.role = role;
	 }
	 
	 String getRole() {
		 return role;
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	 
	 
	
//	 void method1() {
//		 System.out.println("Inside method1");
//	 }
		
	 
	

}
