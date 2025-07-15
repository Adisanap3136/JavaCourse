package arrays;

import java.util.Arrays;

public class FindFrequencyAndMarkInOtherArrayIMPForDS 
{
	public static int[] frequency(int[]arr)
	{
		int[]count = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int cnt=0;
			if(count[i]!=-1)
			{
				for(int j = i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						cnt++;
						count[j] = -1;
					}
				}
				count[i] = cnt;
			}
		}
		return count;
	}
	
	public static void main(String[]args)
	{
		int[]arr = {10,-3,6,4,-3,10,4,8,6,4,6};
//		System.out.println(Arrays.toString(frequency(arr)));
		
		int[]occ = frequency(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(occ[i]!=-1)
				System.out.println(arr[i]+" : "+occ[i]);
		}
	}
}
