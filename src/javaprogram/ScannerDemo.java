package javaprogram;
import java.io.*;
import java.util.*;

public class ScannerDemo {

	public static void main(String[] args) {
		

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter u r name...");
		String s=sc.next();
		
		System.out.println("enate a value");
		int a=sc.nextInt();
		System.out.println("enter b value");
		int b=sc.nextInt();
		
		
		System.out.println("sum of.."+(a+b));
		sc.close();//close the connection
		
	}

}
