package javaprogram;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {

	public static void main(String[] args) throws IOException {

		FileWriter fr=new FileWriter("E:\\FileExample.txt");
		fr.write("hello.....");
		fr.write("welcome ");
		fr.write("welcome ");
		fr.close();
		System.out.println("succefully update....");
	}

}
