package javaprogram;

class parent{
	void msg() {
		System.out.println("hi parents.....");
	}
}

public class AnonymousClassEx {

	public static void main(String[] args) {

		parent p=new parent(); //this is normal 
		p.msg();
		
		parent p1=new parent() {//this is anonymous class create
			void msg() {
				System.out.println("hi helloooo... this is anonymous class..");
			}
		}; //end anonymous class
		p1.msg();
		
	}

}
