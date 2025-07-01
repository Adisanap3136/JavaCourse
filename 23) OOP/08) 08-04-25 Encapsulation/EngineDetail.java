class EngineDetail
{
	private String brand;
	private String name;
	private int cc;
	private int petrolcapacity = 10;
	private int price;

	EngineDetail()
	{}

	EngineDetail(String brand,String name,int price)
	{
		this.brand = brand;
		this.name= name;
		this.price = price;
	}

	public void setCC(int cc)
	{
		this.cc=cc;
	}
	public void setpetrolcapacity(int petrolcapacity)
	{
		this.petrolcapacity=petrolcapacity;
	}
	public String getBrand()
	{
		return brand;
	}
	public String getName()
	{
		return name;
	}
	public int getCC()
	{
		if(cc>0)
		{
			return cc;
		}
		else
		{
			System.out.println("Wrong CC Details");
			return 0;
		}
	}
	public int getPrice()
	{
		return price;
	}
	public int getPetrolCapacity()
	{
		if(petrolcapacity>0)
		{
			return petrolcapacity;
		}
		else
		{
			System.out.println("Wrong Petrolcapacity Details");
			return 0;
		}
	}
}
