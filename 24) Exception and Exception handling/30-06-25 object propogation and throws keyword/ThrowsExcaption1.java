package exceptionsAndExceptionHandling;

public class ThrowsExcaption1 
{
	public static void main(String[] args) throws  InterruptedException
	{
		try{System.out.println(1/0);}
		catch(ArithmeticException e){System.out.println("Exception Handled");}
		for(int i=0;i<5;i++)
		{
			Thread.sleep(1000);           //exception is declared not handled,jvm will handle this exception
			System.out.println("Something happening");
		}
	}
}

/*
 *Here we declare the exception , these exception is handled by the jvm  
 *means the exception is not occurring but the compiler forces to the programmer to handle the exception or declare exception using the keyword "throws".
 */