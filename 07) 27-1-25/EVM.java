import java.util.Scanner;
class EVM 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int bjp = 0 ,cng = 0, ss= 0, aap = 0, mns=0 ,nota=0;
		System.out.println();
		System.out.println("          Welcome!!");
		System.out.println();
		System.out.print("Enter the population: ");
		int population = sc.nextInt();
		
		for (int i =1;i<=population ;i++ )
		{
			System.out.println();
			System.out.println("*** LIST OF PARTIES ***");
			System.out.println("1. BJP ");
			System.out.println("2. CONGRESS ");
			System.out.println("3. SHIV SENA ");
			System.out.println("4. AAP ");
			System.out.println("5. MNS ");
			System.out.println("6. NOTA ");
			System.out.println();

			System.out.print("Enter the option: ");
			int opt = sc.nextInt();
			if (opt>=1 && opt <= 6)
			{ //next all are nested lopps
				if (opt==1)
				{
					bjp++;
					System.out.println("ACCHE DIN AYENGE");
				}
				if (opt==2)
				{
					cng++;
					System.out.println("BHARAT HATERS");
				}
				if (opt==3)
				{
					ss++;
					System.out.println("MEIN HUUN SHINDE SHIVE SENA");
				}
				if (opt==4)
				{
					aap++;
					System.out.println("MUJHE AZAD KARO");
				}
				if (opt==5)
				{
					mns++;
					System.out.println("JAY MAHARASHTRA");
				}
				if (opt==6)
				{
					nota++;
					System.out.println("YOU ARE AN EDUCATED PERSON");
				}
			} //main if loop end here
			if (!(opt>=1 && opt<=6))
			{
				i--;
				System.out.println("INVALID OPTION");
			}
			
		}   //for loops end here
		System.out.println();
		System.out.println("*** RESULT ***");
		System.out.println();   //below if condition code is for results;in this condition compare all party votes and give suitable RESULT.

			if (bjp>=cng && bjp>=ss && bjp>= aap && bjp>=mns && bjp>=nota)
			{
				System.out.println("BJP HAS WON THE ELECTION BY "+bjp+ " VOTES");
				return;
			}
			if (cng>=bjp && cng>=ss && cng>= aap && cng>=mns && cng>=nota)
			{
				System.out.println("CONGRESS HAS WON THE ELECTION BY "+cng+ " VOTES");
				return;
			}
			if (ss>=bjp && ss>=cng && ss>= aap && ss>=mns && ss>=nota)
			{
				System.out.println("SHIVE SENA HAS WON THE ELECTION BY "+ss+ " VOTES");
				return;
			}
			if (aap>=cng && aap>=ss && aap>=bjp && aap>=mns && aap>=nota)
			{
				System.out.println("AAP HAS WON THE ELECTION BY "+aap+ " VOTES");
				return;
			}
			if (mns>=cng && mns>=ss && mns>= aap && mns>=bjp && mns>=nota)
			{
				System.out.println("MNS HAS WON THE ELECTION BY "+mns+ " VOTES");
				return;
			}
			if (nota>=cng && nota>=ss && nota>= aap && nota>=bjp && nota>=mns)
			{
				System.out.println("NOTA HAS GETTING THE "+nota+ " VOTES");
				return;
			}
		
	}
}