import java.util.Scanner;
class WhetherTheStringIsPalindromeOrNot 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the String: ");
		String str = new Scanner(System.in).next();
		String pld = str;
		String revStr ="";
		for(int i=0;i<str.length();i++)
		{
			revStr=str.charAt(i)+revStr;
		}
		if(pld.equals(revStr))
			System.out.println(pld+" : is Palindrome ");
		else
			System.out.println(pld+" : is not Palindrome: "+revStr);
	}
}
