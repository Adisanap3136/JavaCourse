package principleOfOop.Abstraction;

public class NumberProgramDriver extends Object
{
	public static void main(String[] args) 
	{
		NumberProgramAbstract n = new NumberProgramImple();
		//		System.out.println("Prime number: "+n.isPrime(7));
//		System.out.println("Even Odd: "+n.isEvenOdd(4));
//		System.out.println("Reverse Num: "+n.reverseNum(1234));
//		System.out.println("Power of number: "+n.pow(2, 3));
////		System.out.println("Square root: "+n.squareRoot(81));
//		System.out.println("Length of number: "+n.lengthOfNum(123654789));
//		System.out.println("Armstrong num: "+n.isArmstrongNum(153));
//		System.out.println("Maximun num: "+n.maxNumber(5, 0));
//		System.out.println("Square of num: "+n.squareOfNum(10));
		System.out.println("factorial number: "+n.factorial(5));
	}
}  