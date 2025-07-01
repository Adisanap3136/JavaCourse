package principleOfOopUpcastDowncast;

public class DoctorUpcastDriver 
{
	public static void main (String [] args) 
	{
		Doctor d1 = new Cardiologist();     //upcasting 
		d1.firstAid(); 
		d1.normalDoctor();
	}
}
