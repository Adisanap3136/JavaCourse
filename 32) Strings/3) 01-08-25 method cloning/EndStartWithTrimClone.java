package strings;

public class EndStartWithTrimClone 
{
	public static boolean startsWith(String s,String prefix)
	{
		if(prefix.length()>s.length())
			return false;
		int value = prefix.length()-1;
		if(prefix=="")
			return true;
		if(s.charAt(value)==prefix.charAt(value))
			return true;
		return false;
	}
	public static boolean endsWith(String s,String suffix)
	{
		if(suffix=="")
			return true;
		if(s.charAt(s.length()-1)==suffix.charAt(suffix.length()-1))
			return true;
		return false;
	}
	public static String trim(String s)
	{
		int start;
		int end;
		for(start=0;start<s.length();start++)
			if(s.charAt(start)!=' ')
				break;
		for(end =s.length()-1;end>0;end--)
			if(s.charAt(end)!=' ')
				break;
		char[]ar = new char[(end-start)+1];
		for(int i=0,j=0;i<s.length();i++)
		{
			if(i>=start && i<=end)
				ar[j++] = s.charAt(i);
		}
		return new String(ar);
	}
	public static String concat(String s, String add)
	{
		return s+add;
	}
	public static void main(String[]asrgs)
	{
		String s = "i love India";
		s.contains(s);
	}
}