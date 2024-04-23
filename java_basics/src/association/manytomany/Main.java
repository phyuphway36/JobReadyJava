package association.manytomany;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student(1001, "MgMg");
		Student s2 = new Student(1002, "MgMya");
		Student s3 = new Student(1003, "MgZaw");
		Student s4 = new Student(1004, "MgBa");
		Student s5 = new Student(1005, "Mghla");
		
		Teacher t1 = new Teacher(1001, "Daw Hla Tin");
		Teacher t2 = new Teacher(1002, "U Ba");
		Teacher t3 = new Teacher(1003, "Daw Than");
		
		//Perpespective T1
		List<Student> studentsT1 = Arrays.asList(s2,s3,s4);
		t1.setStudents(studentsT1);
		
		//Perpespective T1-Students
		s2.getTeachers().add(t1);
		s3.getTeachers().add(t1);
		s4.getTeachers().add(t1);
		
		//Perpespective T2
		List<Student> studentsT2 = Arrays.asList(s1, s5, s4);
		t1.setStudents(studentsT2);

		// Perpespective T2-Students
		s1.getTeachers().add(t2);
		s5.getTeachers().add(t2);
		s4.getTeachers().add(t2);

		//Perpespective T3
		List<Student> studentsT3 = Arrays.asList(s1, s5, s4,s2);
		t1.setStudents(studentsT3);

		// Perpespective T3-Students
		s1.getTeachers().add(t3);
		s5.getTeachers().add(t3);
		s4.getTeachers().add(t3);
		s2.getTeachers().add(t3);
		
		//T3 - Students show
		System.out.println("T3 has students :");
		for(Student student : t3.getStudents()) 
			System.out.print(student.getId()+" "+student.getName());
		
		//S4 - Teachers show
		System.out.println("S4 has teachers :");
		for(Teacher teacher : s4.getTeachers())
			System.out.println(teacher.getId()+" "+teacher.getName());

	}

}
