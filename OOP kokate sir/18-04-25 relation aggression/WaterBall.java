package principleOfOop.Shrikantsir;

public class WaterBall {
	String material;
	double capacity;
	String brand;
	double price;
	public WaterBall(String material, double capacity, String brand, double price) {
		this.material = material;
		this.capacity = capacity;
		this.brand = brand;
		this.price = price;
	}
	
	public void displayWaterBottle()
	{
		System.out.println("Bottel detail");
		System.out.println("Material: "+material);
		System.out.println("Capacity: "+capacity);
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		System.out.println();
	}
}
