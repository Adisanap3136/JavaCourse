class ProductOfDigit 
{
	public static void main(String[] args) 
	{
		int num = 2222;
		int product = 1;
		int rem ;

		rem = num % 10 ;
		product = product * rem;

		num = num / 10;
		rem = num % 10;
		product = product * rem;

		num = num / 10;
		rem = num % 10;
		product = product * rem;

		num = num / 10;
		rem = num % 10;
		product = product * rem;

		System.out.println("Product of num is: "+product);
	}
}