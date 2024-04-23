package multi_level_inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MortorCycle m1 = new MortorCycle();
		m1.color = "black";
		m1.horsePower = 15;
		m1.model = "Ninja";
		m1.price = 20000000;
		
		System.out.println(m1.color);
		System.out.println(m1.horsePower);
		System.out.println(m1.model);
		System.out.println(m1.price);

		m1.brake();
		m1.hasEngine();
		m1.hasWheel();
		
		Scoopyi s1 =new Scoopyi();
		s1.color = "white";
		s1.horsePower = 20;
		s1.model = "Honda";
		s1.price = 30000000;
		
		System.out.println(s1.color);
		System.out.println(s1.horsePower);
		System.out.println(s1.model);
		System.out.println(s1.price);
		
		s1.brake();
		s1.gear();
	}

}
