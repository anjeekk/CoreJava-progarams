package javaprogram;

public class Singleton {

	private static Singleton singletone_instance=null;
	
	public String str;
	
	private Singleton() { //make constructor is private
		
		str="Hey i am using Singltone class..";
		
	}
	
	public static Singleton getInstance() {//this is lazy initialization 
		
		if(singletone_instance==null) {
			singletone_instance=new Singleton();
		}
		return singletone_instance;
	}
	
	public static void main(String[] args) {

		Singleton x=Singleton.getInstance();

		Singleton y=Singleton.getInstance();

		Singleton z=Singleton.getInstance();
		
		x.str=(x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		z.str=(z.str).toLowerCase();	

		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
	}

}
