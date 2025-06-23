package principleOfOop.principleOfOopInheritance;

public class Sukhoi extends FighterPlane
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
