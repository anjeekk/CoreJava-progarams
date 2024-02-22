package javaprogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadEx {

	public static void main(String[] args) throws FileNotFoundException {

		File f=new File("E:\\FileExample.txt");
		
		Scanner s=new Scanner(f);
		while(s.hasNextLine()) {
			String data=s.nextLine();
			System.out.println(data);
		}
		s.close();
	}

}
