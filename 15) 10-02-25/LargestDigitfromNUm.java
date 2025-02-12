import java.util.Scanner;
class LargestDigitfromNUm 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the num: ");
		int num = new Scanner(System.in).nextInt();
		int max  = 0;
		for(int i=num;i>0;i/=10)
		{
			int rem= i%10;
			if(max<rem)
				max = rem;
		}
		System.out.println("Largets digit from "+num+" is: "+max);
	}
}
