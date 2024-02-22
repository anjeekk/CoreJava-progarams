package javaprogram;



	public class cloningEx {
		int rollno;
		String name;
		
		cloningEx(int rollno, String name){			
		this.rollno=rollno;
		this.name=name;
	}

	public static void main(String[] args) {
		
		cloningEx s1=new cloningEx(1,"thanu");
		
		cloningEx s2=s1;//shallow copy
		
		//cloningEx s2=new cloningEx(s1.rollno,s1.name);//deep copy
		
		s2.name="shalini";
		System.out.println(s1.rollno+" " +s1.name);
		System.out.println(s2.rollno+" "+s2.name);
	}


}
