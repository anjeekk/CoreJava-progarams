package javaprogram;
import java.io.*;
import java.util.Scanner;

public class ExceptionThrowsDemo extends Exception {
	
	public ExceptionThrowsDemo(String str) {
		super(str);
	}

	public static void main(String[] args) throws ExceptionThrowsDemo  { //user create exception 

		System.out.println("enter age.......");
		try {
		Scanner sc =new Scanner(System.in);
		int age=sc.nextInt();
		if(age<18) {
			throw new ExceptionThrowsDemo("your not eligible...");
		}else {
			System.out.println("your eligible.....");
		}
		}catch (ExceptionThrowsDemo e) {
			e.printStackTrace();
		}
				finally {
					//System.exit(0);

			System.out.println("helllooooo");
		}
		
	}

}
