package strings;

public class SortAllCharacterInString 
{
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
	public static void main(String []args)
	{
		String s = "dcbazxyw";
		char ch[] = {'d','c','b','a'};
		System.out.println(sortString(s));
		System.out.println(binarySearch(ch, 'a'));
	}
}
