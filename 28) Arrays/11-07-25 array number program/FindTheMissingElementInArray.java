package arrays;

public class FindTheMissingElementInArray 
{
	public static void missingEle(int[]a)
	{
		int sum=0;
		int max= Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			if(a[i]>max)
				max=a[i];
		}
		int naturalNum = max*(max+1)/2;
		System.out.println("Missing number is: "+(naturalNum-sum));
	}
	public static void main(String[]args)
	{
		int[]arr = {1,2,3,4,5,7};
		
		missingEle(arr);
	}
}

//here we use the n*n+1/2 forumula to et the missing element