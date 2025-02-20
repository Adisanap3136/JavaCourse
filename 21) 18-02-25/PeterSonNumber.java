import java.util.Scanner;
class PeterSonNumber
{
	public static void main(String[] args)
	{
		System.out.print("Enter the Number: ");
		int num=new Scanner(System.in).nextInt();
		int sum=0;
		for(int i =num;i>0;i/=10)
		{
			int fact=1;
			for(int j=1;j<=(i%10);j++)
			{
				fact*=j;
			}
			sum+=fact;
		}
			System.out.println(sum==num?num+" is PETERSON NUMBER!":num+" is NOT PETERSON NUMBER!");
	}
}
//PETERSON number is a number which every digit factorials sum is equal to the given number is known as PETERSON Number. ex: 145, 40585, 1, 2