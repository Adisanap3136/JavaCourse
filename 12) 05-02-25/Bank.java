import java.util.Scanner;
class Bank 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		String name = null;
		String username = null;
		String password = null;
		long phno = 0;
		int balance = 0;
		String address = null;
		for (;;) //first loop
		{
		System.out.println("\n*** Welcome to SBI ****\n");
		System.out.print("1. Exixted User: \n");
		System.out.print("2. Create Account: \n");
		System.out.print("3. Show Detail: \n");
		System.out.print("Enter option: ");
		int opt = sc.nextInt();

		if (opt==1)
		{
			System.out.println("\nInvalid User, Create Account");
			continue;
		}
		else if  (opt==2)
		{
				System.out.print("\nEnter your Name: ");
				name = sc.next();
				sc.nextLine();
				System.out.print("\nEnter username: ");
				username = sc.next();
				System.out.print("\nEnter Password: ");
				password = sc.next();
				System.out.print("\nEnter Phone Numner: ");
				phno = sc.nextLong();
				sc.nextLine();
				System.out.print("\nEnter Address: ");
				address = sc.nextLine();
				System.out.println("\nCreated Successful.");

		}
		else if (opt==3)
		{
			if(!(name==null)){
			System.out.println("\nName:  "+name);
			System.out.println("Contact no:  "+phno);
			System.out.println("Address:  "+address);}
			else
				System.out.println("No Details");
			
		}

		
		for(;;)
		{
			System.out.println("\n*** Home Page ***");
			System.out.println("\nLogin User");
			
			for (int i =3;i>0;i--)
			{
				System.out.print("Enter the username: ");
				String uName = sc.nextLine();
				System.out.print("Enter the Password: ");
				String uPass = sc.nextLine();
				if (uName.equals(username)&&uPass.equals(password))
					{
						System.out.println("\nCheck Balance: ");
						continue;
					}
					else 
				{
						System.out.println("Invalid Credential and you only have chances "+(i-1));
						System.out.println("congratulation Your account is blocked for 24hrs");
				}
				System.exit(0);
			}
		}

			//System.exit(0);
		}   //first for loop
		

	}
}