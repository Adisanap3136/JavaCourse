//write a program if num is divided by 2 then print "Hi,two" and num is divided by 5 print "Hi,five" and if num is divided bye 2 and 5 then print "Hi,two : Hi,Five".

import java.util.Scanner;
class DivOf2And5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A number:");
		int num = sc.nextInt();
//					operand1					operand2		   operand3>(op 1)  (op 2)        (op 3)
		String s = (num%2==0 && num%5==0) ? ("Hi,two : Hi,Five") : ( (num%2==0) ? ("Hi,Two") : ( (num%5==0) ? ("Hi,Five") : ("") ) );
		System.out.println(s);
	}
}
