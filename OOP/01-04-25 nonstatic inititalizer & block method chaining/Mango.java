class Mango
{
	String type;
	String origin;
	double price;

	{
		System.out.println("object loaded START in non static block");
		System.out.println(type);
		System.out.println(origin);
		System.out.println(price);
		System.out.println(this);
		//System.exit(0);
		System.out.println("object loaded END in non static block");
	}

	public Mango display()
	{
		System.out.println(type);
		System.out.println(origin);
		System.out.println(price);

		return this;
	}

	public Mango showType()
	{
		System.out.println(type);
	//	System.out.println(this);
		return this;
	}
	public Mango showOrigin()
	{
		System.out.println(origin);
		//System.out.println(this);
		return this;
	}
	public Mango showPrice()
	{
		System.out.println(price);
	//	System.out.println(this);
		return this;
	}
}
