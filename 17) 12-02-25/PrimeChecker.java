import java.util.Scanner;
class PrimeChecker
{
	public static void main(String[] args)
	{
		System.out.print("Enter the num: ");
		int num =new Scanner(System.in).nextInt();
		int temp=0;
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					temp=1;
					break;
				}
			}
				if(temp==0)
				{
					System.out.println("Prime");
				}
				else
				{
					System.out.println("Not Prime");
					temp=0;
				}
	}
}
