package javaprogram;

import java.io.*;

public class BufferDemo {

	public static void main(String[] args)throws IOException {

		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter 1St Number...");
		int x=Integer.parseInt(br.readLine()); //read the user text 
		

		System.out.println("Enter 2nd Number...");
		int y=Integer.parseInt(br.readLine());
		
		System.out.println("sum of two values is...."+(x+y));
		
		
		
	}

}
