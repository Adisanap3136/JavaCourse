import java.util.Scanner;
class ReverseSumOfDigit 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		int num = new Scanner(System.in).nextInt();
		int sum = 0;

		for (;num>0;)
		{
			int rem = num%10;
			sum+=rem;
			num/=10;
		}
		System.out.println(sum);
	}
}


/*

> The Problem Statement is firstly take a unput from user and then extract one by one last digitg and add them and print total
>> i have created a formaula rem = num%10 ehich can access the last digit
>> then i declare a sum variable with initialization 0 , thwn using sum= sum+rem
>> this can do Update the variable.

*/