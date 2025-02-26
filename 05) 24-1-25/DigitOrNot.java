//check weather the char is digit or not.
import java.util.Scanner;
class DigitOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character: ");
		char ch = sc.next().charAt(0);

//here we use direct digit '0' and '9' in quotes it also working (write anything ascii or actual digit);

		String digit = (ch>='0'&&ch<='9') ? (ch+" It is a Digit") : ("not a Digit");
		System.out.println(digit);
	}
}