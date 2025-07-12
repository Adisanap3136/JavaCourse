package arrays;
import java.util.Arrays;

public class ZigZagVersion2 
{
	public static int[] zigZagversion2(int[]arr1,int[]arr2)
	{
		int[]zigZagArr = new int[arr1.length+arr2.length];
		
		int mem=0;
		if(arr1.length>arr2.length)
		{
			System.out.println("Array 1 size greater");
			int i;
			for(i=0;i<arr2.length;i++,mem+=2)
			{
				zigZagArr[mem]=arr1[i];
				zigZagArr[mem+1]=arr2[i];
			}
			while(i<arr1.length)
			{
				zigZagArr[mem]=arr1[i];
				mem++;
				i++;
			}
		}
		else if(arr2.length>arr1.length)
		{
			System.out.println("Array 2 size greater");
			int i;
			for(i=0;i<arr1.length;i++,mem+=2)
			{
				zigZagArr[mem]=arr1[i];
				zigZagArr[mem+1]=arr2[i];
			}
			while(i<arr2.length)
			{
				zigZagArr[mem]=arr2[i];
				mem++;
				i++;
			}
		}
		else if(arr2.length==arr1.length)
		{
			System.out.println("Equal length");
			int i;
			for(i=0;i<arr1.length;i++,mem+=2)
			{
				zigZagArr[mem]=arr1[i];
				zigZagArr[mem+1]=arr2[i];
			}
		}
		
		
		return zigZagArr;
	}
	public static void main(String[] args)
	{
		int[]arr1 = {1,2,3,4};
		int[]arr2 = {7,8,9,1,5,8,2,4};
		int[]arr = zigZagversion2(arr1, arr2);
		
		System.out.println(Arrays.toString(arr));
	}
}
