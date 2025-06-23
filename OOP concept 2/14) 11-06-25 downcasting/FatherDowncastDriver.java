package principleOfOopUpcastDowncast;

public class FatherDowncastDriver 
{
	public static void main (String [] args)
	{
		Father f1 = new Son();
		f1.drinking();        //upcasting
		
		Son s1 = (Son)f1;       //downcasting
		s1.drinking();
		s1.smoking();
	}
}
