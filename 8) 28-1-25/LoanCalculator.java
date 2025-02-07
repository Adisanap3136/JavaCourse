import java.util.Scanner;
class LoanCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("          LOAN CALCULATOR \n");
		System.out.print("Enter the amount: ");
		float amount = sc.nextFloat();
		System.out.print("Enter the  ROI: ");
		float roi = sc.nextFloat();
		System.out.print("Enter the tenure (months): ");
		int month = sc.nextInt();
		//con from months to years
		String str = (month/12)+ "."+(month%12);
		float con = Float.parseFloat(str);

		System.out.println("\n       LOAN CALCULATION");
		System.out.println("Principle Amount: "+amount);
		System.out.println("ROI : "+roi+"%");
		System.out.println("Tenure: "+month+" months");

		float intYear = amount*roi/100;
		float totalInstall = intYear*con;
		System.out.println("Interest: "+ totalInstall);
		float outStanding = amount+totalInstall;
		System.out.println("Total OutStanding Amount: "+(outStanding));
		System.out.println("EMI: "+(outStanding/month)+" rs");
	}
}