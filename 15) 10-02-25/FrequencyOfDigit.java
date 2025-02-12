import java.util.Scanner;
class FrequencyOfDigit 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		long num= new Scanner(System.in).nextLong();
		System.out.println(num);
		for(int i=0;i<=9;i++)
		{
			int freq=0;
			for (long j=num;j>0;j/=10)
			{
				long rem=j%10;
				if(i==rem)
				{
					freq++;
				}
			}
			if (freq!=0)
				System.out.println(i+" : "+freq);
		}
	}
}