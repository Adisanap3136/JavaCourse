package TwoDimesionalArray;

import java.util.Arrays;

public class MatrixMultiplication 
{
	public static int[][] matrixMultiplication(int[][]a,int[][]b)
	{
		if(checkDimension(a, b))
		{
			int[][]ar = new int[a.length][b.length];
			for(int i=0;i<a.length;i++)
				for(int j=0;j<a.length;j++)
					for(int k=0;k<a.length;k++)
						ar[i][j] += a[i][k]*b[k][j];
			return ar;
		}
		return null;
	}
	
	public static boolean checkDimension(int[][]a,int[][]b)
	{
		if(a.length==b.length)
			for(int i=0;i<a.length;i++)
				if(a[i].length!=b[i].length)
					return false;
		return true;
	}
	
	public static void main(String []args)
	{
		int[][]a = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		int[][]b = {
				{1,2,3},
				{4,5,6},
				{7,8,9,3},
		};
		int[][]c = matrixMultiplication(a, b);
		if(c!=null)
		{
			for (int i = 0; i < c.length; i++) 
				System.out.println(Arrays.toString(c[i]));;
		}
		else
			System.out.println("Matrices is not in proper dimension!!");
	}
}
