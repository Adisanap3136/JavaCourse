package principleOfOop.Abstraction;

import java.util.Scanner;

public class TcsCode1 
{
	public static boolean isPrime(int n)
	{
		if(n<2) return false;
		for(int den=2;den<n;den++)
		{
			if(n%den==0)
				return false;
		}
		return true;
	}
	public static int nthPrime(int n)
	{
		int cnt=0;
		int nth=0;
		for(;cnt<n;)
		{
			nth++;
			if(isPrime(nth))
			{
				cnt++;
			}
		}
		return nth;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num one: ");
		int n = sc.nextInt();
		System.out.print("Enter num two: ");
		int m = sc.nextInt();
		
		System.out.println((nthPrime(n)*nthPrime(m)-1));
	}
}
