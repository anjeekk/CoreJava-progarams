package javaprogram;

public class oops {

	
	int a;
	int b;
	
	public oops(int i, int j) {
		a=i;
		b=j;
	}

	public void add() {
		
		System.out.println("sum of two numbers is..." +(a+b));
	}
	
	public static void main(String[] args) {

		oops ob=new oops(12,3);
			ob.add();
	}

}
