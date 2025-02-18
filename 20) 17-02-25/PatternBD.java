class PatternBD
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=1;i<=n;i++)       //B
		{
			for(int j=2;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}

		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

/*
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*
*/