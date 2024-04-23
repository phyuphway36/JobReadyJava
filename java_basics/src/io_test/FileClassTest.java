package io_test;

import java.io.File;
import java.io.IOException;

public class FileClassTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\JobReadyJava\\java_basics\\src\\io_test\\filetest\\test.txt");//.. ma htae yin canonical nae absolute nae tutu pal
		File relativeFile =new File("src/io_test/filetest/test.txt");
		File srcDirectory = new File("C:\\JobReadyJava\\java_basics\\src");
		File test1 = new File("C:\\JobReadyJava\\java_basics\\src\\io_test\\filetest\\test1.txt");
		File singleDirectory = new File("src/io_test/filetest/folder1");

		File multipleDirectory = new File("src/io_test/filetest/folder1/folder2/folder3");
		File fileTestDirectory = new File("src/io_test/filetest");
		
		
//		System.out.println(test1.delete());
		System.out.println(multipleDirectory.delete());

		
//		String[] filetestFileOrFolders = fileTestDirectory.list();
//		File[] filetestFileOrFolders = fileTestDirectory.listFiles();
//
//		System.out.println("Inside FileTest Diretory:");
//		for(File temp: filetestFileOrFolders)
//			System.out.println(temp.getName());
	//System.out.println(multipleDirectory.mkdirs());
		
		

//		System.out.println(singleDirectory.mkdir());
//		System.out.println(test1.createNewFile());
		
		
//		System.out.println("File LastModified : "+file.lastModified());
//		System.out.println("File Size : "+file.length()+"bytes");
//		System.out.println("Separator String : "+file.separator);
//		System.out.println("Separator Char : "+file.separatorChar);

//		System.out.println("Separator String : "+relativeFile.separator);
//		System.out.println("Separator Char : "+relativeFile.separatorChar);

		

		
		
//		System.out.println("File can be read: "+srcDirectory.canRead());
//		System.out.println("File can be write: "+srcDirectory.canWrite());
//		System.out.println("File can be execute: "+srcDirectory.canExecute());
//		System.out.println("File is hidden : "+srcDirectory.isHidden());
//		System.out.println("File is Directory : "+srcDirectory.isDirectory());
//		System.out.println("File is Absolute : "+srcDirectory.isAbsolute());
//		
//		System.out.println("File can be read: "+relativeFile.canRead());
//		System.out.println("File can be write: "+relativeFile.canWrite());
//		System.out.println("File can be execute: "+relativeFile.canExecute());
//		System.out.println("File is hidden : "+relativeFile.isHidden());
//		System.out.println("File is Directory : "+relativeFile.isDirectory());
//		System.out.println("File is Absolute : "+relativeFile.isAbsolute());
		//Essential Information
		//allocated -> memory occupied
		//unallocated space-> no occupy memory -> dist 
//		System.out.println("Free Storage : "+ (file.getFreeSpace())/(1024*1024*1024)+"GB");
//		System.out.println("Usable Space : "+ (file.getUsableSpace())/(1024*1024*1024)+"GB");
//		System.out.println("Total Space : "+ (file.getTotalSpace())/(1024*1024*1024)+"GB");
		
		//Check 
//		System.out.println("File can be read: "+file.canRead());
//		System.out.println("File can be write: "+file.canWrite());
//		System.out.println("File can be execute: "+file.canExecute());
//		System.out.println("File is hidden : "+file.isHidden());
//		System.out.println("File is Directory : "+file.isDirectory());
//		System.out.println("File is Absolute : "+file.isAbsolute());



		
		
		//pathname
//		System.out.println("Absolute Path: "+file.getAbsolutePath());
//		System.out.println("Canonical Path: "+file.getCanonicalPath());
//		System.out.println("Relative File Absolute Path: "+ relativeFile.getAbsolutePath());
		
		//exists
//		System.out.println("File Exists : "+ file.exists());//safety 
//		System.out.println("File Relative Exists : "+file.exists());
	}

}
