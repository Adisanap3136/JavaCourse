class UsingFrequencyFindLowestRepeatingDigit 
{
	public static void main(String[] args) 
	{
		long num = 111111116686460846L;
		System.out.println(num);
		int dgt=0;
		int low=9;
		for(int i=0;i<=9;i++)
		{
			int cnt=0;
			for(long j=num;j>0;j/=10)
			{
				long rem=j%10;
				if(i==rem)
				{
					cnt++;
				}
			}
			if(cnt!=0)
			{
				if(low>cnt)
				{
					low=cnt;
					dgt=i;
				}
			}
		}
		System.out.println("Max digit is: "+dgt+" with frequency of: "+low);
	}
}
