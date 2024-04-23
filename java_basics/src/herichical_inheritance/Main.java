package herichical_inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer p1 = new Programmer();
		p1.id = 1;
		p1.name = "MyaMya";
		p1.salary = 300000;
		p1.role ="Junior Programmer";
		
		System.out.println(p1.id);
		System.out.println(p1.name);
		System.out.println(p1.salary);
		System.out.println(p1.role);
		
		p1.eat();
		p1.coding();
		p1.work();
		System.out.println();
		
		Singer s1 =new Singer();
		s1.id = 2;
		s1.name = "MgMg";
		s1.role = "Singer";
		s1.salary = 300000;
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.role);
		System.out.println(s1.salary);
		
		s1.eat();
		s1.singing();
		s1.work();
		System.out.println();

		Dancer d1 = new Dancer();
		d1.id = 3;
		d1.name = "MgBa";
		d1.role = "Dancer";
		d1.salary = 300000;
		
		System.out.println(d1.id);
		System.out.println(d1.name);
		System.out.println(d1.role);
		System.out.println(d1.salary);
		
		d1.dancing();
		d1.eat();
		d1.work();



	}

}
