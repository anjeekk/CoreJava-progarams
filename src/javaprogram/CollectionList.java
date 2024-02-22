package javaprogram;
import java.util.*;

public class CollectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//interface        //implementation class
	
		List<String> l1=new ArrayList<>();

		l1.add("ANJI");
		l1.add("ANU");
		l1.add("alekya");
		l1.add(1,"deepa");//index position
		l1.add("anu");
		
		//l1.set(2, "abhi");//replace anu 
		
		System.out.println(l1);
		
		
		
		l1.sort(Comparator.naturalOrder()); //sorting order upper case lower case 
		
		List <String> l2 =new ArrayList<>();
		
		l2.add("sagar");
		l2.add("kumar");
		l2.add("anji");
		
		l2.addAll(3,l1);//add l1 list with index position
		
		l2.sort(String.CASE_INSENSITIVE_ORDER);//a to z
		
		System.out.println(l2);
		System.out.println(l1.lastIndexOf("deepa"));
		System.out.println(l1.indexOf("anu"));
		
		
		
		System.out.println("showing.."+l1.contains("anu"));//true
		System.out.println(l1.contains("xyz"));//false
		
		for(String s1:l1) {
			System.out.println(s1);
		}
		
		for(String s2:l2) {
			System.out.println(s2);
		}
		System.out.println(l1.equals(l2));
		
		System.out.println(l2.subList(0, 4));
	}

}
