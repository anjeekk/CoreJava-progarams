package javaprogram;
import java.util.*;



class Student{
	int rno;
	String name, address;
	
	Student(int rno, String name, String address){
	
		this.rno=rno;
		this.name=name;
		this.address=address;
	}
}
public class CollectionStudentDemo {

	public static void main(String[] args) {
		

		List<Student> list=new ArrayList<>();
		
		Student s1= new Student(1,"thanu","HYD");
		Student s2= new Student(2,"shalini","HYD");
		Student s3= new Student(3,"deepa","HYD");
		Student s4= new Student(4,"raj","HYD");
		Student s5= new Student(5,"anji","KNR");
		
		
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		//list.clear();//not showing above records
		list.add(s4);
		list.add(s5);
		for(Student s:list) {
			System.out.println(s.rno+" "+s.name+" "+s.address);
		}
		
	
		
		
		
	}

}
