//22-01-2025 Kokate sir > HW -> Dsiplays the number of year and days for the minuetes, assume the year have 365 days.

import java.util.Scanner;
class NumberOfYears 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the Minuets: ");
		int min = new Scanner(System.in).nextInt();
		int minYear = (365*24*60);
		int years = min/minYear;
		int days = (min/(24*60)) % years;
		System.out.println(min+" Minuetes Approximately yers: "+years+" Dyas: "+days);
	}
}