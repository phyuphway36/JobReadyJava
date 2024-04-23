package java_basics;

public class VariableType {
	//Static Variable
	static int staticVal;
	double salary;
	char charIns;
	boolean booleanIns;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int local1;
		local1 = 100;
		System.out.println(local1);
		
		System.out.println(staticVal);
		System.out.println(new VariableType().salary);
		System.out.println(new VariableType().charIns);
		System.out.println(new VariableType().booleanIns);


	}

}
