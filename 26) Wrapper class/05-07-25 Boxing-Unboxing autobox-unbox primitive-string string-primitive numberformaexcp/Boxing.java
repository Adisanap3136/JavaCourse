package wrapperClass;

public class Boxing 
{
	public static void main(String...args)
	{
//	in java we hace a wrapper class which is present in java.lang package
//		so here the java has give a non primitive class for every primitive data type
//		such as Byte,Short,Character,Integer,Long,Float,Double,Boolean
//		so we create a object of it then use 
		
		Byte b = new Byte((byte)1);
		System.out.println(b);
		
		Short s = new Short((short) 1);
		System.out.println(s);
		
		Character c = new Character('A');
		System.out.println(c);
		
		Integer i1 = new Integer(1);
		System.out.println(i1);
		
		Integer i2 = new Integer(1);
		System.out.println(i2);
		
		System.out.println(b.equals(i2));    //false
		System.out.println(i1==i2);       //false
		
		System.out.println(i1==i2);       //we get false because the equality operator is check reference 
		System.out.println(i1.equals(i2));     //true because the equals method is override  and it check the attributes
		
		Long l = new Long(4);
		System.out.println(l);
		
		Float f = new Float(5);
		System.out.println(f);
		
		Double d1 = new Double(10);
		System.out.println(d1);
		
		Boolean b1 = new Boolean(true);
		System.out.println(b1);

	}
} 
