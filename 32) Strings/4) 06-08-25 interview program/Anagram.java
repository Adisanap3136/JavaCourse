package strings;

public class Anagram 
{
	public static boolean checkAnagram(String s1,String s2)
	{
		if(s1.length()==s2.length())
		{
			int[]ar1 = new int[127];
			int[]ar2 = new int[127];
			
			for(int i=0;i<s1.length();i++)
			{
				ar1[s1.charAt(i)]++;
				ar2[s2.charAt(i)]++;
			}
			for(int i=0;i<s2.length();i++)
			{
				if(ar1[i] != ar2[i])
					return false;
			}
			return true;
		}
		return false;
	}
	public static void main(String []args)
	{
		System.out.println(checkAnagram("a", "A"));
	}
}