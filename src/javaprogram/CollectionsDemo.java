package javaprogram;
import java.util.*;

public class CollectionsDemo {

	public static void main(String[] args) {
		

		ArrayList<Integer> ar=new ArrayList();
		
		ar.add(10);
		ar.add(5);
		ar.add(20);
		ar.add(4);
		
		for(int i:ar) {
			System.out.println(i);
		}
		
		
		System.out.println(ar);
		
		Collections.sort(ar);
		
		System.out.println(ar);
		
		Collections.reverse(ar);
		System.out.println(ar);
		Collections.swap(ar, 0,3);
		System.out.println(ar);
		System.out.println(Collections.min(ar));
		System.out.println(Collections.max(ar));
		
		
	}

}
