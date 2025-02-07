class  For1
{
	public static void main(String[] args) 
	{
		System.out.println(" 1 to 10");
		for (int i = 1;i <=10 ;i++ )
		{
			System.out.print(i+" ");
		}

		System.out.println("\n\n A to Z");

		for (char c = 'A';c<= 'Z';c++ )
		{
			System.out.print(c+" ");
		}

		System.out.println("\n\n  Z to A");

		for (char ch = 'Z';ch>='A' ;ch-- )
		{
			System.out.print(ch+" ");
		}

		System.out.println("\n\n  char  '0' to char '1'");

		for (char x = '0';x<='9' ;x++ )
		{
			System.out.print(x+" ");
		}

		System.out.println("\n\n  Ascii table");

		for (int z = 1; z<=127;z++ )
		{
			System.out.print(z+": "+((char)z)+", ");
		}
		
		
	}
}
