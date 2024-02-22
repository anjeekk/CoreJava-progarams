package javaprogram;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadStreamEx {

	public static void main(String[] args) throws IOException {

		
		FileInputStream f= new FileInputStream("E:\\FileExample.txt");
		int i=0;
		while((i=f.read())!=-1) {
			System.out.println((char)i);
			System.out.println(i);//ascii code
		}
		f.close();
		
	}

}
