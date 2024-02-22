package javaprogram;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo {

	public static void main(String[] args) throws IOException {

		FileOutputStream f=new FileOutputStream("E:\\FileExample.txt");
		String s="welcome to file output stream....";
		String s1="welcome to JAVA file ....";
		byte b[]=s.getBytes();
		byte b1[]=s1.getBytes();
		
		f.write(b);
		f.write(b1);
		f.close();
		System.out.println("success......");
		
	}

}
