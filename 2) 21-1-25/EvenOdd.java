//21-01-2025 Kokate sir > Even odd using modulus and without using modulus

import java.util.Scanner;
class EvenOdd 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		int num = new Scanner(System.in).nextInt();
//in op -> true = even and false = odd.
		System.out.print("With %: ");		
		System.out.println(num%2==0);
		System.out.print("Without % (logic 1): ");
		System.out.println((num/2)*2 == num);
		System.out.print("Without % (logic 2): ");
		System.out.println(num/2==num/2.0);
	}
}