class AtoZ
{
	public static void main(String[] args)
	{
	//Find string "A C F J O U" from A to Z.
		int a = 1;
		for (char c = 'A';c<='Z';c+=a)
		{
			System.out.print(c+" ");
			a++;
		}
	}
}