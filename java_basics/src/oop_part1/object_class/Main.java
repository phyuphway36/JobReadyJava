package oop_part1.object_class;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student s1= new Student(1001,"mgmg","IT");
		Student s2= new Student(1001,"Hein","EC");
		Student s3 = (Student) s1.clone();
//		Student s4 = null;
		
//		System.out.println(s1.getClass());
		
		System.out.println(s1.toString());	
		System.out.println(s3.toString());

//		System.out.println(s1.equals(s2));
//		System.out.println(s2.toString());
//		System.out.println(s1.equals(s3));
//		System.out.println(s3.equals(s4));

	}

}
