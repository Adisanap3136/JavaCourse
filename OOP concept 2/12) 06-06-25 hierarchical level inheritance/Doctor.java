package principleOfOop.principleOfOopInheritance;

//this is the hierarchical inheritance here i make the doctor 
//class doctor 
//i inherit the doctor by three classes such as neurolosist orthologist,cardiologist

public class Doctor 
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
