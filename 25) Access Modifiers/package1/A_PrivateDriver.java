package package1;

class A_PrivateModifier 
{
	private int a = 10;
	
	private static int b=20;
	
	private A_PrivateModifier() {}
	
	private void test()
	{
		System.out.println("Private method from private modifier program");
	}
	
	private static void demo()
	{
		System.out.println("Private static method from private access modifier program");
	}
	
	public static void main(String[] args)
	{
		A_PrivateModifier a = new A_PrivateModifier();
		demo();
		a.demo();
		a.test();
		System.out.println(a.a);
		System.out.println(a.b);
	}
}
 
/*
 * we cannot access the private member in another class or other package
 * and we only make private to the variable, methods, constructor
 * we cannot access private static and non static member in another class in same package
 */
public class A_PrivateDriver 
{
	public static void main(String[] args)
	{
		System.out.println("main driver");
//		A_PrivateModifier a = new A_PrivateDriver();
//		A_PrivateModifier.demo();              
//		System.out.println(A_PrivateModifier.b);
	}
}
