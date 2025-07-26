package arrays;

import java.util.Arrays;

public class QuickSort 
{
	public static int partition(int[] ar, int start, int end) {
	    int i = start;
	    int j = end;
	    int ref = ar[start];      //reference means pivot

	    while (i < j) {
	        // Move i to the right until you find an element greater than pivot
	        while (i <= end && ar[i] <= ref)
	            i++;
	        // Move j to the left until you find an element less than or equal to pivot
	        while (j > start && ar[j] > ref)
	            j--;
	        // Swap elements at i and j if i < j
	        if (i < j) {
	            swap(ar, i, j);
	        }
	    }
	    // Swap the pivot element with element at j
	    swap(ar, start, j);
	    return j;
	}

	public static void swap(int[]ar,int i,int j)
	{
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
	
	public static void quickSort(int[]ar,int start,int end)
	{
		if(start<end)
		{
			int pos = partition(ar,start,end);
			quickSort(ar,start,pos-1);
			quickSort(ar,pos+1,end);
		}
	}
	
	public static void main(String[]args)
	{
		int []ar = {2,5,6,-1,28,5,3,3,6,8,9,7};
		quickSort(ar, 0, ar.length-1);
		System.out.println(Arrays.toString(ar));
 	}
}
