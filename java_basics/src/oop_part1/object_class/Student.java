package oop_part1.object_class;

import java.util.Objects;

public class Student implements Cloneable,Comparable<Student>{
	private int id;
	private String name;
	private String major;
	
	public Student(int id, String name, String major) {
		super();
		this.id = id;
		this.name = name;
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", major=" + major + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, major, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(major, other.major) && Objects.equals(name, other.name);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public int compareTo(Student otherStudent) {
		// TODO Auto-generated method stub
		if(this.id < otherStudent.id)
			return -1;
		else if(this.id > otherStudent.id)
			return 1;
		else
			return 0;
	}
	
	
//@Override
//public String toString() {
//	
//	String hexCode = Integer.toHexString(hashCode());
//	String objStringRep = "[id="+this.id+",name="+this.name
//			+",major-"+this.major+",hashCode-"+hexCode+"]";
//	return objStringRep;
//}
//@Override
//public int hashCode() {
//	// TODO Auto-generated method stub
//	//return super.hashCode();
//	int hashCode = this.id*this.name.length()*this.major.length();
//	return hashCode;
//}
//@Override
//public boolean equals(Object obj) {
//	Student student = (Student)obj;
//	if(this.id == student.id && this.name == student.name
//			&& this.major == student.major)
//	return true;
//else
//	return false;
//	if(this.hashCode()== obj.hashCode())
//		return true;
//	else
//		return false;
//}//state tu lox true 

}
