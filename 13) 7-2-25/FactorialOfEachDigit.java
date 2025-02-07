import java.util.Scanner;
class FactorialOfEachDigit 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the num: ");
		int num = new Scanner(System.in).nextInt();
		int sum = 0;
		int dup = num;
		while(num>0)
		{
			int rem=num%10;
			int fact = 1;
			for(int i =rem;i>=1;i--)
			{
				fact*=i;//fact = fact*i;
			}
			System.out.println(fact);
			sum+=fact;
			num/=10;
		}
		System.out.println("num is: "+dup);
		System.out.println("Sum of fact of digit is: "+sum);
	}
}