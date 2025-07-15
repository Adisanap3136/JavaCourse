package arrays;
import java.util.Arrays;
public class InsertElementsFromGivenIndexOfAnotherarrayInGivenArray
{
	public static int[] addElementFromOtherArray(int[]arr1,int[]arr2,int index)
	{
		if(index>=0&&index<arr1.length)
		{
			int[]ans = new int[arr1.length+arr2.length];
			
			for(int i=0,j=0;i<ans.length;i++)
			{
				if(i<index)
				{
					ans[i] =arr1[i];
				}
				else if(i<arr2.length+index)
				{
					ans[i] = arr2[j];
					j++;
				}
				else
					ans[i] = arr1[i-arr2.length];
			}
			return ans;
		}
		
		return null;
	}
	
	public static void main(String[]args)
	{
		int[]arr1 = {2,3,6,4,8,9,7};
		int[]arr2 = {1,1,1,1,1,1};
		System.out.println(Arrays.toString(addElementFromOtherArray(arr1,arr2,9)));
	}
}
