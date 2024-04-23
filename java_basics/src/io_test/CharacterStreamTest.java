package io_test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CharacterStreamTest {
	
	static String textFilePath = "C:\\charStringOffline\\text.txt";
	static String writeFilePath1 = "C:\\charStringOffline\\text1.txt";
	static String writeFilePath2 = "C:\\charStringOffline\\text2.txt";
	static String writeFilePath3 = "C:\\charStringOffline\\text3.txt";
	static void scannerReader() {
		
		try {
			Scanner scanner = new Scanner(new File(textFilePath));
			while (scanner.hasNextLine()) {
				
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void writerWithBuffer() {
		File file = new File(writeFilePath3);
		BufferedWriter fileWriter = null;
	try {
		fileWriter = new BufferedWriter(new FileWriter(file));
		fileWriter.write("Buffered String 1");
		fileWriter.write("Buffered String 2");
		fileWriter.write("Buffered String 3");
		fileWriter.write("Buffered String 4");
		fileWriter.write("Buffered String 5");
	   
	    
	    
	    System.out.println("File Created And Write");
	    
	    fileWriter.close();
	    
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	static void printWriterTest() {
		File file = new File(writeFilePath2);
		try {
			PrintWriter out = new PrintWriter(file);
			
			out.println("No Pain No Gain");
			out.println("Google is founded");
			out.println("No Pain No Gain");
			out.println("Google is founded");
			out.println("No Pain No Gain");
			out.println("Google is founded");
			out.close();
			System.out.println("PrintWriter Wrote.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	static void writerWithoutBuffer() {
		File file = new File(writeFilePath1);
		FileWriter fileWriter = null;
	try {
		fileWriter = new FileWriter(file);
	    char[] charArray = {'a','b','c','d','e','f','g','h','i','o','p'};
	    for(int temp: charArray) {
	    	fileWriter.write(temp);
	    }
	    
	    
	    System.out.println("File Created And Write");
	    fileWriter.close();
	    
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	static void textReaderWithBuffer() {
		File file = new File(textFilePath);
		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader(file));
			
			while (fileReader.readLine() != null) {
				System.out.println(fileReader.readLine());
			}
			fileReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			if(fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	//FileReader
	static void textReaderWithoutBuffer() {
		File file = new File(textFilePath);
		File wroteFile = new File(writeFilePath1);
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		try {
			fileReader = new FileReader(file);
			fileWriter = new FileWriter(wroteFile);
			char readChar = 0;
			while (fileReader.read() != -1) {
				System.out.println((char)fileReader.read());
				
			}fileReader.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			if(fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//scannerReader();
		writerWithBuffer();
		//printWriterTest();
		//writerWithoutBuffer();
		//textReaderWithBuffer();
		//textReaderWithoutBuffer();
	}

}
