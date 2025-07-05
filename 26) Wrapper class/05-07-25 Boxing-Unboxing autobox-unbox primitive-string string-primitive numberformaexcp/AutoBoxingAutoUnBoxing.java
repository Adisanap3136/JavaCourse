package wrapperClass;

public class AutoBoxingAutoUnBoxing 
{
	public static void main(String[] args)
	{
//		THESE WE ONLY UNDERSTAND WHEN WE KNOW THE CONCEPT OF BOXING AND UNBOXING AND THEIR ALL BACKEND ACTIVITY
		
		Byte b1 = 5;       //Auto Boxing
		byte b2 = b1;          //Auto UnBoxing
		System.out.println("Byte to byte Autobox and Autounbox: "+b2);
		
		Short s1 = 10;            //Auto Boxing
		short s2 = s1;		        //Auto UnBoxing
		System.out.println("Short to short Autobox and Autounbox: "+s2);
		
		Character c1 = 'A';        //autoboxing
		char c2 = c1;				//auto unboxing
		System.out.println("Character to char Autobox and Autounbox: "+c2);
		
		Integer i1 = 100;		//autoboxing
		int i2 = i1;			//auto unboxing
		System.out.println("Integer to int Autobox and Autounbox: "+i2);
		
		Long l1 = 10521531l;		//auto boxing
		long l2 = l1;			//auto unboxing
		System.out.println("Long to long Autobox and Autounbox: "+l2);
		
		Float f1 = 15315.0f;		//auto boxing
		float f2 = f1;				//auto unboxing
		System.out.println("Float to float Autobox and Autounbox: "+f2);
		
		Double d1 = 1313.454;         //autoboxing
		double d2 = d1;				//auto unboxing
		System.out.println("Double to double Autobox and Autounbox: "+d2);
		
		Boolean b3 = true;           //auto boxing
		boolean b4 = b3;			//auto unboxing
		System.out.println("Boolean to boolean Autobox and Autounbox: "+b4);
		
//		here we perform the addition and subtraction of object
	}
}