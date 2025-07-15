package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementInLast 
{
	public static int[] addElementAtLast(int[]arr,int ele)
	{
		int[]ans = new int[arr.length+1];
		for(int i=0;i<ans.length;i++)
		{
			if(i<arr.length)
				ans[i] = arr[i];
			if(i>=arr.length)
				ans[i] = ele;
		}
		return ans;
	}
	
	public static void main(String[] args)
	{
		int[]arr = {9,8,7,7,46,1,1,0,-1};

		try
		{
			System.out.print("Enter element you want ot add: ");
			System.out.println("Old Array: "+Arrays.toString(arr)
			+"\nNew Array: "+Arrays.toString(addElementAtLast(arr,new Scanner(System.in).nextInt())));
		}
		catch (Exception e)
		{
			System.out.println("ohh aa.........Give only Number input....!");
		}
	}
}
