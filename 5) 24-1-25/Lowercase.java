//check weather the char is lowercase or not

import java.util.Scanner;
class Lowercase 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		char ch = sc.next().charAt(0);

//we can also write 'a' in place of 97 and 'z' in place of 122 both are same because 65 and 90 are the ASCII value of A and Z.
//like this		String lowercase = (ch>='a'&&ch<='z') ? (ch+" is in lowercase") : ("Not in lowercase");

		String lowercase = (ch>=97&&ch<=122) ? (ch+" is in lowercase") : ("Not in lowercase");
		System.out.println(lowercase);
	}
}
