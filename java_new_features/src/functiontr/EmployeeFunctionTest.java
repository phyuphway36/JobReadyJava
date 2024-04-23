package functiontr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class EmployeeFunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employees = Arrays.asList(
				new Employee(1,"Ba Kyaw","Manager"),
				new Employee(2,"Htin Kyaw","Manager"),
				new Employee(3,"Sapal Ko","Staff"),
				new Employee(4,"Chit Min","Staff"),
				new Employee(5,"Kyaw Zaw","Staff"),
				new Employee(6,"Hnin Yamone","Manager")
				);
				
		Function<Employee, String> nameFunc = employee -> employee.getName();
		
		Function<String,String> initialLetterFunc = name ->String.valueOf(name.charAt(0));
		
		Function<Employee, Employee> firstNameSetFunc =  employee -> {
			Employee newEmployee = employee;
			String name = employee.getName();
			int index = name.indexOf(" ");
			String firstName = name.substring(0,index);
		    newEmployee.setName(firstName);
			return employee;
		
		};
		
		
		Function<Employee, Employee> employeeFunc = Function.identity();
		
//		List<String> nameList = getNameList(employees, nameFunc.andThen(initialLetterFunc));
		//Initial Letter List
//		List<String> nameList = getNameList(employees, nameFunc);
//		List<String> nameList = getNameList(employees, nameFunc.compose(firstNameSetFunc));
//
//		nameList.forEach(name -> System.out.println(name));
		
		List<Employee> employeeList = getEmployeeList(employees, employeeFunc);
		employeeList.forEach(e -> System.out.println(e));
	}
	static List<Employee> getEmployeeList(
			List<Employee> employees,Function<Employee,Employee> emplFunction){
		List<Employee> employeeList = new ArrayList<>();
		for(Employee employee: employees) {
			if(employees !=null)
				employeeList.add(emplFunction.apply(employee));
		}
		return employeeList;
	}

		
	
	
	static List<String> getNameList(
			List<Employee> employees,Function<Employee,String> nameFunc){
		List<String> nameList = new ArrayList<>();
		for(Employee employee: employees) {
			if(employees !=null)
				nameList.add(nameFunc.apply(employee));
		}
		return nameList;
	}

}
