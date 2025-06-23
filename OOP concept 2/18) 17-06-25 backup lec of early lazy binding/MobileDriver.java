package principleOfOop.principleOfOopObjectClass;
//  Early binding back up batch 17-06-25
//	Implementation of early binding in three ways nonstatic initializers and constructor

import java.util.Scanner;

class Battery
{
	String brand;
	double mah;
	String type;
	double price;
	
	public Battery(String brand,double mah,String type,double price)
	{
		this.brand=brand;
		this.mah=mah;
		this.type=type;
		this.price=price;
		System.out.println("Battery created!");
	}

	public void displayBattery() {
		System.out.println( "Battery [brand=" + brand + ", mah=" + mah + ", type=" + type + ", price=" + price + "]");
	}
}

class Mobile
{
	String brand;
	String model;
	double price;
	int ram;
	int rom;
	Battery b ;          
//	Battery b = new Battery("Armstrong", 4500, "li-ion", 3500.00);          //This is one way using non static initializer 
	
//	{
	
	//This is one way : using non static block
	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter battery brand: ");
//		String name =sc.next();
//		System.out.println("Enter the mah: ");
//		double mah = sc.nextDouble();
//		System.out.println("Enter the battery type: ");
//		String type = sc.next();
//		System.out.println("Enter the battery price: ");
//		double price = sc.nextDouble();
//		b = new Battery(name, mah, type, price);
//	}
	
	public Mobile() {}
	
	public Mobile(String brand,String model,double price,int ram,int rom,String name,double mah,String type,double bprice)
	{
		b = new Battery(name, mah, type, bprice);     //this is also one way: using constructor
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.ram=ram;
		this.rom=rom;
		System.out.println("Mobile created!");
	}

	public void displayMobile() {
		System.out.println("Mobile [brand=" + brand + ", model=" + model + ", price=" + price + ", ram=" + ram + ", rom=" + rom+ "]");
	}
}

public class MobileDriver 
{
	public static void main(String args[])
	{
		Mobile m1 = new Mobile("Samsung", "S25+", 650000, 12, 256,"Amaron",4500,"li-ion",3500);
		m1.b.displayBattery();
		m1.displayMobile();
		
		Mobile m2 = new Mobile("Apple", "16+", 650000, 00, 256,"Apple",4500,"li-ion",8100);
		m2.b.displayBattery();
		m2.displayMobile();
	}
}
