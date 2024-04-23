package java_basics;

public class CounterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c1 = new Counter();//+1
		System.out.println("Count : "+c1.getCount());
		
		Counter c2 = new Counter();
		System.out.println("Count : "+c2.getCount());

		Counter c3 = new Counter();//+1
		System.out.println("Count : "+c3.getCount());

		Counter c4 = new Counter();//count 3+1 =4
		System.out.println("Count : "+c4.getCount());
		
		System.out.println(Counter.getCount());


		
	}

}
