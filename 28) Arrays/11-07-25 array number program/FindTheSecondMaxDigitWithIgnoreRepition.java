package arrays;

public class FindTheSecondMaxDigitWithIgnoreRepition 
{
	public static void secMaxEle(int[]arr)
	{
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				secMax=max;
				max=arr[i];
			}
			else if(arr[i]>max&&arr[i]!=max)
			{
				secMax=arr[i];
			}
		}
		System.out.println("Max Element: "+max+"\nSecond Max: "+secMax);
	}
	public static void main(String[]arg)
	{
//		int[]arr = {1,2,56,85,48,5,55,4,7,85,8,90,90,12};
		int[]arr = {1,2,3,4,5};
		
		secMaxEle(arr);
	}
}
