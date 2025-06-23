package principleOfOop.principleOfOopPolymorphism.principleOfOopPolymorphismRunTime;
import java.util.Scanner;

public class LoginAndvalidation 
{
	protected String storedId;
	protected String storedPass;
	boolean strongPass = false;
	static Scanner sc = new Scanner(System.in);
	
	public void createAccout()
	{
		System.out.print("Enter the Id: ");
		storedId = sc.next();
		System.out.print("Enter the Password: ");
		 storedPass = sc.next();
		System.out.println("Account created");          //these is old password system, here the password is too much weak so we have to override the method
	}
	
	public void login()
	{
		System.out.print("Enter the Id: ");
		String id = sc.next();
		System.out.print("Enter the Password: ");
		String pass = sc.next();
		
		for(int attempts=3;attempts>=1;attempts--)
		{
			if(storedId.equals(id)&&storedPass.equals(pass))
				System.out.println("Login Success");
			else
			{
				System.out.println("Ohh, Please Enter correct credentials or forget password!");
				System.out.println("You have only "+attempts+" attempts left");
				System.out.print("Enter the Id: ");
				 id = sc.next();
				System.out.print("Enter the Password: ");
				 pass = sc.next();
				
			}
		}
	}
}