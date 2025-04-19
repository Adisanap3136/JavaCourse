package principleOfOop.Shrikantsir;

import java.util.ArrayList;

public class Bag {
	String brand;
	String type;
	double litre;
	int compartment;
	double price;
	String color;
	String material;
	ArrayList<Book> listBook = new ArrayList<Book>();
	ArrayList<Pen> listPen = new ArrayList<Pen>();
	WaterBall w1;
	Laptop l1;
	
	
	public Bag(String brand, String type, double litre, int compartment, double price, String color, String material) {
		this.brand = brand;
		this.type = type;
		this.litre = litre;
		this.compartment = compartment;
		this.price = price;
		this.color = color;
		this.material = material;
	}
	
	public void displayBag() {
		System.out.println("Brand: "+brand);
		System.out.println("Type: "+type);
		System.out.println("Litre: "+litre);
		System.out.println("Compartment: "+compartment);
		System.out.println("Price: "+price);
		System.out.println("Color: "+color);
		System.out.println("material: "+material);
		System.out.println();
	}
	
	public void addBook(String type,String brand,String size,int pages,double price)
	{
		Book b1 = new Book(type, brand, size, pages, price);
		listBook.add(b1);
	}
	
	public void addPen(String brand,String type,String color,double price)
	{
		Pen p1 = new Pen(brand, type, color, price);
		listPen.add(p1);
	}
	public void addLaptop(String brand,String model,double price)
	{
		 l1 = new Laptop(brand, model, price);
	}
	public void addWaterBottle(String material,double capacity,String brand,double price)
	{
		 w1 = new WaterBall(material, capacity, brand, price);
	}
	
}
