import java.util.Scanner;
class SunnyNumber
{
	public static void main(String[] args)
	{
		System.out.print("Enter the Number: ");
		int num=new Scanner(System.in).nextInt();
		int sunny=num+1;
		boolean flag=false;
		for(int i=1;i<=sunny;i++){
			if((i*i)==sunny){
				flag=true;
				System.out.println(i+" is a perfect squareroot of: "+sunny+ "  \nso "+ num+" is SUNNY NUMBER!");
				break;
			}
		}
		if(!flag)
			System.out.println("NOT SUNNY NUMBER!");
	}
}
//sunny number is a number add 1 in given number then check it have perfect square root or not and then show its root if it is have perfect square