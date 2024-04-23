package code_challenge;

public class ThreeDimensionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[][][] empSalary = new double[3][10][5];
		empSalary[1][3][2]  = 300000;
		empSalary[1][2][1] = 500000;
		empSalary[2][9][4] = 400000;
		
		
		System.out.println(empSalary[1][3][2]);
		System.out.println(empSalary[1][2][1]);
		System.out.println(empSalary[2][9][4]);
		

	}

}
