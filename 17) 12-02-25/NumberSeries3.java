import java.util.Scanner;
class NumberSeries3 //10 30 68 130 222
{
	public static void main(String[] args)
	{
		System.out.print("Enter the Range: ");
		int range = new Scanner(System.in).nextInt();
		//           6<(5+2)     6
		for(int i =2;i<(range+2);i++)
			System.out.print((i*i*i)+(i)+" ");
		//                    2*2*2+2=10
		//                    3*3*3+3=30
		//                    4*4*4+4=68
		//                    5*5*5+5=150
		//                    6*6*6+6=222
	}
}
/*
here the logic is every i numbers cube taking then add i number in cube value ex = if i =2= 2*2*2+2=10 like this