class EvenOddSum 
{
	public static void main(String[] args) 
	{
	// this program access the number from rightside and perform even number sum and odd number sum reperately
		int num = 3343;
		int evenSum = 0;
		int oddSum = 0;
		int temp ;
		
		int rem = num % 10;
		temp = (rem%2==0) ? (evenSum=evenSum+rem) : (oddSum=oddSum+rem);

		num = num /10;
		rem = num % 10;
		temp = (rem%2==0) ? (evenSum=evenSum+rem) : (oddSum=oddSum+rem);

		num = num /10;
		rem = num % 10;
		temp = (rem%2==0) ? (evenSum=evenSum+rem) : (oddSum=oddSum+rem);

		num = num /10;
		rem = num % 10;
		temp = (rem%2==0) ? (evenSum=evenSum+rem) : (oddSum=oddSum+rem);

		System.out.println("evenSum: "+evenSum);
		System.out.println("oddSum: "+oddSum);
	}
}
