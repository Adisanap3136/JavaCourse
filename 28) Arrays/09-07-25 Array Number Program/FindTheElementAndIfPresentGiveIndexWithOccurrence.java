package arrays;

import java.util.Arrays;

public class FindTheElementAndIfPresentGiveIndexWithOccurrence 
{
	
	public static int getElementIndex(int[]arr,int ele)
	{
		for(int i=0;i<arr.length;i++)
			if(arr[i]==ele)
				return i;
		return -1;
	}
	
	public static int findOccurrence(int[]arr,int ele)
	{
		int cnt=0;
		for(int i=0;i<arr.length;i++)
			if(arr[i]==ele)
				cnt++;
		return cnt;
	}
	
	public static boolean isPresent(int[]arr,int ele)
	{
			return getElementIndex(arr, ele)>=0;
	}
	
	public static void main(String[] args)
	{
		int[]arr = {5,10,20,30,4,5,6,8,9,55,57,57,10,3,33};
		
		int num=10;
		System.out.println("The Number is present or not: "+isPresent(arr, num));
		System.out.println("Frequency of specific element: "+findOccurrence(arr, num));
		System.out.println("Index of that specific number which we want ot find: "+getElementIndex(arr, num));

	}
}
