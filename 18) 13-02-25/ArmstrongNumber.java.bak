class ArmstrongNumber
{
	public static void main(String[] args)
	{
		int num=153, len=0,sum=0;
		int dup=num;
		for(int i=num;i>0;i/=10)
			len++;

		while(num>0)
		{
			int rem=num%10;
			int pow=1;
			for(int j = 1;j<=len;j++)
			{
				pow*=rem;
			}
			num/=10;
			sum+=pow;
		}
		System.out.println(dup==sum?dup+" is Armstrong Number ": dup+" Not Armstrong");
	}
}
