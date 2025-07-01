package principleOfOop.principleOfOopInheritance;

public class BankAccountDriver 
{
	public static void main (String [] args)
	{
		SavingAccount s = new SavingAccount("Nana", "MAHB0001649", "Bank of Maharashtra", 123654489, 422303, "Deccan", 123654789, 10000000000000d, 50000000000d, "Saving");
		s.displayBankAccount();
		s.displaySavingAccount();
	}
}
