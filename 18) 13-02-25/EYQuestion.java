import java.util.Scanner;
class EYQuestion
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter String with 0 and 1: ");
		String s = sc.nextLine();
		int cnt1=0;
		int cnt0=0;
		for(int i =0;i<s.length();i++)
		{
			char ch =s.charAt(i);
			if(ch=='1')
				cnt1++;
			else if(ch=='0')
				cnt0++;
			else{
				cnt1=0;
				cnt0=0;

			if(cnt1>=7||cnt0>=7)
				break;
			}
		}
		System.out.println(cnt1>=7||cnt0>=7?"Dangerous":"Not");
	}
}