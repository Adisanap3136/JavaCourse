public class PenRefill {
	String color;
	String type;
	double size;

	public PenRefill() {
	}

	public PenRefill(String color, String type, double size) {
		this.color = color;
		this.type = type;
		this.size = size;
		System.out.println("Refill Loaded!");
	}

	public void displayRefill()
	{
		System.out.println("Color: "+color);
		System.out.println("type: "+type);
		System.out.println("Size: "+size);
	}
}