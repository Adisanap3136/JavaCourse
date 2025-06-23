package principleOfOop;

public class Mobile_Sim_lazyBinding1 {
	String brand;
	String name;
	double price;
	String type ;	
	Sim_lazyBinding1 s1;
	Charger_LazyBinding1 c1;
	Cover_LazyBinding cr1;
	
	public Mobile_Sim_lazyBinding1() {
	}

	public Mobile_Sim_lazyBinding1(String brand, String name, double price, String type) {
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.type = type;
		System.out.println("Phone Launched!");
	}
	
	//helper method for charger method
	public void purchaseCharger(String type,double price,String color)
	{
		c1 = new Charger_LazyBinding1(type, price, color);
		System.out.println("Charger purchased!");
	}
	
	//helper method for cover
	public void purchaseCover(boolean cover)
	{
		cr1 = new Cover_LazyBinding(cover);
		System.out.println("Cover purchased");
	}
	
	//helper method for sim
	public void insertSim(String serviceProvide,String networkType,String prePosTtype,long simNo)
	{
		s1 = new Sim_lazyBinding1(serviceProvide, networkType, prePosTtype,simNo);
		System.out.println("Sim inserted successfully!");
	}

	public void displayMobile() 
	{
		System.out.println("Brand: "+brand);
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
		System.out.println("Type: "+type);
	}
}
