package strings;

import java.util.Arrays;

public class StringToByteArray 
{
	public static byte[] toByteArray(String s)
	{
		byte[]b = new byte[s.length()];
		for(int i=0;i<s.length();i++)
			b[i] = (byte)s.charAt(i);
		return b;
	}
	public static void main(String[]arga)
	{
		String s = "I love My India";
		System.out.println(Arrays.toString(toByteArray(s)));
	}
}