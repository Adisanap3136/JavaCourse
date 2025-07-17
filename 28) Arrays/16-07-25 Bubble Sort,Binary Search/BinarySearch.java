package arrays;

import java.util.Arrays;

public class BinarySearch 
{
	public static int[] bubbleSort(int[]arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void binarySearch(int[]arr,int ele)
	{
		int start=0;
		int end = arr.length-1;
		int mid = (start+end)/2;
		System.out.println("Sorted array: "+Arrays.toString(bubbleSort(arr)));;
		while(start<=end)
		{
			if(arr[mid]==ele)
			{
				System.out.println("Element found at index: "+mid);
				break;
			}
			else if(ele>arr[mid])
			{
				start = mid+1;
			}
			else if(ele<arr[mid])
			{
				end = mid-1;
			}
			mid = (start+end)/2;
		}
		if(start>end)
		{
			System.out.println("Not found");
		}
	}
	
	public static void main(String[]a)
	{
		int[]arr = {9,8,7,5,4,3,2,1};
		binarySearch(arr, 99);
	}
}
