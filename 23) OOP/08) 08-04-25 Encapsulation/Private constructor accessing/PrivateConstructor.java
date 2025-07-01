package exceptionsAndExceptionHandling;

import java.util.Scanner;

public class PrivateConstructor 
{
	private String name;
	private int age;
	private double sallary;
	
	public PrivateConstructor() {}
	
	private PrivateConstructor(String name,int age,double sallary)
	{
		this.name=name;
		this.age=age;
		this.sallary=sallary;
	}
	public PrivateConstructor createObject()
	{
		try {
			System.out.println("Name, age, sallary");
			Scanner sc = new Scanner(System.in);
			return new PrivateConstructor(sc.next(),sc.nextInt(),sc.nextDouble());
		}
		catch (Throwable ref) {
			System.out.println("Exception has occured bye bye!");
			return this;
		}
	}
	public static void main(String[] args) {
		System.out.println("i am main of private constructor class");
	}
}