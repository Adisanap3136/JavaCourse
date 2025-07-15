package arrays;

import java.util.Arrays;

public class RemoveAnElemnt 
{
	public static int[] removeElement(int[]arr,int ele)
	{
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			int[]ans = new int[arr.length-1];
			for(int i=0,j=0;i<arr.length;i++,j++)
			{
				if(arr[i]==ele)
				{
					ans[j] = arr[++i];
				}
				else
				{
					ans[j] = arr[i];
				}
			}
			return ans;
		}
		else
		{
			System.out.println("Element not present.!");
			return new int[] {};
		}
	}
	
	public static void main(String[] args)
	{
		int[]arr = {9,8,7,7,46,1,1,0,-1};
		
		System.out.println(Arrays.toString(removeElement(arr,7)));
	}
}
