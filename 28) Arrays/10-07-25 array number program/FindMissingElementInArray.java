package arrays;

public class FindMissingElementInArray 
{
	
	public static int findMissingNumber(int[]arr)
	{
		int i,j=1;
		for(i=0;i<arr.length;i++)
		{
			if(j==arr[i])
			{
				j++;
			}
			else
				return j;
		}
		return -1;
	}
	
	public static void main(String[]args)
	{
		int[]arr = {1,2,3,5};
		
		System.out.println(findMissingNumber(arr));
	}
}