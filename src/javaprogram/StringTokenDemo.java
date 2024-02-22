package javaprogram;
import java.util.*;
public class StringTokenDemo {

	public static void main(String[] args) {

		String s="wel come to java";
		
		//StringTokenizer st=new StringTokenizer(s);
		
		//StringTokenizer st=new StringTokenizer(s,"e");
		
		StringTokenizer st=new StringTokenizer(s,"a",true);
		
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}
