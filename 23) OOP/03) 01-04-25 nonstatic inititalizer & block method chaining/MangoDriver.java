class MangoDriver
{
	public static void main(String[] args)
	{
		Mango m1 = new Mango();
		System.out.println("m1 obj: "+m1);

		m1.type = "Hapus";
		m1.origin = "Ratnagiri";
		m1.price = 2000.0;

	//	m1.display();

		m1.showType().showOrigin().showPrice();

		System.out.println("---------------------------------------------");
		Mango m2 = new Mango();
	}
}
