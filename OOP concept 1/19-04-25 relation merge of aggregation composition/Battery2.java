package principleOfOop.Shrikantsir;

public class Battery2 {
	private String brand;
	private String type;
	private double capacity;
	private String manuf;
	private int hours;
	private double power;
	
	private Battery2() {
	}

	public Battery2(String brand, String type, double capacity, String manuf, int hours, double power) {
		this.brand = brand;
		this.type = type;
		this.capacity = capacity;
		this.manuf = manuf;
		this.hours = hours;
		this.power = power;
	}

	public void displayBattery() {
		System.out.println( "Battery2 [brand=" + brand + ", type=" + type + ", capacity=" + capacity + ", manuf=" + manuf
				+ ", hours=" + hours + ", power=" + power + "]");
	}
	
	
}
