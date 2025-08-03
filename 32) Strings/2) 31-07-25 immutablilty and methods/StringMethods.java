package strings;

import java.util.Arrays;

public class StringMethods 
{
	public static void main(String args[])
	{
		String s = "pneumonoultramicroscopicsilicovolcanoniosis";
		
		System.out.println(s.charAt(0));
		System.out.println(s.codePointAt(9));
		System.out.println(s.codePointBefore(9));
		System.out.println(s.codePointCount(6, 7));
		System.out.println("aditya".compareTo("Aditya"));
		System.out.println("Vinay".compareToIgnoreCase("vinay"));
		System.out.println("hi".concat("Hello"));
		System.out.println(s.contains("volcano"));
		System.out.println("Hi".contentEquals("Hii"));
		System.out.println(s.endsWith("s"));
		System.out.println(s.startsWith("p"));
		
		byte []ar = s.getBytes();
		
		System.out.println(Arrays.toString(ar));
		System.out.println(ar.length);
		
//		System.out.println(s.indent(10));
		System.out.println(s.indexOf('p'));
		
		System.out.println(s.indexOf("p", 6));
		
		System.out.println(s.indexOf("volcano"));
//		System.out.println("".isBlank());
		System.out.println("".isEmpty());
		System.out.println(s.lastIndexOf("s"));
		System.out.println(s.length());
//		System.out.println("ABC".repeat(5));
		System.out.println(s.replace('o', '$'));
		System.out.println(s.replace("volcano", "########"));
		String s2 = "I love India";
		String [] words = s2.split(" ");
		System.out.println(Arrays.toString(words));
//		System.out.println("           ABC         ".strip());
		System.out.println("    ABC      ".trim());
		System.out.println(s.substring(9));
		System.out.println(s.substring(9, 15));
		char []ch = s.toCharArray();
		System.out.println(Arrays.toString(ch));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
	}
}
