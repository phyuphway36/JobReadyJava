package oop_part2.enumeration;

public enum Planets {
	//5.976*10 ^ 24 e+24 - scientific notation
	EARTH(5.976e+24,6.37814),
	JUPITOR(1.9e+27,7.1492e7),
	MARS(6.421e+23,3.3972e6),
	MERCURY(3.303e+23,2.4397e6),
	NEPTUNE(1.024e+26,2.4746e7),
	SATURN(5.688e+26,6.0268e7),
	URANUS(8.686e+25,2.5559e7),
	VENUS(4.869e+24,6.0518e6);
	
	private final double mass;
	private final double radius;
	private Planets(double mass, double radius) {
		this.mass = mass;
		this.radius = radius;
	}
	public double getMass() {
		return mass;
	}
	public double getRadius() {
		return radius;
	}
	static final double G = 6.67300E-11;
	
	double gravitationalForce() {
		double g = G * mass/(radius*radius);
		return g;
	}
	double surfaceWeight(double mass) {
		double w = mass * gravitationalForce();
		return w;
		
	}
	

}
