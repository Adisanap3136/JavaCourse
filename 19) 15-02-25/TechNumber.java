class TechNumber
{
	public static void main(String[] args)
	{
		int num=2025,len=0,div=1;
		for(int i=num;i>0;i/=10)  //find the length of the number.
			len++;
		if(len%2==0)
		{
			for(int j=1;j<=(len/2);j++){
				div*=10;
			}//(num/div) this for fetch starting number &&  (num%div) this for fetching last digit
				int sum = (num/div)+(num%div);
				int sqr=sum*sum;
				System.out.println(sqr==num?num+" is a TECH numbe  "            :num+" Not tech Number");

		}
		else
			System.out.println("Not a Tech Number!");
	}
}
//tech number means ex we have number 2025 and now cut this number in two parts means 20 seperatae and 25 seperate ,then add them (20+25) =45 and then take square of the sum and then the sum and the given number (2025) is same then the number is TECH NUMBER.