package arrays;

public class ArrayStoringOperation 
{
	public static void main(String[] array)
	{
//		storing elements in array using index
//		in Array class we have 'length' keyword to get the length of the array
		
		System.out.println("storing element in int array object");
		int arr1[] = new int[3];
		arr1[0]=2;
		arr1[1]=02;
		arr1[2]=2;
		
		for(int index = 0;index<arr1.length ; index++)
		{
			System.out.println(arr1[index]);
		}
		
		System.out.println("storing element in int array object");
		String arr2[] = new String[3];
		arr2[0] = "something";
		arr2[1] = "nothing";
		arr2[2] = "do it";
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
	}
}
