class MobileDriver
{
	public static void main(String[] args)
	{
		Mobile m1 = new Mobile();
		System.out.println("m1 object Reference: "+m1);

		m1.brand = "Apple";
		m1.price = 150000;
		m1.model = "16 pro max";

		m1.displayMobile();

		System.out.println("\n-----------------------------\n");

		Mobile m2 = new Mobile();
		System.out.println("m1 object Reference: "+m2);
		m2.displayMobile();
	}
}
/*
m1 object Reference: Mobile@15db9742
Brand: Apple
Price: 150000.0
Model: 16 pro max

-----------------------------

m1 object Reference: Mobile@6d06d69c
Brand: null
Price: 0.0
Model: null
*/