package principleOfOop.Shrikantsir;

public class ReplaceNumberas5 {
	public static void main(String[] args) {
		System.out.println(reverseNum(reverseNum(1005)));
	}
	public static int reverseNum(int num)
	{
		int rev=0;
		for(int i=num;i>0;i/=10)
		{
			if(i%10==0)
				rev = rev*10+(5);
			else
				rev = rev*10+(i%10);
		}
		return rev;
	}
}