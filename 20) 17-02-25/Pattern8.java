class Pattern8
{
	public static void main(String[] args)
	{
		int n=4;
		for(int i=1,z=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(z+" ");
				z+=2;
			}
			System.out.println();
		}
	}
}
/*
1
3 5
7 9 11
13 15 17 19
*/