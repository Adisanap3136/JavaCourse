package principleOfOop.SuperCall;

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
		System.out.println("Bike parameterised Constructor is called");
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
		super(name, brand, price, cc);//constructor chaining 
//		here we implicitly pass the data to the super class constructor
		
		this.mileage=mileage;
		this.wt=wt;
		System.out.println("Sport Bike parameterised Construcor called");
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
