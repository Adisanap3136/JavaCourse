package strings;

import java.util.Arrays;

public class StringToCharArray 
{
	public static char[] toCharArray(String s)
	{
		char[]ch = new char[s.length()];
		for(int i=0;i<s.length();i++)
			ch[i] = s.charAt(i);
		return ch;
	}
	
	public static void main(String[]arga)
	{
		String s = "I love My India";
		System.out.println(Arrays.toString(toCharArray(s)));
	}
}