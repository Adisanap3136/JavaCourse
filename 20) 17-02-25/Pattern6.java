class Pattern6
{
	public static void main(String[] args)
	{
		int a = 2;
		int n=5;
		for(int i =1;i<=n;i++)
		{
			for(int j =1;j<=i;j++)
			{
				System.out.print(a+" ");
				a+=2;
			}
			System.out.println();
		}
	}
}

/*
2
4 6
8 10 12
14 16 18 20
22 24 26 28 30
*/