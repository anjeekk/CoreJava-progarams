package javaprogram;


	class A{
		int p=10;
		void display() {
			System.out.println("Am Base Class...A..:"+p);
		}
	}
	class B extends A{
		int q=90;
		void show() {
			System.out.println("am Derived class....B..:"+q);
		}
	}

public class singleIn {

	public static void main(String[] args) {

		B obj=new B();
		obj.display();
		obj.show();
	
	}

}
