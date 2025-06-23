package principleOfOopUpcastDowncast;

public class FatherSonUpcastDriver 
{
	public static void main (String [] args)
	{
		Father f1 = new Son();    //here we store reference of child class into the super class reference variable
		f1.drinking();           //upcasting is done here
		//f1.smoking();          //after upcasting we dont execute the child class own member (Restrict the the child class members).
	}
}
