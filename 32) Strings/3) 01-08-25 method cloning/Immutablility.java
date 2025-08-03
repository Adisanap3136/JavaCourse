package strings;

public class Immutablility 
{
	public static void main(String[]args)
	{
		String s1 = "Qspider";
		System.out.println(s1.hashCode());
		
		String s2 = s1+ "Deccan";
		System.out.println(s2.hashCode());
		System.out.println(s1==s2);      //false
		System.out.println(s1.equals(s2));         //false
		
		String s3 = s2 + "Pune";
		System.out.println(s3.hashCode());
		System.out.println(s2==s3);    //false
		System.out.println(s3.equals(s2));     //false
	}
}