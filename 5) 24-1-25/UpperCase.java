//check weather the character is in UpperCase or not ;

import java.util.Scanner;
class UpperCase 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Character: ");
		char ch = sc.next().charAt(0);

//we can also write a 'A' in place of 65 and 'Z' in place of 90 both are same because 65 and 90 are the ASCII value of A and Z.

		String c = (ch >= 65 && ch <= 90) ? ("UpperCase") : ("Not in upperCase");
		System.out.println(c);
	}
}
