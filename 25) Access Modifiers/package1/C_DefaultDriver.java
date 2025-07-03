package package1;

//public class C_Defalut           //if you accessing this class then make it public and comment default class
class C_Defalut           
{
	int a=10;
	static int b=20;
	
	C_Defalut() {}
	
	void test()
	{
		System.out.println("default void demo of class c");
	}
	
	static void demo()
	{
		System.out.println("default static demo of clas c");
	}
	
	public static void main(String[] args)
	{
		C_Defalut c_Defalut = new C_Defalut();
		c_Defalut.test();
		demo();
		System.out.println(c_Defalut.a);
		System.out.println(b);
	}
}
/*
 * Here i declared the class , variable, method, constructor default
 * default member can access in same class directly and other class but in same package
 * we cannot access default member in other package if we try we will get CTE
 */
public class C_DefaultDriver 
{
	public static void main(String[] args) 
	{
		System.out.println("other class main ");
		C_Defalut c_Defalut= new C_Defalut();
		c_Defalut.test();
		C_Defalut.demo();
		System.out.println(c_Defalut.a);
		System.out.println(C_Defalut.b);
	}
}
