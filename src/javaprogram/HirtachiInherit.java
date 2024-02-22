package javaprogram;


class AAA{
	AAA(){}
	int p;
	AAA(int p){
		this.p=p;
	}

}
class BBB extends AAA{
	int q;
	BBB(){}
	BBB(int p, int q){
		this.p=p;
		this.q=q;
	}
	void add() {
		System.out.println("sum of p and q is..:"+(p+q));
	}
}
class CCC extends AAA{
	int r;
	CCC(){}
	CCC(int p,int r){
		this.p=p;
		this.r=r;
	}
	void add() {
		System.out.println("sumof p and r is:.."+(p+r));
		
	}
}

public class HirtachiInherit {

	public static void main(String[] args) {

		BBB ob=new BBB(100,200);
		ob.add();
		
		CCC obj=new CCC(50,60);
		obj.add();
		
		
	}

}
