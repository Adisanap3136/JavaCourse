class FascinatingNumber2  //using without String
{
	public static void main(String[] args)
	{
		int num=3;
		int temp=num;
		boolean flag=true;
		for(int i=2;i<=3;i++)   //here we multiply temp with 2 and 3
		{
			num=(num*1000)+(temp*i);
		}
		for(int i =1;i<=9;i++)
		{
			int cnt=0;
			for(int j=num;j>0;j/=10)
			{
				if(i==(j%10))
					cnt++;
			}
			if(cnt!=1){
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println(num+" is Fascinating Number");
		else
			System.out.println(num+" is NOT Fascinating Number");

	}
}
//fascinating number means it contain all number between 1 to 9 but only once not repeat