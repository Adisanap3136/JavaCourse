package exceptionsAndExceptionHandling;
import java.util.Scanner;
public class DivideByZeroDoubletype 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num one: ");
		double num=sc.nextDouble();
		System.out.println("Enter num two: ");
		int den=sc.nextInt();
		
		double res = num/den;
		
		System.out.println("Resut: "+res);
	}
}
//if we use double data type for the numerator or denominator so the result is INFINITY rather than exception
// here the exception only occurs when the whole number is used