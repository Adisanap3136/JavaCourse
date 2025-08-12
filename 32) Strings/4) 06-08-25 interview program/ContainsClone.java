package strings;

public class ContainsClone 
{
	public static boolean contains(String s1,String s2)
	{
		int check=0;
		for(int i=0;i<s1.length();i++)
		{
			if(check<s2.length() && s1.charAt(i)==s2.charAt(check))
			{
				check++;
			}
			else
			{
				if(check==s2.length())
				{
					return true;
				}
				else if(check>0)
				{
					i-=check;
					check=0;
				}
			}
		}
		return check==s2.length();
	}
	public static void main(String[]args)
	{
		System.out.println(contains("abksbuckbs", "sbuch"));
	}
}
