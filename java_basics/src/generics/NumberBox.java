package generics;

public class NumberBox<N extends Number> {
	
	N n;
	
	public void add (N n) {
		this.n = n;
	}
	
	public N get() {
		return n;
	}
	
	

}
