import java.util.Scanner;
class NumberSeries4   //series is 79 108 139 176 217
{
	public static void main(String[] args)
	{
		System.out.print("Enter the range: ");
		int range = new Scanner(System.in).nextInt();
		int res = 79;
		int prime=29;
		boolean flag =true;
		for(int i =0;i<range;i++)
		{
			for(int j =2;j<(prime/2);j++)
			{
				flag =true;
				if(prime%j==0)
				{
					flag =false;
					j=1;
					prime++;
				}
			}
			if(flag)
			{
				System.out.print(res+" ");
				//System.out.println("pr "+prime);
				res+=prime;
				prime++;
			}
		}
	}
}
/*
i thike the logic is initially the variable 79 then update this variable using prime number start from 29 and this operation do continuously.
*/