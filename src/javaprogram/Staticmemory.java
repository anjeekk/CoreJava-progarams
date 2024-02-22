package javaprogram;



class Studentt{
	int roll;   //instance variable
	String name;
	static String college="VITS"; //static variable
	Studentt(int r, String n){
		roll=r;
		name=n;
	}
//	static void Change() { // Static method
//		college="GOVT";
//	}
	void display() {//instance method
		System.out.println(roll+" "+name+" "+college);
	}
	
}

public class Staticmemory {

	public static void main(String[] args) {

		//Studentt.Change();// create static method object
		Studentt s1=new Studentt(1,"raj");
		Studentt s2=new Studentt (2,"sagar");
		s1.display();//create instance method object
		s2.display();
	}

}
