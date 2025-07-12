package arrays;

import java.util.Arrays;

public class ReverseBothArrayAndMerger 
{
	
	public static int[] reverseBothArray(int[]arr1,int[]arr2)
	{
		int[]reversed = new int[arr1.length+arr2.length];
		
		for(int i=0;i<reversed.length;i++)
		{
			if(i<arr1.length)
				reversed[i]=arr1[arr1.length-1-i];
			else
				reversed[i]=arr2[reversed.length-1-i];
		}
		
		return reversed;
	}
	
	public static void main(String[]a)
	{
		int[]arr1 = {1,2,3,4,5,6,7};
		int[]arr2 = {7,6,4,43,21,1};
		
		System.out.println(Arrays.toString(reverseBothArray(arr1, arr2)));
	}
}
