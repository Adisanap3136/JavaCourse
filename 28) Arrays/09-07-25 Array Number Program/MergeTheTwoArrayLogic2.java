package arrays;

import java.util.Arrays;

public class MergeTheTwoArrayLogic2 
{
	
	public static int[] mergerArrayLogic1(int[]arr1,int[]arr2)
	{
		int[]mergeArr = new int[arr1.length+arr2.length];
		
		for(int i = 0;i<mergeArr.length;i++)
		{
			if(i<=arr1.length-1)
			{
				mergeArr[i] = arr1[i];
			}
			else
			{
				mergeArr[i] = arr2[i-arr1.length];
			}
		}
		return mergeArr;
	}
	
	public static void main(String[] args)
	{
		int[]arr1 = {1,2,3,4,5,6};
		int[]arr2 = {10,89,45,6,9,8,};
	
		System.out.println(Arrays.toString(mergerArrayLogic1(arr1, arr2)));
	}
}
