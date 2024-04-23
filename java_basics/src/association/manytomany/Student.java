package association.manytomany;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private int id;
	private String name;
	//ManytoMany
	private List<Teacher> teachers = new ArrayList<>();
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", teachers=" + teachers + "]";
	}
	
	
}
