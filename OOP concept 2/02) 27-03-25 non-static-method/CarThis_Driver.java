class CarThis_Driver
{
	public static void main(String[] args)
	{
		Car_This c1 = new Car_This();
		System.out.println(c1);

		c1.brand = "Suzuki";
		c1.name = "Omini";
		c1.price = 550000;
		c1.cc = 800;
		c1.mileage = 20;

		c1.showCar();

		System.out.println("\n----------------------------\n");

		Car_This c2 = new Car_This();
		System.out.println(c2);
		c2.showCar();
	}
}
/*
Car_This@15db9742
this: Car_This@15db9742
brand: Suzuki
Price: 550000.0
loacal name: Kidnapper Car
Non static name: Omini
CC: 800
Mileage: 20

----------------------------

Car_This@6d06d69c
this: Car_This@6d06d69c
brand: null
Price: 0.0
loacal name: Kidnapper Car
Non static name: null
CC: 0
Mileage: 0
*/