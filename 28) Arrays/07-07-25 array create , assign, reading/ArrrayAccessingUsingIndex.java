package arrays;

public class ArrrayAccessingUsingIndex 
{
	public static void main(String[] args)
	{
//		if we try to access the element greater than size and less than zero then we get run time exception called
//		ArrayIndexOutOfBoundsException
		
		System.out.println("int array object accessing");
		
		int[] arr1 = new int[3];
		System.out.println(arr1[0]);	//0
		System.out.println(arr1[1]);	//0
		System.out.println(arr1[2]);	//0
//		System.out.println(arr1[3]);	// java.lang.ArrayIndexOutOfBoundsException: 3
//		System.out.println(arr1[-1]);	// java.lang.ArrayIndexOutOfBoundsException: 3
		
		System.out.println("long array object accessing");
		
		long arr2 [] = new long[3];
		System.out.println(arr2[0]);	//0
		System.out.println(arr2[1]);	//0
		System.out.println(arr2[2]);	//0
		
		System.out.println("String array object accessing");
		
		String arr3 [] = new String[3];
		System.out.println(arr3[0]);	//null
		System.out.println(arr3[1]);	//null
		System.out.println(arr3[2]);	//null
		
		System.out.println("short array object accessing");
		
		short arr4 [] = new short[3];
		System.out.println(arr4[0]);	//0
		System.out.println(arr4[1]);	//0
		System.out.println(arr4[2]);	//0
		
		System.out.println("byte array object accessing");
		
		byte arr5[] = new byte[2];
		System.out.println(arr5[0]);	//0
		System.out.println(arr5[1]);	//0
		
		System.out.println("double array object accessing");
		
		double arr6[] = new double[3];
		System.out.println(arr6[0]);
		System.out.println(arr6[1]);
		System.out.println(arr6[2]);
		
		System.out.println("float array object accessing");
		
		float arr7[] = new float[3];
		System.out.println(arr7[0]);
		System.out.println(arr7[1]);
		System.out.println(arr7[2]);
		
		System.out.println("boolean array object accessing");
		
		boolean arr8[] = new boolean[2];
		System.out.println(arr8[0]);
		System.out.println(arr8[1]);
		
		System.out.println("char array object accessing");
		
		char arr9[] = new char[3];
		System.out.println(arr9[0]);
		System.out.println(arr9[1]);
		System.out.println(arr9[2]);
  	}
}
