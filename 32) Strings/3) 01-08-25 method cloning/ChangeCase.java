package strings;

public class ChangeCase 
{
	public static String toUpper(String s)
	{
		char[]ch = new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c >= 'a' && c<='z')
				ch[i] = (char)(c-32);
			else 
				ch[i] = c;
		}
		return new String(ch);
	}
	public static String toLower(String s)
	{
		char[]ch = new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c >= 'A' && c<='Z')
				ch[i] = (char)(c+32);
			else 
				ch[i] = c;
		}
		return new String(ch);
	}
	public static String toggle(String s)
	{
		char[]ch = new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c >= 'a' && c<='z')
				ch[i] = (char) (c-32);
			else if(c >= 'A' && c<='Z')
				ch[i] = (char)(c+32);
			else 
				ch[i] = c;
		}
		return new String(ch);
	}
	public static void main(String []args)
	{
		String s = "jbjUGYUJUGvvg&%465vhvhv67&^";
		System.out.println(toUpper(s));
		System.out.println(toLower(s));
		System.out.print(toggle(s));
	}
}