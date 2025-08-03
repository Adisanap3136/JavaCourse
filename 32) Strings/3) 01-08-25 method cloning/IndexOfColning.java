package strings;

import java.util.Arrays;

public class IndexOfColning 
{
	public static int indexOf(String s,char ele)
	{
		int i;
		for(i =0;i<s.length();i++)
			if(s.charAt(i)==ele)
				return i;
		return -1;
	}
	public static int indexOf(String s,char ele,int from)
	{
		int i;
		for(i =from;i<s.length();i++)
			if(s.charAt(i)==ele)
				return i;
		return -1;
	}
	public static int lastIndexOf(String s,char ele)
	{
		int i;
		for(i =s.length()-1;i!=0;i--)
			if(s.charAt(i)==ele)
				return i;
		return -1;
	}
	public static int lastIndexOf(String s,char ele,int from)
	{
		int i;
		for(i =from;i!=0;i--)
			if(s.charAt(i)==ele)
				return i;
		return -1;
	}
	public static void main(String[]args)
	{
		String s = "abcab$cdabcd";
//		System.out.println(lastIndexOf(s, '$', 5));
//		System.out.println(lastIndexOf(s, 'd'));
//		System.out.println(indexOf(s, 'c', 6));
//		System.out.println(indexOf(s, 'c'));
	}
}
