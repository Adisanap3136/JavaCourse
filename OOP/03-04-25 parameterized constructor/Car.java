class Car
{
	String brand ;
	String model;
	double price;

	Car()
	{
	}

	Car(String brand, String model,int price)
	{
		this.brand =brand;
		this.model = model;
		this.price = price;
	}
	public void displayCar()
	{
		System.out.println(brand);
		System.out.println(model);
		System.out.println(price);
	}
}
