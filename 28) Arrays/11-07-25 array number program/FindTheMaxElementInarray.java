package arrays;

public class FindTheMaxElementInarray 
{
	public static int maxElement(int[]arr)
	{
		int max = Integer.MIN_VALUE;
		int i=0;
		while(i<arr.length)
		{
			if(arr[i]>max)
				max=arr[i];
			i++;
		}
		return max;
	}
	
	public static void main(String[]arg)
	{
		int[]arr = {1,2,5,8,48,5,5,4,7,85,8,12};
		
		System.out.println(maxElement(arr));
	}
}
