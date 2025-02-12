//scenario is ip A: 1 B:2 C:3 Z:26 AA:27 AB:28 AZ:52

import java.util.Scanner;
class AtoZWithNumber
{
	public static void main(String[] args)
	{
		System.out.print("Enter the character: ");
		String str = new Scanner(System.in).nextLine().toUpperCase();
		int op=0;
		char ch=str.charAt(0);
		if(str.length()>2)
		{
			System.out.println("INVALID STRING");
			return;
		}
		op=(ch-64);
		if(str.length()==2)
		{
			char ch1=str.charAt(1);
			op=(op*26)+(ch1-64);
		}
		System.out.println(str+" : "+op);
	}
}