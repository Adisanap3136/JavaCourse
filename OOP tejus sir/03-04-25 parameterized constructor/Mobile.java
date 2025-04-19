class Mobile
{
	String brand ;
	String model;
	double price;

	Mobile()
	{
	}

	Mobile(String brand, String model,int price)
	{
		this.brand =brand;
		this.model = model;
		this.price = price;
	}
	public void displayMobile()
	{
		System.out.println(brand);
		System.out.println(model);
		System.out.println(price);
	}
}
