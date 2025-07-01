package principleOfOop;

public class Mobile_Sim_Driver_LazyBinding1 {

	public static void main(String[] args) {
		Mobile_Sim_lazyBinding1 m1 = new Mobile_Sim_lazyBinding1("Samsung", "S24 Ultra", 125000, "5G");
		m1.displayMobile();
		m1.purchaseCharger("C to C", 1000, "White");
		m1.c1.displayCharger();
		m1.purchaseCover(true);
		m1.cr1.displayCover();
		m1.insertSim("Jio Reliance", "5G", "Prepaid", 7898654512l);
		m1.s1.displaySim();
	}
}