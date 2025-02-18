class PatternAC
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=1;i<=n;i++) //A
		{
			for(int j=1;j<=n-i;j++)
				System.out.print("  ");
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
		for(int i=n-1;i>0;i--)  //C   //here i use n-1 for decrement one iteration
		{
			for(int j=1;j<=n-i;j++)
				System.out.print("  ");
			for(int j=1;j<=i;j++)
				System.out.print("* ");
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