package principleOfOop.principleOfOopInheritance;

public class Neurologist extends Doctor
{
	String spi;
	String organ;
	
	public Neurologist() 
	{
	}

	public Neurologist(String name, double fees, String degree, int exp, String hospital,String spi,String organ) 
	{
		super(name, fees, degree, exp, hospital);
		this.spi=spi;
		this.organ=organ;
	}
	
	public void displayNeurologist() {
		System.out.println( "Neurologist [spi=" + spi + ", organ=" + organ + "]");
	}
	
}
