package javaprogram;
import java.util.Stack;
public class StackDemo {

	public static void main(String[] args) {
		

		Stack s=new Stack();
		s.push(12);
		s.push(55);
		s.push("anji");
		s.push(10);
		s.pop();//remove
		s.push(22);
		
		System.out.println(s);
		
		System.out.println(s.search(12));
		
		System.out.println(s.isEmpty());
		
		System.out.println(s.peek()); 
		
		
		
	}

}
