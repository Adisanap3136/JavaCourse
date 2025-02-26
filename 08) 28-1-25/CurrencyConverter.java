import java.util.Scanner;
class CurrencyConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println(" CURRENCY CONVERTER ");
		System.out.print("Enter the INR: ");
		float inr = sc.nextFloat();

		float converted = 0;

		System.out.println("LIST OF CURRENCY");
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. GBP");
		System.out.println("4. PKR");

		System.out.print("Enter the option you want to convert: ");
		String opt = sc.next().toUpperCase();

		if (opt.equals("USD"))
		{
			converted = inr /85.56f;
			System.out.println("INR "+inr+" to USD "+converted);
		}
		else if (opt.equals("EUR"))
		{
			converted = inr/ 90.27f;
			System.out.println("INR "+inr+" to EUR "+converted);
		}
		else if (opt.equals("GBP"))
		{
			converted = inr/ 107.65f;
			System.out.println("INR "+inr+" to GBP "+converted);
		}
		else if (opt.equals("PKR"))
		{
			converted = inr/ 0.31f;
			System.out.println("INR "+inr+" to PKR "+converted);
		}
		else 
		{
			System.out.println("ENVALID CURRENCY");
		}
	}
}
