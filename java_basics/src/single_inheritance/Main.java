package single_inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bulb b1 = new Bulb();
		b1.type = "LED";
		b1.price = 5000;
		b1.weight = 17;
		System.out.println(b1.type);
		System.out.println(b1.price);
		System.out.println(b1.weight);
		b1.charged();
		b1.makedLight();
	
	}

}
