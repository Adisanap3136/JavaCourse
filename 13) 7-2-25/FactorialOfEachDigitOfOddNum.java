import java.util.Scanner;
class FactorialOfEachDigitOfOddNum 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the num: ");
		int num = new Scanner(System.in).nextInt();
		int oddSum = 0;
		int dup = num;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2!=0)
			{
				int fact = 1;
				for(int i =rem;i>=1;i--)
				{
					fact*=i;
					oddSum+=fact;
				}
			}
			num/=10;
		}
		System.out.println("num is: "+dup);
		System.out.println("Sum of fact of digit is: "+oddSum);
	}
}