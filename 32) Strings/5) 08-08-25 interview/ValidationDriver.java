package strings;
import java.util.Scanner;

public class ValidationDriver
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		Account a1 = new Account("somethig", "7344565445", "some@gmail.com", "Pass@123");
		if(a1.getName()!=null)
			System.out.println(a1);
	}
}