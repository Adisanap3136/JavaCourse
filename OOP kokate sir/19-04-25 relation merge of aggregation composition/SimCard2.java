package principleOfOop.Shrikantsir;

public class SimCard2 {
	private String serviceProvider;
	private String networktype;
	private String type;
	private long number;
	
	private SimCard2() {
	}

	public SimCard2(String serviceProvider, String networktype, String type, long number) {
		this.serviceProvider = serviceProvider;
		this.networktype = networktype;
		this.type = type;
		this.number = number;
	}

	public void displaySimcard() {
		System.out.println( "SimCard2 [serviceProvider=" + serviceProvider + ", networktype=" + networktype + ", type=" + type
				+ ", number=" + number + "]");
	}
	
	
}
