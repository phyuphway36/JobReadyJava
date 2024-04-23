package java_basics;

//import oop.Vehicle;

public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Employee e1 = new Employee();//instantiate
//		
//		Employee interview = new Employee("Mg Mg");
		
		Employee fulltime = new Employee(2110, "Kyaw Hein", 5.5, 30, "Manager");
//		fulltime.changeName("Kyaw Aung");
		
	//	System.out.println(fulltime.showName());
		fulltime.setName("Kyaw aung");
		System.out.println(fulltime.getName());
		System.out.println(fulltime.getId());


		
		
//		Vehicle v1 =new Vehicle();
		
//		System.out.println(fulltime.id);
//		System.out.println(fulltime.name);
//		System.out.println(fulltime.height);
//		System.out.println(fulltime.age);
//		System.out.println(fulltime.role);
		

		//System.out.println(interview.name);

	}

}
