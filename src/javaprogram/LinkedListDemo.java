package javaprogram;

import java.util.Iterator;
import java.util.LinkedList;

class Student1{
	int rno;
	Student1(int rno){
		this.rno=rno;
		
	}
	public String toString() {//hashcode to string 
		return " "+rno;
	}
}
public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Student1> ll=new LinkedList<>();
		ll.add(new Student1(45));//create object
		ll.add(new Student1(60));
		//or
		Student1 s1=new Student1(55);
		ll.add(s1);
		
		Iterator<Student1> itr= ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
