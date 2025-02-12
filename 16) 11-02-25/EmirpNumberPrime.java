//If the num is 31 and make it reverse and then check is it prime or not is called emirp number.
import java.util.Scanner;
class EmirpNumberPrime
{
	public static void main(String[] args)
	{
		System.out.print("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		int rev=0;
		boolean flag = false;
		for (int i =2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println("num is not an emrip");
		else{
		for(int i =num;num>0;num/=10)
		{
			rev=rev*10+(num%10);
		}
		for (int i =2;i<=rev/2;i++)
		{
			if(rev%i==0)
			{
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println("it is not an emrip");
		else
			System.out.println("it is an emrip");
		}
	}
}