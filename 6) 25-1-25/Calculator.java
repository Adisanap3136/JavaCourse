//Program for a calculator.

import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter num1: ");
		float num1 = new Scanner(System.in).nextFloat();
		System.out.print("Enter num2: ");
		float num2 = new Scanner(System.in).nextFloat();
		System.out.print("Enter operator: ");
		char op = new Scanner(System.in).next().charAt(0);

//	This condition can only accept operator rest not accepting
//		op = (op=='+'||op=='-'||op=='*'||op=='/'||op=='%')?(op):(0);

		float result = 0;

		result = (op=='+') ? (num1+num2) : ( (op=='-')?(num1-num2):( (op=='*')?(num1*num2):( (op=='/')?(num1/num2):( (op=='%')?(num1%num2):(0.0000001f) ) ) ) );

		String output = num1+" "+op+" "+num2+" = "+result;

		if (!(result==0.0000001f))
		{
			System.out.println(output);
		}
	}
}    

/*
import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter num1: ");
		float num1 = new Scanner(System.in).nextFloat();
		System.out.print("Enter num2: ");
		float num2 = new Scanner(System.in).nextFloat();
		System.out.print("Enter operator: ");
		String op = new Scanner(System.in).nextLine();

		float result = 0;
		if (!(op.equals("+")||op.equals("-")||op.equals("*")||op.equals("/")||op.equals("%")))
		{	
			System.out.println("Enter valid operator: ");
		}
		result = (op.equals("+")) ? (num1+num2) : ( (op.equals("-"))?(num1-num2):( (op.equals("*"))?(num1*num2):( (op.equals("/"))?(num1/num2):( (op.equals("%"))?(num1%num2):(result) ) ) ) );	
		System.out.println("num1 "+num1+op+" num2 "+num2+" = "+result);
	}
}
*/