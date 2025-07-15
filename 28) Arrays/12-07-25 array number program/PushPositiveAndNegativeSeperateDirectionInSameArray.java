package arrays;

import java.util.Arrays;

public class PushPositiveAndNegativeSeperateDirectionInSameArray 
{
	
	public static void pushPosNeg(int[]arr)
	{
		
		int i =0;
		int j = arr.length-1;
		while(i<j)
		{
			while(arr[i]<0)
			{
				i++;
			}
			while(arr[j]>0)
			{
				j--;
			}
			if(i<j)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[]args)
	{
		int[]arr = {1,-5,6,-9,-8,4,8,-7,8,1,0,6,-3,7,-5,-9};
		 pushPosNeg(arr);
	}
}
