import java.util.Scanner;
class EvenOddConversion 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number: ");
		int num = new Scanner(System.in).nextInt();
		int length=0;
		int dup=num;
		String newNum="";
		for(int i=num;i>0;)       //here we find the length number
		{
			i/=10;
			length++;
		}
		if (length%2!=0)     //odd to even
		{
			for(int j=dup;j>0;j/=10)
			{
				int rem=j%10;
				if(rem%2!=0)
				{
					newNum= ++rem +newNum;
				}
				else
					newNum= rem+newNum;
			}
			System.out.print("The num is odd : "+dup+"  and now even: "+newNum);
		}

		else             //even to odd
		{
			for(int j=dup;j>0;j/=10)
			{
				int remm=j%10;
				if(remm%2==0)
				{
					newNum= ++remm +newNum;
				}
				else
					newNum= remm+newNum;
			}
			System.out.print("The num is even : "+dup+"  and now odd: "+newNum);
		}
	}
}