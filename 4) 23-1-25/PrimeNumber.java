import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=  new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
//                           operand 1            operand 2           operand 3
		System.out.println( (num == 2||num==3) ? (num+" is prime") : ( (num%2==0 || num%3==0) ? (num+" is not prime") : (num+" is prime") ) );
	}
}
