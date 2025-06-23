package principleOfOop.principleOfOopInheritance;

//this is multilevel inheritance here we use three classes such as:
//aeroplane -> fighterplane -> sukhoi 

public class Aeroplane 
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
