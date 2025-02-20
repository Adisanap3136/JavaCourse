//check weather special character or not.

import java.util.Scanner;
class specialChar 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a String: ");
		char ch = new Scanner(System.in).next().charAt(0);

		String speChar = (ch>='A'&&ch<='B'||ch>='a'&&ch<='z'||ch>='0'&&ch<='1') ? (ch+" not Special char") : (ch+" is special Char");
		System.out.println(speChar);
	}
}
