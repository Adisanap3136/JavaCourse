package principleOfOop.Shrikantsir;

public class MobileDriver2 {
	public static void main(String[] args) {
		Processor2 processor = new Processor2("Dual Core", 2.5, "5G", 12, 256);
		Mobile2 mobile = new Mobile2("Samsung", "S25 Ultra", 125000, "Black",processor);
		mobile.displayMobile();
		mobile.getProcessor().displayProcessor();
		mobile.getProcessor().getOperatingSystem().displayOs();
		mobile.getBattery().displayBattery();;
		
		mobile.addSimCard("JIO", "5G", "Pre-Paid", 123456789l);
		mobile.addSimCard("Airtel", "5G", "Pre-Paid", 123456789l);
		for(SimCard2 ele : mobile.getSimCard())
		{
			ele.displaySimcard();
		}
		
		mobile.addHeadPhone("BoAt", "Ear Buds", 4, 1800);
		mobile.getHeadPhone().displayHeadPhone();
	
		mobile.addCharger("Type-C", 50, "Samsung");
		mobile.getCharger().displayCharger();
	}
}
