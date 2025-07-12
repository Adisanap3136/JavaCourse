package arrays;

import java.util.Arrays;

public class MergerAndStroreBothArrayReversely 
{
	public static int[] mergeTwoArray(int[]arr1,int[]arr2)
	{
		int[]mergeArr = new int[arr1.length+arr2.length];
		
		for(int i=0;i<mergeArr.length;i++)
		{
			if(i<=arr1.length-1)
			{
				int[]arr = reverseArray(arr1);
				mergeArr[i] = arr[i];
			}
			else
			{
				int[]arr = reverseArray(arr2);
				mergeArr[i] = arr[i-arr1.length];
				
			}
		}
		return mergeArr;
	}
	
	public static int[] reverseArray(int[]arr)
	{
		int[] rev = new int[arr.length];
		
		for(int i=0,j=arr.length-1;i<arr.length;i++)
		{
			rev[i] = arr[j];
			j--;
		}
		return rev;
	}
	
	public static void main(String[]arr)
	{
		int[]arr1 = {1,2,3,4,5,6};
		int[]arr2 = {7,8,9,10,11,12};
		
		System.out.println(Arrays.toString(mergeTwoArray(arr1, arr2)));
	}
}
//here the both the array will store reversely using reverse method
//[6, 5, 4, 3, 2, 1, 12, 11, 10, 9, 8, 7]