package principleOfOop.Shrikantsir;

public class Processor {
	String type;
	double clockSpeed;
	int ram;
	int rom;
	
	private Processor() {
	}

	public Processor(String type, double clockSpeed, int ram, int rom) {
		this.type = type;
		this.clockSpeed = clockSpeed;
		this.ram = ram;
		this.rom = rom;
	}
	
	public void displayProcessor()
	{
		System.out.println("Processor Details");
		System.out.println("Type :"+type);
		System.out.println("Clock Speed: "+clockSpeed);
		System.out.println("Ram: "+ram);
		System.out.println("Rom: "+rom);
		System.out.println();
	}
}
