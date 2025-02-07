//check weather entered data is what lower case , uppercase , digit, or special char

import java.util.Scanner;
class LowerUpperDigitSpecChar 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch = sc.next().charAt(0);

		String c = ((ch>= 'A'&&ch<='Z') || (ch<= 'a'&&ch>='z')) ? ((ch>='a'&&ch<='z') ? (ch+" is a Lower Case") : (ch+" is a upper Case")) : ((ch>= '0' && ch<='9') ? (ch+" is Digit") : (ch+" is a special char"));
		
		System.out.println(c);
	}
}
