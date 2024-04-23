package io_test;

import java.io.Serializable;

public class Doctor implements Serializable{

	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private static final long serialVersionUID = -8534823578670088474L;
	private static  int defaultWorkHour;
	private int id;
	private String name;
	private String field;
	private transient int age;//serialized Ignore
	public Doctor(int id, String name, String field, int age) {
		super();
		this.id = id;
		this.name = name;
		this.field = field;
		this.age = age;
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
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static int getDefaultWorkHour() {
		return defaultWorkHour;
	}
	public static void setDefaultWorkHour(int defaultWorkHour) {
		Doctor.defaultWorkHour = defaultWorkHour;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", field=" + field + ", "
				+ "age=" + age +",defaultWorkHour="+defaultWorkHour+ "]";
	}
	
}
