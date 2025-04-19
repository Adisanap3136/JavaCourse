package principleOfOop.Shrikantsir;

public class Charger2 {
	private String type;
	private double power;
	private String brand;
	
	private Charger2() {
	}

	public Charger2(String type, double power, String brand) {
		this.type = type;
		this.power = power;
		this.brand = brand;
	}

	public void displayCharger() {
		System.out.println( "Charger2 [type=" + type + ", power=" + power + ", brand=" + brand + "]");
	}
	
	
}
