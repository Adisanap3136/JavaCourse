package principleOfOop;

public class Sim_lazyBinding1 {
	String serviceProvider;
	String networktype;
	String prePostType;
	long simNo;
	
	public Sim_lazyBinding1() {
	}

	public Sim_lazyBinding1(String serviceProvider, String networktype, String prePostType, long simNo) {
		this.serviceProvider = serviceProvider;
		this.networktype = networktype;
		this.prePostType = prePostType;
		this.simNo = simNo;
	}
	
	public void displaySim()
	{
		System.out.println("Service Provider: "+serviceProvider);
		System.out.println("Network Type: "+networktype);
		System.out.println("Post or Pre Type: "+prePostType);
		System.out.println("Sim Number: "+simNo);
	}
	
}