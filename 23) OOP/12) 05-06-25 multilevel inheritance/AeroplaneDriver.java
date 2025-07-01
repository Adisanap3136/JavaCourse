package principleOfOop.principleOfOopInheritance;

public class AeroplaneDriver 
{
	public static void main(String[] args) 
	{
		Sukhoi s = new Sukhoi("Rafel", 123654987, 2, 2000, 120, 3800, 4, 2, 5, 2, 3000, "Multi Role", "Air to Air", "S4030 MKI", 12, "Rocket Bullets", "Russia", "INDIA");
		s.displayAeroplane();
		s.displayFighterPlance();
		s.displaySukhoi();
	}
}
