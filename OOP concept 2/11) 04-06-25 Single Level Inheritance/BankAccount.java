package principleOfOop.principleOfOopInheritance;

import principleOfOop.GooglePayupirelation.Bank;

public class BankAccount 
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
