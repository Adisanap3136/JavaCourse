package strings;

import java.util.Arrays;

public class CharArrayToString 
{
	public static void main(String[]args)
	{
		char[]ch = {'a','b','c','d','e','f'};
		
		System.out.println(Arrays.toString(ch));
		
		String s = new String(ch);
		
		System.out.println(s);
	}
}
