package principleOfOop.principleOfOopObjectClass;
//	lazy binding back up batch 17-06-25
//	lazy binding is happening on user demand, we achieve with one helping method

class Pendrive
{
	String brand;
	int size;
	double price;
	public Pendrive(String brand,int size,double price)
	{
		this.brand=brand;
		this.size=size;
		this.price=price;
	}

	public void displayPendrive()
	{
		System.out.println( "Pendrive [brand=" + brand + ", size=" + size + ", price=" + price + "]");
	}
}

class Computer
{
	String brand;
	String type;          //gaming or office Gaming
	double price;
	String processor;
	Pendrive p;
	
	public Computer(String brand,String type,double price,String processor)
	{
		this.brand=brand;
		this.type=type;
		this.price=price;
		this.processor=processor;
		System.out.println("Computer is created!");
	}

	public void displayComputer() {
		System.out.println( "Computer [brand=" + brand + ", type=" + type + ", price=" + price + ", processor=" + processor +"]");
	}
	
//	Heelper Method which is achieving lazy binding
	public void insertPendrive(String pBrand,double size,double pPrice)
	{
		p = new Pendrive(pBrand, 0, pPrice);
		System.out.println("Pendrive inserted!");
	}
}

public class ComputerDriver 
{
	public static void main(String []args)
	{
		Computer c1 = new Computer("Asus", "Coding with Gaming", 48000.00, "Intel-5 11400H");
		c1.displayComputer();
		c1.insertPendrive("Sandisk", 512, 54000);
		c1.p.displayPendrive();
	}
}
