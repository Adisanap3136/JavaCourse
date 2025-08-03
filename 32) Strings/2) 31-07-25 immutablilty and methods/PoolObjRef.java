package strings;

public class PoolObjRef 
{
	public static void main(String[]args)
	{
		String s = "Bye";
		String s1 = new String(s);
		String s2 = "Bye";
		System.out.println(s1.hashCode());
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s==s2);    //true
		
		System.out.println(s==s1);         //false
	}
}
