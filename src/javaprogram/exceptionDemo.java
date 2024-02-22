package javaprogram;

public class exceptionDemo {

	static void validate(int age) {
	
		if(age<18) {
			throw new ArithmeticException("you are not eligible for  vote..........");
	}else {
		System.out.println("you are eligible .............");
	}
	}
	
	public static void main(String[] args) {
		
		validate(16);
		System.out.println("vote age is 18.....");

		System.out.println("wel come to Exception .....");

		
		try {
		int a=20;
		int b=0;
		int c=a/b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		}
		catch(ArithmeticException e) {
			e.printStackTrace();//exception name reason class name line no all displaying 
			//System.out.println(e.toString());
			//System.out.println(e.getMessage());
			
		}try {
			int arr[]= {1,5,2};
			arr[2]=3/1;
		}
		//catch(ArithmeticException e) {
			catch(Exception e) {
			e.printStackTrace();
		}
		/*catch(ArrayIndexOutOfBoundsException a) {
		//catch(Exception a) {
			a.printStackTrace();
		}*/
		
		System.out.println("hi.....");
		System.out.println("helooooo.....");
		
		
		
	
			
		}
	
	
	}


