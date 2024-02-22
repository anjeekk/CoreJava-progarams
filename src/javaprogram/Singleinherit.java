package javaprogram;
//Using constructor create single inheritance
class AA{
	int p;
	AA(){}
	AA(int a){ //constructor 
		p=a;
	}
	void show() {
		System.out.println("this is Parent class..:show method:"+p);
	}
	
}
class BB extends AA{
	int q;
	BB(){}
	BB(int a,int b){
		p=a;
		q=b;
	}
	void display() {
		System.out.println("this is child class .. display method:"+q);
	}
}
class CC extends BB{
	int r;
	CC(){}
	CC(int a,int b, int c){
		p=a;
		q=b;
		r=c;
	}
	void show1() {
	System.out.println("this is CC child class Show1 method..:"+(p+q+r));
}
}
public class Singleinherit {
	public static void main(String args[]) {
		CC obj=new CC(10,20,30);
		obj.show();
		obj.display();
		obj.show1();
	}

}
