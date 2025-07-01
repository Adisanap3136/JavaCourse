package exceptionsAndExceptionHandling;

public class Driver 
{
	public static void main(String[] args)
	{
		PrivateConstructor p = new PrivateConstructor().createObject();
//		System.out.println(p);    //here i call the private constructor using getter method and class as a return type
		
		PrivateConstructor.main(args);              //here i calling the another class main method
		main2(args);
	}
	public static void main()
	{
		System.out.println("i am duplicate main method");
	}
	public static void main2(String[] a)
	{
		System.out.println("i am duplicate main method");
	}
}