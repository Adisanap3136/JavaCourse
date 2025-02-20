class FascinatingNumber  //using String
{
	public static void main(String[] args)
	{
		int num=327;
		String str = num+""+(num*2)+(num*3);
		boolean flag = true;
		//loop which start from 1 to 9 characters
		for(char i='1';i<='9';i++)
		{
			int cnt=0; //initialization char count is equals to zero for every new character
			for(int j=0;j<str.length();j++)//fetch char from starting one by one from index 0
			{
				char ch = str.charAt(j);//char fetched is stored in var ch
				if(ch==i)
					cnt++;
			}
			if(cnt!=1)
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println(num+" is fascinating Number");
		else
			System.out.println(num+" is Not Fascinating Number");
	}
}
//fascinating number means it contain all number between 1 to 9 but only once not repeat
