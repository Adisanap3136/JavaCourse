package principleOfOop.Interface;

interface NumberProgram
{
	public static void interPhase()
	{
		System.out.println("interface");
	}
	
	public final int a = 0;
	
	public boolean primeNumber(int n);
	public boolean evenOdd(int n);
	public int suqareRoot(int n);
	public int pow(int n,int raise);
	public int revNumber(int n);
	public int lengthOfNumber(int n);
	public int factorial(int n);
	public int minMaxNumber(int n,int m);
	public int armstrongNumber(int n);
}

class NumberProgramImp implements NumberProgram
{
	
//	prime number feature implementation
	public boolean primeNumber(int n)
	{
		if(n<2)return false;
		for(int den=2;den<n;den++)
			if(n%den==0)
				return false;
		return true;
	}

//	even odd implementation
	public boolean evenOdd(int n)
	{
		return n%2==0;
	}
	
//	square root
	public int suqareRoot(int n)
	{
		for(int i=0;;i++)
		{
			if(i*i==n)
			{
				return i;
			}
			if(i>n)
				break;
		}
		return 0;
	}
	
//	reverse number
	public int revNumber(int n)
	{
		int rev=0;
		for(int i=n;i!=0;i/=10)
			rev = rev *10+(i%10);
		return rev;
	}

//	power of number
	public int pow(int n, int raise) 
	{
		int pow=1;
		for(int i=raise;i>0;i--)
			pow*=n;
		return pow;
	}
	
//	length of number
	public int lengthOfNumber(int n)
	{
		int len=0;
		for(int i=n;i!=0;i/=10)
			len++;
		return len;
	}
	
//	factorial
	public int factorial(int n)
	{
		int fact=1;
		for(int i=n;i>0;i--)
			fact*=i;
		return fact;
	}
	
//	min max number
	public int  minMaxNumber(int n,int m)
	{
		return n>m?n:m;
	}

//	armstrong number
	public int armstrongNumber(int n)
	{
		int armnum=0;
		for(int i=n;i!=0;i/=10)
		{
			armnum+=(pow(i%10, lengthOfNumber(n)));
		}
		return armnum;
	}
}

public class NumberProgramDriver 
{
	public static void main (String[] args)
	{
		NumberProgram n = new NumberProgramImp();
		System.out.println(n.primeNumber(1));
		System.out.println(n.evenOdd(10));
		System.out.println(n.suqareRoot(100));
		System.out.println(n.revNumber(123465));
		System.out.println(n.pow(2,5));
		System.out.println(n.lengthOfNumber(123456));
		System.out.println(n.factorial(5));
		System.out.println(n.minMaxNumber(5, 6));
		System.out.println(n.armstrongNumber(153));
	}
}
