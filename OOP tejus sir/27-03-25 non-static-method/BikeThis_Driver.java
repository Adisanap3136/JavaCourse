class BikeThis_Driver
{
	public static void main(String[] args)
	{
		Bike_This b1 = new Bike_This();
		System.out.println(b1);

		b1.brand = "KTM";
		b1.name = "RC 350";
		b1.price = 350000;
		b1.cc = 350;
		b1.mileage = 20;

		b1.showBike();

		System.out.println("\n----------------------------\n");

		Bike_This b2 = new Bike_This();
		System.out.println(b2);
		b2.showBike();
	}
}
/*
Bike_This@15db9742
this: Bike_This@15db9742
brand: KTM
Price: 350000.0
loacal name: Chapri Bike
Non static name: RC 350
CC: 350
Mileage: 20

----------------------------

Bike_This@6d06d69c
this: Bike_This@6d06d69c
brand: null
Price: 0.0
loacal name: Chapri Bike
Non static name: null
CC: 0
Mileage: 0
*/