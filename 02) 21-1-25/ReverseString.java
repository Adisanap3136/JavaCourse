//21-01-2025 Kokate sir > This is the Reverse string logic 

class ReverseString 
{
	public static void main(String[] args) 
	{
		int num = 123456;
		int dup = num;
		int rev = 0;
		int rem;
		
		rem = num %10 ;          //123456 % 10 = 6-> rem 
		rev = rev *10 +rem;      //0*10+(rem = 6) = 6-> rev 

		num = num /10;           //123456/10 = 12345
		rem = num%10;            //12345 % 10 = 5 -> rem
		rev = rev *10+rem;       //6*10+(rem 5)= 65-> rev

		num = num/10;
		rem = num%10;
		rev = rev *10 +rem;

		num = num/10;
		rem = num%10;
		rev = rev *10 + rem;

		num = num/10;
		rem = num%10;
		rev = rev *10 + rem;

		num = num/10;
		rem = num%10;
		rev = rev *10 + rem;

		System.out.println("Original String: "+dup+" Revverse String: "+rev);

	}
}
