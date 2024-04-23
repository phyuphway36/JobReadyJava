package code_challenge;

public class Student {
	int id;
	int rollNo;
	String name;

	
	public void studentDetails(String stuName,int stuId) {
		name = stuName;
		id = stuId;
		System.out.println("Student name is "+name);
		System.out.println("Student id is"+id);
		
	}
	void stuRollNo(int stuRollNo) {
		rollNo = stuRollNo;
		System.out.println("Student rollNo is "+rollNo);
	}
	
	

}
