import java.util.Scanner;
class Xyz
{
	public static void main(String[] args)
	{
		System.out.print("Enter the num: ");
		int num=new Scanner(System.in).nextInt();
		int sum=0;
		int cnt=0;
		for(int i=num;i>0;i/=10)
			cnt++;
		for(;;){
			for(int i=num;i>0;i/=10){
				if(i%10==1)
				{
					sum=(i%10);
				}
			}
			for(i=cnt;i>=cnt;i--){
				System.out.println(sum);
			}
			if(sum>len)
		}
	}
}