package arrays;

public class ArrayCreation 
{
	public static void main(String[] args)
	{
		System.out.println("SHREE GANESHAY NAMAH!");
		System.out.println("DSA Started From Today");
		System.out.println("Array creation\n");
		
//this is array declaration without initialization , we cannot use these array reference variable
		int[] arr1 ;   
		
//this is the array initialization and initialization statement
		int[] arr2 = new int[5];
		System.out.println(arr2);        //[I@15db9742
		
		String[] arr3 = new String[3];
		System.out.println(arr3);       //[Ljava.lang.String;@6d06d69c
		
		double[] arr4 = new double[2];
		System.out.println(arr4);		//[D@7852e922
		
		boolean[] arr5 = new boolean[2];
		System.out.println(arr5);		//[Z@4e25154f
		
		byte[] arr6 = new byte[5];
		System.out.println(arr6);		//[B@70dea4e
		
		short[] arr7 = new short[2];
		System.out.println(arr7);		//[S@5c647e05
		
		char[] arr8 = new char[5];
		System.out.println(arr8);		//[C@33909752
		
		long[] arr9 = new long[5];
		System.out.println(arr9);       //[J@55f96302
		
		float[] arr10 = new float[1];
		System.out.println(arr10);		//[F@3d4eac69
		
//we can write like that	
		int arr11[] = new int[4];
		System.out.println(arr11);		//[I@42a57993
		
		long arr12[] = new long[1];
		System.out.println(arr12);
	}
}