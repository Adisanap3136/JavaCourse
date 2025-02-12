import java.util.Scanner;
class ReverseTheString1 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Something: ");
		String str = new Scanner(System.in).next().toUpperCase();
		String rev = "";
		for (int i = 0;i<str.length();i++)
		{
			rev =str.charAt(i)+rev;
			System.out.println(rev);
		}
	}
}