import java.util.Scanner;
class PrintCharFromUserName 
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name: ");
		String name = sc.next().toUpperCase();
		
	//	int len = name.length();    //length() is a builtin function,we use for getting string lentgh 
		//And i use .length()-1 because indexing start with 0 thats why i use (-1)

		for (int i =0;i<name.length() ;i++ )
		{
			char ch =name.charAt(i);
			System.out.println(i+" : "+ch);
			Thread.sleep(1000);//in this program we use Thread.Sleep() method for slow down the program output
		}
	}
}
