package oop_part2.enumeration;

public class PlanetMain {
//java PlantsMain 200
	public static void main(String[] weight) {//console args or program args
		// TODO Auto-generated method stub
		if(weight.length != 1) {
			System.err.println("Give Weight on Earth only one");
			System.exit(0);//normally exit
		}
		
		double w =  Double.parseDouble(weight[0]);// w =mg -> m = w/g
		
		Planets earth = Planets.EARTH;
		
		double m = w/earth.gravitationalForce();
		
		for(Planets planet : Planets.values())
			System.out.println("Weight on"+ planet + " is "+ planet.surfaceWeight(m)+"kg");

	}

}
