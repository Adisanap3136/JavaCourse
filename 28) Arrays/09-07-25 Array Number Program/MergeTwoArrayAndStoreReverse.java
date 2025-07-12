package arrays;

import java.util.Arrays;

public class MergeTwoArrayAndStoreReverse 
{
	
	public static int[] mergeTwoArray(int[]arr1,int[]arr2)
	{
		int[]mergeArr = new int[arr1.length+arr2.length];
		
		for(int i=0;i<mergeArr.length;i++)
		{
			if(i<=arr1.length-1)
				mergeArr[i] = arr1[i];
			else
			{
				mergeArr[i] = arr2[i-arr1.length];
				
			}
		}
		return reverseArray(mergeArr);
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
		int[]arr2 = {10,89,45,6,9,8,};
		
		System.out.println(Arrays.toString(mergeTwoArray(arr1, arr2)));
	}
}

//here i will merge two array and then reversing whole array
