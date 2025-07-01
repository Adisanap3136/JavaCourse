class A
{
	int a =1;

	A(){}

	void displayA()
	{
		System.out.println(a);
	}
}

class B extends A
{
	int b=10;

	B() {}

	void displayB()
	{
		System.out.println(b);
	}
}

public class ABDriver_IS_A_Relationship
{
	public static void main(String[] args)
	{
		B b = new B();
		b.displayA();
		b.displayB();

		System.out.println(b.a);
		System.out.println(b.b);
	}
}