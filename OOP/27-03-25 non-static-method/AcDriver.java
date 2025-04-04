class AcDriver
{
	public static void main(String[] args)
	{
		Ac ac1 = new Ac();
		ac1.brand = "Blue Star";
		ac1.price = 45000;
		ac1.ton = 2.5f;
		ac1.maxTemp = 50;
		ac1.minTemp = 10;
		ac1.ambTemp = 25;

		ac1.displayDetails();
		ac1.showMinTemp();
		ac1.showMaxTemp();
		ac1.showAmbTemp();
	}
}
/*
Brand: Blue Star
Price: 45000.0
Tons: 2.5
Min Temperature: 10.0
Max Temperature: 50.0
Ambient Temperature: 25.0
*/