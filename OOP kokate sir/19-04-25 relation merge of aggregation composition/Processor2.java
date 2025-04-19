package principleOfOop.Shrikantsir;

public class Processor2 {
	private String type;
	private double clockspeed;
	private String network;
	private int ram;
	private int rom;
	private OperatingSystem os ;
	
	private Processor2() {
	}

	public Processor2(String type, double clockspeed, String network, int ram, int rom) {
		this.type = type;
		this.clockspeed = clockspeed;
		this.network = network;
		this.ram = ram;
		this.rom = rom;
		this.os = new OperatingSystem("ANDROID", "15", 8, "19-04-25");
	}

	public OperatingSystem getOperatingSystem()
	{
		return os;
	}
	
	public void displayProcessor() {
		System.out.println("Processor2 [type=" + type + ", clockspeed=" + clockspeed + ", network=" + network + ", ram=" + ram + ", rom=" + rom + "]");
	}
	
}
