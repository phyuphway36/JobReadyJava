package oop;

public class Main {

	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle();//v1=@fgji  Object Instance
		//Reference variable = Vehicle Obj;
		//JVM Memory heap - object - address 
		
		v1.color = "black";
		v1.brand = "Avandator";
		v1.engineType = "Aerospace";
		v1.horsePower = 10;
		v1.model ="Roadster";
		v1.price = 200000.0;
		System.out.println(v1);
		System.out.println(v1.color);
		System.out.println(v1.brand);
		System.out.println(v1.engineType);
		System.out.println(v1.horsePower);
		System.out.println(v1.model);
		System.out.println(v1.price);
		
		Vehicle v2 = new Vehicle();
		v2.horsePower =20;
		System.out.println(v2);
		System.out.println(v2.horsePower);
		
		
		
//		new Vehicle().color="black";//copy states behaviour
//		System.out.println(new Vehicle().color);
		
		//Object internal
		/*
		 * color="black"
		 * brand=""
		 * model=""
		 * hp=0
		 * .....
		 *methods
		 * 
		 * 
		 * 
		 * 
		 */
		

	}

}
