package javaprogram;

//method overloading
class Addition{
	void add(int x, int y) {//same method name add
		System.out.println("sum of two is:"+(x+y));
		
	}
	void add(int x, int y, int z) {//same method name add
		System.out.println("sum of three is:"+(x+y+z));
	}
}

public class OverLoadingEx {

	public static void main(String[] args) {

		Addition ad=new Addition();
		ad.add(15, 20);
		ad.add(1, 2, 3);
	}

}
