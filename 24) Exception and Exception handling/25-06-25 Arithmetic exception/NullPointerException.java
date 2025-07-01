package exceptionsAndExceptionHandling;

import java.util.Scanner;

public class NullPointerException 
{
	public static void main(String[] args)
	{
		try{
			Scanner sc = null;
			System.out.println("Enter num one: ");
			int num = sc.nextInt();
			System.out.println("Enter num two: ");
			int den = sc.nextInt();
			int res = num/den;
			System.out.println("Result is: "+res);
		}
		catch(Throwable ref)
		{
			System.out.println("dont use null to call some member: "+ref);
		}

		
		System.out.println("Thank you");
	}

}
// here i only handle the java.lang.NullPointerException null pointer exception