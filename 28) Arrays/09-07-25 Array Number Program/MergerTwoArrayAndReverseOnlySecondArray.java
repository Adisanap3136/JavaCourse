package arrays;

import java.util.Arrays;

public class MergerTwoArrayAndReverseOnlySecondArray 
{
	
	public static int[] mergeTwoArray(int[]arr1,int[]arr2)
	{
		int[]mergeArr = new int[arr1.length+arr2.length];
		int[]arr3 = reverseArray(arr2);
		
		for(int i=0;i<mergeArr.length;i++)
		{
			if(i<=arr1.length-1)
				mergeArr[i] = arr1[i];
			else
			{
				
				mergeArr[i] = arr3[i-arr1.length];
				
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
