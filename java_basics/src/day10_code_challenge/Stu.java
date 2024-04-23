package day10_code_challenge;

public class Stu {
	int id;
	int rollNo;
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu student = new Stu();
		student.studentDetails("Mya Mya", 2);
		student.stuRollNo(4);

	}
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
