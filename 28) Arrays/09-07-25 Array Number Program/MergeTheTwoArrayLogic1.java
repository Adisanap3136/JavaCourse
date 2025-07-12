package arrays;

import java.util.Arrays;

public class MergeTheTwoArrayLogic1 
{
	public static int[] mergeArrayLogic1(int[]arr1,int[]arr2)
	{
		int[]mergerArr = new int[arr1.length+arr2.length];
		
		int sum=0;
		for(int i=0;i<arr1.length;i++)
		{	
			mergerArr[sum] = arr1[i];
			sum++;
		}
		for(int i=0;i<arr2.length;i++)
		{
			mergerArr[sum] = arr2[i];
					sum++;
		}
		return mergerArr;
	}
	
	public static void main(String[] args)
	{
		int[]arr1 = {1,2,3,4,5,6};
		int[]arr2 = {10,89,45,6,9,8,};

		System.out.println("Here we merge the two array: ");
		System.out.println(Arrays.toString(mergeArrayLogic1(arr1, arr2)));
	}
}
