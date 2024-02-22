package javaprogram;


class Abc{
	void method() {
		System.out.println("am class A method ....");
	}
	
}
interface BC{
	void methodB();
	
}
interface C{
	void methodC();
}
class DX extends Abc implements BC,C{
	public void methodB() {
		System.out.println("this is method of B...");
	}
	public void methodC() {
		System.out.println("this is method of C..");
	}
}

public class MultipleInherit {

	public static void main(String[] args) {

		DX obj=new DX();
		obj.method();
		obj.methodB();
		obj.methodC();
	}

}
