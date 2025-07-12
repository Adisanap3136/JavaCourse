package arrays;

import java.util.Arrays;

public class ReverseArrayUsingTwoPointer 
{
	public static void reverseArray(int[]arr)
	{
		int i=0,j=arr.length-1;
		int[]rev= new int[arr.length];
		while(i<=j)
		{
			rev[i] = arr[j];
			rev[j] =arr[i];
			i++;
			j--;
		}
		System.out.println(Arrays.toString(rev));
	}
	
	public static void main(String[]args)
	{
		int[]arr= {1,2,3,4,5,6};
		reverseArray(arr);
	}
}
