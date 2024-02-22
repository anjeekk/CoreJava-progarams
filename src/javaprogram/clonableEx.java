package javaprogram;

public class clonableEx implements Cloneable {
	
	
	int sno;
	String name;
	
	 clonableEx(int sno, String name) {
		 this.sno=sno;
		 this.name=name;
	
		
	}
	 
	 public Object clone() throws CloneNotSupportedException{
		 return super.clone();//parent clone method calling
	 }
	
	

	public static void main(String[] args) {
		try {
			clonableEx c1= new clonableEx(1,"sagar");
			clonableEx c2=(clonableEx) c1.clone();//deep copy
			c2.sno=2;
			System.out.println(c1.sno+" "+c1.name);
			System.out.println(c2.sno+" "+c2.name);
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
