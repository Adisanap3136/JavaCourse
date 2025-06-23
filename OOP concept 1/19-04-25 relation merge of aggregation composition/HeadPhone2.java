package principleOfOop.Shrikantsir;

public class HeadPhone2 {
	private String brand;
	private String type;
	private double mic;
	private double price;
	
	private HeadPhone2() {
	}

	public HeadPhone2(String brand, String type, double mic, double price) {
		this.brand = brand;
		this.type = type;
		this.mic = mic;
		this.price = price;
	}

	public void displayHeadPhone() {
		System.out.println("HeadPhone2 [brand=" + brand + ", type=" + type + ", mic=" + mic + ", price=" + price + "]");
	}
	
	
}
