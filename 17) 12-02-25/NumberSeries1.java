//144  2197  196  3375  256
//The above series is question ,means print the series and the logic is 12 is even and get their square and 13 is even and get their cube like this other number .

class NumberSeries1
{
	public static void main(String[] args)
	{
		for(int i=1 , num=12 ; i<=5 ;  i++ , num++)
		{
			int power=1;
			int pow = num%2==0 ? 2 : 3;
			for(int j=1;j<=pow;j++)
				power*=num;
			System.out.print(power+"  ");
		}
	}
}