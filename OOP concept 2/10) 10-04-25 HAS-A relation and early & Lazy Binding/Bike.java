public class Bike{
	String brand;
	String name;
	double price;
	double mileage;

	Engine e1;
	Engine e2 = new Engine();            //this also a one way of early binding

	Tyre t1 ;
	Tyre t2 = new Tyre();

	public Bike() {
	}

	public Bike(String brand,String name,double price,double mileage,int cc,int stroke,double torque,String tBrand,double size)
	{
		e1 = new Engine(cc,stroke,torque);
		t1 = new Tyre(tBrand,size);
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.mileage = mileage;
		System.out.println("Bike Added!");
	}

	public void displayBike()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
		System.out.println("Mileage: "+mileage);
	}
}