package principleOfOop.principleOfOopPolymorphism.principleOfOopPolymorphismRunTime;

public class PubgVersion2 extends Pubg
{
	public PubgVersion2() 
	{
	}
	public void fire()
	{
		if(bullets>0)
		{
			bullets--;
			System.out.println("Fired ->->->->->->->->-- " +bullets+" bulltes left" );
		}
		else
		{
			System.out.println("Reload");
		}
	}
	public void turnLeft()
	{
		System.out.println("Turned Left");
	}
	public void backward(int steps)
	{
		System.out.println("Backward with "+steps+" steps");
	}
}
