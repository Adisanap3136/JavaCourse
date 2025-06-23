package principleOfOop.Shrikantsir;

public class Pen {
	String brand;
	String type;
	String color;
	double price;
	public Pen(String brand, String type, String color, double price) {
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.price = price;
	}
	
	public void displayPen()
	{
		System.out.println("Pen details");
		System.out.println("Brand: "+brand);
		System.out.println("Type: "+type);
		System.out.println("Color: "+color);
		System.out.println("Price: "+price);
		System.out.println();
	}
}
