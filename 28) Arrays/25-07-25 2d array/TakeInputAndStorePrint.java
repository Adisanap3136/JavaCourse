package TwoDimesionalArray;
import java.util.Arrays;
import java.util.Scanner;

public class TakeInputAndStorePrint 
{
	public static void main(String[] args)
	{
		int[][]ar = new int[3][3];
		
		System.out.println("Enter elements");
		
		for(int i=0;i<ar.length;i++)
			for(int j =0;j<ar[i].length;j++)
				ar[i][j] = new Scanner(System.in).nextInt();
		
		System.out.println("Elements are: ");
		
		for(int i=0;i<ar.length;i++)
			System.out.println(Arrays.toString(ar[i]));
	}
}
