import java.util.Scanner;
class Fibonci
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter end: ");
		long end=sc.nextInt();
		long a =0;
		long b =1;
		System.out.print(a+" "+b);
		long c;
		for(int i=1;i<=end;i++)
		{
			c =a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}