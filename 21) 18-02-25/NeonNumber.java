import java.util.Scanner;
class NeonNumber
{
	public static void main(String[] args)
	{
		System.out.print("Enter the number: ");
		int num =new Scanner(System.in).nextInt();
		int square =num*num;
		int sum=0;
		for(int i =square;i>0;i/=10)
		{
			sum = sum+(i%10);
		}
		if(sum==num)
			System.out.println(num+" is Neon Number");
		else
			System.out.println(num+" is Not Neon Number");
	}
}
//neon number is a number whose squares each digits addition is equal to given number are called as neon number ex: 9