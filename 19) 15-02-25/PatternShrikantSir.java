class PatternShrikantSir
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=1,x=1;i<=n;i++,x++)
		{
			int b=x;
			for(int j=1;j<=i;j++,x+=1)
			{
				System.out.print(b+" ");
				b--;
			}

			System.out.println();
		}
	}
}
/*
1
3 4
6 7 8
10 11 12 13
15 16 17 18 19
*/