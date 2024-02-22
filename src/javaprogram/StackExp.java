package javaprogram;
import java.util.*;

public class StackExp {

	public static void main(String[] args) {

		
		Stack s=new Stack();
		
		s.push(8);
		s.push(10);
		s.push(1);
		s.push(5);
		s.push(50);
		s.push(2);
		
		System.out.println(s);
		
		System.out.println(s.peek());
		
		
		//System.out.println(s.pop());
		
		System.out.println(s.search(2));
	}

}
