package arrays;

import java.util.Arrays;

public class ReversetheArraywithTEmpAndWitoutTemp 
{
	public static void revArray(int[]arr)
	{
		int i=0;
		int j=arr.length-1;
		while(i<j)
		{
//			int temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
			
//			or best logic
			arr[i] = arr[j]+arr[i];
			arr[j] = arr[i] - arr[j];
			arr[i] = arr[i] -arr[j];
			
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[]args)
	{
		int[]arr = {1,2,4,6};
		revArray(arr);
	}
}