package javaprogram;
import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		

		LinkedHashSet lh= new LinkedHashSet();
		
		
		lh.add("anji");
		lh.add(10);
		lh.add(50);
		lh.add(10);
		lh.add("anji");//duplicate values not allowed
		
		System.out.println(lh);
		
		Iterator itr=lh.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
