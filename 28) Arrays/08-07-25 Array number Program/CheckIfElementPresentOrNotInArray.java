package arrays;

public class CheckIfElementPresentOrNotInArray 
{
	
	public static boolean isPresentOrNot(int[]arr,int ele)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		int[]arr = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Check element is present or not: "+isPresentOrNot(arr, 100));
	}
}