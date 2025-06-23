package principleOfOop.principleOfOopInheritance;

public class SavingAccount extends BankAccount
{
	double balance;
	double intrest;
	String type;
	
	public SavingAccount() 
	{
	}
	
	public SavingAccount(String name, String ifsc, String bankName, long accNo, int pin, String branch, long mobNo,double balance,double intrest,String type)
	{
		this.name=name;
		this.ifsc=ifsc;
		this.bankName=bankName;
		this.accNo=accNo;
		this.pin=pin;
		this.branch=branch;
		this.mobNo=mobNo;
		this.balance=balance;
		this.intrest=intrest;
		this.type=type;
	}

	public void displaySavingAccount() {
		System.out.println( "SavingAccount [balance=" + balance + ", intrest=" + intrest + ", type=" + type + "]");
	}
	
}
