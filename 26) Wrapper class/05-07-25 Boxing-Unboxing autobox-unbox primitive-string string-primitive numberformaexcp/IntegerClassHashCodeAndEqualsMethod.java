package wrapperClass;

public class IntegerClassHashCodeAndEqualsMethod 
{
	public static void main(String[] args)
	{
		Integer i = new Integer(10);
		System.out.println(i);
		
		Integer j = new Integer(10);
		System.out.println(j);
		
		System.out.println(i==j);			//false because the objects reference are different even values are same
		System.out.println(i.equals(j));       //true because it only compares the attributes rather than reference 
		
//		but always remember that whenever we perform comparison the class must be same .(one class with other class is not working even the value is same)
		
		System.out.println(i.hashCode());
		System.out.println(j.hashCode());
		
//		hashcode methods also overrided in Wrapper class
	}
}