package javaprogram;

class Outer{
	
	class Inner{
		void innermethod() {
			System.out.println("this is inner class method...");
		}
	}
	void outermethod() {
		System.out.println("thiss is outer class method...");
		
//		Inner i=new Inner();
//		i.innermethod();
	}
}

public class InnerclassEx {

	public static void main(String[] args) {

		Outer o=new Outer();
		o.outermethod();
		
		Outer.Inner i=new Outer().new Inner();
		i.innermethod();
	
	}

}
