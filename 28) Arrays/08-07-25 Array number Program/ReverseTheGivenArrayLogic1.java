package arrays;

import java.util.Arrays;

public class ReverseTheGivenArrayLogic1 
{
	public static int[] reverseArray(int[] arr)
	{
		int[]rev = new int[arr.length];
		int cnt=0;
		for(int i=arr.length-1;i>0;i--)
		{
			rev[cnt] = arr[i];
			cnt++;
		}	
		return rev;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {10,20,30,40,50};
		
		int[]rev = reverseArray(arr);
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		for(int i=0;i<rev.length;i++)
			System.out.println(rev[i]);
	}
}
