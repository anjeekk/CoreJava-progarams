package javaprogram;
import java.util.*;

public class Hashmapdemoexp {

	public static void main(String[] args) {
		
		//HashMap h =new HashMap(); un order
		
		//LinkedHashMap h=new LinkedHashMap(); order list
		TreeMap h=new TreeMap(); //alpha ordered
		
		h.put("first","sss");
		h.put("1","abc");
		h.put("3", "deepa");
		h.put("2","xyz");
		h.put("last","aaa");
		h.put("6","hhh");
	
		
		System.out.println(h);
		 //System.out.println(h.get("1"));
		 Set s=h.keySet();
		
		 Iterator i=s.iterator();
		 while(i.hasNext()) {
			 Object obj=i.next();
			
			 String s1=(String) obj;
			 
			
			 
			System.out.println(s1+":"+h.get(s1));
			 //System.out.println(s1);
			 
		 }
		

	}

	

}
