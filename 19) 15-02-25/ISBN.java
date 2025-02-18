class ISBN
{
	public static void main(String[] args)
	{
		long num=1259060977l;
		int sum=0;
		for(long i=num,j=1;i>0;i/=10,j++)
		{
			long rem=i%10;
			sum+=(rem*j);
			System.out.println(rem+" x "+j+" = "+sum);
		}
		if(sum%11==0)
			System.out.println(num+" is ISBN Number");
		else
			System.out.println("Not ISBN");
	}
}
/*
rem * j = sum
7 x 1 = 7
7 x 2 = 21
9 x 3 = 48
0 x 4 = 48
6 x 5 = 78
0 x 6 = 78
9 x 7 = 141
5 x 8 = 181
2 x 9 = 199
1 x 10 = 209    sum can update their addition for every iteration
this is the logic of ISBN number.
and after calculating sum then check condition (sum%11==0)-> is ISBN num
*/