import java.util.Scanner;
class PowerOfNum 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		System.out.print("Entert thr power: ");
		int pow = sc.nextInt();
		int op=1;
		for (int i=1;i<=pow;i++)
		{
			//op=op*num;
			op*=num;
		}
		System.out.println(num+"^"+pow+"= "+op);
	}
}
