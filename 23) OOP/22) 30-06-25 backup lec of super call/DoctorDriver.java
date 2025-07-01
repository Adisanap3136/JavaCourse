package principleOfOop.SuperCall;

//this is the hierarchical inheritance here i make the doctor 
//class doctor 
//i inherit the doctor by three classes such as neurologist Orthologist,cardiologist

class Doctor 
{
	String name;
	double fees;
	String degree;
	int exp;
	String hospital;
	
	public Doctor() 
	{
	}

	public Doctor(String name, double fees, String degree, int exp, String hospital) {
		super();
		this.name = name;
		this.fees = fees;
		this.degree = degree;
		this.exp = exp;
		this.hospital = hospital;
	}

	public void displayDoctor() {
		System.out.println( "Doctor [name=" + name + ", fees=" + fees + ", degree=" + degree + ", exp=" + exp + ", hospital="
				+ hospital + "]");
	}
}

class Neurologist extends Doctor
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

class Orthologist extends Doctor
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

class Cardiologist extends Doctor
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

public class DoctorDriver 
{
	public static void main (String [] args)
	{
		Neurologist n = new Neurologist("Dr.Rathi", 200, "MBBS", 30, "Rathi Hospital", "MD", "Brain");
		n.displayDoctor();
		n.displayNeurologist();
		
		Cardiologist c = new Cardiologist("Mahesh", 150, "MBBS", 3, "Sahyadri", "MD", "Heart");
		c.displayDoctor();
		c.displayCardiologist();
		
		Orthologist o = new Orthologist("Raju", 100, "MBBS", 8, "Puna", "MD", "Bones");
		o.displayDoctor();
		o.displayOrthologist();
	}
}