package javaprogram;

public class GarbageEx {

	public static void main(String[] args) {
		
		GarbageEx g=new GarbageEx();
		GarbageEx g1=new GarbageEx();
		g=null;
		g1=null;
		//g=g1;
		new GarbageEx();
		System.gc();

	}
	public void finalize() {
		System.out.println("garbage collector called ");
	}

}
