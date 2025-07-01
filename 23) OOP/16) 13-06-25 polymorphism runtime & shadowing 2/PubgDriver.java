package principleOfOop.principleOfOopPolymorphism.principleOfOopPolymorphismRunTime;

public class PubgDriver 
{
	public static void main (String [] args)
	{
		Pubg p2 = new PubgVersion2();
		p2.turnRight();        //bug is fixed
		p2.turnLeft();
		p2.forward(10);
		p2.backward(15);      //bug is fixed
		p2.reloadGun();
		
		Pubg p3 = new PubgVersion2();
		for(int i=0;i<30;i++)
		{
			p2.fire();
		}
	}
}
