package javaprogram;




class Parent{
	void show() {
		
		System.out.println("this is parent SHOW method");
	}
	void display() {
		System.out.println("this is parent DISPLAY method");
	}
	
}

class Child extends Parent{
	
	void show() {
		System.out.println("this is CHILD SHOW method");
	}
	void print() {
		System.out.println("this is  child PRINT method");
	}
}
public class castingDemo {

	public static void main(String[] args) {
		
		Parent p = (Parent) new Child();
		//Child c=new Child();
		//Child c=(Child) new Parent();
		//Child c=new Parent();//error down casting
		Child c= (Child)p;
		c.display();
		c.show();
		c.print();
		

	}

}
