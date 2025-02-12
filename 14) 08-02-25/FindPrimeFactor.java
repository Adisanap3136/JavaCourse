import java.util.Scanner;
class FindPrimeFactor
{
	public static void main(String[] args)
	{
		System.out.print("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		int temp=0;
		for (int i = 1;i<=num;i++)
		{
			if(num%i==0)
			{
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						temp=1;
					}
				}
				if(temp==0){
					System.out.println("Prime factor is: "+i);
				}
				else
					temp=0;

			}
		}
	}
}