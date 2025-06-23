package principleOfOop;

public class Charger_LazyBinding1 {
	String typec2c;
	double wtr;
	String color;
	
	public Charger_LazyBinding1() {
	}

	public Charger_LazyBinding1(String typec2c, double wtr, String color) {
		this.typec2c = typec2c;
		this.wtr = wtr;
		this.color = color;
	}
	
	public void displayCharger()
	{
		System.out.println("Type: "+typec2c);
		System.out.println("Watt r: "+wtr);
		System.out.println("color: "+color);
	}
}
