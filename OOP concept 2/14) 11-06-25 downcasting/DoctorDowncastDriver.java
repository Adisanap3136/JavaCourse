package principleOfOopUpcastDowncast;

public class DoctorDowncastDriver 
{
	public static void main (String args[])
	{
//		Doctor d1 = new Doctor();          //java.lang.ClassCastException
//		Cardiologist c1 = (Cardiologist) d1;
		
		Doctor d1 = new Cardiologist();
		d1.firstAid();
		
		Cardiologist c2 = (Cardiologist) d1;         //downcasting
		c2.heartSurgen();
		
//		Orthologist o1 = (Orthologist)d1;     //class cast exception
	}
}