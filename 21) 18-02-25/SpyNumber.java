import java.util.Scanner;
class SpyNumber
{
	public static void main(String[] args)
	{
		System.out.print("Enter the Number: ");
		int num = new Scanner(System.in).nextInt();
		int sum=0,prod=1;
		for(int i=num;i>0;i/=10)
		{
			sum+=(i%10);
			prod*=(i%10);
		}
		System.out.println(sum==prod?num+" is SPY NUMBER!":num+" is NOT SPY NUMBER!");
	}
}

//spy number is a number whose all digits sum and all digits multiplication is same then the number is called SpyNumber. ex: 1124,132