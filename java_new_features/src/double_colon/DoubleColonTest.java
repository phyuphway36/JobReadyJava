package double_colon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import functiontr.Employee;

@FunctionalInterface
interface Squarable{
	Integer square(Integer number);
}
class SuperClass{
	Integer square(Integer number) {
		return number*number;
	}
}

public class DoubleColonTest extends SuperClass{
	
	public DoubleColonTest() {
		// TODO Auto-generated constructor stub
	}
	public DoubleColonTest(String testStr) {
		System.out.println("Inside Constructor "+testStr);
	}

	static String prefix(String str) {
		
		return "Sr."+str;
	}
	
	Double sqRoot(Double number) {
		return Math.sqrt(number);
		
	}
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
//		employees.forEach(System.out :: println);
		
		Function<String, String> prefixFunc = DoubleColonTest :: prefix;
		System.out.println(prefixFunc.apply("MgMg"));
		
		Function<Double, Double> sqrtFunc = new DoubleColonTest()::sqRoot;
		System.out.println(sqrtFunc.apply(25.0));
		
		System.out.println(new DoubleColonTest().squareTest(100));
		
		Function<Employee, String> roleFun =  e -> e.getRole();
		List<String> roleList = new ArrayList<>();
		for(Employee employee : employees)
			roleList.add(roleFun.apply(employee));
		roleList.forEach(DoubleColonTest :: new );
			
	}
	
	Integer squareTest(Integer number) {
		Squarable square = super :: square;
		return square.square(number);
		
	}

}
