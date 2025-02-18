import java.util.Scanner;
class KrishNumber  //krishnaMurthy Number
{
	public static void main(String[] args)
	{
		System.out.print("Enter the num: ");
		int num= new Scanner(System.in).nextInt();
		int sum=0;
		for (int i =num;i>0;i/=10)
		{
			int rem=i%10;
			//System.out.println(rem);
			int fact=1;
			for(int j=rem;j>=1;j--)
			{
				fact*=j;
			}
				sum+=fact;
				System.out.println(fact);
		}
				System.out.println(sum==num?"kish":"not krish");
	}
}