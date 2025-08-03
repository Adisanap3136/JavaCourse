package strings;

public class LargestCharacter 
{
	public static char largestChar(String s)
	{
		int max = Character.MIN_VALUE;
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)>max)
				max = s.charAt(i);
		return (char)max;
	}
	public static void main(String[]args)
	{
		String s = "az";
		System.out.println(largestChar(s));
	}
}