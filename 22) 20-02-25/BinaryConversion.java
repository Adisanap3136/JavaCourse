import java.util.Scanner;
class BinaryConversion
{
	public static void main(String[] args)
	{
		System.out.print("Enter the Number: ");
		int num=new Scanner(System.in).nextInt();
		String bin="";
		for(int i=num;i>0;i/=2)
			bin =(i%2)+bin;

		System.out.println(num+" : "+bin);
	}
}
