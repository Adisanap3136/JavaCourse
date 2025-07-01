package principleOfOop.Abstraction;

class Abc
{
	public Abc() 
	{
		System.out.println("ABC");
	}
}

abstract class Calculator extends Abc
{
	public Calculator() 
	{
		System.out.println("abstract calculator constructor");
	}
	
	public abstract void addition(int a,int b);
	public abstract void subtraction(int x,int y);
	public abstract void multiplication(int m,int n);
	public void division(int a,int b)
	{
		System.out.println("Result is: "+a+" / "+b+" = "+(a/b));
	}
}