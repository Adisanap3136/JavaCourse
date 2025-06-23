package principleOfOop.principleOfOopInheritance;

public class Cardiologist extends Doctor
{
	String spi;
	String organ;
	public Cardiologist() 
	{
	}
	public Cardiologist(String name, double fees, String degree, int exp, String hospital,String spi,String organ) 
	{
		super(name, fees, degree, exp, hospital);
		this.spi=spi;
		this.organ=organ;
	}
	public void displayCardiologist() {
		System.out.println( "Cardiologist [spi=" + spi + ", organ=" + organ + "]");
	}
	
}
