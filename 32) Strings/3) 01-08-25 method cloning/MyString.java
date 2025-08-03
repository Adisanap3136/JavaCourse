package strings;

public final class MyString 
{
	public MyString() {}
	
	public static String toUpper(String s)
	{
		char[]ch = new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c >= 'a' && c<='z')
				ch[i] = (char)(c-32);
			else 
				ch[i] = c;
		}
		return new String(ch);
	}
	public static String toLower(String s)
	{
		char[]ch = new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c >= 'A' && c<='Z')
				ch[i] = (char)(c+32);
			else 
				ch[i] = c;
		}
		return new String(ch);
	}
	public static String toggle(String s)
	{
		char[]ch = new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c >= 'a' && c<='z')
				ch[i] = (char) (c-32);
			else if(c >= 'A' && c<='Z')
				ch[i] = (char)(c+32);
			else 
				ch[i] = c;
		}
		return new String(ch);
	}
	public static boolean checkPalindrome(String s)
	{
		int i;
		for(i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
				return false;
		}
		return true;
	}
	public static char largestChar(String s)
	{
		int max = Character.MIN_VALUE;
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)>max)
				max = s.charAt(i);
		return (char)max;
	}
	public static String revString(String s)
	{
		String rev = "";
		for(int i=s.length()-1;i!=0;i--)
			rev = rev + s.charAt(i);
		return rev;
	}
	public static byte[] toByteArray(String s)
	{
		byte[]b = new byte[s.length()];
		for(int i=0;i<s.length();i++)
			b[i] = (byte)s.charAt(i);
		return b;
	}
	public static String replaceAllChar(String s, char old, char naya)
	{
		char[]ch = new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(old==c)
				ch[i] = naya;
			else
				ch[i] = c;
		}
		return new String(ch);
	}
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
	public static String subString(String s,int index)
	{
		if(index>=0 && index<=s.length())
		{
			char[]c = new char[s.length()-index];
			for(int i=0,j=0;i<s.length();i++)
				if(i>=index)
					c[j++] = s.charAt(i);
			return new String(c);
		}
		else 
			return null;
	}
	public static String subString(String s,int start,int end)
	{
		if(start>=0 && end<=s.length())
		{
			char[]c = new char[s.length()-(end-start)];
			for(int i=0,j=0;i<s.length();i++)
				if(i>=start && i<end)
					c[j++] = s.charAt(i);
			return new String(c);
		}
		else 
			return null;
	}
	public static String sortString(String s)
	{
		char[]a = new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			a[i] = s.charAt(i);
		}
		return new String(sort(a));
	}
	public static char[] sort(char []a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					char temp=a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
	}
	public static boolean binarySearch(char[]c,char ele)
	{
		sort(c);
		int start=0;
		int end=c.length-1;
		int mid = (start+end)/2;
		while(start<=end)
		{
			if(c[mid]==ele)
			{
				return true;
			}
			else if(ele>c[mid])
			{
				start = mid+1;
			}
			else if(ele<c[mid])
			{
				end = mid-1;
			}
			mid = (start+end)/2;
		}
		return false;
	}
	public static boolean startsWith(String s,String prefix)
	{
		if(prefix.length()>s.length())
			return false;
		int value = prefix.length()-1;
		if(prefix=="")
			return true;
		if(s.charAt(value)==prefix.charAt(value))
			return true;
		return false;
	}
	public static boolean endsWith(String s,String suffix)
	{
		if(suffix=="")
			return true;
		if(s.charAt(s.length()-1)==suffix.charAt(suffix.length()-1))
			return true;
		return false;
	}
	public static String trim(String s)
	{
		int start;
		int end;
		for(start=0;start<s.length();start++)
			if(s.charAt(start)!=' ')
				break;
		for(end =s.length()-1;end>0;end--)
			if(s.charAt(end)!=' ')
				break;
		char[]ar = new char[(end-start)+1];
		for(int i=0,j=0;i<s.length();i++)
		{
			if(i>=start && i<=end)
				ar[j++] = s.charAt(i);
		}
		return new String(ar);
	}
	public static String concat(String s, String add)
	{
		return s+add;
	}
}