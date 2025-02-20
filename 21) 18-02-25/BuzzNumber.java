import java.util.Scanner;
class BuzzNumber
{
	public static void main(String [] args)
	{
		System.out.print("Enter the Number: ");
		int num=new Scanner(System.in).nextInt();
		if(num%7==0)
			System.out.println(num+" is BUZZ Number");
		else if((num%10)==7)
			System.out.println(num+" is BUZZ Number");
		else
			System.out.println(num+" is NOT BUZZ");
	}
}

//Buzz Number means the number which is completely divisible by 7 and and the number which contain 7 at the end of the given number. ex: 49,127