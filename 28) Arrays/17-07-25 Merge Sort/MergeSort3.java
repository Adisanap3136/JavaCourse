package arrays;

import java.util.Arrays;

public class MergeSort3 
{
	public static int[] mergeSameArray(int[]a,int start,int mid,int end)
	{
		int ans[] = new int[a.length];
		
		int i=start, j=mid+1, k=start;
		
		while(i<=mid && j<=end)
		{
			if(a[i]<=a[j])
			{
				ans[k++] = a[i++];
			}
			if(a[i]>a[j])
			{
				ans[k++] = a[j++];
			}
		}
		while(i<=mid)
		{
			ans[k++] = a[i++];
		}
		while(j<=end)
		{
			ans[k++] = a[j++];
		}
		
		for(int z =start;z<=end;z++)
		{
			a[z] = ans[z];
		}
		return ans;
	}
	
	public static void mergeSort(int[]a,int start,int end)
	{
		if(start<end)
		{
			int mid= (start+end)/2;
			
			mergeSort(a, start, mid);
			mergeSort(a, mid+1, end);
			System.out.println(Arrays.toString(a));
			System.out.println("start "+start);
			System.out.println("mid "+mid);
			System.out.println("end "+end);
//			System.out.println(Arrays.toString(mergeSameArray(a, start, mid, end)));
		}
	}
	
	public static void main(String[]args)
	{
		int[]a= {-8,3,6,4,-2,1,9,5,30,0,1};
		
		mergeSort(a, 0, a.length-1);
	}
	
}
