class ReverseAdd 
{
	public static void main(String[] args) 
	{
		int num = 12345;
		int sum = 0;
		int rem;

		rem = num % 10 ;
		sum = sum + rem;
		
		num = num / 10;
		rem = num % 10;
		sum = sum + rem;

		num = num / 10;
		rem = num % 10;
		sum = sum + rem;

		num = num / 10;
		rem = num % 10;
		sum = sum + rem;

		num = num / 10;
		rem = num % 10;
		sum = sum + rem;
		System.out.println(sum);
	}
}