package arrays;

public class FindThirdMin 
{
	public static void secondMin(int[]arr)
	{
		int min = Integer.MAX_VALUE;
		int secMin = Integer.MAX_VALUE;
		int thirdMin = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min||thirdMin<secMin)
			{
				thirdMin=secMin;
				secMin=min;
				min = arr[i];
			}
			else if(arr[i]<min && min!=secMin || secMin!=thirdMin)
			{
				thirdMin=arr[i];
				secMin = arr[i];
			}
		}
		
		System.out.println("min: "+min);
		System.out.println("second min: "+secMin);
		System.out.println("second min: "+thirdMin);
	}
	public static void main(String[]args)
	{
		int[]arr = {9,8,7,7,46,1,0};
		secondMin(arr);
	}
}
