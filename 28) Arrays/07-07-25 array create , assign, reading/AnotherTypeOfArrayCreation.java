package arrays;

public class AnotherTypeOfArrayCreation 
{
	public static void main(String[] args)
	{
//	Here we direct create an array with data 		
		
		int[] arr = {1,2,3,4,5,6};
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+ ", ");
		
		System.out.println();
		String[] str = {"Computer","Laptop","Printer","MacOs","Linux","Windows"};
		
		for(int i=0;i<str.length;i++)
			System.out.print(str[i]+", ");
	}
}
