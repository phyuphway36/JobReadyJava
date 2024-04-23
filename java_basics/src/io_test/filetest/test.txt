package io_test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest {
	static String fileDir = "src/io_test/img/girl.jpg";
	static String fileOutDir = "src/io_test/img_out/girl-out.jpg";
	
	static void copyImageWithoutBuffer()  {
		System.out.println("Inside copyImageWithoutBuffer");
		File imageInput = new File(fileDir);
		File imageOutput = new File(fileOutDir);
		
		System.out.println("File size is "+imageInput.length()+"bytes");
		
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		
		long startTime = System.nanoTime();
		long elapsedTime = 0;
		
		try {
			inputStream = new FileInputStream(imageInput);
			outputStream = new FileOutputStream(imageOutput);
			
			int readByte = 0;
			while ((readByte = inputStream.read()) != -1) {
				outputStream.write(readByte);
				
			}
			elapsedTime = System.nanoTime()-startTime;
			System.out.println("Elapsed Time: "+ (elapsedTime/1000000)+"ms");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(inputStream != null && outputStream != null) {
				try {
					inputStream.close();
					outputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	static void copyImageWithBuffer()  {
		System.out.println("Inside copyImageWithoutBuffer");
		File imageInput = new File(fileDir);
		File imageOutput = new File(fileOutDir);
		
		System.out.println("File size is "+imageInput.length()+"bytes");
		
		BufferedInputStream bufferInputStream = null;
		BufferedOutputStream bufferOutputStream = null;
		
		long startTime = System.nanoTime();
		long elapsedTime = 0;
		
		byte[] byteBuffer = new byte[4000];
		
		try {
			bufferInputStream = new BufferedInputStream (new FileInputStream(imageInput));
			bufferOutputStream = new BufferedOutputStream(new FileOutputStream(imageOutput));
			
			int noOfBytes = 0;
			while ((noOfBytes = bufferInputStream.read(byteBuffer)) != -1) {
				
				bufferOutputStream.write(byteBuffer,0,noOfBytes);
				
			}
			elapsedTime = System.nanoTime()-startTime;
			System.out.println("Elapsed Time: "+ elapsedTime+"ns");
		} 
			catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(bufferInputStream != null && bufferOutputStream != null) {
				try {
					bufferInputStream.close();
					bufferOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
			
		}
		
	
	
	public static void main(String[] args) {
		//copyImageWithoutBuffer();
		copyImageWithBuffer();
		System.out.println(System.getProperty("file.encoding"));
		
		

	}

}
