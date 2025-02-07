import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		int num = new Scanner(System.in).nextInt();
		int fact = 1;
		for (int i = num;i>=1;i--)
		{
			fact*=i;
		}
		System.out.println(num+" : "+fact);
	}
}