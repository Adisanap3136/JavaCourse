package strings;

public class ReplaceCharacterFromEntireString 
{
	public static String replaceChar(String s, char old, char naya)
	{
		char[]ch = new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(old==c)
				ch[i] = naya;
			else
				ch[i] = c;
		}
		return new String(ch);
	}
	public static void main(String[]args)
	{
		String s = "abcdacjbraahjajva";
		System.out.println(replaceChar(s, 'a', '$'));
	}
}