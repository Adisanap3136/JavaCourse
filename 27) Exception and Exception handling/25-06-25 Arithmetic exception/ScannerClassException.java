package exceptionsAndExceptionHandling;

import java.util.Scanner;

public class ScannerClassException 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter num one: ");
			int num = sc.nextInt();
			System.out.print("Enter num two: ");
			int den = sc.nextInt();
			int res = num/den;
			System.out.println(res);
		}
		catch(Throwable ref)
		{
			System.out.println("Please enter valid input: "+ref);
		}
		
		System.out.println("Thank you!");
	}
}
//java.util.InputMismatchException here i only handle the scanner class exception