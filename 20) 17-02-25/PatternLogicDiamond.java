class PatternLogicDiamond
{
	public static void main(String[] args)
	{
		int n=5;

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)//A
				System.out.print("  ");
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			for(int j=2;j<=i;j++)//B
				System.out.print("* ");
			System.out.println();
		}
		for(int i=n-1;i>0;i--)  //here i use n-1 for decrement one iteration
		{
			for(int j=1;j<=(n-i);j++)//C
				System.out.print("  ");
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			for(int j=2;j<=i;j++)//D
				System.out.print("* ");
			System.out.println();
		}
	}
}
/*
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
*/