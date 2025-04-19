package principleOfOop.Shrikantsir;

public class Battery {
	int capacity;
	String brand;
	String type;
	String manOfDate;
	String warranty;
	double power;
	
	private Battery() {
	}

	public Battery(int capacity, String brand, String type, String manOfDate, String warranty, double power) {
		this.capacity = capacity;
		this.brand = brand;
		this.type = type;
		this.manOfDate = manOfDate;
		this.warranty = warranty;
		this.power = power;
	}
	
	public void displayBattery()
	{
		System.out.println("Battery Details");
		System.out.println("capacity: "+capacity);
		System.out.println("Brand: "+brand);
		System.out.println("Type: "+type);
		System.out.println("Manufacture Date: "+manOfDate);
		System.out.println("Warranty: "+warranty);
		System.out.println("Power: "+power);
		System.out.println();
	}
}
