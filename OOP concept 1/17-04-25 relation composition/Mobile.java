package principleOfOop.Shrikantsir;

public class Mobile {
	String brand;
	String model;
	double price;
	String color;
	double camera;
	OperatingSystem os;
	Battery battery;
	Processor p = new Processor("Snapdragon", 2.5, 12, 512);
	
	private Mobile() {
	}

	public Mobile(String brand, String model, double price, String color, double camera,OperatingSystem os) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.color = color;
		this.camera = camera;
		this.os = os;
		this.battery = new Battery( 5000,"Samsung","lithiun","19/04/25","one yaer from manufacture",60);
	}
	
	public void displayMobile()
	{
		System.out.println("Mobile Details");
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Price: "+price);
		System.out.println("Color: "+color);
		System.out.println("Camera: "+camera);
		System.out.println();
	}
	
	
}
