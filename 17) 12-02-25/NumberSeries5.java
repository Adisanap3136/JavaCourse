import java.util.Scanner;
class NumberSeries5 //series is 1 3 9 33 153 873
{
	public static void main(String[] args)
	{
		System.out.print("Enter the range: ");
		int range= new Scanner(System.in).nextInt() ;
		int temp=range, count =0 ; int res=0 ,fact=1;
		while(temp>0)
		{
			count++;
			temp/=10;
		}
		temp=range;
		while(temp>0)
		{
			int rem=temp%10;
			for(int i = 1;i<=count;i++)
			{
				fact=1;
				for(int j =1;j<=rem;j++)
				{
					fact*=j;
				}
				res+=fact;
			}
		}
		System.out.println(res+ " ");
	}
}
