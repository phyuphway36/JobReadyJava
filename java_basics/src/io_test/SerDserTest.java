package io_test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDserTest {

//	static void doctorSerialized() throws FileNotFoundException, IOException {
//		System.out.println("Inside doctorSerialozed");
//		Doctor doctor = new Doctor(1001, "Dr.KyawGyi", "Surgeon", 40);
//		doctor.setDefaultWorkHour(12);
//		System.out.println("Before Serialized");
//		System.out.println(doctor);
//		
//		ObjectOutputStream out = new ObjectOutputStream(
//				new BufferedOutputStream(new FileOutputStream("doctor.ser")));
//		
//		out.writeObject(doctor);
//		
//		out.close();
//		System.out.println("Created Serialized Object doctor.ser");
//		
//	
//	}
	
	static void doctorDeserialized() throws FileNotFoundException, IOException, ClassNotFoundException {
		System.out.println("Inside doctorDeserialized");
		ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream("doctor.ser")));
		
			Doctor doctor = (Doctor) in.readObject();//Object
			System.out.println("After Deserialized:");
			System.out.println(doctor);
//			System.out.println(doctor.getDefaultWorkHour());
			in.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			doctorSerialized();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			doctorDeserialized();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
