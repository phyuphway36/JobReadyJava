package employee;

public class Employee {
	int id;
	String name;
	double salary;

	
	void display(int empId,String newName,double empSalary) {
		name = newName;
		salary = empSalary;
		id = empId;
		System.out.println("Employee name is "+name);
		System.out.println("Salary is "+salary);
		System.out.println("Employee id is "+id);
		
		
	}

}
