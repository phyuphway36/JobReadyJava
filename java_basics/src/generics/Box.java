package generics;

public class Box <T>{
	T t;
	//Mutator
	public void add(T t) {
		this.t = t;
		
	}
	public T get() {
		return t;
	}

}
