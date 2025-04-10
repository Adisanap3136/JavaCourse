package principleOfOop;

public class Marker {
	String brand;
	double price;
	String type;
	Refil r1 = new Refil();    //we create a object in marker class
	
	Marker()
	{}
	
	public void displayMarker()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		System.out.println("type: "+type);
	}
}
