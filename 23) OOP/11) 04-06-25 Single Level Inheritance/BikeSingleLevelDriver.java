package principleOfOop.Inheritance;

class Bike
{
	String name;
	String brand;
	double price;
	int cc;
	
	public Bike() {}
	
	public Bike(String name,String brand,double price,int cc)
	{
		this.name=name;
		this.brand=brand;
		this.price=price;
		this.cc=cc;
	}
	
	public void displaybike()
	{
		System.out.println("Name: "+name);
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		System.out.println("CC: "+cc);
		System.out.println("====================================");
	}
}

class SportBike extends Bike
{
	int mileage;
	double wt;
	
	public SportBike() {}
	
	public SportBike(String name,String brand,double price,int cc,
			int mileage,double wt)
	{
		this.name=name;
		this.brand=brand;
		this.price=price;
		this.cc=cc;
		
		this.mileage=mileage;
		this.wt=wt;
	}
	
	public void displaySportBike()
	{
		System.out.println("Name: "+name);
		System.out.println("Mileage: "+mileage);
		System.out.println("Weight: "+wt);
	}
	
	public void displayAllDEtail()
	{
		displaybike();
		displaySportBike();
	}
}

public class BikeSingleLevelDriver 
{
	public static void main(String[] args)
	{
		SportBike b1 = new SportBike("Rs200","Bajaj",200000,200,40,200);
		b1.displayAllDEtail();
	}
}
