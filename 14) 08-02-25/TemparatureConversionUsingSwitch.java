import java.util.Scanner;
class TemparatureConversionUsingSwitch
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("***** Temperature Converter ******");

		System.out.print("Enter the Degree: ");
		float deg = sc.nextFloat();

		System.out.println("\n1. Celcius to Fahrenheit");
		System.out.println("2. Celcius to Kelvin");
		System.out.println("3. Celcius to Newton");
		System.out.println("4. Celcius to Rankine");
		System.out.println("5. Celcius to Romer");
		System.out.println("6. Exit");
		System.out.print("Enter an option: ");
		int opt = sc.nextInt();

		switch(opt)
		{
			case 1: 
			{
				System.out.println("celcius to fahrenheit: "+((deg*(9/5f))+32)+"F");
				break;
			}
			case 2: 
			{
				System.out.println("celcius to Kelvin: "+(deg+273.15f)+"K");
				break;
			}
			case 3: 
			{
				System.out.println("celcius to Newoton: "+(deg*(33/100f))+"N");
				break;
			}
			case 4: 
			{
				System.out.println("celcius to Rankine: "+((deg+273.15f)*9/5)+"R");
				break;
			}
			case 5: 
			{
				System.out.println("celcius to Romer: "+((deg*21/40f)+7.5f)+"RO");
				break;
			}
			case 6: {System.exit(0);break;}
			default:
				System.out.println("Enter Valid Input");
		}
	}
}