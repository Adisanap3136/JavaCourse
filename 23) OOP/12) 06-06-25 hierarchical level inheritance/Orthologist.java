package principleOfOop.principleOfOopInheritance;

public class Orthologist extends Doctor
{
	String spi;
	String organ;
	
	public Orthologist() 
	{
	}

	public Orthologist(String name, double fees, String degree, int exp, String hospital,String spi,String organ) 
	{
		super(name, fees, degree, exp, hospital);
		this.spi=spi;
		this.organ=organ;
	}

	public void displayOrthologist() 
	{
		System.out.println( "Orthologist [spi=" + spi + ", organ=" + organ + "]");
	}
	
	
	
}
