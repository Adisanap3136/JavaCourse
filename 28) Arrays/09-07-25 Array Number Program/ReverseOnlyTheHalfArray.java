package arrays;

import java.util.Arrays;

public class ReverseOnlyTheHalfArray 
{
	
	public static int[] reverseHalfArray(int[]arr)
	{
		int[]revHalf = new int[arr.length];
		for(int i=0,j=arr.length-1;i<arr.length;i++)
		{
			if(i<(arr.length/2))
				revHalf[i] = arr[i];
			else 
			{ 
				revHalf[j] = arr[i];
				j--;
			}
		}
		return revHalf;
	}
	
	public static void main(String[] args)
	{
		int[]arr = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(Arrays.toString(reverseHalfArray(arr)));;
	}
}
