package day10_code_challenge;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		for(int i = 1;i <= 5;i++) {
			for(int j=1;j<i;j++)
				System.out.print(" ");
			for(int k=1;k<=5-i;k++)
				System.out.print(i);
			System.out.println();
		}
			
	}

}
