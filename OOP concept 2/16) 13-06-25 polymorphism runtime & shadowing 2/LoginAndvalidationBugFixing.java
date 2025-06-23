package principleOfOop.principleOfOopPolymorphism.principleOfOopPolymorphismRunTime;

public class LoginAndvalidationBugFixing extends LoginAndvalidation
{
	public void createAccout()
	{
		System.out.print("Enter the Id: ");
		storedId = sc.next();
		System.out.print("Enter the Password: ");
		String newPass = sc.next();
		
		boolean uppercase=false;
		boolean lowercase = false;
		boolean symbols = false;
		boolean numbers = false;
		
		for(int i=0;i<newPass.length();i++)
		{
			if(newPass.charAt(i)>=65&&newPass.charAt(i)<=90)
				uppercase = true;
			else if(newPass.charAt(i)>=97&&newPass.charAt(i)<=122)
				lowercase = true;
			else if(newPass.charAt(i)>=47&&newPass.charAt(i)<=56)
				numbers=true;
			
			else if(!(uppercase&&lowercase&&numbers))
				symbols = true;
		}
		if(uppercase&&lowercase&&symbols&&numbers)
		{
			storedPass=newPass;
			strongPass = true;
			System.out.println("Account created");
		}
		else
		{
			System.out.println("make strong password");
			return;
		}
	} 
}
