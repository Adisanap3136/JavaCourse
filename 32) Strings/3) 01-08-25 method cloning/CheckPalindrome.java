package strings;

public class CheckPalindrome 
{
	public static boolean checkPalindrome(String s)
	{
		int i;
		for(i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
				return false;
		}
		return true;
	}
	public static void main(String[]args)
	{
		String s = "ana";
		System.out.println(checkPalindrome(s));;
	}
}
