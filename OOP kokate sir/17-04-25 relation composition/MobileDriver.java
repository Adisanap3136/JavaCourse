package principleOfOop.Shrikantsir;

public class MobileDriver {
	public static void main(String[] args) {
		OperatingSystem os = new OperatingSystem("15", "Android", 16, "19-04-25");
		Mobile mobile = new Mobile("Samsung", "S25", 80000, "Offwhite", 3 , os);
		mobile.displayMobile();
		mobile.os.displayOs();
		mobile.p.displayProcessor();
		mobile.battery.displayBattery();
	}

}
