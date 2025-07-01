package exceptionsAndExceptionHandling;

public class ExceptionObjectPropogation1 
{
	public static void div(int a,int b)
	{
		System.out.println(a/b);
//		try{
//			System.out.println(a/b);
//		}
//		catch(Exception e){
//			System.out.println("Dont divide by zero!"+e);
//		}
	}
	
	public static void main(String[] args)
	{
//		div(1,0);
		try{
			div(1,0);
		}
		catch(Exception e){
			System.out.println("Dont divide by zero!");
		}
	}
}

/*
 *Exception Object Propogation
 *means the exception is occurred in the method and we can handled in calling statement 
 *as well as 
 *we also handle in the method as we as in method calling statement
 */