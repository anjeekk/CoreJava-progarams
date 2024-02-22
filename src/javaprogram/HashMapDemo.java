package javaprogram;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		

		//HashMap h=new HashMap(); //unordered values 
		//LinkedHashMap h=new LinkedHashMap<>();//orders values
		
		//TreeMap h=new TreeMap<>();//alphabetically ordered 
		HashMap h=new HashMap();//synchronized unordered 
		
		h.put("last","anji");
		h.put("second","anjee");
		h.put("first","anji");
		System.out.println(h.get("last"));
		System.out.println(h);
		
		Set s=h.keySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Object obj=itr.next();
			
			String str=(String) obj;
			System.out.println(str+" : "+h.get(str));
		}
		
	}

}
