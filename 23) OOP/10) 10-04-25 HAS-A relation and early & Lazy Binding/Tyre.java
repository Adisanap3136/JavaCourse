public class Tyre{
	String brand;
	double size;

	public Tyre(){
	}

	Tyre(String brand,double size)
	{
		this.brand = brand;
		this.size = size;
		System.out.println("Tyre built!");
	}

	public void displayTyre()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Size: "+size);
	}
}