package javaprogram;


enum Level{
	LOW,       //public,static,final variables
	MEDIUM,
	HIGH
}

public class EnumarationDemo {
	enum Level1{
		LOW1,
		HIGH1,
		MEDIUM
	}

	public static void main(String[] args) {
		
		Level myvar=Level.HIGH;
		System.out.println(myvar);
		
		Level1 le= Level1.LOW1;
		
		System.out.println(le);
		
		for(Level x:Level.values()) {
			System.out.println("All values....");
			System.out.println(x);

		}

	}

}
