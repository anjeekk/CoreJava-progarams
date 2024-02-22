package javaprogram;


class Rectangle{
	
	int l,b;
	Rectangle(int l,int b){ //constructor
		this.l=l;
		this.b=b;
	}
}

public class ConstructorEx {

	public static void main(String[] args) {

		Rectangle r=new Rectangle(12, 30);
		System.out.println("Length is..."+r.l);
		System.out.println("Breadth ..."+r.b);
	}

}
