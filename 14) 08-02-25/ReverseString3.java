import java.util.Scanner;
class ReverseString3 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the string: ");
		String str = new Scanner(System.in).next().toUpperCase();
		StringBuffer rev =new StringBuffer(str);
		System.out.println(rev.reverse());
	}
}