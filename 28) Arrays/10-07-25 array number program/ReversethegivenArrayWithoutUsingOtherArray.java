package arrays;

import java.util.Arrays;

public class ReversethegivenArrayWithoutUsingOtherArray
{
	public  int[] reverseArray1(int[]arr)
	{
		int k=arr.length-1;
		for(int i=0;i<arr.length/2;i++,k--)
		{
			int temp;
			temp = arr[i];
			arr[i] = arr[k];
			arr[k] = temp;
		}
		return arr;
	}
	public  int[] reverseArray2(int[]arr)
	{
		int k=arr.length-1;
		for(int i=0;i<arr.length/2;i++,k--)
		{
			arr[i]=(arr[i]+arr[k]);
			arr[k] = (arr[i]-arr[k]);
			arr[i] = (arr[i]-arr[k]);
		}
		return arr;
	}
	public static void main(String[]args)
	{
		int[]arr1 = {1,2,3,4,5,6};
		int[]arr2 = {1,2,3,4,5,6};

		ReversethegivenArrayWithoutUsingOtherArray a = new ReversethegivenArrayWithoutUsingOtherArray();

		System.out.println("Using temp variable: "+Arrays.toString(a.reverseArray1(arr1)));
		System.out.println("Without temp variable: "+Arrays.toString(a.reverseArray2(arr2)));

	}
}
