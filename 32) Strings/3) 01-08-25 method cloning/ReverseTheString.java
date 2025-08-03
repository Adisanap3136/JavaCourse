package strings;

public class ReverseTheString 
{
	public static String revString(String s)
	{
		String rev = "";
		for(int i=s.length()-1;i!=0;i--)
			rev = rev + s.charAt(i);
		return rev;
	}
	public static void main(String[]args)
	{
		String s = "abcdef";
		System.out.println(revString(s));
	}
}
