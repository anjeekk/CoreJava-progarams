package javaprogram;

import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) {
		

		File f=new File("E:\\FileExample.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("file is created");
			}else {
				System.out.println("file already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
