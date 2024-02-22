
package javaprogram;
import java.io.*;
import java.util.Scanner;
public class stringReverse {

	public static void main(String[] args) {

		String str,rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		str=sc.nextLine();
		int len=str.length();
		for(int i=0;i<len-1;i++)			
		
			rev=rev+str.charAt(i);

			if(str.equals(rev)) {
				System.out.println("reverse.....");
			}
				else
				{
					System.out.println("not reverse.......");
				}
			}
	

}
