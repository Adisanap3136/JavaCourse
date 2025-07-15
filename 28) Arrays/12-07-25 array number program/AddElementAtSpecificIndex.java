package arrays;

import java.util.Arrays;

public class AddElementAtSpecificIndex 
{
	public static int[] addElement(int[]arr,int index,int ele)
	{
		if(index>=0&&index<=arr.length)
		{
			int[]ans = new int[arr.length+1];
			
			for(int i=0;i<ans.length;i++)
			{
				if(i<index)
				{
					ans[i] = arr[i];
				}
				else if(i==index)
				{
					ans[i] = ele;
				}
				else
				{
					ans[i] = arr[i-1];
				}
			}
			return ans;
		}
		return null;
	}
	
	public static void main(String[]args)
	{
		int[]arr = {1,2,3,6,4,8,9,7};
		System.out.println(Arrays.toString(addElement(arr, 5,999)));
	}
}
