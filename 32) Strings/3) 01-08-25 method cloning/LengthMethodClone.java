package strings;

public class LengthMethodClone 
{
	public static int lengthArr(byte[] a)
	{
		byte cnt;
		for(int i=0;;i++)
		{
			try
			{
				cnt=a[i];
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				return i;
			}
		}
	}
	public static int lengthArr(short[] a)
	{
		short cnt;
		for(int i=0;;i++)
		{
			try
			{
				cnt=a[i];
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				return i;
			}
		}
	}
	public static int lengthArr(char[] a)
	{
		int cnt;
		for(int i=0;;i++)
		{
			try
			{
				cnt=a[i];
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				return i;
			}
		}
	}

	public static int lengthArr(long[] a)
	{
		long cnt;
		for(int i=0;;i++)
		{
			try
			{
				cnt=a[i];
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				return i;
			}
		}
	}
	public static int lengthArr(float[] a)
	{
		float cnt;
		for(int i=0;;i++)
		{
			try
			{
				cnt=a[i];
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				return i;
			}
		}
	}
	public static int lengthArr(double[] a)
	{
		double cnt;
		for(int i=0;;i++)
		{
			try
			{
				cnt=a[i];
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				return i;
			}
		}
	}
	public static int lengthArr(String[] a)
	{
		String cnt;
		for(int i=0;;i++)
		{
			try
			{
				cnt=a[i];
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				return i;
			}
		}
	}
	public static int lengthArr(boolean[] a)
	{
		Object cnt;
		for(int i=0;;i++)
		{
			try
			{
				cnt=a[i];
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				return i;
			}
		}
	}
	public static int stringLength(String s)
	{
		char cnt;
		for(int i=0;;i++)
		{
			try
			{
				cnt=s.charAt(i);
			}
			catch(StringIndexOutOfBoundsException e)
			{
				return i;
			}
		}
	}
	public static void main(String[]args)
	{
		String s = "abcd";
		byte[]a = {1,3,3,56,8,4,8,7};
		System.out.println(lengthArr(a));
		System.out.println(stringLength(s));
	}
}