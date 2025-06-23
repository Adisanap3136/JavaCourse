package principleOfOop.Shrikantsir;

public class OperatingSystem2 {
	private String name;
	private String version;
	private double memoryConsume;
	private String releaseDate;
	
	private OperatingSystem2() {
	}

	public OperatingSystem2(String name, String version, double memoryConsume, String releaseDate) {
		this.name = name;
		this.version = version;
		this.memoryConsume = memoryConsume;
		this.releaseDate = releaseDate;
	}

	public void displayOperatingSystem() {
		System.out.println( "OperatingSystem2 [name=" + name + ", version=" + version + ", memoryConsume=" + memoryConsume
				+ ", releaseDate=" + releaseDate + "]");
	}
	
	
}
