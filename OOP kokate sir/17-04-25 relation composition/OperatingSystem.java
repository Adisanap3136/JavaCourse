package principleOfOop.Shrikantsir;

public class OperatingSystem {
	String version;
	String name;
	double memory;
	String releaseDate;
	
	private OperatingSystem() {
	}
	
	public OperatingSystem(String version, String name, double memory, String releaseDate) {
		this.version = version;
		this.name = name;
		this.memory = memory;
		this.releaseDate = releaseDate;
	}
	
	public void displayOs()
	{
		System.out.println("OS Details");
		System.out.println("version: "+version);
		System.out.println("Name: "+name);
		System.out.println("Memory: "+memory);
		System.out.println("Relase date: "+releaseDate);
		System.out.println();
	}

}
