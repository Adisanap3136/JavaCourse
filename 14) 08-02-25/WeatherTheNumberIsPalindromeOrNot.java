import java.util.Scanner;
class WeatherTheNumberIsPalindromeOrNot 
{
	public static void main(String[] args) 
	{
		System.out.print("Entert a Number: ");
		int num = new Scanner(System.in).nextInt();
		int pld = num;
		int rev=0;
		boolean flag = false;
		if (num<0)
		{
			flag=true;
			num=num*(-1);
		}
		for (int i=0;i<num;num/=10)
		{
			rev = rev*10+(num%10);
		}
		if(flag)
		{
			rev =rev*(-1);
		}
		if (rev==pld)
		{
			System.out.println("Number is Plaindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}
