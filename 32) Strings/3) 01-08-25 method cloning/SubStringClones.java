package strings;

public class SubStringClones 
{
	public static String subString(String s,int index)
	{
		if(index>=0 && index<=s.length())
		{
			char[]c = new char[s.length()-index];
			for(int i=0,j=0;i<s.length();i++)
				if(i>=index)
					c[j++] = s.charAt(i);
			return new String(c);
		}
		else 
			return null;
	}
	public static String subString(String s,int start,int end)
	{
		if(start>=0 && end<=s.length())
		{
			char[]c = new char[s.length()-(end-start)];
			for(int i=0,j=0;i<s.length();i++)
				if(i>=start && i<end)
					c[j++] = s.charAt(i);
			return new String(c);
		}
		else 
			return null;
	}
	public static void main(String[]args)
	{
		String s = "0123456789";
		System.out.println(subString(s, 5,70));
	}
}
