package principleOfOop.SuperCall;

//here we did the single level inheritance
//for bank account class
//and saving account class

class BankAccount 
{
	String name;
	String ifsc;
	String bankName;
	long accNo;
	int pin;
	String branch;
	long mobNo;
	
	public BankAccount() 
	{
	}

	
	// In this code this downside constructor is not is not mandetory (for only this case) ,i inherit this class and assigne data through child class
	
	
	public BankAccount(String name, String ifsc, String bankName, long accNo, int pin, String branch, long mobNo) {
		this.name = name;
		this.ifsc = ifsc;
		this.bankName = bankName;
		this.accNo = accNo;
		this.pin = pin;
		this.branch = branch;
		this.mobNo = mobNo;
	}
	
	public void displayBankAccount() {
		System.out.println( "BankAccount [name=" + name + ", ifsc=" + ifsc + ", bankName=" + bankName + ", accNo=" + accNo + ", pin="
				+ pin + ", branch=" + branch + ", mobNo=" + mobNo +"]" );
	}
}

class SavingAccount extends BankAccount
{
	double balance;
	double intrest;
	String type;
	
	public SavingAccount() 
	{
	}
	
	public SavingAccount(String name, String ifsc, String bankName, long accNo, int pin, String branch, long mobNo,double balance,double intrest,String type)
	{
		super(name, ifsc, bankName, accNo, pin, branch, mobNo);
		this.balance=balance;
		this.intrest=intrest;
		this.type=type;
	}

	public void displaySavingAccount() {
		System.out.println( "SavingAccount [balance=" + balance + ", intrest=" + intrest + ", type=" + type + "]");
	}
}

public class BankAccountDriver 
{
	public static void main (String [] args)
	{
		SavingAccount s = new SavingAccount("Nana", "MAHB0001649", "Bank of Maharashtra", 123654489, 422303, "Deccan", 123654789, 10000000000000d, 50000000000d, "Saving");
		s.displayBankAccount();
		s.displaySavingAccount();
	}
}

//here we did the single level inheritance
//for bank account class
//an