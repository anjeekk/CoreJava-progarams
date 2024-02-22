package javaprogram;


abstract class Oprate{  
	int a;//abstract class
	abstract void add();	// abstract method
	abstract void show();
	void display() {		//concrete method
		System.out.println("this is abstract class......");//definition 
		
	}
	Oprate(){ //constructor 
		
			System.out.println("this is Constructor....");
	}
}
public class Abst extends Oprate{ 	// inheritance
	void add() {					// method overriding 
		int a=10;
		int b=9;
		System.out.println("sum of ...."+(a+b));
		System.out.println("sub of........"+(a-b));
	}
	void show() {
		System.out.println("anji...");
	}

	public static void main(String[] args) {

		//Oprate op=new Oprate();
//		Abst ab=new Abst();
//		ab.add();
//		ab.show();
//		ab.display();
		
		Oprate o=new Abst(); //abstract reference using create object 
		o.display();
		//Abst a=new Abst();
		o.add();
	}

}
