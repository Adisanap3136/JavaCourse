package principleOfOop.Abstraction;

class Task
{
	public Task() 
	{
		System.out.println("Number program implementation in Abstraction");
	}
}
public abstract class NumberProgramAbstract extends Task
{
	public NumberProgramAbstract() 
	{
		System.out.println("Here only the fratures is specify");
	}
	public abstract boolean isPrime(int n);
	public abstract boolean isEvenOdd(int n);
	public abstract int reverseNum(int n);
	public abstract int pow(int n,int raise);
	public abstract int squareRoot(int n);
	public abstract int lengthOfNum(int n);
	public abstract boolean isArmstrongNum(int n);
	public abstract int maxNumber(int n,int m);
	public abstract int squareOfNum(int n);
	public abstract int factorial(int n);
}
