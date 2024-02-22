package javaprogram;

import java.util.*;
public class ListIteratorEx {

	public static void main(String[] args) {
		
		List<String> li= new ArrayList<String>();
		
		li.add("deepa");
		li.add("thanu");
		li.add("shalini");
		li.add("raj");
		li.add("deepa");
		
//		
//		for(String s:li) {
//			System.out.println(s);
//		}
//		
//		li.forEach(a->{System.out.println(a);});
		
		ListIterator<String> it=li.listIterator();
		
		//Iterator it=li.iterator();
		
		System.out.println("forword direction........");
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("reverse direction......");
		
		while(it.hasPrevious()) {
			System.out.println(it.previous());
			
		}
	}

}
