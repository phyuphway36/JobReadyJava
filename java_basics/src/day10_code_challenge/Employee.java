package day10_code_challenge;

public class Employee {
	int id;
	String name;
	double salary;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.display(1, "MgMg", 3000000);
		

	}
	void display(int empId,String newName,double empSalary) {
		name = newName;
		salary = empSalary;
		id = empId;
		System.out.println("Employee name is "+name);
		System.out.println("Salary is "+salary);
		System.out.println("Employee id is "+id);
		
		
	}

}
