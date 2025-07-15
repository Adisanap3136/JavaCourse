package arrays;

import java.util.Arrays;

public class RemoveElementsUsingRange 
{
	
	public static void removeInRange(int[]arr,int start,int end)
	{
		if(start>=0 && start<end && end<arr.length)
		{
			int[]ans = new int[arr.length-(end-start)];
			for(int i=0,j=0;i<arr.length;i++)
			{
				if(i<start)
				{
					ans[j] = arr[i];
					j++;
				}
				else if(i==start)
				{
					i = i+(end-start);
				}
				else if(i>=end)
				{
					ans[j] = arr[i];
					j++;
				}
			}
			System.out.println(Arrays.toString(ans));
		}
	}
	
	public static void main(String[] args) 
	{
		int[]arr = new int[] {1,-2,3,-4,-5,5,6,-7};
		removeInRange(arr, 1, 5);
	}
}
