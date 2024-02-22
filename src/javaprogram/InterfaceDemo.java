package javaprogram;

interface MyInterface{
	int a=90; //default final variable 
	
	public abstract void m1();
	
	default void show() {
		System.out.println("my interface show....");
	}
}
interface Myinterface2{
	public static final int x=10;
	public abstract void display();
	static void m3() {
		System.out.println("am static method...");
	}
}

class interface1 implements MyInterface,Myinterface2{


	public void m1() {
		System.out.println("this is m1 method.....");		
	}
	
	public void display() {
		System.out.println("interface2 method....");		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {

		//MyInterface in=new interface1();
		
		interface1 in=new interface1();
		in.m1();
		in.show();
		System.out.println(in.a);
		in.display();
		System.out.println(in.x);
		///in.m3();
		Myinterface2.m3();
		
	}

}
