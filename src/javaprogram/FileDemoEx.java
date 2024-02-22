package javaprogram;

import java.io.File;

public class FileDemoEx {

	public static void main(String[] args) {

		File f=new File("E:\\FileExample.txt");
		if(f.exists()) {
			System.out.println(f.getName());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.length());
			System.out.println(f.canRead());
			System.out.println(f.canWrite());
		}else {
			System.out.println("file not exists");
		}
	}

}
