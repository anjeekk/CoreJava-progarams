package javaprogram;
import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		

		HashSet h=new HashSet();
		
		h.add("anji");
		h.add("abhi");
		h.add("shekar");
		h.add("raj");
		
		System.out.println(h);
		
		Iterator i= h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
