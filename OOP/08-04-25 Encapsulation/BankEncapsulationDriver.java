package principleOfOop;

public class BankEncapsulationDriver {
	public static void main(String [] args)
	{
		BankEncapsulation b1 = new BankEncapsulation("SBI", "SBIN2025", "Raju", 123456789, 3136);
		System.out.println("Bank: "+b1.getBankName());
		System.out.println("IFSC Code: "+b1.getIfsc());
		System.out.println("User Name: "+b1.getUserName());
		System.out.println("Balance: "+b1.getBalance(1313550,550));
		
	}

}