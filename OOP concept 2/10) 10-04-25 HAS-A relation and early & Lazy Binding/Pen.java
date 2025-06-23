package principleOfOop;

import java.util.Scanner;

public class Pen {
	String brand;
	String type;
	double price;
	PenRefill pr ;
	
	public Pen() {
		// TODO Auto-generated constructor stub
	}
	
//	{
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter the Color: ");
//		String color = sc.next();
//		System.out.print("Enter the type: ");
//		String type = sc.next();
//		System.out.print("Enter the pointer size: ");
//		double size = sc.nextDouble();
//		
//		pr = new PenRefill(color, type, size);
//	}
	
	
	
//public Pen(String brand, String type, double price) {
//		this.brand = brand;
//		this.type = type;
//		this.price = price;
//	}
//
//

	public Pen(String brand, String type, double price,String color,String rfType,double size) {
		pr = new PenRefill(color,rfType,size);
		this.brand = brand;
		this.type = type;
		this.price = price;
		System.out.println("Pen Loaded!");
	}
	
	public void displayPen()
	{
		System.out.println("Brand: "+brand);
		System.out.println("type: "+type);
		System.out.println("price: "+price);
	}
}
