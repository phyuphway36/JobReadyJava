package oop_part2.innerclass;

public class AnonymousTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean strom = true;
		if(strom) {

		Destroyer tree1 = new Destroyer() {

			@Override
			public void destroy() {
				// TODO Auto-generated method stub
				System.out.println("Tree1 is destroyed");
			}
			
		};
		
		tree1.destroy();
		
		Destroyer tree2 = new Destroyer() {
			
			@Override
			public void destroy() {
				// TODO Auto-generated method stub
				System.out.println("Tree2 is destroyed");
			}
		};
		tree2.destroy();
		
		Destroyer vehicle1 = new Destroyer() {
			
			@Override
			public void destroy() {
				// TODO Auto-generated method stub
				System.out.println("Vehicle is destroyed");
			}
		};
		vehicle1.destroy();
		
		Destroyer human1 = new Destroyer() {
			
			@Override
			public void destroy() {
				// TODO Auto-generated method stub
				System.out.println("Human1 is destroyed");
			}
		};
		human1.destroy();
		
		}
	}

}
