package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeFiltering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employees = Arrays.asList(
				new Employee(1001,"KyawAung","Manager",500000),
				new Employee(1002,"AungHein","Staff",200000),
				new Employee(1003,"MyaMya","Staff",250000),
				new Employee(1004,"HeinThu","GM",1500000),
				new Employee(1005,"UTinMg","CTO",3000000),
				new Employee(1006,"DawKalaya","HR-Manager",800000),
				new Employee(1007,"BoBo","Staff",300000),
				new Employee(1008,"YeYint","Manager",500000),
				new Employee(1009,"KyawHtet","GM",1600000),
				new Employee(1010,"ChawSu","HR-Manager",800000)
				
				);
		
		List<String> nameList = employees.stream().map(e -> e.getName()).sorted().collect(Collectors.toList());
		System.out.println(nameList);
		
//		Employee payLowest = employees.stream()
//				.min((e1,e2) -> e1.getSalary() > e2.getSalary()?1:-1).get();
//		
//		System.out.println(payLowest);
//		
//		Employee payHighest = employees.stream()
//				.max((e1,e2) -> e1.getSalary() > e2.getSalary()?1:-1).get();
//		
//		System.out.println(payHighest);
//		employees.stream().skip(5).forEach(System.out:: println);//first 2ku skip
		
//		employees.stream().limit(5).forEach(System.out:: println);
		
		//employee count
//		long employeeCount = employees.stream().filter(e -> e.getSalary() >300000)
//				.count();
//		System.out.println("Total employee whose salary is more than 3000000: "+employeeCount);
				
//		double averageSalary = employees.stream().map(e -> e.getSalary())
//				.collect(Collectors.averagingInt(s -> s));
//		
//		System.out.println(averageSalary);
		//Collect Sum
//		int totalSalary = employees.stream().collect(Collectors.summingInt(e -> e.getSalary()));
				
		//reduce
//		int totalSalary = employees.stream().map(e -> e.getSalary() )
//				.reduce(0, (seum,salary)->sum+salary);
//				System.out.println("Company Toatal Salary: "+totalSalary);
		
		
//		Map<Integer, String> employeeMap = employees.stream()
//				.collect(Collectors.toMap(e -> e.getId(), e -> e.getRole()));
//		System.out.println(employeeMap);
//		
//		List<Employee> raiseSalaryEmployees = employees.stream()
//				.map(e -> {
//					Employee newEmployee = e;
//					newEmployee.setSalary(newEmployee.getSalary()*2);
//					return newEmployee;
//				})
//				.collect(Collectors.toList());
//		raiseSalaryEmployees.forEach(System.out::println);
		
//		employees.stream().filter(e -> e.getSalary() < 500000).map(e -> e.getName())
//		.forEach(System.out::println);
//		
//		 Set<String> nameList =employees.stream().filter(e -> e.getSalary() < 500000)
//				 .map(e -> e.getName())
//				 .collect(Collectors.toSet());
//				 
//				 System.out.println(nameList);
		
		
//		Predicate<Employee> managerRoleFilter = e -> e.getRole().equals("Manager");
//		List<Employee> filteredEmployeeList = filterWithStreamEmployeeByRole(employees, managerRoleFilter);
//		filteredEmployeeList.forEach(System.out::println);
		
//		List<Employee> filteredEmployeeList = filterEmployeeByRole(employees, "Manager");
//		
//		//Display
//		for(Employee employee: filteredEmployeeList )
//			System.out.println(employee);
				
	}
	//Declarative(Stream API)
	static List<Employee> filterWithStreamEmployeeByRole
	(List<Employee> employees,Predicate<Employee> rolePredicate){
		
		List<Employee> filteredEmployeeList = employees.stream()
				.filter(rolePredicate)
				.collect(Collectors.toList());
		return filteredEmployeeList;
	}
	
	
	//Imperative
//	static List<Employee> filterEmployeeByRole(List<Employee> employees,String role){
//		List<Employee> filteredEmployeeList = new ArrayList<>();
//		
//		for( Employee employee : employees) {
//			if(employee.getRole().equals(role))
//				filteredEmployeeList.add(employee);
//		}
//		return filteredEmployeeList;
				
//	}

}
