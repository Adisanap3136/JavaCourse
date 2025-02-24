import java.util.Scanner;
class BinaryConversion2
{
	public static void main(String[] args)
	{
		System.out.print("Enter the number: ");
		int num=new Scanner(System.in).nextInt();
		String bin=Integer.toBinaryString(num);
		System.out.println(num+" : "+bin);
	}
}
