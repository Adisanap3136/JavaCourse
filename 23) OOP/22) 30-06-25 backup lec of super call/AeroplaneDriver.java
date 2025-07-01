package principleOfOop.SuperCall;
//this is multilevel inheritance here we use three classes such as:
//aeroplane -> fighterplane -> sukhoi 

class Aeroplane 
{
	String brand;
	double price;
	int engines;
	int year;
	int fuelLap;
	int speed;
	int wt;
	int cap;
	
	public Aeroplane() 
	{
	}
	
	public Aeroplane(String brand,double price,int engines,int year,int fuelLap,int speed,int wt,int cap)
	{
		super();
		this.brand=brand;
		this.price=price;
		this.engines=engines;
		this.year=year;
		this.fuelLap=fuelLap;
		this.wt=wt;
		this.cap=cap;
	}

	public void displayAeroplane() {
		System.out.println( "Aeroplane [brand=" + brand + ", price=" + price + ", engines=" + engines + ", year=" + year
				+ ", fuelLap=" + fuelLap + ", speed=" + speed + ", wt=" + wt + ", cap=" + cap + "]");
	}
}

class FighterPlane extends Aeroplane
{
	int gen;
	int seat;
	int range;
	String type;
	String refuel;
	
	public FighterPlane() 
	{
	}
	
	public FighterPlane(String brand,double price,int engines,int year,int fuelLap,int speed,int wt,int cap,int gen,int seat,int range,String type,String refuel)
	{
		super(brand, price, engines, year, fuelLap, speed, wt, cap);           //constructor chainig to parent class from base class
		this.gen=gen;
		this.seat=seat;
		this.range=range;
		this.type=type;
		this.refuel=refuel;
	}

	public void displayFighterPlance() {
		System.out.println( "FighterPlane [gen=" + gen + ", seat=" + seat + ", range=" + range + ", type=" + type + ", refuel="
				+ refuel + "]");
	}
	
}

class Sukhoi extends FighterPlane
{
	String model;
	int years;
	String veapons;
	String country;
	String service;
	
	public Sukhoi() 
	{
	}
	public Sukhoi(String brand, double price, int engines, int year, int fuelLap, int speed, int wt, int cap, int gen,int seat, int range, String type, String refuel,String model,int years,String veapons,String country,String service) 
	{
		super(brand, price, engines, year, fuelLap, speed, wt, cap, gen, seat, range, type, refuel);
		this.model = model;
		this.years = years;
		this.veapons = veapons;
		this.country = country;
		this.service = service;
	}
	public void displaySukhoi() {
		System.out.println( "Sukhoi [model=" + model + ", years=" + years + ", veapons=" + veapons + ", country=" + country
				+ ", service=" + service + "]");
	}
}

public class AeroplaneDriver 
{
	public static void main(String[] args) 
	{
		Sukhoi s = new Sukhoi("Rafel", 123654987, 2, 2000, 120, 3800, 4, 2, 5, 2, 3000, "Multi Role", "Air to Air", "S4030 MKI", 12, "Rocket Bullets", "Russia", "INDIA");
		s.displayAeroplane();
		s.displayFighterPlance();
		s.displaySukhoi();
	}
}