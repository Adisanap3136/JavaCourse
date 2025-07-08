package arrays;

public class CountOfEvenOddelementFromArray 
{
	public static int[] countOfEvenOdd(int[]arr)
	{
		int evenCnt=0,oddCnt=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				evenCnt++;
			else
				oddCnt++;
		}
		return new int[] {evenCnt,oddCnt};
	}
	
	public static void main(String[] args)
	{
		int[]arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,21,21,21,17,17};
		
		System.out.println("Even Number count: "+countOfEvenOdd(arr)[0]+"\n"+"Odd Number count: "+countOfEvenOdd(arr)[1]);
	}
}
