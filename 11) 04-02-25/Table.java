import java.util.Scanner;
class Table
{
	public static void main(String [] args)
	{
		System.out.print("Enter the number you want to get table: ");
		int num = new Scanner(System.in).nextInt();
		System.out.print("Enter the limit you will print: ");
		int limit = new Scanner(System.in).nextInt();
		for (int i=1; i<=limit; i++)
		{
			System.out.println(num+"x"+i+" = "+(i*num));
		}
	}
}