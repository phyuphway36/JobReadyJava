package oop.test;

import oop_part1.inheritance.IT_Employee;

public class RemoteDeveloper extends IT_Employee{
	public RemoteDeveloper() {
		// TODO Auto-generated constructor stub
		name = "ZawZaw";
		writeCode();
		thinkAlgorithms();
		
	}
	
	void workRemote() {
		System.out.println("RemoteDeveloper is working");
	}
	

}
