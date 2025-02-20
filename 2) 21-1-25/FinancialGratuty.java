//21-01-2025 kokate sir > this program calculate the tiprate and include in the total bill of customer for hotel purpose.

import java.util.Scanner;
class FinancialGratuty 
{
	public static void main(String[] args) 
	{
		//Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the tiprate: ");
		float tipRate = new Scanner(System.in).nextFloat();

		System.out.print("Enter the bill: ");
		float bill = new Scanner(System.in).nextFloat();
		
		float tipAmount = (tipRate * bill)/100;
		float totalBill = bill + tipAmount;
		System.out.println("Tiprate: "+tipAmount);
		System.out.println("Total bill with tip: "+totalBill);
	}
}
