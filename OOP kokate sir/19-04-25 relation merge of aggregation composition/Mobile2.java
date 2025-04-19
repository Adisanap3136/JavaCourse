package principleOfOop.Shrikantsir;

public class Mobile2 {
	private String brand;
	private String model;
	private double price;
	private String color;
	private Processor2 processor;
	private Battery2 battery = new Battery2("Samsung", "Lithium Ion", 5100, "19-04-25", 11, 50);
	
	private SimCard2 [] simCards = new SimCard2[2];		//lazy Binding
	private int indx;
	private HeadPhone2 headPhone;  //lazy binding
	private Charger2 charger ;     //lazy binding
	
	private Mobile2() {
	}

	public Mobile2(String brand, String model, double price, String color,Processor2 processor) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.color = color;
		this.processor = processor;
	}
	
	public Processor2 getProcessor()
	{
		return processor;
	}
	
	public Battery2 getBattery()
	{
		return battery;
	}
	
	public void displayMobile() {
		System.out.println( "Mobile2 [brand=" + brand + ", model=" + model + ", price=" + price + ", color=" + color + "]");
	}
	
	public void addSimCard(String serviceProvider, String networktype, String type, long number)
	{
		SimCard2 obj = new SimCard2(serviceProvider, networktype, type, number);
		simCards[indx]= obj;
		indx++;
	}
	
	public SimCard2[] getSimCard()
	{
		return simCards;
	}
	
	public void addHeadPhone(String brand, String mic, double driver, double price)
	{
		 this.headPhone = new HeadPhone2(brand, mic, driver, price);
	}
	
	public HeadPhone2 getHeadPhone()
	{
		return headPhone;
	}
	
	public void addCharger(String type, double power, String brand)
	{
		charger = new Charger2(type, power, brand);
	}
	
	public Charger2 getCharger()
	{
		return charger;
	}
}
