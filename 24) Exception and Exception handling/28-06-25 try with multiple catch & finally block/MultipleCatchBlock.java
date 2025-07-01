package exceptionsAndExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;
public class MultipleCatchBlock 
{
	public static void main(String[] args)
	{
		try 
		{
			System.out.println(1/0);
			Scanner sc = new Scanner(System.in);     
			System.out.println("enter number");
			sc.nextInt();               //occur input miss match exception
			MultipleCatchBlock m = (MultipleCatchBlock) (new Object());
			m.hashCode();                    //occur class cast exception
			String n = null; 
			n.hashCode();                 //occur null pointer exception 
		}
		catch(ClassCastException ref1)
		{
			System.out.println("dont downacast");
		}
		catch(InputMismatchException red2)
		{
			System.out.println("input miss match exception");
		}
		catch(NumberFormatException ref)
		{
			System.out.println("number format exception");
		}
		catch(ArithmeticException e)
		{
			System.out.println("dont divide by zero");
		}
		catch(NullPointerException np)
		{
			System.out.println("dont use null as reference");
		}
		catch(Exception e)
		{
			System.out.println("Some Exception has occured");
		}
		finally
		{
			System.out.println("Resources connection closing successfull!");
		}
	}
}