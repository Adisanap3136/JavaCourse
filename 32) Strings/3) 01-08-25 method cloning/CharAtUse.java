package strings;

public class CharAtUse 
{
	public static void main(String [] args)
	{
		String s = new String("I love My India");
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
	}
}