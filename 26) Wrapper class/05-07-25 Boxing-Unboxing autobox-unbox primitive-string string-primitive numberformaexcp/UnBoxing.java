package wrapperClass;

public class UnBoxing 
{
	public static void main(String[] args)
	{
		Byte b1 = new Byte((byte)5);
		byte b2 = b1.byteValue();
		System.out.println("Byte unboxing: "+b2);
		
		Short s1 = new Short((short)1);
		short s2 = s1.shortValue();
		System.out.println("Short unboxing: "+s2);
		
		Character c1 = new Character('A');
		char c2 = c1.charValue();
		System.out.println("Character unboxing: "+c2);

		Integer i1 = new Integer(10);
		int i2 = i1.intValue();
		System.out.println("Integer unboxing: "+i2);
		
		Long l1 = new Long(120);
		long l2 = l1.longValue();
		System.out.println("Long unboxing: "+l2);
				
		Float f1 = new Float(1.2);
		float f2 = f1.floatValue();
		System.out.println("Float unboxing: "+f2);
		
		Double d1 = new Double(1510.3654);
		double d2 = d1.doubleValue();
		System.out.println("Double unboxing: "+d2);
		
		Boolean b3 = new Boolean(false);
		boolean b4 = b3.booleanValue();
		System.out.println("Boolean unboxing: "+b4);
		
		
		System.out.println("Here we perform the widening of 'non-primitive to primitive'..........\"same\" like Primitive to primitive typecasting");
//		double d3 = b1;         //Short object store in primitive double widening is performing
//		double d3 = s1;
//		double d3 = c1;
//		double d3 = i1;
//		double d3 = l1;
		double d3 = f1;
		System.out.println(d3);

//		to run this code uncomment the code lines 
	}
}
