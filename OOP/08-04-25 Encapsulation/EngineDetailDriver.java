class EngineDetailDriver
{
	public static void main(String[] args)
	{
		EngineDetail e1 = new EngineDetail("YAMAHA","RX100",150000);
		System.out.println(e1.getBrand());
		System.out.println(e1.getName());
		System.out.println(e1.getPrice());
		e1.setCC(-150);
		e1.setpetrolcapacity(18);
		System.out.println(e1.getCC());
		System.out.println(e1.getPetrolCapacity());
	}
}