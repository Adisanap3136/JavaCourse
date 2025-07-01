package principleOfOop.Abstraction;

public class NumberProgramImple extends NumberProgramAbstract
{
	public NumberProgramImple() 
	{
		System.out.println("Here the Abstracted method is implemented using method Overrideing");
	}
	
//	prime number
	public boolean isPrime(int n) 
	{
		if(n<2)return false;
		for(int den=2;den<n;den++)
			if(n%den==0)
				return false;
		return true;
	}
	
//  even odd program
	public boolean isEvenOdd(int n) 
	{
		return n%2==0?true:false;
	}
	
//	reverse num
	public int reverseNum(int n) 
	{
		int rev=0;
		for(int i = n;i!=0;i/=10)
		{
			rev = rev*10+i%10;
		}
		return rev;
	}
	
//	power of number
	public int pow(int num,int pow)
	{
		int nPow=1;
		for(int i=1;i<=pow;i++)
		{
			nPow*=num;
		}
		return nPow;
	}

//	Square Root 
	public int squareRoot(int i)
	{
		for(int n=1;;n++)
		{
			if(n*n==i)
				return n;
		}
	}
	
//	length of number
	public int lengthOfNum(int n)
	{
		int len=0;
		while(n!=0)
		{
			len++;
			n/=10;
		}
		return len;
	}

//	armstrong number
	public boolean isArmstrongNum(int n)
	{
		int armstr=0;
		for(int i=n;i!=0;i/=10)
		{
				armstr+=(pow(i%10, lengthOfNum(n)));
		}
		return armstr==n?true:false;
	}
	
//	maximum number
	public int maxNumber(int n,int m)
	{
		return n>m?n:m;
	}
	
//	square of number
	public int squareOfNum(int n)
	{
		return n*n;
	}
	
//	factorial number
	public int factorial(int n)
	{
		int fact=1;
		for(int i=n;i>0;i--)
			fact*=i;
		return fact;
	}
	
//	this class own method() because of restriction we cannot run this mwthod
	public void something()
	{
		System.out.println("My Own Method()");
	}
}
