package wrapperClass;

public class PrimitiveToString 
{
	public static void main(String[] args)
	{
//		To perform the primitive data types into the String 
//		we have an static method called valueof() 
//		this method is overloaded in String class for every data types value
//		we use like this String.valueOf()
		
		byte a1 = 100;
		String a2 = String.valueOf(a1);
		System.out.println("byte to String: "+a2);         //here we can converted into the string
		System.out.println(a2+1010);       //1001010
		
		short s1 = 3276;
		String s2 = String.valueOf(s1);
		System.out.println("short to String: "+s2);

		char c1 = 'A';
		String c2 = String.valueOf(c1);
		System.out.println("char to String: "+c2);
		
		int i1 = 155;
		String i2 = String.valueOf(i1);
		System.out.println("int to String: "+i2);
		
		long l1 = 13554l;
		String l2 = String.valueOf(l1);
		System.out.println("long to String: "+l2);
		
		float f1 = 135.51f;
		String f2 = String.valueOf(f1);
		System.out.println("float to String: "+f2);
		
		double d1 = 5453.3545;
		String d2 = String.valueOf(d1);
		System.out.println("double to String: "+d2);
		
		boolean b1 = true;
		String b2 = String.valueOf(b1);
		System.out.println("boolean to String: "+b2);
		
		String s3 = "something";
		String s4 = String.valueOf(s3);
		System.out.println("String to String usinf valueOf(): "+s4);
	}
}
