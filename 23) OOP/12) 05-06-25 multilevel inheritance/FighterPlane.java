package principleOfOop.principleOfOopInheritance;

public class FighterPlane extends Aeroplane
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
