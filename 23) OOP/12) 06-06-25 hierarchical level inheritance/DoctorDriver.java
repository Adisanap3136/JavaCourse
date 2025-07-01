package principleOfOop.principleOfOopInheritance;

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
