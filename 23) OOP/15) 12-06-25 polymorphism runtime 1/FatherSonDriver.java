package principleOfOop.principleOfOopPolymorphism.principleOfOopPolymorphismRunTime;

public class FatherSonDriver 
{
	public static void main(String[] args) 
	{
		Father f1 = new Son();        //first upcast to super class
		f1.finance();
		f1.nameInMarket();
		System.out.println(f1.a);
		System.out.println(f1.b);
		
		Son son = new Son();
		System.out.println(son.a);
		System.out.println(son.b);
	}
}