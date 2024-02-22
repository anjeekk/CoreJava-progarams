package javaprogram;

class Add{
	int a,b;
	void add() {
		System.out.println("sum of.."+(a+b));
	}
	Add(int a , int b){
		this.a=a;
		this.b=b;
	}
}

class Sub extends Add{


	Sub(int a, int b) {
		super(a, b);
	}

	void sub() {
		System.out.println("sub of two...."+(a-b));
	}
	
}

class Mul extends Sub{
	Mul(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	void mul() {
		System.out.println("mul of  two..."+(a*b));
	}
}


public class Inherit {

	public static void main(String[] args) {

		Mul m=new Mul(5,6);
		m.add();
		m.sub();
		m.mul();
	}

}
