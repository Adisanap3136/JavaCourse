package principleOfOop.Shrikantsir;

public class Laptop {
	String brand;
	String model;
	double price;
	public Laptop(String brand, String model, double price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public void displayLaptop()
	{
		System.out.println("Laptop details");
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Price: "+price);
		System.out.println();
	}
	
	
}
