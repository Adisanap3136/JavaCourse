package arrays;

import java.util.Arrays;

public class RemoveDuplicateUsingFrequency 
{
	public static int[]removeDuplicate(int[]arr)
	{
		int[]freq = frequency(arr);
		int negCnt=0;
		for(int i=0;i<freq.length;i++)
			if(freq[i]==-1)
				negCnt++;
		if(negCnt>0)
		{
			int[]newArr = new int[arr.length-negCnt];
			for(int i=0,j=0;i<arr.length;i++)
			{
				if(freq[i]!=-1)
				{
					newArr[j] = arr[i];
					j++;
				}
			}
			return newArr;
		}
		return arr;
	}
	
	public static int[]frequency(int[]arr)
	{
		int[]freq = new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			int cnt=0;
			if(freq[i]!=-1)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						cnt++;
						freq[j] = -1;
					}
				}
				freq[i] = cnt;
			}
		}
		return freq;
	}
	
	public static void main(String[]args)
	{
		int[]arr = {1,2,1,2,1,2};
		System.out.println(Arrays.toString(frequency(arr)));
		System.out.println(Arrays.toString(removeDuplicate(arr)));
	}
}
