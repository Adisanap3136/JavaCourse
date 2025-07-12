package arrays;

public class FindTheMinElementInArray 
{	
	public static int minElement(int[]arr)
	{
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		return min;
	}
	
	public static void main(String[]args)
	{
		int[]arr = {-1,9,8,6,5,7,4,1,-8,0};
		System.out.println(minElement(arr));
	}
}