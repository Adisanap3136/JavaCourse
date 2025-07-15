package arrays;

import java.util.Arrays;

public class RemoveOccurence 
{
	public static int[] removeOccurence(int[]arr,int ele)
	{
		int cnt=0;
		for(int i=0;i<arr.length;i++)
			if(arr[i]==ele)
					cnt++;
		
		if(cnt>0)
		{
			int[]ans = new int[arr.length-cnt];
			for(int i=0,j=0;i<arr.length;i++)
			{
				if(arr[i]!=ele)
				{
					ans[j++] = arr[i];
				}
			}
			return ans;
		}
		return arr;
	}
	
	public static void main(String[]args)
	{
		int[]arr = {1,2,3,4,5,4,8,4,2,4,5,2,4};
		System.out.println(Arrays.toString(removeOccurence(arr, 4)));
	}
}
