class OtpGenerator 
{
	public static void main(String[] args) 
	{
		String otp ="";
		for(int cnt=1;cnt<=1;)
		{
			otp += (int)(Math.random()*1000000);
			if(otp.length()==6)
			{
				System.out.println(otp);
				cnt++;
			}
			otp="";
		}
	}
}