package arrays;

import java.util.Arrays;

public class RemoveElementAtSpecificElement 
{
	public static int[]addElement(int[]arr,int index)
	{
		if(index>=0 && index<=arr.length)
		{
			int[]ans = new int[arr.length-1];
			for(int i=0;i<arr.length;i++)
			{
				if(i<index)
				{
					ans[i] =arr[i];
				}
				else if(i>index)
				{
					ans[i-1] = arr[i];
				}
			}
			return ans;
		}
		return null;
	}
	
	
	public static void main(String[]args)
	{
		int[]arr = {1,2,3,6,4,8,9,7};
		System.out.println(Arrays.toString(addElement(arr, 1)));
	}
}
