package strings;

public class String1 
{
	public static void main(String []args)
	{
//		String s1 = "Hi";
//		String s2 = "Hi";
//		String s3 = "Hi";
//		
//		System.out.println(s1==s2);
//		System.out.println(s1.hashCode());
//		System.out.println(s1.equals(s2));
//		
		String str1 = new String("hello");
		String str2 = new String("hi");
		String str3 = new String("hello");
		
		System.out.println(str1.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str1.equals(str3));
		System.out.println(str1==str2);
	}
}
