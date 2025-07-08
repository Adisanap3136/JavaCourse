package arrays;

public class CreateDuplicateOfGivenArray 
{
	
	public static int[] makeDuplicateArray(int[] arr)
	{
		int[]dup = new int[arr.length];
		for(int i=0;i<arr.length;i++)
			dup[i]=arr[i];
		return arr;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,6,7,6,7,8,9};
		
		int[] dup = makeDuplicateArray(arr);
		
		for(int i=0;i<dup.length;i++)
			System.out.print(dup[i]+", ");
		
//		It is a way of printing whole array at a time ....Arrays is a class and in that class toString() is overrided so we get our array instead of reference
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(dup));
	}
}
