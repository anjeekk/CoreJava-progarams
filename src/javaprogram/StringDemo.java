package javaprogram;

public class StringDemo {

	public static void main(java.lang.String[] args) {
		
		String s="ANJI";
		
		String s1=new String ("anjee");
		
		StringBuffer sb=new StringBuffer("heloo Anjee");
		
		System.out.println(s);
		System.out.println(s.charAt(2));
		System.out.println(s1.length());
		System.out.println(s1.compareTo(s));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.substring(2));
		System.out.println(s.replace("i", "eeeee"));
		System.out.println(s1);
		System.out.println(s1.concat(s));//s+s1
		System.out.println(s1.equals(s));
		System.out.println(s.equalsIgnoreCase(s1));
		
		System.out.println("String BUffer....");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.append("..kk"));//adding the String at end
		System.out.println(sb.deleteCharAt(4));
		System.out.println(sb.delete(2, 4));
		
		System.out.println(sb.substring(5));
		System.out.println(sb.substring(1, 5));
		System.out.println(sb.insert(0,"Hey.."));//add the text with position
		System.out.println(sb.replace(0, 4, "hey helow"));
		System.out.println(sb.reverse());
		
	}

}
