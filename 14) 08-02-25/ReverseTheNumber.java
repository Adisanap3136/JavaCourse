import java.util.Scanner;
class ReverseTheNumber
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		int num = new Scanner(System.in).nextInt();
		int rev=0;
		if(num<0)
		{
			num=num*(-1);
			//num=Math.abs(num);
		while(num>0)
		{
			rev=rev*10+(num%10);
			num/=10;
		}
		System.out.println(rev*(-1));
		}
		else
		{
			while(num>0)
		{
			rev=rev*10+(num%10);
			num/=10;
		}
		System.out.println(rev);
		}
	}
}
//we aslo convert num into negative or positive like this num=num*(-1)
//in this code we use built in class Math.abs() -> which can convert negative number to positive
//after converting negative number to positive then it cant reverse the num then again we convert positive num to negativee using *(-1)