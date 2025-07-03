package package1;

public class D_Protected        //i use public because if we access this class in other package ---comment second line
//class D_Protected              //if you want to run theese file then comment the above statement
{
	protected int a = 10;
	protected static int b=10;
	
	protected D_Protected() {}
	
	protected void test()
	{
		System.out.println("from protected test method");
	}
	
	protected static void demo()
	{
		System.out.println("from protected static demo method");
	}
	
	public static void main(String[] args)
	{
		D_Protected d = new D_Protected();
		d.test();
		demo();
		System.out.println(d.a);
		System.out.println(b);
	}
}
/*
 * here i declare the protected static non static variable and constructor and method
 * we can access default member is  other class in same package
 * we access protected member in other class in other package only if the Is-a relation is happening
 * and the protected member class must be public
 */
// class D_ProtectedDriver 
//{
//	public static void main(String[] args) 
//	{
//		System.out.println("main driver of protected");
//		D_Protected d = new D_Protected();
//		d.test();
//		D_Protected.demo();
//		System.out.println(d.a);
//		System.out.println(D_Protected.b);
//	}
//}
