package exceptionsAndExceptionHandling;

import java.util.Scanner;

public class ArithmeticException 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num one: ");
		int num = sc.nextInt();
		System.out.println("Enter num two: ");
		int den = sc.nextInt();
		
		try {
		int res = num/den;
		System.out.println("Result is: "+res);
		}
		catch(Throwable ref){
			System.out.println("cannot divide by zero: "+ref);
		}
		
		System.out.println("Thank you");
	}
}
// here i handled only java.lang.ArithmeticException: / by zero 