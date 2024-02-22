package javaprogram;

public class equalsOperator {

	public static void main(String[] args) {
		
		String s1= new String("anjii");
		String s2= new String("anji");
		
		String x="abc";
		String y="abc";
		
		
		int a=20;
		int b=20;
		
		//content comparison 
		if( s1.equals(s2)) {
		System.out.println("s1 name s2 name equal");
	}else {
		System.out.println("not equal..");
	}
		//reference comparison 
		if(x==y) {
			System.out.println("A and b is Equal");
		}else {
			System.out.println("A and B not Equal...");
		}
		
		System.out.println(x);
		System.out.println(y);
	}

}
