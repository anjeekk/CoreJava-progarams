package javaprogram;

import java.util.*;

public class TreesetDemo {

	public static void main(String[] args) {

		TreeSet ts=new TreeSet();
		
		ts.add(20);
		ts.add(10);
		ts.add(30);
		ts.add(5);
		System.out.println(ts);
		
		//Iterator itr=ts.iterator();//default ascending order
		Iterator itr=ts.descendingIterator();
		
		TreeSet ts1=(TreeSet) ts.headSet(20);//below 20 values showing 
		
		TreeSet ts2=(TreeSet) ts.tailSet(20);//20 and above values 
		
		TreeSet ts3=(TreeSet) ts.subSet(5,20);
		
		
		
		System.out.println(ts1);
		
		System.out.println(ts2);
		
		System.out.println(ts3);
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
